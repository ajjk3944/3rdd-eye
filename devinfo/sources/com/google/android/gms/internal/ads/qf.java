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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qf extends zf {

    /* renamed from: k, reason: collision with root package name */
    public static final mx0 f15332k = new mx0(9);

    /* renamed from: h, reason: collision with root package name */
    public final vc f15333h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f15334i;
    public final be j;

    public qf(ff ffVar, zc zcVar, int i4, Context context, vc vcVar, be beVar) {
        super(ffVar, "ZQJAB1msowxCz8mqmvl8OKnBprztAFjM8nst6XEIBWdYMrqlQRx5Smd7STWtlGuv", "xxbBAKX4fynezd8sgu9AN42lCipqUqelmvdX3g0EV6w=", zcVar, i4, 27);
        this.f15334i = context;
        this.f15333h = vcVar;
        this.j = beVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001d, B:14:0x0029, B:16:0x0033, B:64:0x00f1, B:65:0x00f7, B:21:0x0041, B:23:0x0047, B:63:0x00ee, B:24:0x004d, B:26:0x0075, B:28:0x007b, B:30:0x0081, B:33:0x0089, B:39:0x0095, B:41:0x009b, B:45:0x00a6, B:47:0x00ad, B:46:0x00ab, B:48:0x00b0, B:50:0x00b6, B:52:0x00bc, B:42:0x00a0, B:55:0x00c3, B:57:0x00de, B:61:0x00e7), top: B:83:0x000d }] */
    @Override // com.google.android.gms.internal.ads.zf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qf.a():void");
    }

    public final String b() throws CertificateException {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            pk pkVar = sk.Z2;
            va.s sVar = va.s.f36163e;
            byte[] bArrA = hf.a((String) sVar.f36166c.a(pkVar));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrA)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(hf.a((String) sVar.f36166c.a(sk.f16037a3)))));
            }
            Context context = this.f15334i;
            String packageName = context.getPackageName();
            ExecutorService executorService = this.f19072a.f11117b;
            return bg.a(context, packageName, arrayList);
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public final yd c() {
        String str;
        h91 h91Var;
        pk pkVar = sk.f16192k3;
        va.s sVar = va.s.f36163e;
        int iIntValue = ((Boolean) sVar.f36166c.a(pkVar)).booleanValue() ? ((Integer) sVar.f36166c.a(sk.f16286q3)).intValue() : this.f15333h.B();
        yd ydVar = new yd((String) this.f19076e.invoke(null, this.f15334i, Boolean.FALSE, ""));
        be beVar = this.j;
        if (beVar == null || (h91Var = beVar.f9653a) == null) {
            str = "E";
        } else {
            try {
                str = (String) h91Var.get(iIntValue, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
        }
        ydVar.H = str;
        return ydVar;
    }
}
