package kotlinx.serialization;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.w;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.d;
import kotlinx.serialization.descriptors.h;
import l9.l;
import y8.s;
import z8.r;

/* loaded from: classes4.dex */
public final class PolymorphicSerializer extends kotlinx.serialization.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final r9.c f22733a;

    /* renamed from: b, reason: collision with root package name */
    public List f22734b;

    /* renamed from: c, reason: collision with root package name */
    public final y8.h f22735c;

    public PolymorphicSerializer(r9.c baseClass) {
        p.e(baseClass, "baseClass");
        this.f22733a = baseClass;
        this.f22734b = r.j();
        this.f22735c = kotlin.b.a(LazyThreadSafetyMode.f21908b, new l9.a() { // from class: kotlinx.serialization.PolymorphicSerializer$descriptor$2
            {
                super(0);
            }

            @Override // l9.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final kotlinx.serialization.descriptors.f invoke() {
                final PolymorphicSerializer polymorphicSerializer = this.this$0;
                return kotlinx.serialization.descriptors.b.c(SerialDescriptorsKt.c("kotlinx.serialization.Polymorphic", d.a.f22767a, new kotlinx.serialization.descriptors.f[0], new l() { // from class: kotlinx.serialization.PolymorphicSerializer$descriptor$2.1
                    {
                        super(1);
                    }

                    public final void a(kotlinx.serialization.descriptors.a buildSerialDescriptor) {
                        p.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                        kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, HandleInvocationsFromAdViewer.KEY_AD_TYPE, x9.a.B(w.f22046a).getDescriptor(), null, false, 12, null);
                        kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, AppMeasurementSdk.ConditionalUserProperty.VALUE, SerialDescriptorsKt.d("kotlinx.serialization.Polymorphic<" + polymorphicSerializer.e().i() + '>', h.a.f22784a, new kotlinx.serialization.descriptors.f[0], null, 8, null), null, false, 12, null);
                        buildSerialDescriptor.h(polymorphicSerializer.f22734b);
                    }

                    @Override // l9.l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a((kotlinx.serialization.descriptors.a) obj);
                        return s.f25199a;
                    }
                }), this.this$0.e());
            }
        });
    }

    @Override // kotlinx.serialization.internal.b
    public r9.c e() {
        return this.f22733a;
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return (kotlinx.serialization.descriptors.f) this.f22735c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + e() + ')';
    }
}
