package u6;

import java.util.HashMap;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: u6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8136a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f62702a = new HashMap(8);

    @Override // u6.c
    public void e(Object key, Object value) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(value, "value");
        this.f62702a.put(key, value);
    }

    @Override // u6.c
    public boolean p(Object key) {
        AbstractC6492s.i(key, "key");
        return this.f62702a.containsKey(key);
    }

    @Override // u6.c
    public Object q(Object key) {
        AbstractC6492s.i(key, "key");
        return this.f62702a.get(key);
    }

    public void r() {
        this.f62702a.clear();
    }
}
