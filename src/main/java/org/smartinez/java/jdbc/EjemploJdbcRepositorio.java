package org.smartinez.java.jdbc;

import modelo.Categoria;
import modelo.Producto;
import modelo.repositorio.ProductoRepositorioImp;
import modelo.repositorio.Repositorio;

import java.util.Date;

public class EjemploJdbcRepositorio {
    public static void main(String[] args) {


            Repositorio<Producto> repositorio = new ProductoRepositorioImp();
            System.out.println("============= listar =============");
            repositorio.listar().forEach(System.out::println);

            System.out.println("============= obtener por id =============");
            System.out.println(repositorio.porId(1L));

            System.out.println("============= insertar nuevo producto =============");
            Producto producto = new Producto();
            producto.setNombre("Notebook Omen HP");
            producto.setPrecio(2900);
            producto.setFechaRegistro(new Date());
            Categoria categoria = new Categoria();
            categoria.setId(3L);    //computacion
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("Producto insertado con exito");
            repositorio.listar().forEach(System.out::println);


    }

}
