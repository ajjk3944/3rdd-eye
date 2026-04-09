package Sh;

import Bh.L;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Sh.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3509i {
    public static final C3508h a(Bh.G module, L notFoundClasses, oi.n storageManager, v kotlinClassFinder, Yh.e jvmMetadataVersion) {
        AbstractC6492s.i(module, "module");
        AbstractC6492s.i(notFoundClasses, "notFoundClasses");
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(kotlinClassFinder, "kotlinClassFinder");
        AbstractC6492s.i(jvmMetadataVersion, "jvmMetadataVersion");
        C3508h c3508h = new C3508h(module, notFoundClasses, storageManager, kotlinClassFinder);
        c3508h.S(jvmMetadataVersion);
        return c3508h;
    }
}
