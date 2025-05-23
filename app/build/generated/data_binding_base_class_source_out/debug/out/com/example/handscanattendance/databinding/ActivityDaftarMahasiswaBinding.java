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
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.handscanattendance.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDaftarMahasiswaBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton btnBack;

  @NonNull
  public final Button btnCari;

  @NonNull
  public final Button btnTambahData;

  @NonNull
  public final EditText etSearchNama;

  @NonNull
  public final RecyclerView rvMahasiswa;

  @NonNull
  public final Spinner spinnerMk;

  @NonNull
  public final TextView tvTitle;

  private ActivityDaftarMahasiswaBinding(@NonNull LinearLayout rootView,
      @NonNull ImageButton btnBack, @NonNull Button btnCari, @NonNull Button btnTambahData,
      @NonNull EditText etSearchNama, @NonNull RecyclerView rvMahasiswa, @NonNull Spinner spinnerMk,
      @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.btnBack = btnBack;
    this.btnCari = btnCari;
    this.btnTambahData = btnTambahData;
    this.etSearchNama = etSearchNama;
    this.rvMahasiswa = rvMahasiswa;
    this.spinnerMk = spinnerMk;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDaftarMahasiswaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDaftarMahasiswaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_daftar_mahasiswa, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDaftarMahasiswaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnBack;
      ImageButton btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btnCari;
      Button btnCari = ViewBindings.findChildViewById(rootView, id);
      if (btnCari == null) {
        break missingId;
      }

      id = R.id.btnTambahData;
      Button btnTambahData = ViewBindings.findChildViewById(rootView, id);
      if (btnTambahData == null) {
        break missingId;
      }

      id = R.id.etSearchNama;
      EditText etSearchNama = ViewBindings.findChildViewById(rootView, id);
      if (etSearchNama == null) {
        break missingId;
      }

      id = R.id.rvMahasiswa;
      RecyclerView rvMahasiswa = ViewBindings.findChildViewById(rootView, id);
      if (rvMahasiswa == null) {
        break missingId;
      }

      id = R.id.spinnerMk;
      Spinner spinnerMk = ViewBindings.findChildViewById(rootView, id);
      if (spinnerMk == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new ActivityDaftarMahasiswaBinding((LinearLayout) rootView, btnBack, btnCari,
          btnTambahData, etSearchNama, rvMahasiswa, spinnerMk, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
