package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.g7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1192g7 extends AbstractCallableC1676p7 {

    /* renamed from: k, reason: collision with root package name */
    public static final L6 f14220k = new L6(6);

    /* renamed from: h, reason: collision with root package name */
    public final O5 f14221h;
    public final Context i;

    /* renamed from: j, reason: collision with root package name */
    public final C1338iu f14222j;

    public C1192g7(X6 x6, S5 s5, int i, Context context, O5 o5, C1338iu c1338iu) {
        super(x6, "ZQJAB1msowxCz8mqmvl8OKnBprztAFjM8nst6XEIBWdYMrqlQRx5Smd7STWtlGuv", "xxbBAKX4fynezd8sgu9AN42lCipqUqelmvdX3g0EV6w=", s5, i, 27);
        this.i = context;
        this.f14221h = o5;
        this.f14222j = c1338iu;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001d, B:14:0x0029, B:16:0x0033, B:64:0x00f1, B:65:0x00f7, B:21:0x0041, B:23:0x0047, B:63:0x00ee, B:24:0x004d, B:26:0x0075, B:28:0x007b, B:30:0x0081, B:33:0x0089, B:39:0x0095, B:41:0x009b, B:45:0x00a6, B:47:0x00ad, B:46:0x00ab, B:48:0x00b0, B:50:0x00b6, B:52:0x00bc, B:42:0x00a0, B:55:0x00c3, B:57:0x00de, B:61:0x00e7), top: B:83:0x000d }] */
    @Override // com.google.android.gms.internal.ads.AbstractCallableC1676p7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1192g7.a():void");
    }

    public final String b() throws CertificateException {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            E9 e9 = H9.Z2;
            C2841s c2841s = C2841s.f23267e;
            byte[] bArrA = Z6.a((String) c2841s.f23270c.a(e9));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrA)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(Z6.a((String) c2841s.f23270c.a(H9.f8711a3)))));
            }
            Context context = this.i;
            String packageName = context.getPackageName();
            ExecutorService executorService = this.f16130a.f12376b;
            return AbstractC0709Rg.e(context, packageName, arrayList);
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public final C1782r6 c() {
        String str;
        TD td;
        E9 e9 = H9.f8773k3;
        C2841s c2841s = C2841s.f23267e;
        int iIntValue = ((Boolean) c2841s.f23270c.a(e9)).booleanValue() ? ((Integer) c2841s.f23270c.a(H9.q3)).intValue() : this.f14221h.B();
        C1782r6 c1782r6 = new C1782r6((String) this.f16134e.invoke(null, this.i, Boolean.FALSE, ""));
        C1338iu c1338iu = this.f14222j;
        if (c1338iu == null || (td = (TD) c1338iu.f14822b) == null) {
            str = "E";
        } else {
            try {
                str = (String) td.get(iIntValue, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
        }
        c1782r6.f16466H = str;
        return c1782r6;
    }
}
