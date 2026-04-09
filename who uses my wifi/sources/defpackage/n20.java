package defpackage;

import android.provider.Settings;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class n20 extends aq {
    public m60 s;
    public e6 t;

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n20.draw(android.graphics.Canvas):void");
    }

    @Override // defpackage.aq
    public final boolean e(boolean z, boolean z2, boolean z3) {
        boolean zE = super.e(z, z2, z3);
        if (this.h != null) {
            Settings.Global.getFloat(this.f.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        if (!isRunning()) {
            this.t.c();
        }
        if (z && z3) {
            this.t.p();
        }
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.s.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.s.getClass();
        return -1;
    }
}
