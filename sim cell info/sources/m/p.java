package m;

import java.util.ArrayList;
import m.e;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private int f2957a;

    /* renamed from: b, reason: collision with root package name */
    private int f2958b;

    /* renamed from: c, reason: collision with root package name */
    private int f2959c;

    /* renamed from: d, reason: collision with root package name */
    private int f2960d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<a> f2961e = new ArrayList<>();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private e f2962a;

        /* renamed from: b, reason: collision with root package name */
        private e f2963b;

        /* renamed from: c, reason: collision with root package name */
        private int f2964c;

        /* renamed from: d, reason: collision with root package name */
        private e.c f2965d;

        /* renamed from: e, reason: collision with root package name */
        private int f2966e;

        public a(e eVar) {
            this.f2962a = eVar;
            this.f2963b = eVar.i();
            this.f2964c = eVar.d();
            this.f2965d = eVar.h();
            this.f2966e = eVar.c();
        }

        public void a(f fVar) {
            fVar.h(this.f2962a.j()).b(this.f2963b, this.f2964c, this.f2965d, this.f2966e);
        }

        public void b(f fVar) {
            int iC;
            e eVarH = fVar.h(this.f2962a.j());
            this.f2962a = eVarH;
            if (eVarH != null) {
                this.f2963b = eVarH.i();
                this.f2964c = this.f2962a.d();
                this.f2965d = this.f2962a.h();
                iC = this.f2962a.c();
            } else {
                this.f2963b = null;
                iC = 0;
                this.f2964c = 0;
                this.f2965d = e.c.STRONG;
            }
            this.f2966e = iC;
        }
    }

    public p(f fVar) {
        this.f2957a = fVar.G();
        this.f2958b = fVar.H();
        this.f2959c = fVar.D();
        this.f2960d = fVar.r();
        ArrayList<e> arrayListI = fVar.i();
        int size = arrayListI.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2961e.add(new a(arrayListI.get(i2)));
        }
    }

    public void a(f fVar) {
        fVar.C0(this.f2957a);
        fVar.D0(this.f2958b);
        fVar.y0(this.f2959c);
        fVar.b0(this.f2960d);
        int size = this.f2961e.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2961e.get(i2).a(fVar);
        }
    }

    public void b(f fVar) {
        this.f2957a = fVar.G();
        this.f2958b = fVar.H();
        this.f2959c = fVar.D();
        this.f2960d = fVar.r();
        int size = this.f2961e.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2961e.get(i2).b(fVar);
        }
    }
}
