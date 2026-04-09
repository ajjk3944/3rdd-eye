package kotlin.jvm.internal;

import java.util.Collections;
import java.util.List;
import w9.InterfaceC5748c;

/* compiled from: Reflection.java */
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final y f43661a;

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC5748c[] f43662b;

    static {
        y yVar = null;
        try {
            yVar = (y) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (yVar == null) {
            yVar = new y();
        }
        f43661a = yVar;
        f43662b = new InterfaceC5748c[0];
    }

    public static e a(Class cls) {
        f43661a.getClass();
        return new e(cls);
    }

    public static A b(Class cls) {
        e eVarA = a(cls);
        List list = Collections.EMPTY_LIST;
        f43661a.getClass();
        return new A(eVarA, list, false);
    }
}
