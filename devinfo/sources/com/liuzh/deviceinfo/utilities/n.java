package com.liuzh.deviceinfo.utilities;

import i2.e0;
import java.text.Collator;
import java.util.Comparator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21284a;

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f21285b;

    public n(n nVar) {
        this.f21284a = 2;
        this.f21285b = nVar;
    }

    public int a(String str, String str2) {
        boolean z3 = false;
        boolean z10 = str.length() > 0 && Character.isLetterOrDigit(str.codePointAt(0));
        if (str2.length() > 0 && Character.isLetterOrDigit(str2.codePointAt(0))) {
            z3 = true;
        }
        if (z10 && !z3) {
            return -1;
        }
        if (z10 || !z3) {
            return ((Collator) this.f21285b).compare(str, str2);
        }
        return 1;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f21284a) {
            case 0:
                return a((String) obj, (String) obj2);
            case 1:
                int iCompare = this.f21285b.compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                return e0.U.compare(((p2.p) obj).f31103c, ((p2.p) obj2).f31103c);
            default:
                int iCompare2 = ((n) this.f21285b).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : pk.a.f(Integer.valueOf(((p2.p) obj).g), Integer.valueOf(((p2.p) obj2).g));
        }
    }

    public n(Comparator comparator) {
        this.f21284a = 1;
        this.f21285b = comparator;
    }

    public n() {
        this.f21284a = 0;
        this.f21285b = Collator.getInstance();
    }
}
