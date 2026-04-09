package C;

import G0.e;
import H7.b;
import I.m;
import L0.InterfaceC0788t;
import a9.InterfaceC1676a;
import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.S;
import com.applovin.mediation.adapters.GoogleMediationAdapter;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import f8.AbstractActivityC4340c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o0.b;
import v.C5670z;

/* compiled from: R8$$SyntheticClass */
/* renamed from: C.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0635w implements b.c, InterfaceC1676a, InterfaceC0788t, I.a, e.a, OnUserEarnedRewardListener, OnCompleteListener, Continuation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f772c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f773d;

    public /* synthetic */ C0635w(int i, Object obj, Object obj2) {
        this.f771b = i;
        this.f772c = obj;
        this.f773d = obj2;
    }

    @Override // I.a
    public A4.a apply(Object obj) {
        switch (this.f771b) {
            case 4:
                R.j jVar = (R.j) this.f772c;
                jVar.getClass();
                ArrayList arrayList = (ArrayList) this.f773d;
                Object objB = 100;
                try {
                    objB = ((androidx.camera.core.impl.S) arrayList.get(0)).f14941b.b(androidx.camera.core.impl.S.f14938j);
                } catch (IllegalArgumentException unused) {
                }
                Integer num = (Integer) objB;
                Objects.requireNonNull(num);
                int iIntValue = num.intValue();
                Object objB2 = 0;
                try {
                    objB2 = ((androidx.camera.core.impl.S) arrayList.get(0)).f14941b.b(androidx.camera.core.impl.S.i);
                } catch (IllegalArgumentException unused2) {
                }
                Integer num2 = (Integer) objB2;
                Objects.requireNonNull(num2);
                int iIntValue2 = num2.intValue();
                N.v vVar = ((R.c) jVar.f11598c.f312c).f11569t;
                return vVar != null ? vVar.f4460a.c(iIntValue, iIntValue2) : new m.a(new Exception("Failed to take picture: pipeline is not ready."));
            default:
                v.Y y10 = (v.Y) this.f772c;
                y10.close();
                ((i0) this.f773d).a();
                return y10.release();
        }
    }

    @Override // G0.e.a
    public void b() {
        S.b operation = (S.b) this.f773d;
        kotlin.jvm.internal.l.f(operation, "$operation");
        ((Animator) this.f772c).end();
        if (androidx.fragment.app.x.G(2)) {
            Log.v("FragmentManager", "Animator from operation " + operation + " has been canceled.");
        }
    }

    @Override // L0.InterfaceC0788t
    public L0.X d(View v10, L0.X x10) {
        Object obj = this.f773d;
        Object obj2 = this.f772c;
        switch (this.f771b) {
            case 3:
                kotlin.jvm.internal.l.f(v10, "<unused var>");
                C0.e eVarF = x10.f3850a.f(135);
                kotlin.jvm.internal.l.e(eVarF, "getInsets(...)");
                View view = (View) obj2;
                view.setPadding(view.getPaddingLeft(), eVarF.f802b, view.getPaddingRight(), view.getPaddingBottom());
                View view2 = (View) obj;
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), eVarF.f804d);
                return L0.X.f3849b;
            default:
                int i = AbstractActivityC4340c.i;
                kotlin.jvm.internal.l.f(v10, "v");
                C0.e eVarF2 = x10.f3850a.f(135);
                kotlin.jvm.internal.l.e(eVarF2, "getInsets(...)");
                View view3 = (View) obj2;
                ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = ((AbstractActivityC4340c) obj).getResources().getDimensionPixelSize(R.dimen.ph_premium_close_btn_margin) + eVarF2.f802b;
                view3.setLayoutParams(marginLayoutParams);
                return L0.X.f3849b;
        }
    }

    @Override // a9.InterfaceC1676a
    public Object get() {
        return (Cursor) ((F7.h) this.f773d).invoke((b.a) this.f772c);
    }

    @Override // o0.b.c
    public Object i(b.a aVar) {
        switch (this.f771b) {
            case 0:
                C0638z c0638z = (C0638z) this.f772c;
                c0638z.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Context context = (Context) this.f773d;
                Executor executor = c0638z.f791d;
                executor.execute(new RunnableC0636x(1, jElapsedRealtime, c0638z, context, executor, aVar));
                return "CameraX initInternal";
            case 1:
                ((AtomicReference) this.f772c).set(aVar);
                return B4.f.c(new StringBuilder(), (String) this.f773d, "-status");
            default:
                C5670z.g gVar = (C5670z.g) this.f772c;
                gVar.getClass();
                E.u.H().execute(new Z.e(gVar, (AtomicReference) this.f773d, aVar, 12));
                return "OnScreenFlashStart";
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i = n5.h.f44342g;
        ((n5.h) this.f772c).a((Intent) this.f773d);
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
        ((GoogleMediationAdapter) this.f772c).lambda$showRewardedAd$1((String) this.f773d, rewardItem);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f771b) {
            case 9:
                n5.u uVar = (n5.u) this.f772c;
                String str = (String) this.f773d;
                synchronized (uVar) {
                    uVar.f44374b.remove(str);
                }
                return task;
            default:
                return ((com.google.firebase.remoteconfig.internal.c) this.f772c).b(task, 0L, (HashMap) this.f773d);
        }
    }
}
