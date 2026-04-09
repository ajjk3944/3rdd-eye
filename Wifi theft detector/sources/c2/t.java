package c2;

import androidx.webkit.WebMessageCompat;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* loaded from: classes.dex */
public abstract class t implements WebMessageBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f4659a = {"WEB_MESSAGE_ARRAY_BUFFER"};

    public static b2.f[] a(InvocationHandler[] invocationHandlerArr) {
        b2.f[] fVarArr = new b2.f[invocationHandlerArr.length];
        for (int i10 = 0; i10 < invocationHandlerArr.length; i10++) {
            fVarArr[i10] = new v(invocationHandlerArr[i10]);
        }
        return fVarArr;
    }

    public static WebMessageCompat b(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        b2.f[] fVarArrA = a(webMessageBoundaryInterface.getPorts());
        if (!x.C.c()) {
            return new WebMessageCompat(webMessageBoundaryInterface.getData(), fVarArrA);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) da.a.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new WebMessageCompat(webMessagePayloadBoundaryInterface.getAsString(), fVarArrA);
        }
        if (type != 1) {
            return null;
        }
        return new WebMessageCompat(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), fVarArrA);
    }
}
