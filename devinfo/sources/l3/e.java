package l3;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class e implements d {

    /* renamed from: d, reason: collision with root package name */
    public final n f28560d;

    /* renamed from: f, reason: collision with root package name */
    public int f28562f;
    public int g;

    /* renamed from: a, reason: collision with root package name */
    public n f28557a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f28558b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f28559c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f28561e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f28563h = 1;

    /* renamed from: i, reason: collision with root package name */
    public f f28564i = null;
    public boolean j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f28565k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f28566l = new ArrayList();

    public e(n nVar) {
        this.f28560d = nVar;
    }

    @Override // l3.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f28566l;
        int size = arrayList.size();
        int i4 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (!((e) obj).j) {
                return;
            }
        }
        this.f28559c = true;
        n nVar = this.f28557a;
        if (nVar != null) {
            nVar.a(this);
        }
        if (this.f28558b) {
            this.f28560d.a(this);
            return;
        }
        int size2 = arrayList.size();
        e eVar = null;
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            e eVar2 = (e) obj2;
            if (!(eVar2 instanceof f)) {
                i4++;
                eVar = eVar2;
            }
        }
        if (eVar != null && i4 == 1 && eVar.j) {
            f fVar = this.f28564i;
            if (fVar != null) {
                if (!fVar.j) {
                    return;
                } else {
                    this.f28562f = this.f28563h * fVar.g;
                }
            }
            d(eVar.g + this.f28562f);
        }
        n nVar2 = this.f28557a;
        if (nVar2 != null) {
            nVar2.a(this);
        }
    }

    public final void b(n nVar) {
        this.f28565k.add(nVar);
        if (this.j) {
            nVar.a(nVar);
        }
    }

    public final void c() {
        this.f28566l.clear();
        this.f28565k.clear();
        this.j = false;
        this.g = 0;
        this.f28559c = false;
        this.f28558b = false;
    }

    public void d(int i4) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i4;
        ArrayList arrayList = this.f28565k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f28560d.f28581b.f27853h0);
        sb2.append(":");
        switch (this.f28561e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append("(");
        sb2.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f28566l.size());
        sb2.append(":d=");
        sb2.append(this.f28565k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
