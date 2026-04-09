package y1;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p.l2;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final n0.a0 f25734a = new n0.a0(f0.f25678g);

    /* renamed from: b, reason: collision with root package name */
    public static final n0.h2 f25735b = new n0.h2(f0.f25679r);

    /* renamed from: c, reason: collision with root package name */
    public static final n0.a0 f25736c = new n0.a0();

    /* renamed from: d, reason: collision with root package name */
    public static final n0.h2 f25737d = new n0.h2(f0.f25680x);

    /* renamed from: e, reason: collision with root package name */
    public static final n0.h2 f25738e = new n0.h2(f0.f25681y);

    /* renamed from: f, reason: collision with root package name */
    public static final n0.h2 f25739f = new n0.h2(f0.B);

    public static final void a(AndroidComposeView androidComposeView, ar.n nVar, n0.p pVar, int i10) {
        n0.x0 x0Var;
        LinkedHashMap linkedHashMap;
        boolean z10;
        pVar.T(-520299287);
        int i11 = (pVar.g(androidComposeView) ? 4 : 2) | i10 | (pVar.g(nVar) ? 32 : 16);
        if (pVar.K(i11 & 1, (i11 & 19) != 18)) {
            Context context = androidComposeView.getContext();
            Object objI = pVar.I();
            Object obj = n0.j.f17190a;
            if (objI == obj) {
                objI = androidx.compose.runtime.c.f(new Configuration(context.getResources().getConfiguration()));
                pVar.b0(objI);
            }
            n0.x0 x0Var2 = (n0.x0) objI;
            Object objI2 = pVar.I();
            if (objI2 == obj) {
                objI2 = new j1.a(26, x0Var2);
                pVar.b0(objI2);
            }
            androidComposeView.setConfigurationChangeObserver((ar.k) objI2);
            Object objI3 = pVar.I();
            if (objI3 == obj) {
                objI3 = new p0();
                pVar.b0(objI3);
            }
            p0 p0Var = (p0) objI3;
            m viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            l7.e eVar = viewTreeOwners.f25742b;
            Object objI4 = pVar.I();
            if (objI4 == obj) {
                Object parent = androidComposeView.getParent();
                br.l.c(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(z0.n.compose_view_saveable_id_tag);
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = w0.b.class.getSimpleName() + ':' + strValueOf;
                io.sentry.t tVarF = eVar.f();
                Bundle bundleK = tVarF.k(str);
                if (bundleK != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleK.keySet()) {
                        ArrayList parcelableArrayList = bundleK.getParcelableArrayList(str2);
                        br.l.c(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                        linkedHashMap.put(str2, parcelableArrayList);
                        x0Var2 = x0Var2;
                    }
                } else {
                    linkedHashMap = null;
                }
                x0Var = x0Var2;
                n0.h2 h2Var = w0.c.f24161a;
                l2 l2Var = new l2(linkedHashMap);
                try {
                    tVarF.H(str, new c.d(3, l2Var));
                    z10 = true;
                } catch (IllegalArgumentException unused) {
                    z10 = false;
                }
                Object e1Var = new e1(l2Var, new dt.q(z10, tVarF, str));
                pVar.b0(e1Var);
                objI4 = e1Var;
            } else {
                x0Var = x0Var2;
            }
            Object obj2 = (e1) objI4;
            boolean zG = pVar.g(obj2);
            Object objI5 = pVar.I();
            if (zG || objI5 == obj) {
                objI5 = new j1.a(27, obj2);
                pVar.b0(objI5);
            }
            n0.w.c(lq.b0.f15562a, (ar.k) objI5, pVar);
            Object objI6 = pVar.I();
            if (objI6 == obj) {
                objI6 = (Build.VERSION.SDK_INT < 31 || !((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2)) ? new o1() : new d1(androidComposeView.getView());
                pVar.b0(objI6);
            }
            o1.a aVar = (o1.a) objI6;
            Configuration configuration = (Configuration) x0Var.getValue();
            Object objI7 = pVar.I();
            if (objI7 == obj) {
                objI7 = new c2.c();
                pVar.b0(objI7);
            }
            c2.c cVar = (c2.c) objI7;
            Object objI8 = pVar.I();
            Object obj3 = objI8;
            if (objI8 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                pVar.b0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object objI9 = pVar.I();
            if (objI9 == obj) {
                objI9 = new j0(configuration3, cVar);
                pVar.b0(objI9);
            }
            j0 j0Var = (j0) objI9;
            boolean zG2 = pVar.g(context);
            Object objI10 = pVar.I();
            if (zG2 || objI10 == obj) {
                objI10 = new c7.b(context, 24, j0Var);
                pVar.b0(objI10);
            }
            n0.w.c(cVar, (ar.k) objI10, pVar);
            Object objI11 = pVar.I();
            if (objI11 == obj) {
                objI11 = new c2.d();
                pVar.b0(objI11);
            }
            c2.d dVar = (c2.d) objI11;
            Object objI12 = pVar.I();
            if (objI12 == obj) {
                objI12 = new k0(dVar);
                pVar.b0(objI12);
            }
            k0 k0Var = (k0) objI12;
            boolean zG3 = pVar.g(context);
            Object objI13 = pVar.I();
            if (zG3 || objI13 == obj) {
                objI13 = new c7.b(context, 25, k0Var);
                pVar.b0(objI13);
            }
            n0.w.c(dVar, (ar.k) objI13, pVar);
            androidx.compose.runtime.d dVar2 = c1.f25658v;
            n0.w.b(new n0.i1[]{f25734a.a((Configuration) x0Var.getValue()), f25735b.a(context), s4.a.f21872a.a(viewTreeOwners.f25741a), m7.a.f16319a.a(eVar), w0.c.f24161a.a(obj2), f25739f.a(androidComposeView.getView()), f25737d.a(cVar), f25738e.a(dVar), dVar2.a(Boolean.valueOf(((Boolean) pVar.i(dVar2)).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release())), c1.f25648l.a(aVar)}, v0.i.d(1059770793, new h0(androidComposeView, p0Var, nVar), pVar), pVar, 56);
        } else {
            pVar.N();
        }
        n0.k1 k1VarQ = pVar.q();
        if (k1VarQ != null) {
            k1VarQ.f17207d = new b1.d(androidComposeView, nVar, i10);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
