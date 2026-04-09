package f2;

import f.AbstractC5487d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5498D f46892a;

    /* renamed from: b, reason: collision with root package name */
    private final int f46893b;

    /* renamed from: c, reason: collision with root package name */
    private final String f46894c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f46895d;

    /* renamed from: e, reason: collision with root package name */
    private Map f46896e;

    /* renamed from: f, reason: collision with root package name */
    private List f46897f;

    /* renamed from: g, reason: collision with root package name */
    private Map f46898g;

    public s(AbstractC5498D navigator, int i10, String str) {
        AbstractC6492s.i(navigator, "navigator");
        this.f46892a = navigator;
        this.f46893b = i10;
        this.f46894c = str;
        this.f46896e = new LinkedHashMap();
        this.f46897f = new ArrayList();
        this.f46898g = new LinkedHashMap();
    }

    public final void a(String name, C5509h argument) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(argument, "argument");
        this.f46896e.put(name, argument);
    }

    public r b() {
        r rVarE = e();
        rVarE.G(this.f46895d);
        for (Map.Entry entry : this.f46896e.entrySet()) {
            rVarE.e((String) entry.getKey(), (C5509h) entry.getValue());
        }
        Iterator it = this.f46897f.iterator();
        while (it.hasNext()) {
            rVarE.f((p) it.next());
        }
        for (Map.Entry entry2 : this.f46898g.entrySet()) {
            int iIntValue = ((Number) entry2.getKey()).intValue();
            AbstractC5487d.a(entry2.getValue());
            rVarE.C(iIntValue, null);
        }
        String str = this.f46894c;
        if (str != null) {
            rVarE.I(str);
        }
        int i10 = this.f46893b;
        if (i10 != -1) {
            rVarE.D(i10);
        }
        return rVarE;
    }

    public final void c(p navDeepLink) {
        AbstractC6492s.i(navDeepLink, "navDeepLink");
        this.f46897f.add(navDeepLink);
    }

    public final String d() {
        return this.f46894c;
    }

    protected r e() {
        return this.f46892a.a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(AbstractC5498D navigator, String str) {
        this(navigator, -1, str);
        AbstractC6492s.i(navigator, "navigator");
    }
}
