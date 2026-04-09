package ya;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class n0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.k f26118a;

    /* renamed from: b, reason: collision with root package name */
    public final s9.g f26119b;

    /* renamed from: c, reason: collision with root package name */
    public final ba.a f26120c;

    /* renamed from: d, reason: collision with root package name */
    public final sm.m f26121d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26122e;

    public n0(io.sentry.k kVar, ca.i iVar) {
        s9.g gVar = new s9.g(8, iVar);
        this.f26118a = kVar;
        this.f26119b = gVar;
        this.f26120c = new ba.a();
        this.f26121d = new sm.m();
        this.f26122e = 1048576;
    }

    public final x a(Uri uri) {
        List list = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        com.google.android.exoplayer2.m0 m0Var = uri != null ? new com.google.android.exoplayer2.m0(uri, null, null, null, list, list, null) : null;
        com.google.android.exoplayer2.n0 n0Var = new com.google.android.exoplayer2.n0("", new com.google.android.exoplayer2.k0(Long.MIN_VALUE), m0Var, new com.google.android.exoplayer2.l0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), com.google.android.exoplayer2.p0.f4365s);
        m0Var.getClass();
        return new o0(n0Var, this.f26118a, this.f26119b, this.f26120c.a(n0Var), this.f26121d, this.f26122e);
    }
}
