package m0;

import android.graphics.Shader;
import android.os.Build;
import m0.m1;

/* renamed from: m0.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6691a0 {
    public static final Shader.TileMode a(int i10) {
        m1.a aVar = m1.f52935a;
        if (m1.f(i10, aVar.a())) {
            return Shader.TileMode.CLAMP;
        }
        if (m1.f(i10, aVar.d())) {
            return Shader.TileMode.REPEAT;
        }
        if (m1.f(i10, aVar.c())) {
            return Shader.TileMode.MIRROR;
        }
        if (m1.f(i10, aVar.b()) && Build.VERSION.SDK_INT >= 31) {
            return o1.f52941a.b();
        }
        return Shader.TileMode.CLAMP;
    }
}
