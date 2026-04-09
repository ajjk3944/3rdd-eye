package wh;

import java.util.Comparator;
import mh.InterfaceC6839p;

/* renamed from: wh.a0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C8349a0 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6839p f65116a;

    public C8349a0(InterfaceC6839p interfaceC6839p) {
        this.f65116a = interfaceC6839p;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return AbstractC8355d0.D(this.f65116a, obj, obj2);
    }
}
