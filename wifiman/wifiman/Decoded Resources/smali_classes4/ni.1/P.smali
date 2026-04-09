.class public final Lni/P;
.super LDh/g;
.source "SourceFile"

# interfaces
.implements Lni/t;


# instance fields
.field private final k:LUh/r;

.field private final l:LWh/c;

.field private final m:LWh/g;

.field private final n:LWh/h;

.field private final o:Lni/s;

.field private p:Lpi/d0;

.field private q:Lpi/d0;

.field private r:Ljava/util/List;

.field private s:Lpi/d0;


# direct methods
.method public constructor <init>(Loi/n;LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/u;LUh/r;LWh/c;LWh/g;LWh/h;Lni/s;)V
    .locals 12

    move-object v7, p0

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    const-string v0, "storageManager"

    move-object v1, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    move-object v2, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    move-object v3, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v4, p4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "visibility"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versionRequirementTable"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, LBh/g0;->a:LBh/g0;

    const-string v0, "NO_SOURCE"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, LDh/g;-><init>(Loi/n;LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/g0;LBh/u;)V

    iput-object v8, v7, Lni/P;->k:LUh/r;

    iput-object v9, v7, Lni/P;->l:LWh/c;

    iput-object v10, v7, Lni/P;->m:LWh/g;

    iput-object v11, v7, Lni/P;->n:LWh/h;

    move-object/from16 v0, p10

    iput-object v0, v7, Lni/P;->o:Lni/s;

    return-void
.end method


# virtual methods
.method public bridge synthetic F()Lkotlin/reflect/jvm/internal/impl/protobuf/n;
    .locals 1

    invoke-virtual {p0}, Lni/P;->U0()LUh/r;

    move-result-object v0

    return-object v0
.end method

.method public R()LWh/g;
    .locals 1

    iget-object v0, p0, Lni/P;->m:LWh/g;

    return-object v0
.end method

.method protected R0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lni/P;->r:Ljava/util/List;

    if-nez v0, :cond_0

    const-string v0, "typeConstructorParameters"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public U()Lpi/d0;
    .locals 1

    iget-object v0, p0, Lni/P;->q:Lpi/d0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "expandedType"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public U0()LUh/r;
    .locals 1

    iget-object v0, p0, Lni/P;->k:LUh/r;

    return-object v0
.end method

.method public V0()LWh/h;
    .locals 1

    iget-object v0, p0, Lni/P;->n:LWh/h;

    return-object v0
.end method

.method public final W0(Ljava/util/List;Lpi/d0;Lpi/d0;)V
    .locals 1

    const-string v0, "declaredTypeParameters"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "underlyingType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expandedType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LDh/g;->S0(Ljava/util/List;)V

    iput-object p2, p0, Lni/P;->p:Lpi/d0;

    iput-object p3, p0, Lni/P;->q:Lpi/d0;

    invoke-static {p0}, LBh/p0;->g(LBh/i;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lni/P;->r:Ljava/util/List;

    invoke-virtual {p0}, LDh/g;->M0()Lpi/d0;

    move-result-object p1

    iput-object p1, p0, Lni/P;->s:Lpi/d0;

    return-void
.end method

.method public X()LWh/c;
    .locals 1

    iget-object v0, p0, Lni/P;->l:LWh/c;

    return-object v0
.end method

.method public X0(Lpi/G0;)LBh/k0;
    .locals 12

    const-string v0, "substitutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lpi/G0;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lni/P;

    invoke-virtual {p0}, LDh/g;->g0()Loi/n;

    move-result-object v2

    invoke-virtual {p0}, LDh/n;->b()LBh/m;

    move-result-object v3

    const-string v1, "getContainingDeclaration(...)"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/b;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v4

    const-string v1, "<get-annotations>(...)"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LDh/m;->getName()LZh/f;

    move-result-object v5

    const-string v1, "getName(...)"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LDh/g;->getVisibility()LBh/u;

    move-result-object v6

    invoke-virtual {p0}, Lni/P;->U0()LUh/r;

    move-result-object v7

    invoke-virtual {p0}, Lni/P;->X()LWh/c;

    move-result-object v8

    invoke-virtual {p0}, Lni/P;->R()LWh/g;

    move-result-object v9

    invoke-virtual {p0}, Lni/P;->V0()LWh/h;

    move-result-object v10

    invoke-virtual {p0}, Lni/P;->Z()Lni/s;

    move-result-object v11

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Lni/P;-><init>(Loi/n;LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/u;LUh/r;LWh/c;LWh/g;LWh/h;Lni/s;)V

    invoke-virtual {p0}, LDh/g;->w()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lni/P;->f0()Lpi/d0;

    move-result-object v2

    sget-object v3, Lpi/N0;->INVARIANT:Lpi/N0;

    invoke-virtual {p1, v2, v3}, Lpi/G0;->n(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object v2

    const-string v4, "safeSubstitute(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lpi/F0;->a(Lpi/S;)Lpi/d0;

    move-result-object v2

    invoke-virtual {p0}, Lni/P;->U()Lpi/d0;

    move-result-object v5

    invoke-virtual {p1, v5, v3}, Lpi/G0;->n(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lpi/F0;->a(Lpi/S;)Lpi/d0;

    move-result-object p1

    invoke-virtual {v0, v1, v2, p1}, Lni/P;->W0(Ljava/util/List;Lpi/d0;Lpi/d0;)V

    return-object v0
.end method

.method public Z()Lni/s;
    .locals 1

    iget-object v0, p0, Lni/P;->o:Lni/s;

    return-object v0
.end method

.method public bridge synthetic c(Lpi/G0;)LBh/n;
    .locals 0

    invoke-virtual {p0, p1}, Lni/P;->X0(Lpi/G0;)LBh/k0;

    move-result-object p1

    return-object p1
.end method

.method public f0()Lpi/d0;
    .locals 1

    iget-object v0, p0, Lni/P;->p:Lpi/d0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "underlyingType"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public t()LBh/e;
    .locals 3

    invoke-virtual {p0}, Lni/P;->U()Lpi/d0;

    move-result-object v0

    invoke-static {v0}, Lpi/W;->a(Lpi/S;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lni/P;->U()Lpi/d0;

    move-result-object v0

    invoke-virtual {v0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v0

    invoke-interface {v0}, Lpi/v0;->c()LBh/h;

    move-result-object v0

    instance-of v2, v0, LBh/e;

    if-eqz v2, :cond_1

    move-object v1, v0

    check-cast v1, LBh/e;

    :cond_1
    :goto_0
    return-object v1
.end method

.method public u()Lpi/d0;
    .locals 1

    iget-object v0, p0, Lni/P;->s:Lpi/d0;

    if-nez v0, :cond_0

    const-string v0, "defaultTypeImpl"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method
