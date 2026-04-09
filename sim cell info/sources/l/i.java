package l;

import java.util.Arrays;

/* loaded from: classes.dex */
public class i {

    /* renamed from: k, reason: collision with root package name */
    private static int f2816k = 1;

    /* renamed from: a, reason: collision with root package name */
    private String f2817a;

    /* renamed from: e, reason: collision with root package name */
    public float f2821e;

    /* renamed from: g, reason: collision with root package name */
    a f2823g;

    /* renamed from: b, reason: collision with root package name */
    public int f2818b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f2819c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f2820d = 0;

    /* renamed from: f, reason: collision with root package name */
    float[] f2822f = new float[7];

    /* renamed from: h, reason: collision with root package name */
    b[] f2824h = new b[8];

    /* renamed from: i, reason: collision with root package name */
    int f2825i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f2826j = 0;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f2823g = aVar;
    }

    static void b() {
        f2816k++;
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.f2825i;
            if (i2 >= i3) {
                b[] bVarArr = this.f2824h;
                if (i3 >= bVarArr.length) {
                    this.f2824h = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f2824h;
                int i4 = this.f2825i;
                bVarArr2[i4] = bVar;
                this.f2825i = i4 + 1;
                return;
            }
            if (this.f2824h[i2] == bVar) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void c(b bVar) {
        int i2 = this.f2825i;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f2824h[i3] == bVar) {
                for (int i4 = 0; i4 < (i2 - i3) - 1; i4++) {
                    b[] bVarArr = this.f2824h;
                    int i5 = i3 + i4;
                    bVarArr[i5] = bVarArr[i5 + 1];
                }
                this.f2825i--;
                return;
            }
        }
    }

    public void d() {
        this.f2817a = null;
        this.f2823g = a.UNKNOWN;
        this.f2820d = 0;
        this.f2818b = -1;
        this.f2819c = -1;
        this.f2821e = 0.0f;
        this.f2825i = 0;
        this.f2826j = 0;
    }

    public void e(a aVar, String str) {
        this.f2823g = aVar;
    }

    public final void f(b bVar) {
        int i2 = this.f2825i;
        for (int i3 = 0; i3 < i2; i3++) {
            b[] bVarArr = this.f2824h;
            bVarArr[i3].f2791d.n(bVarArr[i3], bVar, false);
        }
        this.f2825i = 0;
    }

    public String toString() {
        return "" + this.f2817a;
    }
}
