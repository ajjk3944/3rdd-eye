.class public abstract LDh/s;
.super LDh/n;
.source "SourceFile"

# interfaces
.implements LBh/z;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LDh/s$c;
    }
.end annotation


# instance fields
.field private final A:LBh/z;

.field private final B:LBh/b$a;

.field private C:LBh/z;

.field protected D:Ljava/util/Map;

.field private e:Ljava/util/List;

.field private f:Ljava/util/List;

.field private g:Lpi/S;

.field private h:Ljava/util/List;

.field private i:LBh/b0;

.field private j:LBh/b0;

.field private k:LBh/D;

.field private l:LBh/u;

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:Z

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:Ljava/util/Collection;

.field private volatile z:Lmh/a;


# direct methods
.method protected constructor <init>(LBh/m;LBh/z;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/b$a;LBh/g0;)V
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-static {v0}, LDh/s;->I(I)V

    :cond_0
    const/4 v1, 0x1

    if-nez p3, :cond_1

    invoke-static {v1}, LDh/s;->I(I)V

    :cond_1
    if-nez p4, :cond_2

    const/4 v2, 0x2

    invoke-static {v2}, LDh/s;->I(I)V

    :cond_2
    if-nez p5, :cond_3

    const/4 v2, 0x3

    invoke-static {v2}, LDh/s;->I(I)V

    :cond_3
    if-nez p6, :cond_4

    const/4 v2, 0x4

    invoke-static {v2}, LDh/s;->I(I)V

    :cond_4
    invoke-direct {p0, p1, p3, p4, p6}, LDh/n;-><init>(LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/g0;)V

    sget-object p1, LBh/t;->i:LBh/u;

    iput-object p1, p0, LDh/s;->l:LBh/u;

    iput-boolean v0, p0, LDh/s;->m:Z

    iput-boolean v0, p0, LDh/s;->n:Z

    iput-boolean v0, p0, LDh/s;->o:Z

    iput-boolean v0, p0, LDh/s;->p:Z

    iput-boolean v0, p0, LDh/s;->q:Z

    iput-boolean v0, p0, LDh/s;->r:Z

    iput-boolean v0, p0, LDh/s;->s:Z

    iput-boolean v0, p0, LDh/s;->t:Z

    iput-boolean v0, p0, LDh/s;->u:Z

    iput-boolean v0, p0, LDh/s;->v:Z

    iput-boolean v1, p0, LDh/s;->w:Z

    iput-boolean v0, p0, LDh/s;->x:Z

    const/4 p1, 0x0

    iput-object p1, p0, LDh/s;->y:Ljava/util/Collection;

    iput-object p1, p0, LDh/s;->z:Lmh/a;

    iput-object p1, p0, LDh/s;->C:LBh/z;

    iput-object p1, p0, LDh/s;->D:Ljava/util/Map;

    if-nez p2, :cond_5

    move-object p2, p0

    :cond_5
    iput-object p2, p0, LDh/s;->A:LBh/z;

    iput-object p5, p0, LDh/s;->B:LBh/b$a;

    return-void
.end method

.method static synthetic G0(LDh/s;)LBh/b0;
    .locals 0

    iget-object p0, p0, LDh/s;->j:LBh/b0;

    return-object p0
.end method

