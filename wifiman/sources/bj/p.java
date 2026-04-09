package bj;

import aj.AbstractC3868b;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class p extends Yi.a {

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC4118a f33453b;

    /* renamed from: c, reason: collision with root package name */
    private final cj.e f33454c;

    public p(AbstractC4118a lexer, AbstractC3868b json) {
        AbstractC6492s.i(lexer, "lexer");
        AbstractC6492s.i(json, "json");
        this.f33453b = lexer;
        this.f33454c = json.a();
    }

    @Override // Yi.a, Yi.e
    public byte D() {
        AbstractC4118a abstractC4118a = this.f33453b;
        String strS = abstractC4118a.s();
        try {
            return kotlin.text.M.a(strS);
        } catch (IllegalArgumentException unused) {
            AbstractC4118a.z(abstractC4118a, "Failed to parse type 'UByte' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // Yi.a, Yi.e
    public short F() {
        AbstractC4118a abstractC4118a = this.f33453b;
        String strS = abstractC4118a.s();
        try {
            return kotlin.text.M.k(strS);
        } catch (IllegalArgumentException unused) {
            AbstractC4118a.z(abstractC4118a, "Failed to parse type 'UShort' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // Yi.c
    public cj.e a() {
        return this.f33454c;
    }

    @Override // Yi.c
    public int k(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // Yi.a, Yi.e
    public int n() {
        AbstractC4118a abstractC4118a = this.f33453b;
        String strS = abstractC4118a.s();
        try {
            return kotlin.text.M.e(strS);
        } catch (IllegalArgumentException unused) {
            AbstractC4118a.z(abstractC4118a, "Failed to parse type 'UInt' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // Yi.a, Yi.e
    public long v() {
        AbstractC4118a abstractC4118a = this.f33453b;
        String strS = abstractC4118a.s();
        try {
            return kotlin.text.M.h(strS);
        } catch (IllegalArgumentException unused) {
            AbstractC4118a.z(abstractC4118a, "Failed to parse type 'ULong' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }
}
