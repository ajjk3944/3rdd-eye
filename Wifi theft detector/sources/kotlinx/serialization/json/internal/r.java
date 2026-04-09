package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;

/* loaded from: classes4.dex */
public final class r extends y9.a {

    /* renamed from: a, reason: collision with root package name */
    public final a f23039a;

    /* renamed from: b, reason: collision with root package name */
    public final aa.c f23040b;

    public r(a lexer, z9.a json) {
        kotlin.jvm.internal.p.e(lexer, "lexer");
        kotlin.jvm.internal.p.e(json, "json");
        this.f23039a = lexer;
        this.f23040b = json.a();
    }

    @Override // y9.a, y9.e
    public byte H() {
        a aVar = this.f23039a;
        String strS = aVar.s();
        try {
            return s9.b0.a(strS);
        } catch (IllegalArgumentException unused) {
            a.y(aVar, "Failed to parse type 'UByte' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // y9.e, y9.c
    public aa.c a() {
        return this.f23040b;
    }

    @Override // y9.a, y9.e
    public int h() {
        a aVar = this.f23039a;
        String strS = aVar.s();
        try {
            return s9.b0.d(strS);
        } catch (IllegalArgumentException unused) {
            a.y(aVar, "Failed to parse type 'UInt' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // y9.a, y9.e
    public long l() {
        a aVar = this.f23039a;
        String strS = aVar.s();
        try {
            return s9.b0.g(strS);
        } catch (IllegalArgumentException unused) {
            a.y(aVar, "Failed to parse type 'ULong' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // y9.c
    public int o(kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // y9.a, y9.e
    public short s() {
        a aVar = this.f23039a;
        String strS = aVar.s();
        try {
            return s9.b0.j(strS);
        } catch (IllegalArgumentException unused) {
            a.y(aVar, "Failed to parse type 'UShort' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }
}
