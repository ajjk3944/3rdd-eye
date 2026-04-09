package a8;

import android.app.Application;
import android.content.SharedPreferences;

/* compiled from: PropertiesRepositoryImpl.java */
/* renamed from: a8.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1673e {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f14248a;

    public C1673e(Application application) {
        this.f14248a = application.getSharedPreferences("com.zipoapps.blytics.properties.global", 0);
    }
}
