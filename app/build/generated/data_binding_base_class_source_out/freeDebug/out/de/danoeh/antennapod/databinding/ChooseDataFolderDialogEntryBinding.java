// Generated by view binder compiler. Do not edit!
package de.danoeh.antennapod.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import de.danoeh.antennapod.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ChooseDataFolderDialogEntryBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView path;

  @NonNull
  public final RadioButton radioButton;

  @NonNull
  public final RelativeLayout root;

  @NonNull
  public final TextView size;

  @NonNull
  public final ProgressBar usedSpace;

  private ChooseDataFolderDialogEntryBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView path, @NonNull RadioButton radioButton, @NonNull RelativeLayout root,
      @NonNull TextView size, @NonNull ProgressBar usedSpace) {
    this.rootView = rootView;
    this.path = path;
    this.radioButton = radioButton;
    this.root = root;
    this.size = size;
    this.usedSpace = usedSpace;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ChooseDataFolderDialogEntryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ChooseDataFolderDialogEntryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.choose_data_folder_dialog_entry, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ChooseDataFolderDialogEntryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      TextView path = rootView.findViewById(R.id.path);
      if (path == null) {
        missingId = "path";
        break missingId;
      }
      RadioButton radioButton = rootView.findViewById(R.id.radio_button);
      if (radioButton == null) {
        missingId = "radioButton";
        break missingId;
      }
      RelativeLayout root = rootView.findViewById(R.id.root);
      if (root == null) {
        missingId = "root";
        break missingId;
      }
      TextView size = rootView.findViewById(R.id.size);
      if (size == null) {
        missingId = "size";
        break missingId;
      }
      ProgressBar usedSpace = rootView.findViewById(R.id.used_space);
      if (usedSpace == null) {
        missingId = "usedSpace";
        break missingId;
      }
      return new ChooseDataFolderDialogEntryBinding((RelativeLayout) rootView, path, radioButton,
          root, size, usedSpace);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
