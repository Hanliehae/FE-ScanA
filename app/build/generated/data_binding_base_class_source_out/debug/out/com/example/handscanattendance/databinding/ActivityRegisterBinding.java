// Generated by view binder compiler. Do not edit!
package com.example.handscanattendance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.handscanattendance.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button btnRegister;

  @NonNull
  public final Button btnUploadLeftPalm;

  @NonNull
  public final Button btnUploadRightPalm;

  @NonNull
  public final EditText etConfirmPassword;

  @NonNull
  public final EditText etEmail;

  @NonNull
  public final EditText etNIM;

  @NonNull
  public final EditText etNama;

  @NonNull
  public final EditText etPassword;

  @NonNull
  public final EditText etPhone;

  @NonNull
  public final ImageView ivLeftPalmPreview;

  @NonNull
  public final ImageView ivRightPalmPreview;

  @NonNull
  public final ImageView logoScanA;

  @NonNull
  public final Spinner spinnerKelas;

  @NonNull
  public final TextView tvLoginRedirect;

  @NonNull
  public final TextView tvTitle;

  private ActivityRegisterBinding(@NonNull ScrollView rootView, @NonNull Button btnRegister,
      @NonNull Button btnUploadLeftPalm, @NonNull Button btnUploadRightPalm,
      @NonNull EditText etConfirmPassword, @NonNull EditText etEmail, @NonNull EditText etNIM,
      @NonNull EditText etNama, @NonNull EditText etPassword, @NonNull EditText etPhone,
      @NonNull ImageView ivLeftPalmPreview, @NonNull ImageView ivRightPalmPreview,
      @NonNull ImageView logoScanA, @NonNull Spinner spinnerKelas,
      @NonNull TextView tvLoginRedirect, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.btnRegister = btnRegister;
    this.btnUploadLeftPalm = btnUploadLeftPalm;
    this.btnUploadRightPalm = btnUploadRightPalm;
    this.etConfirmPassword = etConfirmPassword;
    this.etEmail = etEmail;
    this.etNIM = etNIM;
    this.etNama = etNama;
    this.etPassword = etPassword;
    this.etPhone = etPhone;
    this.ivLeftPalmPreview = ivLeftPalmPreview;
    this.ivRightPalmPreview = ivRightPalmPreview;
    this.logoScanA = logoScanA;
    this.spinnerKelas = spinnerKelas;
    this.tvLoginRedirect = tvLoginRedirect;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnRegister;
      Button btnRegister = ViewBindings.findChildViewById(rootView, id);
      if (btnRegister == null) {
        break missingId;
      }

      id = R.id.btnUploadLeftPalm;
      Button btnUploadLeftPalm = ViewBindings.findChildViewById(rootView, id);
      if (btnUploadLeftPalm == null) {
        break missingId;
      }

      id = R.id.btnUploadRightPalm;
      Button btnUploadRightPalm = ViewBindings.findChildViewById(rootView, id);
      if (btnUploadRightPalm == null) {
        break missingId;
      }

      id = R.id.etConfirmPassword;
      EditText etConfirmPassword = ViewBindings.findChildViewById(rootView, id);
      if (etConfirmPassword == null) {
        break missingId;
      }

      id = R.id.etEmail;
      EditText etEmail = ViewBindings.findChildViewById(rootView, id);
      if (etEmail == null) {
        break missingId;
      }

      id = R.id.etNIM;
      EditText etNIM = ViewBindings.findChildViewById(rootView, id);
      if (etNIM == null) {
        break missingId;
      }

      id = R.id.etNama;
      EditText etNama = ViewBindings.findChildViewById(rootView, id);
      if (etNama == null) {
        break missingId;
      }

      id = R.id.etPassword;
      EditText etPassword = ViewBindings.findChildViewById(rootView, id);
      if (etPassword == null) {
        break missingId;
      }

      id = R.id.etPhone;
      EditText etPhone = ViewBindings.findChildViewById(rootView, id);
      if (etPhone == null) {
        break missingId;
      }

      id = R.id.ivLeftPalmPreview;
      ImageView ivLeftPalmPreview = ViewBindings.findChildViewById(rootView, id);
      if (ivLeftPalmPreview == null) {
        break missingId;
      }

      id = R.id.ivRightPalmPreview;
      ImageView ivRightPalmPreview = ViewBindings.findChildViewById(rootView, id);
      if (ivRightPalmPreview == null) {
        break missingId;
      }

      id = R.id.logoScanA;
      ImageView logoScanA = ViewBindings.findChildViewById(rootView, id);
      if (logoScanA == null) {
        break missingId;
      }

      id = R.id.spinnerKelas;
      Spinner spinnerKelas = ViewBindings.findChildViewById(rootView, id);
      if (spinnerKelas == null) {
        break missingId;
      }

      id = R.id.tvLoginRedirect;
      TextView tvLoginRedirect = ViewBindings.findChildViewById(rootView, id);
      if (tvLoginRedirect == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((ScrollView) rootView, btnRegister, btnUploadLeftPalm,
          btnUploadRightPalm, etConfirmPassword, etEmail, etNIM, etNama, etPassword, etPhone,
          ivLeftPalmPreview, ivRightPalmPreview, logoScanA, spinnerKelas, tvLoginRedirect, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
