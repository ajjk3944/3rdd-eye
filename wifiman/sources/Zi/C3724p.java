package Zi;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* renamed from: Zi.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3724p extends K0 {

    /* renamed from: a, reason: collision with root package name */
    private char[] f25672a;

    /* renamed from: b, reason: collision with root package name */
    private int f25673b;

    public C3724p(char[] bufferWithData) {
        AbstractC6492s.i(bufferWithData, "bufferWithData");
        this.f25672a = bufferWithData;
        this.f25673b = bufferWithData.length;
        b(10);
    }

    @Override // Zi.K0
    public void b(int i10) {
        char[] cArr = this.f25672a;
        if (cArr.length < i10) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, AbstractC7978m.d(i10, cArr.length * 2));
            AbstractC6492s.h(cArrCopyOf, "copyOf(...)");
            this.f25672a = cArrCopyOf;
        }
    }

    @Override // Zi.K0
    public int d() {
        return this.f25673b;
    }

    public final void e(char c10) {
        K0.c(this, 0, 1, null);
        char[] cArr = this.f25672a;
        int iD = d();
        this.f25673b = iD + 1;
        cArr[iD] = c10;
    }

    @Override // Zi.K0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f25672a, d());
        AbstractC6492s.h(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }
}
