package K1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import m0.C5308a;

/* compiled from: TransitionManager.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final K1.a f3016a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<WeakReference<C5308a<ViewGroup, ArrayList<i>>>> f3017b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList<ViewGroup> f3018c;

    static {
        K1.a aVar = new K1.a();
        aVar.O(1);
        aVar.M(new c(2));
        aVar.M(new b());
        aVar.M(new c(1));
        f3016a = aVar;
        f3017b = new ThreadLocal<>();
        f3018c = new ArrayList<>();
    }

    public static void a(ViewGroup viewGroup, i iVar) {
        ArrayList<ViewGroup> arrayList = f3018c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (iVar == null) {
            iVar = f3016a;
        }
        i iVarClone = iVar.clone();
        d(viewGroup, iVarClone);
        viewGroup.setTag(R.id.transition_current_scene, null);
        a aVar = new a();
        aVar.f3019b = iVarClone;
        aVar.f3020c = viewGroup;
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static void b(ViewGroup viewGroup) {
        f3018c.remove(viewGroup);
        ArrayList<i> arrayList = c().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((i) arrayList2.get(size)).p(viewGroup);
        }
    }

    public static C5308a<ViewGroup, ArrayList<i>> c() {
        C5308a<ViewGroup, ArrayList<i>> c5308a;
        ThreadLocal<WeakReference<C5308a<ViewGroup, ArrayList<i>>>> threadLocal = f3017b;
        WeakReference<C5308a<ViewGroup, ArrayList<i>>> weakReference = threadLocal.get();
        if (weakReference != null && (c5308a = weakReference.get()) != null) {
            return c5308a;
        }
        C5308a<ViewGroup, ArrayList<i>> c5308a2 = new C5308a<>();
        threadLocal.set(new WeakReference<>(c5308a2));
        return c5308a2;
    }

    public static void d(ViewGroup viewGroup, i iVar) {
        B.b bVar;
        ArrayList<i> arrayList = c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().y(viewGroup);
            }
        }
        if (iVar != null) {
            iVar.j(viewGroup, true);
        }
        h hVar = (h) viewGroup.getTag(R.id.transition_current_scene);
        if (hVar == null || ((h) hVar.f2972a.getTag(R.id.transition_current_scene)) != hVar || (bVar = hVar.f2974c) == null) {
            return;
        }
        bVar.run();
    }

    /* compiled from: TransitionManager.java */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public i f3019b;

        /* renamed from: c, reason: collision with root package name */
        public ViewGroup f3020c;

        /* compiled from: TransitionManager.java */
        /* renamed from: K1.m$a$a, reason: collision with other inner class name */
        public class C0053a extends l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C5308a f3021a;

            public C0053a(C5308a c5308a) {
                this.f3021a = c5308a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // K1.i.d
            public final void a(i iVar) {
                ((ArrayList) this.f3021a.get(a.this.f3020c)).remove(iVar);
                iVar.z(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:101:0x021d  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0249  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x01f5 A[EDGE_INSN: B:135:0x01f5->B:91:0x01f5 BREAK  A[LOOP:1: B:19:0x0087->B:90:0x01eb], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x01fc  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onPreDraw() {
            /*
                Method dump skipped, instructions count: 705
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: K1.m.a.onPreDraw():boolean");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f3020c;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            ArrayList<ViewGroup> arrayList = m.f3018c;
            ViewGroup viewGroup2 = this.f3020c;
            arrayList.remove(viewGroup2);
            ArrayList<i> arrayList2 = m.c().get(viewGroup2);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator<i> it = arrayList2.iterator();
                while (it.hasNext()) {
                    it.next().C(viewGroup2);
                }
            }
            this.f3019b.k(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
