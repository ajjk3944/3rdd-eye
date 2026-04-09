package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class uu1 implements rd0, lx1, ox1, jb0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ uu1 f17345b = new uu1(9);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ uu1 f17346c = new uu1(10);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ uu1 f17347d = new uu1(11);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ uu1 f17348e = new uu1(12);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ uu1 f17349f = new uu1(13);
    public static final /* synthetic */ uu1 g = new uu1(14);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ uu1 f17350h = new uu1(15);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ uu1 f17351i = new uu1(17);
    public static final /* synthetic */ uu1 j = new uu1(20);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17352a;

    public /* synthetic */ uu1(int i4) {
        this.f17352a = i4;
    }

    @Override // com.google.android.gms.internal.ads.lx1
    public MediaCodecInfo L1(int i4) {
        return MediaCodecList.getCodecInfoAt(i4);
    }

    @Override // com.google.android.gms.internal.ads.lx1
    public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.android.gms.internal.ads.lx1
    public int b() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.ox1
    public /* synthetic */ int c(Object obj) {
        HashMap map = px1.f15143a;
        String str = ((ex1) obj).f10904a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.lx1
    public boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.lx1
    public boolean zzc() {
        return false;
    }

    public uu1(Context context) {
        this.f17352a = 19;
        new ce1(context, 22);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.clear();
        map2.clear();
    }

    @Override // com.google.android.gms.internal.ads.rd0
    /* renamed from: c */
    public void mo160c(Object obj) {
        long jT;
        b bVar;
        switch (this.f17352a) {
            case 0:
                return;
            case 1:
                return;
            case 2:
                return;
            case 3:
                return;
            case 4:
                return;
            case 5:
                return;
            case 6:
                return;
            case 7:
                return;
            case 8:
            default:
                ((gz1) obj).getClass();
                return;
            case 9:
                gw1 gw1Var = (gw1) obj;
                gw1Var.getClass();
                kw1.X.getAndDecrement();
                kh0 kh0Var = gw1Var.f11624b.f13271l;
                if (kh0Var != null) {
                    int i4 = gw1Var.f11623a.f15119a;
                    uu1 uu1Var = new uu1(8);
                    g1 g1Var = ((mw1) kh0Var.f13160b).C0;
                    Handler handler = g1Var.f11341a;
                    if (handler != null) {
                        handler.post(new qv1(g1Var, uu1Var, 1));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                gw1 gw1Var2 = (gw1) obj;
                kw1 kw1Var = gw1Var2.f11624b;
                if (gw1Var2.equals(kw1Var.f13268h) && kw1Var.f13271l != null) {
                    a8.g gVar = kw1Var.f13273n;
                    int i10 = gVar.f229b;
                    if (i10 != -1) {
                        long j8 = ((pv1) gVar.f232e).f15122d / i10;
                        bw1 bw1Var = kw1Var.f13277r;
                        bw1Var.getClass();
                        jT = bq0.t(bw1Var.f9821a.getSampleRate(), j8);
                    } else {
                        jT = -9223372036854775807L;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - kw1Var.S;
                    kh0 kh0Var2 = kw1Var.f13271l;
                    int i11 = ((pv1) kw1Var.f13273n.f232e).f15122d;
                    g1 g1Var2 = ((mw1) kh0Var2.f13160b).C0;
                    long jR = bq0.r(jT);
                    Handler handler2 = g1Var2.f11341a;
                    if (handler2 != null) {
                        handler2.post(new qv1(g1Var2, i11, jR, jElapsedRealtime));
                        return;
                    }
                    return;
                }
                return;
            case 11:
                gw1 gw1Var3 = (gw1) obj;
                kw1 kw1Var2 = gw1Var3.f11624b;
                if (gw1Var3.equals(kw1Var2.f13268h)) {
                    kw1Var2.L = true;
                    return;
                }
                return;
            case 12:
                ((gw1) obj).a();
                return;
            case 13:
                ((gw1) obj).a();
                return;
            case 14:
                kh0 kh0Var3 = ((iw1) obj).f12497a.f13271l;
                if (kh0Var3 != null) {
                    mw1 mw1Var = (mw1) kh0Var3.f13160b;
                    synchronized (mw1Var.f15082a) {
                        bVar = mw1Var.f15097r;
                    }
                    if (bVar != null) {
                        bVar.a();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
