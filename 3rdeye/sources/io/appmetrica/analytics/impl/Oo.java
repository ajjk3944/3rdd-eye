package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.FirstTimeLanguageActivity;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import y7.v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class Oo implements FunctionWithThrowable, j6.f, j6.v, l7.l, I4.d, v.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39948b;

    public /* synthetic */ Oo(int i) {
        this.f39948b = i;
    }

    public static Typeface b(int i, u6.a aVar) {
        return (i < 0 || i >= 350) ? (i < 350 || i >= 450) ? (i < 450 || i >= 600) ? aVar.getBold() : aVar.getMedium() : aVar.getRegular() : aVar.getLight();
    }

    public static androidx.camera.core.impl.M0 c(ArrayList arrayList, androidx.camera.core.impl.M0 m02) {
        arrayList.add(m02);
        return new androidx.camera.core.impl.M0();
    }

    public static String d(long j4, String str) {
        return str + j4;
    }

    public static String f(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String h(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static void i(int i, HashMap map, String str, int i10, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i10));
    }

    public static void j(SharedPreferences sharedPreferences, String str, boolean z10) {
        sharedPreferences.edit().putBoolean(str, z10).apply();
    }

    public static void k(FirstTimeLanguageActivity firstTimeLanguageActivity, int i, int i10, int i11, int i12) {
        firstTimeLanguageActivity.findViewById(i).setVisibility(i10);
        firstTimeLanguageActivity.findViewById(i11).setVisibility(i12);
    }

    @Override // y7.v.a
    public int a() {
        int i = y7.v.f48334v;
        return Integer.MAX_VALUE;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, I.a
    public Object apply(Object obj) {
        return C4545cn.b((Activity) obj);
    }

    @Override // l7.l
    public boolean e(Object obj) {
        return !((String) obj).isEmpty();
    }

    @Override // I4.d
    public Object g(I4.t tVar) {
        switch (this.f39948b) {
            case 5:
                Set setH = tVar.h(q5.d.class);
                q5.c cVar = q5.c.f45440b;
                if (cVar == null) {
                    synchronized (q5.c.class) {
                        try {
                            cVar = q5.c.f45440b;
                            if (cVar == null) {
                                cVar = new q5.c();
                                q5.c.f45440b = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return new q5.b(setH, cVar);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(tVar);
        }
    }
}
