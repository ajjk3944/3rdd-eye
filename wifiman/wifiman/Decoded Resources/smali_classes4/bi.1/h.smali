.class public abstract Lbi/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbi/h$a;
    }
.end annotation


# direct methods
.method private static synthetic a(I)V
    .locals 11

    const/16 v0, 0x19

    const/16 v1, 0x17

    const/16 v2, 0xc

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v3, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v3, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v4, 0x2

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    const/4 v5, 0x3

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory"

    const/4 v7, 0x0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v8, "propertyDescriptor"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_1
    const-string v8, "owner"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_2
    const-string v8, "descriptor"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_3
    const-string v8, "enumClass"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_4
    const-string v8, "source"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_5
    const-string v8, "containingClass"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_6
    aput-object v6, v5, v7

    goto :goto_2

    :pswitch_7
    const-string v8, "visibility"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_8
    const-string v8, "sourceElement"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_9
    const-string v8, "parameterAnnotations"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_a
    const-string v8, "annotations"

    aput-object v8, v5, v7

    :goto_2
    const-string v7, "createSetter"

    const-string v8, "createEnumValuesMethod"

    const-string v9, "createEnumValueOfMethod"

    const/4 v10, 0x1

    if-eq p0, v2, :cond_4

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    aput-object v6, v5, v10

    goto :goto_3

    :cond_2
    aput-object v9, v5, v10

    goto :goto_3

    :cond_3
    aput-object v8, v5, v10

    goto :goto_3

    :cond_4
    aput-object v7, v5, v10

    :goto_3
    packed-switch p0, :pswitch_data_1

    const-string v6, "createDefaultSetter"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_b
    const-string v6, "createContextReceiverParameterForClass"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_c
    const-string v6, "createContextReceiverParameterForCallable"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_d
    const-string v6, "createExtensionReceiverParameterForCallable"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_e
    const-string v6, "isEnumSpecialMethod"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_f
    const-string v6, "isEnumValueOfMethod"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_10
    const-string v6, "isEnumValuesMethod"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_11
    const-string v6, "createEnumEntriesProperty"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_12
    aput-object v9, v5, v4

    goto :goto_4

    :pswitch_13
    aput-object v8, v5, v4

    goto :goto_4

    :pswitch_14
    const-string v6, "createPrimaryConstructorForObject"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_15
    const-string v6, "createGetter"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_16
    const-string v6, "createDefaultGetter"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_17
    aput-object v7, v5, v4

    :goto_4
    :pswitch_18
    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    if-eq p0, v2, :cond_5

    if-eq p0, v1, :cond_5

    if-eq p0, v0, :cond_5

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_a
        :pswitch_9
        :pswitch_7
        :pswitch_8
        :pswitch_6
        :pswitch_0
        :pswitch_a
        :pswitch_0
        :pswitch_a
        :pswitch_0
        :pswitch_a
        :pswitch_8
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_6
        :pswitch_3
        :pswitch_6
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_a
        :pswitch_1
        :pswitch_a
        :pswitch_1
        :pswitch_a
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_18
        :pswitch_16
        :pswitch_16
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_14
        :pswitch_14
        :pswitch_13
        :pswitch_18
        :pswitch_12
        :pswitch_18
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_b
    .end packed-switch
.end method

