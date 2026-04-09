package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class u6 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        aj zs1Var;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                zs1Var = new zs1(clipData, 3);
            } else {
                bj bjVar = new bj();
                bjVar.g = clipData;
                bjVar.h = 3;
                zs1Var = bjVar;
            }
            e61.h(textView, zs1Var.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        aj zs1Var;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            zs1Var = new zs1(clipData, 3);
        } else {
            bj bjVar = new bj();
            bjVar.g = clipData;
            bjVar.h = 3;
            zs1Var = bjVar;
        }
        e61.h(view, zs1Var.build());
        return true;
    }
}
