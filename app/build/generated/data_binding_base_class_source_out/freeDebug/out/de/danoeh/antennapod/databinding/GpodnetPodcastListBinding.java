// Generated by view binder compiler. Do not edit!
package de.danoeh.antennapod.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import de.danoeh.antennapod.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class GpodnetPodcastListBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button butRetry;

  @NonNull
  public final GridView gridView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView txtvError;

  private GpodnetPodcastListBinding(@NonNull RelativeLayout rootView, @NonNull Button butRetry,
      @NonNull GridView gridView, @NonNull ProgressBar progressBar, @NonNull TextView txtvError) {
    this.rootView = rootView;
    this.butRetry = butRetry;
    this.gridView = gridView;
    this.progressBar = progressBar;
    this.txtvError = txtvError;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static GpodnetPodcastListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GpodnetPodcastListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.gpodnet_podcast_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GpodnetPodcastListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      Button butRetry = rootView.findViewById(R.id.butRetry);
      if (butRetry == null) {
        missingId = "butRetry";
        break missingId;
      }
      GridView gridView = rootView.findViewById(R.id.gridView);
      if (gridView == null) {
        missingId = "gridView";
        break missingId;
      }
      ProgressBar progressBar = rootView.findViewById(R.id.progressBar);
      if (progressBar == null) {
        missingId = "progressBar";
        break missingId;
      }
      TextView txtvError = rootView.findViewById(R.id.txtvError);
      if (txtvError == null) {
        missingId = "txtvError";
        break missingId;
      }
      return new GpodnetPodcastListBinding((RelativeLayout) rootView, butRetry, gridView,
          progressBar, txtvError);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}