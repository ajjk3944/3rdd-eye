package Rh;

import Zg.AbstractC3689v;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.h;

/* renamed from: Rh.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3478f implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.h {

    /* renamed from: a, reason: collision with root package name */
    private final Zh.c f19905a;

    public C3478f(Zh.c fqNameToMatch) {
        AbstractC6492s.i(fqNameToMatch, "fqNameToMatch");
        this.f19905a = fqNameToMatch;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.h
    public boolean P(Zh.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3477e l(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        if (AbstractC6492s.d(fqName, this.f19905a)) {
            return C3477e.f19903a;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.h
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return AbstractC3689v.l().iterator();
    }
}
