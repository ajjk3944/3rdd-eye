package kotlinx.coroutines.debug.internal;

import kotlin.jvm.internal.p;
import kotlinx.coroutines.internal.c0;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f22334a = new c0("REHASH");

    /* renamed from: b, reason: collision with root package name */
    public static final d f22335b = new d(null);

    /* renamed from: c, reason: collision with root package name */
    public static final d f22336c = new d(Boolean.TRUE);

    public static final d d(Object obj) {
        return obj == null ? f22335b : p.a(obj, Boolean.TRUE) ? f22336c : new d(obj);
    }

    public static final Void e() {
        throw new UnsupportedOperationException("not implemented");
    }
}
