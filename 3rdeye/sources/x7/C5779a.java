package x7;

import android.graphics.Paint;
import android.graphics.Rect;
import w7.C5741a;

/* compiled from: TextDrawDelegate.kt */
/* renamed from: x7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5779a {

    /* renamed from: a, reason: collision with root package name */
    public final C5741a f47797a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f47798b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final Paint f47799c;

    /* renamed from: d, reason: collision with root package name */
    public String f47800d;

    /* renamed from: e, reason: collision with root package name */
    public float f47801e;

    /* renamed from: f, reason: collision with root package name */
    public float f47802f;

    public C5779a(C5741a c5741a) {
        this.f47797a = c5741a;
        Paint paint = new Paint(1);
        paint.setTextSize(c5741a.f47498a);
        paint.setColor(c5741a.f47502e);
        paint.setTypeface(c5741a.f47499b);
        paint.setStyle(Paint.Style.FILL);
        this.f47799c = paint;
    }
}
