package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.h;

/* loaded from: classes4.dex */
public class g0 extends y9.a implements z9.e {

    /* renamed from: a, reason: collision with root package name */
    public final z9.a f23003a;

    /* renamed from: b, reason: collision with root package name */
    public final WriteMode f23004b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.serialization.json.internal.a f23005c;

    /* renamed from: d, reason: collision with root package name */
    public final aa.c f23006d;

    /* renamed from: e, reason: collision with root package name */
    public int f23007e;

    /* renamed from: f, reason: collision with root package name */
    public a f23008f;

    /* renamed from: g, reason: collision with root package name */
    public final z9.d f23009g;

    /* renamed from: h, reason: collision with root package name */
    public final JsonElementMarker f23010h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f23011a;

        public a(String str) {
            this.f23011a = str;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23012a;

        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[WriteMode.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WriteMode.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WriteMode.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f23012a = iArr;
        }
    }

    public g0(z9.a json, WriteMode mode, kotlinx.serialization.json.internal.a lexer, kotlinx.serialization.descriptors.f descriptor, a aVar) {
        kotlin.jvm.internal.p.e(json, "json");
        kotlin.jvm.internal.p.e(mode, "mode");
        kotlin.jvm.internal.p.e(lexer, "lexer");
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        this.f23003a = json;
        this.f23004b = mode;
        this.f23005c = lexer;
        this.f23006d = json.a();
        this.f23007e = -1;
        this.f23008f = aVar;
        z9.d dVarE = json.e();
        this.f23009g = dVarE;
        this.f23010h = dVarE.f() ? null : new JsonElementMarker(descriptor);
    }

    @Override // y9.a, y9.e
    public boolean D() {
        JsonElementMarker jsonElementMarker = this.f23010h;
        return !(jsonElementMarker != null ? jsonElementMarker.b() : false) && this.f23005c.M();
    }

    @Override // y9.a, y9.e
    public Object G(kotlinx.serialization.a deserializer) {
        kotlin.jvm.internal.p.e(deserializer, "deserializer");
        try {
            if ((deserializer instanceof kotlinx.serialization.internal.b) && !this.f23003a.e().k()) {
                String strC = e0.c(deserializer.getDescriptor(), this.f23003a);
                String strL = this.f23005c.l(strC, this.f23009g.l());
                kotlinx.serialization.a aVarC = strL != null ? ((kotlinx.serialization.internal.b) deserializer).c(this, strL) : null;
                if (aVarC == null) {
                    return e0.d(this, deserializer);
                }
                this.f23008f = new a(strC);
                return aVarC.deserialize(this);
            }
            return deserializer.deserialize(this);
        } catch (MissingFieldException e10) {
            throw new MissingFieldException(e10.getMissingFields(), e10.getMessage() + " at path: " + this.f23005c.f22988b.a(), e10);
        }
    }