.method private static synthetic I(I)V
    .locals 7

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :pswitch_1
    const-string v0, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v1, 0x2

    packed-switch p0, :pswitch_data_1

    :pswitch_2
    const/4 v2, 0x3

    goto :goto_1

    :pswitch_3
    move v2, v1

    :goto_1
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl"

    const/4 v4, 0x0

    packed-switch p0, :pswitch_data_2

    const-string v5, "containingDeclaration"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_4
    const-string v5, "configuration"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_5
    const-string v5, "substitutor"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_6
    const-string v5, "originalSubstitutor"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_7
    const-string v5, "overriddenDescriptors"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_8
    const-string v5, "extensionReceiverParameter"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_9
    const-string v5, "unsubstitutedReturnType"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_a
    aput-object v3, v2, v4

    goto :goto_2

    :pswitch_b
    const-string v5, "visibility"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_c
    const-string v5, "unsubstitutedValueParameters"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_d
    const-string v5, "typeParameters"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_e
    const-string v5, "contextReceiverParameters"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_f
    const-string v5, "source"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_10
    const-string v5, "kind"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_11
    const-string v5, "name"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_12
    const-string v5, "annotations"

    aput-object v5, v2, v4

    :goto_2
    const-string v4, "initialize"

    const-string v5, "newCopyBuilder"

    const/4 v6, 0x1

    packed-switch p0, :pswitch_data_3

    :pswitch_13
    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_14
    const-string v3, "getSourceToUseForCopy"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_15
    const-string v3, "copy"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_16
    aput-object v5, v2, v6

    goto :goto_3

    :pswitch_17
    const-string v3, "getKind"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_18
    const-string v3, "getOriginal"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_19
    const-string v3, "getValueParameters"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_1a
    const-string v3, "getTypeParameters"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_1b
    const-string v3, "getVisibility"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_1c
    const-string v3, "getModality"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_1d
    const-string v3, "getOverriddenDescriptors"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_1e
    const-string v3, "getContextReceiverParameters"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_1f
    aput-object v4, v2, v6

    :goto_3
    packed-switch p0, :pswitch_data_4

    const-string v3, "<init>"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_20
    const-string v3, "getSubstitutedValueParameters"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_21
    const-string v3, "doSubstitute"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_22
    aput-object v5, v2, v1

    goto :goto_4

    :pswitch_23
    const-string v3, "substitute"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_24
    const-string v3, "setOverriddenDescriptors"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_25
    const-string v3, "setExtensionReceiverParameter"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_26
    const-string v3, "setReturnType"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_27
    const-string v3, "setVisibility"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_28
    aput-object v4, v2, v1

    :goto_4
    :pswitch_29
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    packed-switch p0, :pswitch_data_5

    :pswitch_2a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :pswitch_2b
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x9
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_b
        :pswitch_9
        :pswitch_8
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_7
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_6
        :pswitch_a
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_a
        :pswitch_c
        :pswitch_5
        :pswitch_c
        :pswitch_5
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x9
        :pswitch_1f
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_13
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_13
        :pswitch_16
        :pswitch_13
        :pswitch_13
        :pswitch_15
        :pswitch_14
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x5
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_29
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_29
        :pswitch_29
        :pswitch_29
        :pswitch_29
        :pswitch_24
        :pswitch_29
        :pswitch_29
        :pswitch_29
        :pswitch_29
        :pswitch_23
        :pswitch_29
        :pswitch_22
        :pswitch_21
        :pswitch_29
        :pswitch_29
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x9
        :pswitch_2b
        :pswitch_2a
        :pswitch_2a
        :pswitch_2a
        :pswitch_2b
        :pswitch_2b
        :pswitch_2b
        :pswitch_2b
        :pswitch_2a
        :pswitch_2b
        :pswitch_2b
        :pswitch_2b
        :pswitch_2b
        :pswitch_2a
        :pswitch_2b
        :pswitch_2a
        :pswitch_2a
        :pswitch_2b
        :pswitch_2b
    .end packed-switch
.end method

.method private N0(ZLBh/z;)LBh/g0;
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LDh/s;->a()LBh/z;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, LBh/p;->j()LBh/g0;

    move-result-object p1

    goto :goto_1

    :cond_1
    sget-object p1, LBh/g0;->a:LBh/g0;

    :goto_1
    if-nez p1, :cond_2

    const/16 p2, 0x1b

    invoke-static {p2}, LDh/s;->I(I)V

    :cond_2
    return-object p1
.end method

