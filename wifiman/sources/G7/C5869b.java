package g7;

import android.graphics.Color;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: g7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5869b {

    /* renamed from: a, reason: collision with root package name */
    public static final C5869b f47724a = new C5869b();

    private C5869b() {
    }

    public final void a(int i10, float[] dst) {
        AbstractC6492s.i(dst, "dst");
        dst[0] = Color.red(i10) / 255.0f;
        dst[1] = Color.green(i10) / 255.0f;
        dst[2] = Color.blue(i10) / 255.0f;
        dst[3] = Color.alpha(i10) / 255.0f;
    }
}
