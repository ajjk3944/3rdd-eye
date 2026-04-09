package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class Ox {

    /* renamed from: h, reason: collision with root package name */
    public static final String f10277h = new UUID(0, 0).toString();

    /* renamed from: a, reason: collision with root package name */
    public final String f10278a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10279b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10280c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10281d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10282e;

    /* renamed from: f, reason: collision with root package name */
    public final Vu f10283f;

    /* renamed from: g, reason: collision with root package name */
    public final Nx f10284g;

    public Ox(Context context, String str, String str2, String str3) {
        if (Vu.f12104c == null) {
            Vu.f12104c = new Vu(context, 2);
        }
        this.f10283f = Vu.f12104c;
        this.f10284g = Nx.f(context);
        this.f10278a = str;
        this.f10279b = str.concat("_3p");
        this.f10280c = str2;
        this.f10281d = str2.concat("_3p");
        this.f10282e = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final U1.b a(java.lang.String r17, java.lang.String r18, long r19, boolean r21) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = r0.f10279b
            r3 = 0
            com.google.android.gms.internal.ads.Vu r4 = r0.f10283f
            if (r1 == 0) goto L3f
            java.util.UUID.fromString(r1)     // Catch: java.lang.IllegalArgumentException -> L42
            java.lang.String r5 = com.google.android.gms.internal.ads.Ox.f10277h
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L17
            goto L42
        L17:
            java.lang.Object r5 = r4.f12106b
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.lang.String r5 = r5.getString(r2, r3)
            java.lang.Object r6 = r4.f12106b
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
            U1.b r1 = r16.b(r17, r18)
            return r1
        L3f:
            r7 = r18
            goto L49
        L42:
            U1.b r1 = new U1.b
            r2 = 7
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
            java.lang.String r6 = r0.f10280c
            java.lang.String r10 = r0.f10281d
            if (r5 == 0) goto L60
            r11 = r10
            goto L61
        L60:
            r11 = r6
        L61:
            java.lang.Object r12 = r4.f12106b
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
            r4.C(r8, r11)
            goto L8c
        L81:
            long r11 = r11 + r19
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 < 0) goto L8c
            U1.b r1 = r16.b(r17, r18)
            return r1
        L8c:
            if (r5 == 0) goto L8f
            goto L91
        L8f:
            java.lang.String r2 = r0.f10278a
        L91:
            java.lang.Object r8 = r4.f12106b
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            java.lang.String r2 = r8.getString(r2, r3)
            if (r2 != 0) goto La2
            if (r21 != 0) goto La2
            U1.b r1 = r16.b(r17, r18)
            return r1
        La2:
            U1.b r1 = new U1.b
            if (r5 == 0) goto La7
            r6 = r10
        La7:
            java.lang.Object r3 = r4.f12106b
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            long r3 = r3.getLong(r6, r13)
            r5 = 7
            r1.<init>(r2, r3, r5)
            return r1
        Lb4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r0.f10282e
            java.lang.String r3 = ": Invalid negative current timestamp. Updating PAID failed"
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Ox.a(java.lang.String, java.lang.String, long, boolean):U1.b");
    }

    public final U1.b b(String str, String str2) throws IOException {
        if (str == null) {
            return d(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.f10283f.C(string, "paid_3p_hash_key");
        return d(e(str, str2, string), true);
    }

    public final void c(boolean z6) throws IOException {
        String str = z6 ? this.f10281d : this.f10280c;
        Vu vu = this.f10283f;
        vu.I(str);
        vu.I(z6 ? this.f10279b : this.f10278a);
    }

    public final U1.b d(String str, boolean z6) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.f10282e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        String str2 = z6 ? this.f10281d : this.f10280c;
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        Vu vu = this.f10283f;
        vu.C(lValueOf, str2);
        vu.C(str, z6 ? this.f10279b : this.f10278a);
        return new U1.b(str, jCurrentTimeMillis, 7);
    }

    public final String e(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(AbstractC1135f5.n(new StringBuilder(str2.length() + str.length() + str3.length()), str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = str2 == null ? "null" : "not null";
        int length = str4.length();
        String str5 = str3 == null ? "null" : "not null";
        StringBuilder sb = new StringBuilder(str5.length() + length + 120);
        A.f.w(sb, this.f10282e, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ", str4, ", hashKey is ");
        sb.append(str5);
        throw new IllegalArgumentException(sb.toString());
    }
}
