package Yg;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public final class K implements m, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC6824a f24998a;

    /* renamed from: b, reason: collision with root package name */
    private Object f24999b;

    public K(InterfaceC6824a initializer) {
        AbstractC6492s.i(initializer, "initializer");
        this.f24998a = initializer;
        this.f24999b = G.f24991a;
    }

    @Override // Yg.m
    public Object getValue() {
        if (this.f24999b == G.f24991a) {
            InterfaceC6824a interfaceC6824a = this.f24998a;
            AbstractC6492s.f(interfaceC6824a);
            this.f24999b = interfaceC6824a.invoke();
            this.f24998a = null;
        }
        return this.f24999b;
    }

    @Override // Yg.m
    public boolean m() {
        return this.f24999b != G.f24991a;
    }

    public String toString() {
        return m() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
