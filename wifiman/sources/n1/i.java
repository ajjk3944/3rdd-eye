package n1;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class i {

    /* renamed from: o, reason: collision with root package name */
    private static int f54261o = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f54262a;

    /* renamed from: b, reason: collision with root package name */
    private String f54263b;

    /* renamed from: f, reason: collision with root package name */
    public float f54267f;

    /* renamed from: j, reason: collision with root package name */
    a f54271j;

    /* renamed from: c, reason: collision with root package name */
    public int f54264c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f54265d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f54266e = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f54268g = false;

    /* renamed from: h, reason: collision with root package name */
    float[] f54269h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    float[] f54270i = new float[9];

    /* renamed from: k, reason: collision with root package name */
    b[] f54272k = new b[16];

    /* renamed from: l, reason: collision with root package name */
    int f54273l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f54274m = 0;

    /* renamed from: n, reason: collision with root package name */
    HashSet f54275n = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f54271j = aVar;
    }

    static void b() {
        f54261o++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f54273l;
            if (i10 >= i11) {
                b[] bVarArr = this.f54272k;
                if (i11 >= bVarArr.length) {
                    this.f54272k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f54272k;
                int i12 = this.f54273l;
                bVarArr2[i12] = bVar;
                this.f54273l = i12 + 1;
                return;
            }
            if (this.f54272k[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void c(b bVar) {
        int i10 = this.f54273l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f54272k[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f54272k;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f54273l--;
                return;
            }
            i11++;
        }
    }

    public void d() {
        this.f54263b = null;
        this.f54271j = a.UNKNOWN;
        this.f54266e = 0;
        this.f54264c = -1;
        this.f54265d = -1;
        this.f54267f = 0.0f;
        this.f54268g = false;
        int i10 = this.f54273l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f54272k[i11] = null;
        }
        this.f54273l = 0;
        this.f54274m = 0;
        this.f54262a = false;
        Arrays.fill(this.f54270i, 0.0f);
    }

    public void e(d dVar, float f10) {
        this.f54267f = f10;
        this.f54268g = true;
        int i10 = this.f54273l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f54272k[i11].B(dVar, this, false);
        }
        this.f54273l = 0;
    }

    public void f(a aVar, String str) {
        this.f54271j = aVar;
    }

    public final void g(b bVar) {
        int i10 = this.f54273l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f54272k[i11].C(bVar, false);
        }
        this.f54273l = 0;
    }

    public String toString() {
        if (this.f54263b != null) {
            return "" + this.f54263b;
        }
        return "" + this.f54264c;
    }
}
