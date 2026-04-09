package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class R7 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4507bb f40038a;

    /* renamed from: b, reason: collision with root package name */
    public String f40039b = "";

    public R7(InterfaceC4507bb interfaceC4507bb) {
        this.f40038a = interfaceC4507bb;
    }

    public final void a(String str, boolean z10) {
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null || kotlin.jvm.internal.l.b(this.f40039b, str)) {
                return;
            }
            this.f40039b = str;
            this.f40038a.a(str, z10);
        }
    }
}
