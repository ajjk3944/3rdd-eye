package kotlinx.serialization.internal;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.i;

/* loaded from: classes4.dex */
public final class ObjectSerializer implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f22798a;

    /* renamed from: b, reason: collision with root package name */
    public List f22799b;

    /* renamed from: c, reason: collision with root package name */
    public final y8.h f22800c;

    public ObjectSerializer(final String serialName, Object objectInstance) {
        kotlin.jvm.internal.p.e(serialName, "serialName");
        kotlin.jvm.internal.p.e(objectInstance, "objectInstance");
        this.f22798a = objectInstance;
        this.f22799b = z8.r.j();
        this.f22800c = kotlin.b.a(LazyThreadSafetyMode.f21908b, new l9.a() { // from class: kotlinx.serialization.internal.ObjectSerializer$descriptor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final kotlinx.serialization.descriptors.f invoke() {
                final ObjectSerializer objectSerializer = this;
                return SerialDescriptorsKt.c(serialName, i.d.f22789a, new kotlinx.serialization.descriptors.f[0], new l9.l() { // from class: kotlinx.serialization.internal.ObjectSerializer$descriptor$2.1
                    {
                        super(1);
                    }

                    public final void a(kotlinx.serialization.descriptors.a buildSerialDescriptor) {
                        kotlin.jvm.internal.p.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                        buildSerialDescriptor.h(objectSerializer.f22799b);
                    }

                    @Override // l9.l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a((kotlinx.serialization.descriptors.a) obj);
                        return y8.s.f25199a;
                    }
                });
            }
        });
    }

    @Override // kotlinx.serialization.a
    public Object deserialize(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        kotlinx.serialization.descriptors.f descriptor = getDescriptor();
        y9.c cVarB = decoder.b(descriptor);
        int iO = cVarB.o(getDescriptor());
        if (iO == -1) {
            y8.s sVar = y8.s.f25199a;
            cVarB.c(descriptor);
            return this.f22798a;
        }
        throw new SerializationException("Unexpected index " + iO);
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return (kotlinx.serialization.descriptors.f) this.f22800c.getValue();
    }

    @Override // kotlinx.serialization.e
    public void serialize(y9.f encoder, Object value) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        kotlin.jvm.internal.p.e(value, "value");
        encoder.b(getDescriptor()).c(getDescriptor());
    }
}
