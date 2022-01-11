package com.example.smartcity.ui.service

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.smartcity.R

class ServiceFragment : Fragment() {

    companion object {
        fun newInstance() = ServiceFragment()
    }

    private lateinit var viewModel: ServiceViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.service_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ServiceViewModel::class.java)
        // TODO: Use the ViewModel
    }

}