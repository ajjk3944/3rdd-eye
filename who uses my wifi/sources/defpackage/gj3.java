package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gj3 extends gd3 {
    public final pg3 f;

    public gj3(Context context, ExecutorService executorService, pg3 pg3Var) {
        super(context, executorService, new gi4(), false);
        this.f = pg3Var;
    }

    @Override // defpackage.gd3
    public final void b(int i, long j) {
        ((wg3) this.f).b(i, j, null, null);
        new gi4().e(Boolean.TRUE);
    }

    @Override // defpackage.gd3
    public final void c(int i, long j, Exception exc) {
        ((wg3) this.f).b(i, j, exc, null);
        new gi4().e(Boolean.TRUE);
    }

    @Override // defpackage.gd3
    public final void d(String str, int i) {
        ((wg3) this.f).b(i, -1L, null, str);
        new gi4().e(Boolean.TRUE);
    }
}
