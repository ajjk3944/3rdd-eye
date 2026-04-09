package o5;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g1 extends a {

    /* renamed from: a, reason: collision with root package name */
    public final b5.g f18946a;

    /* renamed from: c, reason: collision with root package name */
    public final r5.h f18948c;

    /* renamed from: e, reason: collision with root package name */
    public b5.b0 f18950e;

    /* renamed from: b, reason: collision with root package name */
    public final long f18947b = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18949d = true;

    public g1(androidx.media3.common.d0 d0Var, bm.e eVar, r5.h hVar) {
        this.f18946a = eVar;
        this.f18948c = hVar;
        oe.f0 f0Var = oe.h0.f19336d;
        oe.u0 u0Var = oe.u0.f19383x;
        List list = Collections.EMPTY_LIST;
        oe.u0 u0Var2 = oe.u0.f19383x;
        androidx.media3.common.c0 c0Var = androidx.media3.common.c0.f1577g;
        Uri uri = Uri.EMPTY;
        d0Var.getClass();
        throw null;
    }

    @Override // o5.b0
    public final x createPeriod(z zVar, r5.b bVar, long j) {
        return new f1(null, this.f18946a, this.f18950e, null, this.f18947b, this.f18948c, createEventDispatcher(zVar), this.f18949d);
    }

    @Override // o5.b0
    public final androidx.media3.common.e0 getMediaItem() {
        return null;
    }

    @Override // o5.a
    public final void prepareSourceInternal(b5.b0 b0Var) {
        this.f18950e = b0Var;
        refreshSourceInfo(null);
    }

    @Override // o5.b0
    public final void releasePeriod(x xVar) {
        ((f1) xVar).E.e(null);
    }

    @Override // o5.b0
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // o5.a
    public final void releaseSourceInternal() {
    }
}
