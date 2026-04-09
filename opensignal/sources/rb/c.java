package rb;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21443a;

    /* renamed from: b, reason: collision with root package name */
    public long f21444b;

    /* renamed from: c, reason: collision with root package name */
    public long f21445c;

    /* renamed from: d, reason: collision with root package name */
    public long f21446d;

    /* renamed from: e, reason: collision with root package name */
    public long f21447e;

    /* renamed from: f, reason: collision with root package name */
    public long f21448f;

    /* renamed from: g, reason: collision with root package name */
    public long f21449g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f21450h;

    /* renamed from: i, reason: collision with root package name */
    public int f21451i;

    public c(int i10) {
        this.f21443a = i10;
        switch (i10) {
            case 1:
                this.f21450h = new boolean[15];
                break;
            default:
                this.f21450h = new boolean[15];
                break;
        }
    }

    public final boolean a() {
        switch (this.f21443a) {
            case 0:
                if (this.f21447e <= 15 || this.f21451i != 0) {
                }
                break;
            default:
                if (this.f21447e <= 15 || this.f21451i != 0) {
                }
                break;
        }
        return false;
    }

    public final void b(long j) {
        switch (this.f21443a) {
            case 0:
                long j7 = this.f21447e;
                if (j7 == 0) {
                    this.f21444b = j;
                } else if (j7 == 1) {
                    long j10 = j - this.f21444b;
                    this.f21445c = j10;
                    this.f21449g = j10;
                    this.f21448f = 1L;
                } else {
                    long j11 = j - this.f21446d;
                    int i10 = (int) (j7 % 15);
                    long jAbs = Math.abs(j11 - this.f21445c);
                    boolean[] zArr = this.f21450h;
                    if (jAbs <= 1000000) {
                        this.f21448f++;
                        this.f21449g += j11;
                        if (zArr[i10]) {
                            zArr[i10] = false;
                            this.f21451i--;
                        }
                    } else if (!zArr[i10]) {
                        zArr[i10] = true;
                        this.f21451i++;
                    }
                }
                this.f21447e++;
                this.f21446d = j;
                break;
            default:
                long j12 = this.f21447e;
                if (j12 == 0) {
                    this.f21444b = j;
                } else if (j12 == 1) {
                    long j13 = j - this.f21444b;
                    this.f21445c = j13;
                    this.f21449g = j13;
                    this.f21448f = 1L;
                } else {
                    long j14 = j - this.f21446d;
                    int i11 = (int) (j12 % 15);
                    long jAbs2 = Math.abs(j14 - this.f21445c);
                    boolean[] zArr2 = this.f21450h;
                    if (jAbs2 <= 1000000) {
                        this.f21448f++;
                        this.f21449g += j14;
                        if (zArr2[i11]) {
                            zArr2[i11] = false;
                            this.f21451i--;
                        }
                    } else if (!zArr2[i11]) {
                        zArr2[i11] = true;
                        this.f21451i++;
                    }
                }
                this.f21447e++;
                this.f21446d = j;
                break;
        }
    }

    public final void c() {
        switch (this.f21443a) {
            case 0:
                this.f21447e = 0L;
                this.f21448f = 0L;
                this.f21449g = 0L;
                this.f21451i = 0;
                Arrays.fill(this.f21450h, false);
                break;
            default:
                this.f21447e = 0L;
                this.f21448f = 0L;
                this.f21449g = 0L;
                this.f21451i = 0;
                Arrays.fill(this.f21450h, false);
                break;
        }
    }
}
