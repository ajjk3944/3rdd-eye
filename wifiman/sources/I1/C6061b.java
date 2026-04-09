package i1;

import c1.C4188d;
import j1.e;
import j1.f;
import j1.l;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6061b extends l {

    /* renamed from: Z0, reason: collision with root package name */
    f f48775Z0;

    /* renamed from: a1, reason: collision with root package name */
    private e[] f48776a1;

    /* renamed from: c1, reason: collision with root package name */
    private int f48778c1;

    /* renamed from: d1, reason: collision with root package name */
    private int f48779d1;

    /* renamed from: e1, reason: collision with root package name */
    private int f48780e1;

    /* renamed from: f1, reason: collision with root package name */
    private int f48781f1;

    /* renamed from: g1, reason: collision with root package name */
    private float f48782g1;

    /* renamed from: h1, reason: collision with root package name */
    private float f48783h1;

    /* renamed from: i1, reason: collision with root package name */
    private String f48784i1;

    /* renamed from: j1, reason: collision with root package name */
    private String f48785j1;

    /* renamed from: k1, reason: collision with root package name */
    private String f48786k1;

    /* renamed from: l1, reason: collision with root package name */
    private String f48787l1;

    /* renamed from: m1, reason: collision with root package name */
    private int f48788m1;

    /* renamed from: o1, reason: collision with root package name */
    private boolean[][] f48790o1;

    /* renamed from: q1, reason: collision with root package name */
    private int[][] f48792q1;

    /* renamed from: r1, reason: collision with root package name */
    private int f48793r1;

    /* renamed from: s1, reason: collision with root package name */
    private int[][] f48794s1;

    /* renamed from: b1, reason: collision with root package name */
    private boolean f48777b1 = false;

    /* renamed from: n1, reason: collision with root package name */
    private int f48789n1 = 0;

    /* renamed from: p1, reason: collision with root package name */
    Set f48791p1 = new HashSet();

    /* renamed from: t1, reason: collision with root package name */
    private int f48795t1 = 0;

    public C6061b() {
        f2();
        J1();
    }

    private void A1(e eVar) {
        eVar.S0(-1.0f);
        eVar.f49880O.q();
        eVar.f49882Q.q();
        eVar.f49883R.q();
    }

    private void B1(e eVar, int i10, int i11, int i12, int i13) {
        eVar.f49879N.a(this.f48776a1[i11].f49879N, 0);
        eVar.f49880O.a(this.f48776a1[i10].f49880O, 0);
        eVar.f49881P.a(this.f48776a1[(i11 + i13) - 1].f49881P, 0);
        eVar.f49882Q.a(this.f48776a1[(i10 + i12) - 1].f49882Q, 0);
    }

    private void C1() {
        int iMax = Math.max(this.f48778c1, this.f48780e1);
        e[] eVarArr = this.f48776a1;
        int i10 = 0;
        if (eVarArr == null) {
            this.f48776a1 = new e[iMax];
            while (true) {
                e[] eVarArr2 = this.f48776a1;
                if (i10 >= eVarArr2.length) {
                    return;
                }
                eVarArr2[i10] = P1();
                i10++;
            }
        } else {
            if (iMax == eVarArr.length) {
                return;
            }
            e[] eVarArr3 = new e[iMax];
            while (i10 < iMax) {
                e[] eVarArr4 = this.f48776a1;
                if (i10 < eVarArr4.length) {
                    eVarArr3[i10] = eVarArr4[i10];
                } else {
                    eVarArr3[i10] = P1();
                }
                i10++;
            }
            while (true) {
                e[] eVarArr5 = this.f48776a1;
                if (iMax >= eVarArr5.length) {
                    this.f48776a1 = eVarArr3;
                    return;
                } else {
                    this.f48775Z0.e1(eVarArr5[iMax]);
                    iMax++;
                }
            }
        }
    }

    private void D1(boolean z10) {
        int[][] iArrQ1;
        int[][] iArrQ12;
        if (z10) {
            for (int i10 = 0; i10 < this.f48790o1.length; i10++) {
                int i11 = 0;
                while (true) {
                    boolean[][] zArr = this.f48790o1;
                    if (i11 < zArr[0].length) {
                        zArr[i10][i11] = true;
                        i11++;
                    }
                }
            }
            for (int i12 = 0; i12 < this.f48792q1.length; i12++) {
                int i13 = 0;
                while (true) {
                    int[][] iArr = this.f48792q1;
                    if (i13 < iArr[0].length) {
                        iArr[i12][i13] = -1;
                        i13++;
                    }
                }
            }
        }
        this.f48789n1 = 0;
        String str = this.f48787l1;
        if (str != null && !str.trim().isEmpty() && (iArrQ12 = Q1(this.f48787l1, false)) != null) {
            H1(iArrQ12);
        }
        String str2 = this.f48786k1;
        if (str2 == null || str2.trim().isEmpty() || (iArrQ1 = Q1(this.f48786k1, true)) == null) {
            return;
        }
        I1(iArrQ1);
    }

    private int E1(int i10) {
        return this.f48788m1 == 1 ? i10 / this.f48778c1 : i10 % this.f48780e1;
    }

    private int F1() {
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            i10 = this.f48789n1;
            if (i10 >= this.f48778c1 * this.f48780e1) {
                return -1;
            }
            int iG1 = G1(i10);
            int iE1 = E1(this.f48789n1);
            boolean[] zArr = this.f48790o1[iG1];
            if (zArr[iE1]) {
                zArr[iE1] = false;
                z10 = true;
            }
            this.f48789n1++;
        }
        return i10;
    }

    private int G1(int i10) {
        return this.f48788m1 == 1 ? i10 % this.f48778c1 : i10 / this.f48780e1;
    }

    private void H1(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!L1(G1(iArr2[0]), E1(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    private void I1(int[][] iArr) {
        if (M1()) {
            return;
        }
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int iG1 = G1(iArr[i10][0]);
            int iE1 = E1(iArr[i10][0]);
            int[] iArr2 = iArr[i10];
            if (!L1(iG1, iE1, iArr2[1], iArr2[2])) {
                return;
            }
            e eVar = this.f50027K0[i10];
            int[] iArr3 = iArr[i10];
            B1(eVar, iG1, iE1, iArr3[1], iArr3[2]);
            this.f48791p1.add(this.f50027K0[i10].f49920o);
        }
    }

    private void J1() {
        boolean[][] zArr;
        int[][] iArr = this.f48792q1;
        boolean z10 = false;
        if (iArr != null && iArr.length == this.f50028L0 && (zArr = this.f48790o1) != null && zArr.length == this.f48778c1 && zArr[0].length == this.f48780e1) {
            z10 = true;
        }
        if (!z10) {
            K1();
        }
        D1(z10);
    }

    private void K1() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.f48778c1, this.f48780e1);
        this.f48790o1 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i10 = this.f50028L0;
        if (i10 > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, 4);
            this.f48792q1 = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    private boolean L1(int i10, int i11, int i12, int i13) {
        for (int i14 = i10; i14 < i10 + i12; i14++) {
            for (int i15 = i11; i15 < i11 + i13; i15++) {
                boolean[][] zArr = this.f48790o1;
                if (i14 < zArr.length && i15 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i14];
                    if (zArr2[i15]) {
                        zArr2[i15] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean M1() {
        return (this.f48793r1 & 2) > 0;
    }

    private boolean N1() {
        return (this.f48793r1 & 1) > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int O1(String str, String str2) {
        return Integer.parseInt(str.split(":")[0]) - Integer.parseInt(str2.split(":")[0]);
    }

    private e P1() {
        e eVar = new e();
        e.b[] bVarArr = eVar.f49890Y;
        e.b bVar = e.b.MATCH_CONSTRAINT;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        eVar.f49920o = String.valueOf(eVar.hashCode());
        return eVar;
    }

    private int[][] Q1(String str, boolean z10) {
        try {
            String[] strArrSplit = str.split(",");
            Arrays.sort(strArrSplit, new Comparator() { // from class: i1.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C6061b.O1((String) obj, (String) obj2);
                }
            });
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
            if (this.f48778c1 == 1 || this.f48780e1 == 1) {
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < strArrSplit.length; i12++) {
                    String[] strArrSplit2 = strArrSplit[i12].trim().split(":");
                    iArr[i12][0] = Integer.parseInt(strArrSplit2[0]);
                    int[] iArr2 = iArr[i12];
                    iArr2[1] = 1;
                    iArr2[2] = 1;
                    if (this.f48780e1 == 1) {
                        iArr2[1] = Integer.parseInt(strArrSplit2[1]);
                        i10 += iArr[i12][1];
                        if (z10) {
                            i10--;
                        }
                    }
                    if (this.f48778c1 == 1) {
                        iArr[i12][2] = Integer.parseInt(strArrSplit2[1]);
                        i11 += iArr[i12][2];
                        if (z10) {
                            i11--;
                        }
                    }
                }
                if (i10 != 0 && !this.f48777b1) {
                    a2(this.f48778c1 + i10);
                }
                if (i11 != 0 && !this.f48777b1) {
                    V1(this.f48780e1 + i11);
                }
                this.f48777b1 = true;
            } else {
                for (int i13 = 0; i13 < strArrSplit.length; i13++) {
                    String[] strArrSplit3 = strArrSplit[i13].trim().split(":");
                    String[] strArrSplit4 = strArrSplit3[1].split("x");
                    iArr[i13][0] = Integer.parseInt(strArrSplit3[0]);
                    if (N1()) {
                        iArr[i13][1] = Integer.parseInt(strArrSplit4[1]);
                        iArr[i13][2] = Integer.parseInt(strArrSplit4[0]);
                    } else {
                        iArr[i13][1] = Integer.parseInt(strArrSplit4[0]);
                        iArr[i13][2] = Integer.parseInt(strArrSplit4[1]);
                    }
                }
            }
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    private float[] R1(int i10, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        float[] fArr = new float[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 < strArrSplit.length) {
                try {
                    fArr[i11] = Float.parseFloat(strArrSplit[i11]);
                } catch (Exception e10) {
                    System.err.println("Error parsing `" + strArrSplit[i11] + "`: " + e10.getMessage());
                    fArr[i11] = 1.0f;
                }
            } else {
                fArr[i11] = 1.0f;
            }
        }
        return fArr;
    }

    private void S1() {
        int i10;
        int iMax = Math.max(this.f48778c1, this.f48780e1);
        e eVar = this.f48776a1[0];
        float[] fArrR1 = R1(this.f48780e1, this.f48785j1);
        if (this.f48780e1 == 1) {
            z1(eVar);
            eVar.f49879N.a(this.f49879N, 0);
            eVar.f49881P.a(this.f49881P, 0);
            return;
        }
        int i11 = 0;
        while (true) {
            i10 = this.f48780e1;
            if (i11 >= i10) {
                break;
            }
            e eVar2 = this.f48776a1[i11];
            z1(eVar2);
            if (fArrR1 != null) {
                eVar2.F0(fArrR1[i11]);
            }
            if (i11 > 0) {
                eVar2.f49879N.a(this.f48776a1[i11 - 1].f49881P, 0);
            } else {
                eVar2.f49879N.a(this.f49879N, 0);
            }
            if (i11 < this.f48780e1 - 1) {
                eVar2.f49881P.a(this.f48776a1[i11 + 1].f49879N, 0);
            } else {
                eVar2.f49881P.a(this.f49881P, 0);
            }
            if (i11 > 0) {
                eVar2.f49879N.f49853g = (int) this.f48782g1;
            }
            i11++;
        }
        while (i10 < iMax) {
            e eVar3 = this.f48776a1[i10];
            z1(eVar3);
            eVar3.f49879N.a(this.f49879N, 0);
            eVar3.f49881P.a(this.f49881P, 0);
            i10++;
        }
    }

    private void T1() {
        int i10;
        int iMax = Math.max(this.f48778c1, this.f48780e1);
        e eVar = this.f48776a1[0];
        float[] fArrR1 = R1(this.f48778c1, this.f48784i1);
        if (this.f48778c1 == 1) {
            A1(eVar);
            eVar.f49880O.a(this.f49880O, 0);
            eVar.f49882Q.a(this.f49882Q, 0);
            return;
        }
        int i11 = 0;
        while (true) {
            i10 = this.f48778c1;
            if (i11 >= i10) {
                break;
            }
            e eVar2 = this.f48776a1[i11];
            A1(eVar2);
            if (fArrR1 != null) {
                eVar2.S0(fArrR1[i11]);
            }
            if (i11 > 0) {
                eVar2.f49880O.a(this.f48776a1[i11 - 1].f49882Q, 0);
            } else {
                eVar2.f49880O.a(this.f49880O, 0);
            }
            if (i11 < this.f48778c1 - 1) {
                eVar2.f49882Q.a(this.f48776a1[i11 + 1].f49880O, 0);
            } else {
                eVar2.f49882Q.a(this.f49882Q, 0);
            }
            if (i11 > 0) {
                eVar2.f49880O.f49853g = (int) this.f48783h1;
            }
            i11++;
        }
        while (i10 < iMax) {
            e eVar3 = this.f48776a1[i10];
            A1(eVar3);
            eVar3.f49880O.a(this.f49880O, 0);
            eVar3.f49882Q.a(this.f49882Q, 0);
            i10++;
        }
    }

    private void e2(boolean z10) {
        int[][] iArrQ1;
        if (this.f48778c1 < 1 || this.f48780e1 < 1) {
            return;
        }
        if (z10) {
            for (int i10 = 0; i10 < this.f48790o1.length; i10++) {
                int i11 = 0;
                while (true) {
                    boolean[][] zArr = this.f48790o1;
                    if (i11 < zArr[0].length) {
                        zArr[i10][i11] = true;
                        i11++;
                    }
                }
            }
            this.f48791p1.clear();
        }
        this.f48789n1 = 0;
        String str = this.f48787l1;
        if (str != null && !str.trim().isEmpty() && (iArrQ1 = Q1(this.f48787l1, false)) != null) {
            H1(iArrQ1);
        }
        String str2 = this.f48786k1;
        if (str2 != null && !str2.trim().isEmpty()) {
            this.f48794s1 = Q1(this.f48786k1, true);
        }
        C1();
        int[][] iArr = this.f48794s1;
        if (iArr != null) {
            I1(iArr);
        }
    }

    private void f2() {
        int i10;
        int i11 = this.f48779d1;
        if (i11 != 0 && (i10 = this.f48781f1) != 0) {
            this.f48778c1 = i11;
            this.f48780e1 = i10;
            return;
        }
        int i12 = this.f48781f1;
        if (i12 > 0) {
            this.f48780e1 = i12;
            this.f48778c1 = ((this.f50028L0 + i12) - 1) / i12;
        } else if (i11 > 0) {
            this.f48778c1 = i11;
            this.f48780e1 = ((this.f50028L0 + i11) - 1) / i11;
        } else {
            int iSqrt = (int) (Math.sqrt(this.f50028L0) + 1.5d);
            this.f48778c1 = iSqrt;
            this.f48780e1 = ((this.f50028L0 + iSqrt) - 1) / iSqrt;
        }
    }

    private void x1() {
        T1();
        S1();
        y1();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void y1() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r10.f50028L0
            if (r1 >= r2) goto L73
            java.util.Set r2 = r10.f48791p1
            j1.e[] r3 = r10.f50027K0
            r3 = r3[r1]
            java.lang.String r3 = r3.f49920o
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L15
            goto L70
        L15:
            int r2 = r10.F1()
            int r5 = r10.G1(r2)
            int r6 = r10.E1(r2)
            r3 = -1
            if (r2 != r3) goto L25
            return
        L25:
            boolean r3 = r10.M1()
            if (r3 == 0) goto L66
            int[][] r3 = r10.f48794s1
            if (r3 == 0) goto L66
            int r4 = r10.f48795t1
            int r7 = r3.length
            if (r4 >= r7) goto L66
            r3 = r3[r4]
            r4 = r3[r0]
            if (r4 != r2) goto L66
            boolean[][] r2 = r10.f48790o1
            r2 = r2[r5]
            r9 = 1
            r2[r6] = r9
            r2 = r3[r9]
            r4 = 2
            r3 = r3[r4]
            boolean r2 = r10.L1(r5, r6, r2, r3)
            if (r2 != 0) goto L4d
            goto L70
        L4d:
            j1.e[] r2 = r10.f50027K0
            r2 = r2[r1]
            int[][] r3 = r10.f48794s1
            int r7 = r10.f48795t1
            r3 = r3[r7]
            r7 = r3[r9]
            r8 = r3[r4]
            r3 = r10
            r4 = r2
            r3.B1(r4, r5, r6, r7, r8)
            int r2 = r10.f48795t1
            int r2 = r2 + r9
            r10.f48795t1 = r2
            goto L70
        L66:
            j1.e[] r2 = r10.f50027K0
            r4 = r2[r1]
            r7 = 1
            r8 = 1
            r3 = r10
            r3.B1(r4, r5, r6, r7, r8)
        L70:
            int r1 = r1 + 1
            goto L2
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C6061b.y1():void");
    }

    private void z1(e eVar) {
        eVar.F0(-1.0f);
        eVar.f49879N.q();
        eVar.f49881P.q();
    }

    public void U1(String str) {
        String str2 = this.f48785j1;
        if (str2 == null || !str2.equals(str)) {
            this.f48785j1 = str;
        }
    }

    public void V1(int i10) {
        if (i10 <= 50 && this.f48781f1 != i10) {
            this.f48781f1 = i10;
            f2();
            K1();
        }
    }

    public void W1(int i10) {
        this.f48793r1 = i10;
    }

    public void X1(float f10) {
        if (f10 >= 0.0f && this.f48782g1 != f10) {
            this.f48782g1 = f10;
        }
    }

    public void Y1(int i10) {
        if ((i10 == 0 || i10 == 1) && this.f48788m1 != i10) {
            this.f48788m1 = i10;
        }
    }

    public void Z1(String str) {
        String str2 = this.f48784i1;
        if (str2 == null || !str2.equals(str)) {
            this.f48784i1 = str;
        }
    }

    public void a2(int i10) {
        if (i10 <= 50 && this.f48779d1 != i10) {
            this.f48779d1 = i10;
            f2();
            K1();
        }
    }

    public void b2(String str) {
        String str2 = this.f48787l1;
        if (str2 == null || !str2.equals(str)) {
            this.f48777b1 = false;
            this.f48787l1 = str;
        }
    }

    public void c2(CharSequence charSequence) {
        String str = this.f48786k1;
        if (str == null || !str.equals(charSequence.toString())) {
            this.f48777b1 = false;
            this.f48786k1 = charSequence.toString();
        }
    }

    @Override // j1.e
    public void d(C4188d c4188d, boolean z10) {
        super.d(c4188d, z10);
        x1();
    }

    public void d2(float f10) {
        if (f10 >= 0.0f && this.f48783h1 != f10) {
            this.f48783h1 = f10;
        }
    }

    @Override // j1.l
    public void k1(int i10, int i11, int i12, int i13) {
        super.k1(i10, i11, i12, i13);
        this.f48775Z0 = (f) F();
        e2(false);
        this.f48775Z0.b1(this.f48776a1);
    }
}
