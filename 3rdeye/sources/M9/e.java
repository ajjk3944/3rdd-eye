package M9;

import O9.k;
import Q9.C0;
import b9.C1992A;
import c9.C2099t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: PolymorphicSerializer.kt */
/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.m implements p9.l<O9.a, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g<Object> f4347g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g<Object> gVar) {
        super(1);
        this.f4347g = gVar;
    }

    @Override // p9.l
    public final C1992A invoke(O9.a aVar) {
        O9.a buildSerialDescriptor = aVar;
        kotlin.jvm.internal.l.f(buildSerialDescriptor, "$this$buildSerialDescriptor");
        O9.a.a(buildSerialDescriptor, "type", C0.f11400b);
        StringBuilder sb = new StringBuilder("kotlinx.serialization.Polymorphic<");
        g<Object> gVar = this.f4347g;
        sb.append(gVar.f4349a.d());
        sb.append('>');
        O9.a.a(buildSerialDescriptor, AppMeasurementSdk.ConditionalUserProperty.VALUE, O9.j.b(sb.toString(), k.a.f10521a, new O9.e[0], O9.i.f10520g));
        C2099t c2099t = gVar.f4350b;
        kotlin.jvm.internal.l.f(c2099t, "<set-?>");
        buildSerialDescriptor.f10482b = c2099t;
        return C1992A.f18074a;
    }
}
