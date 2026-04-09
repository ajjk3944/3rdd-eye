package o6;

import a5.v;
import fb.j;
import gb.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends j {

    /* renamed from: h, reason: collision with root package name */
    public final v f19114h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19115i;
    public final int j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final long f19116l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f19117m;

    /* renamed from: n, reason: collision with root package name */
    public b f19118n;

    /* renamed from: o, reason: collision with root package name */
    public List f19119o;

    /* renamed from: p, reason: collision with root package name */
    public List f19120p;

    /* renamed from: q, reason: collision with root package name */
    public int f19121q;

    /* renamed from: r, reason: collision with root package name */
    public int f19122r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f19123s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f19124t;

    /* renamed from: u, reason: collision with root package name */
    public byte f19125u;

    /* renamed from: v, reason: collision with root package name */
    public byte f19126v;

    /* renamed from: w, reason: collision with root package name */
    public int f19127w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f19128x;

    /* renamed from: y, reason: collision with root package name */
    public long f19129y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f19113z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    public c(String str, int i10) {
        super(1);
        this.f19114h = new v();
        this.f19117m = new ArrayList();
        this.f19118n = new b(0, 4);
        this.f19127w = 0;
        this.f19116l = 16000000L;
        this.f19115i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.k = 0;
            this.j = 0;
        } else if (i10 == 2) {
            this.k = 1;
            this.j = 0;
        } else if (i10 == 3) {
            this.k = 0;
            this.j = 1;
        } else if (i10 != 4) {
            a5.a.B("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.k = 0;
            this.j = 0;
        } else {
            this.k = 1;
            this.j = 1;
        }
        q(0);
        p();
        this.f19128x = true;
        this.f19129y = -9223372036854775807L;
    }

    @Override // fb.j, z9.a, c5.d
    public final void flush() {
        super.flush();
        this.f19119o = null;
        this.f19120p = null;
        q(0);
        this.f19122r = 4;
        this.f19118n.f19112h = 4;
        p();
        this.f19123s = false;
        this.f19124t = false;
        this.f19125u = (byte) 0;
        this.f19126v = (byte) 0;
        this.f19127w = 0;
        this.f19128x = true;
        this.f19129y = -9223372036854775807L;
    }

    @Override // fb.j
    public final k g() {
        List list = this.f19119o;
        this.f19120p = list;
        list.getClass();
        return new k(1, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6 A[FALL_THROUGH] */
    @Override // fb.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(o6.g r15) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.c.i(o6.g):void");
    }

    @Override // fb.j, z9.a
    /* renamed from: k */
    public final n6.a b() {
        n6.a aVar;
        n6.a aVarB = super.b();
        if (aVarB != null) {
            return aVarB;
        }
        long j = this.f19116l;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j7 = this.f19129y;
        if (j7 == -9223372036854775807L || this.f8816e - j7 < j || (aVar = (n6.a) this.f8814c.pollFirst()) == null) {
            return null;
        }
        this.f19119o = Collections.EMPTY_LIST;
        this.f19129y = -9223372036854775807L;
        aVar.q(this.f8816e, g(), Long.MAX_VALUE);
        return aVar;
    }

    @Override // fb.j
    public final boolean l() {
        return this.f19119o != this.f19120p;
    }

    public final ArrayList o() {
        ArrayList arrayList = this.f19117m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            z4.b bVarC = ((b) arrayList.get(i10)).c(Integer.MIN_VALUE);
            arrayList2.add(bVarC);
            if (bVarC != null) {
                iMin = Math.min(iMin, bVarC.E);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            z4.b bVarC2 = (z4.b) arrayList2.get(i11);
            if (bVarC2 != null) {
                if (bVarC2.E != iMin) {
                    bVarC2 = ((b) arrayList.get(i11)).c(iMin);
                    bVarC2.getClass();
                }
                arrayList3.add(bVarC2);
            }
        }
        return arrayList3;
    }

    public final void p() {
        b bVar = this.f19118n;
        bVar.f19111g = this.f19121q;
        bVar.f19105a.clear();
        bVar.f19106b.clear();
        bVar.f19107c.setLength(0);
        bVar.f19108d = 15;
        bVar.f19109e = 0;
        bVar.f19110f = 0;
        ArrayList arrayList = this.f19117m;
        arrayList.clear();
        arrayList.add(this.f19118n);
    }

    public final void q(int i10) {
        int i11 = this.f19121q;
        if (i11 == i10) {
            return;
        }
        this.f19121q = i10;
        if (i10 != 3) {
            p();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f19119o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f19117m;
            if (i12 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i12)).f19111g = i10;
            i12++;
        }
    }

    @Override // fb.j, z9.a, c5.d
    public final void release() {
    }
}
