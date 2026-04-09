package g0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements b, d {

    /* renamed from: a, reason: collision with root package name */
    public final float f24104a;

    /* renamed from: b, reason: collision with root package name */
    public final bl.v f24105b;

    /* renamed from: c, reason: collision with root package name */
    public final float f24106c;

    public c(float f10, bl.v vVar) {
        this.f24104a = f10;
        this.f24105b = vVar;
        this.f24106c = f10;
    }

    @Override // g0.b, g0.d
    public final float a() {
        return this.f24106c;
    }

    @Override // g0.d
    public final void b(int i4, g2.l0 l0Var, int[] iArr, int[] iArr2) {
        c(l0Var, i4, iArr, d3.l.f21966a, iArr2);
    }

    @Override // g0.b
    public final void c(g2.l0 l0Var, int i4, int[] iArr, d3.l lVar, int[] iArr2) {
        int i10;
        int iMin;
        if (iArr.length == 0) {
            return;
        }
        int iQ = l0Var.Q(this.f24104a);
        boolean z3 = lVar == d3.l.f21967b;
        l lVar2 = e.f24108a;
        if (z3) {
            i10 = 0;
            iMin = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i11 = iArr[length];
                int iMin2 = Math.min(i10, i4 - i11);
                iArr2[length] = iMin2;
                iMin = Math.min(iQ, (i4 - iMin2) - i11);
                i10 = iArr2[length] + i11 + iMin;
            }
        } else {
            int length2 = iArr.length;
            int i12 = 0;
            i10 = 0;
            iMin = 0;
            int i13 = 0;
            while (i12 < length2) {
                int i14 = iArr[i12];
                int iMin3 = Math.min(i10, i4 - i14);
                iArr2[i13] = iMin3;
                int iMin4 = Math.min(iQ, (i4 - iMin3) - i14);
                int i15 = iArr2[i13] + i14 + iMin4;
                i12++;
                iMin = iMin4;
                i10 = i15;
                i13++;
            }
        }
        int i16 = i10 - iMin;
        if (i16 < i4) {
            int iIntValue = ((Number) this.f24105b.invoke(Integer.valueOf(i4 - i16), lVar)).intValue();
            int length3 = iArr2.length;
            for (int i17 = 0; i17 < length3; i17++) {
                iArr2[i17] = iArr2[i17] + iIntValue;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return d3.f.b(this.f24104a, cVar.f24104a) && this.f24105b.equals(cVar.f24105b);
    }

    public final int hashCode() {
        return this.f24105b.hashCode() + (((Float.floatToIntBits(this.f24104a) * 31) + 1231) * 31);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) d3.f.c(this.f24104a)) + ", " + this.f24105b + ')';
    }
}
