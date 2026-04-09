package defpackage;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class b61 implements OnReceiveContentListener {
    public final jj0 a;

    public b61(jj0 jj0Var) {
        this.a = jj0Var;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        dj djVar = new dj(new f23(contentInfo));
        dj djVarA = ((l11) this.a).a(view, djVar);
        if (djVarA == null) {
            return null;
        }
        if (djVarA == djVar) {
            return contentInfo;
        }
        ContentInfo contentInfoI = djVarA.a.i();
        Objects.requireNonNull(contentInfoI);
        return lb.o(contentInfoI);
    }
}
