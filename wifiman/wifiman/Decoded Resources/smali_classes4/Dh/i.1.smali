.class public LDh/i;
.super LDh/s;
.source "SourceFile"

# interfaces
.implements LBh/d;


# instance fields
.field protected final E:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method protected constructor <init>(LBh/e;LBh/l;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZLBh/b$a;LBh/g0;)V
    .locals 8

    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LDh/i;->I(I)V

    :cond_0
    if-nez p3, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, LDh/i;->I(I)V

    :cond_1
    if-nez p5, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, LDh/i;->I(I)V

    :cond_2
    if-nez p6, :cond_3

    const/4 v0, 0x3

    invoke-static {v0}, LDh/i;->I(I)V

    :cond_3
    sget-object v5, LZh/h;->j:LZh/f;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, LDh/s;-><init>(LBh/m;LBh/z;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/b$a;LBh/g0;)V

    iput-boolean p4, p0, LDh/i;->E:Z

    return-void
.end method

.method private static synthetic I(I)V
    .locals 8

    const/16 v0, 0x1b

    const/16 v1, 0x15

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    const-string v2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    :pswitch_0
    const-string v2, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v3, 0x2

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    packed-switch p0, :pswitch_data_1

    const/4 v4, 0x3

    goto :goto_1

    :cond_1
    :pswitch_1
    move v4, v3

    :goto_1
    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl"

    const/4 v6, 0x0

    packed-switch p0, :pswitch_data_2

    :pswitch_2
    const-string v7, "containingDeclaration"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_3
    const-string v7, "newOwner"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_4
    const-string v7, "overriddenDescriptors"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_5
    const-string v7, "originalSubstitutor"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_6
    aput-object v5, v4, v6

    goto :goto_2

    :pswitch_7
    const-string v7, "typeParameterDescriptors"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_8
    const-string v7, "visibility"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_9
    const-string v7, "unsubstitutedValueParameters"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_a
    const-string v7, "source"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_b
    const-string v7, "kind"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_c
    const-string v7, "annotations"

    aput-object v7, v4, v6

    :goto_2
    const/4 v6, 0x1

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    packed-switch p0, :pswitch_data_3

    aput-object v5, v4, v6

    goto :goto_3

    :pswitch_d
    const-string v5, "getOriginal"

    aput-object v5, v4, v6

    goto :goto_3

    :pswitch_e
    const-string v5, "getConstructedClass"

    aput-object v5, v4, v6

    goto :goto_3

    :pswitch_f
    const-string v5, "getContainingDeclaration"

    aput-object v5, v4, v6

    goto :goto_3

    :pswitch_10
    const-string v5, "calculateContextReceiverParameters"

    aput-object v5, v4, v6

    goto :goto_3

    :cond_2
    const-string v5, "copy"

    aput-object v5, v4, v6

    goto :goto_3

    :cond_3
    const-string v5, "getOverriddenDescriptors"

    aput-object v5, v4, v6

    :goto_3
    packed-switch p0, :pswitch_data_4

    const-string v5, "<init>"

    aput-object v5, v4, v3

    goto :goto_4

    :pswitch_11
    const-string v5, "createSubstitutedCopy"

    aput-object v5, v4, v3

    goto :goto_4

    :pswitch_12
    const-string v5, "setOverriddenDescriptors"

    aput-object v5, v4, v3

    goto :goto_4

    :pswitch_13
    const-string v5, "substitute"

    aput-object v5, v4, v3

    goto :goto_4

    :pswitch_14
    const-string v5, "initialize"

    aput-object v5, v4, v3

    goto :goto_4

    :pswitch_15
    const-string v5, "createSynthesized"

    aput-object v5, v4, v3

    goto :goto_4

    :pswitch_16
    const-string v5, "create"

    aput-object v5, v4, v3

    :goto_4
    :pswitch_17
    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-eq p0, v1, :cond_4

    if-eq p0, v0, :cond_4

    packed-switch p0, :pswitch_data_5

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_4
    :pswitch_18
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xf
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_2
        :pswitch_c
        :pswitch_a
        :pswitch_2
        :pswitch_c
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_9
        :pswitch_8
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_4
        :pswitch_3
        :pswitch_b
        :pswitch_c
        :pswitch_a
        :pswitch_6
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0xf
        :pswitch_10
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x4
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_13
        :pswitch_17
        :pswitch_12
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_17
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0xf
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
    .end packed-switch
.end method

