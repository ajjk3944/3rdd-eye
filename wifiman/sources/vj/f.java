package vj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.kodein.di.DI;

/* loaded from: classes3.dex */
public class f extends b implements DI.f {

    /* renamed from: f, reason: collision with root package name */
    private final List f63670f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f63671g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f63672h;

    public f(boolean z10) {
        super(null, "", new HashSet(), new c(true, z10, new HashMap(), new ArrayList(), new ArrayList()));
        this.f63670f = new ArrayList();
        DI.c cVar = DI.f56898e1;
        this.f63671g = cVar.b();
        this.f63672h = cVar.a();
    }

    public List i() {
        return this.f63670f;
    }

    public boolean j() {
        return this.f63672h;
    }

    public boolean k() {
        return this.f63671g;
    }
}
