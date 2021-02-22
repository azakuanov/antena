// Generated by view binder compiler. Do not edit!
package de.danoeh.antennapod.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import de.danoeh.antennapod.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class EmptyViewLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView emptyViewIcon;

  @NonNull
  public final TextView emptyViewMessage;

  @NonNull
  public final TextView emptyViewTitle;

  private EmptyViewLayoutBinding(@NonNull LinearLayout rootView, @NonNull ImageView emptyViewIcon,
      @NonNull TextView emptyViewMessage, @NonNull TextView emptyViewTitle) {
    this.rootView = rootView;
    this.emptyViewIcon = emptyViewIcon;
    this.emptyViewMessage = emptyViewMessage;
    this.emptyViewTitle = emptyViewTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static EmptyViewLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static EmptyViewLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.empty_view_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static EmptyViewLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      ImageView emptyViewIcon = rootView.findViewById(R.id.emptyViewIcon);
      if (emptyViewIcon == null) {
        missingId = "emptyViewIcon";
        break missingId;
      }
      TextView emptyViewMessage = rootView.findViewById(R.id.emptyViewMessage);
      if (emptyViewMessage == null) {
        missingId = "emptyViewMessage";
        break missingId;
      }
      TextView emptyViewTitle = rootView.findViewById(R.id.emptyViewTitle);
      if (emptyViewTitle == null) {
        missingId = "emptyViewTitle";
        break missingId;
      }
      return new EmptyViewLayoutBinding((LinearLayout) rootView, emptyViewIcon, emptyViewMessage,
          emptyViewTitle);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}