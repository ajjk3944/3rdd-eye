package o;

import L0.C0773d;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: AppCompatReceiveContentHelper.java */
/* renamed from: o.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5399q {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        C0773d.b aVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                aVar = new C0773d.a(clipData, 3);
            } else {
                C0773d.c cVar = new C0773d.c();
                cVar.f3891a = clipData;
                cVar.f3892b = 3;
                aVar = cVar;
            }
            L0.I.k(textView, aVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        C0773d.b aVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            aVar = new C0773d.a(clipData, 3);
        } else {
            C0773d.c cVar = new C0773d.c();
            cVar.f3891a = clipData;
            cVar.f3892b = 3;
            aVar = cVar;
        }
        L0.I.k(view, aVar.build());
        return true;
    }
}
