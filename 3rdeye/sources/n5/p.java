package n5;

import c5.h;
import java.util.HashMap;
import o5.C5422a;
import o5.C5423b;

/* compiled from: ProtoEncoderDoNotUse.java */
/* loaded from: classes2.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final c5.h f44369a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        c5.g gVar = h.a.f18503a;
        map.put(p.class, C5366c.f44333a);
        map2.remove(p.class);
        map.put(C5423b.class, C5365b.f44331a);
        map2.remove(C5423b.class);
        map.put(C5422a.class, C5364a.f44316a);
        map2.remove(C5422a.class);
        f44369a = new c5.h(new HashMap(map), new HashMap(map2), gVar);
    }

    public abstract C5423b a();
}
