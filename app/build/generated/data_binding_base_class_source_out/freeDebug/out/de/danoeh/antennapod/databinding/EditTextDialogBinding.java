// Generated by view binder compiler. Do not edit!
package de.danoeh.antennapod.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import de.danoeh.antennapod.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class EditTextDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText urlEditText;

  private EditTextDialogBinding(@NonNull LinearLayout rootView, @NonNull EditText urlEditText) {
    this.rootView = rootView;
    this.urlEditText = urlEditText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static EditTextDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static EditTextDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.edit_text_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static EditTextDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      EditText urlEditText = rootView.findViewById(R.id.urlEditText);
      if (urlEditText == null) {
        missingId = "urlEditText";
        break missingId;
      }
      return new EditTextDialogBinding((LinearLayout) rootView, urlEditText);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
