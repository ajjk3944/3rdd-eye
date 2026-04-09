package Zi;

import Zg.AbstractC3682n;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlinx.serialization.SerializationException;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public final class I implements Vi.b {

    /* renamed from: a, reason: collision with root package name */
    private final Enum[] f25566a;

    /* renamed from: b, reason: collision with root package name */
    private Xi.f f25567b;

    /* renamed from: c, reason: collision with root package name */
    private final Yg.m f25568c;

    public I(final String serialName, Enum[] values) {
        AbstractC6492s.i(serialName, "serialName");
        AbstractC6492s.i(values, "values");
        this.f25566a = values;
        this.f25568c = Yg.n.b(new InterfaceC6824a() { // from class: Zi.H
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return I.i(this.f25552a, serialName);
            }
        });
    }

    private final Xi.f h(String str) {
        G g10 = new G(str, this.f25566a.length);
        for (Enum r02 : this.f25566a) {
            H0.q(g10, r02.name(), false, 2, null);
        }
        return g10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Xi.f i(I i10, String str) {
        Xi.f fVar = i10.f25567b;
        return fVar == null ? i10.h(str) : fVar;
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return (Xi.f) this.f25568c.getValue();
    }

    @Override // Vi.InterfaceC3627a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Enum c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        int iE = decoder.e(a());
        if (iE >= 0) {
            Enum[] enumArr = this.f25566a;
            if (iE < enumArr.length) {
                return enumArr[iE];
            }
        }
        throw new SerializationException(iE + " is not among valid " + a().a() + " enum values, values size is " + this.f25566a.length);
    }

    @Override // Vi.o
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void e(Yi.f encoder, Enum value) {
        AbstractC6492s.i(encoder, "encoder");
        AbstractC6492s.i(value, "value");
        int iM0 = AbstractC3682n.m0(this.f25566a, value);
        if (iM0 != -1) {
            encoder.D(a(), iM0);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(value);
        sb2.append(" is not a valid enum ");
        sb2.append(a().a());
        sb2.append(", must be one of ");
        String string = Arrays.toString(this.f25566a);
        AbstractC6492s.h(string, "toString(...)");
        sb2.append(string);
        throw new SerializationException(sb2.toString());
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + a().a() + '>';
    }
}
