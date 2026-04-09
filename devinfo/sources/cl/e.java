package cl;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final List f2911a;

    static {
        try {
            Iterator it = Arrays.asList(new yk.b()).iterator();
            nk.k.e(it, "<this>");
            f2911a = uk.i.I(new uk.a(new uk.j(1, it)));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
