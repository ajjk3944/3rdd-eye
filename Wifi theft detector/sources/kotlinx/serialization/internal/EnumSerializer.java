package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlinx.serialization.SerializationException;

/* loaded from: classes4.dex */
public final class EnumSerializer implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f22792a;

    /* renamed from: b, reason: collision with root package name */
    public kotlinx.serialization.descriptors.f f22793b;

    /* renamed from: c, reason: collision with root package name */
    public final y8.h f22794c;

    public EnumSerializer(final String serialName, Enum[] values) {
        kotlin.jvm.internal.p.e(serialName, "serialName");
        kotlin.jvm.internal.p.e(values, "values");
        this.f22792a = values;
        this.f22794c = kotlin.b.b(new l9.a() { // from class: kotlinx.serialization.internal.EnumSerializer$descriptor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final kotlinx.serialization.descriptors.f invoke() {
                kotlinx.serialization.descriptors.f fVar = this.this$0.f22793b;
                return fVar == null ? this.this$0.c(serialName) : fVar;
            }
        });
    }

    public final kotlinx.serialization.descriptors.f c(String str) {
        EnumDescriptor enumDescriptor = new EnumDescriptor(str, this.f22792a.length);
        for (Enum r02 : this.f22792a) {
            PluginGeneratedSerialDescriptor.l(enumDescriptor, r02.name(), false, 2, null);
        }
        return enumDescriptor;
    }

    @Override // kotlinx.serialization.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Enum deserialize(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        int iE = decoder.e(getDescriptor());
        if (iE >= 0) {
            Enum[] enumArr = this.f22792a;
            if (iE < enumArr.length) {
                return enumArr[iE];
            }
        }
        throw new SerializationException(iE + " is not among valid " + getDescriptor().h() + " enum values, values size is " + this.f22792a.length);
    }

    @Override // kotlinx.serialization.e
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void serialize(y9.f encoder, Enum value) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        kotlin.jvm.internal.p.e(value, "value");
        int iJ = z8.o.J(this.f22792a, value);
        if (iJ != -1) {
            encoder.k(getDescriptor(), iJ);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().h());
        sb.append(", must be one of ");
        String string = Arrays.toString(this.f22792a);
        kotlin.jvm.internal.p.d(string, "toString(this)");
        sb.append(string);
        throw new SerializationException(sb.toString());
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return (kotlinx.serialization.descriptors.f) this.f22794c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().h() + '>';
    }
}
