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
import com.joanzapata.iconify.widget.IconTextView;
import de.danoeh.antennapod.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DownloadlogItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout container;

  @NonNull
  public final LinearLayout status;

  @NonNull
  public final TextView txtvDate;

  @NonNull
  public final IconTextView txtvIcon;

  @NonNull
  public final TextView txtvReason;

  @NonNull
  public final TextView txtvTitle;

  @NonNull
  public final TextView txtvType;

  private DownloadlogItemBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout container,
      @NonNull LinearLayout status, @NonNull TextView txtvDate, @NonNull IconTextView txtvIcon,
      @NonNull TextView txtvReason, @NonNull TextView txtvTitle, @NonNull TextView txtvType) {
    this.rootView = rootView;
    this.container = container;
    this.status = status;
    this.txtvDate = txtvDate;
    this.txtvIcon = txtvIcon;
    this.txtvReason = txtvReason;
    this.txtvTitle = txtvTitle;
    this.txtvType = txtvType;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DownloadlogItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DownloadlogItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.downloadlog_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DownloadlogItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      LinearLayout container = rootView.findViewById(R.id.container);
      if (container == null) {
        missingId = "container";
        break missingId;
      }
      LinearLayout status = rootView.findViewById(R.id.status);
      if (status == null) {
        missingId = "status";
        break missingId;
      }
      TextView txtvDate = rootView.findViewById(R.id.txtvDate);
      if (txtvDate == null) {
        missingId = "txtvDate";
        break missingId;
      }
      IconTextView txtvIcon = rootView.findViewById(R.id.txtvIcon);
      if (txtvIcon == null) {
        missingId = "txtvIcon";
        break missingId;
      }
      TextView txtvReason = rootView.findViewById(R.id.txtvReason);
      if (txtvReason == null) {
        missingId = "txtvReason";
        break missingId;
      }
      TextView txtvTitle = rootView.findViewById(R.id.txtvTitle);
      if (txtvTitle == null) {
        missingId = "txtvTitle";
        break missingId;
      }
      TextView txtvType = rootView.findViewById(R.id.txtvType);
      if (txtvType == null) {
        missingId = "txtvType";
        break missingId;
      }
      return new DownloadlogItemBinding((LinearLayout) rootView, container, status, txtvDate,
          txtvIcon, txtvReason, txtvTitle, txtvType);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
