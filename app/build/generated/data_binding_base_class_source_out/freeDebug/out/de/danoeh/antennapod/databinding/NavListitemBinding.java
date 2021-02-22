// Generated by view binder compiler. Do not edit!
package de.danoeh.antennapod.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.joanzapata.iconify.widget.IconTextView;
import de.danoeh.antennapod.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NavListitemBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView imgvCover;

  @NonNull
  public final IconTextView itxtvFailure;

  @NonNull
  public final TextView txtvCount;

  @NonNull
  public final TextView txtvTitle;

  private NavListitemBinding(@NonNull RelativeLayout rootView, @NonNull ImageView imgvCover,
      @NonNull IconTextView itxtvFailure, @NonNull TextView txtvCount,
      @NonNull TextView txtvTitle) {
    this.rootView = rootView;
    this.imgvCover = imgvCover;
    this.itxtvFailure = itxtvFailure;
    this.txtvCount = txtvCount;
    this.txtvTitle = txtvTitle;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NavListitemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NavListitemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.nav_listitem, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NavListitemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      ImageView imgvCover = rootView.findViewById(R.id.imgvCover);
      if (imgvCover == null) {
        missingId = "imgvCover";
        break missingId;
      }
      IconTextView itxtvFailure = rootView.findViewById(R.id.itxtvFailure);
      if (itxtvFailure == null) {
        missingId = "itxtvFailure";
        break missingId;
      }
      TextView txtvCount = rootView.findViewById(R.id.txtvCount);
      if (txtvCount == null) {
        missingId = "txtvCount";
        break missingId;
      }
      TextView txtvTitle = rootView.findViewById(R.id.txtvTitle);
      if (txtvTitle == null) {
        missingId = "txtvTitle";
        break missingId;
      }
      return new NavListitemBinding((RelativeLayout) rootView, imgvCover, itxtvFailure, txtvCount,
          txtvTitle);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}