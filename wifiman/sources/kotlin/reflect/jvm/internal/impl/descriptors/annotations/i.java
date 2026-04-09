package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.h;

/* loaded from: classes4.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private final List f51917a;

    public i(List annotations) {
        AbstractC6492s.i(annotations, "annotations");
        this.f51917a = annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.h
    public boolean P(Zh.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.h
    public boolean isEmpty() {
        return this.f51917a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f51917a.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.h
    public c l(Zh.c cVar) {
        return h.b.a(this, cVar);
    }

    public String toString() {
        return this.f51917a.toString();
    }
}
