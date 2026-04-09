package defpackage;

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

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class st1 extends hu1 {
    public static final zs1 k = new zs1(13);
    public final yq1 h;
    public final Context i;
    public final t83 j;

    public st1(jt1 jt1Var, fr1 fr1Var, int i, Context context, yq1 yq1Var, t83 t83Var) {
        super(jt1Var, "yYlfo3JOLIfvdgBq3U3deu0pC6YiXdEdqGnVULE/KCllAkaO/XSsVQU+sKDN/uG0", "5ZNtOO3srzHnbl5PLlxEIuHlg0l+6HDun864hT7P5ko=", fr1Var, i, 27);
        this.i = context;
        this.h = yq1Var;
        this.j = t83Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001d, B:14:0x0029, B:16:0x0033, B:64:0x00ed, B:65:0x00f3, B:21:0x0041, B:23:0x0047, B:63:0x00ea, B:24:0x004d, B:26:0x0075, B:28:0x007b, B:30:0x0081, B:33:0x0089, B:39:0x0095, B:41:0x009b, B:45:0x00a6, B:47:0x00ad, B:46:0x00ab, B:48:0x00b0, B:50:0x00b6, B:52:0x00bc, B:42:0x00a0, B:55:0x00c3, B:57:0x00d8, B:61:0x00e1), top: B:83:0x000d }] */
    @Override // defpackage.hu1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st1.a():void");
    }

    public final String b() throws CertificateException {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            iz1 iz1Var = mz1.I2;
            tw1 tw1Var = tw1.e;
            byte[] bArrA = lt1.a((String) tw1Var.c.a(iz1Var));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrA)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(lt1.a((String) tw1Var.c.a(mz1.J2)))));
            }
            Context context = this.i;
            String packageName = context.getPackageName();
            ExecutorService executorService = this.a.b;
            return i30.Z(context, packageName, arrayList);
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public final es1 c() {
        String str;
        ar3 ar3Var;
        iz1 iz1Var = mz1.T2;
        tw1 tw1Var = tw1.e;
        int iIntValue = ((Boolean) tw1Var.c.a(iz1Var)).booleanValue() ? ((Integer) tw1Var.c.a(mz1.Z2)).intValue() : this.h.B();
        es1 es1Var = new es1((String) this.e.invoke(null, this.i, Boolean.FALSE, ""));
        t83 t83Var = this.j;
        if (t83Var == null || (ar3Var = (ar3) t83Var.g) == null) {
            str = "E";
        } else {
            try {
                str = (String) ar3Var.get(iIntValue, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
        }
        es1Var.t = str;
        return es1Var;
    }
}
