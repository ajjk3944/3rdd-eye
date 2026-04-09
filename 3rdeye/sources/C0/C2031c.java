package c0;

import C.S;
import W.AbstractC1613a;
import android.util.Range;
import androidx.camera.core.impl.InterfaceC1680b0;
import androidx.camera.core.impl.Q0;
import d0.AbstractC4257a;
import d0.C4259c;

/* compiled from: AudioEncoderConfigAudioProfileResolver.java */
/* renamed from: c0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2031c implements K0.f<AbstractC4257a> {

    /* renamed from: a, reason: collision with root package name */
    public final String f18333a;

    /* renamed from: b, reason: collision with root package name */
    public final Q0 f18334b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18335c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1613a f18336d;

    /* renamed from: e, reason: collision with root package name */
    public final Z.a f18337e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1680b0.a f18338f;

    public C2031c(String str, int i, Q0 q02, AbstractC1613a abstractC1613a, Z.a aVar, InterfaceC1680b0.a aVar2) {
        this.f18333a = str;
        this.f18335c = i;
        this.f18334b = q02;
        this.f18336d = abstractC1613a;
        this.f18337e = aVar;
        this.f18338f = aVar2;
    }

    @Override // K0.f
    public final AbstractC4257a get() {
        S.a("AudioEncAdPrflRslvr", "Using resolved AUDIO bitrate from AudioProfile");
        Range<Integer> rangeB = this.f18336d.b();
        InterfaceC1680b0.a aVar = this.f18338f;
        int iA = aVar.a();
        Z.a aVar2 = this.f18337e;
        int iC = C2030b.c(iA, aVar2.d(), aVar.b(), aVar2.e(), aVar.f(), rangeB);
        C4259c.a aVar3 = new C4259c.a();
        aVar3.f37205b = -1;
        String str = this.f18333a;
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        aVar3.f37204a = str;
        aVar3.f37205b = Integer.valueOf(this.f18335c);
        Q0 q02 = this.f18334b;
        if (q02 == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        aVar3.f37206c = q02;
        aVar3.f37209f = Integer.valueOf(aVar2.d());
        aVar3.f37208e = Integer.valueOf(aVar2.e());
        aVar3.f37207d = Integer.valueOf(iC);
        return aVar3.a();
    }
}
