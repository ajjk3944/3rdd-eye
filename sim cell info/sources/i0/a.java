package i0;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.text.ClipboardManager;

/* loaded from: classes.dex */
public class a {
    @SuppressLint({"NewApi"})
    public static boolean a(Context context, String str) {
        try {
            if (Build.VERSION.SDK_INT < 11) {
                ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
                if (clipboardManager == null) {
                    return true;
                }
                clipboardManager.setText(str);
                return true;
            }
            android.content.ClipboardManager clipboardManager2 = (android.content.ClipboardManager) context.getSystemService("clipboard");
            ClipData clipDataNewPlainText = ClipData.newPlainText("a7eapp", str);
            if (clipboardManager2 == null) {
                return true;
            }
            clipboardManager2.setPrimaryClip(clipDataNewPlainText);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
