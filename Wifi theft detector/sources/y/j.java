package y;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class j {

    /* renamed from: g, reason: collision with root package name */
    public static int f25022g;

    /* renamed from: b, reason: collision with root package name */
    public int f25024b;

    /* renamed from: d, reason: collision with root package name */
    public int f25026d;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f25023a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f25025c = false;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f25027e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f25028f = -1;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public WeakReference f25029a;

        /* renamed from: b, reason: collision with root package name */
        public int f25030b;

        /* renamed from: c, reason: collision with root package name */
        public int f25031c;

        /* renamed from: d, reason: collision with root package name */
        public int f25032d;

        /* renamed from: e, reason: collision with root package name */
        public int f25033e;

        /* renamed from: f, reason: collision with root package name */
        public int f25034f;

        /* renamed from: g, reason: collision with root package name */
        public int f25035g;

        public a(ConstraintWidget constraintWidget, androidx.constraintlayout.core.c cVar, int i10) {
            this.f25029a = new WeakReference(constraintWidget);
            this.f25030b = cVar.x(constraintWidget.P);
            this.f25031c = cVar.x(constraintWidget.Q);
            this.f25032d = cVar.x(constraintWidget.R);
            this.f25033e = cVar.x(constraintWidget.S);
            this.f25034f = cVar.x(constraintWidget.T);
            this.f25035g = i10;
        }
    }

    public j(int i10) {
        int i11 = f25022g;
        f25022g = i11 + 1;
        this.f25024b = i11;
        this.f25026d = i10;
    }

    public boolean a(ConstraintWidget constraintWidget) {
        if (this.f25023a.contains(constraintWidget)) {
            return false;
        }
        this.f25023a.add(constraintWidget);
        return true;
    }

    public void b(ArrayList arrayList) {
        int size = this.f25023a.size();
        if (this.f25028f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                j jVar = (j) arrayList.get(i10);
                if (this.f25028f == jVar.f25024b) {
                    g(this.f25026d, jVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f25024b;
    }

    public int d() {
        return this.f25026d;
    }

    public final String e() {
        int i10 = this.f25026d;
        return i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown";
    }

    public int f(androidx.constraintlayout.core.c cVar, int i10) {
        if (this.f25023a.size() == 0) {
            return 0;
        }
        return j(cVar, this.f25023a, i10);
    }

    public void g(int i10, j jVar) {
        ArrayList arrayList = this.f25023a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ConstraintWidget constraintWidget = (ConstraintWidget) obj;
            jVar.a(constraintWidget);
            if (i10 == 0) {
                constraintWidget.Q0 = jVar.c();
            } else {
                constraintWidget.R0 = jVar.c();
            }
        }
        this.f25028f = jVar.f25024b;
    }

    public void h(boolean z10) {
        this.f25025c = z10;
    }

    public void i(int i10) {
        this.f25026d = i10;
    }

    public final int j(androidx.constraintlayout.core.c cVar, ArrayList arrayList, int i10) {
        int iX;
        int iX2;
        androidx.constraintlayout.core.widgets.d dVar = (androidx.constraintlayout.core.widgets.d) ((ConstraintWidget) arrayList.get(0)).L();
        cVar.D();
        dVar.g(cVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((ConstraintWidget) arrayList.get(i11)).g(cVar, false);
        }
        if (i10 == 0 && dVar.f1803e1 > 0) {
            androidx.constraintlayout.core.widgets.b.b(dVar, cVar, arrayList, 0);
        }
        if (i10 == 1 && dVar.f1804f1 > 0) {
            androidx.constraintlayout.core.widgets.b.b(dVar, cVar, arrayList, 1);
        }
        try {
            cVar.z();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f25027e = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f25027e.add(new a((ConstraintWidget) arrayList.get(i12), cVar, i10));
        }
        if (i10 == 0) {
            iX = cVar.x(dVar.P);
            iX2 = cVar.x(dVar.R);
            cVar.D();
        } else {
            iX = cVar.x(dVar.Q);
            iX2 = cVar.x(dVar.S);
            cVar.D();
        }
        return iX2 - iX;
    }

    public String toString() {
        String str = e() + " [" + this.f25024b + "] <";
        ArrayList arrayList = this.f25023a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            str = str + " " + ((ConstraintWidget) obj).u();
        }
        return str + " >";
    }
}
