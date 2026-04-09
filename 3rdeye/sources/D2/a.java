package D2;

import android.graphics.Paint;
import kotlin.KotlinVersion;

/* compiled from: BorderedText.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f1031a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f1032b;

    public a(float f10) {
        Paint paint = new Paint();
        this.f1031a = paint;
        paint.setTextSize(f10);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(false);
        paint.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        Paint paint2 = new Paint();
        this.f1032b = paint2;
        paint2.setTextSize(f10);
        paint2.setColor(-16777216);
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setStrokeWidth(f10 / 8.0f);
        paint2.setAntiAlias(false);
        paint2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
    }
}
