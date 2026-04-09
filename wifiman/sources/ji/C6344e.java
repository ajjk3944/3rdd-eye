package ji;

import Bh.InterfaceC2495e;
import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7346d0;

/* renamed from: ji.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6344e implements InterfaceC6346g, InterfaceC6347h {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2495e f50877a;

    /* renamed from: b, reason: collision with root package name */
    private final C6344e f50878b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2495e f50879c;

    public C6344e(InterfaceC2495e classDescriptor, C6344e c6344e) {
        AbstractC6492s.i(classDescriptor, "classDescriptor");
        this.f50877a = classDescriptor;
        this.f50878b = c6344e == null ? this : c6344e;
        this.f50879c = classDescriptor;
    }

    @Override // ji.InterfaceC6346g
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC7346d0 getType() {
        AbstractC7346d0 abstractC7346d0U = this.f50877a.u();
        AbstractC6492s.h(abstractC7346d0U, "getDefaultType(...)");
        return abstractC7346d0U;
    }

    public boolean equals(Object obj) {
        InterfaceC2495e interfaceC2495e = this.f50877a;
        C6344e c6344e = obj instanceof C6344e ? (C6344e) obj : null;
        return AbstractC6492s.d(interfaceC2495e, c6344e != null ? c6344e.f50877a : null);
    }

    public int hashCode() {
        return this.f50877a.hashCode();
    }

    @Override // ji.InterfaceC6347h
    public final InterfaceC2495e t() {
        return this.f50877a;
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }
}
