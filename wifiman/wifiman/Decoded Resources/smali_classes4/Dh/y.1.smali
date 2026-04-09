.class public LDh/y;
.super LDh/z;
.source "SourceFile"


# instance fields
.field private final b:LDh/z;

.field private final c:Lpi/G0;

.field private d:Lpi/G0;

.field private e:Ljava/util/List;

.field private f:Ljava/util/List;

.field private g:Lpi/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LDh/z;Lpi/G0;)V
    .locals 0

    invoke-direct {p0}, LDh/z;-><init>()V

    iput-object p1, p0, LDh/y;->b:LDh/z;

    iput-object p2, p0, LDh/y;->c:Lpi/G0;

    return-void
.end method

.method private static synthetic B0(I)V
    .locals 15

    const/16 v0, 0x17

    const/16 v1, 0xd

    const/16 v2, 0xa

    const/16 v3, 0x8

    const/4 v4, 0x6

    const/4 v5, 0x5

    const/4 v6, 0x3

    const/4 v7, 0x2

    if-eq p0, v7, :cond_0

    if-eq p0, v6, :cond_0

    if-eq p0, v5, :cond_0

    if-eq p0, v4, :cond_0

    if-eq p0, v3, :cond_0

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v8, "@NotNull method %s.%s must not return null"

    goto :goto_0

    :cond_0
    const-string v8, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    :goto_0
    if-eq p0, v7, :cond_1

    if-eq p0, v6, :cond_1

    if-eq p0, v5, :cond_1

    if-eq p0, v4, :cond_1

    if-eq p0, v3, :cond_1

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    move v9, v7

    goto :goto_1

    :cond_1
    move v9, v6

    :goto_1
    new-array v9, v9, [Ljava/lang/Object;

    const-string v10, "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor"

    const/4 v11, 0x0

    if-eq p0, v7, :cond_5

    if-eq p0, v6, :cond_4

    if-eq p0, v5, :cond_3

    if-eq p0, v4, :cond_4

    if-eq p0, v3, :cond_5

    if-eq p0, v2, :cond_3

    if-eq p0, v1, :cond_4

    if-eq p0, v0, :cond_2

    aput-object v10, v9, v11

    goto :goto_2

    :cond_2
    const-string v12, "substitutor"

    aput-object v12, v9, v11

    goto :goto_2

    :cond_3
    const-string v12, "typeSubstitution"

    aput-object v12, v9, v11

    goto :goto_2

    :cond_4
    const-string v12, "kotlinTypeRefiner"

    aput-object v12, v9, v11

    goto :goto_2

    :cond_5
    const-string v12, "typeArguments"

    aput-object v12, v9, v11

    :goto_2
    const-string v11, "getMemberScope"

    const-string v12, "getUnsubstitutedMemberScope"

    const-string v13, "substitute"

    const/4 v14, 0x1

    packed-switch p0, :pswitch_data_0

    const-string v10, "getTypeConstructor"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_0
    const-string v10, "getSealedSubclasses"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_1
    const-string v10, "getDeclaredTypeParameters"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_2
    const-string v10, "getSource"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_3
    const-string v10, "getUnsubstitutedInnerClassesScope"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_4
    const-string v10, "getVisibility"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_5
    const-string v10, "getModality"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_6
    const-string v10, "getKind"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_7
    aput-object v13, v9, v14

    goto :goto_3

    :pswitch_8
    const-string v10, "getContainingDeclaration"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_9
    const-string v10, "getOriginal"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_a
    const-string v10, "getName"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_b
    const-string v10, "getAnnotations"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_c
    const-string v10, "getConstructors"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_d
    const-string v10, "getContextReceivers"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_e
    const-string v10, "getDefaultType"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_f
    const-string v10, "getStaticScope"

    aput-object v10, v9, v14

    goto :goto_3

    :pswitch_10
    aput-object v12, v9, v14

    goto :goto_3

    :pswitch_11
    aput-object v11, v9, v14

    goto :goto_3

    :pswitch_12
    aput-object v10, v9, v14

    :goto_3
    if-eq p0, v7, :cond_8

    if-eq p0, v6, :cond_8

    if-eq p0, v5, :cond_8

    if-eq p0, v4, :cond_8

    if-eq p0, v3, :cond_8

    if-eq p0, v2, :cond_8

    if-eq p0, v1, :cond_7

    if-eq p0, v0, :cond_6

    goto :goto_4

    :cond_6
    aput-object v13, v9, v7

    goto :goto_4

    :cond_7
    aput-object v12, v9, v7

    goto :goto_4

    :cond_8
    aput-object v11, v9, v7

    :goto_4
    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    if-eq p0, v7, :cond_9

    if-eq p0, v6, :cond_9

    if-eq p0, v5, :cond_9

    if-eq p0, v4, :cond_9

    if-eq p0, v3, :cond_9

    if-eq p0, v2, :cond_9

    if-eq p0, v1, :cond_9

    if-eq p0, v0, :cond_9

    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_12
        :pswitch_12
        :pswitch_11
        :pswitch_12
        :pswitch_12
        :pswitch_11
        :pswitch_12
        :pswitch_11
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_12
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_12
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic G0(LDh/y;Lpi/d0;)Lpi/d0;
    .locals 0

    invoke-direct {p0, p1}, LDh/y;->M0(Lpi/d0;)Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method private K0()Lpi/G0;
    .locals 3

    iget-object v0, p0, LDh/y;->d:Lpi/G0;

    if-nez v0, :cond_1

    iget-object v0, p0, LDh/y;->c:Lpi/G0;

    invoke-virtual {v0}, Lpi/G0;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LDh/y;->c:Lpi/G0;

    iput-object v0, p0, LDh/y;->d:Lpi/G0;

    goto :goto_0

    :cond_0
    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/h;->k()Lpi/v0;

    move-result-object v0

    invoke-interface {v0}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, LDh/y;->e:Ljava/util/List;

    iget-object v1, p0, LDh/y;->c:Lpi/G0;

    invoke-virtual {v1}, Lpi/G0;->j()Lpi/E0;

    move-result-object v1

    iget-object v2, p0, LDh/y;->e:Ljava/util/List;

    invoke-static {v0, v1, p0, v2}, Lpi/C;->b(Ljava/util/List;Lpi/E0;LBh/m;Ljava/util/List;)Lpi/G0;

    move-result-object v0

    iput-object v0, p0, LDh/y;->d:Lpi/G0;

    iget-object v0, p0, LDh/y;->e:Ljava/util/List;

    new-instance v1, LDh/y$a;

    invoke-direct {v1, p0}, LDh/y$a;-><init>(LDh/y;)V

    invoke-static {v0, v1}, LZg/v;->m0(Ljava/lang/Iterable;Lmh/l;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LDh/y;->f:Ljava/util/List;

    :cond_1
    :goto_0
    iget-object v0, p0, LDh/y;->d:Lpi/G0;

    return-object v0
.end method

.method private M0(Lpi/d0;)Lpi/d0;
    .locals 2

    if-eqz p1, :cond_1

    iget-object v0, p0, LDh/y;->c:Lpi/G0;

    invoke-virtual {v0}, Lpi/G0;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LDh/y;->K0()Lpi/G0;

    move-result-object v0

    sget-object v1, Lpi/N0;->INVARIANT:Lpi/N0;

    invoke-virtual {v0, p1, v1}, Lpi/G0;->p(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object p1

    check-cast p1, Lpi/d0;

    :cond_1
    :goto_0
    return-object p1
.end method


# virtual methods
.method public D()Z
    .locals 1

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/e;->D()Z

    move-result v0

    return v0
.end method

.method public E0()Lii/k;
    .locals 2

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-static {v0}, Lbi/i;->g(LBh/m;)LBh/G;

    move-result-object v0

    invoke-static {v0}, Lfi/e;->r(LBh/G;)Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    move-result-object v0

    invoke-virtual {p0, v0}, LDh/y;->i0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0xc

    invoke-static {v1}, LDh/y;->B0(I)V

    :cond_0
    return-object v0
.end method

.method public F0()Z
    .locals 1

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/C;->F0()Z

    move-result v0

    return v0
.end method

.method public H0()Ljava/util/List;
    .locals 2

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x11

    invoke-static {v1}, LDh/y;->B0(I)V

    :cond_0
    return-object v0
.end method

.method public I(Lpi/E0;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x5

    invoke-static {v0}, LDh/y;->B0(I)V

    :cond_0
    if-nez p2, :cond_1

    const/4 v0, 0x6

    invoke-static {v0}, LDh/y;->B0(I)V

    :cond_1
    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-virtual {v0, p1, p2}, LDh/z;->I(Lpi/E0;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;

    move-result-object p1

    iget-object p2, p0, LDh/y;->c:Lpi/G0;

    invoke-virtual {p2}, Lpi/G0;->k()Z

    move-result p2

    if-eqz p2, :cond_3

    if-nez p1, :cond_2

    const/4 p2, 0x7

    invoke-static {p2}, LDh/y;->B0(I)V

    :cond_2
    return-object p1

    :cond_3
    new-instance p2, Lii/t;

    invoke-direct {p0}, LDh/y;->K0()Lpi/G0;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Lii/t;-><init>(Lii/k;Lpi/G0;)V

    return-object p2
.end method

.method public I0()Z
    .locals 1

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/e;->I0()Z

    move-result v0

    return v0
.end method

.method public J0()LBh/b0;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public L()Z
    .locals 1

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/C;->L()Z

    move-result v0

    return v0
.end method

.method public L0(Lpi/G0;)LBh/e;
    .locals 2

    if-nez p1, :cond_0

    const/16 v0, 0x17

    invoke-static {v0}, LDh/y;->B0(I)V

    :cond_0
    invoke-virtual {p1}, Lpi/G0;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    new-instance v0, LDh/y;

    invoke-virtual {p1}, Lpi/G0;->j()Lpi/E0;

    move-result-object p1

    invoke-direct {p0}, LDh/y;->K0()Lpi/G0;

    move-result-object v1

    invoke-virtual {v1}, Lpi/G0;->j()Lpi/E0;

    move-result-object v1

    invoke-static {p1, v1}, Lpi/G0;->h(Lpi/E0;Lpi/E0;)Lpi/G0;

    move-result-object p1

    invoke-direct {v0, p0, p1}, LDh/y;-><init>(LDh/z;Lpi/G0;)V

    return-object v0
.end method

.method public M()Z
    .locals 1

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/i;->M()Z

    move-result v0

    return v0
.end method

.method public P()LBh/d;
    .locals 1

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/e;->P()LBh/d;

    move-result-object v0

    return-object v0
.end method

.method public Q()Lii/k;
    .locals 2

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/e;->Q()Lii/k;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0xf

    invoke-static {v1}, LDh/y;->B0(I)V

    :cond_0
    return-object v0
.end method

.method public S()LBh/e;
    .locals 1

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/e;->S()LBh/e;

    move-result-object v0

    return-object v0
.end method

.method public a()LBh/e;
    .locals 2

    .line 3
    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/e;->a()LBh/e;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x15

    invoke-static {v1}, LDh/y;->B0(I)V

    :cond_0
    return-object v0
.end method

.method public bridge synthetic a()LBh/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, LDh/y;->a()LBh/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LBh/m;
    .locals 1

    .line 2
    invoke-virtual {p0}, LDh/y;->a()LBh/e;

    move-result-object v0

    return-object v0
.end method

.method public b()LBh/m;
    .locals 2

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/e;->b()LBh/m;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x16

    invoke-static {v1}, LDh/y;->B0(I)V

    :cond_0
    return-object v0
.end method

.method public bridge synthetic c(Lpi/G0;)LBh/n;
    .locals 0

    invoke-virtual {p0, p1}, LDh/y;->L0(Lpi/G0;)LBh/e;

    move-result-object p1

    return-object p1
.end method

.method public getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 2

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x13

    invoke-static {v1}, LDh/y;->B0(I)V

    :cond_0
    return-object v0
.end method

.method public getName()LZh/f;
    .locals 2

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/I;->getName()LZh/f;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x14

    invoke-static {v1}, LDh/y;->B0(I)V

    :cond_0
    return-object v0
.end method

.method public getVisibility()LBh/u;
    .locals 2

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/e;->getVisibility()LBh/u;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x1b

    invoke-static {v1}, LDh/y;->B0(I)V

    :cond_0
    return-object v0
.end method

.method public h()LBh/f;
    .locals 2

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/e;->h()LBh/f;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x19

    invoke-static {v1}, LDh/y;->B0(I)V

    :cond_0
    return-object v0
.end method

.method public i0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;
    .locals 2

    if-nez p1, :cond_0

    const/16 v0, 0xd

    invoke-static {v0}, LDh/y;->B0(I)V

    :cond_0
    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-virtual {v0, p1}, LDh/z;->i0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;

    move-result-object p1

    iget-object v0, p0, LDh/y;->c:Lpi/G0;

    invoke-virtual {v0}, Lpi/G0;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    if-nez p1, :cond_1

    const/16 v0, 0xe

    invoke-static {v0}, LDh/y;->B0(I)V

    :cond_1
    return-object p1

    :cond_2
    new-instance v0, Lii/t;

    invoke-direct {p0}, LDh/y;->K0()Lpi/G0;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lii/t;-><init>(Lii/k;Lpi/G0;)V

    return-object v0
.end method

.method public isExternal()Z
    .locals 1

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/C;->isExternal()Z

    move-result v0

    return v0
.end method

.method public isInline()Z
    .locals 1

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/e;->isInline()Z

    move-result v0

    return v0
.end method

.method public j()LBh/g0;
    .locals 2

    sget-object v0, LBh/g0;->a:LBh/g0;

    if-nez v0, :cond_0

    const/16 v1, 0x1d

    invoke-static {v1}, LDh/y;->B0(I)V

    :cond_0
    return-object v0
.end method

.method public k()Lpi/v0;
    .locals 5

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/h;->k()Lpi/v0;

    move-result-object v0

    iget-object v1, p0, LDh/y;->c:Lpi/G0;

    invoke-virtual {v1}, Lpi/G0;->k()Z

    move-result v1

    if-eqz v1, :cond_1

    if-nez v0, :cond_0

    const/4 v1, 0x0

    invoke-static {v1}, LDh/y;->B0(I)V

    :cond_0
    return-object v0

    :cond_1
    iget-object v1, p0, LDh/y;->g:Lpi/v0;

    if-nez v1, :cond_3

    invoke-direct {p0}, LDh/y;->K0()Lpi/G0;

    move-result-object v1

    invoke-interface {v0}, Lpi/v0;->a()Ljava/util/Collection;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpi/S;

    sget-object v4, Lpi/N0;->INVARIANT:Lpi/N0;

    invoke-virtual {v1, v3, v4}, Lpi/G0;->p(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v0, Lpi/u;

    iget-object v1, p0, LDh/y;->e:Ljava/util/List;

    sget-object v3, Loi/f;->e:Loi/n;

    invoke-direct {v0, p0, v1, v2, v3}, Lpi/u;-><init>(LBh/e;Ljava/util/List;Ljava/util/Collection;Loi/n;)V

    iput-object v0, p0, LDh/y;->g:Lpi/v0;

    :cond_3
    iget-object v0, p0, LDh/y;->g:Lpi/v0;

    if-nez v0, :cond_4

    const/4 v1, 0x1

    invoke-static {v1}, LDh/y;->B0(I)V

    :cond_4
    return-object v0
.end method

.method public l()LBh/D;
    .locals 2

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/e;->l()LBh/D;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x1a

    invoke-static {v1}, LDh/y;->B0(I)V

    :cond_0
    return-object v0
.end method

.method public m()Ljava/util/Collection;
    .locals 5

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/e;->m()Ljava/util/Collection;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/d;

    invoke-interface {v2}, LBh/z;->v()LBh/z$a;

    move-result-object v3

    invoke-interface {v2}, LBh/d;->a()LBh/d;

    move-result-object v4

    invoke-interface {v3, v4}, LBh/z$a;->j(LBh/b;)LBh/z$a;

    move-result-object v3

    invoke-interface {v2}, LBh/C;->l()LBh/D;

    move-result-object v4

    invoke-interface {v3, v4}, LBh/z$a;->h(LBh/D;)LBh/z$a;

    move-result-object v3

    invoke-interface {v2}, LBh/C;->getVisibility()LBh/u;

    move-result-object v4

    invoke-interface {v3, v4}, LBh/z$a;->f(LBh/u;)LBh/z$a;

    move-result-object v3

    invoke-interface {v2}, LBh/b;->h()LBh/b$a;

    move-result-object v2

    invoke-interface {v3, v2}, LBh/z$a;->s(LBh/b$a;)LBh/z$a;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v2, v3}, LBh/z$a;->m(Z)LBh/z$a;

    move-result-object v2

    invoke-interface {v2}, LBh/z$a;->a()LBh/z;

    move-result-object v2

    check-cast v2, LBh/d;

    invoke-direct {p0}, LDh/y;->K0()Lpi/G0;

    move-result-object v3

    invoke-interface {v2, v3}, LBh/d;->c(Lpi/G0;)LBh/d;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public n()Ljava/util/Collection;
    .locals 2

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/e;->n()Ljava/util/Collection;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x1f

    invoke-static {v1}, LDh/y;->B0(I)V

    :cond_0
    return-object v0
.end method

.method public o()Z
    .locals 1

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/e;->o()Z

    move-result v0

    return v0
.end method

.method public t0(LBh/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, LBh/o;->l(LBh/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public u()Lpi/d0;
    .locals 5

    invoke-virtual {p0}, LDh/y;->k()Lpi/v0;

    move-result-object v0

    invoke-interface {v0}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lpi/J0;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sget-object v1, Lpi/x;->a:Lpi/x;

    invoke-virtual {p0}, LDh/y;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v3}, Lpi/x;->a(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lpi/v0;LBh/m;)Lpi/r0;

    move-result-object v1

    invoke-virtual {p0}, LDh/y;->k()Lpi/v0;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0}, LDh/y;->E0()Lii/k;

    move-result-object v4

    invoke-static {v1, v2, v0, v3, v4}, Lpi/V;->m(Lpi/r0;Lpi/v0;Ljava/util/List;ZLii/k;)Lpi/d0;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x10

    invoke-static {v1}, LDh/y;->B0(I)V

    :cond_0
    return-object v0
.end method

.method public w()Ljava/util/List;
    .locals 2

    invoke-direct {p0}, LDh/y;->K0()Lpi/G0;

    iget-object v0, p0, LDh/y;->f:Ljava/util/List;

    if-nez v0, :cond_0

    const/16 v1, 0x1e

    invoke-static {v1}, LDh/y;->B0(I)V

    :cond_0
    return-object v0
.end method

.method public w0(Lpi/E0;)Lii/k;
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0xa

    invoke-static {v0}, LDh/y;->B0(I)V

    :cond_0
    invoke-static {p0}, Lbi/i;->g(LBh/m;)LBh/G;

    move-result-object v0

    invoke-static {v0}, Lfi/e;->r(LBh/G;)Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, LDh/y;->I(Lpi/E0;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;

    move-result-object p1

    if-nez p1, :cond_1

    const/16 v0, 0xb

    invoke-static {v0}, LDh/y;->B0(I)V

    :cond_1
    return-object p1
.end method

.method public y0()Lii/k;
    .locals 2

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/e;->y0()Lii/k;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x1c

    invoke-static {v1}, LDh/y;->B0(I)V

    :cond_0
    return-object v0
.end method

.method public z()Z
    .locals 1

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/e;->z()Z

    move-result v0

    return v0
.end method

.method public z0()LBh/q0;
    .locals 2

    iget-object v0, p0, LDh/y;->b:LDh/z;

    invoke-interface {v0}, LBh/e;->z0()LBh/q0;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v1, LDh/y$b;

    invoke-direct {v1, p0}, LDh/y$b;-><init>(LDh/y;)V

    invoke-virtual {v0, v1}, LBh/q0;->b(Lmh/l;)LBh/q0;

    move-result-object v0

    return-object v0
.end method
