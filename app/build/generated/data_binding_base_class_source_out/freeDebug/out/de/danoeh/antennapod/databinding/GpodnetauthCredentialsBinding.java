// Generated by view binder compiler. Do not edit!
package de.danoeh.antennapod.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textfield.TextInputEditText;
import de.danoeh.antennapod.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class GpodnetauthCredentialsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button butLogin;

  @NonNull
  public final TextView createAccountButton;

  @NonNull
  public final TextView credentialsError;

  @NonNull
  public final TextInputEditText etxtPassword;

  @NonNull
  public final TextInputEditText etxtUsername;

  @NonNull
  public final ProgressBar progBarLogin;

  private GpodnetauthCredentialsBinding(@NonNull LinearLayout rootView, @NonNull Button butLogin,
      @NonNull TextView createAccountButton, @NonNull TextView credentialsError,
      @NonNull TextInputEditText etxtPassword, @NonNull TextInputEditText etxtUsername,
      @NonNull ProgressBar progBarLogin) {
    this.rootView = rootView;
    this.butLogin = butLogin;
    this.createAccountButton = createAccountButton;
    this.credentialsError = credentialsError;
    this.etxtPassword = etxtPassword;
    this.etxtUsername = etxtUsername;
    this.progBarLogin = progBarLogin;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static GpodnetauthCredentialsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GpodnetauthCredentialsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.gpodnetauth_credentials, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GpodnetauthCredentialsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      Button butLogin = rootView.findViewById(R.id.butLogin);
      if (butLogin == null) {
        missingId = "butLogin";
        break missingId;
      }
      TextView createAccountButton = rootView.findViewById(R.id.createAccountButton);
      if (createAccountButton == null) {
        missingId = "createAccountButton";
        break missingId;
      }
      TextView credentialsError = rootView.findViewById(R.id.credentialsError);
      if (credentialsError == null) {
        missingId = "credentialsError";
        break missingId;
      }
      TextInputEditText etxtPassword = rootView.findViewById(R.id.etxtPassword);
      if (etxtPassword == null) {
        missingId = "etxtPassword";
        break missingId;
      }
      TextInputEditText etxtUsername = rootView.findViewById(R.id.etxtUsername);
      if (etxtUsername == null) {
        missingId = "etxtUsername";
        break missingId;
      }
      ProgressBar progBarLogin = rootView.findViewById(R.id.progBarLogin);
      if (progBarLogin == null) {
        missingId = "progBarLogin";
        break missingId;
      }
      return new GpodnetauthCredentialsBinding((LinearLayout) rootView, butLogin,
          createAccountButton, credentialsError, etxtPassword, etxtUsername, progBarLogin);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}