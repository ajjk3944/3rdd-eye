.class public LDh/K;
.super LDh/Y;
.source "SourceFile"

# interfaces
.implements LBh/Y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LDh/K$a;
    }
.end annotation


# instance fields
.field private A:LBh/w;

.field private B:LBh/w;

.field private final i:LBh/D;

.field private j:LBh/u;

.field private k:Ljava/util/Collection;

.field private final l:LBh/Y;

.field private final m:LBh/b$a;

.field private final n:Z

.field private final o:Z

.field private final p:Z

.field private final q:Z

.field private final r:Z

.field private final s:Z

.field private t:Ljava/util/List;

.field private u:LBh/b0;

.field private v:LBh/b0;

.field private w:Ljava/util/List;

.field private x:LDh/L;

.field private y:LBh/a0;

.field private z:Z


# direct methods
.method protected constructor <init>(LBh/m;LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/D;LBh/u;ZLZh/f;LBh/b$a;LBh/g0;ZZZZZZ)V
    .locals 11

    move-object v7, p0

    move-object v8, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p8

    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_0
    if-nez p3, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_1
    if-nez v8, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_2
    if-nez v9, :cond_3

    const/4 v0, 0x3

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_3
    if-nez p7, :cond_4

    const/4 v0, 0x4

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_4
    if-nez v10, :cond_5

    const/4 v0, 0x5

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_5
    if-nez p9, :cond_6

    const/4 v0, 0x6

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_6
    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object/from16 v3, p7

    move/from16 v5, p6

    move-object/from16 v6, p9

    invoke-direct/range {v0 .. v6}, LDh/Y;-><init>(LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;Lpi/S;ZLBh/g0;)V

    const/4 v0, 0x0

    iput-object v0, v7, LDh/K;->k:Ljava/util/Collection;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, v7, LDh/K;->t:Ljava/util/List;

    iput-object v8, v7, LDh/K;->i:LBh/D;

    iput-object v9, v7, LDh/K;->j:LBh/u;

    if-nez p2, :cond_7

    move-object v0, v7

    goto :goto_0

    :cond_7
    move-object v0, p2

    :goto_0
    iput-object v0, v7, LDh/K;->l:LBh/Y;

    iput-object v10, v7, LDh/K;->m:LBh/b$a;

    move/from16 v0, p10

    iput-boolean v0, v7, LDh/K;->n:Z

    move/from16 v0, p11

    iput-boolean v0, v7, LDh/K;->o:Z

    move/from16 v0, p12

    iput-boolean v0, v7, LDh/K;->p:Z

    move/from16 v0, p13

    iput-boolean v0, v7, LDh/K;->q:Z

    move/from16 v0, p14

    iput-boolean v0, v7, LDh/K;->r:Z

    move/from16 v0, p15

    iput-boolean v0, v7, LDh/K;->s:Z

    return-void
.end method

