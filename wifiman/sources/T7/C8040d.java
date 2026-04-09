package t7;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import s7.InterfaceC7921h;

/* renamed from: t7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8040d implements InterfaceC7921h {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f61834a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f61835b;

    public C8040d(byte[] hwAddress) {
        AbstractC6492s.i(hwAddress, "hwAddress");
        this.f61834a = hwAddress;
        this.f61835b = true;
    }

    public final String a(String str) {
        return v7.c.f63489a.b(this.f61834a, str);
    }

    public final byte[] b() {
        return this.f61834a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC6492s.d(C8040d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC6492s.g(obj, "null cannot be cast to non-null type com.ubnt.discovery.base.model.device.extra.PrimaryHwAddress");
        return Arrays.equals(this.f61834a, ((C8040d) obj).f61834a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f61834a);
    }

    @Override // s7.InterfaceC7921h
    public boolean isSingle() {
        return this.f61835b;
    }

    public String toString() {
        return "PrimaryHwAddress(" + a(":") + ")";
    }
}
