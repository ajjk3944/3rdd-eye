package Zi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class O extends AbstractC3717l0 {

    /* renamed from: c, reason: collision with root package name */
    private final Xi.f f25579c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Vi.b kSerializer, Vi.b vSerializer) {
        super(kSerializer, vSerializer, null);
        AbstractC6492s.i(kSerializer, "kSerializer");
        AbstractC6492s.i(vSerializer, "vSerializer");
        this.f25579c = new N(kSerializer.a(), vSerializer.a());
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
    public HashMap q(Map map) {
        AbstractC6492s.i(map, "<this>");
        HashMap map2 = map instanceof HashMap ? (HashMap) map : null;
        return map2 == null ? new HashMap(map) : map2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public Map r(HashMap map) {
        AbstractC6492s.i(map, "<this>");
        return map;
    }

    @Override // Zi.AbstractC3717l0, Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return this.f25579c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public HashMap g() {
        return new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public int h(HashMap map) {
        AbstractC6492s.i(map, "<this>");
        return map.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void i(HashMap map, int i10) {
        AbstractC6492s.i(map, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Iterator j(Map map) {
        AbstractC6492s.i(map, "<this>");
        return map.entrySet().iterator();
    }
}
