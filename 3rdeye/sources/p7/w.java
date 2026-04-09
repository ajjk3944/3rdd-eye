package P7;

import C.S;
import C.k0;
import N7.G8;
import P7.x;
import W.AbstractC1630s;
import W.X;
import W.Y;
import W.b0;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC1680b0;
import androidx.camera.core.impl.Q0;
import c0.C2037i;
import c0.C2039k;
import c0.C2040l;
import c0.C2041m;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.UserMessagingPlatform;
import com.google.firebase.remoteconfig.internal.c;
import d0.AbstractC4254A;
import d0.k;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Executor;
import o0.b;
import p9.InterfaceC5480a;
import s5.C5576b;
import va.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements UserMessagingPlatform.OnConsentFormLoadSuccessListener, b.c, Continuation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10819c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10821e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f10822f;

    public /* synthetic */ w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f10818b = obj;
        this.f10819c = obj2;
        this.f10820d = obj3;
        this.f10821e = obj4;
        this.f10822f = obj5;
    }

    @Override // o0.b.c
    public Object i(b.a aVar) {
        Y y10 = (Y) this.f10818b;
        k0 k0Var = (k0) this.f10819c;
        C.C c10 = k0Var.f733c;
        Y.f fVar = (Y.f) this.f10821e;
        AbstractC1630s abstractC1630s = (AbstractC1630s) this.f10822f;
        C2037i c2037iB = C2039k.b(abstractC1630s, c10, fVar);
        b0 b0VarD = abstractC1630s.d();
        Size size = k0Var.f732b;
        Range<Integer> range = k0Var.f734d;
        Q0 q02 = (Q0) this.f10820d;
        InterfaceC1680b0.c cVar = c2037iB.f18355c;
        AbstractC4254A abstractC4254A = (AbstractC4254A) (cVar != null ? new C2041m(c2037iB.f18353a, q02, b0VarD, size, cVar, c10, range) : new C2040l(c2037iB.f18353a, q02, b0VarD, size, c10, range)).get();
        try {
            G8 g82 = y10.f13220c;
            Executor executor = y10.f13218a;
            g82.getClass();
            d0.s sVar = new d0.s(executor, abstractC4254A);
            y10.f13221d = sVar;
            k.b bVar = sVar.f37263f;
            if (bVar instanceof k.c) {
                ((k.c) bVar).b(y10.f13219b, new X(y10, aVar, k0Var));
            } else {
                aVar.d(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            }
        } catch (d0.y e4) {
            S.c("VideoEncoderSession", "Unable to initialize video encoder.", e4);
            aVar.d(e4);
        }
        return "ConfigureVideoEncoderFuture " + y10;
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public void onConsentFormLoadSuccess(ConsentForm consentForm) {
        int consentStatus = ((ConsentInformation) this.f10818b).getConsentStatus();
        x.d dVar = (x.d) this.f10820d;
        x xVar = (x) this.f10819c;
        if (consentStatus == 2) {
            xVar.f10826c = consentForm;
            xVar.f(dVar);
            H8.e eVar = (H8.e) this.f10821e;
            if (eVar != null) {
                eVar.invoke();
            }
        } else {
            a.b bVar = va.a.f47104a;
            bVar.o("x");
            bVar.a("loadForm()-> Consent form is not required", new Object[0]);
            xVar.f10826c = consentForm;
            xVar.f(dVar);
            xVar.d();
            InterfaceC5480a interfaceC5480a = (InterfaceC5480a) this.f10822f;
            if (interfaceC5480a != null) {
                interfaceC5480a.invoke();
            }
        }
        xVar.f10829f = false;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Date date = (Date) this.f10821e;
        HashMap map = (HashMap) this.f10822f;
        com.google.firebase.remoteconfig.internal.c cVar = (com.google.firebase.remoteconfig.internal.c) this.f10818b;
        cVar.getClass();
        Task task2 = (Task) this.f10819c;
        if (!task2.isSuccessful()) {
            return Tasks.forException(new r5.f("Firebase Installations failed to get installation ID for fetch.", task2.getException()));
        }
        Task task3 = (Task) this.f10820d;
        if (!task3.isSuccessful()) {
            return Tasks.forException(new r5.f("Firebase Installations failed to get installation auth token for fetch.", task3.getException()));
        }
        try {
            c.a aVarA = cVar.a((String) task2.getResult(), ((h5.g) task3.getResult()).a(), date, map);
            if (aVarA.f23321a != 0) {
                return Tasks.forResult(aVarA);
            }
            C5576b c5576b = cVar.f23318f;
            com.google.firebase.remoteconfig.internal.b bVar = aVarA.f23322b;
            c5576b.getClass();
            com.vungle.ads.internal.executor.h hVar = new com.vungle.ads.internal.executor.h(2, c5576b, bVar);
            Executor executor = c5576b.f46070a;
            return Tasks.call(executor, hVar).onSuccessTask(executor, new B.i(10, c5576b, bVar)).onSuccessTask(cVar.f23315c, new B8.b(aVarA, 12));
        } catch (r5.g e4) {
            return Tasks.forException(e4);
        }
    }
}