.method public static b(LBh/a;Lpi/S;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;I)LBh/b0;
    .locals 3

    if-nez p0, :cond_0

    const/16 v0, 0x20

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_0
    if-nez p3, :cond_1

    const/16 v0, 0x21

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_1
    const/4 v0, 0x0

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance v1, LDh/N;

    new-instance v2, Lji/c;

    invoke-direct {v2, p0, p1, p2, v0}, Lji/c;-><init>(LBh/a;Lpi/S;LZh/f;Lji/g;)V

    invoke-static {p4}, LZh/g;->a(I)LZh/f;

    move-result-object p1

    invoke-direct {v1, p0, v2, p3, p1}, LDh/N;-><init>(LBh/m;Lji/g;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public static c(LBh/e;Lpi/S;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;I)LBh/b0;
    .locals 3

    if-nez p0, :cond_0

    const/16 v0, 0x22

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_0
    if-nez p3, :cond_1

    const/16 v0, 0x23

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_1
    const/4 v0, 0x0

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance v1, LDh/N;

    new-instance v2, Lji/b;

    invoke-direct {v2, p0, p1, p2, v0}, Lji/b;-><init>(LBh/e;Lpi/S;LZh/f;Lji/g;)V

    invoke-static {p4}, LZh/g;->a(I)LZh/f;

    move-result-object p1

    invoke-direct {v1, p0, v2, p3, p1}, LDh/N;-><init>(LBh/m;Lji/g;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public static d(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LDh/L;
    .locals 2

    if-nez p0, :cond_0

    const/16 v0, 0xd

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0xe

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_1
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, v1, v1}, Lbi/h;->j(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZZZ)LDh/L;

    move-result-object p0

    return-object p0
.end method

.method public static e(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LDh/M;
    .locals 8

    if-nez p0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_1
    if-nez p2, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_2
    invoke-interface {p0}, LBh/p;->j()LBh/g0;

    move-result-object v7

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v7}, Lbi/h;->n(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZZZLBh/g0;)LDh/M;

    move-result-object p0

    return-object p0
.end method

.method public static f(LBh/e;)LBh/Y;
    .locals 26

    if-nez p0, :cond_0

    const/16 v0, 0x1a

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_0
    invoke-static/range {p0 .. p0}, Lbi/i;->g(LBh/m;)LBh/G;

    move-result-object v0

    invoke-static {v0}, Lbi/v;->a(LBh/G;)Lbi/u;

    move-result-object v1

    invoke-interface {v1, v0}, Lbi/u;->a(LBh/G;)LBh/e;

    move-result-object v14

    const/4 v15, 0x0

    if-nez v14, :cond_1

    return-object v15

    :cond_1
    sget-object v16, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual/range {v16 .. v16}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v1

    sget-object v17, LBh/D;->FINAL:LBh/D;

    sget-object v18, LBh/t;->e:LBh/u;

    sget-object v5, Lkotlin/reflect/jvm/internal/impl/builtins/o;->e:LZh/f;

    sget-object v19, LBh/b$a;->SYNTHESIZED:LBh/b$a;

    invoke-interface/range {p0 .. p0}, LBh/p;->j()LBh/g0;

    move-result-object v7

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v0, p0

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    move-object/from16 v6, v19

    invoke-static/range {v0 .. v13}, LDh/K;->O0(LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/D;LBh/u;ZLZh/f;LBh/b$a;LBh/g0;ZZZZZZ)LDh/K;

    move-result-object v0

    new-instance v1, LDh/L;

    invoke-virtual/range {v16 .. v16}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v4

    const/4 v11, 0x0

    invoke-interface/range {p0 .. p0}, LBh/p;->j()LBh/g0;

    move-result-object v12

    const/4 v7, 0x0

    move-object v2, v1

    move-object v3, v0

    move-object/from16 v5, v17

    move-object/from16 v6, v18

    move-object/from16 v10, v19

    invoke-direct/range {v2 .. v12}, LDh/L;-><init>(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/D;LBh/u;ZZZLBh/b$a;LBh/Z;LBh/g0;)V

    invoke-virtual {v0, v1, v15}, LDh/K;->U0(LDh/L;LBh/a0;)V

    sget-object v2, Lpi/r0;->b:Lpi/r0$a;

    invoke-virtual {v2}, Lpi/r0$a;->j()Lpi/r0;

    move-result-object v2

    invoke-interface {v14}, LBh/h;->k()Lpi/v0;

    move-result-object v3

    new-instance v4, Lpi/D0;

    invoke-interface/range {p0 .. p0}, LBh/e;->u()Lpi/d0;

    move-result-object v5

    invoke-direct {v4, v5}, Lpi/D0;-><init>(Lpi/S;)V

    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lpi/V;->i(Lpi/r0;Lpi/v0;Ljava/util/List;Z)Lpi/d0;

    move-result-object v21

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v22

    const/16 v24, 0x0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v25

    const/16 v23, 0x0

    move-object/from16 v20, v0

    invoke-virtual/range {v20 .. v25}, LDh/K;->b1(Lpi/S;Ljava/util/List;LBh/b0;LBh/b0;Ljava/util/List;)V

    invoke-virtual {v0}, LDh/K;->getReturnType()Lpi/S;

    move-result-object v2

    invoke-virtual {v1, v2}, LDh/L;->P0(Lpi/S;)V

    return-object v0
.end method

.method public static g(LBh/e;)LBh/f0;
    .locals 18

    move-object/from16 v0, p0

    if-nez v0, :cond_0

    const/16 v1, 0x18

    invoke-static {v1}, Lbi/h;->a(I)V

    :cond_0
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v2

    sget-object v3, Lkotlin/reflect/jvm/internal/impl/builtins/o;->f:LZh/f;

    sget-object v4, LBh/b$a;->SYNTHESIZED:LBh/b$a;

    invoke-interface/range {p0 .. p0}, LBh/p;->j()LBh/g0;

    move-result-object v5

    invoke-static {v0, v2, v3, v4, v5}, LDh/O;->l1(LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/b$a;LBh/g0;)LDh/O;

    move-result-object v2

    new-instance v3, LDh/V;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v10

    const-string v1, "value"

    invoke-static {v1}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v11

    invoke-static/range {p0 .. p0}, Lfi/e;->m(LBh/m;)Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->W()Lpi/d0;

    move-result-object v12

    const/16 v16, 0x0

    invoke-interface/range {p0 .. p0}, LBh/p;->j()LBh/g0;

    move-result-object v17

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v6, v3

    move-object v7, v2

    invoke-direct/range {v6 .. v17}, LDh/V;-><init>(LBh/a;LBh/s0;ILkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;Lpi/S;ZZZLpi/S;LBh/g0;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v9

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v10

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    invoke-interface/range {p0 .. p0}, LBh/e;->u()Lpi/d0;

    move-result-object v12

    sget-object v13, LBh/D;->FINAL:LBh/D;

    sget-object v14, LBh/t;->e:LBh/u;

    const/4 v7, 0x0

    move-object v6, v2

    invoke-virtual/range {v6 .. v14}, LDh/O;->n1(LBh/b0;LBh/b0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;LBh/D;LBh/u;)LDh/O;

    move-result-object v0

    if-nez v0, :cond_1

    const/16 v1, 0x19

    invoke-static {v1}, Lbi/h;->a(I)V

    :cond_1
    return-object v0
.end method

.method public static h(LBh/e;)LBh/f0;
    .locals 13

    if-nez p0, :cond_0

    const/16 v0, 0x16

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/o;->d:LZh/f;

    sget-object v2, LBh/b$a;->SYNTHESIZED:LBh/b$a;

    invoke-interface {p0}, LBh/p;->j()LBh/g0;

    move-result-object v3

    invoke-static {p0, v0, v1, v2, v3}, LDh/O;->l1(LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;LBh/b$a;LBh/g0;)LDh/O;

    move-result-object v4

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v7

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v8

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v9

    invoke-static {p0}, Lfi/e;->m(LBh/m;)Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v0

    sget-object v1, Lpi/N0;->INVARIANT:Lpi/N0;

    invoke-interface {p0}, LBh/e;->u()Lpi/d0;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->l(Lpi/N0;Lpi/S;)Lpi/d0;

    move-result-object v10

    sget-object v11, LBh/D;->FINAL:LBh/D;

    sget-object v12, LBh/t;->e:LBh/u;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v4 .. v12}, LDh/O;->n1(LBh/b0;LBh/b0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;LBh/D;LBh/u;)LDh/O;

    move-result-object p0

    if-nez p0, :cond_1

    const/16 v0, 0x17

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_1
    return-object p0
.end method

.method public static i(LBh/a;Lpi/S;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LBh/b0;
    .locals 3

    if-nez p0, :cond_0

    const/16 v0, 0x1e

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_0
    if-nez p2, :cond_1

    const/16 v0, 0x1f

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_1
    const/4 v0, 0x0

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance v1, LDh/N;

    new-instance v2, Lji/d;

    invoke-direct {v2, p0, p1, v0}, Lji/d;-><init>(LBh/a;Lpi/S;Lji/g;)V

    invoke-direct {v1, p0, v2, p2}, LDh/N;-><init>(LBh/m;Lji/g;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public static j(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZZZ)LDh/L;
    .locals 7

    if-nez p0, :cond_0

    const/16 v0, 0xf

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x10

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_1
    invoke-interface {p0}, LBh/p;->j()LBh/g0;

    move-result-object v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-static/range {v1 .. v6}, Lbi/h;->k(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZZZLBh/g0;)LDh/L;

    move-result-object p0

    return-object p0
.end method

.method public static k(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZZZLBh/g0;)LDh/L;
    .locals 12

    if-nez p0, :cond_0

    const/16 v0, 0x11

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x12

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_1
    if-nez p5, :cond_2

    const/16 v0, 0x13

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_2
    new-instance v11, LDh/L;

    invoke-interface {p0}, LBh/C;->l()LBh/D;

    move-result-object v3

    invoke-interface {p0}, LBh/C;->getVisibility()LBh/u;

    move-result-object v4

    sget-object v8, LBh/b$a;->DECLARATION:LBh/b$a;

    const/4 v9, 0x0

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move v5, p2

    move v6, p3

    move/from16 v7, p4

    move-object/from16 v10, p5

    invoke-direct/range {v0 .. v10}, LDh/L;-><init>(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/D;LBh/u;ZZZLBh/b$a;LBh/Z;LBh/g0;)V

    return-object v11
.end method

.method public static l(LBh/e;LBh/g0;)LDh/i;
    .locals 2

    if-nez p0, :cond_0

    const/16 v0, 0x14

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x15

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_1
    new-instance v0, Lbi/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lbi/h$a;-><init>(LBh/e;LBh/g0;Z)V

    return-object v0
.end method

.method public static m(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZZZLBh/u;LBh/g0;)LDh/M;
    .locals 13

    move-object v0, p2

    if-nez p0, :cond_0

    const/4 v1, 0x7

    invoke-static {v1}, Lbi/h;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v1, 0x8

    invoke-static {v1}, Lbi/h;->a(I)V

    :cond_1
    if-nez v0, :cond_2

    const/16 v1, 0x9

    invoke-static {v1}, Lbi/h;->a(I)V

    :cond_2
    if-nez p6, :cond_3

    const/16 v1, 0xa

    invoke-static {v1}, Lbi/h;->a(I)V

    :cond_3
    if-nez p7, :cond_4

    const/16 v1, 0xb

    invoke-static {v1}, Lbi/h;->a(I)V

    :cond_4
    new-instance v12, LDh/M;

    invoke-interface {p0}, LBh/C;->l()LBh/D;

    move-result-object v4

    sget-object v9, LBh/b$a;->DECLARATION:LBh/b$a;

    const/4 v10, 0x0

    move-object v1, v12

    move-object v2, p0

    move-object v3, p1

    move-object/from16 v5, p6

    move/from16 v6, p3

    move/from16 v7, p4

    move/from16 v8, p5

    move-object/from16 v11, p7

    invoke-direct/range {v1 .. v11}, LDh/M;-><init>(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/D;LBh/u;ZZZLBh/b$a;LBh/a0;LBh/g0;)V

    invoke-interface {p0}, LBh/r0;->getType()Lpi/S;

    move-result-object v1

    invoke-static {v12, v1, p2}, LDh/M;->O0(LBh/a0;Lpi/S;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LDh/V;

    move-result-object v0

    invoke-virtual {v12, v0}, LDh/M;->Q0(LBh/s0;)V

    return-object v12
.end method

.method public static n(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZZZLBh/g0;)LDh/M;
    .locals 9

    if-nez p0, :cond_0

    const/4 v0, 0x3

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x4

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_1
    if-nez p2, :cond_2

    const/4 v0, 0x5

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_2
    if-nez p6, :cond_3

    const/4 v0, 0x6

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_3
    invoke-interface {p0}, LBh/C;->getVisibility()LBh/u;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v8, p6

    invoke-static/range {v1 .. v8}, Lbi/h;->m(LBh/Y;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;ZZZLBh/u;LBh/g0;)LDh/M;

    move-result-object p0

    return-object p0
.end method

.method private static o(LBh/z;)Z
    .locals 2

    if-nez p0, :cond_0

    const/16 v0, 0x1d

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_0
    invoke-interface {p0}, LBh/b;->h()LBh/b$a;

    move-result-object v0

    sget-object v1, LBh/b$a;->SYNTHESIZED:LBh/b$a;

    if-ne v0, v1, :cond_1

    invoke-interface {p0}, LBh/z;->b()LBh/m;

    move-result-object p0

    invoke-static {p0}, Lbi/i;->A(LBh/m;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static p(LBh/z;)Z
    .locals 2

    if-nez p0, :cond_0

    const/16 v0, 0x1c

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_0
    invoke-interface {p0}, LBh/I;->getName()LZh/f;

    move-result-object v0

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/o;->f:LZh/f;

    invoke-virtual {v0, v1}, LZh/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Lbi/h;->o(LBh/z;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static q(LBh/z;)Z
    .locals 2

    if-nez p0, :cond_0

    const/16 v0, 0x1b

    invoke-static {v0}, Lbi/h;->a(I)V

    :cond_0
    invoke-interface {p0}, LBh/I;->getName()LZh/f;

    move-result-object v0

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/o;->d:LZh/f;

    invoke-virtual {v0, v1}, LZh/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Lbi/h;->o(LBh/z;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
