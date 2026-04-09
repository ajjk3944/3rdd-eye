package ui;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f63182a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f63183b = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(z zVar, String it) {
        AbstractC6492s.i(it, "it");
        return zVar.f63183b.getAndIncrement();
    }

    public abstract int b(ConcurrentHashMap concurrentHashMap, String str, InterfaceC6835l interfaceC6835l);

    public final n c(th.d kClass) {
        AbstractC6492s.i(kClass, "kClass");
        return new n(e(kClass));
    }

    public final int d(String keyQualifiedName) {
        AbstractC6492s.i(keyQualifiedName, "keyQualifiedName");
        return b(this.f63182a, keyQualifiedName, new y(this));
    }

    public final int e(th.d kClass) {
        AbstractC6492s.i(kClass, "kClass");
        String strL = kClass.l();
        AbstractC6492s.f(strL);
        return d(strL);
    }

    protected final Collection g() {
        Collection collectionValues = this.f63182a.values();
        AbstractC6492s.h(collectionValues, "<get-values>(...)");
        return collectionValues;
    }
}
