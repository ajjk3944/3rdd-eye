package wl;

import hm.q;
import rl.c0;
import rl.p;
import u6.t;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public final String f36838c;

    /* renamed from: d, reason: collision with root package name */
    public final long f36839d;

    /* renamed from: e, reason: collision with root package name */
    public final q f36840e;

    public i(String str, long j, q qVar) {
        this.f36838c = str;
        this.f36839d = j;
        this.f36840e = qVar;
    }

    @Override // rl.c0
    public final long e() {
        return this.f36839d;
    }

    @Override // rl.c0
    public final p g() {
        String str = this.f36838c;
        if (str == null) {
            return null;
        }
        vk.h hVar = p.f33121d;
        try {
            return t.k(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // rl.c0
    public final hm.g m() {
        return this.f36840e;
    }
}
