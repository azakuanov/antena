// Generated by view binder compiler. Do not edit!
package de.danoeh.antennapod.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import de.danoeh.antennapod.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CheckboxDoNotShowAgainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CheckBox checkboxDoNotShowAgain;

  private CheckboxDoNotShowAgainBinding(@NonNull LinearLayout rootView,
      @NonNull CheckBox checkboxDoNotShowAgain) {
    this.rootView = rootView;
    this.checkboxDoNotShowAgain = checkboxDoNotShowAgain;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CheckboxDoNotShowAgainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CheckboxDoNotShowAgainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.checkbox_do_not_show_again, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CheckboxDoNotShowAgainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      CheckBox checkboxDoNotShowAgain = rootView.findViewById(R.id.checkbox_do_not_show_again);
      if (checkboxDoNotShowAgain == null) {
        missingId = "checkboxDoNotShowAgain";
        break missingId;
      }
      return new CheckboxDoNotShowAgainBinding((LinearLayout) rootView, checkboxDoNotShowAgain);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
