package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.e7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4842e7 implements R2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f36445a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ List f36446b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C4833d7 f36447c;

    C4842e7(C4833d7 c4833d7, String str, List list) {
        this.f36445a = str;
        this.f36446b = list;
        this.f36447c = c4833d7;
    }

    @Override // com.google.android.gms.measurement.internal.R2
    public final void a(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.f36447c.O(true, i10, th2, bArr, this.f36445a, this.f36446b);
    }
}
