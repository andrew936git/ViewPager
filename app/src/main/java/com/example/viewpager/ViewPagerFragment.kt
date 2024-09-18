package com.example.viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val titlePicture = view.findViewById<TextView>(R.id.titlePicture)
        val nameAuthor = view.findViewById<TextView>(R.id.nameAuthor)
        val imageView = view.findViewById<ImageView>(R.id.imageView)
        val viewPagerItem = arguments?.getSerializable("picture") as Picture
        titlePicture.text = viewPagerItem.title
        nameAuthor.text = viewPagerItem.nameAuthor
        imageView.setImageResource(viewPagerItem.image)
    }
}