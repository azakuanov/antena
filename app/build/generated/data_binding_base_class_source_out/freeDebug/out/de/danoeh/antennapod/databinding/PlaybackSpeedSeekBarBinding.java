// Generated by view binder compiler. Do not edit!
package de.danoeh.antennapod.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import de.danoeh.antennapod.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PlaybackSpeedSeekBarBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView butDecSpeed;

  @NonNull
  public final TextView butIncSpeed;

  @NonNull
  public final SeekBar playbackSpeed;

  private PlaybackSpeedSeekBarBinding(@NonNull LinearLayout rootView, @NonNull TextView butDecSpeed,
      @NonNull TextView butIncSpeed, @NonNull SeekBar playbackSpeed) {
    this.rootView = rootView;
    this.butDecSpeed = butDecSpeed;
    this.butIncSpeed = butIncSpeed;
    this.playbackSpeed = playbackSpeed;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PlaybackSpeedSeekBarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PlaybackSpeedSeekBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.playback_speed_seek_bar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PlaybackSpeedSeekBarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      TextView butDecSpeed = rootView.findViewById(R.id.butDecSpeed);
      if (butDecSpeed == null) {
        missingId = "butDecSpeed";
        break missingId;
      }
      TextView butIncSpeed = rootView.findViewById(R.id.butIncSpeed);
      if (butIncSpeed == null) {
        missingId = "butIncSpeed";
        break missingId;
      }
      SeekBar playbackSpeed = rootView.findViewById(R.id.playback_speed);
      if (playbackSpeed == null) {
        missingId = "playbackSpeed";
        break missingId;
      }
      return new PlaybackSpeedSeekBarBinding((LinearLayout) rootView, butDecSpeed, butIncSpeed,
          playbackSpeed);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
