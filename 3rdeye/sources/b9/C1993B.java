package b9;

import java.io.Serializable;
import p9.InterfaceC5480a;

/* compiled from: Lazy.kt */
/* renamed from: b9.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1993B<T> implements InterfaceC2000g<T>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC5480a<? extends T> f18075b;

    /* renamed from: c, reason: collision with root package name */
    public Object f18076c;

    @Override // b9.InterfaceC2000g
    public final T getValue() {
        if (this.f18076c == x.f18108a) {
            InterfaceC5480a<? extends T> interfaceC5480a = this.f18075b;
            kotlin.jvm.internal.l.c(interfaceC5480a);
            this.f18076c = interfaceC5480a.invoke();
            this.f18075b = null;
        }
        return (T) this.f18076c;
    }

    public final String toString() {
        return this.f18076c != x.f18108a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
