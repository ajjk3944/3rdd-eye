package c1;

import c1.C4186b;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: c1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4192h extends C4186b {

    /* renamed from: g, reason: collision with root package name */
    private int f33691g;

    /* renamed from: h, reason: collision with root package name */
    private C4193i[] f33692h;

    /* renamed from: i, reason: collision with root package name */
    private C4193i[] f33693i;

    /* renamed from: j, reason: collision with root package name */
    private int f33694j;

    /* renamed from: k, reason: collision with root package name */
    b f33695k;

    /* renamed from: l, reason: collision with root package name */
    C4187c f33696l;

    /* renamed from: c1.h$a */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C4193i c4193i, C4193i c4193i2) {
            return c4193i.f33704c - c4193i2.f33704c;
        }
    }

    /* renamed from: c1.h$b */
    class b {

        /* renamed from: a, reason: collision with root package name */
        C4193i f33698a;

        /* renamed from: b, reason: collision with root package name */
        C4192h f33699b;

        b(C4192h c4192h) {
            this.f33699b = c4192h;
        }

        public boolean a(C4193i c4193i, float f10) {
            boolean z10 = true;
            if (!this.f33698a.f33702a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = c4193i.f33710i[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f33698a.f33710i[i10] = f12;
                    } else {
                        this.f33698a.f33710i[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f33698a.f33710i;
                float f13 = fArr[i11] + (c4193i.f33710i[i11] * f10);
                fArr[i11] = f13;
                if (Math.abs(f13) < 1.0E-4f) {
                    this.f33698a.f33710i[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                C4192h.this.G(this.f33698a);
            }
            return false;
        }

        public void b(C4193i c4193i) {
            this.f33698a = c4193i;
        }

        public final boolean c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f33698a.f33710i[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(C4193i c4193i) {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = c4193i.f33710i[i10];
                float f11 = this.f33698a.f33710i[i10];
                if (f11 != f10) {
                    return f11 < f10;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f33698a.f33710i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f33698a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f33698a.f33710i[i10] + " ";
                }
            }
            return str + "] " + this.f33698a;
        }
    }

    public C4192h(C4187c c4187c) {
        super(c4187c);
        this.f33691g = 128;
        this.f33692h = new C4193i[128];
        this.f33693i = new C4193i[128];
        this.f33694j = 0;
        this.f33695k = new b(this);
        this.f33696l = c4187c;
    }

    private void F(C4193i c4193i) {
        int i10;
        int i11 = this.f33694j + 1;
        C4193i[] c4193iArr = this.f33692h;
        if (i11 > c4193iArr.length) {
            C4193i[] c4193iArr2 = (C4193i[]) Arrays.copyOf(c4193iArr, c4193iArr.length * 2);
            this.f33692h = c4193iArr2;
            this.f33693i = (C4193i[]) Arrays.copyOf(c4193iArr2, c4193iArr2.length * 2);
        }
        C4193i[] c4193iArr3 = this.f33692h;
        int i12 = this.f33694j;
        c4193iArr3[i12] = c4193i;
        int i13 = i12 + 1;
        this.f33694j = i13;
        if (i13 > 1 && c4193iArr3[i12].f33704c > c4193i.f33704c) {
            int i14 = 0;
            while (true) {
                i10 = this.f33694j;
                if (i14 >= i10) {
                    break;
                }
                this.f33693i[i14] = this.f33692h[i14];
                i14++;
            }
            Arrays.sort(this.f33693i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f33694j; i15++) {
                this.f33692h[i15] = this.f33693i[i15];
            }
        }
        c4193i.f33702a = true;
        c4193i.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(C4193i c4193i) {
        int i10 = 0;
        while (i10 < this.f33694j) {
            if (this.f33692h[i10] == c4193i) {
                while (true) {
                    int i11 = this.f33694j;
                    if (i10 >= i11 - 1) {
                        this.f33694j = i11 - 1;
                        c4193i.f33702a = false;
                        return;
                    } else {
                        C4193i[] c4193iArr = this.f33692h;
                        int i12 = i10 + 1;
                        c4193iArr[i10] = c4193iArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // c1.C4186b
    public void B(C4188d c4188d, C4186b c4186b, boolean z10) {
        C4193i c4193i = c4186b.f33654a;
        if (c4193i == null) {
            return;
        }
        C4186b.a aVar = c4186b.f33658e;
        int iA = aVar.a();
        for (int i10 = 0; i10 < iA; i10++) {
            C4193i c4193iB = aVar.b(i10);
            float fD = aVar.d(i10);
            this.f33695k.b(c4193iB);
            if (this.f33695k.a(c4193i, fD)) {
                F(c4193iB);
            }
            this.f33655b += c4186b.f33655b * fD;
        }
        G(c4193i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    @Override // c1.C4186b, c1.C4188d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c1.C4193i a(c1.C4188d r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = r5
        L3:
            int r2 = r4.f33694j
            if (r0 >= r2) goto L32
            c1.i[] r2 = r4.f33692h
            r2 = r2[r0]
            int r3 = r2.f33704c
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2f
        L12:
            c1.h$b r3 = r4.f33695k
            r3.b(r2)
            if (r1 != r5) goto L22
            c1.h$b r2 = r4.f33695k
            boolean r2 = r2.c()
            if (r2 == 0) goto L2f
            goto L2e
        L22:
            c1.h$b r2 = r4.f33695k
            c1.i[] r3 = r4.f33692h
            r3 = r3[r1]
            boolean r2 = r2.d(r3)
            if (r2 == 0) goto L2f
        L2e:
            r1 = r0
        L2f:
            int r0 = r0 + 1
            goto L3
        L32:
            if (r1 != r5) goto L36
            r5 = 0
            return r5
        L36:
            c1.i[] r5 = r4.f33692h
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.C4192h.a(c1.d, boolean[]):c1.i");
    }

    @Override // c1.C4186b, c1.C4188d.a
    public void c(C4193i c4193i) {
        this.f33695k.b(c4193i);
        this.f33695k.e();
        c4193i.f33710i[c4193i.f33706e] = 1.0f;
        F(c4193i);
    }

    @Override // c1.C4186b, c1.C4188d.a
    public void clear() {
        this.f33694j = 0;
        this.f33655b = 0.0f;
    }

    @Override // c1.C4186b, c1.C4188d.a
    public boolean isEmpty() {
        return this.f33694j == 0;
    }

    @Override // c1.C4186b
    public String toString() {
        String str = " goal -> (" + this.f33655b + ") : ";
        for (int i10 = 0; i10 < this.f33694j; i10++) {
            this.f33695k.b(this.f33692h[i10]);
            str = str + this.f33695k + " ";
        }
        return str;
    }
}
