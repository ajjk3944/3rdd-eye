package com.google.android.gms.internal.measurement;

import java.io.File;

/* renamed from: com.google.android.gms.internal.measurement.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4419o0 implements InterfaceC4403m0 {
    C4419o0() {
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4403m0
    public final /* synthetic */ String a(String str, AbstractC4442r0 abstractC4442r0) {
        return d(str, abstractC4442r0, EnumC4427p0.RAW_FILE_IO_TYPE);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4403m0
    public final /* synthetic */ String b(File file, String str, AbstractC4442r0 abstractC4442r0) {
        return a(new File(file, str).getPath(), abstractC4442r0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4403m0
    public final /* synthetic */ String c(File file, String str) {
        return b(file, str, AbstractC4442r0.f35442a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4403m0
    public final /* synthetic */ String d(String str, AbstractC4442r0 abstractC4442r0, EnumC4427p0 enumC4427p0) {
        return AbstractC4395l0.a(this, str, abstractC4442r0, enumC4427p0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4403m0
    public final String e(String str, AbstractC4442r0 abstractC4442r0, EnumC4427p0 enumC4427p0) {
        return str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4403m0
    public final /* synthetic */ String zza(String str) {
        return a(str, AbstractC4442r0.f35442a);
    }
}
