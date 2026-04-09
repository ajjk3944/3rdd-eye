package R;

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;

/* loaded from: classes.dex */
public abstract class M {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0179f b(View view, C0179f c0179f) {
        ContentInfo contentInfoH = c0179f.f3317a.h();
        Objects.requireNonNull(contentInfoH);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoH);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoH ? c0179f : new C0179f(new A0.e(contentInfoPerformReceiveContent));
    }
}
