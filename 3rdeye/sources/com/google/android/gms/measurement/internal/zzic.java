package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
@TargetApi(14)
/* loaded from: classes2.dex */
final class zzic implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzid zza;

    public /* synthetic */ zzic(zzid zzidVar, zzib zzibVar) {
        this.zza = zzidVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        zzic zzicVar;
        zzfy zzfyVar;
        Intent intent;
        try {
            try {
                this.zza.zzs.zzay().zzj().zza("onActivityCreated");
                intent = activity.getIntent();
            } catch (RuntimeException e4) {
                e = e4;
                zzicVar = this;
            } catch (Throwable th) {
                th = th;
                zzicVar = this;
                zzicVar.zza.zzs.zzs().zzr(activity, bundle);
                throw th;
            }
            if (intent == null) {
                zzfyVar = this.zza.zzs;
            } else {
                Uri data = intent.getData();
                if (data == null || !data.isHierarchical()) {
                    zzfyVar = this.zza.zzs;
                } else {
                    this.zza.zzs.zzv();
                    String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    String str = ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : "auto";
                    String queryParameter = data.getQueryParameter("referrer");
                    zzicVar = this;
                    try {
                        this.zza.zzs.zzaz().zzp(new zzia(zzicVar, bundle == null, data, str, queryParameter));
                        zzfyVar = zzicVar.zza.zzs;
                    } catch (RuntimeException e10) {
                        e = e10;
                        zzicVar.zza.zzs.zzay().zzd().zzb("Throwable caught in onActivityCreated", e);
                        zzfyVar = zzicVar.zza.zzs;
                        zzfyVar.zzs().zzr(activity, bundle);
                    }
                }
            }
            zzfyVar.zzs().zzr(activity, bundle);
        } catch (Throwable th2) {
            th = th2;
            zzicVar.zza.zzs.zzs().zzr(activity, bundle);
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzs.zzs().zzs(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) throws IllegalStateException {
        this.zza.zzs.zzs().zzt(activity);
        zzki zzkiVarZzu = this.zza.zzs.zzu();
        zzkiVarZzu.zzs.zzaz().zzp(new zzkb(zzkiVarZzu, zzkiVarZzu.zzs.zzav().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) throws IllegalStateException {
        zzki zzkiVarZzu = this.zza.zzs.zzu();
        zzkiVarZzu.zzs.zzaz().zzp(new zzka(zzkiVarZzu, zzkiVarZzu.zzs.zzav().elapsedRealtime()));
        this.zza.zzs.zzs().zzu(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzs.zzs().zzv(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
