package u6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import t6.j0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l extends pk.a {
    public static final String j = t6.v.g("WorkContinuationImpl");

    /* renamed from: e, reason: collision with root package name */
    public final r f35160e;

    /* renamed from: f, reason: collision with root package name */
    public final List f35161f;
    public final ArrayList g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f35162h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f35163i;

    public l(r rVar, List list) {
        this.f35160e = rVar;
        this.f35161f = list;
        this.g = new ArrayList(list.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            String string = ((j0) list.get(i4)).f34372a.toString();
            nk.k.d(string, "toString(...)");
            this.g.add(string);
            this.f35162h.add(string);
        }
    }

    public static HashSet T(l lVar) {
        HashSet hashSet = new HashSet();
        lVar.getClass();
        return hashSet;
    }
}
