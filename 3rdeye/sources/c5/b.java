package C5;

import com.google.gson.internal.d;
import java.lang.reflect.AccessibleObject;

/* compiled from: ReflectionAccessor.java */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f922a;

    static {
        f922a = d.f23483a < 9 ? new a() : new c();
    }

    public abstract void a(AccessibleObject accessibleObject);
}
