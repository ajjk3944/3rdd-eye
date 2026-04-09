package ab;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class b implements n, p5.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284a;

    /* renamed from: d, reason: collision with root package name */
    public final long f285d;

    /* renamed from: g, reason: collision with root package name */
    public final long f286g;

    /* renamed from: r, reason: collision with root package name */
    public long f287r;

    public b(int i10, long j, long j7) {
        this.f284a = i10;
        switch (i10) {
            case 1:
                this.f285d = j;
                this.f286g = j7;
                this.f287r = j - 1;
                break;
            default:
                this.f285d = j;
                this.f286g = j7;
                this.f287r = j - 1;
                break;
        }
    }

    public final void c() {
        switch (this.f284a) {
            case 0:
                long j = this.f287r;
                if (j < this.f285d || j > this.f286g) {
                    throw new NoSuchElementException();
                }
                return;
            default:
                long j7 = this.f287r;
                if (j7 < this.f285d || j7 > this.f286g) {
                    throw new NoSuchElementException();
                }
                return;
        }
    }

    @Override // ab.n, p5.m
    public final boolean next() {
        switch (this.f284a) {
            case 0:
                long j = this.f287r + 1;
                this.f287r = j;
                return !(j > this.f286g);
            default:
                long j7 = this.f287r + 1;
                this.f287r = j7;
                return !(j7 > this.f286g);
        }
    }
}
