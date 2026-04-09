package Y;

import java.util.Map;
import nh.InterfaceC6944a;

/* loaded from: classes.dex */
final class c extends b implements Map.Entry, InterfaceC6944a {

    /* renamed from: c, reason: collision with root package name */
    private final i f24476c;

    /* renamed from: d, reason: collision with root package name */
    private Object f24477d;

    public c(i iVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.f24476c = iVar;
        this.f24477d = obj2;
    }

    public void b(Object obj) {
        this.f24477d = obj;
    }

    @Override // Y.b, java.util.Map.Entry
    public Object getValue() {
        return this.f24477d;
    }

    @Override // Y.b, java.util.Map.Entry
    public Object setValue(Object obj) {
        Object value = getValue();
        b(obj);
        this.f24476c.e(getKey(), obj);
        return value;
    }
}
