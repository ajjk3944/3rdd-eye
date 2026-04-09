package N;

import C.C0624k;
import C.k0;
import P.d;
import P7.x;
import android.app.Activity;
import android.content.Context;
import androidx.preference.Preference;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.preferences.PremiumPreference;
import i8.C4461a;
import java.util.Date;
import va.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements k0.e, UserMessagingPlatform.OnConsentFormLoadFailureListener, Continuation, Preference.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4387c;

    public /* synthetic */ g(Object obj, Object obj2) {
        this.f4386b = obj;
        this.f4387c = obj2;
    }

    @Override // androidx.preference.Preference.c
    public boolean e(Preference preference) {
        kotlin.jvm.internal.l.f(preference, "preference");
        PremiumPreference premiumPreference = (PremiumPreference) this.f4386b;
        if (!premiumPreference.A()) {
            return false;
        }
        if (!(((Context) this.f4387c) instanceof Activity)) {
            return true;
        }
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        com.zipoapps.premiumhelper.e.k(e.a.a(), C4461a.EnumC0466a.PREFERENCE + "_" + premiumPreference.f16257l);
        return true;
    }

    @Override // C.k0.e
    public void f(C0624k c0624k) {
        j jVar = (j) this.f4386b;
        jVar.getClass();
        d.e eVar = d.e.DEFAULT;
        if (((k0) this.f4387c).f733c.a() && c0624k.f727d) {
            eVar = d.e.YUV;
        }
        l lVar = jVar.f4397b;
        P.d.d(true, lVar.f4408a);
        P.d.c(lVar.f4410c);
        if (lVar.f4418l != eVar) {
            lVar.f4418l = eVar;
            lVar.k(lVar.f4419m);
        }
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public void onConsentFormLoadFailure(FormError formError) {
        a.b bVar = va.a.f47104a;
        bVar.o("x");
        bVar.c(formError.getMessage(), new Object[0]);
        x.a aVar = new x.a(formError, formError.getMessage());
        x.d dVar = (x.d) this.f4386b;
        dVar.f10835a = aVar;
        x xVar = (x) this.f4387c;
        xVar.f(dVar);
        xVar.d();
        xVar.f10829f = false;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        com.google.firebase.remoteconfig.internal.c cVar = (com.google.firebase.remoteconfig.internal.c) this.f4386b;
        Date date = (Date) this.f4387c;
        cVar.getClass();
        if (task.isSuccessful()) {
            com.google.firebase.remoteconfig.internal.d dVar = cVar.f23320h;
            synchronized (dVar.f23327b) {
                dVar.f23326a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
            return task;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return task;
        }
        if (exception instanceof r5.h) {
            cVar.f23320h.g();
            return task;
        }
        cVar.f23320h.f();
        return task;
    }
}
