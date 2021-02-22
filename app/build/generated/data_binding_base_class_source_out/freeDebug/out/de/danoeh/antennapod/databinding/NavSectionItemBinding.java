// Generated by view binder compiler. Do not edit!
package de.danoeh.antennapod.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import de.danoeh.antennapod.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NavSectionItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView navFeedsFilteredMessage;

  private NavSectionItemBinding(@NonNull LinearLayout rootView,
      @NonNull TextView navFeedsFilteredMessage) {
    this.rootView = rootView;
    this.navFeedsFilteredMessage = navFeedsFilteredMessage;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NavSectionItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NavSectionItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.nav_section_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NavSectionItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      TextView navFeedsFilteredMessage = rootView.findViewById(R.id.nav_feeds_filtered_message);
      if (navFeedsFilteredMessage == null) {
        missingId = "navFeedsFilteredMessage";
        break missingId;
      }
      return new NavSectionItemBinding((LinearLayout) rootView, navFeedsFilteredMessage);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
