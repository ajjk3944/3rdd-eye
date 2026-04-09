package nk;

/* loaded from: classes.dex */
public final class p extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18435a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f18436b;

    public /* synthetic */ p(r rVar, int i10) {
        this.f18435a = i10;
        this.f18436b = rVar;
    }

    @Override // nk.r
    public final Object fromJson(w wVar) {
        switch (this.f18435a) {
            case 0:
                return this.f18436b.fromJson(wVar);
            case 1:
                boolean z10 = wVar.f18451x;
                wVar.f18451x = true;
                try {
                    return this.f18436b.fromJson(wVar);
                } finally {
                    wVar.f18451x = z10;
                }
            default:
                boolean z11 = wVar.f18452y;
                wVar.f18452y = true;
                try {
                    return this.f18436b.fromJson(wVar);
                } finally {
                    wVar.f18452y = z11;
                }
        }
    }

    @Override // nk.r
    public final boolean isLenient() {
        switch (this.f18435a) {
        }
        return this.f18436b.isLenient();
    }

    @Override // nk.r
    public final void toJson(c0 c0Var, Object obj) {
        switch (this.f18435a) {
            case 0:
                boolean z10 = c0Var.B;
                c0Var.B = true;
                try {
                    this.f18436b.toJson(c0Var, obj);
                    return;
                } finally {
                    c0Var.B = z10;
                }
            case 1:
                boolean z11 = c0Var.f18358y;
                c0Var.f18358y = true;
                try {
                    this.f18436b.toJson(c0Var, obj);
                    return;
                } finally {
                    c0Var.f18358y = z11;
                }
            default:
                this.f18436b.toJson(c0Var, obj);
                return;
        }
    }

    public final String toString() {
        switch (this.f18435a) {
            case 0:
                return this.f18436b + ".serializeNulls()";
            case 1:
                return this.f18436b + ".lenient()";
            default:
                return this.f18436b + ".failOnUnknown()";
        }
    }
}
