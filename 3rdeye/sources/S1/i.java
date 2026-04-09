package S1;

import R1.d;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* compiled from: WebMessageListenerAdapter.java */
/* loaded from: classes.dex */
public final class i implements WebMessageListenerBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    public d.a f11854a;

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        /*
            r7 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebMessageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class
            java.lang.Object r9 = ka.a.a(r0, r9)
            org.chromium.support_lib_boundary.WebMessageBoundaryInterface r9 = (org.chromium.support_lib_boundary.WebMessageBoundaryInterface) r9
            java.lang.reflect.InvocationHandler[] r0 = r9.getPorts()
            int r1 = r0.length
            I9.g[] r1 = new I9.g[r1]
            r2 = 0
        L10:
            int r3 = r0.length
            if (r2 >= r3) goto L29
            S1.j r3 = new S1.j
            r4 = r0[r2]
            r3.<init>()
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface> r5 = org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface.class
            java.lang.Object r4 = ka.a.a(r5, r4)
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r4 = (org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface) r4
            r3.f11855b = r4
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L29:
            S1.a$d r0 = S1.k.f11856a
            boolean r0 = r0.d()
            if (r0 == 0) goto L5e
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface.class
            java.lang.reflect.InvocationHandler r9 = r9.getMessagePayload()
            java.lang.Object r9 = ka.a.a(r0, r9)
            org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface r9 = (org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface) r9
            int r0 = r9.getType()
            if (r0 == 0) goto L54
            r1 = 1
            if (r0 == r1) goto L49
            r9 = 0
            r3 = r9
            goto L68
        L49:
            R1.c r0 = new R1.c
            byte[] r9 = r9.getAsArrayBuffer()
            r0.<init>(r9)
        L52:
            r3 = r0
            goto L68
        L54:
            R1.c r0 = new R1.c
            java.lang.String r9 = r9.getAsString()
            r0.<init>(r9)
            goto L52
        L5e:
            R1.c r0 = new R1.c
            java.lang.String r9 = r9.getData()
            r0.<init>(r9)
            goto L52
        L68:
            if (r3 == 0) goto L86
            java.lang.Class<org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface> r9 = org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.class
            java.lang.Object r9 = ka.a.a(r9, r12)
            org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r9 = (org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface) r9
            S1.f r12 = new S1.f
            r12.<init>(r9)
            java.lang.Object r9 = r9.getOrCreatePeer(r12)
            r6 = r9
            S1.g r6 = (S1.g) r6
            R1.d$a r1 = r7.f11854a
            r2 = r8
            r4 = r10
            r5 = r11
            r1.onPostMessage(r2, r3, r4, r5, r6)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.i.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }
}
