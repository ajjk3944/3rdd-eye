package kotlinx.serialization.descriptors;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.p;
import z8.r;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f22757a;

    /* renamed from: b, reason: collision with root package name */
    public List f22758b;

    /* renamed from: c, reason: collision with root package name */
    public final List f22759c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f22760d;

    /* renamed from: e, reason: collision with root package name */
    public final List f22761e;

    /* renamed from: f, reason: collision with root package name */
    public final List f22762f;

    /* renamed from: g, reason: collision with root package name */
    public final List f22763g;

    public a(String serialName) {
        p.e(serialName, "serialName");
        this.f22757a = serialName;
        this.f22758b = r.j();
        this.f22759c = new ArrayList();
        this.f22760d = new HashSet();
        this.f22761e = new ArrayList();
        this.f22762f = new ArrayList();
        this.f22763g = new ArrayList();
    }

    public static /* synthetic */ void b(a aVar, String str, f fVar, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = r.j();
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        aVar.a(str, fVar, list, z10);
    }

    public final void a(String elementName, f descriptor, List annotations, boolean z10) {
        p.e(elementName, "elementName");
        p.e(descriptor, "descriptor");
        p.e(annotations, "annotations");
        if (!this.f22760d.add(elementName)) {
            throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered").toString());
        }
        this.f22759c.add(elementName);
        this.f22761e.add(descriptor);
        this.f22762f.add(annotations);
        this.f22763g.add(Boolean.valueOf(z10));
    }

    public final List c() {
        return this.f22758b;
    }

    public final List d() {
        return this.f22762f;
    }

    public final List e() {
        return this.f22761e;
    }

    public final List f() {
        return this.f22759c;
    }

    public final List g() {
        return this.f22763g;
    }

    public final void h(List list) {
        p.e(list, "<set-?>");
        this.f22758b = list;
    }
}
