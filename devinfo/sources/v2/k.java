package v2;

import com.bytedance.sdk.openadsdk.TTAdConstant;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final k f35776b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f35777c;

    /* renamed from: d, reason: collision with root package name */
    public static final k f35778d;

    /* renamed from: e, reason: collision with root package name */
    public static final k f35779e;

    /* renamed from: a, reason: collision with root package name */
    public final int f35780a;

    static {
        k kVar = new k(100);
        k kVar2 = new k(TTAdConstant.MATE_VALID);
        k kVar3 = new k(300);
        k kVar4 = new k(400);
        k kVar5 = new k(500);
        k kVar6 = new k(600);
        f35776b = kVar6;
        k kVar7 = new k(700);
        k kVar8 = new k(800);
        k kVar9 = new k(900);
        f35777c = kVar4;
        f35778d = kVar5;
        f35779e = kVar7;
        cm.g.t(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9);
    }

    public k(int i4) {
        this.f35780a = i4;
        boolean z3 = false;
        if (1 <= i4 && i4 < 1001) {
            z3 = true;
        }
        if (z3) {
            return;
        }
        x2.a.a("Font weight can be in range [1, 1000]. Current value: " + i4);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return nk.k.f(this.f35780a, ((k) obj).f35780a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f35780a == ((k) obj).f35780a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f35780a;
    }

    public final String toString() {
        return d.h.u(new StringBuilder("FontWeight(weight="), this.f35780a, ')');
    }
}
