package com.vungle.ads.internal.executor;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.singular.sdk.internal.Constants;
import com.vungle.ads.internal.executor.i;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;
import n5.C5361D;
import n5.v;
import p9.InterfaceC5480a;
import s5.C5576b;
import s5.C5578d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23806b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23807c;

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.f23805a = i;
        this.f23806b = obj;
        this.f23807c = obj2;
    }

    private final Object a() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i;
        ComponentName componentNameStartService;
        Context context = (Context) this.f23806b;
        Intent intent = (Intent) this.f23807c;
        v vVarA = v.a();
        vVarA.getClass();
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        vVarA.f44379d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        synchronized (vVarA) {
            try {
                str = vVarA.f44376a;
                if (str == null) {
                    ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                    if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                    } else {
                        if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                            if (str2.startsWith(".")) {
                                vVarA.f44376a = context.getPackageName() + serviceInfo.name;
                            } else {
                                vVarA.f44376a = serviceInfo.name;
                            }
                            str = vVarA.f44376a;
                        }
                        Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                    }
                    str = null;
                }
            } finally {
            }
        }
        if (str != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
            }
            intent2.setClassName(context.getPackageName(), str);
        }
        try {
            if (vVarA.c(context)) {
                componentNameStartService = C5361D.c(context, intent2);
            } else {
                componentNameStartService = context.startService(intent2);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                i = 404;
            } else {
                i = -1;
            }
        } catch (IllegalStateException e4) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e4);
            i = 402;
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e10);
            i = 401;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f23805a) {
            case 0:
                return i.a.m47getWrappedCallableWithFallback$lambda0((Callable) this.f23806b, (InterfaceC5480a) this.f23807c);
            case 1:
                return a();
            default:
                C5576b c5576b = (C5576b) this.f23806b;
                com.google.firebase.remoteconfig.internal.b bVar = (com.google.firebase.remoteconfig.internal.b) this.f23807c;
                C5578d c5578d = c5576b.f46071b;
                synchronized (c5578d) {
                    FileOutputStream fileOutputStreamOpenFileOutput = c5578d.f46081a.openFileOutput(c5578d.f46082b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(bVar.f23298a.toString().getBytes(Constants.ENCODING));
                    } finally {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
                return null;
        }
    }
}
