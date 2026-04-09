package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class EO implements InterfaceC0801Wn, SP, VP, InterfaceC0664Om {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EO f7949b = new EO(2);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EO f7950c = new EO(3);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EO f7951d = new EO(4);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EO f7952e = new EO(5);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EO f7953f = new EO(6);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EO f7954g = new EO(7);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EO f7955h = new EO(8);
    public static final /* synthetic */ EO i = new EO(10);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EO f7956j = new EO(13);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7957a;

    public /* synthetic */ EO(int i3) {
        this.f7957a = i3;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public int a() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.VP
    public /* synthetic */ int b(Object obj) {
        HashMap map = WP.f12225a;
        String str = ((LP) obj).f9690a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.android.gms.internal.ads.SP
    public boolean f() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public boolean g(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.SP
    public MediaCodecInfo h(int i3) {
        return MediaCodecList.getCodecInfoAt(i3);
    }

    public EO(Context context) {
        this.f7957a = 12;
        new Vu(context, 5);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.clear();
        map2.clear();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b, reason: collision with other method in class */
    public void mo4b(Object obj) {
        long jT;
        C0911b c0911b;
        switch (this.f7957a) {
            case 0:
                return;
            case 1:
            default:
                ((KQ) obj).getClass();
                return;
            case 2:
                C1586nP c1586nP = (C1586nP) obj;
                c1586nP.getClass();
                C1801rP.f16518X.getAndDecrement();
                C1014cu c1014cu = c1586nP.f15777b.f16551l;
                if (c1014cu != null) {
                    int i3 = c1586nP.f15776a.f12882a;
                    EO eo = new EO(1);
                    Vu vu = ((C1909tP) c1014cu.f13695b).f16910Q0;
                    Handler handler = (Handler) vu.f12105a;
                    if (handler != null) {
                        handler.post(new RunnableC0882aP(vu, eo, 1));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                C1586nP c1586nP2 = (C1586nP) obj;
                C1801rP c1801rP = c1586nP2.f15777b;
                if (c1586nP2.equals(c1801rP.f16548h) && c1801rP.f16551l != null) {
                    C0752Tp c0752Tp = c1801rP.f16553n;
                    int i6 = c0752Tp.f11470b;
                    if (i6 != -1) {
                        long j6 = ((ZO) c0752Tp.f11473e).f12885d / i6;
                        C1424kP c1424kP = c1801rP.f16557r;
                        c1424kP.getClass();
                        jT = Vt.t(c1424kP.f15149a.getSampleRate(), j6);
                    } else {
                        jT = -9223372036854775807L;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - c1801rP.f16536S;
                    C1014cu c1014cu2 = c1801rP.f16551l;
                    int i7 = ((ZO) c1801rP.f16553n.f11473e).f12885d;
                    Vu vu2 = ((C1909tP) c1014cu2.f13695b).f16910Q0;
                    long jR = Vt.r(jT);
                    Handler handler2 = (Handler) vu2.f12105a;
                    if (handler2 != null) {
                        handler2.post(new RunnableC0882aP(vu2, i7, jR, jElapsedRealtime));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                C1586nP c1586nP3 = (C1586nP) obj;
                C1801rP c1801rP2 = c1586nP3.f15777b;
                if (c1586nP3.equals(c1801rP2.f16548h)) {
                    c1801rP2.f16530L = true;
                    return;
                }
                return;
            case 5:
                ((C1586nP) obj).a();
                return;
            case 6:
                ((C1586nP) obj).a();
                return;
            case 7:
                C1014cu c1014cu3 = ((C1694pP) obj).f16170a.f16551l;
                if (c1014cu3 != null) {
                    C1909tP c1909tP = (C1909tP) c1014cu3.f13695b;
                    synchronized (c1909tP.f10396a) {
                        c0911b = c1909tP.f10367F;
                    }
                    if (c0911b != null) {
                        c0911b.a();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
