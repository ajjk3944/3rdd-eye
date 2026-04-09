package q6;

import android.graphics.Path;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: q6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7430a {
    public static final void a(Path path, float f10, float f11, float f12, float f13, float f14) {
        AbstractC6492s.i(path, "<this>");
        float f15 = (f12 >= f10 ? 1.0f : -1.0f) * f14;
        path.cubicTo(f10 + f15, f11, f12 - f15, f13, f12, f13);
    }
}
