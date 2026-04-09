package c0;

import C.S;
import N7.G8;
import W.AbstractC1613a;
import Z.l;
import android.util.Range;
import androidx.camera.core.impl.InterfaceC1680b0;
import java.util.List;

/* compiled from: AudioSettingsAudioProfileResolver.java */
/* renamed from: c0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2034f implements K0.f<Z.a> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1613a f18344a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1680b0.a f18345b;

    public C2034f(AbstractC1613a abstractC1613a, InterfaceC1680b0.a aVar) {
        this.f18344a = abstractC1613a;
        this.f18345b = aVar;
    }

    @Override // K0.f
    public final Z.a get() {
        AbstractC1613a abstractC1613a = this.f18344a;
        int iA = C2030b.a(abstractC1613a);
        int iB = C2030b.b(abstractC1613a);
        int iC = abstractC1613a.c();
        Range<Integer> rangeD = abstractC1613a.d();
        InterfaceC1680b0.a aVar = this.f18345b;
        int iB2 = aVar.b();
        if (iC == -1) {
            S.a("AudioSrcAdPrflRslvr", "Resolved AUDIO channel count from AudioProfile: " + iB2);
            iC = iB2;
        } else {
            S.a("AudioSrcAdPrflRslvr", G8.r("Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: ", iB2, ", Resolved Channel Count: ", iC, "]"));
        }
        int iF = aVar.f();
        int iD = C2030b.d(rangeD, iC, iB, iF);
        S.a("AudioSrcAdPrflRslvr", G8.r("Using resolved AUDIO sample rate or nearest supported from AudioProfile: ", iD, "Hz. [AudioProfile sample rate: ", iF, "Hz]"));
        List<Integer> list = Z.a.f13893a;
        l.a aVar2 = new l.a();
        aVar2.f13950a = -1;
        aVar2.f13951b = -1;
        aVar2.f13952c = -1;
        aVar2.f13953d = -1;
        aVar2.f13950a = Integer.valueOf(iA);
        aVar2.f13953d = Integer.valueOf(iB);
        aVar2.f13952c = Integer.valueOf(iC);
        aVar2.f13951b = Integer.valueOf(iD);
        return aVar2.a();
    }
}
