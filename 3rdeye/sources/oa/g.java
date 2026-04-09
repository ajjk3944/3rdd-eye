package oa;

import java.util.Locale;

/* compiled from: DateTimePrintContext.java */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final qa.e f44931a;

    /* renamed from: b, reason: collision with root package name */
    public final Locale f44932b;

    /* renamed from: c, reason: collision with root package name */
    public final i f44933c;

    /* renamed from: d, reason: collision with root package name */
    public int f44934d;

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(qa.e r10, oa.a r11) {
        /*
            r9 = this;
            r9.<init>()
            na.l r0 = r11.f44897e
            if (r0 != 0) goto L9
            goto L85
        L9:
            qa.i$b r1 = qa.i.f45476b
            java.lang.Object r1 = r10.query(r1)
            na.g r1 = (na.g) r1
            qa.i$a r2 = qa.i.f45475a
            java.lang.Object r2 = r10.query(r2)
            ma.p r2 = (ma.p) r2
            r3 = 0
            if (r1 != 0) goto L22
            if (r0 != 0) goto L20
            r4 = 1
            goto L29
        L20:
            r4 = r3
            goto L29
        L22:
            if (r0 != 0) goto L25
            goto L20
        L25:
            boolean r4 = r1.equals(r0)
        L29:
            r5 = 0
            if (r4 == 0) goto L2d
            r0 = r5
        L2d:
            if (r0 != 0) goto L30
            goto L85
        L30:
            if (r0 == 0) goto L34
            r4 = r0
            goto L35
        L34:
            r4 = r1
        L35:
            if (r0 == 0) goto L7f
            qa.a r6 = qa.a.EPOCH_DAY
            boolean r6 = r10.isSupported(r6)
            if (r6 == 0) goto L44
            na.b r5 = r4.a(r10)
            goto L7f
        L44:
            na.l r6 = na.l.f44466d
            if (r0 != r6) goto L4a
            if (r1 == 0) goto L7f
        L4a:
            qa.a[] r1 = qa.a.values()
            int r6 = r1.length
        L4f:
            if (r3 >= r6) goto L7f
            r7 = r1[r3]
            boolean r8 = r7.isDateBased()
            if (r8 == 0) goto L7c
            boolean r7 = r10.isSupported(r7)
            if (r7 != 0) goto L60
            goto L7c
        L60:
            ma.a r11 = new ma.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid override chronology for temporal: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r11.<init>(r10)
            throw r11
        L7c:
            int r3 = r3 + 1
            goto L4f
        L7f:
            oa.f r0 = new oa.f
            r0.<init>(r5, r10, r4, r2)
            r10 = r0
        L85:
            r9.f44931a = r10
            java.util.Locale r10 = r11.f44894b
            r9.f44932b = r10
            oa.i r10 = r11.f44895c
            r9.f44933c = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.g.<init>(qa.e, oa.a):void");
    }

    public final Long a(qa.h hVar) {
        try {
            return Long.valueOf(this.f44931a.getLong(hVar));
        } catch (ma.a e4) {
            if (this.f44934d > 0) {
                return null;
            }
            throw e4;
        }
    }

    public final String toString() {
        return this.f44931a.toString();
    }
}
