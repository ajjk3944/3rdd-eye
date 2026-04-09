package B;

import A9.M;
import C.K;
import E.A;
import E.o;
import G3.b;
import H6.C0672i;
import H8.l;
import H8.l.a;
import I0.k;
import J8.C0694i;
import O4.H;
import O4.T;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.media.Image;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.camera.core.impl.InterfaceC1700l0;
import androidx.camera.core.impl.S;
import androidx.camera.core.impl.X;
import androidx.lifecycle.AbstractC1781n;
import androidx.preference.Preference;
import com.applovin.impl.g4;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.vungle.ads.internal.i;
import com.vungle.ads.j0;
import com.yandex.mobile.ads.impl.L;
import com.zipoapps.premiumhelper.ui.settings.delete_account.PhDeleteAccountActivity;
import d0.r;
import d0.s;
import e.InterfaceC4291b;
import g0.C4356c;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.l;
import n5.ServiceConnectionC5363F;
import o0.b;
import org.json.JSONArray;
import org.json.JSONException;
import p1.C5440a;
import s5.C5576b;
import v.C5641B;
import v.C5658m;
import v.C5670z;
import v.RunnableC5660o;
import v.Y;
import v.i0;
import y7.t;
import y7.v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements b.c, Preference.c, InterfaceC4291b, InterfaceC1700l0.a, b.a, OnSuccessListener, I4.d, t.a, Continuation, g4.b, i.b, OnCompleteListener, I.a, v.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f312c;

    public /* synthetic */ d(N6.d dVar, C0672i c0672i) {
        this.f311b = 9;
        this.f312c = dVar;
    }

    @Override // com.applovin.impl.g4.b
    public void a(boolean z10, Object obj, Object obj2) {
        g4.a((g4.a) this.f312c, z10, obj, obj2);
    }

    @Override // I.a
    public A4.a apply(Object obj) {
        C4356c c4356c = new C4356c(10);
        C5670z.g gVar = (C5670z.g) this.f312c;
        H.c cVar = gVar.f46988c;
        long millis = TimeUnit.NANOSECONDS.toMillis(C5670z.g.f46984f);
        C5670z.f fVar = new C5670z.f(c4356c);
        C5658m c5658m = gVar.f46986a;
        c5658m.l(fVar);
        r rVar = new r(4, c5658m, fVar);
        b.d dVar = fVar.f46982b;
        dVar.f44804c.addListener(rVar, c5658m.f46753c);
        return o0.b.a(new I.i(dVar, cVar, millis));
    }

    public void b() {
        Y y10 = (Y) this.f312c;
        synchronized (y10.f46642a) {
            try {
                if (y10.i == Y.a.OPENED) {
                    y10.q(y10.f46647f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0.a
    public void c(InterfaceC1700l0 interfaceC1700l0) {
        Image image;
        switch (this.f311b) {
            case 4:
                o oVar = (o) this.f312c;
                try {
                    androidx.camera.core.c cVarB = interfaceC1700l0.b();
                    if (cVarB != null) {
                        oVar.b(cVarB);
                    } else {
                        A a10 = oVar.f1324a;
                        if (a10 != null) {
                            oVar.d(new E.g(a10.f1269a, new K("Failed to acquire latest image", null)));
                        }
                    }
                    return;
                } catch (IllegalStateException e4) {
                    A a11 = oVar.f1324a;
                    if (a11 != null) {
                        oVar.d(new E.g(a11.f1269a, new K("Failed to acquire latest image", e4)));
                        return;
                    }
                    return;
                }
            default:
                U.a aVar = (U.a) this.f312c;
                synchronized (aVar.f12339a) {
                    try {
                        if (aVar.f12342d) {
                            return;
                        }
                        androidx.camera.core.c cVarG = interfaceC1700l0.g();
                        if (cVarG != null && (image = cVarG.getImage()) != null) {
                            if (aVar.f12345g) {
                                long j4 = aVar.f12346h;
                                if (j4 != -1) {
                                    image.setTimestamp(j4);
                                }
                            }
                            aVar.f12340b.queueInputImage(image);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public void d(k splashScreenViewProvider) {
        l.f(splashScreenViewProvider, "splashScreenViewProvider");
        View viewB = splashScreenViewProvider.f2403a.b();
        int iMax = Math.max(viewB.getWidth(), viewB.getHeight());
        Integer numValueOf = Integer.valueOf(iMax);
        if (iMax <= 0) {
            numValueOf = null;
        }
        H8.l lVar = (H8.l) this.f312c;
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            Object value = lVar.f2332e.getValue();
            l.e(value, "getValue(...)");
            ImageView imageView = (ImageView) value;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = iIntValue;
            layoutParams.height = iIntValue;
            imageView.setLayoutParams(layoutParams);
        }
        Object value2 = lVar.f2333f.getValue();
        l.e(value2, "getValue(...)");
        ValueAnimator valueAnimatorA = C0694i.a((TextView) value2, 0.0f, 1.0f);
        valueAnimatorA.setDuration(1000L);
        valueAnimatorA.setInterpolator(new AccelerateDecelerateInterpolator());
        Object value3 = lVar.f2329c.getValue();
        l.e(value3, "getValue(...)");
        ValueAnimator valueAnimatorA2 = C0694i.a((ProgressBar) value3, 0.0f, 1.0f);
        valueAnimatorA2.setDuration(500L);
        valueAnimatorA2.setInterpolator(new AccelerateDecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorA, valueAnimatorA2);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f);
        valueAnimatorOfFloat.setDuration(1000L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(animatorSet, valueAnimatorOfFloat);
        animatorSet2.addListener(new l.b(splashScreenViewProvider));
        animatorSet2.addListener(lVar.new a());
        C0694i.b(animatorSet2, lVar.f2327a.getLifecycle(), AbstractC1781n.a.ON_STOP);
        animatorSet2.start();
    }

    @Override // androidx.preference.Preference.c
    public boolean e(Preference it) {
        String str;
        kotlin.jvm.internal.l.f(it, "it");
        com.zipoapps.premiumhelper.ui.settings.a aVar = (com.zipoapps.premiumhelper.ui.settings.a) this.f312c;
        com.zipoapps.premiumhelper.ui.settings.b bVar = aVar.f37124j;
        if (bVar == null || (str = bVar.f37127B) == null) {
            return true;
        }
        PhDeleteAccountActivity.b bVar2 = aVar.f37125k;
        bVar2.getClass();
        bVar2.c(str);
        return true;
    }

    @Override // G3.b.a
    public Object execute() {
        return ((F3.c) this.f312c).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0412  */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v67 */
    @Override // I4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(I4.t r52) throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 1518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B.d.g(I4.t):java.lang.Object");
    }

    @Override // o0.b.c
    public Object i(b.a aVar) {
        switch (this.f311b) {
            case 0:
                g gVar = (g) this.f312c;
                gVar.getClass();
                gVar.f321d.execute(new c(0, gVar, aVar));
                return "addCaptureRequestOptions";
            case 15:
                W.Y y10 = (W.Y) this.f312c;
                y10.f13229m = aVar;
                return "ReadyToReleaseFuture " + y10;
            case 16:
                X x10 = (X) this.f312c;
                synchronized (x10.f14987a) {
                    x10.f14990d = aVar;
                }
                return "DeferrableSurface-termination(" + x10 + ")";
            case 19:
                ((AtomicReference) this.f312c).set(aVar);
                return "Data closed";
            case 20:
                s.a aVar2 = (s.a) this.f312c;
                s.this.f37265h.execute(new L(14, aVar2, aVar));
                return "fetchData";
            case 23:
                M m10 = (M) this.f312c;
                m10.F(new C5440a(aVar, m10));
                return "Deferred.asListenableFuture";
            case 25:
                ((S.a) this.f312c).b(new C5641B(aVar));
                return "submitStillCapture";
            default:
                i0 i0Var = (i0) this.f312c;
                i0Var.getClass();
                i0Var.f46712b.execute(new RunnableC5660o(1, i0Var, aVar));
                return "triggerAePrecapture";
        }
    }

    @Override // e.InterfaceC4291b
    public void onActivityResult(Object obj) {
        Integer result = (Integer) obj;
        kotlin.jvm.internal.l.f(result, "result");
        if (result.intValue() == 1347566) {
            ((B8.c) this.f312c).invoke();
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((ServiceConnectionC5363F.a) this.f312c).f44315b.trySetResult(null);
    }

    @Override // com.vungle.ads.internal.i.b
    public void onImpression(View view) throws Throwable {
        j0.m114renderAd$lambda1((j0) this.f312c, view);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((I8.a) this.f312c).invoke(obj);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z10;
        boolean z11;
        switch (this.f311b) {
            case 10:
                ((T) this.f312c).getClass();
                if (task.isSuccessful()) {
                    H h10 = (H) task.getResult();
                    L4.e eVar = L4.e.f4061a;
                    eVar.b("Crashlytics report successfully enqueued to DataTransport: " + h10.c());
                    File fileB = h10.b();
                    if (fileB.delete()) {
                        eVar.b("Deleted report file: " + fileB.getPath());
                    } else {
                        eVar.d("Crashlytics could not delete report file: " + fileB.getPath(), null);
                    }
                    z10 = true;
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 11:
                boolean zIsSuccessful = task.isSuccessful();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f312c;
                if (zIsSuccessful) {
                    taskCompletionSource.trySetResult(task.getResult());
                    return null;
                }
                if (task.getException() == null) {
                    return null;
                }
                taskCompletionSource.trySetException(task.getException());
                return null;
            default:
                r5.e eVar2 = (r5.e) this.f312c;
                eVar2.getClass();
                if (task.isSuccessful()) {
                    C5576b c5576b = eVar2.f45692c;
                    synchronized (c5576b) {
                        c5576b.f46072c = Tasks.forResult(null);
                    }
                    c5576b.f46071b.a();
                    com.google.firebase.remoteconfig.internal.b bVar = (com.google.firebase.remoteconfig.internal.b) task.getResult();
                    if (bVar != null) {
                        JSONArray jSONArray = bVar.f23301d;
                        C4.c cVar = eVar2.f45690a;
                        if (cVar != null) {
                            try {
                                cVar.b(r5.e.d(jSONArray));
                            } catch (C4.a e4) {
                                Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e4);
                            } catch (JSONException e10) {
                                Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e10);
                            }
                        }
                        t5.b bVar2 = eVar2.f45698j;
                        try {
                            v5.c cVarA = bVar2.f46427b.a(bVar);
                            Iterator<v5.f> it = bVar2.f46429d.iterator();
                            while (it.hasNext()) {
                                bVar2.f46428c.execute(new L(18, it.next(), cVarA));
                            }
                        } catch (r5.g e11) {
                            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e11);
                        }
                    } else {
                        Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
                    }
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
        }
    }

    public /* synthetic */ d(Object obj, int i) {
        this.f311b = i;
        this.f312c = obj;
    }

    @Override // y7.v.a
    public int a() {
        return ((y7.e) this.f312c).getTabMaxWidth();
    }

    public /* synthetic */ d(C5670z.d dVar, S.a aVar) {
        this.f311b = 25;
        this.f312c = aVar;
    }
}
