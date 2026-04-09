package U0;

import d5.y;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final o f3687a;

    static {
        o eVar;
        try {
            eVar = new j(16, (WebViewProviderFactoryBoundaryInterface) I5.b.e(WebViewProviderFactoryBoundaryInterface.class, y.j()));
        } catch (ClassNotFoundException unused) {
            eVar = new e();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
        f3687a = eVar;
    }
}
