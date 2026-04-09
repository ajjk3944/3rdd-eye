package g8;

import android.text.TextUtils;
import android.widget.Toast;
import com.wifihacker.detector.HackerApplication;

/* loaded from: classes3.dex */
public abstract class r {
    public static void a(int i10) {
        Toast.makeText(HackerApplication.l(), i10, 0).show();
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Toast.makeText(HackerApplication.l(), str, 0).show();
    }
}
