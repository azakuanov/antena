// Generated by view binder compiler. Do not edit!
package de.danoeh.antennapod.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import de.danoeh.antennapod.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NavListBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final View divider;

  @NonNull
  public final ImageView imgvCover;

  @NonNull
  public final RelativeLayout navLayout;

  @NonNull
  public final ListView navList;

  @NonNull
  public final LinearLayout navSettings;

  @NonNull
  public final ProgressBar progressBar;

  private NavListBinding(@NonNull RelativeLayout rootView, @NonNull View divider,
      @NonNull ImageView imgvCover, @NonNull RelativeLayout navLayout, @NonNull ListView navList,
      @NonNull LinearLayout navSettings, @NonNull ProgressBar progressBar) {
    this.rootView = rootView;
    this.divider = divider;
    this.imgvCover = imgvCover;
    this.navLayout = navLayout;
    this.navList = navList;
    this.navSettings = navSettings;
    this.progressBar = progressBar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NavListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NavListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.nav_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NavListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      View divider = rootView.findViewById(R.id.divider);
      if (divider == null) {
        missingId = "divider";
        break missingId;
      }
      ImageView imgvCover = rootView.findViewById(R.id.imgvCover);
      if (imgvCover == null) {
        missingId = "imgvCover";
        break missingId;
      }
      RelativeLayout navLayout = rootView.findViewById(R.id.nav_layout);
      if (navLayout == null) {
        missingId = "navLayout";
        break missingId;
      }
      ListView navList = rootView.findViewById(R.id.nav_list);
      if (navList == null) {
        missingId = "navList";
        break missingId;
      }
      LinearLayout navSettings = rootView.findViewById(R.id.nav_settings);
      if (navSettings == null) {
        missingId = "navSettings";
        break missingId;
      }
      ProgressBar progressBar = rootView.findViewById(R.id.progressBar);
      if (progressBar == null) {
        missingId = "progressBar";
        break missingId;
      }
      return new NavListBinding((RelativeLayout) rootView, divider, imgvCover, navLayout, navList,
          navSettings, progressBar);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
