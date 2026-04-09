package io.sentry.android.core;

import android.content.Context;
import android.content.Intent;
import io.sentry.b5;
import io.sentry.x5;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: i, reason: collision with root package name */
    public static volatile i0 f11592i;
    public static final io.sentry.util.a j = new io.sentry.util.a();

    /* renamed from: a, reason: collision with root package name */
    public final Context f11593a;

    /* renamed from: b, reason: collision with root package name */
    public final SentryAndroidOptions f11594b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f11595c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f11596d;

    /* renamed from: e, reason: collision with root package name */
    public final cc.f0 f11597e;

    /* renamed from: f, reason: collision with root package name */
    public final ab.g f11598f;

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.protocol.m f11599g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f11600h;

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        r6 = "su";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
    
        r6 = r9.f11673f.exec(new java.lang.String[]{"/system/xbin/which", "su"});
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
    
        r10 = new java.io.BufferedReader(new java.io.InputStreamReader(r6.getInputStream(), io.sentry.android.core.internal.util.k.f11667g));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e3, code lost:
    
        if (r10.readLine() == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e8, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00eb, code lost:
    
        r6.destroy();
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fd, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ff, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0101, code lost:
    
        r13.g(io.sentry.b5.DEBUG, "Error when trying to check if SU exists.", r0);
        r6 = r6;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0110, code lost:
    
        r13.m(io.sentry.b5.DEBUG, "SU isn't found on this Device.", new java.lang.Object[0]);
        r6 = r6;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0119, code lost:
    
        if (r6 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011c, code lost:
    
        r0 = false;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011d, code lost:
    
        if (r0 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011f, code lost:
    
        ir.f0.T(r13, "The ILogger object is required.");
        r0 = r9.f11668a.getPackageManager();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012a, code lost:
    
        if (r0 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012c, code lost:
    
        r6 = r9.f11672e;
        r9 = r6.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0132, code lost:
    
        r11 = r6[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0136, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 33) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0138, code lost:
    
        r0.getPackageInfo(r11, android.content.pm.PackageManager.PackageInfoFlags.of(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0140, code lost:
    
        r0.getPackageInfo(r11, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0143, code lost:
    
        r0 = true;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0145, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0148, code lost:
    
        r0 = false;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0149, code lost:
    
        if (r0 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014c, code lost:
    
        r0 = false;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0156, code lost:
    
        if (r6 != 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0158, code lost:
    
        r6.destroy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010a A[DONT_GENERATE, PHI: r6
  0x010a: PHI (r6v11 java.lang.Process) = (r6v38 java.lang.Process), (r6v39 java.lang.Process) binds: [B:60:0x0108, B:65:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014e A[EDGE_INSN: B:144:0x014e->B:84:0x014e BREAK  A[LOOP:0: B:29:0x009f->B:37:0x00be], PHI: r6
  0x014e: PHI (r6v24 ??) = (r6v14 ??), (r6v16 ??), (r6v6 java.lang.String), (r6v2 java.lang.String) binds: [B:68:0x011d, B:81:0x0149, B:144:0x014e, B:26:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0176 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i0(android.content.Context r17, io.sentry.android.core.SentryAndroidOptions r18) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.i0.<init>(android.content.Context, io.sentry.android.core.SentryAndroidOptions):void");
    }

    public static Float b(Intent intent, x5 x5Var) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th2) {
            x5Var.getLogger().g(b5.ERROR, "Error getting device battery level.", th2);
            return null;
        }
    }

    public static i0 c(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (f11592i == null) {
            io.sentry.q qVarA = j.a();
            try {
                if (f11592i == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    f11592i = new i0(context, sentryAndroidOptions);
                }
                qVarA.close();
            } catch (Throwable th2) {
                try {
                    qVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return f11592i;
    }

    public static Boolean d(Intent intent, x5 x5Var) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z10 = true;
            if (intExtra != 1 && intExtra != 2) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (Throwable th2) {
            x5Var.getLogger().g(b5.ERROR, "Error getting device charging state.", th2);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:0|2|(1:4)|5|(3:89|6|94)|(1:(21:9|(3:100|15|16)|24|(1:26)|27|91|28|(1:33)|96|34|38|(1:40)(1:41)|42|(3:98|44|48)|49|(1:51)|52|(1:54)|55|(9:59|(1:61)(1:62)|(5:64|87|65|(1:67)(1:71)|72)|73|(1:(1:77))(1:78)|79|(1:82)|83|(1:85))|86)(1:10))(1:13)|93|(0)|24|(0)|27|91|28|(0)|96|34|38|(0)(0)|42|(0)|49|(0)|52|(0)|55|(10:57|59|(0)(0)|(0)|73|(0)(0)|79|(1:82)|83|(0))|86|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        r7.g(io.sentry.b5.ERROR, "Error getting DisplayMetrics.", r8);
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dd, code lost:
    
        r2.getLogger().f(io.sentry.b5.ERROR, r7, "Error getting the device's boot time.", new java.lang.Object[0]);
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.sentry.protocol.f a(boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.i0.a(boolean, boolean):io.sentry.protocol.f");
    }
}
