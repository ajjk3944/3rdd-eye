package dh;

import dh.InterfaceC5384i;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* renamed from: dh.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5376a implements InterfaceC5384i.b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5384i.c f46081a;

    public AbstractC5376a(InterfaceC5384i.c key) {
        AbstractC6492s.i(key, "key");
        this.f46081a = key;
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public Object fold(Object obj, InterfaceC6839p interfaceC6839p) {
        return InterfaceC5384i.b.a.a(this, obj, interfaceC6839p);
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public InterfaceC5384i.b get(InterfaceC5384i.c cVar) {
        return InterfaceC5384i.b.a.b(this, cVar);
    }

    @Override // dh.InterfaceC5384i.b
    public InterfaceC5384i.c getKey() {
        return this.f46081a;
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public InterfaceC5384i minusKey(InterfaceC5384i.c cVar) {
        return InterfaceC5384i.b.a.c(this, cVar);
    }

    @Override // dh.InterfaceC5384i
    public InterfaceC5384i plus(InterfaceC5384i interfaceC5384i) {
        return InterfaceC5384i.b.a.d(this, interfaceC5384i);
    }
}
