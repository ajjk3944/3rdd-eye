.class public LDh/K$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDh/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field private a:LBh/m;

.field private b:LBh/D;

.field private c:LBh/u;

.field private d:LBh/Y;

.field private e:Z

.field private f:LBh/b$a;

.field private g:Lpi/E0;

.field private h:Z

.field private i:LBh/b0;

.field private j:Ljava/util/List;

.field private k:LZh/f;

.field private l:Lpi/S;

.field final synthetic m:LDh/K;


# direct methods
.method public constructor <init>(LDh/K;)V
    .locals 2

    iput-object p1, p0, LDh/K$a;->m:LDh/K;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, LDh/n;->b()LBh/m;

    move-result-object v0

    iput-object v0, p0, LDh/K$a;->a:LBh/m;

    invoke-virtual {p1}, LDh/K;->l()LBh/D;

    move-result-object v0

    iput-object v0, p0, LDh/K$a;->b:LBh/D;

    invoke-virtual {p1}, LDh/K;->getVisibility()LBh/u;

    move-result-object v0

    iput-object v0, p0, LDh/K$a;->c:LBh/u;

    const/4 v0, 0x0

    iput-object v0, p0, LDh/K$a;->d:LBh/Y;

    const/4 v1, 0x0

    iput-boolean v1, p0, LDh/K$a;->e:Z

    invoke-virtual {p1}, LDh/K;->h()LBh/b$a;

    move-result-object v1

    iput-object v1, p0, LDh/K$a;->f:LBh/b$a;

    sget-object v1, Lpi/E0;->b:Lpi/E0;

    iput-object v1, p0, LDh/K$a;->g:Lpi/E0;

    const/4 v1, 0x1

    iput-boolean v1, p0, LDh/K$a;->h:Z

    invoke-static {p1}, LDh/K;->M0(LDh/K;)LBh/b0;

    move-result-object v1

    iput-object v1, p0, LDh/K$a;->i:LBh/b0;

    iput-object v0, p0, LDh/K$a;->j:Ljava/util/List;

    invoke-virtual {p1}, LDh/m;->getName()LZh/f;

    move-result-object v0

    iput-object v0, p0, LDh/K$a;->k:LZh/f;

    invoke-virtual {p1}, LDh/X;->getType()Lpi/S;

    move-result-object p1

    iput-object p1, p0, LDh/K$a;->l:Lpi/S;

    return-void
.end method

