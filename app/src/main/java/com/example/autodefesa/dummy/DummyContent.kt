package com.example.autodefesa.dummy

import java.util.ArrayList
import java.util.HashMap

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
        if(position != 1){
            tituloAula = "Aula " + position
        }
        return DummyItem(position.toString(), tituloAula, makeDetails(position))
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        pegaPositionDeterminaTituloConteudo(position)
        builder.append(fazendoText)
        for (i in 0..position - 1) {
            builder.append("\n Texto da aula a ser aplicada.")
        }
        return builder.toString()
    }
    private fun pegaPositionDeterminaTituloConteudo(position: Int){
        if(position == 1){
            fazendoText = "Primeiro texto a ser escrito "
        }else{
            fazendoText = "Outros textos sendo escritos" + position
        }
        when(position){
            1 -> fazendoText = "Primeiro texto a ser escrito"
            2 -> fazendoText = "Aula de treinamento Fisico"
            3 -> fazendoText = "Aula de treinamento da Perna"
            else -> {
                fazendoText = "outros textos sendo escritos" + position
            }
        }
    }

    /**
     * A dummy item representing a piece of content.
     */
    data class DummyItem(val id: String, val content: String, val details: String) {
        override fun toString(): String = content
    }
}