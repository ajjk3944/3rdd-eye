package j0;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f27000a;

    /* renamed from: b, reason: collision with root package name */
    public final List[] f27001b;

    /* renamed from: c, reason: collision with root package name */
    public int f27002c;

    /* renamed from: d, reason: collision with root package name */
    public int f27003d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0 f27005f;

    public w0(x0 x0Var, List list) {
        this.f27005f = x0Var;
        this.f27000a = list;
        this.f27001b = new List[list.size()];
        if (list.isEmpty()) {
            f0.a.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
