package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class DQ {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f7769a;

    /* renamed from: b, reason: collision with root package name */
    public final C1205gK f7770b;

    /* renamed from: c, reason: collision with root package name */
    public final C2041vw f7771c;

    /* renamed from: d, reason: collision with root package name */
    public final HQ f7772d;

    /* renamed from: e, reason: collision with root package name */
    public final C0494Em f7773e;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f7775g;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public TE f7777j;

    /* renamed from: k, reason: collision with root package name */
    public T0 f7778k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7779l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ HQ f7780m;

    /* renamed from: f, reason: collision with root package name */
    public final A0 f7774f = new A0();

    /* renamed from: h, reason: collision with root package name */
    public boolean f7776h = true;

    public DQ(HQ hq, Uri uri, XD xd, C2041vw c2041vw, HQ hq2, C0494Em c0494Em) {
        this.f7780m = hq;
        this.f7769a = uri;
        this.f7770b = new C1205gK(xd);
        this.f7771c = c2041vw;
        this.f7772d = hq2;
        this.f7773e = c0494Em;
        C1319iQ.f14722a.getAndIncrement();
        this.f7777j = b(0L, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0236 A[EDGE_INSN: B:169:0x0236->B:117:0x0236 BREAK  A[LOOP:1: B:87:0x01e6->B:108:0x0226], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df A[Catch: all -> 0x00c3, TryCatch #2 {all -> 0x00c3, blocks: (B:29:0x0091, B:30:0x0097, B:40:0x00d5, B:42:0x00df, B:44:0x00eb, B:46:0x00f5, B:48:0x0101, B:50:0x010b, B:52:0x0117, B:54:0x0121, B:56:0x0133, B:58:0x013d, B:59:0x0143, B:67:0x017c, B:69:0x0186, B:71:0x0190, B:73:0x0195, B:75:0x01ae, B:77:0x01c3, B:80:0x01ca, B:82:0x01ce, B:83:0x01d3, B:85:0x01d7, B:62:0x014d, B:65:0x016d, B:34:0x00a3, B:39:0x00c7), top: B:144:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5 A[Catch: all -> 0x00c3, TryCatch #2 {all -> 0x00c3, blocks: (B:29:0x0091, B:30:0x0097, B:40:0x00d5, B:42:0x00df, B:44:0x00eb, B:46:0x00f5, B:48:0x0101, B:50:0x010b, B:52:0x0117, B:54:0x0121, B:56:0x0133, B:58:0x013d, B:59:0x0143, B:67:0x017c, B:69:0x0186, B:71:0x0190, B:73:0x0195, B:75:0x01ae, B:77:0x01c3, B:80:0x01ca, B:82:0x01ce, B:83:0x01d3, B:85:0x01d7, B:62:0x014d, B:65:0x016d, B:34:0x00a3, B:39:0x00c7), top: B:144:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b A[Catch: all -> 0x00c3, TryCatch #2 {all -> 0x00c3, blocks: (B:29:0x0091, B:30:0x0097, B:40:0x00d5, B:42:0x00df, B:44:0x00eb, B:46:0x00f5, B:48:0x0101, B:50:0x010b, B:52:0x0117, B:54:0x0121, B:56:0x0133, B:58:0x013d, B:59:0x0143, B:67:0x017c, B:69:0x0186, B:71:0x0190, B:73:0x0195, B:75:0x01ae, B:77:0x01c3, B:80:0x01ca, B:82:0x01ce, B:83:0x01d3, B:85:0x01d7, B:62:0x014d, B:65:0x016d, B:34:0x00a3, B:39:0x00c7), top: B:144:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0121 A[Catch: all -> 0x00c3, TryCatch #2 {all -> 0x00c3, blocks: (B:29:0x0091, B:30:0x0097, B:40:0x00d5, B:42:0x00df, B:44:0x00eb, B:46:0x00f5, B:48:0x0101, B:50:0x010b, B:52:0x0117, B:54:0x0121, B:56:0x0133, B:58:0x013d, B:59:0x0143, B:67:0x017c, B:69:0x0186, B:71:0x0190, B:73:0x0195, B:75:0x01ae, B:77:0x01c3, B:80:0x01ca, B:82:0x01ce, B:83:0x01d3, B:85:0x01d7, B:62:0x014d, B:65:0x016d, B:34:0x00a3, B:39:0x00c7), top: B:144:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #2 {all -> 0x00c3, blocks: (B:29:0x0091, B:30:0x0097, B:40:0x00d5, B:42:0x00df, B:44:0x00eb, B:46:0x00f5, B:48:0x0101, B:50:0x010b, B:52:0x0117, B:54:0x0121, B:56:0x0133, B:58:0x013d, B:59:0x0143, B:67:0x017c, B:69:0x0186, B:71:0x0190, B:73:0x0195, B:75:0x01ae, B:77:0x01c3, B:80:0x01ca, B:82:0x01ce, B:83:0x01d3, B:85:0x01d7, B:62:0x014d, B:65:0x016d, B:34:0x00a3, B:39:0x00c7), top: B:144:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017c A[Catch: all -> 0x00c3, TryCatch #2 {all -> 0x00c3, blocks: (B:29:0x0091, B:30:0x0097, B:40:0x00d5, B:42:0x00df, B:44:0x00eb, B:46:0x00f5, B:48:0x0101, B:50:0x010b, B:52:0x0117, B:54:0x0121, B:56:0x0133, B:58:0x013d, B:59:0x0143, B:67:0x017c, B:69:0x0186, B:71:0x0190, B:73:0x0195, B:75:0x01ae, B:77:0x01c3, B:80:0x01ca, B:82:0x01ce, B:83:0x01d3, B:85:0x01d7, B:62:0x014d, B:65:0x016d, B:34:0x00a3, B:39:0x00c7), top: B:144:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0190 A[Catch: all -> 0x00c3, TryCatch #2 {all -> 0x00c3, blocks: (B:29:0x0091, B:30:0x0097, B:40:0x00d5, B:42:0x00df, B:44:0x00eb, B:46:0x00f5, B:48:0x0101, B:50:0x010b, B:52:0x0117, B:54:0x0121, B:56:0x0133, B:58:0x013d, B:59:0x0143, B:67:0x017c, B:69:0x0186, B:71:0x0190, B:73:0x0195, B:75:0x01ae, B:77:0x01c3, B:80:0x01ca, B:82:0x01ce, B:83:0x01d3, B:85:0x01d7, B:62:0x014d, B:65:0x016d, B:34:0x00a3, B:39:0x00c7), top: B:144:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d7 A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #2 {all -> 0x00c3, blocks: (B:29:0x0091, B:30:0x0097, B:40:0x00d5, B:42:0x00df, B:44:0x00eb, B:46:0x00f5, B:48:0x0101, B:50:0x010b, B:52:0x0117, B:54:0x0121, B:56:0x0133, B:58:0x013d, B:59:0x0143, B:67:0x017c, B:69:0x0186, B:71:0x0190, B:73:0x0195, B:75:0x01ae, B:77:0x01c3, B:80:0x01ca, B:82:0x01ce, B:83:0x01d3, B:85:0x01d7, B:62:0x014d, B:65:0x016d, B:34:0x00a3, B:39:0x00c7), top: B:144:0x0091 }] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.DQ.a():void");
    }

    public final TE b(long j6, String str) {
        Map mapW = HQ.f8921c0;
        if (str != null && !str.startsWith("W/")) {
            J4 j42 = new J4(4);
            j42.o(mapW.entrySet());
            j42.k("If-Range", str);
            mapW = j42.w(false);
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = this.f7769a;
        AbstractC0582Jp.j0(uri, "The uri must be set.");
        return new TE(uri, mapW, j6, -1L, 6);
    }
}
