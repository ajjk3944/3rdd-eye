package c1;

import java.util.Arrays;
import java.util.HashSet;

/* renamed from: c1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4193i implements Comparable {

    /* renamed from: r, reason: collision with root package name */
    private static int f33701r = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f33702a;

    /* renamed from: b, reason: collision with root package name */
    private String f33703b;

    /* renamed from: f, reason: collision with root package name */
    public float f33707f;

    /* renamed from: j, reason: collision with root package name */
    a f33711j;

    /* renamed from: c, reason: collision with root package name */
    public int f33704c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f33705d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f33706e = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f33708g = false;

    /* renamed from: h, reason: collision with root package name */
    float[] f33709h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    float[] f33710i = new float[9];

    /* renamed from: k, reason: collision with root package name */
    C4186b[] f33712k = new C4186b[16];

    /* renamed from: l, reason: collision with root package name */
    int f33713l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f33714m = 0;

    /* renamed from: n, reason: collision with root package name */
    boolean f33715n = false;

    /* renamed from: o, reason: collision with root package name */
    int f33716o = -1;

    /* renamed from: p, reason: collision with root package name */
    float f33717p = 0.0f;

    /* renamed from: q, reason: collision with root package name */
    HashSet f33718q = null;

    /* renamed from: c1.i$a */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C4193i(a aVar, String str) {
        this.f33711j = aVar;
    }

    static void c() {
        f33701r++;
    }

    public final void a(C4186b c4186b) {
        int i10 = 0;
        while (true) {
            int i11 = this.f33713l;
            if (i10 >= i11) {
                C4186b[] c4186bArr = this.f33712k;
                if (i11 >= c4186bArr.length) {
                    this.f33712k = (C4186b[]) Arrays.copyOf(c4186bArr, c4186bArr.length * 2);
                }
                C4186b[] c4186bArr2 = this.f33712k;
                int i12 = this.f33713l;
                c4186bArr2[i12] = c4186b;
                this.f33713l = i12 + 1;
                return;
            }
            if (this.f33712k[i10] == c4186b) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C4193i c4193i) {
        return this.f33704c - c4193i.f33704c;
    }

    public final void d(C4186b c4186b) {
        int i10 = this.f33713l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f33712k[i11] == c4186b) {
                while (i11 < i10 - 1) {
                    C4186b[] c4186bArr = this.f33712k;
                    int i12 = i11 + 1;
                    c4186bArr[i11] = c4186bArr[i12];
                    i11 = i12;
                }
                this.f33713l--;
                return;
            }
            i11++;
        }
    }

    public void g() {
        this.f33703b = null;
        this.f33711j = a.UNKNOWN;
        this.f33706e = 0;
        this.f33704c = -1;
        this.f33705d = -1;
        this.f33707f = 0.0f;
        this.f33708g = false;
        this.f33715n = false;
        this.f33716o = -1;
        this.f33717p = 0.0f;
        int i10 = this.f33713l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f33712k[i11] = null;
        }
        this.f33713l = 0;
        this.f33714m = 0;
        this.f33702a = false;
        Arrays.fill(this.f33710i, 0.0f);
    }

    public void h(C4188d c4188d, float f10) {
        this.f33707f = f10;
        this.f33708g = true;
        this.f33715n = false;
        this.f33716o = -1;
        this.f33717p = 0.0f;
        int i10 = this.f33713l;
        this.f33705d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f33712k[i11].A(c4188d, this, false);
        }
        this.f33713l = 0;
    }

    public void j(a aVar, String str) {
        this.f33711j = aVar;
    }

    public final void l(C4188d c4188d, C4186b c4186b) {
        int i10 = this.f33713l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f33712k[i11].B(c4188d, c4186b, false);
        }
        this.f33713l = 0;
    }

    public String toString() {
        if (this.f33703b != null) {
            return "" + this.f33703b;
        }
        return "" + this.f33704c;
    }
}
