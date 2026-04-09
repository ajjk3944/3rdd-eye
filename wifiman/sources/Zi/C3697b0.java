package Zi;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Zi.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3697b0 extends AbstractC3717l0 {

    /* renamed from: c, reason: collision with root package name */
    private final Xi.f f25613c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3697b0(Vi.b kSerializer, Vi.b vSerializer) {
        super(kSerializer, vSerializer, null);
        AbstractC6492s.i(kSerializer, "kSerializer");
        AbstractC6492s.i(vSerializer, "vSerializer");
        this.f25613c = new C3695a0(kSerializer.a(), vSerializer.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int k(Map map) {
        AbstractC6492s.i(map, "<this>");
        return map.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap q(Map map) {
        AbstractC6492s.i(map, "<this>");
        LinkedHashMap linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap(map) : linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public Map r(LinkedHashMap linkedHashMap) {
        AbstractC6492s.i(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    @Override // Zi.AbstractC3717l0, Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return this.f25613c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap g() {
        return new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public int h(LinkedHashMap linkedHashMap) {
        AbstractC6492s.i(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void i(LinkedHashMap linkedHashMap, int i10) {
        AbstractC6492s.i(linkedHashMap, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Iterator j(Map map) {
        AbstractC6492s.i(map, "<this>");
        return map.entrySet().iterator();
    }
}
