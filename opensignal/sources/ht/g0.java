package ht;

/* loaded from: classes.dex */
public final class g0 extends p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10902a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10903b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10904c;

    public g0(x xVar, d1 d1Var) {
        if (d1Var == null) {
            e(0);
            throw null;
        }
        if (xVar == null) {
            e(1);
            throw null;
        }
        this.f10903b = d1Var;
        this.f10904c = xVar;
    }

    public static /* synthetic */ void e(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i10 == 3) {
            objArr[2] = "replaceType";
        } else if (i10 != 4 && i10 != 5) {
            if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // ht.p0
    public final d1 a() {
        switch (this.f10902a) {
            case 0:
                return d1.OUT_VARIANCE;
            default:
                d1 d1Var = (d1) this.f10903b;
                if (d1Var != null) {
                    return d1Var;
                }
                e(4);
                throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lq.h] */
    @Override // ht.p0
    public final x b() {
        switch (this.f10902a) {
            case 0:
                return (x) this.f10904c.getValue();
            default:
                x xVar = (x) this.f10904c;
                if (xVar != null) {
                    return xVar;
                }
                e(5);
                throw null;
        }
    }

    @Override // ht.p0
    public final boolean c() {
        switch (this.f10902a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // ht.p0
    public final p0 d(jt.f fVar) {
        switch (this.f10902a) {
            case 0:
                br.l.e(fVar, "kotlinTypeRefiner");
                return this;
            default:
                if (fVar == null) {
                    e(6);
                    throw null;
                }
                d1 d1Var = (d1) this.f10903b;
                x xVar = (x) this.f10904c;
                fVar.getClass();
                br.l.e(xVar, "type");
                return new g0(xVar, d1Var);
        }
    }

    public g0(rr.r0 r0Var) {
        br.l.e(r0Var, "typeParameter");
        this.f10903b = r0Var;
        this.f10904c = kc.f.E(lq.j.PUBLICATION, new g(1, this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g0(x xVar) {
        this(xVar, d1.INVARIANT);
        if (xVar != null) {
        } else {
            e(2);
            throw null;
        }
    }
}
