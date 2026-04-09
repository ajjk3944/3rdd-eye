package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.gf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4640gf implements InterfaceC4741kd {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40935a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40936b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40937c;

    public C4640gf(Context context, String str, String str2) {
        this.f40935a = context;
        this.f40936b = str;
        this.f40937c = str2;
    }

    public final C4640gf a(Context context, String str, String str2) {
        return new C4640gf(context, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4640gf)) {
            return false;
        }
        C4640gf c4640gf = (C4640gf) obj;
        return kotlin.jvm.internal.l.b(this.f40935a, c4640gf.f40935a) && kotlin.jvm.internal.l.b(this.f40936b, c4640gf.f40936b) && kotlin.jvm.internal.l.b(this.f40937c, c4640gf.f40937c);
    }

    public final int hashCode() {
        return this.f40937c.hashCode() + B4.g.n(this.f40935a.hashCode() * 31, 31, this.f40936b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreferencesBasedModuleEntryPoint(context=");
        sb.append(this.f40935a);
        sb.append(", prefName=");
        sb.append(this.f40936b);
        sb.append(", prefValueName=");
        return N7.B8.j(sb, this.f40937c, ')');
    }

    public static C4640gf a(C4640gf c4640gf, Context context, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            context = c4640gf.f40935a;
        }
        if ((i & 2) != 0) {
            str = c4640gf.f40936b;
        }
        if ((i & 4) != 0) {
            str2 = c4640gf.f40937c;
        }
        c4640gf.getClass();
        return new C4640gf(context, str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4741kd
    public final String a() {
        String string = this.f40935a.getSharedPreferences(this.f40936b, 0).getString(this.f40937c, "");
        return string == null ? "" : string;
    }
}
