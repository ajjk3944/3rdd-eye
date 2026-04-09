package N7;

import A7.b;
import N7.B5;
import android.net.Uri;
import java.util.List;
import n7.AbstractC5371a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivImageBackgroundTemplate.kt */
/* loaded from: classes.dex */
public final class C5 implements InterfaceC5868a, z7.b<A5> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Double>> f5023a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC5371a<A7.b<EnumC1305p2>> f5024b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC5371a<A7.b<EnumC1319q2>> f5025c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC5371a<List<O4>> f5026d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Uri>> f5027e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Boolean>> f5028f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC5371a<A7.b<E5>> f5029g;

    static {
        b.a.a(Double.valueOf(1.0d));
        b.a.a(EnumC1305p2.CENTER);
        b.a.a(EnumC1319q2.CENTER);
        b.a.a(Boolean.FALSE);
        b.a.a(E5.FILL);
    }

    public C5(AbstractC5371a<A7.b<Double>> abstractC5371a, AbstractC5371a<A7.b<EnumC1305p2>> abstractC5371a2, AbstractC5371a<A7.b<EnumC1319q2>> abstractC5371a3, AbstractC5371a<List<O4>> abstractC5371a4, AbstractC5371a<A7.b<Uri>> abstractC5371a5, AbstractC5371a<A7.b<Boolean>> abstractC5371a6, AbstractC5371a<A7.b<E5>> abstractC5371a7) {
        this.f5023a = abstractC5371a;
        this.f5024b = abstractC5371a2;
        this.f5025c = abstractC5371a3;
        this.f5026d = abstractC5371a4;
        this.f5027e = abstractC5371a5;
        this.f5028f = abstractC5371a6;
        this.f5029g = abstractC5371a7;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((B5.e) D7.a.f1071b.f6599S3.getValue()).b(D7.a.f1070a, this);
    }
}
