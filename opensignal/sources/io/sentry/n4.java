package io.sentry;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.util.Log;
import com.airbnb.lottie.LottieAnimationView;
import io.sentry.android.core.ScreenshotEventProcessor;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class n4 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12449c;

    public /* synthetic */ n4(Object obj, int i10, Object obj2) {
        this.f12447a = i10;
        this.f12448b = obj;
        this.f12449c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21, types: [byte[]] */
    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        BufferedWriter bufferedWriter;
        ServiceInfo serviceInfo;
        String str;
        int i10;
        String str2 = null;
        switch (this.f12447a) {
            case 0:
                g1 g1Var = (g1) this.f12448b;
                i6 i6Var = (i6) this.f12449c;
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, r4.f12689d));
                    try {
                        g1Var.e(i6Var, bufferedWriter2);
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        bufferedWriter2.close();
                        byteArrayOutputStream2.close();
                        return byteArray;
                    } finally {
                        try {
                            bufferedWriter2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                } finally {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
            case 1:
                g1 g1Var2 = (g1) this.f12448b;
                g4 g4Var = (g4) this.f12449c;
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter3 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream3, r4.f12689d));
                    try {
                        g1Var2.e(g4Var, bufferedWriter3);
                        byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                        bufferedWriter3.close();
                        byteArrayOutputStream3.close();
                        return byteArray2;
                    } finally {
                        try {
                            bufferedWriter3.close();
                        } catch (Throwable th4) {
                            th.addSuppressed(th4);
                        }
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                    } catch (Throwable th5) {
                        th.addSuppressed(th5);
                    }
                }
            case 2:
                g1 g1Var3 = (g1) this.f12448b;
                io.sentry.clientreport.b bVar = (io.sentry.clientreport.b) this.f12449c;
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, r4.f12689d));
                    try {
                        g1Var3.e(bVar, bufferedWriter);
                        byte[] byteArray3 = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray3;
                    } finally {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th6) {
                            th.addSuppressed(th6);
                        }
                    }
                } finally {
                }
            case 3:
                g1 g1Var4 = (g1) this.f12448b;
                e5 e5Var = (e5) this.f12449c;
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, r4.f12689d));
                    try {
                        g1Var4.e(e5Var, bufferedWriter);
                        byte[] byteArray4 = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray4;
                    } finally {
                    }
                } finally {
                }
            case 4:
                return io.sentry.android.core.i0.c(((io.sentry.android.core.g0) this.f12448b).f11576a, (SentryAndroidOptions) this.f12449c);
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                ScreenshotEventProcessor screenshotEventProcessor = (ScreenshotEventProcessor) this.f12448b;
                Bitmap bitmap = (Bitmap) this.f12449c;
                u0 logger = screenshotEventProcessor.f11506a.getLogger();
                if (!bitmap.isRecycled()) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream4);
                            bitmap.recycle();
                            if (byteArrayOutputStream4.size() <= 0) {
                                logger.m(b5.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                                byteArrayOutputStream4.close();
                            } else {
                                ?? byteArray5 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                str2 = byteArray5;
                            }
                        } finally {
                        }
                    } catch (Throwable th7) {
                        logger.g(b5.ERROR, "Compressing bitmap failed.", th7);
                    }
                }
                return str2;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                Context context = (Context) this.f12448b;
                Intent intent = (Intent) this.f12449c;
                kg.r rVarH = kg.r.h();
                rVarH.getClass();
                Log.isLoggable("FirebaseMessaging", 3);
                ((ArrayDeque) rVarH.f14398r).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (rVarH) {
                    try {
                        String str3 = (String) rVarH.f14395a;
                        if (str3 != null) {
                            str2 = str3;
                        } else {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                io.sentry.android.core.e0.d("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str = serviceInfo.name) == null) {
                                io.sentry.android.core.e0.d("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            } else {
                                if (str.startsWith(".")) {
                                    rVarH.f14395a = context.getPackageName() + serviceInfo.name;
                                } else {
                                    rVarH.f14395a = serviceInfo.name;
                                }
                                str2 = (String) rVarH.f14395a;
                            }
                        }
                    } finally {
                    }
                }
                if (str2 != null) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    intent2.setClassName(context.getPackageName(), str2);
                }
                try {
                    if ((rVarH.n(context) ? kg.a0.c(context, intent2) : context.startService(intent2)) == null) {
                        io.sentry.android.core.e0.d("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i10 = 404;
                    } else {
                        i10 = -1;
                    }
                } catch (IllegalStateException e4) {
                    io.sentry.android.core.e0.d("FirebaseMessaging", "Failed to start service while in background: " + e4);
                    i10 = 402;
                } catch (SecurityException e10) {
                    io.sentry.android.core.e0.c("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e10);
                    i10 = 401;
                }
                return Integer.valueOf(i10);
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                og.b bVar2 = (og.b) this.f12448b;
                dv.d dVar = (dv.d) this.f12449c;
                pg.m mVar = bVar2.f19436i;
                synchronized (mVar.f20551b) {
                    mVar.f20550a.edit().putLong("fetch_timeout_in_seconds", dVar.f7597a).putLong("minimum_fetch_interval_in_seconds", dVar.f7598b).commit();
                }
                return null;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                pg.c cVar = (pg.c) this.f12448b;
                pg.d dVar2 = (pg.d) this.f12449c;
                pg.n nVar = cVar.f20495b;
                synchronized (nVar) {
                    FileOutputStream fileOutputStreamOpenFileOutput = nVar.f20555a.openFileOutput(nVar.f20556b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(dVar2.f20498a.toString().getBytes("UTF-8"));
                    } finally {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
                return null;
            default:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f12448b;
                String str4 = (String) this.f12449c;
                if (!lottieAnimationView.I) {
                    return r8.l.b(lottieAnimationView.getContext(), str4, null);
                }
                Context context2 = lottieAnimationView.getContext();
                HashMap map = r8.l.f21348a;
                return r8.l.b(context2, str4, "asset_" + str4);
        }
    }
}
