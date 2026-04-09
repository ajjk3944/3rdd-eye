package a8;

import android.app.Application;
import android.content.SharedPreferences;
import c8.C2074a;
import com.google.gson.Gson;
import com.google.gson.h;

/* compiled from: GlobalCounterRepository.java */
/* renamed from: a8.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1672d extends I9.g {

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f14247b;

    public C1672d(Application application) {
        this.f14247b = application.getSharedPreferences("com.zipoapps.blytics.counters.global", 0);
    }

    @Override // I9.g
    public final C2074a S(String str, String str2) {
        String strA = C2074a.a(str, str2);
        SharedPreferences sharedPreferences = this.f14247b;
        if (!sharedPreferences.contains(strA)) {
            return null;
        }
        return (C2074a) new Gson().b(C2074a.class, sharedPreferences.getString(C2074a.a(str, str2), null));
    }

    @Override // I9.g
    public final void a0(C2074a c2074a) throws h {
        this.f14247b.edit().putString(C2074a.a(c2074a.f18549a, c2074a.f18550b), new Gson().g(c2074a)).apply();
    }
}
