package w6;

import a5.b0;
import a5.d0;

/* loaded from: classes.dex */
public final class t implements u5.f {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f24360a;

    /* renamed from: b, reason: collision with root package name */
    public final a5.v f24361b = new a5.v();

    /* renamed from: c, reason: collision with root package name */
    public final int f24362c;

    public t(int i10, b0 b0Var) {
        this.f24362c = i10;
        this.f24360a = b0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r13 == r16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ae, code lost:
    
        return new u5.e(-2, r13, r5 + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
    
        return u5.e.f23275d;
     */
    @Override // u5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final u5.e a(u5.l r19, long r20) {
        /*
            r18 = this;
            r0 = r18
            long r5 = r19.getPosition()
            r1 = 112800(0x1b8a0, float:1.58066E-40)
            long r1 = (long) r1
            long r3 = r19.getLength()
            long r3 = r3 - r5
            long r1 = java.lang.Math.min(r1, r3)
            int r1 = (int) r1
            a5.v r2 = r0.f24361b
            r2.B(r1)
            byte[] r3 = r2.f165a
            r4 = 0
            r7 = r19
            r7.p(r3, r4, r1)
            int r1 = r2.f167c
            r3 = -1
            r9 = r3
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L2b:
            int r11 = r2.a()
            r12 = 188(0xbc, float:2.63E-43)
            if (r11 < r12) goto L9d
            byte[] r11 = r2.f165a
            int r12 = r2.f166b
        L37:
            if (r12 >= r1) goto L47
            r15 = r11[r12]
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 71
            if (r15 == r7) goto L4c
            int r12 = r12 + 1
            goto L37
        L47:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4c:
            int r7 = r12 + 188
            if (r7 <= r1) goto L51
            goto La2
        L51:
            int r3 = r0.f24362c
            long r3 = com.google.android.gms.internal.measurement.y3.J(r2, r12, r3)
            int r8 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r8 == 0) goto L98
            a5.b0 r8 = r0.f24360a
            long r3 = r8.b(r3)
            int r8 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r8 <= 0) goto L7e
            int r1 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r1 != 0) goto L70
            u5.e r1 = new u5.e
            r2 = -1
            r1.<init>(r2, r3, r5)
            return r1
        L70:
            long r15 = r5 + r9
            u5.e r11 = new u5.e
            r12 = 0
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11.<init>(r12, r13, r15)
            return r11
        L7e:
            r8 = 100000(0x186a0, double:4.94066E-319)
            long r8 = r8 + r3
            int r8 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r8 <= 0) goto L95
            long r1 = (long) r12
            long r11 = r5 + r1
            u5.e r7 = new u5.e
            r8 = 0
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.<init>(r8, r9, r11)
            return r7
        L95:
            long r8 = (long) r12
            r13 = r3
            r9 = r8
        L98:
            r2.E(r7)
            long r3 = (long) r7
            goto L2b
        L9d:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        La2:
            int r1 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r1 == 0) goto Laf
            long r15 = r5 + r3
            u5.e r11 = new u5.e
            r12 = -2
            r11.<init>(r12, r13, r15)
            return r11
        Laf:
            u5.e r1 = u5.e.f23275d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.t.a(u5.l, long):u5.e");
    }

    @Override // u5.f
    public final void b() {
        byte[] bArr = d0.f109e;
        a5.v vVar = this.f24361b;
        vVar.getClass();
        vVar.C(bArr.length, bArr);
    }
}
