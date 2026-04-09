package io.sentry.android.replay;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f11985a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11986b;

    /* renamed from: c, reason: collision with root package name */
    public final float f11987c;

    /* renamed from: d, reason: collision with root package name */
    public final float f11988d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11989e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11990f;

    public t(int i10, int i11, float f10, float f11, int i12, int i13) {
        this.f11985a = i10;
        this.f11986b = i11;
        this.f11987c = f10;
        this.f11988d = f11;
        this.f11989e = i12;
        this.f11990f = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f11985a == tVar.f11985a && this.f11986b == tVar.f11986b && Float.compare(this.f11987c, tVar.f11987c) == 0 && Float.compare(this.f11988d, tVar.f11988d) == 0 && this.f11989e == tVar.f11989e && this.f11990f == tVar.f11990f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11990f) + c7.a.C(this.f11989e, w.g.a(w.g.a(c7.a.C(this.f11986b, Integer.hashCode(this.f11985a) * 31, 31), this.f11987c, 31), this.f11988d, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenshotRecorderConfig(recordingWidth=");
        sb2.append(this.f11985a);
        sb2.append(", recordingHeight=");
        sb2.append(this.f11986b);
        sb2.append(", scaleFactorX=");
        sb2.append(this.f11987c);
        sb2.append(", scaleFactorY=");
        sb2.append(this.f11988d);
        sb2.append(", frameRate=");
        sb2.append(this.f11989e);
        sb2.append(", bitRate=");
        return c7.a.q(sb2, this.f11990f, ')');
    }
}
