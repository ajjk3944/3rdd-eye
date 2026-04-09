package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import m5.h;

/* loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? i(installerPackageName) : "";
    }

    private static String i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m5.c.c());
        arrayList.add(e5.f.f());
        arrayList.add(m5.h.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(m5.h.b("fire-core", "21.0.0"));
        arrayList.add(m5.h.b("device-name", i(Build.PRODUCT)));
        arrayList.add(m5.h.b("device-model", i(Build.DEVICE)));
        arrayList.add(m5.h.b("device-brand", i(Build.BRAND)));
        arrayList.add(m5.h.c("android-target-sdk", new h.a() { // from class: com.google.firebase.h
            @Override // m5.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.e((Context) obj);
            }
        }));
        arrayList.add(m5.h.c("android-min-sdk", new h.a() { // from class: com.google.firebase.i
            @Override // m5.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.f((Context) obj);
            }
        }));
        arrayList.add(m5.h.c("android-platform", new h.a() { // from class: com.google.firebase.j
            @Override // m5.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.g((Context) obj);
            }
        }));
        arrayList.add(m5.h.c("android-installer", new h.a() { // from class: com.google.firebase.k
            @Override // m5.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.h((Context) obj);
            }
        }));
        String strA = m5.e.a();
        if (strA != null) {
            arrayList.add(m5.h.b("kotlin", strA));
        }
        return arrayList;
    }
}
