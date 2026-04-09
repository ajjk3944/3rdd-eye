package B;

import E.B;
import G3.b;
import I.m;
import I4.t;
import J8.H;
import a9.InterfaceC1676a;
import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.camera.core.impl.InterfaceC1700l0;
import androidx.preference.Preference;
import com.applovin.impl.A0;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.vungle.ads.L;
import com.vungle.ads.internal.i;
import com.zipoapps.premiumhelper.e;
import e.InterfaceC4291b;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.location.impl.r;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.l;
import n5.n;
import o0.b;
import v.C5642C;
import v.C5658m;
import v.C5670z;
import v.Y;
import y0.C5788a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements b.c, Preference.c, InterfaceC1700l0.a, b.a, I4.d, OnSuccessListener, M4.a, FunctionWithThrowable, Continuation, InterfaceC1676a, i.b, InterfaceC4291b, OnCompleteListener, SuccessContinuation, I.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f316b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f317c;

    public /* synthetic */ f(Object obj, int i) {
        this.f316b = i;
        this.f317c = obj;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, I.a
    public Object apply(Object obj) {
        return r.b((r) this.f317c, (LocationManager) obj);
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0.a
    public void c(InterfaceC1700l0 interfaceC1700l0) {
        androidx.camera.core.d dVar = (androidx.camera.core.d) this.f317c;
        synchronized (dVar.f14843a) {
            dVar.f14845c++;
        }
        dVar.k(interfaceC1700l0);
    }

    @Override // M4.a
    public void d(Bundle bundle) {
        ((K4.a) this.f317c).f3139a.d(bundle);
    }

    @Override // androidx.preference.Preference.c
    public boolean e(Preference it) {
        switch (this.f316b) {
            case 1:
                l.f(it, "it");
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                com.zipoapps.premiumhelper.e eVarA = e.a.a();
                Context contextRequireContext = ((com.zipoapps.premiumhelper.ui.settings.a) this.f317c).requireContext();
                l.e(contextRequireContext, "requireContext(...)");
                eVarA.f37011C.getClass();
                e.a.a().f37009A.f(contextRequireContext);
                break;
            default:
                l.f(it, "it");
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                e.a.a().f37011C.getClass();
                Context context = (Context) this.f317c;
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    e.a.a().l(activity);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // G3.b.a
    public Object execute() {
        switch (this.f316b) {
            case 4:
                ((E3.j) this.f317c).i.a();
                break;
            default:
                E3.l lVar = (E3.l) this.f317c;
                Iterator<y3.r> it = lVar.f1413b.N().iterator();
                while (it.hasNext()) {
                    lVar.f1414c.a(it.next(), 1);
                }
                break;
        }
        return null;
    }

    @Override // I4.d
    public Object g(t tVar) {
        return this.f317c;
    }

    @Override // a9.InterfaceC1676a
    public Object get() {
        TextView textView = (TextView) this.f317c;
        l.f(textView, "$textView");
        return textView.getLayout();
    }

    @Override // o0.b.c
    public Object i(b.a aVar) {
        String str;
        switch (this.f316b) {
            case 0:
                g gVar = (g) this.f317c;
                gVar.getClass();
                gVar.f321d.execute(new a(0, gVar, aVar));
                return "clearCaptureRequestOptions";
            case 3:
                ((B) this.f317c).f1282e = aVar;
                return "CaptureCompleteFuture";
            case 13:
                ((AtomicReference) this.f317c).set(aVar);
                return "acquireInputBuffer";
            case 21:
                ((C5670z.f) this.f317c).f46981a = aVar;
                return "waitFor3AResult";
            case 23:
                ((C5670z.h) this.f317c).f46993a.f46759j.a(aVar, true);
                return "TorchOn";
            default:
                Y y10 = (Y) this.f317c;
                synchronized (y10.f46642a) {
                    A2.l.q("Release completer expected to be null", y10.f46651k == null);
                    y10.f46651k = aVar;
                    str = "Release[session=" + y10 + "]";
                }
                return str;
        }
    }

    @Override // e.InterfaceC4291b
    public void onActivityResult(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        e8.d dVar = (e8.d) this.f317c;
        String str = dVar.f37770d;
        if (zBooleanValue) {
            I2.g gVar = dVar.f37771e;
            if (gVar != null) {
                gVar.invoke(dVar);
            }
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            com.zipoapps.premiumhelper.e eVarA = e.a.a();
            LinkedHashMap linkedHashMap = H.f2816c;
            eVarA.f37022l.getClass();
            H.a(str, "true");
        } else if (C5788a.b(dVar.f37760b, str)) {
            A2.f fVar = dVar.f37772f;
            if (fVar != null) {
                fVar.invoke(dVar);
            }
        } else {
            I2.h hVar = dVar.f37774h;
            if (hVar != null) {
                hVar.invoke(dVar, Boolean.valueOf(!dVar.f37761c));
            }
        }
        dVar.f37761c = false;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((ScheduledFuture) this.f317c).cancel(false);
    }

    @Override // com.vungle.ads.internal.i.b
    public void onImpression(View view) {
        L.m17registerViewForInteraction$lambda5((L) this.f317c, view);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) throws NumberFormatException {
        Object obj2 = this.f317c;
        switch (this.f316b) {
            case 7:
                ((A2.i) obj2).invoke(obj);
                break;
            default:
                CloudMessage cloudMessage = (CloudMessage) obj;
                com.google.firebase.messaging.a aVar = FirebaseMessaging.f23255l;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj2;
                firebaseMessaging.getClass();
                if (cloudMessage != null) {
                    n.b(cloudMessage.getIntent());
                    firebaseMessaging.f23261d.f44357c.getProxiedNotificationData().addOnSuccessListener(firebaseMessaging.f23264g, new f(firebaseMessaging, 16));
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((CountDownLatch) this.f317c).countDown();
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, I.a
    public A4.a apply(Object obj) {
        switch (this.f316b) {
            case 20:
                C5670z.d dVar = (C5670z.d) this.f317c;
                dVar.getClass();
                if (!Boolean.TRUE.equals((Boolean) obj)) {
                    return m.c.f2366c;
                }
                long j4 = dVar.f46978g;
                j6.l lVar = new j6.l();
                long millis = TimeUnit.NANOSECONDS.toMillis(j4);
                C5670z.f fVar = new C5670z.f(lVar);
                C5658m c5658m = dVar.f46975d;
                c5658m.l(fVar);
                d0.r rVar = new d0.r(4, c5658m, fVar);
                b.d dVar2 = fVar.f46982b;
                dVar2.f44804c.addListener(rVar, c5658m.f46753c);
                return o0.b.a(new I.i(dVar2, dVar.f46974c, millis));
            default:
                C5670z.g gVar = (C5670z.g) this.f317c;
                gVar.getClass();
                return o0.b.a(new C5642C(gVar));
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        r5.e eVar = (r5.e) this.f317c;
        Task<com.google.firebase.remoteconfig.internal.b> taskB = eVar.f45692c.b();
        Task<com.google.firebase.remoteconfig.internal.b> taskB2 = eVar.f45693d.b();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskB, taskB2}).continueWithTask(eVar.f45691b, new A0(eVar, taskB, taskB2));
    }
}
