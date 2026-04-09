package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.List;

/* compiled from: ImageOutputConfig.java */
/* renamed from: androidx.camera.core.impl.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1696j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f15063a = 0;

    static {
        C1683d c1683d = InterfaceC1698k0.f15074l;
    }

    public static int a(InterfaceC1698k0 interfaceC1698k0) {
        return ((Integer) interfaceC1698k0.o(InterfaceC1698k0.f15076n, -1)).intValue();
    }

    public static ArrayList b(InterfaceC1698k0 interfaceC1698k0) {
        List list = (List) interfaceC1698k0.o(InterfaceC1698k0.f15083u, null);
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    public static int c(InterfaceC1698k0 interfaceC1698k0) {
        return ((Integer) interfaceC1698k0.o(InterfaceC1698k0.f15077o, -1)).intValue();
    }

    public static int d(InterfaceC1698k0 interfaceC1698k0) {
        return ((Integer) interfaceC1698k0.b(InterfaceC1698k0.f15074l)).intValue();
    }

    public static int e(InterfaceC1698k0 interfaceC1698k0) {
        return ((Integer) interfaceC1698k0.o(InterfaceC1698k0.f15075m, 0)).intValue();
    }

    public static void f(InterfaceC1698k0 interfaceC1698k0) {
        boolean zD = interfaceC1698k0.D();
        boolean z10 = interfaceC1698k0.z() != null;
        if (zD && z10) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (interfaceC1698k0.s() != null) {
            if (zD || z10) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }
}
