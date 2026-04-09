package androidx.lifecycle;

import androidx.lifecycle.AbstractC1781n;
import java.util.HashMap;

/* compiled from: CompositeGeneratedAdaptersObserver.jvm.kt */
/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1770c implements InterfaceC1788v {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1776i[] f16133b;

    public C1770c(InterfaceC1776i[] interfaceC1776iArr) {
        this.f16133b = interfaceC1776iArr;
    }

    @Override // androidx.lifecycle.InterfaceC1788v
    public final void c(InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar) {
        new HashMap();
        InterfaceC1776i[] interfaceC1776iArr = this.f16133b;
        for (InterfaceC1776i interfaceC1776i : interfaceC1776iArr) {
            interfaceC1776i.a();
        }
        for (InterfaceC1776i interfaceC1776i2 : interfaceC1776iArr) {
            interfaceC1776i2.a();
        }
    }
}
