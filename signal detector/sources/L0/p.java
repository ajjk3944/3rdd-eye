package L0;

import android.view.ViewGroup;
import com.apm.insight.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import u.C2936e;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final C0156a f2482a = new C0156a();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f2483b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f2484c = new ArrayList();

    public static void a(ViewGroup viewGroup, l lVar) {
        ArrayList arrayList = f2484c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (lVar == null) {
            lVar = f2482a;
        }
        l lVarClone = lVar.clone();
        ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((l) obj).x(viewGroup);
            }
        }
        lVarClone.h(viewGroup, true);
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        o oVar = new o();
        oVar.f2480a = lVarClone;
        oVar.f2481b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(oVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(oVar);
    }

    public static C2936e b() {
        C2936e c2936e;
        ThreadLocal threadLocal = f2483b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c2936e = (C2936e) weakReference.get()) != null) {
            return c2936e;
        }
        C2936e c2936e2 = new C2936e(0);
        threadLocal.set(new WeakReference(c2936e2));
        return c2936e2;
    }
}
