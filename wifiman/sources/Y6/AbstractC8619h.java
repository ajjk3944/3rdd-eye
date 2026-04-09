package y6;

import android.graphics.Paint;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: y6.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8619h {

    /* renamed from: a, reason: collision with root package name */
    private static final Paint.FontMetrics f66376a = new Paint.FontMetrics();

    public static final float a(Paint paint) {
        AbstractC6492s.i(paint, "<this>");
        Paint.FontMetrics fontMetrics = f66376a;
        paint.getFontMetrics(fontMetrics);
        return (fontMetrics.bottom - fontMetrics.top) + fontMetrics.leading;
    }
}
