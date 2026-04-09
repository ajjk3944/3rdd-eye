package W0;

import V0.m;
import V0.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends com.bumptech.glide.e {

    /* renamed from: h, reason: collision with root package name */
    public static final String f3967h = m.h("WorkContinuationImpl");

    /* renamed from: c, reason: collision with root package name */
    public final k f3968c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3969d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3970e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3971f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f3972g;

    public e(k kVar, List list) {
        this.f3968c = kVar;
        this.f3969d = list;
        this.f3970e = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String string = ((n) list.get(i)).f3831a.toString();
            this.f3970e.add(string);
            this.f3971f.add(string);
        }
    }

    public static HashSet B(e eVar) {
        HashSet hashSet = new HashSet();
        eVar.getClass();
        return hashSet;
    }
}
