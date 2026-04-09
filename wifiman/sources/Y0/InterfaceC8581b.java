package y0;

import androidx.compose.ui.platform.w1;
import dh.InterfaceC5380e;
import mh.InterfaceC6839p;

/* renamed from: y0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC8581b extends Y0.d {
    static /* synthetic */ Object s1(InterfaceC8581b interfaceC8581b, EnumC8595p enumC8595p, InterfaceC5380e interfaceC5380e, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i10 & 1) != 0) {
            enumC8595p = EnumC8595p.Main;
        }
        return interfaceC8581b.A1(enumC8595p, interfaceC5380e);
    }

    Object A1(EnumC8595p enumC8595p, InterfaceC5380e interfaceC5380e);

    Object O0(long j10, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e);

    Object T1(long j10, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e);

    C8593n Z();

    w1 getViewConfiguration();

    long h();

    long n1();
}
