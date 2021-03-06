// Generated by view binder compiler. Do not edit!
package de.danoeh.antennapod.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import de.danoeh.antennapod.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class StatisticsActivityBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView statisticsList;

  private StatisticsActivityBinding(@NonNull FrameLayout rootView, @NonNull ProgressBar progressBar,
      @NonNull RecyclerView statisticsList) {
    this.rootView = rootView;
    this.progressBar = progressBar;
    this.statisticsList = statisticsList;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static StatisticsActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StatisticsActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.statistics_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StatisticsActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      ProgressBar progressBar = rootView.findViewById(R.id.progressBar);
      if (progressBar == null) {
        missingId = "progressBar";
        break missingId;
      }
      RecyclerView statisticsList = rootView.findViewById(R.id.statistics_list);
      if (statisticsList == null) {
        missingId = "statisticsList";
        break missingId;
      }
      return new StatisticsActivityBinding((FrameLayout) rootView, progressBar, statisticsList);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
