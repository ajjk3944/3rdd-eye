package fb;

import com.ui.unifi.core.base.net.client.http.InvalidNcaTokenException;
import gg.z;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import retrofit2.HttpException;
import xb.C8442c;
import xb.C8445f;

/* loaded from: classes3.dex */
public abstract class c {
    public static final z b(z zVar) {
        AbstractC6492s.i(zVar, "<this>");
        z zVarH = zVar.h(new C8445f(new C8442c(new InterfaceC6835l() { // from class: fb.b
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return c.c((HttpException) obj);
            }
        })));
        AbstractC6492s.h(zVarH, "compose(...)");
        return zVarH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable c(HttpException httpException) {
        AbstractC6492s.i(httpException, "httpException");
        int iA = httpException.a();
        if (iA == 401 || iA == 403) {
            return new InvalidNcaTokenException(httpException);
        }
        return null;
    }
}
