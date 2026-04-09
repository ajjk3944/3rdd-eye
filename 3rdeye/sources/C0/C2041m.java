package c0;

import C.C;
import C.S;
import C.k0;
import W.b0;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC1680b0;
import androidx.camera.core.impl.Q0;
import d0.AbstractC4254A;
import d0.AbstractC4255B;
import d0.C4260d;
import java.util.Objects;

/* compiled from: VideoEncoderConfigVideoProfileResolver.java */
/* renamed from: c0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2041m implements K0.f<AbstractC4254A> {

    /* renamed from: a, reason: collision with root package name */
    public final String f18369a;

    /* renamed from: b, reason: collision with root package name */
    public final Q0 f18370b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f18371c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f18372d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1680b0.c f18373e;

    /* renamed from: f, reason: collision with root package name */
    public final C f18374f;

    /* renamed from: g, reason: collision with root package name */
    public final Range<Integer> f18375g;

    public C2041m(String str, Q0 q02, b0 b0Var, Size size, InterfaceC1680b0.c cVar, C c10, Range<Integer> range) {
        this.f18369a = str;
        this.f18370b = q02;
        this.f18371c = b0Var;
        this.f18372d = size;
        this.f18373e = cVar;
        this.f18374f = c10;
        this.f18375g = range;
    }

    @Override // K0.f
    public final AbstractC4254A get() {
        InterfaceC1680b0.c cVar = this.f18373e;
        int iE = cVar.e();
        Range<Integer> range = k0.f730p;
        Range<Integer> range2 = this.f18375g;
        int iIntValue = !Objects.equals(range2, range) ? ((Integer) range2.clamp(Integer.valueOf(iE))).intValue() : iE;
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numValueOf2 = Integer.valueOf(iE);
        boolean zEquals = Objects.equals(range2, range);
        Object obj = range2;
        if (!zEquals) {
            obj = "<UNSPECIFIED>";
        }
        S.a("VidEncVdPrflRslvr", String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", numValueOf, numValueOf2, obj));
        S.a("VidEncVdPrflRslvr", "Resolved VIDEO frame rate: " + iIntValue + "fps");
        Range<Integer> rangeC = this.f18371c.c();
        S.a("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        int iB = cVar.b();
        int i = this.f18374f.f622b;
        int iA = cVar.a();
        int iE2 = cVar.e();
        Size size = this.f18372d;
        int iC = C2039k.c(iB, i, iA, iIntValue, iE2, size.getWidth(), cVar.j(), size.getHeight(), cVar.g(), rangeC);
        int i10 = cVar.i();
        String str = this.f18369a;
        AbstractC4255B abstractC4255BA = C2039k.a(i10, str);
        C4260d.a aVarD = AbstractC4254A.d();
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        aVarD.f37218a = str;
        Q0 q02 = this.f18370b;
        if (q02 == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        aVarD.f37220c = q02;
        aVarD.f37221d = size;
        aVarD.i = Integer.valueOf(iC);
        aVarD.f37224g = Integer.valueOf(iIntValue);
        aVarD.f37219b = Integer.valueOf(i10);
        if (abstractC4255BA == null) {
            throw new NullPointerException("Null dataSpace");
        }
        aVarD.f37223f = abstractC4255BA;
        return aVarD.a();
    }
}
