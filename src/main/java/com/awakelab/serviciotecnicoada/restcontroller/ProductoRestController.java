package com.awakelab.serviciotecnicoada.restcontroller;

import com.awakelab.serviciotecnicoada.entity.Producto;
import com.awakelab.serviciotecnicoada.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producto")
public class ProductoRestController {
    @Autowired
    IProductoService objProductoService;
    @PostMapping
    public Producto crearProducto(@RequestBody Producto nuevoProducto){

        return objProductoService.crearProducto(nuevoProducto);
    }
    @GetMapping("/{id}")
    public Producto listarProductosId(@PathVariable int id) {

        return objProductoService.listaProductoID(id);
    }
    @GetMapping
    public List<Producto> listarproductos() {

        return objProductoService.listarProducto();
    }

    @PutMapping("/{id}")
    public Producto actualizarProducto(@RequestBody Producto producto){

        return objProductoService.actualizarProducto(producto);

    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Producto producto){

        objProductoService.eliminarProducto(producto);
    }
}
