package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.hw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1288hw implements ZA, InterfaceC1223gl, BD {

    /* renamed from: c, reason: collision with root package name */
    public static final C1288hw f14618c = new C1288hw();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14619a;

    /* renamed from: b, reason: collision with root package name */
    public Context f14620b;

    public /* synthetic */ C1288hw() {
        this.f14619a = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00bd A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #6 {all -> 0x005c, blocks: (B:22:0x004f, B:36:0x006c, B:39:0x0078, B:40:0x0082, B:42:0x0088, B:44:0x0098, B:46:0x00af, B:50:0x00bd, B:52:0x00c1, B:54:0x00d1, B:56:0x00e8, B:59:0x00f4, B:71:0x014b, B:78:0x015e, B:80:0x016c, B:82:0x017a, B:83:0x0181, B:85:0x018f, B:87:0x0193, B:88:0x0196, B:90:0x019a, B:92:0x01ba, B:94:0x01c6, B:95:0x01c9, B:96:0x01ca, B:62:0x0105, B:64:0x0113, B:66:0x011b, B:68:0x013b, B:69:0x013e, B:73:0x014f, B:74:0x0152, B:25:0x0055, B:31:0x0062, B:67:0x011f), top: B:117:0x004f, outer: #3, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4 A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #6 {all -> 0x005c, blocks: (B:22:0x004f, B:36:0x006c, B:39:0x0078, B:40:0x0082, B:42:0x0088, B:44:0x0098, B:46:0x00af, B:50:0x00bd, B:52:0x00c1, B:54:0x00d1, B:56:0x00e8, B:59:0x00f4, B:71:0x014b, B:78:0x015e, B:80:0x016c, B:82:0x017a, B:83:0x0181, B:85:0x018f, B:87:0x0193, B:88:0x0196, B:90:0x019a, B:92:0x01ba, B:94:0x01c6, B:95:0x01c9, B:96:0x01ca, B:62:0x0105, B:64:0x0113, B:66:0x011b, B:68:0x013b, B:69:0x013e, B:73:0x014f, B:74:0x0152, B:25:0x0055, B:31:0x0062, B:67:0x011f), top: B:117:0x004f, outer: #3, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0155 A[Catch: all -> 0x0018, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0018, blocks: (B:7:0x0012, B:9:0x0016, B:13:0x001b, B:15:0x0020, B:16:0x0022, B:18:0x0034, B:19:0x0038, B:20:0x003a, B:47:0x00b3, B:48:0x00ba, B:57:0x00ec, B:76:0x0155, B:97:0x01cc, B:98:0x01d3, B:100:0x01d5, B:101:0x01dc, B:22:0x004f, B:36:0x006c, B:39:0x0078, B:40:0x0082, B:42:0x0088, B:44:0x0098, B:46:0x00af, B:50:0x00bd, B:52:0x00c1, B:54:0x00d1, B:56:0x00e8, B:59:0x00f4, B:71:0x014b, B:78:0x015e, B:80:0x016c, B:82:0x017a, B:83:0x0181, B:85:0x018f, B:87:0x0193, B:88:0x0196, B:90:0x019a, B:92:0x01ba, B:94:0x01c6, B:95:0x01c9, B:96:0x01ca, B:62:0x0105, B:64:0x0113, B:66:0x011b, B:68:0x013b, B:69:0x013e, B:73:0x014f, B:74:0x0152, B:25:0x0055, B:31:0x0062), top: B:113:0x0012, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015e A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #6 {all -> 0x005c, blocks: (B:22:0x004f, B:36:0x006c, B:39:0x0078, B:40:0x0082, B:42:0x0088, B:44:0x0098, B:46:0x00af, B:50:0x00bd, B:52:0x00c1, B:54:0x00d1, B:56:0x00e8, B:59:0x00f4, B:71:0x014b, B:78:0x015e, B:80:0x016c, B:82:0x017a, B:83:0x0181, B:85:0x018f, B:87:0x0193, B:88:0x0196, B:90:0x019a, B:92:0x01ba, B:94:0x01c6, B:95:0x01c9, B:96:0x01ca, B:62:0x0105, B:64:0x0113, B:66:0x011b, B:68:0x013b, B:69:0x013e, B:73:0x014f, B:74:0x0152, B:25:0x0055, B:31:0x0062, B:67:0x011f), top: B:117:0x004f, outer: #3, inners: #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object c() {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1288hw.c():java.lang.Object");
    }

    @Override // com.google.android.gms.internal.ads.ZA
    public Object a() {
        C1614o c1614o;
        switch (this.f14619a) {
            case 1:
                return c();
            case 2:
                return AbstractC0709Rg.b(this.f14620b);
            default:
                Context context = this.f14620b;
                C1197gC c1197gC = C1614o.f15863n;
                synchronized (C1614o.class) {
                    try {
                        if (C1614o.f15862H == null) {
                            Context applicationContext = context == null ? null : context.getApplicationContext();
                            HashMap map = new HashMap(8);
                            map.put(0, 1000000L);
                            map.put(2, -9223372036854775807L);
                            map.put(3, -9223372036854775807L);
                            map.put(4, -9223372036854775807L);
                            map.put(5, -9223372036854775807L);
                            map.put(10, -9223372036854775807L);
                            map.put(9, -9223372036854775807L);
                            map.put(7, -9223372036854775807L);
                            C1614o.f15862H = new C1614o(applicationContext, map);
                        }
                        c1614o = C1614o.f15862H;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c1614o;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1223gl, com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        ((InterfaceC2029vk) obj).u(this.f14620b);
    }

    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo11d(Object obj) {
        if (((Boolean) AbstractC0994ca.f13575j.v()).booleanValue()) {
            AbstractC2022vd.E(this.f14620b);
        }
    }

    @Override // com.google.android.gms.internal.ads.BD
    public void u(Throwable th) {
        if (((Boolean) AbstractC0994ca.f13574h.v()).booleanValue() && (th instanceof t2.n)) {
            AbstractC2022vd.E(this.f14620b);
        }
    }

    public /* synthetic */ C1288hw(Context context, int i) {
        this.f14619a = i;
        this.f14620b = context;
    }
}
