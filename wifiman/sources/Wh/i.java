package Wh;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class i {
    public static final boolean a(a version) {
        AbstractC6492s.i(version, "version");
        return (version.a() == 1 && version.b() >= 4) || version.a() > 1;
    }

    public static final boolean b(a version) {
        AbstractC6492s.i(version, "version");
        return a(version);
    }
}
