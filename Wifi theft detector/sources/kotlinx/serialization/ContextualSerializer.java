package kotlinx.serialization;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.p;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.h;
import kotlinx.serialization.internal.l1;
import l9.l;
import y8.s;
import z8.m;
import z8.r;

/* loaded from: classes4.dex */
public final class ContextualSerializer implements b {

    /* renamed from: a, reason: collision with root package name */
    public final r9.c f22726a;

    /* renamed from: b, reason: collision with root package name */
    public final b f22727b;

    /* renamed from: c, reason: collision with root package name */
    public final List f22728c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.f f22729d;

    public ContextualSerializer(r9.c serializableClass, b bVar, b[] typeArgumentsSerializers) {
        p.e(serializableClass, "serializableClass");
        p.e(typeArgumentsSerializers, "typeArgumentsSerializers");
        this.f22726a = serializableClass;
        this.f22727b = bVar;
        this.f22728c = m.c(typeArgumentsSerializers);
        this.f22729d = kotlinx.serialization.descriptors.b.c(SerialDescriptorsKt.c("kotlinx.serialization.ContextualSerializer", h.a.f22784a, new kotlinx.serialization.descriptors.f[0], new l() { // from class: kotlinx.serialization.ContextualSerializer$descriptor$1
            {
                super(1);
            }

            public final void a(kotlinx.serialization.descriptors.a buildSerialDescriptor) {
                kotlinx.serialization.descriptors.f descriptor;
                p.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                b bVar2 = this.this$0.f22727b;
                List annotations = (bVar2 == null || (descriptor = bVar2.getDescriptor()) == null) ? null : descriptor.getAnnotations();
                if (annotations == null) {
                    annotations = r.j();
                }
                buildSerialDescriptor.h(annotations);
            }

            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((kotlinx.serialization.descriptors.a) obj);
                return s.f25199a;
            }
        }), serializableClass);
    }

    public final b b(aa.c cVar) {
        b bVarB = cVar.b(this.f22726a, this.f22728c);
        if (bVarB != null) {
            return bVarB;
        }
        b bVar = this.f22727b;
        if (bVar != null) {
            return bVar;
        }
        l1.d(this.f22726a);
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.a
    public Object deserialize(y9.e decoder) {
        p.e(decoder, "decoder");
        return decoder.G(b(decoder.a()));
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return this.f22729d;
    }

    @Override // kotlinx.serialization.e
    public void serialize(y9.f encoder, Object value) {
        p.e(encoder, "encoder");
        p.e(value, "value");
        encoder.e(b(encoder.a()), value);
    }
}
