package d8;

import a8.AbstractC1669a;
import android.annotation.SuppressLint;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.zipoapps.premiumhelper.d;
import kotlin.jvm.internal.l;
import va.a;

/* compiled from: FirebasePlatform.java */
/* renamed from: d8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4281a extends AbstractC1669a {

    /* renamed from: b, reason: collision with root package name */
    public FirebaseAnalytics f37534b;

    @Override // a8.AbstractC1669a
    @SuppressLint({"MissingPermission"})
    public final void a(d dVar, boolean z10) {
        super.a(dVar, z10);
        this.f37534b = FirebaseAnalytics.getInstance(dVar);
        a.b bVar = va.a.f47104a;
        bVar.o("FirebasePlatform");
        bVar.g("Initialized", new Object[0]);
    }

    @Override // a8.AbstractC1669a
    public final void d(String str) {
        FirebaseAnalytics firebaseAnalytics = this.f37534b;
        if (str.length() > 36) {
            str = str.substring(0, 36);
        }
        firebaseAnalytics.f23243a.zzM(str);
    }

    @Override // a8.AbstractC1669a
    public final void e(String str, String str2) {
        this.f37534b.f23243a.zzN(null, str, str2, false);
    }

    @Override // a8.AbstractC1669a
    public final void f(Bundle params, String str) {
        String string;
        FirebaseAnalytics firebaseAnalytics = this.f37534b;
        l.f(params, "params");
        for (String str2 : params.keySet()) {
            if ((params.get(str2) instanceof String) && (string = params.getString(str2)) != null && string.length() > 100) {
                String strSubstring = string.substring(0, 100);
                l.e(strSubstring, "substring(...)");
                params.putString(str2, strSubstring);
            }
        }
        firebaseAnalytics.f23243a.zzx(str, params);
    }

    @Override // a8.AbstractC1669a
    public final void b(c8.d dVar) {
    }

    @Override // a8.AbstractC1669a
    public final void c(c8.d dVar) {
    }
}
