package dh;

import dh.InterfaceC5384i;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: dh.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5377b implements InterfaceC5384i.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f46082a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5384i.c f46083b;

    public AbstractC5377b(InterfaceC5384i.c baseKey, InterfaceC6835l safeCast) {
        AbstractC6492s.i(baseKey, "baseKey");
        AbstractC6492s.i(safeCast, "safeCast");
        this.f46082a = safeCast;
        this.f46083b = baseKey instanceof AbstractC5377b ? ((AbstractC5377b) baseKey).f46083b : baseKey;
    }

    public final boolean a(InterfaceC5384i.c key) {
        AbstractC6492s.i(key, "key");
        return key == this || this.f46083b == key;
    }

    public final InterfaceC5384i.b b(InterfaceC5384i.b element) {
        AbstractC6492s.i(element, "element");
        return (InterfaceC5384i.b) this.f46082a.invoke(element);
    }
}
