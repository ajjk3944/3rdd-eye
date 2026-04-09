package c0;

import C.C;
import C.S;
import C.k0;
import W.b0;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.Q0;
import d0.AbstractC4254A;
import d0.AbstractC4255B;
import d0.C4260d;
import e0.C4301b;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: VideoEncoderConfigDefaultResolver.java */
/* renamed from: c0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2040l implements K0.f<AbstractC4254A> {

    /* renamed from: g, reason: collision with root package name */
    public static final Size f18361g = new Size(1280, 720);

    /* renamed from: h, reason: collision with root package name */
    public static final Range<Integer> f18362h = new Range<>(1, 60);

    /* renamed from: a, reason: collision with root package name */
    public final String f18363a;

    /* renamed from: b, reason: collision with root package name */
    public final Q0 f18364b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f18365c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f18366d;

    /* renamed from: e, reason: collision with root package name */
    public final C f18367e;

    /* renamed from: f, reason: collision with root package name */
    public final Range<Integer> f18368f;

    public C2040l(String str, Q0 q02, b0 b0Var, Size size, C c10, Range<Integer> range) {
        this.f18363a = str;
        this.f18364b = q02;
        this.f18365c = b0Var;
        this.f18366d = size;
        this.f18367e = c10;
        this.f18368f = range;
    }

    @Override // K0.f
    public final AbstractC4254A get() {
        Integer num;
        Range<Integer> range = k0.f730p;
        Range<Integer> range2 = this.f18368f;
        int iIntValue = !Objects.equals(range2, range) ? ((Integer) f18362h.clamp((Integer) range2.getUpper())).intValue() : 30;
        Integer numValueOf = Integer.valueOf(iIntValue);
        boolean zEquals = Objects.equals(range2, range);
        Object obj = range2;
        if (!zEquals) {
            obj = "<UNSPECIFIED>";
        }
        S.a("VidEncCfgDefaultRslvr", String.format("Default resolved frame rate: %dfps. [Expected operating range: %s]", numValueOf, obj));
        S.a("VidEncCfgDefaultRslvr", "Resolved VIDEO frame rate: " + iIntValue + "fps");
        Range<Integer> rangeC = this.f18365c.c();
        S.a("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        C c10 = this.f18367e;
        int i = c10.f622b;
        Size size = this.f18366d;
        int width = size.getWidth();
        Size size2 = f18361g;
        int iC = C2039k.c(14000000, i, 8, iIntValue, 30, width, size2.getWidth(), size.getHeight(), size2.getHeight(), rangeC);
        HashMap map = C4301b.f37635e;
        String str = this.f18363a;
        Map map2 = (Map) map.get(str);
        int iIntValue2 = (map2 == null || (num = (Integer) map2.get(c10)) == null) ? -1 : num.intValue();
        AbstractC4255B abstractC4255BA = C2039k.a(iIntValue2, str);
        C4260d.a aVarD = AbstractC4254A.d();
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        aVarD.f37218a = str;
        Q0 q02 = this.f18364b;
        if (q02 == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        aVarD.f37220c = q02;
        aVarD.f37221d = size;
        aVarD.i = Integer.valueOf(iC);
        aVarD.f37224g = Integer.valueOf(iIntValue);
        aVarD.f37219b = Integer.valueOf(iIntValue2);
        if (abstractC4255BA == null) {
            throw new NullPointerException("Null dataSpace");
        }
        aVarD.f37223f = abstractC4255BA;
        return aVarD.a();
    }
}
