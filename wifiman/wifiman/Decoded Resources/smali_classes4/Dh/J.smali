.class public abstract LDh/J;
.super LDh/n;
.source "SourceFile"

# interfaces
.implements LBh/X;


# instance fields
.field private e:Z

.field private final f:Z

.field private final g:LBh/D;

.field private final h:LBh/Y;

.field private final i:Z

.field private final j:LBh/b$a;

.field private k:LBh/u;

.field private l:LBh/z;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LBh/D;LBh/u;LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;ZZZLBh/b$a;LBh/g0;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LDh/J;->I(I)V

    :cond_0
    if-nez p2, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, LDh/J;->I(I)V

    :cond_1
    if-nez p3, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, LDh/J;->I(I)V

    :cond_2
    if-nez p4, :cond_3

    const/4 v0, 0x3

    invoke-static {v0}, LDh/J;->I(I)V

    :cond_3
    if-nez p5, :cond_4

    const/4 v0, 0x4

    invoke-static {v0}, LDh/J;->I(I)V

    :cond_4
    if-nez p10, :cond_5

    const/4 v0, 0x5

    invoke-static {v0}, LDh/J;->I(I)V

    :cond_5
    invoke-interface {p3}, LBh/r0;->b()LBh/m;

    move-result-object v0

    invoke-direct {p0, v0, p4, p5, p10}, LDh/n;-><init>(LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/g0;)V

    const/4 p4, 0x0

    iput-object p4, p0, LDh/J;->l:LBh/z;

    iput-object p1, p0, LDh/J;->g:LBh/D;

    iput-object p2, p0, LDh/J;->k:LBh/u;

    iput-object p3, p0, LDh/J;->h:LBh/Y;

    iput-boolean p6, p0, LDh/J;->e:Z

    iput-boolean p7, p0, LDh/J;->f:Z

    iput-boolean p8, p0, LDh/J;->i:Z

    iput-object p9, p0, LDh/J;->j:LBh/b$a;

    return-void
.end method

.method private static synthetic I(I)V
    .locals 6

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

    const-string v3, "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl"

    const/4 v4, 0x0

    packed-switch p0, :pswitch_data_2

    const-string v5, "modality"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_4
    const-string v5, "overriddenDescriptors"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_5
    const-string v5, "substitutor"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_6
    aput-object v3, v2, v4

    goto :goto_2

    :pswitch_7
    const-string v5, "source"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_8
    const-string v5, "name"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_9
    const-string v5, "annotations"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_a
    const-string v5, "correspondingProperty"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_b
    const-string v5, "visibility"

    aput-object v5, v2, v4

    :goto_2
    const-string v4, "substitute"

    const/4 v5, 0x1

    packed-switch p0, :pswitch_data_3

    :pswitch_c
    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_d
    const-string v3, "getOverriddenDescriptors"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_e
    const-string v3, "getContextReceiverParameters"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_f
    const-string v3, "getCorrespondingProperty"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_10
    const-string v3, "getCorrespondingVariable"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_11
    const-string v3, "getVisibility"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_12
    const-string v3, "getModality"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_13
    const-string v3, "getTypeParameters"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_14
    aput-object v4, v2, v5

    goto :goto_3

    :pswitch_15
    const-string v3, "getKind"

    aput-object v3, v2, v5

    :goto_3
    packed-switch p0, :pswitch_data_4

    const-string v3, "<init>"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_16
    const-string v3, "setOverriddenDescriptors"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_17
    aput-object v4, v2, v1

    :goto_4
    :pswitch_18
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    packed-switch p0, :pswitch_data_5

    :pswitch_19
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :pswitch_1a
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x6
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_4
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x6
        :pswitch_15
        :pswitch_c
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x6
        :pswitch_18
        :pswitch_17
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_16
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x6
        :pswitch_1a
        :pswitch_19
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
        :pswitch_1a
    .end packed-switch
.end method


# virtual methods
.method public C0()LBh/Y;
    .locals 2

    iget-object v0, p0, LDh/J;->h:LBh/Y;

    if-nez v0, :cond_0

    const/16 v1, 0xd

    invoke-static {v1}, LDh/J;->I(I)V

    :cond_0
    return-object v0
.end method

