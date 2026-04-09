package t7;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22522a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f22523b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f22524c = new ArrayList();

    public static void a(ViewGroup viewGroup, q qVar) {
        ArrayList arrayList = f22524c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (qVar == null) {
            qVar = f22522a;
        }
        q qVarClone = qVar.clone();
        ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((q) it.next()).y(viewGroup);
            }
        }
        qVarClone.h(viewGroup, true);
        if (viewGroup.getTag(i.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        viewGroup.setTag(i.transition_current_scene, null);
        t tVar = new t();
        tVar.f22520a = qVarClone;
        tVar.f22521d = viewGroup;
        viewGroup.addOnAttachStateChangeListener(tVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(tVar);
    }

    public static u.e b() {
        u.e eVar;
        ThreadLocal threadLocal = f22523b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (u.e) weakReference.get()) != null) {
            return eVar;
        }
        u.e eVar2 = new u.e(0);
        threadLocal.set(new WeakReference(eVar2));
        return eVar2;
    }
}
