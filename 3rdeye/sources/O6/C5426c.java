package o6;

import j6.y;
import kotlin.jvm.internal.l;
import p6.h;
import r6.C5529f;
import s6.k;

/* compiled from: ExpressionsRuntime.kt */
/* renamed from: o6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5426c {

    /* renamed from: a, reason: collision with root package name */
    public final C5425b f44857a;

    /* renamed from: b, reason: collision with root package name */
    public final k f44858b;

    /* renamed from: c, reason: collision with root package name */
    public final C5529f f44859c;

    /* renamed from: d, reason: collision with root package name */
    public final H7.e f44860d;

    /* renamed from: e, reason: collision with root package name */
    public final h f44861e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f44862f;

    public C5426c(C5425b expressionResolver, k kVar, C5529f c5529f, H7.e functionProvider, h runtimeStore) {
        l.f(expressionResolver, "expressionResolver");
        l.f(functionProvider, "functionProvider");
        l.f(runtimeStore, "runtimeStore");
        this.f44857a = expressionResolver;
        this.f44858b = kVar;
        this.f44859c = c5529f;
        this.f44860d = functionProvider;
        this.f44861e = runtimeStore;
        this.f44862f = true;
    }

    public final void a(y view) {
        l.f(view, "view");
        C5529f c5529f = this.f44859c;
        if (c5529f != null) {
            c5529f.c(view);
        }
    }

    public final void b() {
        if (this.f44862f) {
            this.f44862f = false;
            C5425b c5425b = this.f44857a;
            c5425b.getClass();
            c5425b.f44850d.l(c5425b, new F7.h(c5425b, 8));
            this.f44858b.k();
        }
    }
}
