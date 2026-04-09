package S9;

import b9.C1992A;
import c9.C2087h;

/* compiled from: ArrayPools.kt */
/* renamed from: S9.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1580l {

    /* renamed from: a, reason: collision with root package name */
    public final C2087h<char[]> f12091a = new C2087h<>();

    /* renamed from: b, reason: collision with root package name */
    public int f12092b;

    public final void a(char[] array) {
        kotlin.jvm.internal.l.f(array, "array");
        synchronized (this) {
            try {
                int i = this.f12092b;
                if (array.length + i < C1575g.f12085a) {
                    this.f12092b = i + array.length;
                    this.f12091a.e(array);
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final char[] b(int i) {
        char[] cArr;
        synchronized (this) {
            C2087h<char[]> c2087h = this.f12091a;
            cArr = null;
            char[] cArrO = c2087h.isEmpty() ? null : c2087h.o();
            if (cArrO != null) {
                this.f12092b -= cArrO.length;
                cArr = cArrO;
            }
        }
        return cArr == null ? new char[i] : cArr;
    }
}
