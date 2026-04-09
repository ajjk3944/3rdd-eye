package com.google.android.gms.internal.measurement;

import android.content.Context;
import m4.InterfaceC6772k;

/* renamed from: com.google.android.gms.internal.measurement.f3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4346f3 extends E3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f35219a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6772k f35220b;

    C4346f3(Context context, InterfaceC6772k interfaceC6772k) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.f35219a = context;
        this.f35220b = interfaceC6772k;
    }

    @Override // com.google.android.gms.internal.measurement.E3
    final Context a() {
        return this.f35219a;
    }

    @Override // com.google.android.gms.internal.measurement.E3
    final InterfaceC6772k b() {
        return this.f35220b;
    }

    public final boolean equals(Object obj) {
        InterfaceC6772k interfaceC6772k;
        if (obj == this) {
            return true;
        }
        if (obj instanceof E3) {
            E3 e32 = (E3) obj;
            if (this.f35219a.equals(e32.a()) && ((interfaceC6772k = this.f35220b) != null ? interfaceC6772k.equals(e32.b()) : e32.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f35219a.hashCode() ^ 1000003) * 1000003;
        InterfaceC6772k interfaceC6772k = this.f35220b;
        return iHashCode ^ (interfaceC6772k == null ? 0 : interfaceC6772k.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.f35219a) + ", hermeticFileOverrides=" + String.valueOf(this.f35220b) + "}";
    }
}