.method public static O0(LBh/z;Ljava/util/List;Lpi/G0;)Ljava/util/List;
    .locals 7

    if-nez p1, :cond_0

    const/16 v0, 0x1c

    invoke-static {v0}, LDh/s;->I(I)V

    :cond_0
    if-nez p2, :cond_1

    const/16 v0, 0x1d

    invoke-static {v0}, LDh/s;->I(I)V

    :cond_1
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, LDh/s;->P0(LBh/z;Ljava/util/List;Lpi/G0;ZZ[Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static P0(LBh/z;Ljava/util/List;Lpi/G0;ZZ[Z)Ljava/util/List;
    .locals 18

    move-object/from16 v0, p2

    if-nez p1, :cond_0

    const/16 v1, 0x1e

    invoke-static {v1}, LDh/s;->I(I)V

    :cond_0
    if-nez v0, :cond_1

    const/16 v1, 0x1f

    invoke-static {v1}, LDh/s;->I(I)V

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LBh/s0;

    invoke-interface {v3}, LBh/r0;->getType()Lpi/S;

    move-result-object v4

    sget-object v5, Lpi/N0;->IN_VARIANCE:Lpi/N0;

    invoke-virtual {v0, v4, v5}, Lpi/G0;->p(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object v11

    invoke-interface {v3}, LBh/s0;->j0()Lpi/S;

    move-result-object v4

    const/4 v6, 0x0

    if-nez v4, :cond_2

    move-object v15, v6

    goto :goto_1

    :cond_2
    invoke-virtual {v0, v4, v5}, Lpi/G0;->p(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object v5

    move-object v15, v5

    :goto_1
    if-nez v11, :cond_3

    return-object v6

    :cond_3
    invoke-interface {v3}, LBh/r0;->getType()Lpi/S;

    move-result-object v5

    if-ne v11, v5, :cond_4

    if-eq v4, v15, :cond_5

    :cond_4
    if-eqz p5, :cond_5

    const/4 v4, 0x0

    const/4 v5, 0x1

    aput-boolean v5, p5, v4

    :cond_5
    instance-of v4, v3, LDh/V$b;

    if-eqz v4, :cond_6

    move-object v4, v3

    check-cast v4, LDh/V$b;

    invoke-virtual {v4}, LDh/V$b;->P0()Ljava/util/List;

    move-result-object v4

    new-instance v5, LDh/s$b;

    invoke-direct {v5, v4}, LDh/s$b;-><init>(Ljava/util/List;)V

    move-object/from16 v17, v5

    goto :goto_2

    :cond_6
    move-object/from16 v17, v6

    :goto_2
    if-eqz p3, :cond_7

    move-object v7, v6

    goto :goto_3

    :cond_7
    move-object v7, v3

    :goto_3
    invoke-interface {v3}, LBh/s0;->getIndex()I

    move-result v8

    invoke-interface {v3}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v9

    invoke-interface {v3}, LBh/I;->getName()LZh/f;

    move-result-object v10

    invoke-interface {v3}, LBh/s0;->s0()Z

    move-result v12

    invoke-interface {v3}, LBh/s0;->Y()Z

    move-result v13

    invoke-interface {v3}, LBh/s0;->W()Z

    move-result v14

    if-eqz p4, :cond_8

    invoke-interface {v3}, LBh/p;->j()LBh/g0;

    move-result-object v3

    :goto_4
    move-object/from16 v16, v3

    goto :goto_5

    :cond_8
    sget-object v3, LBh/g0;->a:LBh/g0;

    goto :goto_4

    :goto_5
    move-object/from16 v6, p0

    invoke-static/range {v6 .. v17}, LDh/V;->K0(LBh/a;LBh/s0;ILkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;Lpi/S;ZZZLpi/S;LBh/g0;Lmh/a;)LDh/V;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_9
    return-object v1
.end method

.method private T0()V
    .locals 1

    iget-object v0, p0, LDh/s;->z:Lmh/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    iput-object v0, p0, LDh/s;->y:Ljava/util/Collection;

    const/4 v0, 0x0

    iput-object v0, p0, LDh/s;->z:Lmh/a;

    :cond_0
    return-void
.end method

.method private a1(Z)V
    .locals 0

    iput-boolean p1, p0, LDh/s;->u:Z

    return-void
.end method

.method private b1(Z)V
    .locals 0

    iput-boolean p1, p0, LDh/s;->t:Z

    return-void
.end method

.method private d1(LBh/z;)V
    .locals 0

    iput-object p1, p0, LDh/s;->C:LBh/z;

    return-void
.end method


# virtual methods
.method public D0()Z
    .locals 1

    iget-boolean v0, p0, LDh/s;->u:Z

    return v0
.end method

.method public F0()Z
    .locals 1

    iget-boolean v0, p0, LDh/s;->s:Z

    return v0
.end method

.method public H()Z
    .locals 1

    iget-boolean v0, p0, LDh/s;->x:Z

    return v0
.end method

.method public K0(LBh/m;LBh/D;LBh/u;LBh/b$a;Z)LBh/z;
    .locals 1

    invoke-virtual {p0}, LDh/s;->v()LBh/z$a;

    move-result-object v0

    invoke-interface {v0, p1}, LBh/z$a;->p(LBh/m;)LBh/z$a;

    move-result-object p1

    invoke-interface {p1, p2}, LBh/z$a;->h(LBh/D;)LBh/z$a;

    move-result-object p1

    invoke-interface {p1, p3}, LBh/z$a;->f(LBh/u;)LBh/z$a;

    move-result-object p1

    invoke-interface {p1, p4}, LBh/z$a;->s(LBh/b$a;)LBh/z$a;

    move-result-object p1

    invoke-interface {p1, p5}, LBh/z$a;->m(Z)LBh/z$a;

    move-result-object p1

    invoke-interface {p1}, LBh/z$a;->a()LBh/z;

    move-result-object p1

    if-nez p1, :cond_0

    const/16 p2, 0x1a

    invoke-static {p2}, LDh/s;->I(I)V

    :cond_0
    return-object p1
.end method

.method public L()Z
    .locals 1

    iget-boolean v0, p0, LDh/s;->r:Z

    return v0
.end method

.method protected abstract L0(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)LDh/s;
.end method

.method protected M0(LDh/s$c;)LBh/z;
    .locals 20

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    if-nez v8, :cond_0

    const/16 v0, 0x19

    invoke-static {v0}, LDh/s;->I(I)V

    :cond_0
    const/4 v9, 0x1

    new-array v10, v9, [Z

    invoke-static/range {p1 .. p1}, LDh/s$c;->w(LDh/s$c;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/b;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    invoke-static/range {p1 .. p1}, LDh/s$c;->w(LDh/s$c;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/j;->a(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/b;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    goto :goto_0

    :goto_1
    iget-object v1, v8, LDh/s$c;->b:LBh/m;

    iget-object v2, v8, LDh/s$c;->e:LBh/z;

    iget-object v3, v8, LDh/s$c;->f:LBh/b$a;

    iget-object v4, v8, LDh/s$c;->l:LZh/f;

    iget-boolean v0, v8, LDh/s$c;->o:Z

    invoke-direct {v7, v0, v2}, LDh/s;->N0(ZLBh/z;)LBh/g0;

    move-result-object v6

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v6}, LDh/s;->L0(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)LDh/s;

    move-result-object v6

    invoke-static/range {p1 .. p1}, LDh/s$c;->x(LDh/s$c;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual/range {p0 .. p0}, LDh/s;->getTypeParameters()Ljava/util/List;

    move-result-object v0

    goto :goto_2

    :cond_2
    invoke-static/range {p1 .. p1}, LDh/s$c;->x(LDh/s$c;)Ljava/util/List;

    move-result-object v0

    :goto_2
    const/4 v11, 0x0

    aget-boolean v1, v10, v11

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v9

    or-int/2addr v1, v2

    aput-boolean v1, v10, v11

    new-instance v15, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v15, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, v8, LDh/s$c;->a:Lpi/E0;

    invoke-static {v0, v1, v6, v15, v10}, Lpi/C;->c(Ljava/util/List;Lpi/E0;LBh/m;Ljava/util/List;[Z)Lpi/G0;

    move-result-object v14

    const/4 v12, 0x0

    if-nez v14, :cond_3

    return-object v12

    :cond_3
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, v8, LDh/s$c;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, v8, LDh/s$c;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v1, v11

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/b0;

    invoke-interface {v2}, LBh/r0;->getType()Lpi/S;

    move-result-object v3

    sget-object v4, Lpi/N0;->IN_VARIANCE:Lpi/N0;

    invoke-virtual {v14, v3, v4}, Lpi/G0;->p(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object v3

    if-nez v3, :cond_4

    return-object v12

    :cond_4
    invoke-interface {v2}, LBh/b0;->getValue()Lji/g;

    move-result-object v4

    check-cast v4, Lji/f;

    invoke-interface {v4}, Lji/f;->a()LZh/f;

    move-result-object v4

    invoke-interface {v2}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v5

    add-int/lit8 v16, v1, 0x1

    invoke-static {v6, v3, v4, v5, v1}, Lbi/h;->b(LBh/a;Lpi/S;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;I)LBh/b0;

    move-result-object v1

    invoke-interface {v13, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    aget-boolean v1, v10, v11

    invoke-interface {v2}, LBh/r0;->getType()Lpi/S;

    move-result-object v2

    if-eq v3, v2, :cond_5

    move v2, v9

    goto :goto_4

    :cond_5
    move v2, v11

    :goto_4
    or-int/2addr v1, v2

    aput-boolean v1, v10, v11

    move/from16 v1, v16

    goto :goto_3

    :cond_6
    iget-object v0, v8, LDh/s$c;->i:LBh/b0;

    if-eqz v0, :cond_9

    invoke-interface {v0}, LBh/r0;->getType()Lpi/S;

    move-result-object v0

    sget-object v1, Lpi/N0;->IN_VARIANCE:Lpi/N0;

    invoke-virtual {v14, v0, v1}, Lpi/G0;->p(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object v0

    if-nez v0, :cond_7

    return-object v12

    :cond_7
    new-instance v1, LDh/N;

    new-instance v2, Lji/d;

    iget-object v3, v8, LDh/s$c;->i:LBh/b0;

    invoke-interface {v3}, LBh/b0;->getValue()Lji/g;

    move-result-object v3

    invoke-direct {v2, v6, v0, v3}, Lji/d;-><init>(LBh/a;Lpi/S;Lji/g;)V

    iget-object v3, v8, LDh/s$c;->i:LBh/b0;

    invoke-interface {v3}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v3

    invoke-direct {v1, v6, v2, v3}, LDh/N;-><init>(LBh/m;Lji/g;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)V

    aget-boolean v2, v10, v11

    iget-object v3, v8, LDh/s$c;->i:LBh/b0;

    invoke-interface {v3}, LBh/r0;->getType()Lpi/S;

    move-result-object v3

    if-eq v0, v3, :cond_8

    move v0, v9

    goto :goto_5

    :cond_8
    move v0, v11

    :goto_5
    or-int/2addr v0, v2

    aput-boolean v0, v10, v11

    move-object/from16 v16, v1

    goto :goto_6

    :cond_9
    move-object/from16 v16, v12

    :goto_6
    iget-object v0, v8, LDh/s$c;->j:LBh/b0;

    if-eqz v0, :cond_c

    invoke-interface {v0, v14}, LBh/b0;->c(Lpi/G0;)LBh/b0;

    move-result-object v0

    if-nez v0, :cond_a

    return-object v12

    :cond_a
    aget-boolean v1, v10, v11

    iget-object v2, v8, LDh/s$c;->j:LBh/b0;

    if-eq v0, v2, :cond_b

    move v2, v9

    goto :goto_7

    :cond_b
    move v2, v11

    :goto_7
    or-int/2addr v1, v2

    aput-boolean v1, v10, v11

    move-object/from16 v17, v0

    goto :goto_8

    :cond_c
    move-object/from16 v17, v12

    :goto_8
    iget-object v1, v8, LDh/s$c;->g:Ljava/util/List;

    iget-boolean v3, v8, LDh/s$c;->p:Z

    iget-boolean v4, v8, LDh/s$c;->o:Z

    move-object v0, v6

    move-object v2, v14

    move-object v5, v10

    invoke-static/range {v0 .. v5}, LDh/s;->P0(LBh/z;Ljava/util/List;Lpi/G0;ZZ[Z)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_d

    return-object v12

    :cond_d
    iget-object v1, v8, LDh/s$c;->k:Lpi/S;

    sget-object v2, Lpi/N0;->OUT_VARIANCE:Lpi/N0;

    invoke-virtual {v14, v1, v2}, Lpi/G0;->p(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object v1

    if-nez v1, :cond_e

    return-object v12

    :cond_e
    aget-boolean v2, v10, v11

    iget-object v3, v8, LDh/s$c;->k:Lpi/S;

    if-eq v1, v3, :cond_f

    move v3, v9

    goto :goto_9

    :cond_f
    move v3, v11

    :goto_9
    or-int/2addr v2, v3

    aput-boolean v2, v10, v11

    if-nez v2, :cond_10

    iget-boolean v2, v8, LDh/s$c;->w:Z

    if-eqz v2, :cond_10

    return-object v7

    :cond_10
    iget-object v2, v8, LDh/s$c;->c:LBh/D;

    iget-object v3, v8, LDh/s$c;->d:LBh/u;

    move-object v11, v6

    move-object/from16 v12, v16

    move-object v4, v13

    move-object/from16 v13, v17

    move-object v5, v14

    move-object v14, v4

    move-object/from16 v16, v0

    move-object/from16 v17, v1

    move-object/from16 v18, v2

    move-object/from16 v19, v3

    invoke-virtual/range {v11 .. v19}, LDh/s;->R0(LBh/b0;LBh/b0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;LBh/D;LBh/u;)LDh/s;

    iget-boolean v0, v7, LDh/s;->m:Z

    invoke-virtual {v6, v0}, LDh/s;->f1(Z)V

    iget-boolean v0, v7, LDh/s;->n:Z

    invoke-virtual {v6, v0}, LDh/s;->c1(Z)V

    iget-boolean v0, v7, LDh/s;->o:Z

    invoke-virtual {v6, v0}, LDh/s;->X0(Z)V

    iget-boolean v0, v7, LDh/s;->p:Z

    invoke-virtual {v6, v0}, LDh/s;->e1(Z)V

    iget-boolean v0, v7, LDh/s;->q:Z

    invoke-virtual {v6, v0}, LDh/s;->i1(Z)V

    iget-boolean v0, v7, LDh/s;->v:Z

    invoke-virtual {v6, v0}, LDh/s;->h1(Z)V

    iget-boolean v0, v7, LDh/s;->r:Z

    invoke-virtual {v6, v0}, LDh/s;->W0(Z)V

    iget-boolean v0, v7, LDh/s;->s:Z

    invoke-virtual {v6, v0}, LDh/s;->V0(Z)V

    iget-boolean v0, v7, LDh/s;->w:Z

    invoke-virtual {v6, v0}, LDh/s;->Y0(Z)V

    invoke-static/range {p1 .. p1}, LDh/s$c;->y(LDh/s$c;)Z

    move-result v0

    invoke-direct {v6, v0}, LDh/s;->b1(Z)V

    invoke-static/range {p1 .. p1}, LDh/s$c;->z(LDh/s$c;)Z

    move-result v0

    invoke-direct {v6, v0}, LDh/s;->a1(Z)V

    invoke-static/range {p1 .. p1}, LDh/s$c;->A(LDh/s$c;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-static/range {p1 .. p1}, LDh/s$c;->A(LDh/s$c;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_a

    :cond_11
    iget-boolean v0, v7, LDh/s;->x:Z

    :goto_a
    invoke-virtual {v6, v0}, LDh/s;->Z0(Z)V

    invoke-static/range {p1 .. p1}, LDh/s$c;->B(LDh/s$c;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object v0, v7, LDh/s;->D:Ljava/util/Map;

    if-eqz v0, :cond_16

    :cond_12
    invoke-static/range {p1 .. p1}, LDh/s$c;->B(LDh/s$c;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, v7, LDh/s;->D:Ljava/util/Map;

    if-eqz v1, :cond_14

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_13
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    :cond_14
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    if-ne v1, v9, :cond_15

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, v6, LDh/s;->D:Ljava/util/Map;

    goto :goto_c

    :cond_15
    iput-object v0, v6, LDh/s;->D:Ljava/util/Map;

    :cond_16
    :goto_c
    iget-boolean v0, v8, LDh/s$c;->n:Z

    if-nez v0, :cond_17

    invoke-virtual/range {p0 .. p0}, LDh/s;->a0()LBh/z;

    move-result-object v0

    if-eqz v0, :cond_19

    :cond_17
    invoke-virtual/range {p0 .. p0}, LDh/s;->a0()LBh/z;

    move-result-object v0

    if-eqz v0, :cond_18

    invoke-virtual/range {p0 .. p0}, LDh/s;->a0()LBh/z;

    move-result-object v0

    goto :goto_d

    :cond_18
    move-object v0, v7

    :goto_d
    invoke-interface {v0, v5}, LBh/z;->c(Lpi/G0;)LBh/z;

    move-result-object v0

    invoke-direct {v6, v0}, LDh/s;->d1(LBh/z;)V

    :cond_19
    iget-boolean v0, v8, LDh/s$c;->m:Z

    if-eqz v0, :cond_1c

    invoke-virtual/range {p0 .. p0}, LDh/s;->a()LBh/z;

    move-result-object v0

    invoke-interface {v0}, LBh/z;->f()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1c

    iget-object v0, v8, LDh/s$c;->a:Lpi/E0;

    invoke-virtual {v0}, Lpi/E0;->f()Z

    move-result v0

    if-eqz v0, :cond_1b

    iget-object v0, v7, LDh/s;->z:Lmh/a;

    if-eqz v0, :cond_1a

    iput-object v0, v6, LDh/s;->z:Lmh/a;

    goto :goto_e

    :cond_1a
    invoke-virtual/range {p0 .. p0}, LDh/s;->f()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v6, v0}, LDh/s;->x0(Ljava/util/Collection;)V

    goto :goto_e

    :cond_1b
    new-instance v0, LDh/s$a;

    invoke-direct {v0, v7, v5}, LDh/s$a;-><init>(LDh/s;Lpi/G0;)V

    iput-object v0, v6, LDh/s;->z:Lmh/a;

    :cond_1c
    :goto_e
    return-object v6
.end method

.method public O()Z
    .locals 1

    iget-boolean v0, p0, LDh/s;->q:Z

    return v0
.end method

.method public Q0()Z
    .locals 1

    iget-boolean v0, p0, LDh/s;->w:Z

    return v0
.end method

.method public R0(LBh/b0;LBh/b0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;LBh/D;LBh/u;)LDh/s;
    .locals 1

    if-nez p3, :cond_0

    const/4 v0, 0x5

    invoke-static {v0}, LDh/s;->I(I)V

    :cond_0
    if-nez p4, :cond_1

    const/4 v0, 0x6

    invoke-static {v0}, LDh/s;->I(I)V

    :cond_1
    if-nez p5, :cond_2

    const/4 v0, 0x7

    invoke-static {v0}, LDh/s;->I(I)V

    :cond_2
    if-nez p8, :cond_3

    const/16 v0, 0x8

    invoke-static {v0}, LDh/s;->I(I)V

    :cond_3
    invoke-static {p4}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LDh/s;->e:Ljava/util/List;

    invoke-static {p5}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LDh/s;->f:Ljava/util/List;

    iput-object p6, p0, LDh/s;->g:Lpi/S;

    iput-object p7, p0, LDh/s;->k:LBh/D;

    iput-object p8, p0, LDh/s;->l:LBh/u;

    iput-object p1, p0, LDh/s;->i:LBh/b0;

    iput-object p2, p0, LDh/s;->j:LBh/b0;

    iput-object p3, p0, LDh/s;->h:Ljava/util/List;

    const/4 p1, 0x0

    move p2, p1

    :goto_0
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p3

    const-string p6, " but position is "

    if-ge p2, p3, :cond_5

    invoke-interface {p4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LBh/l0;

    invoke-interface {p3}, LBh/l0;->getIndex()I

    move-result p7

    if-ne p7, p2, :cond_4

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p5, " index is "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p3}, LBh/l0;->getIndex()I

    move-result p3

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_1
    invoke-interface {p5}, Ljava/util/List;->size()I

    move-result p2

    if-ge p1, p2, :cond_7

    invoke-interface {p5, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LBh/s0;

    invoke-interface {p2}, LBh/s0;->getIndex()I

    move-result p3

    if-ne p3, p1, :cond_6

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_6
    new-instance p3, Ljava/lang/IllegalStateException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p5, "index is "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, LBh/s0;->getIndex()I

    move-result p2

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p3

    :cond_7
    return-object p0
.end method

.method protected S0(Lpi/G0;)LDh/s$c;
    .locals 13

    if-nez p1, :cond_0

    const/16 v0, 0x18

    invoke-static {v0}, LDh/s;->I(I)V

    :cond_0
    new-instance v0, LDh/s$c;

    invoke-virtual {p1}, Lpi/G0;->j()Lpi/E0;

    move-result-object v3

    invoke-virtual {p0}, LDh/n;->b()LBh/m;

    move-result-object v4

    invoke-virtual {p0}, LDh/s;->l()LBh/D;

    move-result-object v5

    invoke-virtual {p0}, LDh/s;->getVisibility()LBh/u;

    move-result-object v6

    invoke-virtual {p0}, LDh/s;->h()LBh/b$a;

    move-result-object v7

    invoke-virtual {p0}, LDh/s;->i()Ljava/util/List;

    move-result-object v8

    invoke-virtual {p0}, LDh/s;->p0()Ljava/util/List;

    move-result-object v9

    invoke-virtual {p0}, LDh/s;->k0()LBh/b0;

    move-result-object v10

    invoke-virtual {p0}, LDh/s;->getReturnType()Lpi/S;

    move-result-object v11

    const/4 v12, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v12}, LDh/s$c;-><init>(LDh/s;Lpi/E0;LBh/m;LBh/D;LBh/u;LBh/b$a;Ljava/util/List;Ljava/util/List;LBh/b0;Lpi/S;LZh/f;)V

    return-object v0
.end method

.method public U0(LBh/a$a;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LDh/s;->D:Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LDh/s;->D:Ljava/util/Map;

    :cond_0
    iget-object v0, p0, LDh/s;->D:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public V0(Z)V
    .locals 0

    iput-boolean p1, p0, LDh/s;->s:Z

    return-void
.end method

.method public W0(Z)V
    .locals 0

    iput-boolean p1, p0, LDh/s;->r:Z

    return-void
.end method

.method public X0(Z)V
    .locals 0

    iput-boolean p1, p0, LDh/s;->o:Z

    return-void
.end method

.method public Y0(Z)V
    .locals 0

    iput-boolean p1, p0, LDh/s;->w:Z

    return-void
.end method

.method public Z0(Z)V
    .locals 0

    iput-boolean p1, p0, LDh/s;->x:Z

    return-void
.end method

.method public a()LBh/z;
    .locals 2

    iget-object v0, p0, LDh/s;->A:LBh/z;

    if-ne v0, p0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, LBh/z;->a()LBh/z;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    const/16 v1, 0x14

    invoke-static {v1}, LDh/s;->I(I)V

    :cond_1
    return-object v0
.end method

.method public a0()LBh/z;
    .locals 1

    iget-object v0, p0, LDh/s;->C:LBh/z;

    return-object v0
.end method

.method public bridge synthetic c(Lpi/G0;)LBh/n;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LDh/s;->c(Lpi/G0;)LBh/z;

    move-result-object p1

    return-object p1
.end method

.method public c(Lpi/G0;)LBh/z;
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0x16

    invoke-static {v0}, LDh/s;->I(I)V

    .line 2
    :cond_0
    invoke-virtual {p1}, Lpi/G0;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    .line 3
    :cond_1
    invoke-virtual {p0, p1}, LDh/s;->S0(Lpi/G0;)LDh/s$c;

    move-result-object p1

    .line 4
    invoke-virtual {p0}, LDh/s;->a()LBh/z;

    move-result-object v0

    invoke-virtual {p1, v0}, LDh/s$c;->O(LBh/b;)LDh/s$c;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, LDh/s$c;->Q()LDh/s$c;

    move-result-object p1

    const/4 v0, 0x1

    .line 6
    invoke-virtual {p1, v0}, LDh/s$c;->K(Z)LDh/s$c;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, LDh/s$c;->a()LBh/z;

    move-result-object p1

    return-object p1
.end method

.method public c1(Z)V
    .locals 0

    iput-boolean p1, p0, LDh/s;->n:Z

    return-void
.end method

.method public d0()LBh/b0;
    .locals 1

    iget-object v0, p0, LDh/s;->j:LBh/b0;

    return-object v0
.end method

.method public e0(LBh/a$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LDh/s;->D:Ljava/util/Map;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e1(Z)V
    .locals 0

    iput-boolean p1, p0, LDh/s;->p:Z

    return-void
.end method

.method public f()Ljava/util/Collection;
    .locals 2

    invoke-direct {p0}, LDh/s;->T0()V

    iget-object v0, p0, LDh/s;->y:Ljava/util/Collection;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    const/16 v1, 0xe

    invoke-static {v1}, LDh/s;->I(I)V

    :cond_1
    return-object v0
.end method

.method public f1(Z)V
    .locals 0

    iput-boolean p1, p0, LDh/s;->m:Z

    return-void
.end method

.method public g1(Lpi/S;)V
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0xb

    invoke-static {v0}, LDh/s;->I(I)V

    :cond_0
    iput-object p1, p0, LDh/s;->g:Lpi/S;

    return-void
.end method

.method public getReturnType()Lpi/S;
    .locals 1

    iget-object v0, p0, LDh/s;->g:Lpi/S;

    return-object v0
.end method

.method public getTypeParameters()Ljava/util/List;
    .locals 3

    iget-object v0, p0, LDh/s;->e:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "typeParameters == null for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getVisibility()LBh/u;
    .locals 2

    iget-object v0, p0, LDh/s;->l:LBh/u;

    if-nez v0, :cond_0

    const/16 v1, 0x10

    invoke-static {v1}, LDh/s;->I(I)V

    :cond_0
    return-object v0
.end method

.method public h()LBh/b$a;
    .locals 2

    iget-object v0, p0, LDh/s;->B:LBh/b$a;

    if-nez v0, :cond_0

    const/16 v1, 0x15

    invoke-static {v1}, LDh/s;->I(I)V

    :cond_0
    return-object v0
.end method

.method public h1(Z)V
    .locals 0

    iput-boolean p1, p0, LDh/s;->v:Z

    return-void
.end method

.method public i()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LDh/s;->f:Ljava/util/List;

    if-nez v0, :cond_0

    const/16 v1, 0x13

    invoke-static {v1}, LDh/s;->I(I)V

    :cond_0
    return-object v0
.end method

.method public i1(Z)V
    .locals 0

    iput-boolean p1, p0, LDh/s;->q:Z

    return-void
.end method

.method public isExternal()Z
    .locals 1

    iget-boolean v0, p0, LDh/s;->o:Z

    return v0
.end method

.method public isInfix()Z
    .locals 3

    iget-boolean v0, p0, LDh/s;->n:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, LDh/s;->a()LBh/z;

    move-result-object v0

    invoke-interface {v0}, LBh/z;->f()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/z;

    invoke-interface {v2}, LBh/z;->isInfix()Z

    move-result v2

    if-eqz v2, :cond_1

    return v1

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public isInline()Z
    .locals 1

    iget-boolean v0, p0, LDh/s;->p:Z

    return v0
.end method

.method public isOperator()Z
    .locals 3

    iget-boolean v0, p0, LDh/s;->m:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, LDh/s;->a()LBh/z;

    move-result-object v0

    invoke-interface {v0}, LBh/z;->f()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/z;

    invoke-interface {v2}, LBh/z;->isOperator()Z

    move-result v2

    if-eqz v2, :cond_1

    return v1

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public isSuspend()Z
    .locals 1

    iget-boolean v0, p0, LDh/s;->v:Z

    return v0
.end method

.method public j1(LBh/u;)V
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0xa

    invoke-static {v0}, LDh/s;->I(I)V

    :cond_0
    iput-object p1, p0, LDh/s;->l:LBh/u;

    return-void
.end method

.method public k0()LBh/b0;
    .locals 1

    iget-object v0, p0, LDh/s;->i:LBh/b0;

    return-object v0
.end method

.method public l()LBh/D;
    .locals 2

    iget-object v0, p0, LDh/s;->k:LBh/D;

    if-nez v0, :cond_0

    const/16 v1, 0xf

    invoke-static {v1}, LDh/s;->I(I)V

    :cond_0
    return-object v0
.end method

.method public p0()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LDh/s;->h:Ljava/util/List;

    if-nez v0, :cond_0

    const/16 v1, 0xd

    invoke-static {v1}, LDh/s;->I(I)V

    :cond_0
    return-object v0
.end method

.method public t0(LBh/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, LBh/o;->a(LBh/z;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public v()LBh/z$a;
    .locals 2

    sget-object v0, Lpi/G0;->b:Lpi/G0;

    invoke-virtual {p0, v0}, LDh/s;->S0(Lpi/G0;)LDh/s$c;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x17

    invoke-static {v1}, LDh/s;->I(I)V

    :cond_0
    return-object v0
.end method

.method public v0()Z
    .locals 1

    iget-boolean v0, p0, LDh/s;->t:Z

    return v0
.end method

.method public x0(Ljava/util/Collection;)V
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0x11

    invoke-static {v0}, LDh/s;->I(I)V

    :cond_0
    iput-object p1, p0, LDh/s;->y:Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/z;

    invoke-interface {v0}, LBh/z;->D0()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, LDh/s;->u:Z

    :cond_2
    return-void
.end method
