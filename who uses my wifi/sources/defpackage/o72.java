package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o72 implements lg0 {
    public final Set a;
    public final boolean b;
    public final int c;
    public final r12 d;
    public final boolean f;
    public final ArrayList e = new ArrayList();
    public final HashMap g = new HashMap();

    public o72(HashSet hashSet, boolean z, int i, r12 r12Var, List list, boolean z2) {
        this.a = hashSet;
        this.b = z;
        this.c = i;
        this.d = r12Var;
        this.f = z2;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.startsWith("custom:")) {
                    String[] strArrSplit = str.split(":", 3);
                    if (strArrSplit.length == 3) {
                        if ("true".equals(strArrSplit[2])) {
                            this.g.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(strArrSplit[2])) {
                            this.g.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.e.add(str);
                }
            }
        }
    }

    @Override // defpackage.bd0
    public final boolean a() {
        return this.f;
    }

    @Override // defpackage.bd0
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.bd0
    public final Set c() {
        return this.a;
    }

    @Override // defpackage.bd0
    public final int d() {
        return this.c;
    }
}
