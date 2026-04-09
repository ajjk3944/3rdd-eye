.class public abstract LDh/a;
.super LDh/z;
.source "SourceFile"


# instance fields
.field private final b:LZh/f;

.field protected final c:Loi/i;

.field private final d:Loi/i;

.field private final e:Loi/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Loi/n;LZh/f;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LDh/a;->B0(I)V

    :cond_0
    if-nez p2, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, LDh/a;->B0(I)V

    :cond_1
    invoke-direct {p0}, LDh/z;-><init>()V

    iput-object p2, p0, LDh/a;->b:LZh/f;

    new-instance p2, LDh/a$a;

    invoke-direct {p2, p0}, LDh/a$a;-><init>(LDh/a;)V

    invoke-interface {p1, p2}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p2

    iput-object p2, p0, LDh/a;->c:Loi/i;

    new-instance p2, LDh/a$b;

    invoke-direct {p2, p0}, LDh/a$b;-><init>(LDh/a;)V

    invoke-interface {p1, p2}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p2

    iput-object p2, p0, LDh/a;->d:Loi/i;

    new-instance p2, LDh/a$c;

    invoke-direct {p2, p0}, LDh/a$c;-><init>(LDh/a;)V

    invoke-interface {p1, p2}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, LDh/a;->e:Loi/i;

    return-void
.end method

