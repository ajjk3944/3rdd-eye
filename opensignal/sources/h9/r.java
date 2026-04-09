package h9;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final f f10465a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10466b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f10467c = null;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f10468d = null;

    public r(f fVar, String str) {
        this.f10465a = null;
        this.f10466b = null;
        this.f10465a = fVar == null ? f.DESCENDANT : fVar;
        this.f10466b = str;
    }

    public final void a(String str, d dVar, String str2) {
        if (this.f10467c == null) {
            this.f10467c = new ArrayList();
        }
        this.f10467c.add(new c(str, dVar, str2));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        f fVar = f.CHILD;
        f fVar2 = this.f10465a;
        if (fVar2 == fVar) {
            sb2.append("> ");
        } else if (fVar2 == f.FOLLOWS) {
            sb2.append("+ ");
        }
        String str = this.f10466b;
        if (str == null) {
            str = "*";
        }
        sb2.append(str);
        ArrayList arrayList = this.f10467c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                sb2.append('[');
                String str2 = cVar.f10310a;
                String str3 = cVar.f10312c;
                sb2.append(str2);
                int i10 = b.f10304a[cVar.f10311b.ordinal()];
                if (i10 == 1) {
                    sb2.append('=');
                    sb2.append(str3);
                } else if (i10 == 2) {
                    sb2.append("~=");
                    sb2.append(str3);
                } else if (i10 == 3) {
                    sb2.append("|=");
                    sb2.append(str3);
                }
                sb2.append(']');
            }
        }
        ArrayList arrayList2 = this.f10468d;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                h hVar = (h) it2.next();
                sb2.append(':');
                sb2.append(hVar);
            }
        }
        return sb2.toString();
    }
}
