package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    final byte[] f18190a;

    /* renamed from: b, reason: collision with root package name */
    int f18191b;

    /* renamed from: c, reason: collision with root package name */
    int f18192c;

    /* renamed from: d, reason: collision with root package name */
    boolean f18193d;

    /* renamed from: e, reason: collision with root package name */
    boolean f18194e;

    /* renamed from: f, reason: collision with root package name */
    o f18195f;

    /* renamed from: g, reason: collision with root package name */
    o f18196g;

    public o() {
        this.f18190a = new byte[8192];
        this.f18194e = true;
        this.f18193d = false;
    }

    public final o a(o oVar) {
        oVar.f18196g = this;
        oVar.f18195f = this.f18195f;
        this.f18195f.f18196g = oVar;
        this.f18195f = oVar;
        return oVar;
    }

    @Nullable
    public final o b() {
        o oVar = this.f18195f;
        o oVar2 = oVar != this ? oVar : null;
        o oVar3 = this.f18196g;
        oVar3.f18195f = oVar;
        this.f18195f.f18196g = oVar3;
        this.f18195f = null;
        this.f18196g = null;
        return oVar2;
    }

    public final o c() {
        this.f18193d = true;
        return new o(this.f18190a, this.f18191b, this.f18192c, true, false);
    }

    public o(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.f18190a = bArr;
        this.f18191b = i10;
        this.f18192c = i11;
        this.f18193d = z10;
        this.f18194e = z11;
    }

    public final o a(int i10) {
        o oVarA;
        if (i10 > 0 && i10 <= this.f18192c - this.f18191b) {
            if (i10 >= 1024) {
                oVarA = c();
            } else {
                oVarA = p.a();
                System.arraycopy(this.f18190a, this.f18191b, oVarA.f18190a, 0, i10);
            }
            oVarA.f18192c = oVarA.f18191b + i10;
            this.f18191b += i10;
            this.f18196g.a(oVarA);
            return oVarA;
        }
        throw new IllegalArgumentException();
    }

    public final void a() {
        o oVar = this.f18196g;
        if (oVar != this) {
            if (oVar.f18194e) {
                int i10 = this.f18192c - this.f18191b;
                if (i10 > (8192 - oVar.f18192c) + (oVar.f18193d ? 0 : oVar.f18191b)) {
                    return;
                }
                a(oVar, i10);
                b();
                p.a(this);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(o oVar, int i10) {
        if (oVar.f18194e) {
            int i11 = oVar.f18192c;
            int i12 = i11 + i10;
            if (i12 > 8192) {
                if (!oVar.f18193d) {
                    int i13 = oVar.f18191b;
                    if (i12 - i13 <= 8192) {
                        byte[] bArr = oVar.f18190a;
                        System.arraycopy(bArr, i13, bArr, 0, i11 - i13);
                        oVar.f18192c -= oVar.f18191b;
                        oVar.f18191b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f18190a, this.f18191b, oVar.f18190a, oVar.f18192c, i10);
            oVar.f18192c += i10;
            this.f18191b += i10;
            return;
        }
        throw new IllegalArgumentException();
    }
}
