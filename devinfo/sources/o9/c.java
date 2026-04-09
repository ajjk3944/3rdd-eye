package o9;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class c implements s9.a {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f30441a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f30442b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30443c;

    /* renamed from: e, reason: collision with root package name */
    public transient p9.d f30445e;
    public final List j;

    /* renamed from: k, reason: collision with root package name */
    public float f30449k;

    /* renamed from: l, reason: collision with root package name */
    public float f30450l;

    /* renamed from: m, reason: collision with root package name */
    public float f30451m;

    /* renamed from: n, reason: collision with root package name */
    public float f30452n;

    /* renamed from: d, reason: collision with root package name */
    public int f30444d = 1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30446f = true;
    public final w9.d g = new w9.d();

    /* renamed from: h, reason: collision with root package name */
    public final float f30447h = 17.0f;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f30448i = true;

    public c(List list, String str) {
        this.f30441a = null;
        this.f30442b = null;
        this.f30443c = "DataSet";
        this.f30441a = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f30442b = arrayList;
        this.f30441a.add(Integer.valueOf(Color.rgb(140, 234, 255)));
        arrayList.add(-16777216);
        this.f30443c = str;
        this.f30449k = -3.4028235E38f;
        this.f30450l = Float.MAX_VALUE;
        this.f30451m = -3.4028235E38f;
        this.f30452n = Float.MAX_VALUE;
        this.j = list;
        if (list == null) {
            this.j = new ArrayList();
        }
        List list2 = this.j;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        this.f30449k = -3.4028235E38f;
        this.f30450l = Float.MAX_VALUE;
        this.f30451m = -3.4028235E38f;
        this.f30452n = Float.MAX_VALUE;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            a((d) it.next());
        }
    }

    public void a(d dVar) {
        if (dVar == null) {
            return;
        }
        if (dVar.a() < this.f30452n) {
            this.f30452n = dVar.a();
        }
        if (dVar.a() > this.f30451m) {
            this.f30451m = dVar.a();
        }
        b(dVar);
    }

    public final void b(d dVar) {
        float f10 = dVar.f30453a;
        if (f10 < this.f30450l) {
            this.f30450l = f10;
        }
        if (f10 > this.f30449k) {
            this.f30449k = f10;
        }
    }

    public final ArrayList c(float f10) {
        ArrayList arrayList = new ArrayList();
        List list = this.j;
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                break;
            }
            int i10 = (size + i4) / 2;
            d dVar = (d) list.get(i10);
            if (f10 == dVar.a()) {
                while (i10 > 0 && ((d) list.get(i10 - 1)).a() == f10) {
                    i10--;
                }
                int size2 = list.size();
                while (i10 < size2) {
                    d dVar2 = (d) list.get(i10);
                    if (dVar2.a() != f10) {
                        break;
                    }
                    arrayList.add(dVar2);
                    i10++;
                }
            } else if (f10 > dVar.a()) {
                i4 = i10 + 1;
            } else {
                size = i10 - 1;
            }
        }
        return arrayList;
    }

    public final d d(int i4) {
        return (d) this.j.get(i4);
    }

    public final d e(int i4, float f10, float f11) {
        int iF = f(i4, f10, f11);
        if (iF > -1) {
            return (d) this.j.get(iF);
        }
        return null;
    }

    public final int f(int i4, float f10, float f11) {
        int i10;
        d dVar;
        List list = this.j;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 < size) {
            int i12 = (i11 + size) / 2;
            float fA = ((d) list.get(i12)).a() - f10;
            int i13 = i12 + 1;
            float fA2 = ((d) list.get(i13)).a() - f10;
            float fAbs = Math.abs(fA);
            float fAbs2 = Math.abs(fA2);
            if (fAbs2 >= fAbs) {
                if (fAbs >= fAbs2) {
                    double d10 = fA;
                    if (d10 < 0.0d) {
                        if (d10 < 0.0d) {
                        }
                    }
                }
                size = i12;
            }
            i11 = i13;
        }
        if (size != -1) {
            float fA3 = ((d) list.get(size)).a();
            if (i4 == 1) {
                if (fA3 < f10 && size < list.size() - 1) {
                    size++;
                }
            } else if (i4 == 2 && fA3 > f10 && size > 0) {
                size--;
            }
            if (!Float.isNaN(f11)) {
                while (size > 0 && ((d) list.get(size - 1)).a() == fA3) {
                    size--;
                }
                float f12 = ((d) list.get(size)).f30453a;
                loop2: while (true) {
                    i10 = size;
                    do {
                        size++;
                        if (size >= list.size()) {
                            break loop2;
                        }
                        dVar = (d) list.get(size);
                        if (dVar.a() != fA3) {
                            break loop2;
                        }
                    } while (Math.abs(dVar.f30453a - f11) >= Math.abs(f12 - f11));
                    f12 = f11;
                }
                return i10;
            }
        }
        return size;
    }

    public final int g(int i4) {
        ArrayList arrayList = this.f30442b;
        return ((Integer) arrayList.get(i4 % arrayList.size())).intValue();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuilder sb2 = new StringBuilder("DataSet, label: ");
        String str = this.f30443c;
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append(", entries: ");
        List list = this.j;
        sb2.append(list.size());
        sb2.append("\n");
        stringBuffer2.append(sb2.toString());
        stringBuffer.append(stringBuffer2.toString());
        for (int i4 = 0; i4 < list.size(); i4++) {
            stringBuffer.append(((d) list.get(i4)).toString() + " ");
        }
        return stringBuffer.toString();
    }
}
