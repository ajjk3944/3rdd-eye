package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class w91 extends gi2 {
    public final ha1 j;
    public final List k;
    public final ArrayList l;
    public final ArrayList m = new ArrayList();
    public boolean n;

    static {
        h80.f("WorkContinuationImpl");
    }

    public w91(ha1 ha1Var, List list) {
        this.j = ha1Var;
        this.k = list;
        this.l = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String string = ((mj0) list.get(i)).a.toString();
            this.l.add(string);
            this.m.add(string);
        }
    }

    public static HashSet r0(w91 w91Var) {
        HashSet hashSet = new HashSet();
        w91Var.getClass();
        return hashSet;
    }
}
