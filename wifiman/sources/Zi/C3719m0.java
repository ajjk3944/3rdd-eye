package Zi;

import java.lang.ref.SoftReference;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* renamed from: Zi.m0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3719m0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile SoftReference f25665a = new SoftReference(null);

    public final synchronized Object a(InterfaceC6824a factory) {
        AbstractC6492s.i(factory, "factory");
        Object obj = this.f25665a.get();
        if (obj != null) {
            return obj;
        }
        Object objInvoke = factory.invoke();
        this.f25665a = new SoftReference(objInvoke);
        return objInvoke;
    }
}
