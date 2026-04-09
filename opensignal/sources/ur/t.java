package ur;

import ht.s0;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class t implements rr.t {
    public List B;
    public final List D;
    public v E;
    public v F;
    public ht.x G;
    public qs.g H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public mq.w N;
    public sr.h O;
    public boolean P;
    public final LinkedHashMap Q;
    public Boolean R;
    public boolean S;
    public final /* synthetic */ u T;

    /* renamed from: a, reason: collision with root package name */
    public s0 f23666a;

    /* renamed from: d, reason: collision with root package name */
    public rr.l f23667d;

    /* renamed from: g, reason: collision with root package name */
    public rr.z f23668g;

    /* renamed from: r, reason: collision with root package name */
    public as.p f23669r;

    /* renamed from: x, reason: collision with root package name */
    public rr.u f23670x;

    /* renamed from: y, reason: collision with root package name */
    public rr.c f23671y;

    public t(u uVar, s0 s0Var, rr.l lVar, rr.z zVar, as.p pVar, rr.c cVar, List list, List list2, v vVar, ht.x xVar) {
        if (s0Var == null) {
            a(0);
            throw null;
        }
        if (lVar == null) {
            a(1);
            throw null;
        }
        if (zVar == null) {
            a(2);
            throw null;
        }
        if (pVar == null) {
            a(3);
            throw null;
        }
        if (cVar == null) {
            a(4);
            throw null;
        }
        if (list == null) {
            a(5);
            throw null;
        }
        if (list2 == null) {
            a(6);
            throw null;
        }
        if (xVar == null) {
            a(7);
            throw null;
        }
        this.T = uVar;
        this.f23670x = null;
        this.F = uVar.G;
        this.I = true;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = uVar.P;
        this.N = null;
        this.O = null;
        this.P = uVar.Q;
        this.Q = new LinkedHashMap();
        this.R = null;
        this.S = false;
        this.f23666a = s0Var;
        this.f23667d = lVar;
        this.f23668g = zVar;
        this.f23669r = pVar;
        this.f23671y = cVar;
        this.B = list;
        this.D = list2;
        this.E = vVar;
        this.G = xVar;
        this.H = null;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                i11 = 2;
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case 14:
                objArr[0] = "kind";
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "newContextReceiverParameters";
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "newReturnType";
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "owner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 10:
                objArr[0] = "modality";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 17:
                objArr[0] = "name";
                break;
            case 19:
            case 21:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = "type";
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case 35:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case 39:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case 13:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case 16:
                objArr[1] = "setCopyOverrides";
                break;
            case 18:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case 26:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case 28:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case 29:
                objArr[1] = "setOriginal";
                break;
            case 30:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case 32:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case 34:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case 36:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case 38:
                objArr[1] = "setSubstitution";
                break;
            case 40:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case 42:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i10) {
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                objArr[2] = "setOwner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                break;
            case 10:
                objArr[2] = "setModality";
                break;
            case 12:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case 19:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case 35:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case 39:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                throw new IllegalStateException(str2);
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // rr.t
    public final rr.t A() {
        this.M = true;
        return this;
    }

    @Override // rr.t
    public final rr.t C(rr.c cVar) {
        if (cVar != null) {
            this.f23671y = cVar;
            return this;
        }
        a(14);
        throw null;
    }

    @Override // rr.t
    public final rr.t E(v vVar) {
        this.F = vVar;
        return this;
    }

    @Override // rr.t
    public final rr.t G(qs.g gVar) {
        if (gVar != null) {
            this.H = gVar;
            return this;
        }
        a(17);
        throw null;
    }

    @Override // rr.t
    public final rr.t N(rr.l lVar) {
        if (lVar != null) {
            this.f23667d = lVar;
            return this;
        }
        a(8);
        throw null;
    }

    @Override // rr.t
    public final rr.t Q() {
        this.J = true;
        return this;
    }

    @Override // rr.t
    public final rr.u build() {
        return this.T.y1(this);
    }

    @Override // rr.t
    public final rr.t c(List list) {
        this.B = list;
        return this;
    }

    @Override // rr.t
    public final rr.t d(sr.h hVar) {
        if (hVar != null) {
            this.O = hVar;
            return this;
        }
        a(35);
        throw null;
    }

    @Override // rr.t
    public final rr.t i() {
        this.K = true;
        return this;
    }

    @Override // rr.t
    public final rr.t m() {
        this.Q.put(cs.g.f6664d0, Boolean.TRUE);
        return this;
    }

    @Override // rr.t
    public final rr.t n() {
        this.P = true;
        return this;
    }

    @Override // rr.t
    public final rr.t p(ht.x xVar) {
        if (xVar != null) {
            this.G = xVar;
            return this;
        }
        a(23);
        throw null;
    }

    @Override // rr.t
    public final rr.t r() {
        this.I = false;
        return this;
    }

    @Override // rr.t
    public final rr.t t(rr.z zVar) {
        if (zVar != null) {
            this.f23668g = zVar;
            return this;
        }
        a(10);
        throw null;
    }

    @Override // rr.t
    public final rr.t v(as.p pVar) {
        if (pVar != null) {
            this.f23669r = pVar;
            return this;
        }
        a(12);
        throw null;
    }

    @Override // rr.t
    public final rr.t x() {
        this.N = mq.w.f16945a;
        return this;
    }
}
