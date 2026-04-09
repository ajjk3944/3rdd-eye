package b8;

import android.app.Application;
import android.content.SharedPreferences;

/* compiled from: FtueRepositoryImpl.kt */
/* renamed from: b8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1991a {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f18073a;

    public C1991a(Application application) {
        this.f18073a = application.getSharedPreferences("ftue_analytics", 0);
    }
}
