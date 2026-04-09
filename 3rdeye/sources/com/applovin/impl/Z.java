package com.applovin.impl;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class Z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18902b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f18903c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18905e;

    public /* synthetic */ Z(Context context, boolean z10, TaskCompletionSource taskCompletionSource) {
        this.f18904d = context;
        this.f18903c = z10;
        this.f18905e = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18902b) {
            case 0:
                l2.b(this.f18903c, (MaxNativeAdListener) this.f18904d, (MaxAd) this.f18905e);
                return;
            default:
                Context context = (Context) this.f18904d;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f18905e;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor editorEdit = n5.r.a(context).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (this.f18903c) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } else {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                    }
                    return;
                } finally {
                    taskCompletionSource.trySetResult(null);
                }
        }
    }

    public /* synthetic */ Z(boolean z10, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd) {
        this.f18903c = z10;
        this.f18904d = maxNativeAdListener;
        this.f18905e = maxAd;
    }
}
