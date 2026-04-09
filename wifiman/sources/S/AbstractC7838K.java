package s;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import mh.InterfaceC6835l;

/* renamed from: s.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7838K {

    /* renamed from: a, reason: collision with root package name */
    private static final J0.v f60664a = new J0.v("MagnifierPositionInRoot", null, 2, null);

    public static final boolean a(float f10, float f11) {
        return (Float.isNaN(f10) && Float.isNaN(f11)) || f10 == f11;
    }

    public static final J0.v b() {
        return f60664a;
    }

    public static final boolean c(int i10) {
        return i10 >= 28;
    }

    public static /* synthetic */ boolean d(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Build.VERSION.SDK_INT;
        }
        return c(i10);
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, InterfaceC6835l interfaceC6835l3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, V v10) {
        if (d(0, 1, null)) {
            return eVar.b0(new MagnifierElement(interfaceC6835l, interfaceC6835l2, interfaceC6835l3, f10, z10, j10, f11, f12, z11, v10 == null ? V.f60693a.a() : v10, null));
        }
        return eVar;
    }
}
