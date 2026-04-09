package ej;

import Zg.AbstractC3682n;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: h, reason: collision with root package name */
    public static final a f46525h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f46526a;

    /* renamed from: b, reason: collision with root package name */
    public int f46527b;

    /* renamed from: c, reason: collision with root package name */
    public int f46528c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f46529d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f46530e;

    /* renamed from: f, reason: collision with root package name */
    public y f46531f;

    /* renamed from: g, reason: collision with root package name */
    public y f46532g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public y() {
        this.f46526a = new byte[8192];
        this.f46530e = true;
        this.f46529d = false;
    }

    public final void a() {
        int i10;
        y yVar = this.f46532g;
        if (yVar == this) {
            throw new IllegalStateException("cannot compact");
        }
        AbstractC6492s.f(yVar);
        if (yVar.f46530e) {
            int i11 = this.f46528c - this.f46527b;
            y yVar2 = this.f46532g;
            AbstractC6492s.f(yVar2);
            int i12 = 8192 - yVar2.f46528c;
            y yVar3 = this.f46532g;
            AbstractC6492s.f(yVar3);
            if (yVar3.f46529d) {
                i10 = 0;
            } else {
                y yVar4 = this.f46532g;
                AbstractC6492s.f(yVar4);
                i10 = yVar4.f46527b;
            }
            if (i11 > i12 + i10) {
                return;
            }
            y yVar5 = this.f46532g;
            AbstractC6492s.f(yVar5);
            g(yVar5, i11);
            b();
            z.b(this);
        }
    }

    public final y b() {
        y yVar = this.f46531f;
        if (yVar == this) {
            yVar = null;
        }
        y yVar2 = this.f46532g;
        AbstractC6492s.f(yVar2);
        yVar2.f46531f = this.f46531f;
        y yVar3 = this.f46531f;
        AbstractC6492s.f(yVar3);
        yVar3.f46532g = this.f46532g;
        this.f46531f = null;
        this.f46532g = null;
        return yVar;
    }

    public final y c(y segment) {
        AbstractC6492s.i(segment, "segment");
        segment.f46532g = this;
        segment.f46531f = this.f46531f;
        y yVar = this.f46531f;
        AbstractC6492s.f(yVar);
        yVar.f46532g = segment;
        this.f46531f = segment;
        return segment;
    }

    public final y d() {
        this.f46529d = true;
        return new y(this.f46526a, this.f46527b, this.f46528c, true, false);
    }

    public final y e(int i10) {
        y yVarC;
        if (i10 <= 0 || i10 > this.f46528c - this.f46527b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i10 >= 1024) {
            yVarC = d();
        } else {
            yVarC = z.c();
            byte[] bArr = this.f46526a;
            byte[] bArr2 = yVarC.f46526a;
            int i11 = this.f46527b;
            AbstractC3682n.n(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        yVarC.f46528c = yVarC.f46527b + i10;
        this.f46527b += i10;
        y yVar = this.f46532g;
        AbstractC6492s.f(yVar);
        yVar.c(yVarC);
        return yVarC;
    }

    public final y f() {
        byte[] bArr = this.f46526a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC6492s.h(bArrCopyOf, "copyOf(...)");
        return new y(bArrCopyOf, this.f46527b, this.f46528c, false, true);
    }

    public final void g(y sink, int i10) {
        AbstractC6492s.i(sink, "sink");
        if (!sink.f46530e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.f46528c;
        if (i11 + i10 > 8192) {
            if (sink.f46529d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f46527b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f46526a;
            AbstractC3682n.n(bArr, bArr, 0, i12, i11, 2, null);
            sink.f46528c -= sink.f46527b;
            sink.f46527b = 0;
        }
        byte[] bArr2 = this.f46526a;
        byte[] bArr3 = sink.f46526a;
        int i13 = sink.f46528c;
        int i14 = this.f46527b;
        AbstractC3682n.h(bArr2, bArr3, i13, i14, i14 + i10);
        sink.f46528c += i10;
        this.f46527b += i10;
    }

    public y(byte[] data, int i10, int i11, boolean z10, boolean z11) {
        AbstractC6492s.i(data, "data");
        this.f46526a = data;
        this.f46527b = i10;
        this.f46528c = i11;
        this.f46529d = z10;
        this.f46530e = z11;
    }
}
