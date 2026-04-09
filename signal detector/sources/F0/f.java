package F0;

import R.O;
import a4.t;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.lifecycle.C0288j;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC0708Rf;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC1433kh;
import com.google.android.gms.internal.ads.W9;
import g.AbstractC2327a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import o.AbstractC2720j0;
import o.C2733q;
import o.a1;
import p2.j;
import q.C2784b;
import q.C2785c;
import q5.i;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1435a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1436b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1437c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1438d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1439e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1440f;

    public f(Activity activity, ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh, ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh2) {
        this.f1439e = activity;
        this.f1438d = viewTreeObserverOnGlobalLayoutListenerC1433kh;
        this.f1440f = viewTreeObserverOnGlobalLayoutListenerC1433kh2;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f1438d;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f1435a || this.f1436b) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f1435a) {
                    drawableMutate.setTintList((ColorStateList) this.f1439e);
                }
                if (this.f1436b) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f1440f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        C2733q c2733q = (C2733q) this.f1438d;
        Drawable checkMarkDrawable = c2733q.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f1435a || this.f1436b) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f1435a) {
                    drawableMutate.setTintList((ColorStateList) this.f1439e);
                }
                if (this.f1436b) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f1440f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c2733q.getDrawableState());
                }
                c2733q.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.f1436b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f1439e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f1439e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f1439e;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f1439e = null;
        return bundle2;
    }

    public e d() {
        String str;
        e eVar;
        Iterator it = ((q.f) this.f1438d).iterator();
        do {
            C2784b c2784b = (C2784b) it;
            if (!c2784b.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) c2784b.next();
            i.d(entry, "components");
            str = (String) entry.getKey();
            eVar = (e) entry.getValue();
        } while (!i.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return eVar;
    }

    public void e(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f1438d;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC2327a.f20125m;
        a1 a1VarI = a1.i(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) a1VarI.f22480c;
        O.l(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) a1VarI.f22480c, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(t.i(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(t.i(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(a1VarI.c(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(AbstractC2720j0.c(typedArray.getInt(3, -1), null));
            }
            a1VarI.j();
        } catch (Throwable th) {
            a1VarI.j();
            throw th;
        }
    }

    public void f(String str, e eVar) {
        Object obj;
        i.e(eVar, "provider");
        q.f fVar = (q.f) this.f1438d;
        C2785c c2785cA = fVar.a(str);
        if (c2785cA != null) {
            obj = c2785cA.f22895b;
        } else {
            C2785c c2785c = new C2785c(str, eVar);
            fVar.f22904d++;
            C2785c c2785c2 = fVar.f22902b;
            if (c2785c2 == null) {
                fVar.f22901a = c2785c;
                fVar.f22902b = c2785c;
            } else {
                c2785c2.f22896c = c2785c;
                c2785c.f22897d = c2785c2;
                fVar.f22902b = c2785c;
            }
            obj = null;
        }
        if (((e) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void g() throws NoSuchMethodException, SecurityException {
        if (!this.f1437c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a aVar = (a) this.f1440f;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f1440f = aVar;
        try {
            C0288j.class.getDeclaredConstructor(null);
            a aVar2 = (a) this.f1440f;
            if (aVar2 != null) {
                ((LinkedHashSet) aVar2.f1430b).add(C0288j.class.getName());
            }
        } catch (NoSuchMethodException e6) {
            throw new IllegalArgumentException("Class " + C0288j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
        }
    }

    public void h() {
        ViewTreeObserver viewTreeObserver;
        View decorView;
        ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh = (ViewTreeObserverOnGlobalLayoutListenerC1433kh) this.f1440f;
        if (this.f1435a) {
            return;
        }
        Activity activity = (Activity) this.f1439e;
        ViewTreeObserver viewTreeObserver2 = null;
        if (activity != null) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver3 = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver3 != null) {
                viewTreeObserver3.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1433kh);
            }
        }
        ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh2 = (ViewTreeObserverOnGlobalLayoutListenerC1433kh) this.f1438d;
        W9 w9 = j.f22785C.f22787B;
        ViewTreeObserverOnGlobalLayoutListenerC0708Rf viewTreeObserverOnGlobalLayoutListenerC0708Rf = new ViewTreeObserverOnGlobalLayoutListenerC0708Rf(viewTreeObserverOnGlobalLayoutListenerC1433kh2, viewTreeObserverOnGlobalLayoutListenerC1433kh);
        View view = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC0708Rf.f11985a).get();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserverOnGlobalLayoutListenerC0708Rf.H1(viewTreeObserver2);
        }
        this.f1435a = true;
    }

    public /* synthetic */ f(TextView textView) {
        this.f1439e = null;
        this.f1440f = null;
        this.f1435a = false;
        this.f1436b = false;
        this.f1438d = textView;
    }

    public f() {
        this.f1438d = new q.f();
        this.f1437c = true;
    }
}
