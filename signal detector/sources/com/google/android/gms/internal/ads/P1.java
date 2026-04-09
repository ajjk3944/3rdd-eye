package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class P1 implements B3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10309a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10310b;

    public P1(String str, String str2) {
        this.f10309a = AbstractC0582Jp.u(str);
        this.f10310b = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    @Override // com.google.android.gms.internal.ads.B3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.internal.ads.O2 r3) {
        /*
            r2 = this;
            java.lang.String r0 = r2.f10309a
            int r1 = r0.hashCode()
            switch(r1) {
                case -1935137620: goto L67;
                case -215998278: goto L5d;
                case -113312716: goto L53;
                case 62359119: goto L49;
                case 67703139: goto L3e;
                case 79833656: goto L34;
                case 428414940: goto L29;
                case 993300766: goto L1f;
                case 1746739798: goto L15;
                case 1939198791: goto Lb;
                default: goto L9;
            }
        L9:
            goto L71
        Lb:
            java.lang.String r1 = "ARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 1
            goto L72
        L15:
            java.lang.String r1 = "ALBUMARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 3
            goto L72
        L1f:
            java.lang.String r1 = "DISCNUMBER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 6
            goto L72
        L29:
            java.lang.String r1 = "DESCRIPTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 9
            goto L72
        L34:
            java.lang.String r1 = "TITLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 0
            goto L72
        L3e:
            java.lang.String r1 = "GENRE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 8
            goto L72
        L49:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 2
            goto L72
        L53:
            java.lang.String r1 = "TRACKNUMBER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 4
            goto L72
        L5d:
            java.lang.String r1 = "TOTALDISCS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 7
            goto L72
        L67:
            java.lang.String r1 = "TOTALTRACKS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 5
            goto L72
        L71:
            r0 = -1
        L72:
            java.lang.String r1 = r2.f10310b
            switch(r0) {
                case 0: goto Lab;
                case 1: goto La8;
                case 2: goto La5;
                case 3: goto La2;
                case 4: goto L99;
                case 5: goto L90;
                case 6: goto L87;
                case 7: goto L7e;
                case 8: goto L7b;
                case 9: goto L78;
                default: goto L77;
            }
        L77:
            goto La1
        L78:
            r3.f10130e = r1
            return
        L7b:
            r3.f10147w = r1
            return
        L7e:
            java.lang.Integer r0 = com.google.android.gms.internal.ads.Cr.O(r1)
            if (r0 == 0) goto La1
            r3.f10146v = r0
            return
        L87:
            java.lang.Integer r0 = com.google.android.gms.internal.ads.Cr.O(r1)
            if (r0 == 0) goto La1
            r3.f10145u = r0
            return
        L90:
            java.lang.Integer r0 = com.google.android.gms.internal.ads.Cr.O(r1)
            if (r0 == 0) goto La1
            r3.i = r0
            return
        L99:
            java.lang.Integer r0 = com.google.android.gms.internal.ads.Cr.O(r1)
            if (r0 == 0) goto La1
            r3.f10133h = r0
        La1:
            return
        La2:
            r3.f10129d = r1
            return
        La5:
            r3.f10128c = r1
            return
        La8:
            r3.f10127b = r1
            return
        Lab:
            r3.f10126a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.P1.a(com.google.android.gms.internal.ads.O2):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && P1.class == obj.getClass()) {
            P1 p12 = (P1) obj;
            if (this.f10309a.equals(p12.f10309a) && this.f10310b.equals(p12.f10310b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f10310b.hashCode() + ((this.f10309a.hashCode() + 527) * 31);
    }

    public final String toString() {
        String str = this.f10309a;
        int length = String.valueOf(str).length();
        String str2 = this.f10310b;
        return AbstractC1135f5.o(new StringBuilder(length + 5 + String.valueOf(str2).length()), "VC: ", str, "=", str2);
    }
}
