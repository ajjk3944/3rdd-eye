package io.appmetrica.analytics.coreapi.internal.model;

/* loaded from: classes3.dex */
public final class ScreenInfo {

    /* renamed from: a, reason: collision with root package name */
    private final int f38886a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38887b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38888c;

    /* renamed from: d, reason: collision with root package name */
    private final float f38889d;

    public ScreenInfo(int i, int i10, int i11, float f10) {
        this.f38886a = i;
        this.f38887b = i10;
        this.f38888c = i11;
        this.f38889d = f10;
    }

    public static /* synthetic */ ScreenInfo copy$default(ScreenInfo screenInfo, int i, int i10, int i11, float f10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i = screenInfo.f38886a;
        }
        if ((i12 & 2) != 0) {
            i10 = screenInfo.f38887b;
        }
        if ((i12 & 4) != 0) {
            i11 = screenInfo.f38888c;
        }
        if ((i12 & 8) != 0) {
            f10 = screenInfo.f38889d;
        }
        return screenInfo.copy(i, i10, i11, f10);
    }

    public final int component1() {
        return this.f38886a;
    }

    public final int component2() {
        return this.f38887b;
    }

    public final int component3() {
        return this.f38888c;
    }

    public final float component4() {
        return this.f38889d;
    }

    public final ScreenInfo copy(int i, int i10, int i11, float f10) {
        return new ScreenInfo(i, i10, i11, f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenInfo)) {
            return false;
        }
        ScreenInfo screenInfo = (ScreenInfo) obj;
        return this.f38886a == screenInfo.f38886a && this.f38887b == screenInfo.f38887b && this.f38888c == screenInfo.f38888c && Float.valueOf(this.f38889d).equals(Float.valueOf(screenInfo.f38889d));
    }

    public final int getDpi() {
        return this.f38888c;
    }

    public final int getHeight() {
        return this.f38887b;
    }

    public final float getScaleFactor() {
        return this.f38889d;
    }

    public final int getWidth() {
        return this.f38886a;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f38889d) + ((this.f38888c + ((this.f38887b + (this.f38886a * 31)) * 31)) * 31);
    }

    public String toString() {
        return "ScreenInfo(width=" + this.f38886a + ", height=" + this.f38887b + ", dpi=" + this.f38888c + ", scaleFactor=" + this.f38889d + ')';
    }
}
