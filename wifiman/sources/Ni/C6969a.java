package ni;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.h;
import mh.InterfaceC6824a;

/* renamed from: ni.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6969a implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.h {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ th.l[] f54735b = {kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(kotlin.jvm.internal.O.b(C6969a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: a, reason: collision with root package name */
    private final oi.i f54736a;

    public C6969a(oi.n storageManager, InterfaceC6824a compute) {
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(compute, "compute");
        this.f54736a = storageManager.f(compute);
    }

    private final List b() {
        return (List) oi.m.a(this.f54736a, this, f54735b[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.h
    public boolean P(Zh.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.h
    public boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return b().iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.h
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c l(Zh.c cVar) {
        return h.b.a(this, cVar);
    }
}
