package m;

import java.util.ArrayList;
import m.f;

/* loaded from: classes.dex */
public class b extends j {
    private int x0 = 0;
    private ArrayList<m> y0 = new ArrayList<>(4);
    private boolean z0 = true;

    public void K0(boolean z2) {
        this.z0 = z2;
    }

    public void L0(int i2) {
        this.x0 = i2;
    }

    @Override // m.f
    public void S() {
        super.S();
        this.y0.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051 A[PHI: r9
  0x0051: PHI (r9v3 float) = (r9v2 float), (r9v4 float) binds: [B:27:0x004f, B:24:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    @Override // m.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void U() {
        /*
            r11 = this;
            int r0 = r11.x0
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L20
            if (r0 == r4) goto L18
            if (r0 == r3) goto L15
            if (r0 == r2) goto L12
            return
        L12:
            m.e r0 = r11.f2918x
            goto L1a
        L15:
            m.e r0 = r11.f2916v
            goto L22
        L18:
            m.e r0 = r11.f2917w
        L1a:
            m.m r0 = r0.f()
            r1 = 0
            goto L26
        L20:
            m.e r0 = r11.f2915u
        L22:
            m.m r0 = r0.f()
        L26:
            java.util.ArrayList<m.m> r5 = r11.y0
            int r5 = r5.size()
            r6 = 0
            r7 = 0
        L2e:
            if (r7 >= r5) goto L58
            java.util.ArrayList<m.m> r8 = r11.y0
            java.lang.Object r8 = r8.get(r7)
            m.m r8 = (m.m) r8
            int r9 = r8.f2956b
            if (r9 == r4) goto L3d
            return
        L3d:
            int r9 = r11.x0
            if (r9 == 0) goto L4b
            if (r9 != r3) goto L44
            goto L4b
        L44:
            float r9 = r8.f2946h
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 <= 0) goto L55
            goto L51
        L4b:
            float r9 = r8.f2946h
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 >= 0) goto L55
        L51:
            m.m r1 = r8.f2945g
            r6 = r1
            r1 = r9
        L55:
            int r7 = r7 + 1
            goto L2e
        L58:
            l.e.x()
            r0.f2945g = r6
            r0.f2946h = r1
            r0.b()
            int r0 = r11.x0
            if (r0 == 0) goto L76
            if (r0 == r4) goto L73
            if (r0 == r3) goto L70
            if (r0 == r2) goto L6d
            return
        L6d:
            m.e r0 = r11.f2916v
            goto L78
        L70:
            m.e r0 = r11.f2918x
            goto L78
        L73:
            m.e r0 = r11.f2915u
            goto L78
        L76:
            m.e r0 = r11.f2917w
        L78:
            m.m r0 = r0.f()
            r0.l(r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m.b.U():void");
    }

    @Override // m.f
    public void b(l.e eVar) {
        e[] eVarArr;
        boolean z2;
        l.i iVar;
        e eVar2;
        int i2;
        int i3;
        e[] eVarArr2 = this.C;
        eVarArr2[0] = this.f2915u;
        eVarArr2[2] = this.f2916v;
        eVarArr2[1] = this.f2917w;
        eVarArr2[3] = this.f2918x;
        int i4 = 0;
        while (true) {
            eVarArr = this.C;
            if (i4 >= eVarArr.length) {
                break;
            }
            eVarArr[i4].f2859j = eVar.r(eVarArr[i4]);
            i4++;
        }
        int i5 = this.x0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        e eVar3 = eVarArr[i5];
        for (int i6 = 0; i6 < this.w0; i6++) {
            f fVar = this.v0[i6];
            if ((this.z0 || fVar.c()) && ((((i2 = this.x0) == 0 || i2 == 1) && fVar.s() == f.b.MATCH_CONSTRAINT) || (((i3 = this.x0) == 2 || i3 == 3) && fVar.B() == f.b.MATCH_CONSTRAINT))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        int i7 = this.x0;
        if (i7 == 0 || i7 == 1 ? u().s() == f.b.WRAP_CONTENT : u().B() == f.b.WRAP_CONTENT) {
            z2 = false;
        }
        for (int i8 = 0; i8 < this.w0; i8++) {
            f fVar2 = this.v0[i8];
            if (this.z0 || fVar2.c()) {
                l.i iVarR = eVar.r(fVar2.C[this.x0]);
                e[] eVarArr3 = fVar2.C;
                int i9 = this.x0;
                eVarArr3[i9].f2859j = iVarR;
                if (i9 == 0 || i9 == 2) {
                    eVar.j(eVar3.f2859j, iVarR, z2);
                } else {
                    eVar.h(eVar3.f2859j, iVarR, z2);
                }
            }
        }
        int i10 = this.x0;
        if (i10 == 0) {
            eVar.e(this.f2917w.f2859j, this.f2915u.f2859j, 0, 6);
            if (z2) {
                return;
            }
            iVar = this.f2915u.f2859j;
            eVar2 = this.F.f2917w;
        } else if (i10 == 1) {
            eVar.e(this.f2915u.f2859j, this.f2917w.f2859j, 0, 6);
            if (z2) {
                return;
            }
            iVar = this.f2915u.f2859j;
            eVar2 = this.F.f2915u;
        } else if (i10 == 2) {
            eVar.e(this.f2918x.f2859j, this.f2916v.f2859j, 0, 6);
            if (z2) {
                return;
            }
            iVar = this.f2916v.f2859j;
            eVar2 = this.F.f2918x;
        } else {
            if (i10 != 3) {
                return;
            }
            eVar.e(this.f2916v.f2859j, this.f2918x.f2859j, 0, 6);
            if (z2) {
                return;
            }
            iVar = this.f2916v.f2859j;
            eVar2 = this.F.f2916v;
        }
        eVar.e(iVar, eVar2.f2859j, 0, 5);
    }

    @Override // m.f
    public boolean c() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094 A[SYNTHETIC] */
    @Override // m.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(int r8) {
        /*
            r7 = this;
            m.f r8 = r7.F
            if (r8 != 0) goto L5
            return
        L5:
            m.g r8 = (m.g) r8
            r0 = 2
            boolean r8 = r8.X0(r0)
            if (r8 != 0) goto Lf
            return
        Lf:
            int r8 = r7.x0
            r1 = 3
            r2 = 1
            if (r8 == 0) goto L25
            if (r8 == r2) goto L22
            if (r8 == r0) goto L1f
            if (r8 == r1) goto L1c
            return
        L1c:
            m.e r8 = r7.f2918x
            goto L27
        L1f:
            m.e r8 = r7.f2916v
            goto L27
        L22:
            m.e r8 = r7.f2917w
            goto L27
        L25:
            m.e r8 = r7.f2915u
        L27:
            m.m r8 = r8.f()
            r3 = 5
            r8.p(r3)
            int r3 = r7.x0
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L44
            if (r3 != r2) goto L38
            goto L44
        L38:
            m.e r3 = r7.f2915u
            m.m r3 = r3.f()
            r3.l(r5, r4)
            m.e r3 = r7.f2917w
            goto L4f
        L44:
            m.e r3 = r7.f2916v
            m.m r3 = r3.f()
            r3.l(r5, r4)
            m.e r3 = r7.f2918x
        L4f:
            m.m r3 = r3.f()
            r3.l(r5, r4)
            java.util.ArrayList<m.m> r3 = r7.y0
            r3.clear()
            r3 = 0
        L5c:
            int r4 = r7.w0
            if (r3 >= r4) goto L97
            m.f[] r4 = r7.v0
            r4 = r4[r3]
            boolean r6 = r7.z0
            if (r6 != 0) goto L6f
            boolean r6 = r4.c()
            if (r6 != 0) goto L6f
            goto L94
        L6f:
            int r6 = r7.x0
            if (r6 == 0) goto L84
            if (r6 == r2) goto L81
            if (r6 == r0) goto L7e
            if (r6 == r1) goto L7b
            r4 = r5
            goto L8a
        L7b:
            m.e r4 = r4.f2918x
            goto L86
        L7e:
            m.e r4 = r4.f2916v
            goto L86
        L81:
            m.e r4 = r4.f2917w
            goto L86
        L84:
            m.e r4 = r4.f2915u
        L86:
            m.m r4 = r4.f()
        L8a:
            if (r4 == 0) goto L94
            java.util.ArrayList<m.m> r6 = r7.y0
            r6.add(r4)
            r4.a(r8)
        L94:
            int r3 = r3 + 1
            goto L5c
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m.b.d(int):void");
    }
}
