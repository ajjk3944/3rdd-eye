package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import o3.C7062a;

/* renamed from: com.google.android.gms.measurement.internal.o6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4924o6 extends U6 {

    /* renamed from: d, reason: collision with root package name */
    private final Map f36635d;

    /* renamed from: e, reason: collision with root package name */
    public final Y2 f36636e;

    /* renamed from: f, reason: collision with root package name */
    public final Y2 f36637f;

    /* renamed from: g, reason: collision with root package name */
    public final Y2 f36638g;

    /* renamed from: h, reason: collision with root package name */
    public final Y2 f36639h;

    /* renamed from: i, reason: collision with root package name */
    public final Y2 f36640i;

    /* renamed from: j, reason: collision with root package name */
    public final Y2 f36641j;

    C4924o6(C4833d7 c4833d7) {
        super(c4833d7);
        this.f36635d = new HashMap();
        X2 x2E = e();
        Objects.requireNonNull(x2E);
        this.f36636e = new Y2(x2E, "last_delete_stale", 0L);
        X2 x2E2 = e();
        Objects.requireNonNull(x2E2);
        this.f36637f = new Y2(x2E2, "last_delete_stale_batch", 0L);
        X2 x2E3 = e();
        Objects.requireNonNull(x2E3);
        this.f36638g = new Y2(x2E3, "backoff", 0L);
        X2 x2E4 = e();
        Objects.requireNonNull(x2E4);
        this.f36639h = new Y2(x2E4, "last_upload", 0L);
        X2 x2E5 = e();
        Objects.requireNonNull(x2E5);
        this.f36640i = new Y2(x2E5, "last_upload_attempt", 0L);
        X2 x2E6 = e();
        Objects.requireNonNull(x2E6);
        this.f36641j = new Y2(x2E6, "midnight_offset", 0L);
    }

    private final Pair u(String str) {
        C4908m6 c4908m6;
        C7062a.C1997a c1997aA;
        j();
        long jC = zzb().c();
        C4908m6 c4908m62 = (C4908m6) this.f36635d.get(str);
        if (c4908m62 != null && jC < c4908m62.f36599c) {
            return new Pair(c4908m62.f36597a, Boolean.valueOf(c4908m62.f36598b));
        }
        C7062a.b(true);
        long jA = a().A(str) + jC;
        try {
            try {
                c1997aA = C7062a.a(zza());
            } catch (PackageManager.NameNotFoundException unused) {
                if (c4908m62 != null && jC < c4908m62.f36599c + a().y(str, N.f36067c)) {
                    return new Pair(c4908m62.f36597a, Boolean.valueOf(c4908m62.f36598b));
                }
                c1997aA = null;
            }
        } catch (Exception e10) {
            zzj().B().b("Unable to get advertising id", e10);
            c4908m6 = new C4908m6("", false, jA);
        }
        if (c1997aA == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String strA = c1997aA.a();
        c4908m6 = strA != null ? new C4908m6(strA, c1997aA.b(), jA) : new C4908m6("", c1997aA.b(), jA);
        this.f36635d.put(str, c4908m6);
        C7062a.b(false);
        return new Pair(c4908m6.f36597a, Boolean.valueOf(c4908m6.f36598b));
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

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ s7 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ C7 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ C4933q m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ C4873i3 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ C4924o6 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ X6 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.U6
    protected final boolean t() {
        return false;
    }

    final Pair v(String str, C4839e4 c4839e4) {
        return c4839e4.w() ? u(str) : new Pair("", Boolean.FALSE);
    }

    final String w(String str, boolean z10) throws NoSuchAlgorithmException {
        j();
        String str2 = z10 ? (String) u(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestP0 = x7.P0();
        if (messageDigestP0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestP0.digest(str2.getBytes())));
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