    @Override // y9.a, y9.e
    public byte H() {
        long jP = this.f23005c.p();
        byte b10 = (byte) jP;
        if (jP == b10) {
            return b10;
        }
        kotlinx.serialization.json.internal.a.y(this.f23005c, "Failed to parse byte for input '" + jP + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final void K() {
        if (this.f23005c.E() != 4) {
            return;
        }
        kotlinx.serialization.json.internal.a.y(this.f23005c, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final boolean L(kotlinx.serialization.descriptors.f fVar, int i10) {
        String strF;
        z9.a aVar = this.f23003a;
        kotlinx.serialization.descriptors.f fVarG = fVar.g(i10);
        if (!fVarG.b() && !this.f23005c.M()) {
            return true;
        }
        if (!kotlin.jvm.internal.p.a(fVarG.getKind(), h.b.f22785a) || (strF = this.f23005c.F(this.f23009g.l())) == null || JsonNamesMapKt.d(fVarG, aVar, strF) != -3) {
            return false;
        }
        this.f23005c.q();
        return true;
    }

    public final int M() {
        boolean zL = this.f23005c.L();
        if (!this.f23005c.f()) {
            if (!zL) {
                return -1;
            }
            kotlinx.serialization.json.internal.a.y(this.f23005c, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i10 = this.f23007e;
        if (i10 != -1 && !zL) {
            kotlinx.serialization.json.internal.a.y(this.f23005c, "Expected end of the array or comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i11 = i10 + 1;
        this.f23007e = i11;
        return i11;
    }

    public final int N() {
        int i10 = this.f23007e;
        boolean zL = false;
        boolean z10 = i10 % 2 != 0;
        if (!z10) {
            this.f23005c.o(':');
        } else if (i10 != -1) {
            zL = this.f23005c.L();
        }
        if (!this.f23005c.f()) {
            if (!zL) {
                return -1;
            }
            kotlinx.serialization.json.internal.a.y(this.f23005c, "Expected '}', but had ',' instead", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (z10) {
            if (this.f23007e == -1) {
                kotlinx.serialization.json.internal.a aVar = this.f23005c;
                int i11 = aVar.f22987a;
                if (zL) {
                    kotlinx.serialization.json.internal.a.y(aVar, "Unexpected trailing comma", i11, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                kotlinx.serialization.json.internal.a aVar2 = this.f23005c;
                boolean z11 = zL;
                int i12 = aVar2.f22987a;
                if (!z11) {
                    kotlinx.serialization.json.internal.a.y(aVar2, "Expected comma after the key-value pair", i12, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        int i13 = this.f23007e + 1;
        this.f23007e = i13;
        return i13;
    }

    public final int O(kotlinx.serialization.descriptors.f fVar) {
        boolean zL;
        boolean zL2 = this.f23005c.L();
        while (this.f23005c.f()) {
            String strP = P();
            this.f23005c.o(':');
            int iD = JsonNamesMapKt.d(fVar, this.f23003a, strP);
            boolean z10 = false;
            if (iD == -3) {
                z10 = true;
                zL = false;
            } else {
                if (!this.f23009g.d() || !L(fVar, iD)) {
                    JsonElementMarker jsonElementMarker = this.f23010h;
                    if (jsonElementMarker != null) {
                        jsonElementMarker.c(iD);
                    }
                    return iD;
                }
                zL = this.f23005c.L();
            }
            zL2 = z10 ? Q(strP) : zL;
        }
        if (zL2) {
            kotlinx.serialization.json.internal.a.y(this.f23005c, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        JsonElementMarker jsonElementMarker2 = this.f23010h;
        if (jsonElementMarker2 != null) {
            return jsonElementMarker2.d();
        }
        return -1;
    }

    public final String P() {
        return this.f23009g.l() ? this.f23005c.t() : this.f23005c.k();
    }

    public final boolean Q(String str) {
        if (this.f23009g.g() || S(this.f23008f, str)) {
            this.f23005c.H(this.f23009g.l());
        } else {
            this.f23005c.A(str);
        }
        return this.f23005c.L();
    }

    public final void R(kotlinx.serialization.descriptors.f fVar) {
        while (o(fVar) != -1) {
        }
    }

    public final boolean S(a aVar, String str) {
        if (aVar == null || !kotlin.jvm.internal.p.a(aVar.f23011a, str)) {
            return false;
        }
        aVar.f23011a = null;
        return true;
    }

    @Override // y9.e, y9.c
    public aa.c a() {
        return this.f23006d;
    }

    @Override // y9.a, y9.e
    public y9.c b(kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        WriteMode writeModeB = m0.b(this.f23003a, descriptor);
        this.f23005c.f22988b.c(descriptor);
        this.f23005c.o(writeModeB.begin);
        K();
        int i10 = b.f23012a[writeModeB.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3) ? new g0(this.f23003a, writeModeB, this.f23005c, descriptor, this.f23008f) : (this.f23004b == writeModeB && this.f23003a.e().f()) ? this : new g0(this.f23003a, writeModeB, this.f23005c, descriptor, this.f23008f);
    }

    @Override // y9.a, y9.c
    public void c(kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        if (this.f23003a.e().g() && descriptor.d() == 0) {
            R(descriptor);
        }
        this.f23005c.o(this.f23004b.end);
        this.f23005c.f22988b.b();
    }

    @Override // z9.e
    public final z9.a d() {
        return this.f23003a;
    }

    @Override // y9.a, y9.e
    public int e(kotlinx.serialization.descriptors.f enumDescriptor) {
        kotlin.jvm.internal.p.e(enumDescriptor, "enumDescriptor");
        return JsonNamesMapKt.e(enumDescriptor, this.f23003a, z(), " at path " + this.f23005c.f22988b.a());
    }

    @Override // z9.e
    public kotlinx.serialization.json.b g() {
        return new JsonTreeReader(this.f23003a.e(), this.f23005c).e();
    }

    @Override // y9.a, y9.e
    public int h() {
        long jP = this.f23005c.p();
        int i10 = (int) jP;
        if (jP == i10) {
            return i10;
        }
        kotlinx.serialization.json.internal.a.y(this.f23005c, "Failed to parse int for input '" + jP + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // y9.a, y9.e
    public Void j() {
        return null;
    }

    @Override // y9.a, y9.e
    public long l() {
        return this.f23005c.p();
    }

    @Override // y9.c
    public int o(kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        int i10 = b.f23012a[this.f23004b.ordinal()];
        int iM = i10 != 2 ? i10 != 4 ? M() : O(descriptor) : N();
        if (this.f23004b != WriteMode.MAP) {
            this.f23005c.f22988b.g(iM);
        }
        return iM;
    }

    @Override // y9.a, y9.e
    public y9.e q(kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        return i0.a(descriptor) ? new r(this.f23005c, this.f23003a) : super.q(descriptor);
    }

    @Override // y9.a, y9.e
    public short s() {
        long jP = this.f23005c.p();
        short s10 = (short) jP;
        if (jP == s10) {
            return s10;
        }
        kotlinx.serialization.json.internal.a.y(this.f23005c, "Failed to parse short for input '" + jP + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // y9.a, y9.e
    public float t() throws NumberFormatException {
        kotlinx.serialization.json.internal.a aVar = this.f23005c;
        String strS = aVar.s();
        try {
            float f10 = Float.parseFloat(strS);
            if (this.f23003a.e().a()) {
                return f10;
            }
            if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
                return f10;
            }
            s.j(this.f23005c, Float.valueOf(f10));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            kotlinx.serialization.json.internal.a.y(aVar, "Failed to parse type 'float' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // y9.a, y9.e
    public double v() throws NumberFormatException {
        kotlinx.serialization.json.internal.a aVar = this.f23005c;
        String strS = aVar.s();
        try {
            double d10 = Double.parseDouble(strS);
            if (this.f23003a.e().a()) {
                return d10;
            }
            if (!Double.isInfinite(d10) && !Double.isNaN(d10)) {
                return d10;
            }
            s.j(this.f23005c, Double.valueOf(d10));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            kotlinx.serialization.json.internal.a.y(aVar, "Failed to parse type 'double' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // y9.a, y9.e
    public boolean w() {
        return this.f23009g.l() ? this.f23005c.i() : this.f23005c.g();
    }

    @Override // y9.a, y9.e
    public char x() {
        String strS = this.f23005c.s();
        if (strS.length() == 1) {
            return strS.charAt(0);
        }
        kotlinx.serialization.json.internal.a.y(this.f23005c, "Expected single char, but got '" + strS + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // y9.a, y9.c
    public Object y(kotlinx.serialization.descriptors.f descriptor, int i10, kotlinx.serialization.a deserializer, Object obj) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        kotlin.jvm.internal.p.e(deserializer, "deserializer");
        boolean z10 = this.f23004b == WriteMode.MAP && (i10 & 1) == 0;
        if (z10) {
            this.f23005c.f22988b.d();
        }
        Object objY = super.y(descriptor, i10, deserializer, obj);
        if (z10) {
            this.f23005c.f22988b.f(objY);
        }
        return objY;
    }

    @Override // y9.a, y9.e
    public String z() {
        return this.f23009g.l() ? this.f23005c.t() : this.f23005c.q();
    }
}
