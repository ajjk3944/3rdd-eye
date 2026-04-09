package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4484w2;
import java.util.Map;

/* loaded from: classes.dex */
public final class n7 {

    /* renamed from: a, reason: collision with root package name */
    private long f36609a;

    /* renamed from: b, reason: collision with root package name */
    private C4484w2 f36610b;

    /* renamed from: c, reason: collision with root package name */
    private String f36611c;

    /* renamed from: d, reason: collision with root package name */
    private Map f36612d;

    /* renamed from: e, reason: collision with root package name */
    private EnumC4954s5 f36613e;

    /* renamed from: f, reason: collision with root package name */
    private long f36614f;

    /* renamed from: g, reason: collision with root package name */
    private long f36615g;

    /* renamed from: h, reason: collision with root package name */
    private int f36616h;

    public final int a() {
        return this.f36616h;
    }

    public final long b() {
        return this.f36615g;
    }

    public final long c() {
        return this.f36609a;
    }

    public final EnumC4954s5 d() {
        return this.f36613e;
    }

    public final N6 e() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f36612d.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new N6(this.f36609a, this.f36610b.i(), this.f36611c, bundle, this.f36613e.zza(), this.f36614f);
    }

    public final W6 f() {
        return new W6(this.f36611c, this.f36612d, this.f36613e);
    }

    public final C4484w2 g() {
        return this.f36610b;
    }

    public final String h() {
        return this.f36611c;
    }

    private n7(long j10, C4484w2 c4484w2, String str, Map map, EnumC4954s5 enumC4954s5, long j11, long j12, long j13, int i10) {
        this.f36609a = j10;
        this.f36610b = c4484w2;
        this.f36611c = str;
        this.f36612d = map;
        this.f36613e = enumC4954s5;
        this.f36614f = j12;
        this.f36615g = j13;
        this.f36616h = i10;
    }
}
