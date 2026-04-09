package jj;

import java.util.HashSet;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashSet f27709b;

    public /* synthetic */ g(HashSet hashSet, int i4) {
        this.f27708a = i4;
        this.f27709b = hashSet;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        aj.b bVar = (aj.b) obj;
        switch (this.f27708a) {
            case 0:
                k.e(bVar, "it");
                boolean zContains = this.f27709b.contains(bVar.c());
                if (zContains) {
                    bVar.b(0L, true);
                }
                return Boolean.valueOf(zContains);
            default:
                k.e(bVar, "it");
                return Boolean.valueOf(this.f27709b.contains(bVar.c()));
        }
    }
}
