package fb;

import dd.s;
import io.sentry.android.core.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends j {

    /* renamed from: h, reason: collision with root package name */
    public final f f8757h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8758i;
    public final int j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final long f8759l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f8760m;

    /* renamed from: n, reason: collision with root package name */
    public b f8761n;

    /* renamed from: o, reason: collision with root package name */
    public List f8762o;

    /* renamed from: p, reason: collision with root package name */
    public List f8763p;

    /* renamed from: q, reason: collision with root package name */
    public int f8764q;

    /* renamed from: r, reason: collision with root package name */
    public int f8765r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8766s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8767t;

    /* renamed from: u, reason: collision with root package name */
    public byte f8768u;

    /* renamed from: v, reason: collision with root package name */
    public byte f8769v;

    /* renamed from: w, reason: collision with root package name */
    public int f8770w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8771x;

    /* renamed from: y, reason: collision with root package name */
    public long f8772y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f8756z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    public c(String str, int i10) {
        super(0);
        this.f8757h = new f();
        this.f8760m = new ArrayList();
        this.f8761n = new b(0, 4);
        this.f8770w = 0;
        this.f8759l = 16000000L;
        this.f8758i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
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
            e0.p("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.k = 0;
            this.j = 0;
        } else {
            this.k = 1;
            this.j = 1;
        }
        q(0);
        p();
        this.f8771x = true;
        this.f8772y = -9223372036854775807L;
    }

    @Override // fb.j
    public final s f() {
        List list = this.f8762o;
        this.f8763p = list;
        list.getClass();
        return new s(1, list);
    }

    @Override // fb.j, z9.a, c5.d
    public final void flush() {
        super.flush();
        this.f8762o = null;
        this.f8763p = null;
        q(0);
        this.f8765r = 4;
        this.f8761n.f8755h = 4;
        p();
        this.f8766s = false;
        this.f8767t = false;
        this.f8768u = (byte) 0;
        this.f8769v = (byte) 0;
        this.f8770w = 0;
        this.f8771x = true;
        this.f8772y = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7 A[FALL_THROUGH] */
    @Override // fb.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(fb.h r15) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.c.h(fb.h):void");
    }

    @Override // fb.j, z9.a
    /* renamed from: j */
    public final eb.j b() {
        eb.j jVar;
        eb.j jVarB = super.b();
        if (jVarB != null) {
            return jVarB;
        }
        long j = this.f8759l;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j7 = this.f8772y;
        if (j7 == -9223372036854775807L || this.f8816e - j7 < j || (jVar = (eb.j) this.f8814c.pollFirst()) == null) {
            return null;
        }
        this.f8762o = Collections.EMPTY_LIST;
        this.f8772y = -9223372036854775807L;
        s sVarF = f();
        long j10 = this.f8816e;
        jVar.f26799g = j10;
        jVar.f8084r = sVarF;
        jVar.f8085x = j10;
        return jVar;
    }

    @Override // fb.j
    public final boolean l() {
        return this.f8762o != this.f8763p;
    }

    public final ArrayList o() {
        ArrayList arrayList = this.f8760m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            eb.b bVarC = ((b) arrayList.get(i10)).c(Integer.MIN_VALUE);
            arrayList2.add(bVarC);
            if (bVarC != null) {
                iMin = Math.min(iMin, bVarC.f8064i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            eb.b bVarC2 = (eb.b) arrayList2.get(i11);
            if (bVarC2 != null) {
                if (bVarC2.f8064i != iMin) {
                    bVarC2 = ((b) arrayList.get(i11)).c(iMin);
                    bVarC2.getClass();
                }
                arrayList3.add(bVarC2);
            }
        }
        return arrayList3;
    }

    public final void p() {
        b bVar = this.f8761n;
        bVar.f8754g = this.f8764q;
        bVar.f8748a.clear();
        bVar.f8749b.clear();
        bVar.f8750c.setLength(0);
        bVar.f8751d = 15;
        bVar.f8752e = 0;
        bVar.f8753f = 0;
        ArrayList arrayList = this.f8760m;
        arrayList.clear();
        arrayList.add(this.f8761n);
    }

    public final void q(int i10) {
        int i11 = this.f8764q;
        if (i11 == i10) {
            return;
        }
        this.f8764q = i10;
        if (i10 != 3) {
            p();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f8762o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f8760m;
            if (i12 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i12)).f8754g = i10;
            i12++;
        }
    }

    @Override // fb.j, z9.a, c5.d
    public final void release() {
    }
}
