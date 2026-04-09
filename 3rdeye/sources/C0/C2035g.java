package c0;

import C.S;
import W.AbstractC1613a;
import Z.l;
import android.util.Range;
import java.util.List;

/* compiled from: AudioSettingsDefaultResolver.java */
/* renamed from: c0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2035g implements K0.f<Z.a> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1613a f18346a;

    public C2035g(AbstractC1613a abstractC1613a) {
        this.f18346a = abstractC1613a;
    }

    @Override // K0.f
    public final Z.a get() {
        int iD;
        AbstractC1613a abstractC1613a = this.f18346a;
        int iA = C2030b.a(abstractC1613a);
        int iB = C2030b.b(abstractC1613a);
        int iC = abstractC1613a.c();
        if (iC == -1) {
            S.a("DefAudioResolver", "Using fallback AUDIO channel count: 1");
            iC = 1;
        } else {
            S.a("DefAudioResolver", "Using supplied AUDIO channel count: " + iC);
        }
        Range<Integer> rangeD = abstractC1613a.d();
        if (AbstractC1613a.f13231b.equals(rangeD)) {
            S.a("DefAudioResolver", "Using fallback AUDIO sample rate: 44100Hz");
            iD = 44100;
        } else {
            iD = C2030b.d(rangeD, iC, iB, ((Integer) rangeD.getUpper()).intValue());
            S.a("DefAudioResolver", "Using AUDIO sample rate resolved from AudioSpec: " + iD + "Hz");
        }
        List<Integer> list = Z.a.f13893a;
        l.a aVar = new l.a();
        aVar.f13950a = -1;
        aVar.f13951b = -1;
        aVar.f13952c = -1;
        aVar.f13953d = -1;
        aVar.f13950a = Integer.valueOf(iA);
        aVar.f13953d = Integer.valueOf(iB);
        aVar.f13952c = Integer.valueOf(iC);
        aVar.f13951b = Integer.valueOf(iD);
        return aVar.a();
    }
}
