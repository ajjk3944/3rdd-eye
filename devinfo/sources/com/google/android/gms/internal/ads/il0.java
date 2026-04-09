package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class il0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12369a;

    /* renamed from: b, reason: collision with root package name */
    public final va.c3 f12370b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f12371c;

    public il0(Context context, va.c3 c3Var, ArrayList arrayList) {
        this.f12369a = context;
        this.f12370b = c3Var;
        this.f12371c = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void c(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        t50 t50Var = (t50) obj;
        if (((Boolean) xl.f18418a.u()).booleanValue()) {
            Bundle bundle = new Bundle();
            ya.f0 f0Var = ua.j.C.f35261c;
            String className = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.f12369a.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && (componentName = runningTaskInfo.topActivity) != null) {
                    className = componentName.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle.putString("activity", className);
            Bundle bundle2 = new Bundle();
            va.c3 c3Var = this.f12370b;
            bundle2.putInt("width", c3Var.f36042e);
            bundle2.putInt("height", c3Var.f36039b);
            bundle.putBundle("size", bundle2);
            ArrayList arrayList = this.f12371c;
            if (!arrayList.isEmpty()) {
                bundle.putParcelableArray("parents", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
            }
            t50Var.f16705a.putBundle("view_hierarchy", bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* synthetic */ void h(Object obj) {
    }
}
