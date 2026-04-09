package b1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    private final Object f32780a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f32781b = new LinkedHashMap();

    public x(Object obj) {
        this.f32780a = obj;
    }

    public Object a() {
        return this.f32780a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && AbstractC6492s.d(a(), ((x) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }
}
