package f5;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8542a;

    /* renamed from: b, reason: collision with root package name */
    public int f8543b;

    /* renamed from: c, reason: collision with root package name */
    public long f8544c;

    /* renamed from: d, reason: collision with root package name */
    public long f8545d;

    /* renamed from: e, reason: collision with root package name */
    public long f8546e;

    /* renamed from: f, reason: collision with root package name */
    public long f8547f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f8548g;

    public n(AudioTrack audioTrack, int i10) {
        this.f8542a = i10;
        switch (i10) {
            case 1:
                if (qb.v.f20828a < 19) {
                    this.f8548g = null;
                    b(3);
                    break;
                } else {
                    this.f8548g = new m(audioTrack, 1);
                    a();
                    break;
                }
            default:
                if (a5.d0.f105a < 19) {
                    this.f8548g = null;
                    b(3);
                    break;
                } else {
                    this.f8548g = new m(audioTrack, 0);
                    a();
                    break;
                }
        }
    }

    public final void a() {
        switch (this.f8542a) {
            case 0:
                if (((m) this.f8548g) != null) {
                    b(0);
                    break;
                }
                break;
            default:
                if (((m) this.f8548g) != null) {
                    b(0);
                    break;
                }
                break;
        }
    }

    public final void b(int i10) {
        switch (this.f8542a) {
            case 0:
                this.f8543b = i10;
                if (i10 == 0) {
                    this.f8546e = 0L;
                    this.f8547f = -1L;
                    this.f8544c = System.nanoTime() / 1000;
                    this.f8545d = 10000L;
                    return;
                }
                if (i10 == 1) {
                    this.f8545d = 10000L;
                    return;
                }
                if (i10 == 2 || i10 == 3) {
                    this.f8545d = 10000000L;
                    return;
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    this.f8545d = 500000L;
                    return;
                }
            default:
                this.f8543b = i10;
                if (i10 == 0) {
                    this.f8546e = 0L;
                    this.f8547f = -1L;
                    this.f8544c = System.nanoTime() / 1000;
                    this.f8545d = 10000L;
                    return;
                }
                if (i10 == 1) {
                    this.f8545d = 10000L;
                    return;
                }
                if (i10 == 2 || i10 == 3) {
                    this.f8545d = 10000000L;
                    return;
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    this.f8545d = 500000L;
                    return;
                }
        }
    }
}
