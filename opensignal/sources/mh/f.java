package mh;

import i.g0;
import java.nio.channels.DatagramChannel;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class f extends d {
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final HashSet f16732l;

    public f(b bVar, DatagramChannel datagramChannel, g0 g0Var, a aVar, yh.c cVar, boolean z10) {
        super(bVar, datagramChannel, g0Var, aVar, cVar, z10);
        this.f16732l = new HashSet();
        this.k = bVar.D * bVar.f16705g;
    }

    @Override // mh.d
    public final boolean c() {
        return !this.f16729h.get() && this.f16732l.size() < this.k;
    }

    @Override // mh.d
    public final void d(c cVar) {
        super.d(cVar);
        this.f16732l.add(new int[]{cVar.f16714e, cVar.f16713d});
    }
}
