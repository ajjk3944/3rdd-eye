package Mh;

import Qh.InterfaceC3444a;
import Qh.InterfaceC3447d;
import Zg.AbstractC3689v;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.o;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.h;
import zi.AbstractC8783m;

/* loaded from: classes4.dex */
public final class g implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.h {

    /* renamed from: a, reason: collision with root package name */
    private final k f13204a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3447d f13205b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f13206c;

    /* renamed from: d, reason: collision with root package name */
    private final oi.h f13207d;

    public g(k c10, InterfaceC3447d annotationOwner, boolean z10) {
        AbstractC6492s.i(c10, "c");
        AbstractC6492s.i(annotationOwner, "annotationOwner");
        this.f13204a = c10;
        this.f13205b = annotationOwner;
        this.f13206c = z10;
        this.f13207d = c10.a().u().i(new f(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c e(g gVar, InterfaceC3444a annotation) {
        AbstractC6492s.i(annotation, "annotation");
        return Kh.d.f10792a.e(annotation, gVar.f13204a, gVar.f13206c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.h
    public boolean P(Zh.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.h
    public boolean isEmpty() {
        return this.f13205b.getAnnotations().isEmpty() && !this.f13205b.h();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return AbstractC8783m.E(AbstractC8783m.R(AbstractC8783m.N(AbstractC3689v.d0(this.f13205b.getAnnotations()), this.f13207d), Kh.d.f10792a.a(o.a.f51892y, this.f13205b, this.f13204a))).iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.h
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c l(Zh.c fqName) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar;
        AbstractC6492s.i(fqName, "fqName");
        InterfaceC3444a interfaceC3444aL = this.f13205b.l(fqName);
        return (interfaceC3444aL == null || (cVar = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) this.f13207d.invoke(interfaceC3444aL)) == null) ? Kh.d.f10792a.a(fqName, this.f13205b, this.f13204a) : cVar;
    }

    public /* synthetic */ g(k kVar, InterfaceC3447d interfaceC3447d, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, interfaceC3447d, (i10 & 4) != 0 ? false : z10);
    }
}
