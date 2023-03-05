package com.dhl.appscopviewmodel.ui

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.dhl.appscopviewmodel.databinding.ActivitySecBinding
import com.dhl.appscopviewmodel.utils.LiveDataBus
import com.dhl.appscopviewmodel.vm.AppScope
import com.dhl.appscopviewmodel.vm.EditViewModel

private const val TAG = "ThirdActivity"
class ThirdActivity : BaseActivity() {

    private lateinit var binding: ActivitySecBinding

    private val editViewModel: EditViewModel by lazy {
        AppScope.getAppScopeViewModel(EditViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //val input = binding.editQuery.text.toString()

        val fab: FloatingActionButton = binding.fab

        fab.setOnClickListener {
            editViewModel.inputData.setValue(binding.editQuery.text.toString())
            finish()
        }

//        LiveDataBus.withSticky<String>("sec").observe(this, Observer {
//            binding.editQuery.setText(it)
//        })




    }
}