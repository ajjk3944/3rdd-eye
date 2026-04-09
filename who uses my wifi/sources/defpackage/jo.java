package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class jo implements ho {
    public final m81 d;
    public int f;
    public int g;
    public m81 a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public ap i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public jo(m81 m81Var) {
        this.d = m81Var;
    }

    @Override // defpackage.ho
    public final void a(ho hoVar) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((jo) obj).j) {
                return;
            }
        }
        this.c = true;
        m81 m81Var = this.a;
        if (m81Var != null) {
            m81Var.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        int size2 = arrayList.size();
        jo joVar = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            jo joVar2 = (jo) obj2;
            if (!(joVar2 instanceof ap)) {
                i++;
                joVar = joVar2;
            }
        }
        if (joVar != null && i == 1 && joVar.j) {
            ap apVar = this.i;
            if (apVar != null) {
                if (!apVar.j) {
                    return;
                } else {
                    this.f = this.h * apVar.g;
                }
            }
            d(joVar.g + this.f);
        }
        m81 m81Var2 = this.a;
        if (m81Var2 != null) {
            m81Var2.a(this);
        }
    }

    public final void b(m81 m81Var) {
        this.k.add(m81Var);
        if (this.j) {
            m81Var.a(m81Var);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ho hoVar = (ho) obj;
            hoVar.a(hoVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.h0);
        sb.append(":");
        switch (this.e) {
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
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
