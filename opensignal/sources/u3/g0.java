package u3;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class g0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static f b(View view, f fVar) {
        ContentInfo contentInfoP = fVar.f23159a.p();
        Objects.requireNonNull(contentInfoP);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoP);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoP ? fVar : new f(new oh.p(contentInfoPerformReceiveContent));
    }
}
