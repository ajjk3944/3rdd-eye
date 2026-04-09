package Jh;

import Bh.InterfaceC2495e;
import Zg.AbstractC3689v;
import di.AbstractC5398g;
import di.C5393b;
import di.C5402k;
import fi.AbstractC5833e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Jh.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3110d extends AbstractC3108b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3110d(D javaTypeEnhancementState) {
        super(javaTypeEnhancementState);
        AbstractC6492s.i(javaTypeEnhancementState, "javaTypeEnhancementState");
    }

    private final List B(AbstractC5398g abstractC5398g) {
        if (!(abstractC5398g instanceof C5393b)) {
            return abstractC5398g instanceof C5402k ? AbstractC3689v.e(((C5402k) abstractC5398g).c().d()) : AbstractC3689v.l();
        }
        Iterable iterable = (Iterable) ((C5393b) abstractC5398g).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC3689v.C(arrayList, B((AbstractC5398g) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Jh.AbstractC3108b
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Iterable m(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.h annotations;
        AbstractC6492s.i(cVar, "<this>");
        InterfaceC2495e interfaceC2495eL = AbstractC5833e.l(cVar);
        return (interfaceC2495eL == null || (annotations = interfaceC2495eL.getAnnotations()) == null) ? AbstractC3689v.l() : annotations;
    }

    @Override // Jh.AbstractC3108b
    public boolean o() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Jh.AbstractC3108b
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Iterable c(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar, boolean z10) {
        AbstractC6492s.i(cVar, "<this>");
        Map mapA = cVar.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapA.entrySet()) {
            AbstractC3689v.C(arrayList, (!z10 || AbstractC6492s.d((Zh.f) entry.getKey(), I.f10104c)) ? B((AbstractC5398g) entry.getValue()) : AbstractC3689v.l());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Jh.AbstractC3108b
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Zh.c k(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        AbstractC6492s.i(cVar, "<this>");
        return cVar.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Jh.AbstractC3108b
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Object l(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        AbstractC6492s.i(cVar, "<this>");
        InterfaceC2495e interfaceC2495eL = AbstractC5833e.l(cVar);
        AbstractC6492s.f(interfaceC2495eL);
        return interfaceC2495eL;
    }
}
