package androidx.camera.core.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* compiled from: ConvergenceUtils.java */
/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public static final Set<EnumC1719w> f14979a = Collections.unmodifiableSet(EnumSet.of(EnumC1719w.PASSIVE_FOCUSED, EnumC1719w.PASSIVE_NOT_FOCUSED, EnumC1719w.LOCKED_FOCUSED, EnumC1719w.LOCKED_NOT_FOCUSED));

    /* renamed from: b, reason: collision with root package name */
    public static final Set<EnumC1721y> f14980b = Collections.unmodifiableSet(EnumSet.of(EnumC1721y.CONVERGED, EnumC1721y.UNKNOWN));

    /* renamed from: c, reason: collision with root package name */
    public static final Set<EnumC1716u> f14981c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set<EnumC1716u> f14982d;

    static {
        EnumC1716u enumC1716u = EnumC1716u.CONVERGED;
        EnumC1716u enumC1716u2 = EnumC1716u.FLASH_REQUIRED;
        EnumC1716u enumC1716u3 = EnumC1716u.UNKNOWN;
        Set<EnumC1716u> setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(enumC1716u, enumC1716u2, enumC1716u3));
        f14981c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(enumC1716u2);
        enumSetCopyOf.remove(enumC1716u3);
        f14982d = Collections.unmodifiableSet(enumSetCopyOf);
    }
}
