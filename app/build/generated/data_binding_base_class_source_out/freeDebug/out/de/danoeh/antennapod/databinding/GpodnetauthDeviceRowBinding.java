// Generated by view binder compiler. Do not edit!
package de.danoeh.antennapod.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import de.danoeh.antennapod.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class GpodnetauthDeviceRowBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button selectDeviceButton;

  private GpodnetauthDeviceRowBinding(@NonNull FrameLayout rootView,
      @NonNull Button selectDeviceButton) {
    this.rootView = rootView;
    this.selectDeviceButton = selectDeviceButton;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static GpodnetauthDeviceRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GpodnetauthDeviceRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.gpodnetauth_device_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GpodnetauthDeviceRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      Button selectDeviceButton = rootView.findViewById(R.id.selectDeviceButton);
      if (selectDeviceButton == null) {
        missingId = "selectDeviceButton";
        break missingId;
      }
      return new GpodnetauthDeviceRowBinding((FrameLayout) rootView, selectDeviceButton);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
