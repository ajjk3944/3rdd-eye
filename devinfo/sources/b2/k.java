package b2;

import i1.m;
import i2.z1;
import n1.s;
import nk.l;
import nk.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k extends l implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f1660b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(u uVar, int i4) {
        super(1);
        this.f1659a = i4;
        this.f1660b = uVar;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        boolean z3;
        switch (this.f1659a) {
            case 0:
                i2.i iVar = (z1) obj;
                if (((m) iVar).f25554a.f25565n) {
                    this.f1660b.f29986a = iVar;
                    z3 = false;
                } else {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            default:
                this.f1660b.f29986a = (s) obj;
                return Boolean.TRUE;
        }
    }
}
