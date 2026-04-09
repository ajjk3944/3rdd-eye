package p6;

import java.lang.reflect.InvocationTargetException;
import km.y;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final n f31394a;

    static {
        n eVar;
        try {
            eVar = new y(9, (WebViewProviderFactoryBoundaryInterface) jm.a.f(WebViewProviderFactoryBoundaryInterface.class, wb.e.r()));
        } catch (ClassNotFoundException unused) {
            eVar = new e();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
        f31394a = eVar;
    }
}