.method private static synthetic B0(I)V
    .locals 19

    move/from16 v0, p0

    const/16 v1, 0x14

    const/16 v2, 0x13

    const/16 v3, 0x11

    const/16 v4, 0x10

    const/16 v5, 0xe

    const/16 v6, 0xc

    const/16 v7, 0x9

    const/4 v8, 0x6

    const/4 v9, 0x5

    const/4 v10, 0x4

    const/4 v11, 0x3

    const/4 v12, 0x2

    if-eq v0, v12, :cond_0

    if-eq v0, v11, :cond_0

    if-eq v0, v10, :cond_0

    if-eq v0, v9, :cond_0

    if-eq v0, v8, :cond_0

    if-eq v0, v7, :cond_0

    if-eq v0, v6, :cond_0

    if-eq v0, v5, :cond_0

    if-eq v0, v4, :cond_0

    if-eq v0, v3, :cond_0

    if-eq v0, v2, :cond_0

    if-eq v0, v1, :cond_0

    const-string v13, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v13, "@NotNull method %s.%s must not return null"

    :goto_0
    if-eq v0, v12, :cond_1

    if-eq v0, v11, :cond_1

    if-eq v0, v10, :cond_1

    if-eq v0, v9, :cond_1

    if-eq v0, v8, :cond_1

    if-eq v0, v7, :cond_1

    if-eq v0, v6, :cond_1

    if-eq v0, v5, :cond_1

    if-eq v0, v4, :cond_1

    if-eq v0, v3, :cond_1

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_1

    move v14, v11

    goto :goto_1

    :cond_1
    move v14, v12

    :goto_1
    new-array v14, v14, [Ljava/lang/Object;

    const-string v15, "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor"

    const/16 v16, 0x0

    packed-switch v0, :pswitch_data_0

    const-string v17, "storageManager"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_0
    const-string v17, "substitutor"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_1
    const-string v17, "typeSubstitution"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_2
    const-string v17, "kotlinTypeRefiner"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_3
    const-string v17, "typeArguments"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_4
    aput-object v15, v14, v16

    goto :goto_2

    :pswitch_5
    const-string v17, "name"

    aput-object v17, v14, v16

    :goto_2
    const-string v16, "getMemberScope"

    const-string v17, "substitute"

    const/16 v18, 0x1

    if-eq v0, v12, :cond_a

    if-eq v0, v11, :cond_9

    if-eq v0, v10, :cond_8

    if-eq v0, v9, :cond_7

    if-eq v0, v8, :cond_6

    if-eq v0, v7, :cond_5

    if-eq v0, v6, :cond_5

    if-eq v0, v5, :cond_5

    if-eq v0, v4, :cond_5

    if-eq v0, v3, :cond_4

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    aput-object v15, v14, v18

    goto :goto_3

    :cond_2
    const-string v15, "getDefaultType"

    aput-object v15, v14, v18

    goto :goto_3

    :cond_3
    aput-object v17, v14, v18

    goto :goto_3

    :cond_4
    const-string v15, "getUnsubstitutedMemberScope"

    aput-object v15, v14, v18

    goto :goto_3

    :cond_5
    aput-object v16, v14, v18

    goto :goto_3

    :cond_6
    const-string v15, "getContextReceivers"

    aput-object v15, v14, v18

    goto :goto_3

    :cond_7
    const-string v15, "getThisAsReceiverParameter"

    aput-object v15, v14, v18

    goto :goto_3

    :cond_8
    const-string v15, "getUnsubstitutedInnerClassesScope"

    aput-object v15, v14, v18

    goto :goto_3

    :cond_9
    const-string v15, "getOriginal"

    aput-object v15, v14, v18

    goto :goto_3

    :cond_a
    const-string v15, "getName"

    aput-object v15, v14, v18

    :goto_3
    packed-switch v0, :pswitch_data_1

    const-string v15, "<init>"

    aput-object v15, v14, v12

    goto :goto_4

    :pswitch_6
    aput-object v17, v14, v12

    goto :goto_4

    :pswitch_7
    aput-object v16, v14, v12

    :goto_4
    :pswitch_8
    invoke-static {v13, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    if-eq v0, v12, :cond_b

    if-eq v0, v11, :cond_b

    if-eq v0, v10, :cond_b

    if-eq v0, v9, :cond_b

    if-eq v0, v8, :cond_b

    if-eq v0, v7, :cond_b

    if-eq v0, v6, :cond_b

    if-eq v0, v5, :cond_b

    if-eq v0, v4, :cond_b

    if-eq v0, v3, :cond_b

    if-eq v0, v2, :cond_b

    if-eq v0, v1, :cond_b

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_0
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_8
        :pswitch_7
        :pswitch_8
        :pswitch_7
        :pswitch_8
        :pswitch_8
        :pswitch_6
        :pswitch_8
        :pswitch_8
    .end packed-switch
.end method


# virtual methods
.method public E0()Lii/k;
    .locals 2

    invoke-static {p0}, Lbi/i;->g(LBh/m;)LBh/G;

    move-result-object v0

    invoke-static {v0}, Lfi/e;->r(LBh/G;)Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    move-result-object v0

    invoke-virtual {p0, v0}, LDh/z;->i0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x11

    invoke-static {v1}, LDh/a;->B0(I)V

    :cond_0
    return-object v0
.end method

.method public G0(Lpi/G0;)LBh/e;
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0x12

    invoke-static {v0}, LDh/a;->B0(I)V

    :cond_0
    invoke-virtual {p1}, Lpi/G0;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    new-instance v0, LDh/y;

    invoke-direct {v0, p0, p1}, LDh/y;-><init>(LDh/z;Lpi/G0;)V

    return-object v0
.end method

.method public H0()Ljava/util/List;
    .locals 2

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v1, 0x6

    invoke-static {v1}, LDh/a;->B0(I)V

    :cond_0
    return-object v0
.end method

.method public I(Lpi/E0;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0xa

    invoke-static {v0}, LDh/a;->B0(I)V

    :cond_0
    if-nez p2, :cond_1

    const/16 v0, 0xb

    invoke-static {v0}, LDh/a;->B0(I)V

    :cond_1
    invoke-virtual {p1}, Lpi/E0;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, p2}, LDh/z;->i0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;

    move-result-object p1

    if-nez p1, :cond_2

    const/16 p2, 0xc

    invoke-static {p2}, LDh/a;->B0(I)V

    :cond_2
    return-object p1

    :cond_3
    invoke-static {p1}, Lpi/G0;->g(Lpi/E0;)Lpi/G0;

    move-result-object p1

    new-instance v0, Lii/t;

    invoke-virtual {p0, p2}, LDh/z;->i0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Lii/t;-><init>(Lii/k;Lpi/G0;)V

    return-object v0
.end method

.method public J0()LBh/b0;
    .locals 2

    iget-object v0, p0, LDh/a;->e:Loi/i;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/b0;

    if-nez v0, :cond_0

    const/4 v1, 0x5

    invoke-static {v1}, LDh/a;->B0(I)V

    :cond_0
    return-object v0
.end method

.method public a()LBh/e;
    .locals 0

    .line 3
    return-object p0
.end method

.method public bridge synthetic a()LBh/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, LDh/a;->a()LBh/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LBh/m;
    .locals 1

    .line 2
    invoke-virtual {p0}, LDh/a;->a()LBh/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Lpi/G0;)LBh/n;
    .locals 0

    invoke-virtual {p0, p1}, LDh/a;->G0(Lpi/G0;)LBh/e;

    move-result-object p1

    return-object p1
.end method

.method public getName()LZh/f;
    .locals 2

    iget-object v0, p0, LDh/a;->b:LZh/f;

    if-nez v0, :cond_0

    const/4 v1, 0x2

    invoke-static {v1}, LDh/a;->B0(I)V

    :cond_0
    return-object v0
.end method

.method public t0(LBh/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, LBh/o;->l(LBh/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public u()Lpi/d0;
    .locals 2

    iget-object v0, p0, LDh/a;->c:Loi/i;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpi/d0;

    if-nez v0, :cond_0

    const/16 v1, 0x14

    invoke-static {v1}, LDh/a;->B0(I)V

    :cond_0
    return-object v0
.end method

.method public w0(Lpi/E0;)Lii/k;
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0xf

    invoke-static {v0}, LDh/a;->B0(I)V

    :cond_0
    invoke-static {p0}, Lbi/i;->g(LBh/m;)LBh/G;

    move-result-object v0

    invoke-static {v0}, Lfi/e;->r(LBh/G;)Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, LDh/a;->I(Lpi/E0;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;

    move-result-object p1

    if-nez p1, :cond_1

    const/16 v0, 0x10

    invoke-static {v0}, LDh/a;->B0(I)V

    :cond_1
    return-object p1
.end method

.method public y0()Lii/k;
    .locals 2

    iget-object v0, p0, LDh/a;->d:Loi/i;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lii/k;

    if-nez v0, :cond_0

    const/4 v1, 0x4

    invoke-static {v1}, LDh/a;->B0(I)V

    :cond_0
    return-object v0
.end method
