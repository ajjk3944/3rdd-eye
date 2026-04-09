package c0;

import C.S;
import W.AbstractC1613a;
import android.util.Range;
import androidx.camera.core.impl.Q0;
import d0.AbstractC4257a;
import d0.C4259c;

/* compiled from: AudioEncoderConfigDefaultResolver.java */
/* renamed from: c0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2032d implements K0.f<AbstractC4257a> {

    /* renamed from: a, reason: collision with root package name */
    public final String f18339a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18340b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1613a f18341c;

    /* renamed from: d, reason: collision with root package name */
    public final Z.a f18342d;

    /* renamed from: e, reason: collision with root package name */
    public final Q0 f18343e;

    public C2032d(String str, int i, Q0 q02, AbstractC1613a abstractC1613a, Z.a aVar) {
        this.f18339a = str;
        this.f18340b = i;
        this.f18343e = q02;
        this.f18341c = abstractC1613a;
        this.f18342d = aVar;
    }

    @Override // K0.f
    public final AbstractC4257a get() {
        Range<Integer> rangeB = this.f18341c.b();
        S.a("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
        Z.a aVar = this.f18342d;
        int iC = C2030b.c(156000, aVar.d(), 2, aVar.e(), 48000, rangeB);
        C4259c.a aVar2 = new C4259c.a();
        aVar2.f37205b = -1;
        String str = this.f18339a;
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        aVar2.f37204a = str;
        aVar2.f37205b = Integer.valueOf(this.f18340b);
        Q0 q02 = this.f18343e;
        if (q02 == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        aVar2.f37206c = q02;
        aVar2.f37209f = Integer.valueOf(aVar.d());
        aVar2.f37208e = Integer.valueOf(aVar.e());
        aVar2.f37207d = Integer.valueOf(iC);
        return aVar2.a();
    }
}
