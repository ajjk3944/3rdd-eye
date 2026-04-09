package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class p extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public char[] f22895a;

    /* renamed from: b, reason: collision with root package name */
    public int f22896b;

    public p(char[] bufferWithData) {
        kotlin.jvm.internal.p.e(bufferWithData, "bufferWithData");
        this.f22895a = bufferWithData;
        this.f22896b = bufferWithData.length;
        b(10);
    }

    @Override // kotlinx.serialization.internal.p1
    public void b(int i10) {
        char[] cArr = this.f22895a;
        if (cArr.length < i10) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, q9.e.b(i10, cArr.length * 2));
            kotlin.jvm.internal.p.d(cArrCopyOf, "copyOf(this, newSize)");
            this.f22895a = cArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.p1
    public int d() {
        return this.f22896b;
    }

    public final void e(char c10) {
        p1.c(this, 0, 1, null);
        char[] cArr = this.f22895a;
        int iD = d();
        this.f22896b = iD + 1;
        cArr[iD] = c10;
    }

    @Override // kotlinx.serialization.internal.p1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f22895a, d());
        kotlin.jvm.internal.p.d(cArrCopyOf, "copyOf(this, newSize)");
        return cArrCopyOf;
    }
}
