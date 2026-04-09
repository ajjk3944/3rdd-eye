package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: j$.util.stream.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2449k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f21104a = 0;

    static {
        EnumC2439i enumC2439i = EnumC2439i.CONCURRENT;
        EnumC2439i enumC2439i2 = EnumC2439i.UNORDERED;
        EnumC2439i enumC2439i3 = EnumC2439i.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC2439i, enumC2439i2, enumC2439i3));
        Collections.unmodifiableSet(EnumSet.of(enumC2439i, enumC2439i2));
        Collections.unmodifiableSet(EnumSet.of(enumC2439i3));
        Collections.unmodifiableSet(EnumSet.of(enumC2439i2, enumC2439i3));
        Set set = Collections.EMPTY_SET;
        Collections.unmodifiableSet(EnumSet.of(enumC2439i2));
    }

    public static void a(double[] dArr, double d6) {
        double d7 = d6 - dArr[1];
        double d8 = dArr[0];
        double d9 = d8 + d7;
        dArr[1] = (d9 - d8) - d7;
        dArr[0] = d9;
    }
}
