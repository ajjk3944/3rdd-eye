package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class a61 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static dj b(View view, dj djVar) {
        ContentInfo contentInfoI = djVar.a.i();
        Objects.requireNonNull(contentInfoI);
        ContentInfo contentInfoO = lb.o(contentInfoI);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoO);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoO ? djVar : new dj(new f23(contentInfoPerformReceiveContent));
    }

    public static void c(View view, String[] strArr, jj0 jj0Var) {
        if (jj0Var == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new b61(jj0Var));
        }
    }
}
