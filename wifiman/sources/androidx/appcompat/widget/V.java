package androidx.appcompat.widget;

import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
class V {

    /* renamed from: a, reason: collision with root package name */
    private int f27282a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f27283b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f27284c = PduHandle.NONE;

    /* renamed from: d, reason: collision with root package name */
    private int f27285d = PduHandle.NONE;

    /* renamed from: e, reason: collision with root package name */
    private int f27286e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f27287f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f27288g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f27289h = false;

    V() {
    }

    public int a() {
        return this.f27288g ? this.f27282a : this.f27283b;
    }

    public int b() {
        return this.f27282a;
    }

    public int c() {
        return this.f27283b;
    }

    public int d() {
        return this.f27288g ? this.f27283b : this.f27282a;
    }

    public void e(int i10, int i11) {
        this.f27289h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f27286e = i10;
            this.f27282a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f27287f = i11;
            this.f27283b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 == this.f27288g) {
            return;
        }
        this.f27288g = z10;
        if (!this.f27289h) {
            this.f27282a = this.f27286e;
            this.f27283b = this.f27287f;
            return;
        }
        if (z10) {
            int i10 = this.f27285d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f27286e;
            }
            this.f27282a = i10;
            int i11 = this.f27284c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f27287f;
            }
            this.f27283b = i11;
            return;
        }
        int i12 = this.f27284c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f27286e;
        }
        this.f27282a = i12;
        int i13 = this.f27285d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f27287f;
        }
        this.f27283b = i13;
    }

    public void g(int i10, int i11) {
        this.f27284c = i10;
        this.f27285d = i11;
        this.f27289h = true;
        if (this.f27288g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f27282a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f27283b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f27282a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f27283b = i11;
        }
    }
}
