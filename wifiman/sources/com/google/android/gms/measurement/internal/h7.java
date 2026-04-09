package com.google.android.gms.measurement.internal;

import java.util.Map;

/* loaded from: classes.dex */
final class h7 implements R2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f36524a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ n7 f36525b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C4833d7 f36526c;

    h7(C4833d7 c4833d7, String str, n7 n7Var) {
        this.f36524a = str;
        this.f36525b = n7Var;
        this.f36526c = c4833d7;
    }

    @Override // com.google.android.gms.measurement.internal.R2
    public final void a(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.f36526c.C(this.f36524a, i10, th2, bArr, this.f36525b);
    }
}
