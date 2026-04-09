package kotlin.coroutines;

import kotlin.coroutines.d;
import kotlin.jvm.internal.p;
import l9.l;

/* loaded from: classes4.dex */
public abstract class b implements d.c {

    /* renamed from: a, reason: collision with root package name */
    public final l f21980a;

    /* renamed from: b, reason: collision with root package name */
    public final d.c f21981b;

    public b(d.c baseKey, l safeCast) {
        p.e(baseKey, "baseKey");
        p.e(safeCast, "safeCast");
        this.f21980a = safeCast;
        this.f21981b = baseKey instanceof b ? ((b) baseKey).f21981b : baseKey;
    }

    public final boolean a(d.c key) {
        p.e(key, "key");
        return key == this || this.f21981b == key;
    }

    public final d.b b(d.b element) {
        p.e(element, "element");
        return (d.b) this.f21980a.invoke(element);
    }
}
