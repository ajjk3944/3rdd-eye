package O9;

import N7.B8;
import c9.C2099t;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: SerialDescriptors.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10481a;

    /* renamed from: b, reason: collision with root package name */
    public List<? extends Annotation> f10482b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10483c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f10484d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f10485e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f10486f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f10487g;

    public a(String serialName) {
        kotlin.jvm.internal.l.f(serialName, "serialName");
        this.f10481a = serialName;
        this.f10482b = C2099t.f18581b;
        this.f10483c = new ArrayList();
        this.f10484d = new HashSet();
        this.f10485e = new ArrayList();
        this.f10486f = new ArrayList();
        this.f10487g = new ArrayList();
    }

    public static void a(a aVar, String str, e descriptor) {
        C2099t c2099t = C2099t.f18581b;
        aVar.getClass();
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        if (!aVar.f10484d.add(str)) {
            StringBuilder sbK = B8.k("Element with name '", str, "' is already registered in ");
            sbK.append(aVar.f10481a);
            throw new IllegalArgumentException(sbK.toString().toString());
        }
        aVar.f10483c.add(str);
        aVar.f10485e.add(descriptor);
        aVar.f10486f.add(c2099t);
        aVar.f10487g.add(false);
    }
}
