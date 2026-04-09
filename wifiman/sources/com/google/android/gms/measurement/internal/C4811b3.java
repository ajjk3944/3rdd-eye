package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.b3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4811b3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f36343a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36344b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36345c;

    /* renamed from: d, reason: collision with root package name */
    private final long f36346d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ X2 f36347e;

    private final long c() {
        return this.f36347e.G().getLong(this.f36343a, 0L);
    }

    private final void d() {
        this.f36347e.j();
        long jA = this.f36347e.zzb().a();
        SharedPreferences.Editor editorEdit = this.f36347e.G().edit();
        editorEdit.remove(this.f36344b);
        editorEdit.remove(this.f36345c);
        editorEdit.putLong(this.f36343a, jA);
        editorEdit.apply();
    }

    public final Pair a() {
        long jAbs;
        this.f36347e.j();
        this.f36347e.j();
        long jC = c();
        if (jC == 0) {
            d();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jC - this.f36347e.zzb().a());
        }
        long j10 = this.f36346d;
        if (jAbs < j10) {
            return null;
        }
        if (jAbs > (j10 << 1)) {
            d();
            return null;
        }
        String string = this.f36347e.G().getString(this.f36345c, null);
        long j11 = this.f36347e.G().getLong(this.f36344b, 0L);
        d();
        return (string == null || j11 <= 0) ? X2.f36261B : new Pair(string, Long.valueOf(j11));
    }

    public final void b(String str, long j10) {
        this.f36347e.j();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j11 = this.f36347e.G().getLong(this.f36344b, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor editorEdit = this.f36347e.G().edit();
            editorEdit.putString(this.f36345c, str);
            editorEdit.putLong(this.f36344b, 1L);
            editorEdit.apply();
            return;
        }
        long j12 = j11 + 1;
        boolean z10 = (this.f36347e.g().Q0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j12;
        SharedPreferences.Editor editorEdit2 = this.f36347e.G().edit();
        if (z10) {
            editorEdit2.putString(this.f36345c, str);
        }
        editorEdit2.putLong(this.f36344b, j12);
        editorEdit2.apply();
    }

    private C4811b3(X2 x22, String str, long j10) {
        this.f36347e = x22;
        AbstractC7901p.f(str);
        AbstractC7901p.a(j10 > 0);
        this.f36343a = str + ":start";
        this.f36344b = str + ":count";
        this.f36345c = str + ":value";
        this.f36346d = j10;
    }
}
