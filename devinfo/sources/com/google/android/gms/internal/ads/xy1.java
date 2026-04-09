package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xy1 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f18573a;

    /* renamed from: b, reason: collision with root package name */
    public final tl1 f18574b;

    /* renamed from: c, reason: collision with root package name */
    public final av0 f18575c;

    /* renamed from: d, reason: collision with root package name */
    public final bz1 f18576d;

    /* renamed from: e, reason: collision with root package name */
    public final za0 f18577e;
    public volatile boolean g;

    /* renamed from: i, reason: collision with root package name */
    public long f18580i;
    public gb1 j;

    /* renamed from: k, reason: collision with root package name */
    public u2 f18581k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18582l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ bz1 f18583m;

    /* renamed from: f, reason: collision with root package name */
    public final c2 f18578f = new c2();

    /* renamed from: h, reason: collision with root package name */
    public boolean f18579h = true;

    public xy1(bz1 bz1Var, Uri uri, l91 l91Var, av0 av0Var, bz1 bz1Var2, za0 za0Var) {
        this.f18583m = bz1Var;
        this.f18573a = uri;
        this.f18574b = new tl1(l91Var);
        this.f18575c = av0Var;
        this.f18576d = bz1Var2;
        this.f18577e = za0Var;
        cy1.f10262a.getAndIncrement();
        this.j = b(0L, null);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xy1.a():void");
    }

    public final gb1 b(long j, String str) {
        Map mapV = bz1.O;
        if (str != null && !str.startsWith("W/")) {
            oa oaVar = new oa(4);
            oaVar.n(mapV.entrySet());
            oaVar.i("If-Range", str);
            mapV = oaVar.v(false);
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = this.f18573a;
        mq0.e0(uri, "The uri must be set.");
        return new gb1(uri, mapV, j, -1L, 6);
    }
}
