package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.C4371i1;
import com.google.android.gms.measurement.internal.C4937q3;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.internal.measurement.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4396l1 extends C4371i1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f35374e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f35375f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ Context f35376g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ Bundle f35377h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ C4371i1 f35378i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4396l1(C4371i1 c4371i1, String str, String str2, Context context, Bundle bundle) {
        super(c4371i1);
        this.f35374e = str;
        this.f35375f = str2;
        this.f35376g = context;
        this.f35377h = bundle;
        this.f35378i = c4371i1;
    }

    @Override // com.google.android.gms.internal.measurement.C4371i1.a
    public final void a() {
        String str;
        String str2;
        String str3;
        try {
            if (this.f35378i.F(this.f35374e, this.f35375f)) {
                str3 = this.f35375f;
                str2 = this.f35374e;
                str = this.f35378i.f35250a;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            AbstractC7901p.l(this.f35376g);
            C4371i1 c4371i1 = this.f35378i;
            c4371i1.f35258i = c4371i1.c(this.f35376g, true);
            if (this.f35378i.f35258i == null) {
                Log.w(this.f35378i.f35250a, "Failed to connect to measurement client.");
                return;
            }
            int iA = DynamiteModule.a(this.f35376g, ModuleDescriptor.MODULE_ID);
            ((P0) AbstractC7901p.l(this.f35378i.f35258i)).initialize(x3.b.n0(this.f35376g), new C4326d1(118003L, Math.max(iA, r0), DynamiteModule.c(this.f35376g, ModuleDescriptor.MODULE_ID) < iA, str, str2, str3, this.f35377h, C4937q3.a(this.f35376g)), this.f35259a);
        } catch (Exception e10) {
            this.f35378i.q(e10, true, false);
        }
    }
}