.method private static synthetic I(I)V
    .locals 11

    const/16 v0, 0x2a

    const/16 v1, 0x29

    const/16 v2, 0x27

    const/16 v3, 0x26

    const/16 v4, 0x1c

    if-eq p0, v4, :cond_0

    if-eq p0, v3, :cond_0

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    const-string v5, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    :pswitch_0
    const-string v5, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v6, 0x2

    if-eq p0, v4, :cond_1

    if-eq p0, v3, :cond_1

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    packed-switch p0, :pswitch_data_1

    const/4 v7, 0x3

    goto :goto_1

    :cond_1
    :pswitch_1
    move v7, v6

    :goto_1
    new-array v7, v7, [Ljava/lang/Object;

    const-string v8, "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl"

    const/4 v9, 0x0

    packed-switch p0, :pswitch_data_2

    :pswitch_2
    const-string v10, "containingDeclaration"

    aput-object v10, v7, v9

    goto/16 :goto_2

    :pswitch_3
    const-string v10, "overriddenDescriptors"

    aput-object v10, v7, v9

    goto/16 :goto_2

    :pswitch_4
    const-string v10, "newName"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_5
    const-string v10, "newVisibility"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_6
    const-string v10, "newModality"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_7
    const-string v10, "newOwner"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_8
    const-string v10, "accessorDescriptor"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_9
    const-string v10, "substitutor"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_a
    const-string v10, "copyConfiguration"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_b
    const-string v10, "originalSubstitutor"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_c
    aput-object v8, v7, v9

    goto :goto_2

    :pswitch_d
    const-string v10, "contextReceiverParameters"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_e
    const-string v10, "typeParameters"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_f
    const-string v10, "outType"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_10
    const-string v10, "inType"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_11
    const-string v10, "source"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_12
    const-string v10, "kind"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_13
    const-string v10, "name"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_14
    const-string v10, "visibility"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_15
    const-string v10, "modality"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_16
    const-string v10, "annotations"

    aput-object v10, v7, v9

    :goto_2
    const/4 v9, 0x1

    if-eq p0, v4, :cond_6

    if-eq p0, v3, :cond_5

    if-eq p0, v2, :cond_4

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    packed-switch p0, :pswitch_data_3

    aput-object v8, v7, v9

    goto :goto_3

    :pswitch_17
    const-string v8, "getAccessors"

    aput-object v8, v7, v9

    goto :goto_3

    :pswitch_18
    const-string v8, "getVisibility"

    aput-object v8, v7, v9

    goto :goto_3

    :pswitch_19
    const-string v8, "getModality"

    aput-object v8, v7, v9

    goto :goto_3

    :pswitch_1a
    const-string v8, "getReturnType"

    aput-object v8, v7, v9

    goto :goto_3

    :pswitch_1b
    const-string v8, "getContextReceiverParameters"

    aput-object v8, v7, v9

    goto :goto_3

    :pswitch_1c
    const-string v8, "getTypeParameters"

    aput-object v8, v7, v9

    goto :goto_3

    :cond_2
    const-string v8, "copy"

    aput-object v8, v7, v9

    goto :goto_3

    :cond_3
    const-string v8, "getOverriddenDescriptors"

    aput-object v8, v7, v9

    goto :goto_3

    :cond_4
    const-string v8, "getKind"

    aput-object v8, v7, v9

    goto :goto_3

    :cond_5
    const-string v8, "getOriginal"

    aput-object v8, v7, v9

    goto :goto_3

    :cond_6
    const-string v8, "getSourceToUseForCopy"

    aput-object v8, v7, v9

    :goto_3
    packed-switch p0, :pswitch_data_4

    const-string v8, "<init>"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_1d
    const-string v8, "setOverriddenDescriptors"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_1e
    const-string v8, "createSubstitutedCopy"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_1f
    const-string v8, "getSubstitutedInitialSignatureDescriptor"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_20
    const-string v8, "doSubstitute"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_21
    const-string v8, "substitute"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_22
    const-string v8, "setVisibility"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_23
    const-string v8, "setType"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_24
    const-string v8, "setInType"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_25
    const-string v8, "create"

    aput-object v8, v7, v6

    :goto_4
    :pswitch_26
    invoke-static {v5, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    if-eq p0, v4, :cond_7

    if-eq p0, v3, :cond_7

    if-eq p0, v2, :cond_7

    if-eq p0, v1, :cond_7

    if-eq p0, v0, :cond_7

    packed-switch p0, :pswitch_data_5

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_7
    :pswitch_27
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x15
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_2
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_14
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_c
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_12
        :pswitch_4
        :pswitch_11
        :pswitch_c
        :pswitch_c
        :pswitch_3
        :pswitch_c
        :pswitch_c
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x15
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x7
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_23
        :pswitch_23
        :pswitch_23
        :pswitch_23
        :pswitch_22
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_21
        :pswitch_26
        :pswitch_20
        :pswitch_1f
        :pswitch_1f
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_26
        :pswitch_26
        :pswitch_1d
        :pswitch_26
        :pswitch_26
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x15
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_27
    .end packed-switch
.end method

.method static synthetic M0(LDh/K;)LBh/b0;
    .locals 0

    iget-object p0, p0, LDh/K;->u:LBh/b0;

    return-object p0
.end method

.method public static O0(LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/D;LBh/u;ZLZh/f;LBh/b$a;LBh/g0;ZZZZZZ)LDh/K;
    .locals 17

    if-nez p0, :cond_0

    const/4 v0, 0x7

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x8

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_1
    if-nez p2, :cond_2

    const/16 v0, 0x9

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_2
    if-nez p3, :cond_3

    const/16 v0, 0xa

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_3
    if-nez p5, :cond_4

    const/16 v0, 0xb

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_4
    if-nez p6, :cond_5

    const/16 v0, 0xc

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_5
    if-nez p7, :cond_6

    const/16 v0, 0xd

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_6
    new-instance v16, LDh/K;

    const/4 v2, 0x0

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move/from16 v10, p8

    move/from16 v11, p9

    move/from16 v12, p10

    move/from16 v13, p11

    move/from16 v14, p12

    move/from16 v15, p13

    invoke-direct/range {v0 .. v15}, LDh/K;-><init>(LBh/m;LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/D;LBh/u;ZLZh/f;LBh/b$a;LBh/g0;ZZZZZZ)V

    return-object v16
.end method

.method private S0(ZLBh/Y;)LBh/g0;
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LDh/K;->a()LBh/Y;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, LBh/p;->j()LBh/g0;

    move-result-object p1

    goto :goto_1

    :cond_1
    sget-object p1, LBh/g0;->a:LBh/g0;

    :goto_1
    if-nez p1, :cond_2

    const/16 p2, 0x1c

    invoke-static {p2}, LDh/K;->I(I)V

    :cond_2
    return-object p1
.end method

.method private static T0(Lpi/G0;LBh/X;)LBh/z;
    .locals 1

    if-nez p0, :cond_0

    const/16 v0, 0x1e

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x1f

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_1
    invoke-interface {p1}, LBh/z;->a0()LBh/z;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, LBh/z;->a0()LBh/z;

    move-result-object p1

    invoke-interface {p1, p0}, LBh/z;->c(Lpi/G0;)LBh/z;

    move-result-object p0

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static Y0(LBh/u;LBh/b$a;)LBh/u;
    .locals 1

    sget-object v0, LBh/b$a;->FAKE_OVERRIDE:LBh/b$a;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, LBh/u;->f()LBh/u;

    move-result-object p1

    invoke-static {p1}, LBh/t;->g(LBh/u;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p0, LBh/t;->h:LBh/u;

    :cond_0
    return-object p0
.end method

.method private static d1(Lpi/G0;LBh/Y;LBh/b0;)LBh/b0;
    .locals 4

    invoke-interface {p2}, LBh/r0;->getType()Lpi/S;

    move-result-object v0

    sget-object v1, Lpi/N0;->IN_VARIANCE:Lpi/N0;

    invoke-virtual {p0, v0, v1}, Lpi/G0;->p(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, LDh/N;

    new-instance v1, Lji/c;

    invoke-interface {p2}, LBh/b0;->getValue()Lji/g;

    move-result-object v2

    check-cast v2, Lji/f;

    invoke-interface {v2}, Lji/f;->a()LZh/f;

    move-result-object v2

    invoke-interface {p2}, LBh/b0;->getValue()Lji/g;

    move-result-object v3

    invoke-direct {v1, p1, p0, v2, v3}, Lji/c;-><init>(LBh/a;Lpi/S;LZh/f;Lji/g;)V

    invoke-interface {p2}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p0

    invoke-direct {v0, p1, v1, p0}, LDh/N;-><init>(LBh/m;Lji/g;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)V

    return-object v0
.end method

.method private static e1(Lpi/G0;LBh/Y;LBh/b0;)LBh/b0;
    .locals 3

    invoke-interface {p2}, LBh/r0;->getType()Lpi/S;

    move-result-object v0

    sget-object v1, Lpi/N0;->IN_VARIANCE:Lpi/N0;

    invoke-virtual {p0, v0, v1}, Lpi/G0;->p(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, LDh/N;

    new-instance v1, Lji/d;

    invoke-interface {p2}, LBh/b0;->getValue()Lji/g;

    move-result-object v2

    invoke-direct {v1, p1, p0, v2}, Lji/d;-><init>(LBh/a;Lpi/S;Lji/g;)V

    invoke-interface {p2}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p0

    invoke-direct {v0, p1, v1, p0}, LDh/N;-><init>(LBh/m;Lji/g;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)V

    return-object v0
.end method


# virtual methods
.method public A()Z
    .locals 1

    iget-boolean v0, p0, LDh/K;->o:Z

    return v0
.end method

.method public bridge synthetic B0()LBh/p;
    .locals 1

    invoke-virtual {p0}, LDh/K;->a()LBh/Y;

    move-result-object v0

    return-object v0
.end method

.method public F0()Z
    .locals 1

    iget-boolean v0, p0, LDh/K;->q:Z

    return v0
.end method

.method public L()Z
    .locals 1

    iget-boolean v0, p0, LDh/K;->p:Z

    return v0
.end method

.method public N()Z
    .locals 1

    iget-boolean v0, p0, LDh/K;->s:Z

    return v0
.end method

.method public N0(LBh/m;LBh/D;LBh/u;LBh/b$a;Z)LBh/Y;
    .locals 1

    invoke-virtual {p0}, LDh/K;->X0()LDh/K$a;

    move-result-object v0

    invoke-virtual {v0, p1}, LDh/K$a;->u(LBh/m;)LDh/K$a;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LDh/K$a;->t(LBh/b;)LDh/K$a;

    move-result-object p1

    invoke-virtual {p1, p2}, LDh/K$a;->s(LBh/D;)LDh/K$a;

    move-result-object p1

    invoke-virtual {p1, p3}, LDh/K$a;->w(LBh/u;)LDh/K$a;

    move-result-object p1

    invoke-virtual {p1, p4}, LDh/K$a;->r(LBh/b$a;)LDh/K$a;

    move-result-object p1

    invoke-virtual {p1, p5}, LDh/K$a;->q(Z)LDh/K$a;

    move-result-object p1

    invoke-virtual {p1}, LDh/K$a;->n()LBh/Y;

    move-result-object p1

    if-nez p1, :cond_0

    const/16 p2, 0x2a

    invoke-static {p2}, LDh/K;->I(I)V

    :cond_0
    return-object p1
.end method

.method protected P0(LBh/m;LBh/D;LBh/u;LBh/Y;LBh/b$a;LZh/f;LBh/g0;)LDh/K;
    .locals 17

    if-nez p1, :cond_0

    const/16 v0, 0x20

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_0
    if-nez p2, :cond_1

    const/16 v0, 0x21

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_1
    if-nez p3, :cond_2

    const/16 v0, 0x22

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_2
    if-nez p5, :cond_3

    const/16 v0, 0x23

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_3
    if-nez p6, :cond_4

    const/16 v0, 0x24

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_4
    if-nez p7, :cond_5

    const/16 v0, 0x25

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_5
    new-instance v16, LDh/K;

    invoke-virtual/range {p0 .. p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/b;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, LDh/Y;->h0()Z

    move-result v6

    invoke-virtual/range {p0 .. p0}, LDh/K;->q0()Z

    move-result v10

    invoke-virtual/range {p0 .. p0}, LDh/K;->A()Z

    move-result v11

    invoke-virtual/range {p0 .. p0}, LDh/K;->L()Z

    move-result v12

    invoke-virtual/range {p0 .. p0}, LDh/K;->F0()Z

    move-result v13

    invoke-virtual/range {p0 .. p0}, LDh/K;->isExternal()Z

    move-result v14

    invoke-virtual/range {p0 .. p0}, LDh/K;->N()Z

    move-result v15

    move-object/from16 v0, v16

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v7, p6

    move-object/from16 v8, p5

    move-object/from16 v9, p7

    invoke-direct/range {v0 .. v15}, LDh/K;-><init>(LBh/m;LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/D;LBh/u;ZLZh/f;LBh/b$a;LBh/g0;ZZZZZZ)V

    return-object v16
.end method

.method protected Q0(LDh/K$a;)LBh/Y;
    .locals 20

    move-object/from16 v8, p0

    if-nez p1, :cond_0

    const/16 v0, 0x1d

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_0
    invoke-static/range {p1 .. p1}, LDh/K$a;->b(LDh/K$a;)LBh/m;

    move-result-object v1

    invoke-static/range {p1 .. p1}, LDh/K$a;->f(LDh/K$a;)LBh/D;

    move-result-object v2

    invoke-static/range {p1 .. p1}, LDh/K$a;->g(LDh/K$a;)LBh/u;

    move-result-object v3

    invoke-static/range {p1 .. p1}, LDh/K$a;->h(LDh/K$a;)LBh/Y;

    move-result-object v4

    invoke-static/range {p1 .. p1}, LDh/K$a;->i(LDh/K$a;)LBh/b$a;

    move-result-object v5

    invoke-static/range {p1 .. p1}, LDh/K$a;->j(LDh/K$a;)LZh/f;

    move-result-object v6

    invoke-static/range {p1 .. p1}, LDh/K$a;->k(LDh/K$a;)Z

    move-result v0

    invoke-static/range {p1 .. p1}, LDh/K$a;->h(LDh/K$a;)LBh/Y;

    move-result-object v7

    invoke-direct {v8, v0, v7}, LDh/K;->S0(ZLBh/Y;)LBh/g0;

    move-result-object v7

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v7}, LDh/K;->P0(LBh/m;LBh/D;LBh/u;LBh/Y;LBh/b$a;LZh/f;LBh/g0;)LDh/K;

    move-result-object v0

    invoke-static/range {p1 .. p1}, LDh/K$a;->l(LDh/K$a;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual/range {p0 .. p0}, LDh/K;->getTypeParameters()Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-static/range {p1 .. p1}, LDh/K$a;->l(LDh/K$a;)Ljava/util/List;

    move-result-object v1

    :goto_0
    new-instance v11, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v11, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static/range {p1 .. p1}, LDh/K$a;->m(LDh/K$a;)Lpi/E0;

    move-result-object v2

    invoke-static {v1, v2, v0, v11}, Lpi/C;->b(Ljava/util/List;Lpi/E0;LBh/m;Ljava/util/List;)Lpi/G0;

    move-result-object v1

    invoke-static/range {p1 .. p1}, LDh/K$a;->c(LDh/K$a;)Lpi/S;

    move-result-object v2

    sget-object v3, Lpi/N0;->OUT_VARIANCE:Lpi/N0;

    invoke-virtual {v1, v2, v3}, Lpi/G0;->p(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object v10

    const/4 v3, 0x0

    if-nez v10, :cond_2

    return-object v3

    :cond_2
    sget-object v4, Lpi/N0;->IN_VARIANCE:Lpi/N0;

    invoke-virtual {v1, v2, v4}, Lpi/G0;->p(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v0, v2}, LDh/K;->Z0(Lpi/S;)V

    :cond_3
    invoke-static/range {p1 .. p1}, LDh/K$a;->d(LDh/K$a;)LBh/b0;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-interface {v2, v1}, LBh/b0;->c(Lpi/G0;)LBh/b0;

    move-result-object v2

    if-nez v2, :cond_4

    return-object v3

    :cond_4
    move-object v12, v2

    goto :goto_1

    :cond_5
    move-object v12, v3

    :goto_1
    iget-object v2, v8, LDh/K;->v:LBh/b0;

    if-eqz v2, :cond_6

    invoke-static {v1, v0, v2}, LDh/K;->e1(Lpi/G0;LBh/Y;LBh/b0;)LBh/b0;

    move-result-object v2

    move-object v13, v2

    goto :goto_2

    :cond_6
    move-object v13, v3

    :goto_2
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, v8, LDh/K;->t:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LBh/b0;

    invoke-static {v1, v0, v4}, LDh/K;->d1(Lpi/G0;LBh/Y;LBh/b0;)LBh/b0;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-interface {v14, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    move-object v9, v0

    invoke-virtual/range {v9 .. v14}, LDh/K;->b1(Lpi/S;Ljava/util/List;LBh/b0;LBh/b0;Ljava/util/List;)V

    iget-object v2, v8, LDh/K;->x:LDh/L;

    if-nez v2, :cond_9

    move-object v2, v3

    goto :goto_4

    :cond_9
    new-instance v2, LDh/L;

    iget-object v4, v8, LDh/K;->x:LDh/L;

    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/b;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v11

    invoke-static/range {p1 .. p1}, LDh/K$a;->f(LDh/K$a;)LBh/D;

    move-result-object v12

    iget-object v4, v8, LDh/K;->x:LDh/L;

    invoke-virtual {v4}, LDh/J;->getVisibility()LBh/u;

    move-result-object v4

    invoke-static/range {p1 .. p1}, LDh/K$a;->i(LDh/K$a;)LBh/b$a;

    move-result-object v5

    invoke-static {v4, v5}, LDh/K;->Y0(LBh/u;LBh/b$a;)LBh/u;

    move-result-object v13

    iget-object v4, v8, LDh/K;->x:LDh/L;

    invoke-virtual {v4}, LDh/J;->T()Z

    move-result v14

    iget-object v4, v8, LDh/K;->x:LDh/L;

    invoke-virtual {v4}, LDh/J;->isExternal()Z

    move-result v15

    iget-object v4, v8, LDh/K;->x:LDh/L;

    invoke-virtual {v4}, LDh/J;->isInline()Z

    move-result v16

    invoke-static/range {p1 .. p1}, LDh/K$a;->i(LDh/K$a;)LBh/b$a;

    move-result-object v17

    invoke-virtual/range {p1 .. p1}, LDh/K$a;->o()LBh/Z;

    move-result-object v18

    sget-object v19, LBh/g0;->a:LBh/g0;

    move-object v9, v2

    move-object v10, v0

    invoke-direct/range {v9 .. v19}, LDh/L;-><init>(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/D;LBh/u;ZZZLBh/b$a;LBh/Z;LBh/g0;)V

    :goto_4
    if-eqz v2, :cond_b

    iget-object v4, v8, LDh/K;->x:LDh/L;

    invoke-virtual {v4}, LDh/L;->getReturnType()Lpi/S;

    move-result-object v4

    iget-object v5, v8, LDh/K;->x:LDh/L;

    invoke-static {v1, v5}, LDh/K;->T0(Lpi/G0;LBh/X;)LBh/z;

    move-result-object v5

    invoke-virtual {v2, v5}, LDh/J;->M0(LBh/z;)V

    if-eqz v4, :cond_a

    sget-object v5, Lpi/N0;->OUT_VARIANCE:Lpi/N0;

    invoke-virtual {v1, v4, v5}, Lpi/G0;->p(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object v4

    goto :goto_5

    :cond_a
    move-object v4, v3

    :goto_5
    invoke-virtual {v2, v4}, LDh/L;->P0(Lpi/S;)V

    :cond_b
    iget-object v4, v8, LDh/K;->y:LBh/a0;

    if-nez v4, :cond_c

    move-object v4, v3

    goto :goto_6

    :cond_c
    new-instance v4, LDh/M;

    iget-object v5, v8, LDh/K;->y:LBh/a0;

    invoke-interface {v5}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v11

    invoke-static/range {p1 .. p1}, LDh/K$a;->f(LDh/K$a;)LBh/D;

    move-result-object v12

    iget-object v5, v8, LDh/K;->y:LBh/a0;

    invoke-interface {v5}, LBh/C;->getVisibility()LBh/u;

    move-result-object v5

    invoke-static/range {p1 .. p1}, LDh/K$a;->i(LDh/K$a;)LBh/b$a;

    move-result-object v6

    invoke-static {v5, v6}, LDh/K;->Y0(LBh/u;LBh/b$a;)LBh/u;

    move-result-object v13

    iget-object v5, v8, LDh/K;->y:LBh/a0;

    invoke-interface {v5}, LBh/X;->T()Z

    move-result v14

    iget-object v5, v8, LDh/K;->y:LBh/a0;

    invoke-interface {v5}, LBh/C;->isExternal()Z

    move-result v15

    iget-object v5, v8, LDh/K;->y:LBh/a0;

    invoke-interface {v5}, LBh/z;->isInline()Z

    move-result v16

    invoke-static/range {p1 .. p1}, LDh/K$a;->i(LDh/K$a;)LBh/b$a;

    move-result-object v17

    invoke-virtual/range {p1 .. p1}, LDh/K$a;->p()LBh/a0;

    move-result-object v18

    sget-object v19, LBh/g0;->a:LBh/g0;

    move-object v9, v4

    move-object v10, v0

    invoke-direct/range {v9 .. v19}, LDh/M;-><init>(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/D;LBh/u;ZZZLBh/b$a;LBh/a0;LBh/g0;)V

    :goto_6
    if-eqz v4, :cond_f

    iget-object v5, v8, LDh/K;->y:LBh/a0;

    invoke-interface {v5}, LBh/a;->i()Ljava/util/List;

    move-result-object v13

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v15, 0x0

    move-object v12, v4

    move-object v14, v1

    invoke-static/range {v12 .. v17}, LDh/s;->P0(LBh/z;Ljava/util/List;Lpi/G0;ZZ[Z)Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-nez v5, :cond_d

    invoke-virtual {v0, v7}, LDh/K;->a1(Z)V

    invoke-static/range {p1 .. p1}, LDh/K$a;->b(LDh/K$a;)LBh/m;

    move-result-object v5

    invoke-static {v5}, Lfi/e;->m(LBh/m;)Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v5

    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->H()Lpi/d0;

    move-result-object v5

    iget-object v9, v8, LDh/K;->y:LBh/a0;

    invoke-interface {v9}, LBh/a;->i()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LBh/s0;

    invoke-interface {v9}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v9

    invoke-static {v4, v5, v9}, LDh/M;->O0(LBh/a0;Lpi/S;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LDh/V;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    :cond_d
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v9

    if-ne v9, v7, :cond_e

    iget-object v7, v8, LDh/K;->y:LBh/a0;

    invoke-static {v1, v7}, LDh/K;->T0(Lpi/G0;LBh/X;)LBh/z;

    move-result-object v7

    invoke-virtual {v4, v7}, LDh/J;->M0(LBh/z;)V

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LBh/s0;

    invoke-virtual {v4, v5}, LDh/M;->Q0(LBh/s0;)V

    goto :goto_7

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_f
    :goto_7
    iget-object v5, v8, LDh/K;->A:LBh/w;

    if-nez v5, :cond_10

    move-object v6, v3

    goto :goto_8

    :cond_10
    new-instance v6, LDh/r;

    invoke-interface {v5}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v5

    invoke-direct {v6, v5, v0}, LDh/r;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/Y;)V

    :goto_8
    iget-object v5, v8, LDh/K;->B:LBh/w;

    if-nez v5, :cond_11

    goto :goto_9

    :cond_11
    new-instance v3, LDh/r;

    invoke-interface {v5}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v5

    invoke-direct {v3, v5, v0}, LDh/r;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/Y;)V

    :goto_9
    invoke-virtual {v0, v2, v4, v6, v3}, LDh/K;->V0(LDh/L;LBh/a0;LBh/w;LBh/w;)V

    invoke-static/range {p1 .. p1}, LDh/K$a;->e(LDh/K$a;)Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-static {}, Lxi/l;->j()Lxi/l;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, LDh/K;->f()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LBh/Y;

    invoke-interface {v4, v1}, LBh/Y;->c(Lpi/G0;)LBh/Y;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_12
    invoke-virtual {v0, v2}, LDh/K;->x0(Ljava/util/Collection;)V

    :cond_13
    invoke-virtual/range {p0 .. p0}, LDh/K;->A()Z

    move-result v1

    if-eqz v1, :cond_14

    iget-object v1, v8, LDh/Y;->h:Lmh/a;

    if-eqz v1, :cond_14

    iget-object v2, v8, LDh/Y;->g:Loi/j;

    invoke-virtual {v0, v2, v1}, LDh/Y;->K0(Loi/j;Lmh/a;)V

    :cond_14
    return-object v0
.end method

.method public R0()LDh/L;
    .locals 1

    iget-object v0, p0, LDh/K;->x:LDh/L;

    return-object v0
.end method

.method public U0(LDh/L;LBh/a0;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0, v0}, LDh/K;->V0(LDh/L;LBh/a0;LBh/w;LBh/w;)V

    return-void
.end method

.method public V0(LDh/L;LBh/a0;LBh/w;LBh/w;)V
    .locals 0

    iput-object p1, p0, LDh/K;->x:LDh/L;

    iput-object p2, p0, LDh/K;->y:LBh/a0;

    iput-object p3, p0, LDh/K;->A:LBh/w;

    iput-object p4, p0, LDh/K;->B:LBh/w;

    return-void
.end method

.method public W0()Z
    .locals 1

    iget-boolean v0, p0, LDh/K;->z:Z

    return v0
.end method

.method public X0()LDh/K$a;
    .locals 1

    new-instance v0, LDh/K$a;

    invoke-direct {v0, p0}, LDh/K$a;-><init>(LDh/K;)V

    return-object v0
.end method

.method public Z0(Lpi/S;)V
    .locals 0

    if-nez p1, :cond_0

    const/16 p1, 0xe

    invoke-static {p1}, LDh/K;->I(I)V

    :cond_0
    return-void
.end method

.method public a()LBh/Y;
    .locals 2

    .line 4
    iget-object v0, p0, LDh/K;->l:LBh/Y;

    if-ne v0, p0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, LBh/Y;->a()LBh/Y;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    const/16 v1, 0x26

    invoke-static {v1}, LDh/K;->I(I)V

    :cond_1
    return-object v0
.end method

.method public bridge synthetic a()LBh/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LDh/K;->a()LBh/Y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LBh/b;
    .locals 1

    .line 2
    invoke-virtual {p0}, LDh/K;->a()LBh/Y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LBh/m;
    .locals 1

    .line 3
    invoke-virtual {p0}, LDh/K;->a()LBh/Y;

    move-result-object v0

    return-object v0
.end method

.method public a1(Z)V
    .locals 0

    iput-boolean p1, p0, LDh/K;->z:Z

    return-void
.end method

.method public b1(Lpi/S;Ljava/util/List;LBh/b0;LBh/b0;Ljava/util/List;)V
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0x11

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_0
    if-nez p2, :cond_1

    const/16 v0, 0x12

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_1
    if-nez p5, :cond_2

    const/16 v0, 0x13

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_2
    invoke-virtual {p0, p1}, LDh/X;->G0(Lpi/S;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, LDh/K;->w:Ljava/util/List;

    iput-object p4, p0, LDh/K;->v:LBh/b0;

    iput-object p3, p0, LDh/K;->u:LBh/b0;

    iput-object p5, p0, LDh/K;->t:Ljava/util/List;

    return-void
.end method

.method public c(Lpi/G0;)LBh/Y;
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0x1b

    invoke-static {v0}, LDh/K;->I(I)V

    .line 2
    :cond_0
    invoke-virtual {p1}, Lpi/G0;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    .line 3
    :cond_1
    invoke-virtual {p0}, LDh/K;->X0()LDh/K$a;

    move-result-object v0

    .line 4
    invoke-virtual {p1}, Lpi/G0;->j()Lpi/E0;

    move-result-object p1

    invoke-virtual {v0, p1}, LDh/K$a;->v(Lpi/E0;)LDh/K$a;

    move-result-object p1

    .line 5
    invoke-virtual {p0}, LDh/K;->a()LBh/Y;

    move-result-object v0

    invoke-virtual {p1, v0}, LDh/K$a;->t(LBh/b;)LDh/K$a;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, LDh/K$a;->n()LBh/Y;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Lpi/G0;)LBh/n;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LDh/K;->c(Lpi/G0;)LBh/Y;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c0(LBh/m;LBh/D;LBh/u;LBh/b$a;Z)LBh/b;
    .locals 0

    invoke-virtual/range {p0 .. p5}, LDh/K;->N0(LBh/m;LBh/D;LBh/u;LBh/b$a;Z)LBh/Y;

    move-result-object p1

    return-object p1
.end method

.method public c1(LBh/u;)V
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0x14

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_0
    iput-object p1, p0, LDh/K;->j:LBh/u;

    return-void
.end method

.method public bridge synthetic d()LBh/Z;
    .locals 1

    invoke-virtual {p0}, LDh/K;->R0()LDh/L;

    move-result-object v0

    return-object v0
.end method

.method public d0()LBh/b0;
    .locals 1

    iget-object v0, p0, LDh/K;->u:LBh/b0;

    return-object v0
.end method

.method public e0(LBh/a$a;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public f()Ljava/util/Collection;
    .locals 2

    iget-object v0, p0, LDh/K;->k:Ljava/util/Collection;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    const/16 v1, 0x29

    invoke-static {v1}, LDh/K;->I(I)V

    :cond_1
    return-object v0
.end method

.method public g()LBh/a0;
    .locals 1

    iget-object v0, p0, LDh/K;->y:LBh/a0;

    return-object v0
.end method

.method public getReturnType()Lpi/S;
    .locals 2

    invoke-virtual {p0}, LDh/X;->getType()Lpi/S;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x17

    invoke-static {v1}, LDh/K;->I(I)V

    :cond_0
    return-object v0
.end method

.method public getTypeParameters()Ljava/util/List;
    .locals 3

    iget-object v0, p0, LDh/K;->w:Ljava/util/List;

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

    iget-object v0, p0, LDh/K;->j:LBh/u;

    if-nez v0, :cond_0

    const/16 v1, 0x19

    invoke-static {v1}, LDh/K;->I(I)V

    :cond_0
    return-object v0
.end method

.method public h()LBh/b$a;
    .locals 2

    iget-object v0, p0, LDh/K;->m:LBh/b$a;

    if-nez v0, :cond_0

    const/16 v1, 0x27

    invoke-static {v1}, LDh/K;->I(I)V

    :cond_0
    return-object v0
.end method

.method public isExternal()Z
    .locals 1

    iget-boolean v0, p0, LDh/K;->r:Z

    return v0
.end method

.method public k0()LBh/b0;
    .locals 1

    iget-object v0, p0, LDh/K;->v:LBh/b0;

    return-object v0
.end method

.method public l()LBh/D;
    .locals 2

    iget-object v0, p0, LDh/K;->i:LBh/D;

    if-nez v0, :cond_0

    const/16 v1, 0x18

    invoke-static {v1}, LDh/K;->I(I)V

    :cond_0
    return-object v0
.end method

.method public l0()LBh/w;
    .locals 1

    iget-object v0, p0, LDh/K;->B:LBh/w;

    return-object v0
.end method

.method public o0()LBh/w;
    .locals 1

    iget-object v0, p0, LDh/K;->A:LBh/w;

    return-object v0
.end method

.method public p0()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LDh/K;->t:Ljava/util/List;

    if-nez v0, :cond_0

    const/16 v1, 0x16

    invoke-static {v1}, LDh/K;->I(I)V

    :cond_0
    return-object v0
.end method

.method public q0()Z
    .locals 1

    iget-boolean v0, p0, LDh/K;->n:Z

    return v0
.end method

.method public t0(LBh/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, LBh/o;->e(LBh/Y;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public x()Ljava/util/List;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, LDh/K;->x:LDh/L;

    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, LDh/K;->y:LBh/a0;

    if-eqz v1, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-object v0
.end method

.method public x0(Ljava/util/Collection;)V
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0x28

    invoke-static {v0}, LDh/K;->I(I)V

    :cond_0
    iput-object p1, p0, LDh/K;->k:Ljava/util/Collection;

    return-void
.end method
