package Zi;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* renamed from: Zi.f0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3705f0 extends K0 {

    /* renamed from: a, reason: collision with root package name */
    private long[] f25626a;

    /* renamed from: b, reason: collision with root package name */
    private int f25627b;

    public C3705f0(long[] bufferWithData) {
        AbstractC6492s.i(bufferWithData, "bufferWithData");
        this.f25626a = bufferWithData;
        this.f25627b = bufferWithData.length;
        b(10);
    }

    @Override // Zi.K0
    public void b(int i10) {
        long[] jArr = this.f25626a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, AbstractC7978m.d(i10, jArr.length * 2));
            AbstractC6492s.h(jArrCopyOf, "copyOf(...)");
            this.f25626a = jArrCopyOf;
        }
    }

    @Override // Zi.K0
    public int d() {
        return this.f25627b;
    }

    public final void e(long j10) {
        K0.c(this, 0, 1, null);
        long[] jArr = this.f25626a;
        int iD = d();
        this.f25627b = iD + 1;
        jArr[iD] = j10;
    }

    @Override // Zi.K0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f25626a, d());
        AbstractC6492s.h(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }
}