.method private static synthetic a(I)V
    .locals 24

    move/from16 v0, p0

    const/16 v1, 0x11

    const/16 v2, 0x10

    const/16 v3, 0xe

    const/16 v4, 0xd

    const/16 v5, 0x13

    const/16 v6, 0xb

    const/16 v7, 0x9

    const/4 v8, 0x7

    const/4 v9, 0x5

    const/4 v10, 0x3

    const/4 v11, 0x2

    const/4 v12, 0x1

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

    move v14, v10

    goto :goto_1

    :cond_1
    move v14, v11

    :goto_1
    new-array v14, v14, [Ljava/lang/Object;

    const-string v15, "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration"

    const/16 v16, 0x0

    packed-switch v0, :pswitch_data_0

    const-string v17, "owner"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_0
    const-string v17, "name"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_1
    const-string v17, "substitution"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_2
    const-string v17, "typeParameters"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_3
    const-string v17, "kind"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_4
    const-string v17, "visibility"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_5
    const-string v17, "modality"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_6
    const-string v17, "type"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_7
    aput-object v15, v14, v16

    :goto_2
    const-string v16, "setOwner"

    const-string v17, "setReturnType"

    const-string v18, "setModality"

    const-string v19, "setVisibility"

    const-string v20, "setKind"

    const-string v21, "setTypeParameters"

    const-string v22, "setSubstitution"

    const-string v23, "setName"

    if-eq v0, v12, :cond_d

    if-eq v0, v11, :cond_c

    if-eq v0, v10, :cond_b

    if-eq v0, v9, :cond_a

    if-eq v0, v8, :cond_9

    if-eq v0, v7, :cond_8

    if-eq v0, v6, :cond_7

    if-eq v0, v5, :cond_6

    if-eq v0, v4, :cond_5

    if-eq v0, v3, :cond_4

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    aput-object v15, v14, v12

    goto :goto_3

    :cond_2
    const-string v15, "setCopyOverrides"

    aput-object v15, v14, v12

    goto :goto_3

    :cond_3
    aput-object v22, v14, v12

    goto :goto_3

    :cond_4
    const-string v15, "setDispatchReceiverParameter"

    aput-object v15, v14, v12

    goto :goto_3

    :cond_5
    aput-object v21, v14, v12

    goto :goto_3

    :cond_6
    aput-object v23, v14, v12

    goto :goto_3

    :cond_7
    aput-object v20, v14, v12

    goto :goto_3

    :cond_8
    aput-object v19, v14, v12

    goto :goto_3

    :cond_9
    aput-object v18, v14, v12

    goto :goto_3

    :cond_a
    aput-object v17, v14, v12

    goto :goto_3

    :cond_b
    const-string v15, "setPreserveSourceElement"

    aput-object v15, v14, v12

    goto :goto_3

    :cond_c
    const-string v15, "setOriginal"

    aput-object v15, v14, v12

    goto :goto_3

    :cond_d
    aput-object v16, v14, v12

    :goto_3
    packed-switch v0, :pswitch_data_1

    aput-object v16, v14, v11

    goto :goto_4

    :pswitch_8
    aput-object v23, v14, v11

    goto :goto_4

    :pswitch_9
    aput-object v22, v14, v11

    goto :goto_4

    :pswitch_a
    aput-object v21, v14, v11

    goto :goto_4

    :pswitch_b
    aput-object v20, v14, v11

    goto :goto_4

    :pswitch_c
    aput-object v19, v14, v11

    goto :goto_4

    :pswitch_d
    aput-object v18, v14, v11

    goto :goto_4

    :pswitch_e
    aput-object v17, v14, v11

    :goto_4
    :pswitch_f
    invoke-static {v13, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    if-eq v0, v12, :cond_e

    if-eq v0, v11, :cond_e

    if-eq v0, v10, :cond_e

    if-eq v0, v9, :cond_e

    if-eq v0, v8, :cond_e

    if-eq v0, v7, :cond_e

    if-eq v0, v6, :cond_e

    if-eq v0, v5, :cond_e

    if-eq v0, v4, :cond_e

    if-eq v0, v3, :cond_e

    if-eq v0, v2, :cond_e

    if-eq v0, v1, :cond_e

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_7
        :pswitch_5
        :pswitch_7
        :pswitch_4
        :pswitch_7
        :pswitch_3
        :pswitch_7
        :pswitch_2
        :pswitch_7
        :pswitch_7
        :pswitch_1
        :pswitch_7
        :pswitch_7
        :pswitch_0
        :pswitch_7
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_e
        :pswitch_f
        :pswitch_d
        :pswitch_f
        :pswitch_c
        :pswitch_f
        :pswitch_b
        :pswitch_f
        :pswitch_a
        :pswitch_f
        :pswitch_f
        :pswitch_9
        :pswitch_f
        :pswitch_f
        :pswitch_8
        :pswitch_f
    .end packed-switch
.end method

.method static synthetic b(LDh/K$a;)LBh/m;
    .locals 0

    iget-object p0, p0, LDh/K$a;->a:LBh/m;

    return-object p0
.end method

.method static synthetic c(LDh/K$a;)Lpi/S;
    .locals 0

    iget-object p0, p0, LDh/K$a;->l:Lpi/S;

    return-object p0
.end method

.method static synthetic d(LDh/K$a;)LBh/b0;
    .locals 0

    iget-object p0, p0, LDh/K$a;->i:LBh/b0;

    return-object p0
.end method

.method static synthetic e(LDh/K$a;)Z
    .locals 0

    iget-boolean p0, p0, LDh/K$a;->h:Z

    return p0
.end method

.method static synthetic f(LDh/K$a;)LBh/D;
    .locals 0

    iget-object p0, p0, LDh/K$a;->b:LBh/D;

    return-object p0
.end method

.method static synthetic g(LDh/K$a;)LBh/u;
    .locals 0

    iget-object p0, p0, LDh/K$a;->c:LBh/u;

    return-object p0
.end method

.method static synthetic h(LDh/K$a;)LBh/Y;
    .locals 0

    iget-object p0, p0, LDh/K$a;->d:LBh/Y;

    return-object p0
.end method

.method static synthetic i(LDh/K$a;)LBh/b$a;
    .locals 0

    iget-object p0, p0, LDh/K$a;->f:LBh/b$a;

    return-object p0
.end method

.method static synthetic j(LDh/K$a;)LZh/f;
    .locals 0

    iget-object p0, p0, LDh/K$a;->k:LZh/f;

    return-object p0
.end method

.method static synthetic k(LDh/K$a;)Z
    .locals 0

    iget-boolean p0, p0, LDh/K$a;->e:Z

    return p0
.end method

.method static synthetic l(LDh/K$a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LDh/K$a;->j:Ljava/util/List;

    return-object p0
.end method

.method static synthetic m(LDh/K$a;)Lpi/E0;
    .locals 0

    iget-object p0, p0, LDh/K$a;->g:Lpi/E0;

    return-object p0
.end method


# virtual methods
.method public n()LBh/Y;
    .locals 1

    iget-object v0, p0, LDh/K$a;->m:LDh/K;

    invoke-virtual {v0, p0}, LDh/K;->Q0(LDh/K$a;)LBh/Y;

    move-result-object v0

    return-object v0
.end method

.method o()LBh/Z;
    .locals 1

    iget-object v0, p0, LDh/K$a;->d:LBh/Y;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v0}, LBh/Y;->d()LBh/Z;

    move-result-object v0

    return-object v0
.end method

.method p()LBh/a0;
    .locals 1

    iget-object v0, p0, LDh/K$a;->d:LBh/Y;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v0}, LBh/Y;->g()LBh/a0;

    move-result-object v0

    return-object v0
.end method

.method public q(Z)LDh/K$a;
    .locals 0

    iput-boolean p1, p0, LDh/K$a;->h:Z

    return-object p0
.end method

.method public r(LBh/b$a;)LDh/K$a;
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0xa

    invoke-static {v0}, LDh/K$a;->a(I)V

    :cond_0
    iput-object p1, p0, LDh/K$a;->f:LBh/b$a;

    return-object p0
.end method

.method public s(LBh/D;)LDh/K$a;
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x6

    invoke-static {v0}, LDh/K$a;->a(I)V

    :cond_0
    iput-object p1, p0, LDh/K$a;->b:LBh/D;

    return-object p0
.end method

.method public t(LBh/b;)LDh/K$a;
    .locals 0

    check-cast p1, LBh/Y;

    iput-object p1, p0, LDh/K$a;->d:LBh/Y;

    return-object p0
.end method

.method public u(LBh/m;)LDh/K$a;
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LDh/K$a;->a(I)V

    :cond_0
    iput-object p1, p0, LDh/K$a;->a:LBh/m;

    return-object p0
.end method

.method public v(Lpi/E0;)LDh/K$a;
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0xf

    invoke-static {v0}, LDh/K$a;->a(I)V

    :cond_0
    iput-object p1, p0, LDh/K$a;->g:Lpi/E0;

    return-object p0
.end method

.method public w(LBh/u;)LDh/K$a;
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0x8

    invoke-static {v0}, LDh/K$a;->a(I)V

    :cond_0
    iput-object p1, p0, LDh/K$a;->c:LBh/u;

    return-object p0
.end method
