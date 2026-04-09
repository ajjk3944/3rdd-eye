package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: com.google.android.gms.measurement.internal.n5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4915n5 extends AbstractC4830d4 {
    C4915n5(C4976v3 c4976v3) {
        super(c4976v3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] r(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4893l a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ F b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ D2 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ X2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4915n5 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ x7 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4830d4
    protected final boolean p() {
        return false;
    }

    public final boolean s() {
        NetworkInfo activeNetworkInfo;
        l();
        ConnectivityManager connectivityManager = (ConnectivityManager) zza().getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        } else {
            activeNetworkInfo = null;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.d zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ C4834e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ L2 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ C4952s3 zzl() {
        return super.zzl();
    }
}
