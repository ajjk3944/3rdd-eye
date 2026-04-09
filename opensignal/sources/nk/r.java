package nk;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class r {
    public final r failOnUnknown() {
        return new p(this, 2);
    }

    public final Object fromJson(String str) throws IOException {
        cv.g gVar = new cv.g();
        gVar.u0(str);
        x xVar = new x(gVar);
        Object objFromJson = fromJson(xVar);
        if (isLenient() || xVar.f0() == v.END_DOCUMENT) {
            return objFromJson;
        }
        throw new bf.n("JSON document was not fully consumed.");
    }

    public abstract Object fromJson(w wVar);

    public final Object fromJsonValue(Object obj) {
        a0 a0Var = new a0();
        int[] iArr = a0Var.f18448d;
        int i10 = a0Var.f18447a;
        iArr[i10] = 7;
        Object[] objArr = new Object[32];
        a0Var.B = objArr;
        a0Var.f18447a = i10 + 1;
        objArr[i10] = obj;
        try {
            return fromJson(a0Var);
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public r indent(String str) {
        if (str != null) {
            return new g(this, str);
        }
        throw new NullPointerException("indent == null");
    }

    public boolean isLenient() {
        return false;
    }

    public final r lenient() {
        return new p(this, 1);
    }

    public final r nonNull() {
        return this instanceof ok.a ? this : new ok.a(this);
    }

    public final r nullSafe() {
        return this instanceof ok.b ? this : new ok.b(this);
    }

    public final r serializeNulls() {
        return new p(this, 0);
    }

    public final String toJson(Object obj) {
        cv.g gVar = new cv.g();
        try {
            toJson(gVar, obj);
            return gVar.Y();
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public abstract void toJson(c0 c0Var, Object obj);

    public final Object toJsonValue(Object obj) {
        b0 b0Var = new b0();
        b0Var.F = new Object[32];
        b0Var.R(6);
        try {
            toJson(b0Var, obj);
            int i10 = b0Var.f18353a;
            if (i10 > 1 || (i10 == 1 && b0Var.f18354d[i10 - 1] != 7)) {
                throw new IllegalStateException("Incomplete document");
            }
            return b0Var.F[0];
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public final void toJson(cv.h hVar, Object obj) throws IOException {
        toJson(new y(hVar), obj);
    }

    public final Object fromJson(cv.i iVar) throws IOException {
        return fromJson(new x(iVar));
    }
}
