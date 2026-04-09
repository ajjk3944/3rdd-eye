package ec;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.mwh;
import com.bytedance.sdk.component.vt.ouw.ouw.ouw;
import com.bytedance.sdk.component.vt.ouw.ryl;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.internal.measurement.c7;
import com.google.android.gms.internal.measurement.e7;
import com.google.android.gms.internal.measurement.i8;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.internal.measurement.s9;
import com.google.android.gms.internal.measurement.t7;
import com.google.android.gms.internal.measurement.w7;
import com.google.android.gms.internal.measurement.y6;
import com.liuzh.deviceinfo.pro.account.login.LogInActivity;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements v, b2.a, g8.e0, w8.b {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y f23176b = new y(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ y f23177c = new y(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ y f23178d = new y(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ y f23179e = new y(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ y f23180f = new y(4);
    public static final /* synthetic */ y g = new y(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ y f23181h = new y(6);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ y f23182i = new y(7);
    public static final /* synthetic */ y j = new y(8);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ y f23183k = new y(9);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ y f23184l = new y(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ y f23185m = new y(11);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ y f23186n = new y(12);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ y f23187o = new y(13);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ y f23188p = new y(14);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ y f23189q = new y(15);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ y f23190r = new y(16);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ y f23191s = new y(17);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ y f23192t = new y(18);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ y f23193u = new y(19);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ y f23194v = new y(20);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ y f23195w = new y(21);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23196a;

    public /* synthetic */ y(int i4) {
        this.f23196a = i4;
    }

    public static final String c(hm.h hVar, hm.h[] hVarArr, int i4) {
        int i10;
        boolean z3;
        int i11;
        int i12;
        hm.h hVar2 = PublicSuffixDatabase.f30577b;
        int iA = hVar.a();
        int i13 = 0;
        while (i13 < iA) {
            int i14 = (i13 + iA) / 2;
            while (i14 > -1 && hVar.d(i14) != 10) {
                i14--;
            }
            int i15 = i14 + 1;
            int i16 = 1;
            while (true) {
                i10 = i15 + i16;
                if (hVar.d(i10) == 10) {
                    break;
                }
                i16++;
            }
            int i17 = i10 - i15;
            int i18 = i4;
            boolean z10 = false;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                if (z10) {
                    i11 = 46;
                    z3 = false;
                } else {
                    byte bD = hVarArr[i18].d(i19);
                    byte[] bArr = sl.f.f33832a;
                    int i21 = bD & 255;
                    z3 = z10;
                    i11 = i21;
                }
                byte bD2 = hVar.d(i15 + i20);
                byte[] bArr2 = sl.f.f33832a;
                i12 = i11 - (bD2 & 255);
                if (i12 != 0) {
                    break;
                }
                i20++;
                i19++;
                if (i20 == i17) {
                    break;
                }
                if (hVarArr[i18].a() != i19) {
                    z10 = z3;
                } else {
                    if (i18 == hVarArr.length - 1) {
                        break;
                    }
                    i18++;
                    i19 = -1;
                    z10 = true;
                }
            }
            if (i12 >= 0) {
                if (i12 <= 0) {
                    int i22 = i17 - i20;
                    int iA2 = hVarArr[i18].a() - i19;
                    int length = hVarArr.length;
                    for (int i23 = i18 + 1; i23 < length; i23++) {
                        iA2 += hVarArr[i23].a();
                    }
                    if (iA2 >= i22) {
                        if (iA2 <= i22) {
                            return hVar.h(i15, i17 + i15).g(vk.a.f36267a);
                        }
                    }
                }
                i13 = i10 + 1;
            }
            iA = i14;
        }
        return null;
    }

    public static hm.h e(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            int i10 = i4 * 2;
            bArr[i4] = (byte) (im.b.a(str.charAt(i10 + 1)) + (im.b.a(str.charAt(i10)) << 4));
        }
        return new hm.h(bArr);
    }

    public static hm.h f(String str) {
        nk.k.e(str, "<this>");
        byte[] bytes = str.getBytes(vk.a.f36267a);
        nk.k.d(bytes, "getBytes(...)");
        hm.h hVar = new hm.h(bytes);
        hVar.f25178c = str;
        return hVar;
    }

    public static void h(Activity activity, int i4) {
        b5.o0 o0Var = LogInActivity.D;
        Intent intentPutExtra = new Intent(activity, (Class<?>) LogInActivity.class).putExtra("key.show_register_entrance", true).putExtra("key.by_token_expired", (i4 & 4) == 0);
        nk.k.d(intentPutExtra, "putExtra(...)");
        activity.startActivity(intentPutExtra);
    }

    @Override // b2.a
    public /* synthetic */ long U(long j8, long j9, int i4) {
        return 0L;
    }

    @Override // g8.e0
    public void a(MediaExtractor mediaExtractor, Object obj) throws IOException {
        mediaExtractor.setDataSource(new g8.d0((ByteBuffer) obj));
    }

    @Override // ec.v
    public Object b() {
        switch (this.f23196a) {
            case 0:
                List list = d0.f22616a;
                c7.f19649b.get();
                return Integer.valueOf((int) ((Long) e7.f19713t.b()).longValue());
            case 1:
                List list2 = d0.f22616a;
                m8.f19831b.get();
                Boolean bool = (Boolean) o8.f19854a.b();
                bool.getClass();
                return bool;
            case 2:
                List list3 = d0.f22616a;
                m8.f19831b.get();
                Long l10 = (Long) o8.f19858e.b();
                l10.getClass();
                return l10;
            case 3:
                List list4 = d0.f22616a;
                m8.f19831b.get();
                Double d10 = (Double) o8.f19856c.b();
                d10.getClass();
                return d10;
            case 4:
                List list5 = d0.f22616a;
                c7.f19649b.get();
                return Integer.valueOf((int) ((Long) e7.f19707q.b()).longValue());
            case 5:
                List list6 = d0.f22616a;
                c7.f19649b.get();
                Long l11 = (Long) e7.f19686e0.b();
                l11.getClass();
                return l11;
            case 6:
                List list7 = d0.f22616a;
                c7.f19649b.get();
                return Integer.valueOf((int) ((Long) e7.f19705p.b()).longValue());
            case 7:
                List list8 = d0.f22616a;
                c7.f19649b.get();
                return (String) e7.f19678a0.b();
            case 8:
                List list9 = d0.f22616a;
                c7.f19649b.get();
                return (String) e7.f19720w0.b();
            case 9:
                List list10 = d0.f22616a;
                c7.f19649b.get();
                return Integer.valueOf((int) ((Long) e7.f19710r0.b()).longValue());
            case 10:
                List list11 = d0.f22616a;
                c7.f19649b.get();
                return Integer.valueOf((int) ((Long) e7.X.b()).longValue());
            case 11:
                List list12 = d0.f22616a;
                c7.f19649b.get();
                Boolean bool2 = (Boolean) e7.f19681c.b();
                bool2.getClass();
                return bool2;
            case 12:
                List list13 = d0.f22616a;
                Boolean bool3 = (Boolean) w7.f20026b.b();
                bool3.getClass();
                return bool3;
            case 13:
                List list14 = d0.f22616a;
                Boolean bool4 = (Boolean) w7.f20027c.b();
                bool4.getClass();
                return bool4;
            case 14:
                List list15 = d0.f22616a;
                Boolean bool5 = (Boolean) s9.f19928a.b();
                bool5.getClass();
                return bool5;
            case 15:
                List list16 = d0.f22616a;
                Boolean bool6 = (Boolean) t7.f19940b.b();
                bool6.getClass();
                return bool6;
            case 16:
                List list17 = d0.f22616a;
                p8.f19864b.get();
                Boolean bool7 = (Boolean) r8.f19908f.b();
                bool7.getClass();
                return bool7;
            case 17:
                List list18 = d0.f22616a;
                p8.f19864b.get();
                Boolean bool8 = (Boolean) r8.f19909h.b();
                bool8.getClass();
                return bool8;
            case 18:
                List list19 = d0.f22616a;
                p8.f19864b.get();
                Boolean bool9 = (Boolean) r8.f19907e.b();
                bool9.getClass();
                return bool9;
            case 19:
                List list20 = d0.f22616a;
                Boolean bool10 = (Boolean) y6.f20054a.b();
                bool10.getClass();
                return bool10;
            case 20:
                List list21 = d0.f22616a;
                c7.f19649b.get();
                return Integer.valueOf((int) ((Long) e7.f19702n0.b()).longValue());
            default:
                return new Boolean(((Boolean) i8.f19786a.b()).booleanValue());
        }
    }

    @Override // g8.e0
    public void d(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(new g8.d0((ByteBuffer) obj));
    }

    public void g(Context context, com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar, w8.a aVar2) {
        char c9;
        ConcurrentHashMap concurrentHashMap = g9.a.f24614a;
        synchronized (g9.a.class) {
            if (aVar != null) {
                ConcurrentHashMap concurrentHashMap2 = g9.a.f24614a;
                g9.b bVar = (g9.b) concurrentHashMap2.get(aVar.bly());
                if (bVar == null) {
                    bVar = new g9.b(context, aVar);
                    concurrentHashMap2.put(aVar.bly(), bVar);
                    pk.a.y("VideoFileManager", "preloadVideo:  cache size = ", Integer.valueOf(aVar.lh()), aVar.bly());
                }
                if (bVar.g) {
                    synchronized (w8.a.class) {
                        bVar.f24620f.add(aVar2);
                    }
                } else {
                    bVar.f24620f.add(aVar2);
                    if (!bVar.f24619e.exists() && (bVar.f24616b.fkw() || (bVar.f24618d.length() < bVar.f24616b.lh() && (bVar.f24616b.vt() <= 0 || bVar.f24618d.length() < bVar.f24616b.vt())))) {
                        bVar.g = true;
                        bVar.f24616b.zin = 0;
                        cf.ouw ouwVarVt = v8.a.a() != null ? v8.a.a().vt() : new cf.ouw((byte) 0);
                        long j8 = bVar.f24616b.vm;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        ouwVarVt.ouw(j8, timeUnit).vt(bVar.f24616b.f6569th, timeUnit).lh(bVar.f24616b.qbp, timeUnit);
                        cf cfVarOuw = ouw.ouw(ouwVarVt);
                        ryl.ouw ouwVar = new ryl.ouw();
                        long length = bVar.f24618d.length();
                        int iLh = bVar.f24616b.lh();
                        boolean zFkw = bVar.f24616b.fkw();
                        int iVt = bVar.f24616b.vt();
                        if (iVt > 0) {
                            c9 = 2;
                            if (iVt >= bVar.f24616b.yu()) {
                                zFkw = true;
                            } else {
                                iLh = iVt;
                            }
                        } else {
                            c9 = 2;
                        }
                        ouwVar.pno = "videoPreload";
                        ouwVar.ra = 6;
                        if (zFkw) {
                            ouwVar.ouw("RANGE", "bytes=" + length + "-").ouw(bVar.f24616b.pno()).ouw("GET", (mwh) null).ouw();
                        } else {
                            ouwVar.ouw("RANGE", "bytes=" + length + "-" + iLh).ouw(bVar.f24616b.pno()).ouw("GET", (mwh) null).ouw();
                        }
                        cfVarOuw.ouw(ouwVar.ouw()).ouw(new androidx.recyclerview.widget.d(bVar, length, 10));
                        Integer numValueOf = Integer.valueOf(aVar.lh());
                        String strBly = aVar.bly();
                        Object[] objArr = new Object[3];
                        objArr[0] = "preloadVideo:  cache size = ";
                        objArr[1] = numValueOf;
                        objArr[c9] = strBly;
                        pk.a.y("VideoFileManager", objArr);
                    }
                    pk.a.x("VideoPreload", "Cache file is exist");
                    com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar3 = bVar.f24616b;
                    aVar3.zin = 1;
                    bVar.a(aVar3, TTAdConstant.MATE_VALID);
                    g9.a.a(bVar.f24616b);
                }
                c9 = 2;
                Integer numValueOf2 = Integer.valueOf(aVar.lh());
                String strBly2 = aVar.bly();
                Object[] objArr2 = new Object[3];
                objArr2[0] = "preloadVideo:  cache size = ";
                objArr2[1] = numValueOf2;
                objArr2[c9] = strBly2;
                pk.a.y("VideoFileManager", objArr2);
            } else if (pk.a.f32023b) {
                pk.a.x("Logger", " url、dir and hash is must property   in VideoInfoModel");
            }
        }
        if (pk.a.f32023b) {
            pk.a.x("Logger", "Exec clear video cache-- Pre");
        }
        y8.b bVar2 = u6.t.f35188e;
        if (bVar2 != null) {
            ((androidx.lifecycle.f1) bVar2).N();
        }
    }

    @Override // b2.a
    public Object j(long j8, long j9, ck.c cVar) {
        return new d3.p(0L);
    }

    @Override // b2.a
    public Object q(long j8, ck.c cVar) {
        return new d3.p(0L);
    }

    @Override // b2.a
    public /* synthetic */ long y(int i4, long j8) {
        return 0L;
    }
}
