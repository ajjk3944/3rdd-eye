package A;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class g implements d {

    /* renamed from: d, reason: collision with root package name */
    public final p f22d;

    /* renamed from: f, reason: collision with root package name */
    public int f24f;

    /* renamed from: g, reason: collision with root package name */
    public int f25g;

    /* renamed from: a, reason: collision with root package name */
    public p f19a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f23e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f26h = 1;
    public h i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f27j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f28k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f29l = new ArrayList();

    public g(p pVar) {
        this.f22d = pVar;
    }

    @Override // A.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f29l;
        int size = arrayList.size();
        int i = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (!((g) obj).f27j) {
                return;
            }
        }
        this.f21c = true;
        p pVar = this.f19a;
        if (pVar != null) {
            pVar.a(this);
        }
        if (this.f20b) {
            this.f22d.a(this);
            return;
        }
        int size2 = arrayList.size();
        g gVar = null;
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = arrayList.get(i6);
            i6++;
            g gVar2 = (g) obj2;
            if (!(gVar2 instanceof h)) {
                i++;
                gVar = gVar2;
            }
        }
        if (gVar != null && i == 1 && gVar.f27j) {
            h hVar = this.i;
            if (hVar != null) {
                if (!hVar.f27j) {
                    return;
                } else {
                    this.f24f = this.f26h * hVar.f25g;
                }
            }
            d(gVar.f25g + this.f24f);
        }
        p pVar2 = this.f19a;
        if (pVar2 != null) {
            pVar2.a(this);
        }
    }

    public final void b(p pVar) {
        this.f28k.add(pVar);
        if (this.f27j) {
            pVar.a(pVar);
        }
    }

    public final void c() {
        this.f29l.clear();
        this.f28k.clear();
        this.f27j = false;
        this.f25g = 0;
        this.f21c = false;
        this.f20b = false;
    }

    public void d(int i) {
        if (this.f27j) {
            return;
        }
        this.f27j = true;
        this.f25g = i;
        ArrayList arrayList = this.f28k;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22d.f44b.f24331h0);
        sb.append(":");
        switch (this.f23e) {
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
        sb.append(str);
        sb.append("(");
        sb.append(this.f27j ? Integer.valueOf(this.f25g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f29l.size());
        sb.append(":d=");
        sb.append(this.f28k.size());
        sb.append(">");
        return sb.toString();
    }
}