.method private k1()Ljava/util/List;
    .locals 2

    invoke-virtual {p0}, LDh/i;->p1()LBh/e;

    move-result-object v0

    invoke-interface {v0}, LBh/e;->H0()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, LBh/e;->H0()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0xf

    invoke-static {v1}, LDh/i;->I(I)V

    :cond_0
    return-object v0

    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_2

    const/16 v1, 0x10

    invoke-static {v1}, LDh/i;->I(I)V

    :cond_2
    return-object v0
.end method

.method public static n1(LBh/e;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZLBh/g0;)LDh/i;
    .locals 8

    if-nez p0, :cond_0

    const/4 v0, 0x4

    invoke-static {v0}, LDh/i;->I(I)V

    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x5

    invoke-static {v0}, LDh/i;->I(I)V

    :cond_1
    if-nez p3, :cond_2

    const/4 v0, 0x6

    invoke-static {v0}, LDh/i;->I(I)V

    :cond_2
    new-instance v0, LDh/i;

    const/4 v3, 0x0

    sget-object v6, LBh/b$a;->DECLARATION:LBh/b$a;

    move-object v1, v0

    move-object v2, p0

    move-object v4, p1

    move v5, p2

    move-object v7, p3

    invoke-direct/range {v1 .. v7}, LDh/i;-><init>(LBh/e;LBh/l;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZLBh/b$a;LBh/g0;)V

    return-object v0
.end method


# virtual methods
.method public B()Z
    .locals 1

    iget-boolean v0, p0, LDh/i;->E:Z

    return v0
.end method

.method public bridge synthetic B0()LBh/p;
    .locals 1

    invoke-virtual {p0}, LDh/i;->a()LBh/d;

    move-result-object v0

    return-object v0
.end method

.method public C()LBh/e;
    .locals 2

    invoke-virtual {p0}, LDh/i;->p1()LBh/e;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x12

    invoke-static {v1}, LDh/i;->I(I)V

    :cond_0
    return-object v0
.end method

.method protected bridge synthetic L0(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)LDh/s;
    .locals 0

    invoke-virtual/range {p0 .. p6}, LDh/i;->o1(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)LDh/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a()LBh/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LDh/i;->a()LBh/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LBh/b;
    .locals 1

    .line 2
    invoke-virtual {p0}, LDh/i;->a()LBh/d;

    move-result-object v0

    return-object v0
.end method

.method public a()LBh/d;
    .locals 2

    .line 5
    invoke-super {p0}, LDh/s;->a()LBh/z;

    move-result-object v0

    check-cast v0, LBh/d;

    if-nez v0, :cond_0

    const/16 v1, 0x13

    invoke-static {v1}, LDh/i;->I(I)V

    :cond_0
    return-object v0
.end method

.method public bridge synthetic a()LBh/m;
    .locals 1

    .line 3
    invoke-virtual {p0}, LDh/i;->a()LBh/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LBh/z;
    .locals 1

    .line 4
    invoke-virtual {p0}, LDh/i;->a()LBh/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()LBh/i;
    .locals 1

    .line 1
    invoke-virtual {p0}, LDh/i;->p1()LBh/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()LBh/m;
    .locals 1

    .line 2
    invoke-virtual {p0}, LDh/i;->p1()LBh/e;

    move-result-object v0

    return-object v0
.end method

.method public c(Lpi/G0;)LBh/d;
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0x14

    invoke-static {v0}, LDh/i;->I(I)V

    .line 4
    :cond_0
    invoke-super {p0, p1}, LDh/s;->c(Lpi/G0;)LBh/z;

    move-result-object p1

    check-cast p1, LBh/d;

    return-object p1
.end method

.method public bridge synthetic c(Lpi/G0;)LBh/l;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LDh/i;->c(Lpi/G0;)LBh/d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Lpi/G0;)LBh/n;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, LDh/i;->c(Lpi/G0;)LBh/d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Lpi/G0;)LBh/z;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, LDh/i;->c(Lpi/G0;)LBh/d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c0(LBh/m;LBh/D;LBh/u;LBh/b$a;Z)LBh/b;
    .locals 0

    invoke-virtual/range {p0 .. p5}, LDh/i;->m1(LBh/m;LBh/D;LBh/u;LBh/b$a;Z)LBh/d;

    move-result-object p1

    return-object p1
.end method

.method public f()Ljava/util/Collection;
    .locals 2

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v1, 0x15

    invoke-static {v1}, LDh/i;->I(I)V

    :cond_0
    return-object v0
.end method

