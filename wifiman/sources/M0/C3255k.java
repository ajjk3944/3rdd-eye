package M0;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: M0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3255k {

    /* renamed from: a, reason: collision with root package name */
    public static final C3255k f12411a = new C3255k();

    private C3255k() {
    }

    public final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i10, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z10, boolean z11, TextUtils.TruncateAt truncateAt, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("negative width");
        }
        if (i11 >= 0) {
            return Build.VERSION.SDK_INT >= 33 ? C3254j.a(charSequence, textPaint, i10, alignment, 1.0f, 0.0f, metrics, z10, z11, truncateAt, i11) : C3256l.a(charSequence, textPaint, i10, alignment, 1.0f, 0.0f, metrics, z10, truncateAt, i11);
        }
        throw new IllegalArgumentException("negative ellipsized width");
    }

    public final boolean b(BoringLayout boringLayout) {
        if (Build.VERSION.SDK_INT >= 33) {
            return C3254j.c(boringLayout);
        }
        return false;
    }

    public final BoringLayout.Metrics c(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return Build.VERSION.SDK_INT >= 33 ? C3254j.b(charSequence, textPaint, textDirectionHeuristic) : C3256l.b(charSequence, textPaint, textDirectionHeuristic);
    }
}
