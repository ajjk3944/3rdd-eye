package c;

import android.app.AlertDialog;
import android.os.Build;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.c0;
import com.staircase3.opensignal.activities.MainActivity;
import com.staircase3.opensignal.activities.SpeedTestActivity;
import com.survicate.surveys.SurveyActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Objects;
import o4.o0;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f3054a;

    /* renamed from: b, reason: collision with root package name */
    public final mq.k f3055b = new mq.k();

    /* renamed from: c, reason: collision with root package name */
    public am.d f3056c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f3057d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f3058e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3059f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3060g;

    public w(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallbackA;
        this.f3054a = runnable;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (i10 >= 34) {
                onBackInvokedCallbackA = t.f3047a.a(new o(this, 0), new o(this, 1), new p(this, 0), new p(this, 1));
            } else {
                onBackInvokedCallbackA = r.f3042a.a(new p(this, 2));
            }
            this.f3057d = onBackInvokedCallbackA;
        }
    }

    public final void a(androidx.lifecycle.v vVar, am.d dVar) {
        br.l.e(dVar, "onBackPressedCallback");
        androidx.lifecycle.o oVarH = vVar.h();
        if (oVarH.e1() == androidx.lifecycle.n.DESTROYED) {
            return;
        }
        dVar.f859b.add(new u(this, oVarH, dVar));
        d();
        dVar.f860c = new bp.a(0, this, w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [ar.a, br.k] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r0v29, types: [ar.a, br.k] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ar.a, br.k] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object] */
    public final void b() {
        am.d dVarPrevious;
        am.d dVar = this.f3056c;
        if (dVar == null) {
            mq.k kVar = this.f3055b;
            ListIterator listIterator = kVar.listIterator(kVar.a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    dVarPrevious = 0;
                    break;
                } else {
                    dVarPrevious = listIterator.previous();
                    if (((am.d) dVarPrevious).f858a) {
                        break;
                    }
                }
            }
            dVar = dVarPrevious;
        }
        this.f3056c = null;
        if (dVar == null) {
            this.f3054a.run();
            return;
        }
        switch (dVar.f861d) {
            case 0:
                am.f fVar = (am.f) dVar.f862e;
                zl.a aVarG0 = fVar.g0();
                Object obj = aVarG0.f16872b.f1488e;
                if (obj == c0.j) {
                    obj = null;
                }
                if (br.l.a(obj, zl.b.f27457d)) {
                    aVarG0.f27449e.f23591a.d("CATEGORY_ONBOARDING", "closegdprscreen", mq.x.f16946a);
                    aVarG0.c(zl.b.f27456c);
                    return;
                }
                dVar.f858a = false;
                ?? r02 = dVar.f860c;
                if (r02 != 0) {
                    r02.c();
                }
                fVar.W().j().b();
                return;
            case 1:
                androidx.fragment.app.d dVar2 = (androidx.fragment.app.d) dVar.f862e;
                if (androidx.fragment.app.d.K(3)) {
                    Objects.toString(dVar2);
                }
                am.d dVar3 = dVar2.j;
                ArrayList arrayList = dVar2.f1447n;
                dVar2.f1444i = true;
                dVar2.A(true);
                dVar2.f1444i = false;
                if (dVar2.f1443h == null) {
                    if (dVar3.f858a) {
                        androidx.fragment.app.d.K(3);
                        dVar2.S();
                        return;
                    } else {
                        androidx.fragment.app.d.K(3);
                        dVar2.f1442g.b();
                        return;
                    }
                }
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(androidx.fragment.app.d.G(dVar2.f1443h));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            throw null;
                        }
                    }
                }
                Iterator it3 = dVar2.f1443h.f18758a.iterator();
                while (it3.hasNext()) {
                    androidx.fragment.app.b bVar = ((o0) it3.next()).f18827b;
                    if (bVar != null) {
                        bVar.J = false;
                    }
                }
                Iterator it4 = dVar2.f(new ArrayList(Collections.singletonList(dVar2.f1443h)), 0, 1).iterator();
                while (it4.hasNext()) {
                    o4.k kVar2 = (o4.k) it4.next();
                    kVar2.getClass();
                    androidx.fragment.app.d.K(3);
                    ArrayList arrayList2 = kVar2.f18808c;
                    kVar2.k(arrayList2);
                    kVar2.c(arrayList2);
                }
                Iterator it5 = dVar2.f1443h.f18758a.iterator();
                while (it5.hasNext()) {
                    androidx.fragment.app.b bVar2 = ((o0) it5.next()).f18827b;
                    if (bVar2 != null && bVar2.f1412d0 == null) {
                        dVar2.g(bVar2).k();
                    }
                }
                dVar2.f1443h = null;
                dVar2.g0();
                if (androidx.fragment.app.d.K(3)) {
                    boolean z10 = dVar3.f858a;
                    dVar2.toString();
                    return;
                }
                return;
            case 2:
                wo.d dVar4 = ((SurveyActivity) dVar.f862e).T;
                if (dVar4 != null) {
                    dVar4.a(false);
                    return;
                }
                return;
            case 3:
                MainActivity mainActivity = (MainActivity) dVar.f862e;
                if (!mainActivity.f6020u0) {
                    hn.b bVar3 = mainActivity.f6017r0;
                    if (bVar3.f10853b.f10848c && !com.staircase3.opensignal.utils.q.c(bVar3.f10852a).getBoolean("has_rated", false)) {
                        long j = bVar3.f10854c;
                        if (j != -1) {
                            long j7 = bVar3.f10855d;
                            if (j7 != -1 && j >= r4.f10849d && j7 >= r4.f10850e && (bVar3.f10857f || bVar3.f10856e)) {
                                mainActivity.f6020u0 = true;
                                io.sentry.internal.debugmeta.c cVar = mainActivity.f6018s0;
                                AlertDialog alertDialog = (AlertDialog) cVar.f12354g;
                                alertDialog.show();
                                RatingBar ratingBar = (RatingBar) alertDialog.findViewById(qk.h.ratingBar);
                                Button button = (Button) alertDialog.findViewById(qk.h.notNowButton);
                                Button button2 = (Button) alertDialog.findViewById(qk.h.rateButton);
                                TextView textView = (TextView) alertDialog.findViewById(qk.h.errorMessage);
                                if (textView != null) {
                                    textView.setVisibility(8);
                                }
                                if (button != null) {
                                    button.setOnClickListener(new am.b(9, cVar));
                                }
                                button2.setOnClickListener(new hn.c(ratingBar, textView, cVar, 0));
                                com.staircase3.opensignal.utils.q.a(mainActivity.f6017r0.f10852a).putLong("shown_rate_dialog_time", System.currentTimeMillis()).apply();
                                com.staircase3.opensignal.utils.a aVar = (com.staircase3.opensignal.utils.a) mainActivity.f6013n0.getValue();
                                aVar.getClass();
                                com.staircase3.opensignal.utils.a.e(aVar, "rating", "show_rating_dialog", null, 12);
                                return;
                            }
                        }
                    }
                }
                dVar.f858a = false;
                ?? r03 = dVar.f860c;
                if (r03 != 0) {
                    r03.c();
                }
                mainActivity.j().b();
                return;
            default:
                SpeedTestActivity speedTestActivity = (SpeedTestActivity) dVar.f862e;
                if (speedTestActivity.T) {
                    return;
                }
                dVar.f858a = false;
                ?? r04 = dVar.f860c;
                if (r04 != 0) {
                    r04.c();
                }
                speedTestActivity.j().b();
                return;
        }
    }

    public final void c(boolean z10) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f3058e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f3057d) == null) {
            return;
        }
        r rVar = r.f3042a;
        if (z10 && !this.f3059f) {
            rVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f3059f = true;
        } else {
            if (z10 || !this.f3059f) {
                return;
            }
            rVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f3059f = false;
        }
    }

    public final void d() {
        boolean z10 = this.f3060g;
        boolean z11 = false;
        mq.k kVar = this.f3055b;
        if (kVar == null || !kVar.isEmpty()) {
            Iterator<E> it = kVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((am.d) it.next()).f858a) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f3060g = z11;
        if (z11 == z10 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z11);
    }
}
