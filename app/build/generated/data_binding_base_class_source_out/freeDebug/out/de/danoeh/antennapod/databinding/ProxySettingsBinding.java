// Generated by view binder compiler. Do not edit!
package de.danoeh.antennapod.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.joanzapata.iconify.widget.IconTextView;
import de.danoeh.antennapod.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ProxySettingsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText etHost;

  @NonNull
  public final EditText etPassword;

  @NonNull
  public final EditText etPort;

  @NonNull
  public final EditText etUsername;

  @NonNull
  public final Spinner spType;

  @NonNull
  public final TextView txtvHost;

  @NonNull
  public final IconTextView txtvMessage;

  @NonNull
  public final TextView txtvPassword;

  @NonNull
  public final TextView txtvPort;

  @NonNull
  public final TextView txtvType;

  @NonNull
  public final TextView txtvUsername;

  private ProxySettingsBinding(@NonNull LinearLayout rootView, @NonNull EditText etHost,
      @NonNull EditText etPassword, @NonNull EditText etPort, @NonNull EditText etUsername,
      @NonNull Spinner spType, @NonNull TextView txtvHost, @NonNull IconTextView txtvMessage,
      @NonNull TextView txtvPassword, @NonNull TextView txtvPort, @NonNull TextView txtvType,
      @NonNull TextView txtvUsername) {
    this.rootView = rootView;
    this.etHost = etHost;
    this.etPassword = etPassword;
    this.etPort = etPort;
    this.etUsername = etUsername;
    this.spType = spType;
    this.txtvHost = txtvHost;
    this.txtvMessage = txtvMessage;
    this.txtvPassword = txtvPassword;
    this.txtvPort = txtvPort;
    this.txtvType = txtvType;
    this.txtvUsername = txtvUsername;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ProxySettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ProxySettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.proxy_settings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ProxySettingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      EditText etHost = rootView.findViewById(R.id.etHost);
      if (etHost == null) {
        missingId = "etHost";
        break missingId;
      }
      EditText etPassword = rootView.findViewById(R.id.etPassword);
      if (etPassword == null) {
        missingId = "etPassword";
        break missingId;
      }
      EditText etPort = rootView.findViewById(R.id.etPort);
      if (etPort == null) {
        missingId = "etPort";
        break missingId;
      }
      EditText etUsername = rootView.findViewById(R.id.etUsername);
      if (etUsername == null) {
        missingId = "etUsername";
        break missingId;
      }
      Spinner spType = rootView.findViewById(R.id.spType);
      if (spType == null) {
        missingId = "spType";
        break missingId;
      }
      TextView txtvHost = rootView.findViewById(R.id.txtvHost);
      if (txtvHost == null) {
        missingId = "txtvHost";
        break missingId;
      }
      IconTextView txtvMessage = rootView.findViewById(R.id.txtvMessage);
      if (txtvMessage == null) {
        missingId = "txtvMessage";
        break missingId;
      }
      TextView txtvPassword = rootView.findViewById(R.id.txtvPassword);
      if (txtvPassword == null) {
        missingId = "txtvPassword";
        break missingId;
      }
      TextView txtvPort = rootView.findViewById(R.id.txtvPort);
      if (txtvPort == null) {
        missingId = "txtvPort";
        break missingId;
      }
      TextView txtvType = rootView.findViewById(R.id.txtvType);
      if (txtvType == null) {
        missingId = "txtvType";
        break missingId;
      }
      TextView txtvUsername = rootView.findViewById(R.id.txtvUsername);
      if (txtvUsername == null) {
        missingId = "txtvUsername";
        break missingId;
      }
      return new ProxySettingsBinding((LinearLayout) rootView, etHost, etPassword, etPort,
          etUsername, spType, txtvHost, txtvMessage, txtvPassword, txtvPort, txtvType,
          txtvUsername);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
