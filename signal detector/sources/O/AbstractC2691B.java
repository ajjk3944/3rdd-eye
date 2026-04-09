package o;

import A2.C0117e;
import R.C0177d;
import R.InterfaceC0176c;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: o.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2691B {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0176c c0117e;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0117e = new C0117e(clipData, 3);
            } else {
                C0177d c0177d = new C0177d();
                c0177d.f3312b = clipData;
                c0177d.f3313c = 3;
                c0117e = c0177d;
            }
            R.O.i(textView, c0117e.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0176c c0117e;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0117e = new C0117e(clipData, 3);
        } else {
            C0177d c0177d = new C0177d();
            c0177d.f3312b = clipData;
            c0177d.f3313c = 3;
            c0117e = c0177d;
        }
        R.O.i(view, c0117e.build());
        return true;
    }
}
