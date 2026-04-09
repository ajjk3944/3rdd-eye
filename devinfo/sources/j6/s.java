package j6;

import android.widget.FrameLayout;
import com.liuzh.deviceinfo.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final a f27451a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f27452b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f27453c;

    static {
        a aVar = new a();
        aVar.C = new ArrayList();
        aVar.F = false;
        aVar.G = 0;
        aVar.D = false;
        aVar.L(new h(2));
        aVar.L(new f());
        aVar.L(new h(1));
        f27451a = aVar;
        f27452b = new ThreadLocal();
        f27453c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, o oVar) {
        ArrayList arrayList = f27453c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (oVar == null) {
            oVar = f27451a;
        }
        o oVarClone = oVar.clone();
        ArrayList arrayList2 = (ArrayList) b().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                ((o) obj).x(frameLayout);
            }
        }
        oVarClone.h(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        r rVar = new r();
        rVar.f27449a = oVarClone;
        rVar.f27450b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(rVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(rVar);
    }

    public static x.e b() {
        x.e eVar;
        ThreadLocal threadLocal = f27452b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (x.e) weakReference.get()) != null) {
            return eVar;
        }
        x.e eVar2 = new x.e(0);
        threadLocal.set(new WeakReference(eVar2));
        return eVar2;
    }
}
