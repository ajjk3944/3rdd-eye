package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import b0.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final MotionLayout f2065a;

    /* renamed from: c, reason: collision with root package name */
    public HashSet f2067c;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f2069e;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2066b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public String f2068d = "ViewTransitionController";

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f2070f = new ArrayList();

    public class a implements e.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f2071a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2072b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f2073c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f2074d;

        public a(c cVar, int i10, boolean z10, int i11) {
            this.f2071a = cVar;
            this.f2072b = i10;
            this.f2073c = z10;
            this.f2074d = i11;
        }
    }

    public d(MotionLayout motionLayout) {
        this.f2065a = motionLayout;
    }

    public void a(c cVar) {
        this.f2066b.add(cVar);
        this.f2067c = null;
        if (cVar.h() == 4) {
            e(cVar, true);
        } else if (cVar.h() == 5) {
            e(cVar, false);
        }
    }

    public void b(c.b bVar) {
        if (this.f2069e == null) {
            this.f2069e = new ArrayList();
        }
        this.f2069e.add(bVar);
    }

    public void c() {
        ArrayList arrayList = this.f2069e;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((c.b) obj).a();
        }
        this.f2069e.removeAll(this.f2070f);
        this.f2070f.clear();
        if (this.f2069e.isEmpty()) {
            this.f2069e = null;
        }
    }

    public void d() {
        this.f2065a.invalidate();
    }

    public final void e(c cVar, boolean z10) {
        ConstraintLayout.getSharedValues().a(cVar.g(), new a(cVar, cVar.g(), z10, cVar.f()));
    }

    public void f(c.b bVar) {
        this.f2070f.add(bVar);
    }

    public void g(MotionEvent motionEvent) {
        d dVar = this;
        int currentState = dVar.f2065a.getCurrentState();
        if (currentState == -1) {
            return;
        }
        if (dVar.f2067c == null) {
            dVar.f2067c = new HashSet();
            ArrayList arrayList = dVar.f2066b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                c cVar = (c) obj;
                int childCount = dVar.f2065a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = dVar.f2065a.getChildAt(i11);
                    if (cVar.i(childAt)) {
                        childAt.getId();
                        dVar.f2067c.add(childAt);
                    }
                }
            }
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        Rect rect = new Rect();
        int action = motionEvent.getAction();
        ArrayList arrayList2 = dVar.f2069e;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = dVar.f2069e;
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList3.get(i12);
                i12++;
                ((c.b) obj2).d(action, x10, y10);
            }
        }
        if (action == 0 || action == 1) {
            androidx.constraintlayout.widget.c cVarO0 = dVar.f2065a.o0(currentState);
            ArrayList arrayList4 = dVar.f2066b;
            int size3 = arrayList4.size();
            int i13 = 0;
            while (i13 < size3) {
                int i14 = i13 + 1;
                c cVar2 = (c) arrayList4.get(i13);
                if (cVar2.k(action)) {
                    Iterator it = dVar.f2067c.iterator();
                    while (it.hasNext()) {
                        View view = (View) it.next();
                        if (cVar2.i(view)) {
                            view.getHitRect(rect);
                            if (rect.contains((int) x10, (int) y10)) {
                                cVar2.c(dVar, dVar.f2065a, currentState, cVarO0, view);
                            }
                            dVar = this;
                        }
                    }
                }
                dVar = this;
                i13 = i14;
            }
        }
    }
}
