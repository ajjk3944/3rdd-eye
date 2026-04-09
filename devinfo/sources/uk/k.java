package uk;

import java.util.Iterator;
import u0.l2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k implements Iterable, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f35529a;

    public k(e eVar) {
        this.f35529a = eVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new l2(this.f35529a);
    }
}
