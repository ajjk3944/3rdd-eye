package j2;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import kotlin.KotlinVersion;
import u2.C5628g;

/* compiled from: LPaint.java */
/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5167a extends Paint {
    public C5167a(PorterDuff.Mode mode) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            PointF pointF = C5628g.f46556a;
            super.setAlpha(Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, i)));
        } else {
            int color = getColor();
            PointF pointF2 = C5628g.f46556a;
            setColor((Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, i)) << 24) | (color & 16777215));
        }
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }
}
