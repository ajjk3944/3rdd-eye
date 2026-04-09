package j2;

import com.google.android.gms.internal.ads.te0;
import java.text.BreakIterator;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends androidx.recyclerview.widget.d0 {

    /* renamed from: e, reason: collision with root package name */
    public static b f27089e;

    /* renamed from: f, reason: collision with root package name */
    public static b f27090f;
    public static b g;

    /* renamed from: h, reason: collision with root package name */
    public static final c3.j f27091h = c3.j.f2720b;

    /* renamed from: i, reason: collision with root package name */
    public static final c3.j f27092i = c3.j.f2719a;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27093c;

    /* renamed from: d, reason: collision with root package name */
    public Object f27094d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i4) {
        super(6);
        this.f27093c = i4;
    }

    public boolean A(int i4) {
        if (i4 <= 0 || !B(i4 - 1)) {
            return false;
        }
        return i4 == o().length() || !B(i4);
    }

    public boolean B(int i4) {
        if (i4 < 0 || i4 >= o().length()) {
            return false;
        }
        return Character.isLetterOrDigit(o().codePointAt(i4));
    }

    @Override // androidx.recyclerview.widget.d0
    public final int[] e(int i4) {
        int iA;
        switch (this.f27093c) {
            case 0:
                int length = o().length();
                if (length <= 0 || i4 >= length) {
                    return null;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f27094d;
                    if (breakIterator == null) {
                        nk.k.k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i4)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f27094d;
                        if (breakIterator2 == null) {
                            nk.k.k("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i4);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return h(i4, iFollowing);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f27094d;
                    if (breakIterator3 == null) {
                        nk.k.k("impl");
                        throw null;
                    }
                    i4 = breakIterator3.following(i4);
                } while (i4 != -1);
                return null;
            case 1:
                if (o().length() <= 0 || i4 >= o().length()) {
                    return null;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
                while (!B(i4) && (!B(i4) || (i4 != 0 && B(i4 - 1)))) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f27094d;
                    if (breakIterator4 == null) {
                        nk.k.k("impl");
                        throw null;
                    }
                    i4 = breakIterator4.following(i4);
                    if (i4 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f27094d;
                if (breakIterator5 == null) {
                    nk.k.k("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator5.following(i4);
                if (iFollowing2 == -1 || !A(iFollowing2)) {
                    return null;
                }
                return h(i4, iFollowing2);
            default:
                if (o().length() <= 0 || i4 >= o().length()) {
                    return null;
                }
                c3.j jVar = f27091h;
                if (i4 < 0) {
                    s2.e0 e0Var = (s2.e0) this.f27094d;
                    if (e0Var == null) {
                        nk.k.k("layoutResult");
                        throw null;
                    }
                    iA = e0Var.a(0);
                } else {
                    s2.e0 e0Var2 = (s2.e0) this.f27094d;
                    if (e0Var2 == null) {
                        nk.k.k("layoutResult");
                        throw null;
                    }
                    int iA2 = e0Var2.a(i4);
                    iA = y(iA2, jVar) == i4 ? iA2 : iA2 + 1;
                }
                s2.e0 e0Var3 = (s2.e0) this.f27094d;
                if (e0Var3 == null) {
                    nk.k.k("layoutResult");
                    throw null;
                }
                if (iA >= e0Var3.f33369b.f16794b) {
                    return null;
                }
                return h(y(iA, jVar), y(iA, f27092i) + 1);
        }
    }

    @Override // androidx.recyclerview.widget.d0
    public final int[] r(int i4) {
        int iA;
        switch (this.f27093c) {
            case 0:
                int length = o().length();
                if (length <= 0 || i4 <= 0) {
                    return null;
                }
                if (i4 > length) {
                    i4 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f27094d;
                    if (breakIterator == null) {
                        nk.k.k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i4)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f27094d;
                        if (breakIterator2 == null) {
                            nk.k.k("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i4);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return h(iPreceding, i4);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f27094d;
                    if (breakIterator3 == null) {
                        nk.k.k("impl");
                        throw null;
                    }
                    i4 = breakIterator3.preceding(i4);
                } while (i4 != -1);
                return null;
            case 1:
                int length2 = o().length();
                if (length2 <= 0 || i4 <= 0) {
                    return null;
                }
                if (i4 > length2) {
                    i4 = length2;
                }
                while (i4 > 0 && !B(i4 - 1) && !A(i4)) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f27094d;
                    if (breakIterator4 == null) {
                        nk.k.k("impl");
                        throw null;
                    }
                    i4 = breakIterator4.preceding(i4);
                    if (i4 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f27094d;
                if (breakIterator5 == null) {
                    nk.k.k("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator5.preceding(i4);
                if (iPreceding2 == -1 || !B(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !B(iPreceding2 - 1)) {
                    return h(iPreceding2, i4);
                }
                return null;
            default:
                if (o().length() <= 0 || i4 <= 0) {
                    return null;
                }
                int length3 = o().length();
                c3.j jVar = f27092i;
                if (i4 > length3) {
                    s2.e0 e0Var = (s2.e0) this.f27094d;
                    if (e0Var == null) {
                        nk.k.k("layoutResult");
                        throw null;
                    }
                    iA = e0Var.a(o().length());
                } else {
                    s2.e0 e0Var2 = (s2.e0) this.f27094d;
                    if (e0Var2 == null) {
                        nk.k.k("layoutResult");
                        throw null;
                    }
                    int iA2 = e0Var2.a(i4);
                    iA = y(iA2, jVar) + 1 == i4 ? iA2 : iA2 - 1;
                }
                if (iA < 0) {
                    return null;
                }
                return h(y(iA, f27091h), y(iA, jVar) + 1);
        }
    }

    public int y(int i4, c3.j jVar) {
        s2.e0 e0Var = (s2.e0) this.f27094d;
        if (e0Var == null) {
            nk.k.k("layoutResult");
            throw null;
        }
        int iC = e0Var.c(i4);
        s2.e0 e0Var2 = (s2.e0) this.f27094d;
        if (e0Var2 == null) {
            nk.k.k("layoutResult");
            throw null;
        }
        if (jVar != e0Var2.e(iC)) {
            s2.e0 e0Var3 = (s2.e0) this.f27094d;
            if (e0Var3 != null) {
                return e0Var3.c(i4);
            }
            nk.k.k("layoutResult");
            throw null;
        }
        s2.e0 e0Var4 = (s2.e0) this.f27094d;
        if (e0Var4 == null) {
            nk.k.k("layoutResult");
            throw null;
        }
        te0 te0Var = e0Var4.f33369b;
        te0Var.b(i4);
        ArrayList arrayList = (ArrayList) te0Var.f16797e;
        s2.a aVar = ((s2.m) arrayList.get(s2.z.d(i4, arrayList))).f33402a;
        return (aVar.f33330d.e(i4 - r6.f33405d) + r6.f33403b) - 1;
    }

    public void z(String str) {
        switch (this.f27093c) {
            case 0:
                this.f1325a = str;
                BreakIterator breakIterator = (BreakIterator) this.f27094d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    nk.k.k("impl");
                    throw null;
                }
            default:
                this.f1325a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f27094d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    nk.k.k("impl");
                    throw null;
                }
        }
    }
}
