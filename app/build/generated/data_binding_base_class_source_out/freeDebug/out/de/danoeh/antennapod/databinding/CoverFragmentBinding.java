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
import de.danoeh.antennapod.ui.common.SquareImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CoverFragmentBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout coverFragment;

  @NonNull
  public final LinearLayout coverFragmentTextContainer;

  @NonNull
  public final SquareImageView imgvCover;

  @NonNull
  public final TextView txtvEpisodeTitle;

  @NonNull
  public final TextView txtvPodcastTitle;

  private CoverFragmentBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout coverFragment,
      @NonNull LinearLayout coverFragmentTextContainer, @NonNull SquareImageView imgvCover,
      @NonNull TextView txtvEpisodeTitle, @NonNull TextView txtvPodcastTitle) {
    this.rootView = rootView;
    this.coverFragment = coverFragment;
    this.coverFragmentTextContainer = coverFragmentTextContainer;
    this.imgvCover = imgvCover;
    this.txtvEpisodeTitle = txtvEpisodeTitle;
    this.txtvPodcastTitle = txtvPodcastTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CoverFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CoverFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.cover_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CoverFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      LinearLayout coverFragment = rootView.findViewById(R.id.cover_fragment);
      if (coverFragment == null) {
        missingId = "coverFragment";
        break missingId;
      }
      LinearLayout coverFragmentTextContainer = rootView.findViewById(R.id.cover_fragment_text_container);
      if (coverFragmentTextContainer == null) {
        missingId = "coverFragmentTextContainer";
        break missingId;
      }
      SquareImageView imgvCover = rootView.findViewById(R.id.imgvCover);
      if (imgvCover == null) {
        missingId = "imgvCover";
        break missingId;
      }
      TextView txtvEpisodeTitle = rootView.findViewById(R.id.txtvEpisodeTitle);
      if (txtvEpisodeTitle == null) {
        missingId = "txtvEpisodeTitle";
        break missingId;
      }
      TextView txtvPodcastTitle = rootView.findViewById(R.id.txtvPodcastTitle);
      if (txtvPodcastTitle == null) {
        missingId = "txtvPodcastTitle";
        break missingId;
      }
      return new CoverFragmentBinding((LinearLayout) rootView, coverFragment,
          coverFragmentTextContainer, imgvCover, txtvEpisodeTitle, txtvPodcastTitle);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
