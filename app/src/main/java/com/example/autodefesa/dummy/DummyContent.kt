package com.example.autodefesa.dummy

import com.example.autodefesa.Aulas
import java.util.*


/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<DummyItem> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, DummyItem> = HashMap()

    private val COUNT = 10
    private var fazendoText = " ";
    private var tituloAula = "Tutorial";


    init {
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(createDummyItem(i))
        }
    }

    private fun addItem(item: DummyItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    private fun createDummyItem(position: Int): DummyItem {
        val contentAula = Aulas()
        val nomeAula = contentAula.nomeNoMenu(position)
        return DummyItem(position.toString(), nomeAula, makeDetails(position))
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
//        pegaPositionDeterminaTituloConteudo(position)
//        builder.append(fazendoText)
//        for (i in 0..position - 1) {
//            builder.append("\n Texto da aula a ser aplicada.")
//        }
        val contentAula = Aulas()
        val recebeTitulo = contentAula.tituloAula(position)
        builder.append(recebeTitulo)

        val recebeConteudo = contentAula.conteudoAula(position)
        builder.append(
                """
                    $recebeConteudo
                """.trimIndent()
        )
        return builder.toString()
    }

    /**
     * A dummy item representing a piece of content.
     */
    data class DummyItem(val id: String, val content: String, val details: String) {
        override fun toString(): String = content
    }
}