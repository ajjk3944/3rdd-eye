package bj;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: bj.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4127j extends C4125h {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f33449c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4127j(o writer, boolean z10) {
        super(writer);
        AbstractC6492s.i(writer, "writer");
        this.f33449c = z10;
    }

    @Override // bj.C4125h
    public void e(byte b10) {
        boolean z10 = this.f33449c;
        String strG = Yg.A.g(Yg.A.b(b10));
        if (z10) {
            n(strG);
        } else {
            k(strG);
        }
    }

    @Override // bj.C4125h
    public void i(int i10) {
        boolean z10 = this.f33449c;
        String unsignedString = Integer.toUnsignedString(Yg.C.b(i10));
        if (z10) {
            n(unsignedString);
        } else {
            k(unsignedString);
        }
    }

    @Override // bj.C4125h
    public void j(long j10) {
        boolean z10 = this.f33449c;
        String unsignedString = Long.toUnsignedString(Yg.E.b(j10));
        if (z10) {
            n(unsignedString);
        } else {
            k(unsignedString);
        }
    }

    @Override // bj.C4125h
    public void l(short s10) {
        boolean z10 = this.f33449c;
        String strG = Yg.H.g(Yg.H.b(s10));
        if (z10) {
            n(strG);
        } else {
            k(strG);
        }
    }
}
