package kotlinx.serialization.internal;

import kotlin.Pair;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;

/* loaded from: classes4.dex */
public final class PairSerializer extends t0 {

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.f f22801c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairSerializer(final kotlinx.serialization.b keySerializer, final kotlinx.serialization.b valueSerializer) {
        super(keySerializer, valueSerializer, null);
        kotlin.jvm.internal.p.e(keySerializer, "keySerializer");
        kotlin.jvm.internal.p.e(valueSerializer, "valueSerializer");
        this.f22801c = SerialDescriptorsKt.b("kotlin.Pair", new kotlinx.serialization.descriptors.f[0], new l9.l() { // from class: kotlinx.serialization.internal.PairSerializer$descriptor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(kotlinx.serialization.descriptors.a buildClassSerialDescriptor) {
                kotlin.jvm.internal.p.e(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                kotlinx.serialization.descriptors.a.b(buildClassSerialDescriptor, "first", keySerializer.getDescriptor(), null, false, 12, null);
                kotlinx.serialization.descriptors.a.b(buildClassSerialDescriptor, "second", valueSerializer.getDescriptor(), null, false, 12, null);
            }

            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((kotlinx.serialization.descriptors.a) obj);
                return y8.s.f25199a;
            }
        });
    }

    @Override // kotlinx.serialization.internal.t0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object a(Pair pair) {
        kotlin.jvm.internal.p.e(pair, "<this>");
        return pair.h();
    }

    @Override // kotlinx.serialization.internal.t0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object b(Pair pair) {
        kotlin.jvm.internal.p.e(pair, "<this>");
        return pair.i();
    }

    @Override // kotlinx.serialization.internal.t0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Pair c(Object obj, Object obj2) {
        return y8.i.a(obj, obj2);
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return this.f22801c;
    }
}
