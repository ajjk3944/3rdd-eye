package o9;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public float f30433a = -3.4028235E38f;

    /* renamed from: b, reason: collision with root package name */
    public float f30434b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public float f30435c = -3.4028235E38f;

    /* renamed from: d, reason: collision with root package name */
    public float f30436d = Float.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public float f30437e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    public float f30438f = Float.MAX_VALUE;
    public float g = -3.4028235E38f;

    /* renamed from: h, reason: collision with root package name */
    public float f30439h = Float.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f30440i = new ArrayList();

    public final void a(f fVar) {
        c(fVar);
        this.f30440i.add(fVar);
    }

    public final void b() {
        Object obj;
        s9.a aVar;
        ArrayList arrayList = this.f30440i;
        if (arrayList == null) {
            return;
        }
        this.f30433a = -3.4028235E38f;
        this.f30434b = Float.MAX_VALUE;
        this.f30435c = -3.4028235E38f;
        this.f30436d = Float.MAX_VALUE;
        int size = arrayList.size();
        int i4 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            c((s9.a) obj2);
        }
        this.f30437e = -3.4028235E38f;
        this.f30438f = Float.MAX_VALUE;
        this.g = -3.4028235E38f;
        this.f30439h = Float.MAX_VALUE;
        int size2 = arrayList.size();
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= size2) {
                aVar = null;
                break;
            }
            Object obj3 = arrayList.get(i11);
            i11++;
            aVar = (s9.a) obj3;
            if (((c) aVar).f30444d == 1) {
                break;
            }
        }
        if (aVar != null) {
            c cVar = (c) aVar;
            this.f30437e = cVar.f30449k;
            this.f30438f = cVar.f30450l;
            int size3 = arrayList.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj4 = arrayList.get(i12);
                i12++;
                c cVar2 = (c) ((s9.a) obj4);
                if (cVar2.f30444d == 1) {
                    float f10 = cVar2.f30450l;
                    if (f10 < this.f30438f) {
                        this.f30438f = f10;
                    }
                    float f11 = cVar2.f30449k;
                    if (f11 > this.f30437e) {
                        this.f30437e = f11;
                    }
                }
            }
        }
        int size4 = arrayList.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size4) {
                break;
            }
            Object obj5 = arrayList.get(i13);
            i13++;
            Object obj6 = (s9.a) obj5;
            if (((c) obj6).f30444d == 2) {
                obj = obj6;
                break;
            }
        }
        if (obj != null) {
            c cVar3 = (c) obj;
            this.g = cVar3.f30449k;
            this.f30439h = cVar3.f30450l;
            int size5 = arrayList.size();
            while (i4 < size5) {
                Object obj7 = arrayList.get(i4);
                i4++;
                c cVar4 = (c) ((s9.a) obj7);
                if (cVar4.f30444d == 2) {
                    float f12 = cVar4.f30450l;
                    if (f12 < this.f30439h) {
                        this.f30439h = f12;
                    }
                    float f13 = cVar4.f30449k;
                    if (f13 > this.g) {
                        this.g = f13;
                    }
                }
            }
        }
    }

    public final void c(s9.a aVar) {
        float f10 = this.f30433a;
        c cVar = (c) aVar;
        float f11 = cVar.f30449k;
        if (f10 < f11) {
            this.f30433a = f11;
        }
        float f12 = this.f30434b;
        float f13 = cVar.f30450l;
        if (f12 > f13) {
            this.f30434b = f13;
        }
        float f14 = this.f30435c;
        float f15 = cVar.f30451m;
        if (f14 < f15) {
            this.f30435c = f15;
        }
        float f16 = this.f30436d;
        float f17 = cVar.f30452n;
        if (f16 > f17) {
            this.f30436d = f17;
        }
        if (cVar.f30444d == 1) {
            if (this.f30437e < f11) {
                this.f30437e = f11;
            }
            if (this.f30438f > f13) {
                this.f30438f = f13;
                return;
            }
            return;
        }
        if (this.g < f11) {
            this.g = f11;
        }
        if (this.f30439h > f13) {
            this.f30439h = f13;
        }
    }

    public s9.a d(int i4) {
        ArrayList arrayList = this.f30440i;
        if (arrayList == null || i4 < 0 || i4 >= arrayList.size()) {
            return null;
        }
        return (s9.a) arrayList.get(i4);
    }

    public final int e() {
        ArrayList arrayList = this.f30440i;
        int size = arrayList.size();
        int size2 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            size2 += ((c) ((s9.a) obj)).j.size();
        }
        return size2;
    }

    public d f(q9.b bVar) {
        int i4 = bVar.f32231e;
        ArrayList arrayList = this.f30440i;
        if (i4 >= arrayList.size()) {
            return null;
        }
        return ((c) ((s9.a) arrayList.get(bVar.f32231e))).e(3, bVar.f32227a, bVar.f32228b);
    }

    public final float g(int i4) {
        if (i4 == 1) {
            float f10 = this.f30437e;
            return f10 == -3.4028235E38f ? this.g : f10;
        }
        float f11 = this.g;
        return f11 == -3.4028235E38f ? this.f30437e : f11;
    }

    public final float h(int i4) {
        if (i4 == 1) {
            float f10 = this.f30438f;
            return f10 == Float.MAX_VALUE ? this.f30439h : f10;
        }
        float f11 = this.f30439h;
        return f11 == Float.MAX_VALUE ? this.f30438f : f11;
    }
}
