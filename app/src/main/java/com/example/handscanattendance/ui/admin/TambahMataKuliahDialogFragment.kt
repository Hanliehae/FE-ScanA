//package com.example.handscanattendance.ui.admin
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.fragment.app.DialogFragment
//import com.example.handscanattendance.R
//import kotlinx.android.synthetic.main.dialog_tambah_mata_kuliah.view.*
//
//class TambahMataKuliahDialogFragment : DialogFragment() {
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        val view = inflater.inflate(R.layout.dialog_tambah_mk, container, false)
//
//        view.btnSimpan.setOnClickListener {
//            // Simpan data baru ke database
//            dismiss()
//        }
//
//        view.btnBatal.setOnClickListener {
//            dismiss()
//        }
//
//        return view
//    }
//}