.method public D0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public F0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public G0(LBh/m;LBh/D;LBh/u;LBh/b$a;Z)LBh/X;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Accessors must be copied by the corresponding property"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public H()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected K0(Z)Ljava/util/Collection;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, LDh/J;->C0()LBh/Y;

    move-result-object v1

    invoke-interface {v1}, LBh/Y;->f()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/Y;

    if-eqz p1, :cond_1

    invoke-interface {v2}, LBh/Y;->d()LBh/Z;

    move-result-object v2

    goto :goto_1

    :cond_1
    invoke-interface {v2}, LBh/Y;->g()LBh/a0;

    move-result-object v2

    :goto_1
    if-eqz v2, :cond_0

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public L()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public L0(Z)V
    .locals 0

    iput-boolean p1, p0, LDh/J;->e:Z

    return-void
.end method

.method public M0(LBh/z;)V
    .locals 0

    iput-object p1, p0, LDh/J;->l:LBh/z;

    return-void
.end method

.method public N0(LBh/u;)V
    .locals 0

    iput-object p1, p0, LDh/J;->k:LBh/u;

    return-void
.end method

.method public O()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public T()Z
    .locals 1

    iget-boolean v0, p0, LDh/J;->e:Z

    return v0
.end method

.method public a0()LBh/z;
    .locals 1

    iget-object v0, p0, LDh/J;->l:LBh/z;

    return-object v0
.end method

.method public bridge synthetic c(Lpi/G0;)LBh/n;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, LDh/J;->c(Lpi/G0;)LBh/z;

    move-result-object p1

    return-object p1
.end method

.method public c(Lpi/G0;)LBh/z;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    const/4 p1, 0x7

    invoke-static {p1}, LDh/J;->I(I)V

    :cond_0
    return-object p0
.end method

.method public bridge synthetic c0(LBh/m;LBh/D;LBh/u;LBh/b$a;Z)LBh/b;
    .locals 0

    invoke-virtual/range {p0 .. p5}, LDh/J;->G0(LBh/m;LBh/D;LBh/u;LBh/b$a;Z)LBh/X;

    move-result-object p1

    return-object p1
.end method

.method public d0()LBh/b0;
    .locals 1

    invoke-virtual {p0}, LDh/J;->C0()LBh/Y;

    move-result-object v0

    invoke-interface {v0}, LBh/a;->d0()LBh/b0;

    move-result-object v0

    return-object v0
.end method

.method public e0(LBh/a$a;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getTypeParameters()Ljava/util/List;
    .locals 2

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x9

    invoke-static {v1}, LDh/J;->I(I)V

    :cond_0
    return-object v0
.end method

.method public getVisibility()LBh/u;
    .locals 2

    iget-object v0, p0, LDh/J;->k:LBh/u;

    if-nez v0, :cond_0

    const/16 v1, 0xb

    invoke-static {v1}, LDh/J;->I(I)V

    :cond_0
    return-object v0
.end method

.method public h()LBh/b$a;
    .locals 2

    iget-object v0, p0, LDh/J;->j:LBh/b$a;

    if-nez v0, :cond_0

    const/4 v1, 0x6

    invoke-static {v1}, LDh/J;->I(I)V

    :cond_0
    return-object v0
.end method

.method public isExternal()Z
    .locals 1

    iget-boolean v0, p0, LDh/J;->f:Z

    return v0
.end method

.method public isInfix()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isInline()Z
    .locals 1

    iget-boolean v0, p0, LDh/J;->i:Z

    return v0
.end method

.method public isOperator()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isSuspend()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public k0()LBh/b0;
    .locals 1

    invoke-virtual {p0}, LDh/J;->C0()LBh/Y;

    move-result-object v0

    invoke-interface {v0}, LBh/a;->k0()LBh/b0;

    move-result-object v0

    return-object v0
.end method

.method public l()LBh/D;
    .locals 2

    iget-object v0, p0, LDh/J;->g:LBh/D;

    if-nez v0, :cond_0

    const/16 v1, 0xa

    invoke-static {v1}, LDh/J;->I(I)V

    :cond_0
    return-object v0
.end method

.method public p0()Ljava/util/List;
    .locals 2

    invoke-virtual {p0}, LDh/J;->C0()LBh/Y;

    move-result-object v0

    invoke-interface {v0}, LBh/a;->p0()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0xe

    invoke-static {v1}, LDh/J;->I(I)V

    :cond_0
    return-object v0
.end method

.method public v0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public x0(Ljava/util/Collection;)V
    .locals 0

    if-nez p1, :cond_0

    const/16 p1, 0x10

    invoke-static {p1}, LDh/J;->I(I)V

    :cond_0
    return-void
.end method
