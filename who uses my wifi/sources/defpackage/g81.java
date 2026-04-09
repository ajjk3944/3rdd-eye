package defpackage;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class g81 {
    public static final h81 a;

    static {
        h81 frVar;
        try {
            frVar = new sq0(8, (WebViewProviderFactoryBoundaryInterface) yb.e(WebViewProviderFactoryBoundaryInterface.class, ou1.m()));
        } catch (ClassNotFoundException unused) {
            frVar = new fr(3);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        a = frVar;
    }
}