.method public l1()LBh/b0;
    .locals 2

    invoke-virtual {p0}, LDh/i;->p1()LBh/e;

    move-result-object v0

    invoke-interface {v0}, LBh/i;->M()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, LBh/e;->b()LBh/m;

    move-result-object v0

    instance-of v1, v0, LBh/e;

    if-eqz v1, :cond_0

    check-cast v0, LBh/e;

    invoke-interface {v0}, LBh/e;->J0()LBh/b0;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public m1(LBh/m;LBh/D;LBh/u;LBh/b$a;Z)LBh/d;
    .locals 0

    invoke-super/range {p0 .. p5}, LDh/s;->K0(LBh/m;LBh/D;LBh/u;LBh/b$a;Z)LBh/z;

    move-result-object p1

    check-cast p1, LBh/d;

    if-nez p1, :cond_0

    const/16 p2, 0x1b

    invoke-static {p2}, LDh/i;->I(I)V

    :cond_0
    return-object p1
.end method

.method protected o1(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)LDh/i;
    .locals 7

    if-nez p1, :cond_0

    const/16 p2, 0x17

    invoke-static {p2}, LDh/i;->I(I)V

    :cond_0
    if-nez p3, :cond_1

    const/16 p2, 0x18

    invoke-static {p2}, LDh/i;->I(I)V

    :cond_1
    if-nez p5, :cond_2

    const/16 p2, 0x19

    invoke-static {p2}, LDh/i;->I(I)V

    :cond_2
    if-nez p6, :cond_3

    const/16 p2, 0x1a

    invoke-static {p2}, LDh/i;->I(I)V

    :cond_3
    sget-object v5, LBh/b$a;->DECLARATION:LBh/b$a;

    if-eq p3, v5, :cond_5

    sget-object p2, LBh/b$a;->SYNTHESIZED:LBh/b$a;

    if-ne p3, p2, :cond_4

    goto :goto_0

    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "Attempt at creating a constructor that is not a declaration: \ncopy from: "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p5, "\nnewOwner: "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\nkind: "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_5
    :goto_0
    new-instance p2, LDh/i;

    move-object v1, p1

    check-cast v1, LBh/e;

    iget-boolean v4, p0, LDh/i;->E:Z

    move-object v0, p2

    move-object v2, p0

    move-object v3, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, LDh/i;-><init>(LBh/e;LBh/l;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZLBh/b$a;LBh/g0;)V

    return-object p2
.end method

.method public p1()LBh/e;
    .locals 2

    invoke-super {p0}, LDh/n;->b()LBh/m;

    move-result-object v0

    check-cast v0, LBh/e;

    if-nez v0, :cond_0

    const/16 v1, 0x11

    invoke-static {v1}, LDh/i;->I(I)V

    :cond_0
    return-object v0
.end method

.method public q1(Ljava/util/List;LBh/u;)LDh/i;
    .locals 1

    if-nez p1, :cond_0

    const/16 v0, 0xd

    invoke-static {v0}, LDh/i;->I(I)V

    :cond_0
    if-nez p2, :cond_1

    const/16 v0, 0xe

    invoke-static {v0}, LDh/i;->I(I)V

    :cond_1
    invoke-virtual {p0}, LDh/i;->p1()LBh/e;

    move-result-object v0

    invoke-interface {v0}, LBh/e;->w()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, LDh/i;->r1(Ljava/util/List;LBh/u;Ljava/util/List;)LDh/i;

    return-object p0
.end method

.method public r1(Ljava/util/List;LBh/u;Ljava/util/List;)LDh/i;
    .locals 10

    if-nez p1, :cond_0

    const/16 v0, 0xa

    invoke-static {v0}, LDh/i;->I(I)V

    :cond_0
    if-nez p2, :cond_1

    const/16 v0, 0xb

    invoke-static {v0}, LDh/i;->I(I)V

    :cond_1
    if-nez p3, :cond_2

    const/16 v0, 0xc

    invoke-static {v0}, LDh/i;->I(I)V

    :cond_2
    invoke-virtual {p0}, LDh/i;->l1()LBh/b0;

    move-result-object v3

    invoke-direct {p0}, LDh/i;->k1()Ljava/util/List;

    move-result-object v4

    const/4 v7, 0x0

    sget-object v8, LBh/D;->FINAL:LBh/D;

    const/4 v2, 0x0

    move-object v1, p0

    move-object v5, p3

    move-object v6, p1

    move-object v9, p2

    invoke-super/range {v1 .. v9}, LDh/s;->R0(LBh/b0;LBh/b0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;LBh/D;LBh/u;)LDh/s;

    return-object p0
.end method

.method public t0(LBh/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, LBh/o;->f(LBh/l;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public x0(Ljava/util/Collection;)V
    .locals 0

    if-nez p1, :cond_0

    const/16 p1, 0x16

    invoke-static {p1}, LDh/i;->I(I)V

    :cond_0
    return-void
.end method
