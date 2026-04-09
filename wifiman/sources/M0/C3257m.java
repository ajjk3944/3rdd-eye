package M0;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: M0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3257m {

    /* renamed from: a, reason: collision with root package name */
    public static final C3257m f12413a = new C3257m();

    private C3257m() {
    }

    public final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        canvas.drawTextRun(charSequence, i10, i11, i12, i13, f10, f11, z10, paint);
    }

    public final void b(Canvas canvas, char[] cArr, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        canvas.drawTextRun(cArr, i10, i11, i12, i13, f10, f11, z10, paint);
    }
}
