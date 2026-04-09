package B;

import B3.c;
import C.C0638z;
import C.S;
import C.k0;
import E.u;
import G3.b;
import I.m;
import I4.t;
import W.F;
import W.F.b;
import android.app.Activity;
import android.content.Context;
import android.os.Trace;
import androidx.camera.core.impl.InterfaceC1700l0;
import androidx.camera.core.impl.X;
import b9.C1992A;
import com.applovin.impl.AbstractC2113d;
import com.applovin.impl.C2131m;
import com.applovin.impl.sdk.k;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.l;
import o0.b;
import q5.e;
import s5.C5576b;
import v.C5670z;
import v.q0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements InterfaceC1700l0.a, b.c, b.a, AbstractC2113d.b, OnUserEarnedRewardListener, I4.d, SuccessContinuation, I.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f326b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f327c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f328d;

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.f326b = i;
        this.f327c = obj;
        this.f328d = obj2;
    }

    @Override // com.applovin.impl.AbstractC2113d.b
    public void a(Activity activity) {
        ((MaxDebuggerAdUnitDetailActivity) activity).initialize((C2131m) this.f327c, null, null, (k) this.f328d);
    }

    @Override // I.a
    public A4.a apply(Object obj) {
        switch (this.f326b) {
            case 11:
                C5670z.g gVar = (C5670z.g) this.f327c;
                gVar.getClass();
                return o0.b.a(new I.i((b.d) this.f328d, gVar.f46988c, TimeUnit.SECONDS.toMillis(3L)));
            default:
                List list = (List) obj;
                q0 q0Var = (q0) this.f327c;
                q0Var.getClass();
                S.a("SyncCaptureSessionBase", "[" + q0Var + "] getSurface done with results: " + list);
                if (list.isEmpty()) {
                    return new m.a(new IllegalArgumentException("Unable to open capture session without surfaces"));
                }
                if (!list.contains(null)) {
                    return I.j.e(list);
                }
                return new m.a(new X.a("Surface closed", (X) ((ArrayList) this.f328d).get(list.indexOf(null))));
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0.a
    public void c(InterfaceC1700l0 interfaceC1700l0) {
        androidx.camera.core.e eVar = (androidx.camera.core.e) this.f327c;
        eVar.getClass();
        ((InterfaceC1700l0.a) this.f328d).c(eVar);
    }

    @Override // G3.b.a
    public Object execute() {
        switch (this.f326b) {
            case 3:
                return Boolean.valueOf(((E3.j) this.f327c).f1399c.j0((y3.j) this.f328d));
            default:
                E3.j jVar = (E3.j) this.f327c;
                jVar.getClass();
                Iterator it = ((HashMap) this.f328d).entrySet().iterator();
                while (it.hasNext()) {
                    jVar.i.c(((Integer) r2.getValue()).intValue(), c.a.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                return null;
        }
    }

    @Override // I4.d
    public Object g(t tVar) {
        switch (this.f326b) {
            case 9:
                return new q5.a((String) this.f327c, ((e.a) this.f328d).d((Context) tVar.a(Context.class)));
            default:
                String str = (String) this.f327c;
                I4.a aVar = (I4.a) this.f328d;
                try {
                    Trace.beginSection(str);
                    return aVar.f2438f.g(tVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // o0.b.c
    public Object i(b.a aVar) {
        int i = 6;
        switch (this.f326b) {
            case 2:
                k0 k0Var = (k0) this.f327c;
                k0Var.getClass();
                ((AtomicReference) this.f328d).set(aVar);
                return "SurfaceRequest-surface-recreation(" + k0Var.hashCode() + ")";
            case 5:
                V.f this$0 = (V.f) this.f327c;
                C0638z c0638z = (C0638z) this.f328d;
                l.f(this$0, "this$0");
                synchronized (this$0.f12824a) {
                    I.d dVarA = I.d.a(m.c.f2366c);
                    M8.a aVar2 = new M8.a(new E7.a(c0638z, i), i);
                    H.b bVarY = u.y();
                    dVarA.getClass();
                    I.j.a(I.j.j(dVarA, aVar2, bVarY), new V.e(aVar, c0638z), u.y());
                    C1992A c1992a = C1992A.f18074a;
                }
                return "ProcessCameraProvider-initializeCameraX";
            default:
                F f10 = (F) this.f327c;
                f10.f13084D.j(f10.new b(aVar, (F.h) this.f328d), f10.f13113d);
                return "videoEncodingFuture";
        }
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
        ((GoogleAdManagerMediationAdapter) this.f327c).lambda$showRewardedAd$0((String) this.f328d, rewardItem);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        C5576b c5576b = (C5576b) this.f327c;
        com.google.firebase.remoteconfig.internal.b bVar = (com.google.firebase.remoteconfig.internal.b) this.f328d;
        synchronized (c5576b) {
            c5576b.f46072c = Tasks.forResult(bVar);
        }
        return Tasks.forResult(bVar);
    }
}
