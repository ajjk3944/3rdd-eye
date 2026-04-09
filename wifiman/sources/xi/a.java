package Xi;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f24427a;

    /* renamed from: b, reason: collision with root package name */
    private List f24428b;

    /* renamed from: c, reason: collision with root package name */
    private final List f24429c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f24430d;

    /* renamed from: e, reason: collision with root package name */
    private final List f24431e;

    /* renamed from: f, reason: collision with root package name */
    private final List f24432f;

    /* renamed from: g, reason: collision with root package name */
    private final List f24433g;

    public a(String serialName) {
        AbstractC6492s.i(serialName, "serialName");
        this.f24427a = serialName;
        this.f24428b = AbstractC3689v.l();
        this.f24429c = new ArrayList();
        this.f24430d = new HashSet();
        this.f24431e = new ArrayList();
        this.f24432f = new ArrayList();
        this.f24433g = new ArrayList();
    }

    public static /* synthetic */ void b(a aVar, String str, f fVar, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = AbstractC3689v.l();
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        aVar.a(str, fVar, list, z10);
    }

    public final void a(String elementName, f descriptor, List annotations, boolean z10) {
        AbstractC6492s.i(elementName, "elementName");
        AbstractC6492s.i(descriptor, "descriptor");
        AbstractC6492s.i(annotations, "annotations");
        if (this.f24430d.add(elementName)) {
            this.f24429c.add(elementName);
            this.f24431e.add(descriptor);
            this.f24432f.add(annotations);
            this.f24433g.add(Boolean.valueOf(z10));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f24427a).toString());
    }

    public final List c() {
        return this.f24428b;
    }

    public final List d() {
        return this.f24432f;
    }

    public final List e() {
        return this.f24431e;
    }

    public final List f() {
        return this.f24429c;
    }

    public final List g() {
        return this.f24433g;
    }

    public final void h(List list) {
        AbstractC6492s.i(list, "<set-?>");
        this.f24428b = list;
    }
}
