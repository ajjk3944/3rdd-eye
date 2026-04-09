package kotlinx.serialization;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.t;

/* loaded from: classes4.dex */
public abstract class c {
    public static final a a(kotlinx.serialization.internal.b bVar, y9.c decoder, String str) {
        p.e(bVar, "<this>");
        p.e(decoder, "decoder");
        a aVarC = bVar.c(decoder, str);
        if (aVarC != null) {
            return aVarC;
        }
        kotlinx.serialization.internal.c.a(str, bVar.e());
        throw new KotlinNothingValueException();
    }

    public static final e b(kotlinx.serialization.internal.b bVar, y9.f encoder, Object value) {
        p.e(bVar, "<this>");
        p.e(encoder, "encoder");
        p.e(value, "value");
        e eVarD = bVar.d(encoder, value);
        if (eVarD != null) {
            return eVarD;
        }
        kotlinx.serialization.internal.c.b(t.b(value.getClass()), bVar.e());
        throw new KotlinNothingValueException();
    }
}
