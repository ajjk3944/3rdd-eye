package androidx.constraintlayout.core;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class SolverVariable implements Comparable {

    /* renamed from: r, reason: collision with root package name */
    public static int f1513r = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f1514a;

    /* renamed from: b, reason: collision with root package name */
    public String f1515b;

    /* renamed from: f, reason: collision with root package name */
    public float f1519f;

    /* renamed from: j, reason: collision with root package name */
    public Type f1523j;

    /* renamed from: c, reason: collision with root package name */
    public int f1516c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f1517d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f1518e = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1520g = false;

    /* renamed from: h, reason: collision with root package name */
    public float[] f1521h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    public float[] f1522i = new float[9];

    /* renamed from: k, reason: collision with root package name */
    public b[] f1524k = new b[16];

    /* renamed from: l, reason: collision with root package name */
    public int f1525l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f1526m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1527n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f1528o = -1;

    /* renamed from: p, reason: collision with root package name */
    public float f1529p = 0.0f;

    /* renamed from: q, reason: collision with root package name */
    public HashSet f1530q = null;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type, String str) {
        this.f1523j = type;
    }

    public static void c() {
        f1513r++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f1525l;
            if (i10 >= i11) {
                b[] bVarArr = this.f1524k;
                if (i11 >= bVarArr.length) {
                    this.f1524k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f1524k;
                int i12 = this.f1525l;
                bVarArr2[i12] = bVar;
                this.f1525l = i12 + 1;
                return;
            }
            if (this.f1524k[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(SolverVariable solverVariable) {
        return this.f1516c - solverVariable.f1516c;
    }

    public final void d(b bVar) {
        int i10 = this.f1525l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f1524k[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f1524k;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f1525l--;
                return;
            }
            i11++;
        }
    }

    public void f() {
        this.f1515b = null;
        this.f1523j = Type.UNKNOWN;
        this.f1518e = 0;
        this.f1516c = -1;
        this.f1517d = -1;
        this.f1519f = 0.0f;
        this.f1520g = false;
        this.f1527n = false;
        this.f1528o = -1;
        this.f1529p = 0.0f;
        int i10 = this.f1525l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f1524k[i11] = null;
        }
        this.f1525l = 0;
        this.f1526m = 0;
        this.f1514a = false;
        Arrays.fill(this.f1522i, 0.0f);
    }

    public void g(c cVar, float f10) {
        this.f1519f = f10;
        this.f1520g = true;
        this.f1527n = false;
        this.f1528o = -1;
        this.f1529p = 0.0f;
        int i10 = this.f1525l;
        this.f1517d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f1524k[i11].A(cVar, this, false);
        }
        this.f1525l = 0;
    }

    public void h(Type type, String str) {
        this.f1523j = type;
    }

    public final void i(c cVar, b bVar) {
        int i10 = this.f1525l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f1524k[i11].B(cVar, bVar, false);
        }
        this.f1525l = 0;
    }

    public String toString() {
        if (this.f1515b != null) {
            return "" + this.f1515b;
        }
        return "" + this.f1516c;
    }
}
