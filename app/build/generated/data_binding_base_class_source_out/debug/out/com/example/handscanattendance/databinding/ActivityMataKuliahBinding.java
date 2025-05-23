// Generated by view binder compiler. Do not edit!
package com.example.handscanattendance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.handscanattendance.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMataKuliahBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton btnBack;

  @NonNull
  public final Button btnTambahMk;

  @NonNull
  public final EditText edtSearch;

  @NonNull
  public final RecyclerView rvMataKuliah;

  @NonNull
  public final Spinner spinnerSemester;

  @NonNull
  public final Spinner spinnerTahunAkademik;

  private ActivityMataKuliahBinding(@NonNull LinearLayout rootView, @NonNull ImageButton btnBack,
      @NonNull Button btnTambahMk, @NonNull EditText edtSearch, @NonNull RecyclerView rvMataKuliah,
      @NonNull Spinner spinnerSemester, @NonNull Spinner spinnerTahunAkademik) {
    this.rootView = rootView;
    this.btnBack = btnBack;
    this.btnTambahMk = btnTambahMk;
    this.edtSearch = edtSearch;
    this.rvMataKuliah = rvMataKuliah;
    this.spinnerSemester = spinnerSemester;
    this.spinnerTahunAkademik = spinnerTahunAkademik;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMataKuliahBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMataKuliahBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_mata_kuliah, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMataKuliahBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnBack;
      ImageButton btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btn_tambah_mk;
      Button btnTambahMk = ViewBindings.findChildViewById(rootView, id);
      if (btnTambahMk == null) {
        break missingId;
      }

      id = R.id.edt_search;
      EditText edtSearch = ViewBindings.findChildViewById(rootView, id);
      if (edtSearch == null) {
        break missingId;
      }

      id = R.id.rv_mata_kuliah;
      RecyclerView rvMataKuliah = ViewBindings.findChildViewById(rootView, id);
      if (rvMataKuliah == null) {
        break missingId;
      }

      id = R.id.spinner_semester;
      Spinner spinnerSemester = ViewBindings.findChildViewById(rootView, id);
      if (spinnerSemester == null) {
        break missingId;
      }

      id = R.id.spinner_tahun_akademik;
      Spinner spinnerTahunAkademik = ViewBindings.findChildViewById(rootView, id);
      if (spinnerTahunAkademik == null) {
        break missingId;
      }

      return new ActivityMataKuliahBinding((LinearLayout) rootView, btnBack, btnTambahMk, edtSearch,
          rvMataKuliah, spinnerSemester, spinnerTahunAkademik);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
