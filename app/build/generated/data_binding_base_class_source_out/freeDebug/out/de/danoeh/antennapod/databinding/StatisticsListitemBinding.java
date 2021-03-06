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
import de.danoeh.antennapod.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class StatisticsListitemBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView chip;

  @NonNull
  public final ImageView imgvCover;

  @NonNull
  public final TextView txtvTitle;

  @NonNull
  public final TextView txtvValue;

  private StatisticsListitemBinding(@NonNull RelativeLayout rootView, @NonNull TextView chip,
      @NonNull ImageView imgvCover, @NonNull TextView txtvTitle, @NonNull TextView txtvValue) {
    this.rootView = rootView;
    this.chip = chip;
    this.imgvCover = imgvCover;
    this.txtvTitle = txtvTitle;
    this.txtvValue = txtvValue;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static StatisticsListitemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StatisticsListitemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.statistics_listitem, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StatisticsListitemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      TextView chip = rootView.findViewById(R.id.chip);
      if (chip == null) {
        missingId = "chip";
        break missingId;
      }
      ImageView imgvCover = rootView.findViewById(R.id.imgvCover);
      if (imgvCover == null) {
        missingId = "imgvCover";
        break missingId;
      }
      TextView txtvTitle = rootView.findViewById(R.id.txtvTitle);
      if (txtvTitle == null) {
        missingId = "txtvTitle";
        break missingId;
      }
      TextView txtvValue = rootView.findViewById(R.id.txtvValue);
      if (txtvValue == null) {
        missingId = "txtvValue";
        break missingId;
      }
      return new StatisticsListitemBinding((RelativeLayout) rootView, chip, imgvCover, txtvTitle,
          txtvValue);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
