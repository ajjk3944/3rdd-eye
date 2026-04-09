package defpackage;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class lf3 {
    public static final String h = new UUID(0, 0).toString();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final wt2 f;
    public final kf3 g;

    public lf3(Context context, String str, String str2, String str3) {
        if (wt2.i == null) {
            wt2.i = new wt2(context, 4);
        }
        this.f = wt2.i;
        this.g = kf3.U(context);
        this.a = str;
        this.b = str.concat("_3p");
        this.c = str2;
        this.d = str2.concat("_3p");
        this.e = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ue a(java.lang.String r17, java.lang.String r18, long r19, boolean r21) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = r0.b
            r3 = 0
            wt2 r4 = r0.f
            if (r1 == 0) goto L3f
            java.util.UUID.fromString(r1)     // Catch: java.lang.IllegalArgumentException -> L42
            java.lang.String r5 = defpackage.lf3.h
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L17
            goto L42
        L17:
            java.lang.Object r5 = r4.h
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.lang.String r5 = r5.getString(r2, r3)
            java.lang.Object r6 = r4.h
            android.content.SharedPreferences r6 = (android.content.SharedPreferences) r6
            java.lang.String r7 = "paid_3p_hash_key"
            java.lang.String r6 = r6.getString(r7, r3)
            if (r5 == 0) goto L3f
            if (r6 == 0) goto L3f
            r7 = r18
            java.lang.String r6 = r0.e(r1, r7, r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L3a
            goto L4a
        L3a:
            ue r1 = r16.b(r17, r18)
            return r1
        L3f:
            r7 = r18
            goto L4a
        L42:
            ue r1 = new ue
            r2 = 8
            r1.<init>(r2)
            return r1
        L4a:
            if (r1 == 0) goto L4e
            r5 = 1
            goto L4f
        L4e:
            r5 = 0
        L4f:
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 < 0) goto Lb6
            java.lang.String r6 = r0.c
            java.lang.String r10 = r0.d
            if (r5 == 0) goto L61
            r11 = r10
            goto L62
        L61:
            r11 = r6
        L62:
            java.lang.Object r12 = r4.h
            android.content.SharedPreferences r12 = (android.content.SharedPreferences) r12
            r13 = -1
            long r11 = r12.getLong(r11, r13)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L71
            goto L8d
        L71:
            int r15 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r15 >= 0) goto L82
            if (r5 == 0) goto L79
            r11 = r10
            goto L7a
        L79:
            r11 = r6
        L7a:
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r4.h(r8, r11)
            goto L8d
        L82:
            long r11 = r11 + r19
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 < 0) goto L8d
            ue r1 = r16.b(r17, r18)
            return r1
        L8d:
            if (r5 == 0) goto L90
            goto L92
        L90:
            java.lang.String r2 = r0.a
        L92:
            java.lang.Object r8 = r4.h
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            java.lang.String r2 = r8.getString(r2, r3)
            if (r2 != 0) goto La3
            if (r21 != 0) goto La3
            ue r1 = r16.b(r17, r18)
            return r1
        La3:
            ue r1 = new ue
            if (r5 == 0) goto La8
            r6 = r10
        La8:
            java.lang.Object r3 = r4.h
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            long r3 = r3.getLong(r6, r13)
            r5 = 8
            r1.<init>(r2, r3, r5)
            return r1
        Lb6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r0.e
            java.lang.String r3 = ": Invalid negative current timestamp. Updating PAID failed"
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf3.a(java.lang.String, java.lang.String, long, boolean):ue");
    }

    public final ue b(String str, String str2) throws IOException {
        if (str == null) {
            return d(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.f.h(string, "paid_3p_hash_key");
        return d(e(str, str2, string), true);
    }

    public final void c(boolean z) throws IOException {
        String str = z ? this.d : this.c;
        wt2 wt2Var = this.f;
        wt2Var.m(str);
        wt2Var.m(z ? this.b : this.a);
    }

    public final ue d(String str, boolean z) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        String str2 = z ? this.d : this.c;
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        wt2 wt2Var = this.f;
        wt2Var.h(lValueOf, str2);
        wt2Var.h(str, z ? this.b : this.a);
        return new ue(str, jCurrentTimeMillis, 8);
    }

    public final String e(String str, String str2, String str3) {
        if (str2 != null) {
            return UUID.nameUUIDFromBytes(ex0.l(new StringBuilder(str2.length() + str.length() + str3.length()), str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.e;
        int length = str4.length();
        String str5 = str2 == null ? "null" : "not null";
        StringBuilder sb = new StringBuilder("not null".length() + ga1.i(str5, length + 88, 13));
        ex0.q(sb, str4, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ", str5, ", hashKey is ");
        sb.append("not null");
        throw new IllegalArgumentException(sb.toString());
    }
}
