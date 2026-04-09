package defpackage;

import android.widget.FrameLayout;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class z21 {
    public static final b9 a;
    public static final ThreadLocal b;
    public static final ArrayList c;

    static {
        b9 b9Var = new b9();
        b9Var.F = new ArrayList();
        b9Var.I = false;
        b9Var.J = 0;
        b9Var.G = false;
        b9Var.I(new bu(2));
        b9Var.I(new ee());
        b9Var.I(new bu(1));
        a = b9Var;
        b = new ThreadLocal();
        c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, v21 v21Var) {
        ArrayList arrayList = c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (v21Var == null) {
            v21Var = a;
        }
        v21 v21VarClone = v21Var.clone();
        ArrayList arrayList2 = (ArrayList) b().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((v21) obj).w(frameLayout);
            }
        }
        v21VarClone.h(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        y21 y21Var = new y21();
        y21Var.f = v21VarClone;
        y21Var.g = frameLayout;
        frameLayout.addOnAttachStateChangeListener(y21Var);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(y21Var);
    }

    public static s8 b() {
        s8 s8Var;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (s8Var = (s8) weakReference.get()) != null) {
            return s8Var;
        }
        s8 s8Var2 = new s8(0);
        threadLocal.set(new WeakReference(s8Var2));
        return s8Var2;
    }
}
