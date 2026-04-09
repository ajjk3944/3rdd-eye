.class public final LDh/T$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDh/T;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LDh/T$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LDh/T$a;LBh/k0;)Lpi/G0;
    .locals 0

    invoke-direct {p0, p1}, LDh/T$a;->c(LBh/k0;)Lpi/G0;

    move-result-object p0

    return-object p0
.end method

.method private final c(LBh/k0;)Lpi/G0;
    .locals 1

    invoke-interface {p1}, LBh/k0;->t()LBh/e;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {p1}, LBh/k0;->U()Lpi/d0;

    move-result-object p1

    invoke-static {p1}, Lpi/G0;->f(Lpi/S;)Lpi/G0;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final b(Loi/n;LBh/k0;LBh/d;)LDh/Q;
    .locals 16

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    const-string v0, "storageManager"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeAliasDescriptor"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p0

    invoke-direct {v11, v9}, LDh/T$a;->c(LBh/k0;)Lpi/G0;

    move-result-object v12

    const/4 v13, 0x0

    if-nez v12, :cond_0

    return-object v13

    :cond_0
    invoke-interface {v10, v12}, LBh/d;->c(Lpi/G0;)LBh/d;

    move-result-object v14

    if-nez v14, :cond_1

    return-object v13

    :cond_1
    new-instance v15, LDh/T;

    invoke-interface/range {p3 .. p3}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v5

    invoke-interface/range {p3 .. p3}, LBh/b;->h()LBh/b$a;

    move-result-object v6

    const-string v0, "getKind(...)"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p2 .. p2}, LBh/p;->j()LBh/g0;

    move-result-object v7

    const-string v0, "getSource(...)"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, 0x0

    const/4 v4, 0x0

    move-object v0, v15

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object v3, v14

    invoke-direct/range {v0 .. v8}, LDh/T;-><init>(Loi/n;LBh/k0;LBh/d;LDh/Q;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/b$a;LBh/g0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface/range {p3 .. p3}, LBh/a;->i()Ljava/util/List;

    move-result-object v0

    invoke-static {v15, v0, v12}, LDh/s;->O0(LBh/z;Ljava/util/List;Lpi/G0;)Ljava/util/List;

    move-result-object v5

    if-nez v5, :cond_2

    return-object v13

    :cond_2
    invoke-interface {v14}, LBh/l;->getReturnType()Lpi/S;

    move-result-object v0

    invoke-virtual {v0}, Lpi/S;->Q0()Lpi/M0;

    move-result-object v0

    invoke-static {v0}, Lpi/L;->c(Lpi/S;)Lpi/d0;

    move-result-object v0

    invoke-interface/range {p2 .. p2}, LBh/h;->u()Lpi/d0;

    move-result-object v1

    const-string v2, "getDefaultType(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lpi/h0;->j(Lpi/d0;Lpi/d0;)Lpi/d0;

    move-result-object v6

    invoke-interface/range {p3 .. p3}, LBh/a;->d0()LBh/b0;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, LBh/r0;->getType()Lpi/S;

    move-result-object v0

    sget-object v1, Lpi/N0;->INVARIANT:Lpi/N0;

    invoke-virtual {v12, v0, v1}, Lpi/G0;->n(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object v0

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v1

    invoke-static {v15, v0, v1}, Lbi/h;->i(LBh/a;Lpi/S;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LBh/b0;

    move-result-object v13

    :cond_3
    move-object v1, v13

    invoke-interface/range {p2 .. p2}, LBh/k0;->t()LBh/e;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface/range {p3 .. p3}, LBh/a;->p0()Ljava/util/List;

    move-result-object v2

    const-string v3, "getContextReceiverParameters(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v4, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v8, v4, 0x1

    if-gez v4, :cond_4

    invoke-static {}, LZg/v;->v()V

    :cond_4
    check-cast v7, LBh/b0;

    invoke-interface {v7}, LBh/r0;->getType()Lpi/S;

    move-result-object v10

    sget-object v13, Lpi/N0;->INVARIANT:Lpi/N0;

    invoke-virtual {v12, v10, v13}, Lpi/G0;->n(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object v10

    invoke-interface {v7}, LBh/b0;->getValue()Lji/g;

    move-result-object v7

    const-string v13, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver"

    invoke-static {v7, v13}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lji/f;

    invoke-interface {v7}, Lji/f;->a()LZh/f;

    move-result-object v7

    sget-object v13, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v13}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->b()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v13

    invoke-static {v0, v10, v7, v13, v4}, Lbi/h;->c(LBh/e;Lpi/S;LZh/f;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;I)LBh/b0;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v4, v8

    goto :goto_0

    :cond_5
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    move-object v3, v0

    :cond_6
    invoke-interface/range {p2 .. p2}, LBh/i;->w()Ljava/util/List;

    move-result-object v4

    sget-object v7, LBh/D;->FINAL:LBh/D;

    invoke-interface/range {p2 .. p2}, LBh/C;->getVisibility()LBh/u;

    move-result-object v8

    const/4 v2, 0x0

    move-object v0, v15

    invoke-virtual/range {v0 .. v8}, LDh/s;->R0(LBh/b0;LBh/b0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;LBh/D;LBh/u;)LDh/s;

    return-object v15
.end method
