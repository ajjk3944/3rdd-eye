package com.google.android.gms.measurement.internal;

import I4.d;
import I4.t;
import android.util.Log;
import c5.C2065a;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.LanguageActivity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import d0.InterfaceC4256C;
import e7.k;
import h7.C4422c;
import java.util.HashMap;
import qa.h;
import z7.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements k, Continuation, TextInputLayout.e, SuccessContinuation, d, c {
    public static boolean c(InterfaceC4256C interfaceC4256C, int i, int i10) {
        if (interfaceC4256C.i(i, i10)) {
            return true;
        }
        return interfaceC4256C.d() && interfaceC4256C.i(i10, i);
    }

    public static float e(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static String f(String str, h hVar) {
        return str + hVar;
    }

    public static HashMap h(Class cls, C2065a.C0279a c0279a) {
        HashMap map = new HashMap();
        map.put(cls, c0279a);
        return map;
    }

    public static void i(int i, String str, String str2) {
        Log.d(str2, str + i);
    }

    public static void j(LanguageActivity languageActivity, int i, int i10, int i11, int i12) {
        languageActivity.findViewById(i).setVisibility(i10);
        languageActivity.findViewById(i11).setVisibility(i12);
    }

    public static void k(zzfy zzfyVar, String str) {
        zzfyVar.zzay().zzd().zza(str);
    }

    public static void l(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    @Override // e7.k
    public boolean a() {
        return true;
    }

    @Override // z7.c
    public void b(Exception exc) {
        int i = C4422c.f38270a;
    }

    @Override // z7.c
    public void d(Exception exc) {
        int i = C4422c.f38270a;
    }

    @Override // I4.d
    public Object g(t tVar) {
        return FirebaseSessionsRegistrar.getComponents$lambda$3(tVar);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return 403;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(null);
    }
}
