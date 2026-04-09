package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class jx0 {

    /* renamed from: h, reason: collision with root package name */
    public static final String f12861h = new UUID(0, 0).toString();

    /* renamed from: a, reason: collision with root package name */
    public final String f12862a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12863b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12864c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12865d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12866e;

    /* renamed from: f, reason: collision with root package name */
    public final ce1 f12867f;
    public final ix0 g;

    public jx0(Context context, String str, String str2, String str3) {
        if (ce1.f10092d == null) {
            ce1.f10092d = new ce1(context, 20);
        }
        this.f12867f = ce1.f10092d;
        this.g = ix0.d(context);
        this.f12862a = str;
        this.f12863b = str.concat("_3p");
        this.f12864c = str2;
        this.f12865d = str2.concat("_3p");
        this.f12866e = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.recyclerview.widget.d a(java.lang.String r17, java.lang.String r18, long r19, boolean r21) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = r0.f12863b
            r3 = 0
            com.google.android.gms.internal.ads.ce1 r4 = r0.f12867f
            if (r1 == 0) goto L3f
            java.util.UUID.fromString(r1)     // Catch: java.lang.IllegalArgumentException -> L42
            java.lang.String r5 = com.google.android.gms.internal.ads.jx0.f12861h
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L17
            goto L42
        L17:
            java.lang.Object r5 = r4.f10095c
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.lang.String r5 = r5.getString(r2, r3)
            java.lang.Object r6 = r4.f10095c
            android.content.SharedPreferences r6 = (android.content.SharedPreferences) r6
            java.lang.String r7 = "paid_3p_hash_key"
            java.lang.String r6 = r6.getString(r7, r3)
            if (r5 == 0) goto L3f
            if (r6 == 0) goto L3f
            r7 = r18
            java.lang.String r6 = r0.e(r1, r7, r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L3a
            goto L49
        L3a:
            androidx.recyclerview.widget.d r1 = r16.b(r17, r18)
            return r1
        L3f:
            r7 = r18
            goto L49
        L42:
            androidx.recyclerview.widget.d r1 = new androidx.recyclerview.widget.d
            r2 = 6
            r1.<init>(r2)
            return r1
        L49:
            if (r1 == 0) goto L4d
            r5 = 1
            goto L4e
        L4d:
            r5 = 0
        L4e:
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 < 0) goto Lb4
            java.lang.String r6 = r0.f12864c
            java.lang.String r10 = r0.f12865d
            if (r5 == 0) goto L60
            r11 = r10
            goto L61
        L60:
            r11 = r6
        L61:
            java.lang.Object r12 = r4.f10095c
            android.content.SharedPreferences r12 = (android.content.SharedPreferences) r12
            r13 = -1
            long r11 = r12.getLong(r11, r13)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L70
            goto L8c
        L70:
            int r15 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r15 >= 0) goto L81
            if (r5 == 0) goto L78
            r11 = r10
            goto L79
        L78:
            r11 = r6
        L79:
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r4.k(r8, r11)
            goto L8c
        L81:
            long r11 = r11 + r19
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 < 0) goto L8c
            androidx.recyclerview.widget.d r1 = r16.b(r17, r18)
            return r1
        L8c:
            if (r5 == 0) goto L8f
            goto L91
        L8f:
            java.lang.String r2 = r0.f12862a
        L91:
            java.lang.Object r8 = r4.f10095c
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            java.lang.String r2 = r8.getString(r2, r3)
            if (r2 != 0) goto La2
            if (r21 != 0) goto La2
            androidx.recyclerview.widget.d r1 = r16.b(r17, r18)
            return r1
        La2:
            androidx.recyclerview.widget.d r1 = new androidx.recyclerview.widget.d
            if (r5 == 0) goto La7
            r6 = r10
        La7:
            java.lang.Object r3 = r4.f10095c
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            long r3 = r3.getLong(r6, r13)
            r5 = 6
            r1.<init>(r2, r3, r5)
            return r1
        Lb4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r0.f12866e
            java.lang.String r3 = ": Invalid negative current timestamp. Updating PAID failed"
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jx0.a(java.lang.String, java.lang.String, long, boolean):androidx.recyclerview.widget.d");
    }

    public final androidx.recyclerview.widget.d b(String str, String str2) throws IOException {
        if (str == null) {
            return d(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.f12867f.k(string, "paid_3p_hash_key");
        return d(e(str, str2, string), true);
    }

    public final void c(boolean z3) throws IOException {
        String str = z3 ? this.f12865d : this.f12864c;
        ce1 ce1Var = this.f12867f;
        ce1Var.m(str);
        ce1Var.m(z3 ? this.f12863b : this.f12862a);
    }

    public final androidx.recyclerview.widget.d d(String str, boolean z3) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.f12866e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        String str2 = z3 ? this.f12865d : this.f12864c;
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        ce1 ce1Var = this.f12867f;
        ce1Var.k(lValueOf, str2);
        ce1Var.k(str, z3 ? this.f12863b : this.f12862a);
        return new androidx.recyclerview.widget.d(str, jCurrentTimeMillis, 6);
    }

    public final String e(String str, String str2, String str3) {
        if (str2 != null) {
            return UUID.nameUUIDFromBytes(r5.c.m(new StringBuilder(str2.length() + str.length() + str3.length()), str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = str2 == null ? "null" : "not null";
        StringBuilder sb2 = new StringBuilder("not null".length() + str4.length() + 120);
        je.u.B(sb2, this.f12866e, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ", str4, ", hashKey is ");
        sb2.append("not null");
        throw new IllegalArgumentException(sb2.toString());
    }
}
