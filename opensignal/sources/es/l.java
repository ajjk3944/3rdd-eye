package es;

/* loaded from: classes.dex */
public final /* synthetic */ class l extends br.j implements ar.k {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i10, int i11, Object obj) {
        super(i10, obj);
        this.E = i11;
    }

    @Override // br.d
    public final String B() {
        switch (this.E) {
            case 0:
                return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
            case 1:
                return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
            default:
                return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.E) {
            case 0:
                qs.g gVar = (qs.g) obj;
                br.l.e(gVar, "p0");
                return p.v((p) this.f2904d, gVar);
            case 1:
                qs.g gVar2 = (qs.g) obj;
                br.l.e(gVar2, "p0");
                return p.w((p) this.f2904d, gVar2);
            default:
                jt.f fVar = (jt.f) obj;
                br.l.e(fVar, "p0");
                return new ft.g((ft.i) this.f2904d, fVar);
        }
    }

    @Override // br.d, ir.c
    public final String getName() {
        switch (this.E) {
            case 0:
                return "searchMethodsByNameWithoutBuiltinMagic";
            case 1:
                return "searchMethodsInSupertypesWithoutBuiltinMagic";
            default:
                return "<init>";
        }
    }

    @Override // br.d
    public final ir.f z() {
        switch (this.E) {
            case 0:
                return br.x.f2918a.b(p.class);
            case 1:
                return br.x.f2918a.b(p.class);
            default:
                return br.x.f2918a.b(ft.g.class);
        }
    }
}
