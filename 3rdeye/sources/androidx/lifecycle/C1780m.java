package androidx.lifecycle;

import androidx.lifecycle.AbstractC1781n;
import c.ActivityC2008f;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1780m implements InterfaceC1788v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16165b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16166c;

    public /* synthetic */ C1780m(Object obj, int i) {
        this.f16165b = i;
        this.f16166c = obj;
    }

    @Override // androidx.lifecycle.InterfaceC1788v
    public final void c(InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar) {
        switch (this.f16165b) {
            case 0:
                AbstractC1781n._get_currentStateFlow_$lambda$0((D9.J) this.f16166c, interfaceC1790x, aVar);
                break;
            default:
                ActivityC2008f._init_$lambda$2((ActivityC2008f) this.f16166c, interfaceC1790x, aVar);
                break;
        }
    }
}
