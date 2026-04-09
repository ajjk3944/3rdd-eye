package O4;

import android.util.Log;
import java.util.Objects;
import x5.c;

/* compiled from: CrashlyticsAppQualitySessionsSubscriber.java */
/* renamed from: O4.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1465k implements x5.c {

    /* renamed from: a, reason: collision with root package name */
    public final J f10316a;

    /* renamed from: b, reason: collision with root package name */
    public final C1464j f10317b;

    public C1465k(J j4, T4.e eVar) {
        this.f10316a = j4;
        this.f10317b = new C1464j(eVar);
    }

    @Override // x5.c
    public final boolean a() {
        return this.f10316a.a();
    }

    @Override // x5.c
    public final c.a b() {
        return c.a.CRASHLYTICS;
    }

    @Override // x5.c
    public final void c(c.b bVar) {
        String str = "App Quality Sessions session changed: " + bVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        C1464j c1464j = this.f10317b;
        String str2 = bVar.f47786a;
        synchronized (c1464j) {
            if (!Objects.equals(c1464j.f10315c, str2)) {
                C1464j.a(c1464j.f10313a, c1464j.f10314b, str2);
                c1464j.f10315c = str2;
            }
        }
    }

    public final void d(String str) {
        C1464j c1464j = this.f10317b;
        synchronized (c1464j) {
            if (!Objects.equals(c1464j.f10314b, str)) {
                C1464j.a(c1464j.f10313a, str, c1464j.f10315c);
                c1464j.f10314b = str;
            }
        }
    }
}
