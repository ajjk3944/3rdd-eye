package o5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import p5.b;

/* renamed from: o5.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7076A {

    /* renamed from: a, reason: collision with root package name */
    public static final C7076A f55320a = new C7076A();

    /* renamed from: b, reason: collision with root package name */
    private static final Z4.a f55321b;

    static {
        Z4.a aVarI = new b5.d().j(C7082c.f55380a).k(true).i();
        AbstractC6492s.h(aVarI, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        f55321b = aVarI;
    }

    private C7076A() {
    }

    private final EnumC7083d d(p5.b bVar) {
        return bVar == null ? EnumC7083d.COLLECTION_SDK_NOT_INSTALLED : bVar.b() ? EnumC7083d.COLLECTION_ENABLED : EnumC7083d.COLLECTION_DISABLED;
    }

    public final z a(com.google.firebase.f firebaseApp, y sessionDetails, q5.f sessionsSettings, Map subscribers, String firebaseInstallationId, String firebaseAuthenticationToken) {
        AbstractC6492s.i(firebaseApp, "firebaseApp");
        AbstractC6492s.i(sessionDetails, "sessionDetails");
        AbstractC6492s.i(sessionsSettings, "sessionsSettings");
        AbstractC6492s.i(subscribers, "subscribers");
        AbstractC6492s.i(firebaseInstallationId, "firebaseInstallationId");
        AbstractC6492s.i(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new z(EnumC7088i.SESSION_START, new C7078C(sessionDetails.b(), sessionDetails.a(), sessionDetails.c(), sessionDetails.d(), new C7084e(d((p5.b) subscribers.get(b.a.PERFORMANCE)), d((p5.b) subscribers.get(b.a.CRASHLYTICS)), sessionsSettings.b()), firebaseInstallationId, firebaseAuthenticationToken), b(firebaseApp));
    }

    public final C7081b b(com.google.firebase.f firebaseApp) throws PackageManager.NameNotFoundException {
        AbstractC6492s.i(firebaseApp, "firebaseApp");
        Context contextK = firebaseApp.k();
        AbstractC6492s.h(contextK, "firebaseApp.applicationContext");
        String packageName = contextK.getPackageName();
        PackageInfo packageInfo = contextK.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String strC = firebaseApp.n().c();
        AbstractC6492s.h(strC, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        AbstractC6492s.h(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        AbstractC6492s.h(RELEASE, "RELEASE");
        t tVar = t.LOG_ENVIRONMENT_PROD;
        AbstractC6492s.h(packageName, "packageName");
        String str = packageInfo.versionName;
        String str2 = str == null ? strValueOf : str;
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC6492s.h(MANUFACTURER, "MANUFACTURER");
        v vVar = v.f55441a;
        Context contextK2 = firebaseApp.k();
        AbstractC6492s.h(contextK2, "firebaseApp.applicationContext");
        u uVarD = vVar.d(contextK2);
        Context contextK3 = firebaseApp.k();
        AbstractC6492s.h(contextK3, "firebaseApp.applicationContext");
        return new C7081b(strC, MODEL, "2.0.9", RELEASE, tVar, new C7080a(packageName, str2, strValueOf, MANUFACTURER, uVarD, vVar.c(contextK3)));
    }

    public final Z4.a c() {
        return f55321b;
    }
}
