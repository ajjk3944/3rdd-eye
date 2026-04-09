package B8;

import android.database.sqlite.SQLiteDatabase;
import b9.C1992A;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.settings.PHSettingsActivity;
import java.lang.reflect.Method;
import p9.InterfaceC5480a;
import va.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements InterfaceC5480a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f584b;

    public /* synthetic */ a(int i) {
        this.f584b = i;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        switch (this.f584b) {
            case 0:
                int i = PHSettingsActivity.f37122d;
                return C1992A.f18074a;
            case 1:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", new Class[0]);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 2:
                a.b bVar = va.a.f47104a;
                bVar.o("PhConsentManager");
                bVar.a("PHSplashActivity.onCreate()-> consent done", new Object[0]);
                return C1992A.f18074a;
            case 3:
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                return Boolean.valueOf(e.a.a().f37010B.b());
            default:
                return C1992A.f18074a;
        }
    }
}
