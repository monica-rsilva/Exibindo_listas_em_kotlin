package br.senai.sp.jandira.lazyproducts.dao.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.lazyproducts.R
import br.senai.sp.jandira.lazyproducts.model.Product

class ProductRepository {
//tudo que estiver aqui dentro será estatico
    companion object{

//    criando uma função em Kotlin
//    getProducts() recebe uma lista de produtos (Products)
        @Composable
        fun getProducts(): List<Product>{
//    retornando a lista de produtos
                return  listOf<Product>(
                Product(
                        id=1,
                        name = "Mickey Mouse",
                        description = "O camundongo mais amado do mundo!",
                        price = 148.99,
                        image = painterResource(id = R.drawable.mouse)
                ),
                Product(id=2, name = "Teclado"),
                Product(id=3, name = "Monitor", price = 897.99),
                Product(id=4, name = "Impressora"),
                Product(id=5, name = "Impressora"),
                Product(id=6, name = "Impressora"),
                Product(id=7, name = "Impressora"),
                Product(id=8, name = "Impressora"),
                Product(id=9, name = "Impressora"),
                Product(id=10, name = "Impressora"),
                Product(id=11, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
                Product(id=4, name = "Impressora"),
            )
//            return products

        }
    }
}