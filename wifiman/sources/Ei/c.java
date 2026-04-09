package Ei;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
final class c extends b implements Map.Entry, InterfaceC6944a {

    /* renamed from: c, reason: collision with root package name */
    private final i f4763c;

    /* renamed from: d, reason: collision with root package name */
    private Object f4764d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i parentIterator, Object obj, Object obj2) {
        super(obj, obj2);
        AbstractC6492s.i(parentIterator, "parentIterator");
        this.f4763c = parentIterator;
        this.f4764d = obj2;
    }

    public void b(Object obj) {
        this.f4764d = obj;
    }

    @Override // Ei.b, java.util.Map.Entry
    public Object getValue() {
        return this.f4764d;
    }

    @Override // Ei.b, java.util.Map.Entry
    public Object setValue(Object obj) {
        Object value = getValue();
        b(obj);
        this.f4763c.e(getKey(), obj);
        return value;
    }
}
