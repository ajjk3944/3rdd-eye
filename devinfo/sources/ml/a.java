package ml;

import com.google.android.gms.internal.ads.be1;
import d0.z0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements il.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f29400a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final n f29401b = new n("kotlin.Boolean", kl.b.f28372c);

    @Override // il.a
    public final Object a(be1 be1Var) {
        boolean z3;
        boolean z10;
        nk.k.e(be1Var, "decoder");
        ol.i iVar = (ol.i) be1Var.f9660d;
        int iP = iVar.p();
        String str = (String) iVar.f30594e;
        if (iP == str.length()) {
            ol.i.k(iVar, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(iP) == '\"') {
            iP++;
            z3 = true;
        } else {
            z3 = false;
        }
        int iN = iVar.n(iP);
        if (iN >= str.length() || iN == -1) {
            ol.i.k(iVar, "EOF", 0, 6);
            throw null;
        }
        int i4 = iN + 1;
        int iCharAt = str.charAt(iN) | ' ';
        if (iCharAt == 102) {
            iVar.c(i4, "alse");
            z10 = false;
        } else {
            if (iCharAt != 116) {
                ol.i.k(iVar, "Expected valid boolean literal prefix, but had '" + iVar.h() + '\'', 0, 6);
                throw null;
            }
            iVar.c(i4, "rue");
            z10 = true;
        }
        if (z3) {
            if (iVar.f30591b == str.length()) {
                ol.i.k(iVar, "EOF", 0, 6);
                throw null;
            }
            if (str.charAt(iVar.f30591b) != '\"') {
                ol.i.k(iVar, "Expected closing quotation mark", 0, 6);
                throw null;
            }
            iVar.f30591b++;
        }
        return Boolean.valueOf(z10);
    }

    @Override // il.a
    public final void b(z0 z0Var, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (z0Var.f21912a) {
            z0Var.m(String.valueOf(zBooleanValue));
        } else {
            ((t7.m) ((a4.d) z0Var.f21913b).f189b).B(String.valueOf(zBooleanValue));
        }
    }

    @Override // il.a
    public final kl.d d() {
        return f29401b;
    }
}
