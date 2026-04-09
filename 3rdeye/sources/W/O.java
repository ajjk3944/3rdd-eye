package W;

import C.k0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: StreamInfo.java */
/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public static final C1625m f13174a = new C1625m(0, a.INACTIVE, null);

    /* renamed from: b, reason: collision with root package name */
    public static final Set<Integer> f13175b = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));

    /* renamed from: c, reason: collision with root package name */
    public static final androidx.camera.core.impl.V f13176c = new androidx.camera.core.impl.V(new C1625m(0, a.ACTIVE, null));

    /* compiled from: StreamInfo.java */
    public enum a {
        ACTIVE,
        INACTIVE
    }

    public abstract int a();

    public abstract k0.d b();

    public abstract a c();
}
