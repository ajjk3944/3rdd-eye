package t0;

import V2.h;
import X.d;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import c5.C0407d;
import com.apm.insight.R;
import com.lefan.signal.MainActivity;
import h.v;
import j.C2540f;
import java.lang.ref.WeakReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q0.C2793f;
import q0.InterfaceC2791d;
import q0.InterfaceC2797j;
import q0.J;
import q0.z;
import q5.i;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2902a implements InterfaceC2797j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23521a;

    /* renamed from: b, reason: collision with root package name */
    public final h f23522b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f23523c;

    /* renamed from: d, reason: collision with root package name */
    public C2540f f23524d;

    /* renamed from: e, reason: collision with root package name */
    public ObjectAnimator f23525e;

    /* renamed from: f, reason: collision with root package name */
    public final MainActivity f23526f;

    public C2902a(MainActivity mainActivity, h hVar) {
        v vVar = (v) mainActivity.q();
        vVar.getClass();
        Context contextD = vVar.D();
        i.d(contextD, "checkNotNull(activity.dr… }.actionBarThemedContext");
        this.f23521a = contextD;
        this.f23522b = hVar;
        d dVar = (d) hVar.f3876c;
        this.f23523c = dVar != null ? new WeakReference(dVar) : null;
        this.f23526f = mainActivity;
    }

    @Override // q0.InterfaceC2797j
    public final void a(z zVar, q0.v vVar, Bundle bundle) {
        String string;
        C2793f c2793f;
        C0407d c0407d;
        i.e(vVar, "destination");
        if (vVar instanceof InterfaceC2791d) {
            return;
        }
        WeakReference weakReference = this.f23523c;
        d dVar = weakReference != null ? (d) weakReference.get() : null;
        if (weakReference != null && dVar == null) {
            zVar.f23069p.remove(this);
            return;
        }
        Context context = this.f23521a;
        i.e(context, "context");
        CharSequence charSequence = vVar.f23039d;
        if (charSequence == null) {
            string = null;
        } else {
            Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
            StringBuffer stringBuffer = new StringBuffer();
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                if (bundle == null || !bundle.containsKey(strGroup)) {
                    throw new IllegalArgumentException("Could not find \"" + strGroup + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + '\"');
                }
                matcher.appendReplacement(stringBuffer, "");
                if (i.a((strGroup == null || (c2793f = (C2793f) d5.v.L(vVar.f23042g).get(strGroup)) == null) ? null : c2793f.f22960a, J.f22928c)) {
                    String string2 = context.getString(bundle.getInt(strGroup));
                    i.d(string2, "context.getString(bundle.getInt(argName))");
                    stringBuffer.append(string2);
                } else {
                    stringBuffer.append(bundle.getString(strGroup));
                }
            }
            matcher.appendTail(stringBuffer);
            string = stringBuffer.toString();
        }
        if (string != null) {
            MainActivity mainActivity = this.f23526f;
            com.bumptech.glide.d dVarR = mainActivity.r();
            if (dVarR == null) {
                throw new IllegalStateException(("Activity " + mainActivity + " does not have an ActionBar set via setSupportActionBar()").toString());
            }
            dVarR.X(string);
        }
        boolean zS = this.f23522b.s(vVar);
        if (dVar == null && zS) {
            b(null, 0);
            return;
        }
        boolean z6 = dVar != null && zS;
        C2540f c2540f = this.f23524d;
        if (c2540f != null) {
            c0407d = new C0407d(c2540f, Boolean.TRUE);
        } else {
            C2540f c2540f2 = new C2540f(context);
            this.f23524d = c2540f2;
            c0407d = new C0407d(c2540f2, Boolean.FALSE);
        }
        C2540f c2540f3 = (C2540f) c0407d.f5921a;
        boolean zBooleanValue = ((Boolean) c0407d.f5922b).booleanValue();
        b(c2540f3, z6 ? R.string.nav_app_bar_open_drawer_description : R.string.nav_app_bar_navigate_up_description);
        float f2 = z6 ? 0.0f : 1.0f;
        if (!zBooleanValue) {
            c2540f3.setProgress(f2);
            return;
        }
        float f5 = c2540f3.i;
        ObjectAnimator objectAnimator = this.f23525e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c2540f3, "progress", f5, f2);
        this.f23525e = objectAnimatorOfFloat;
        i.c(objectAnimatorOfFloat, "null cannot be cast to non-null type android.animation.ObjectAnimator");
        objectAnimatorOfFloat.start();
    }

    public final void b(C2540f c2540f, int i) {
        MainActivity mainActivity = this.f23526f;
        com.bumptech.glide.d dVarR = mainActivity.r();
        if (dVarR == null) {
            throw new IllegalStateException(("Activity " + mainActivity + " does not have an ActionBar set via setSupportActionBar()").toString());
        }
        dVarR.S(c2540f != null);
        v vVar = (v) mainActivity.q();
        vVar.getClass();
        vVar.H();
        com.bumptech.glide.d dVar = vVar.f20385C;
        if (dVar != null) {
            dVar.U(c2540f);
            dVar.T(i);
        }
    }
}
