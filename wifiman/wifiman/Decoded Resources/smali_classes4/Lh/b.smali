.class public LLh/b;
.super LDh/i;
.source "SourceFile"

# interfaces
.implements LLh/a;


# instance fields
.field private F:Ljava/lang/Boolean;

.field private G:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method protected constructor <init>(LBh/e;LLh/b;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZLBh/b$a;LBh/g0;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LLh/b;->I(I)V

    :cond_0
    if-nez p3, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, LLh/b;->I(I)V

    :cond_1
    if-nez p5, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, LLh/b;->I(I)V

    :cond_2
    if-nez p6, :cond_3

    const/4 v0, 0x3

    invoke-static {v0}, LLh/b;->I(I)V

    :cond_3
    invoke-direct/range {p0 .. p6}, LDh/i;-><init>(LBh/e;LBh/l;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZLBh/b$a;LBh/g0;)V

    const/4 p1, 0x0

    iput-object p1, p0, LLh/b;->F:Ljava/lang/Boolean;

    iput-object p1, p0, LLh/b;->G:Ljava/lang/Boolean;

    return-void
.end method

.method private static synthetic I(I)V
    .locals 9

    const/16 v0, 0x12

    const/16 v1, 0xb

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v2, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v3, 0x2

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    const/4 v4, 0x3

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor"

    const/4 v6, 0x0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v7, "containingDeclaration"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_1
    const-string v7, "enhancedReturnType"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_2
    const-string v7, "enhancedValueParameterTypes"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_3
    const-string v7, "sourceElement"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_4
    aput-object v5, v4, v6

    goto :goto_2

    :pswitch_5
    const-string v7, "newOwner"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_6
    const-string v7, "source"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_7
    const-string v7, "kind"

    aput-object v7, v4, v6

    goto :goto_2

    :pswitch_8
    const-string v7, "annotations"

    aput-object v7, v4, v6

    :goto_2
    const-string v6, "createSubstitutedCopy"

    const-string v7, "enhance"

    const/4 v8, 0x1

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    aput-object v5, v4, v8

    goto :goto_3

    :cond_2
    aput-object v7, v4, v8

    goto :goto_3

    :cond_3
    aput-object v6, v4, v8

    :goto_3
    packed-switch p0, :pswitch_data_1

    const-string v5, "<init>"

    aput-object v5, v4, v3

    goto :goto_4

    :pswitch_9
    aput-object v7, v4, v3

    goto :goto_4

    :pswitch_a
    const-string v5, "createDescriptor"

    aput-object v5, v4, v3

    goto :goto_4

    :pswitch_b
    aput-object v6, v4, v3

    goto :goto_4

    :pswitch_c
    const-string v5, "createJavaConstructor"

    aput-object v5, v4, v3

    :goto_4
    :pswitch_d
    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-eq p0, v1, :cond_4

    if-eq p0, v0, :cond_4

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_8
        :pswitch_6
        :pswitch_5
        :pswitch_7
        :pswitch_8
        :pswitch_6
        :pswitch_4
        :pswitch_5
        :pswitch_7
        :pswitch_3
        :pswitch_8
        :pswitch_2
        :pswitch_1
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x4
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_d
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_d
    .end packed-switch
.end method

.method public static t1(LBh/e;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZLBh/g0;)LLh/b;
    .locals 8

    if-nez p0, :cond_0

    const/4 v0, 0x4

    invoke-static {v0}, LLh/b;->I(I)V

    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x5

    invoke-static {v0}, LLh/b;->I(I)V

    :cond_1
    if-nez p3, :cond_2

    const/4 v0, 0x6

    invoke-static {v0}, LLh/b;->I(I)V

    :cond_2
    new-instance v0, LLh/b;

    const/4 v3, 0x0

    sget-object v6, LBh/b$a;->DECLARATION:LBh/b$a;

    move-object v1, v0

    move-object v2, p0

    move-object v4, p1

    move v5, p2

    move-object v7, p3

    invoke-direct/range {v1 .. v7}, LLh/b;-><init>(LBh/e;LLh/b;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZLBh/b$a;LBh/g0;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic A0(Lpi/S;Ljava/util/List;Lpi/S;LYg/s;)LLh/a;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, LLh/b;->v1(Lpi/S;Ljava/util/List;Lpi/S;LYg/s;)LLh/b;

    move-result-object p1

    return-object p1
.end method

.method public H()Z
    .locals 1

    iget-object v0, p0, LLh/b;->G:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method protected bridge synthetic L0(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)LDh/s;
    .locals 0

    invoke-virtual/range {p0 .. p6}, LLh/b;->u1(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)LLh/b;

    move-result-object p1

    return-object p1
.end method

.method public Q0()Z
    .locals 1

    iget-object v0, p0, LLh/b;->F:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public Y0(Z)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, LLh/b;->F:Ljava/lang/Boolean;

    return-void
.end method

.method public Z0(Z)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, LLh/b;->G:Ljava/lang/Boolean;

    return-void
.end method

.method protected bridge synthetic o1(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)LDh/i;
    .locals 0

    invoke-virtual/range {p0 .. p6}, LLh/b;->u1(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)LLh/b;

    move-result-object p1

    return-object p1
.end method

.method protected s1(LBh/e;LLh/b;LBh/b$a;LBh/g0;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LLh/b;
    .locals 8

    if-nez p1, :cond_0

    const/16 v0, 0xc

    invoke-static {v0}, LLh/b;->I(I)V

    :cond_0
    if-nez p3, :cond_1

    const/16 v0, 0xd

    invoke-static {v0}, LLh/b;->I(I)V

    :cond_1
    if-nez p4, :cond_2

    const/16 v0, 0xe

    invoke-static {v0}, LLh/b;->I(I)V

    :cond_2
    if-nez p5, :cond_3

    const/16 v0, 0xf

    invoke-static {v0}, LLh/b;->I(I)V

    :cond_3
    new-instance v0, LLh/b;

    iget-boolean v5, p0, LDh/i;->E:Z

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p5

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v1 .. v7}, LLh/b;-><init>(LBh/e;LLh/b;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZLBh/b$a;LBh/g0;)V

    return-object v0
.end method

.method protected u1(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)LLh/b;
    .locals 6

    if-nez p1, :cond_0

    const/4 p4, 0x7

    invoke-static {p4}, LLh/b;->I(I)V

    :cond_0
    if-nez p3, :cond_1

    const/16 p4, 0x8

    invoke-static {p4}, LLh/b;->I(I)V

    :cond_1
    if-nez p5, :cond_2

    const/16 p4, 0x9

    invoke-static {p4}, LLh/b;->I(I)V

    :cond_2
    if-nez p6, :cond_3

    const/16 p4, 0xa

    invoke-static {p4}, LLh/b;->I(I)V

    :cond_3
    sget-object p4, LBh/b$a;->DECLARATION:LBh/b$a;

    if-eq p3, p4, :cond_5

    sget-object p4, LBh/b$a;->SYNTHESIZED:LBh/b$a;

    if-ne p3, p4, :cond_4

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
    move-object v1, p1

    check-cast v1, LBh/e;

    move-object v2, p2

    check-cast v2, LLh/b;

    move-object v0, p0

    move-object v3, p3

    move-object v4, p6

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, LLh/b;->s1(LBh/e;LLh/b;LBh/b$a;LBh/g0;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LLh/b;

    move-result-object p1

    invoke-virtual {p0}, LLh/b;->Q0()Z

    move-result p2

    invoke-virtual {p1, p2}, LLh/b;->Y0(Z)V

    invoke-virtual {p0}, LLh/b;->H()Z

    move-result p2

    invoke-virtual {p1, p2}, LLh/b;->Z0(Z)V

    return-object p1
.end method

.method public v1(Lpi/S;Ljava/util/List;Lpi/S;LYg/s;)LLh/b;
    .locals 12

    move-object v0, p1

    move-object v1, p2

    if-nez v1, :cond_0

    const/16 v2, 0x10

    invoke-static {v2}, LLh/b;->I(I)V

    :cond_0
    if-nez p3, :cond_1

    const/16 v2, 0x11

    invoke-static {v2}, LLh/b;->I(I)V

    :cond_1
    invoke-virtual {p0}, LDh/i;->p1()LBh/e;

    move-result-object v4

    invoke-virtual {p0}, LDh/s;->h()LBh/b$a;

    move-result-object v6

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/b;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v8

    invoke-virtual {p0}, LDh/n;->j()LBh/g0;

    move-result-object v9

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v3, p0

    invoke-virtual/range {v3 .. v9}, LLh/b;->u1(LBh/m;LBh/z;LBh/b$a;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/g0;)LLh/b;

    move-result-object v2

    if-nez v0, :cond_2

    const/4 v0, 0x0

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_2
    sget-object v3, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v3}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v3

    invoke-static {v2, p1, v3}, Lbi/h;->i(LBh/a;Lpi/S;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LBh/b0;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, LDh/s;->d0()LBh/b0;

    move-result-object v5

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v6

    invoke-virtual {p0}, LDh/s;->getTypeParameters()Ljava/util/List;

    move-result-object v7

    invoke-virtual {p0}, LDh/s;->i()Ljava/util/List;

    move-result-object v0

    invoke-static {p2, v0, v2}, LLh/h;->a(Ljava/util/Collection;Ljava/util/Collection;LBh/a;)Ljava/util/List;

    move-result-object v8

    invoke-virtual {p0}, LDh/s;->l()LBh/D;

    move-result-object v10

    invoke-virtual {p0}, LDh/s;->getVisibility()LBh/u;

    move-result-object v11

    move-object v3, v2

    move-object v9, p3

    invoke-virtual/range {v3 .. v11}, LDh/s;->R0(LBh/b0;LBh/b0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;LBh/D;LBh/u;)LDh/s;

    if-eqz p4, :cond_3

    invoke-virtual/range {p4 .. p4}, LYg/s;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/a$a;

    invoke-virtual/range {p4 .. p4}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, LDh/s;->U0(LBh/a$a;Ljava/lang/Object;)V

    :cond_3
    return-object v2
.end method
