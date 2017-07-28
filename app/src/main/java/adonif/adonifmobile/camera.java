package adonif.adonifmobile;

import android.app.Activity;
import android.content.Intent;
import android.provider.MediaStore;

/**
 * Created by Béatrice on 28/07/2017.
 */

public class camera extends Activity{
    static final int REQUEST_IMAGE_CAPTURE = 1;

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }
}
