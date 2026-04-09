.class public final LOh/i;
.super Lpi/E0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LOh/i$a;
    }
.end annotation


# static fields
.field public static final e:LOh/i$a;

.field private static final f:LOh/a;

.field private static final g:LOh/a;


# instance fields
.field private final c:LOh/g;

.field private final d:Lpi/A0;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, LOh/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LOh/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LOh/i;->e:LOh/i$a;

    sget-object v0, Lpi/I0;->COMMON:Lpi/I0;

    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v2, v0

    invoke-static/range {v2 .. v7}, LOh/b;->b(Lpi/I0;ZZLBh/l0;ILjava/lang/Object;)LOh/a;

    move-result-object v1

    sget-object v2, LOh/c;->FLEXIBLE_LOWER_BOUND:LOh/c;

    invoke-virtual {v1, v2}, LOh/a;->l(LOh/c;)LOh/a;

    move-result-object v1

    sput-object v1, LOh/i;->f:LOh/a;

    move-object v2, v0

    invoke-static/range {v2 .. v7}, LOh/b;->b(Lpi/I0;ZZLBh/l0;ILjava/lang/Object;)LOh/a;

    move-result-object v0

    sget-object v1, LOh/c;->FLEXIBLE_UPPER_BOUND:LOh/c;

    invoke-virtual {v0, v1}, LOh/a;->l(LOh/c;)LOh/a;

    move-result-object v0

    sput-object v0, LOh/i;->g:LOh/a;

    return-void
.end method

.method public constructor <init>(Lpi/A0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lpi/E0;-><init>()V

    .line 2
    new-instance v0, LOh/g;

    invoke-direct {v0}, LOh/g;-><init>()V

    iput-object v0, p0, LOh/i;->c:LOh/g;

    if-nez p1, :cond_0

    .line 3
    new-instance p1, Lpi/A0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1, v2}, Lpi/A0;-><init>(Lpi/F;Lpi/x0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    iput-object p1, p0, LOh/i;->d:Lpi/A0;

    return-void
.end method

.method public synthetic constructor <init>(Lpi/A0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1}, LOh/i;-><init>(Lpi/A0;)V

    return-void
.end method

.method static synthetic i(LBh/e;LOh/i;Lpi/d0;LOh/a;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LOh/i;->k(LBh/e;LOh/i;Lpi/d0;LOh/a;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method private final j(Lpi/d0;LBh/e;LOh/a;)LYg/s;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v10, p3

    invoke-virtual/range {p1 .. p1}, Lpi/S;->N0()Lpi/v0;

    move-result-object v3

    invoke-interface {v3}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    return-object v1

    :cond_0
    invoke-static/range {p1 .. p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->c0(Lpi/S;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual/range {p1 .. p1}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpi/B0;

    new-instance v3, Lpi/D0;

    invoke-interface {v2}, Lpi/B0;->a()Lpi/N0;

    move-result-object v4

    invoke-interface {v2}, Lpi/B0;->getType()Lpi/S;

    move-result-object v2

    const-string v5, "getType(...)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v2, v10}, LOh/i;->l(Lpi/S;LOh/a;)Lpi/S;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    invoke-static {v3}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lpi/S;->M0()Lpi/r0;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lpi/S;->N0()Lpi/v0;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lpi/S;->O0()Z

    move-result v8

    const/16 v10, 0x10

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v11}, Lpi/V;->k(Lpi/r0;Lpi/v0;Ljava/util/List;ZLkotlin/reflect/jvm/internal/impl/types/checker/g;ILjava/lang/Object;)Lpi/d0;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    return-object v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lpi/W;->a(Lpi/S;)Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/types/error/k;->ERROR_RAW_TYPE:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    invoke-virtual/range {p1 .. p1}, Lpi/S;->N0()Lpi/v0;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->d(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    return-object v1

    :cond_2
    invoke-interface {v2, v0}, LBh/e;->w0(Lpi/E0;)Lii/k;

    move-result-object v11

    const-string v3, "getMemberScope(...)"

    invoke-static {v11, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lpi/S;->M0()Lpi/r0;

    move-result-object v12

    invoke-interface/range {p2 .. p2}, LBh/h;->k()Lpi/v0;

    move-result-object v13

    const-string v3, "getTypeConstructor(...)"

    invoke-static {v13, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p2 .. p2}, LBh/h;->k()Lpi/v0;

    move-result-object v3

    invoke-interface {v3}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v3

    const-string v4, "getParameters(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v14, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LBh/l0;

    iget-object v3, v0, LOh/i;->c:LOh/g;

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v6, v0, LOh/i;->d:Lpi/A0;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object/from16 v5, p3

    invoke-static/range {v3 .. v9}, Lpi/F;->b(Lpi/F;LBh/l0;Lpi/G;Lpi/A0;Lpi/S;ILjava/lang/Object;)Lpi/B0;

    move-result-object v3

    invoke-interface {v14, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual/range {p1 .. p1}, Lpi/S;->O0()Z

    move-result v5

    new-instance v7, LOh/h;

    invoke-direct {v7, v2, v0, v1, v10}, LOh/h;-><init>(LBh/e;LOh/i;Lpi/d0;LOh/a;)V

    move-object v2, v12

    move-object v3, v13

    move-object v4, v14

    move-object v6, v11

    invoke-static/range {v2 .. v7}, Lpi/V;->n(Lpi/r0;Lpi/v0;Ljava/util/List;ZLii/k;Lmh/l;)Lpi/d0;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    return-object v1
.end method

.method private static final k(LBh/e;LOh/i;Lpi/d0;LOh/a;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;
    .locals 2

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lfi/e;->n(LBh/h;)LZh/b;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p4, v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/g;->b(LZh/b;)LBh/e;

    move-result-object p4

    if-nez p4, :cond_1

    return-object v1

    :cond_1
    invoke-static {p4, p0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    return-object v1

    :cond_2
    invoke-direct {p1, p2, p4, p3}, LOh/i;->j(Lpi/d0;LBh/e;LOh/a;)LYg/s;

    move-result-object p0

    invoke-virtual {p0}, LYg/s;->h()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpi/d0;

    return-object p0
.end method

.method private final l(Lpi/S;LOh/a;)Lpi/S;
    .locals 3

    invoke-virtual {p1}, Lpi/S;->N0()Lpi/v0;

    move-result-object v0

    invoke-interface {v0}, Lpi/v0;->c()LBh/h;

    move-result-object v0

    instance-of v1, v0, LBh/l0;

    if-eqz v1, :cond_0

    iget-object p1, p0, LOh/i;->d:Lpi/A0;

    check-cast v0, LBh/l0;

    const/4 v1, 0x1

    invoke-virtual {p2, v1}, LOh/a;->j(Z)LOh/a;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lpi/A0;->e(LBh/l0;Lpi/G;)Lpi/S;

    move-result-object p1

    invoke-direct {p0, p1, p2}, LOh/i;->l(Lpi/S;LOh/a;)Lpi/S;

    move-result-object p1

    goto :goto_1

    :cond_0
    instance-of p2, v0, LBh/e;

    if-eqz p2, :cond_4

    invoke-static {p1}, Lpi/L;->d(Lpi/S;)Lpi/d0;

    move-result-object p2

    invoke-virtual {p2}, Lpi/S;->N0()Lpi/v0;

    move-result-object p2

    invoke-interface {p2}, Lpi/v0;->c()LBh/h;

    move-result-object p2

    instance-of v1, p2, LBh/e;

    if-eqz v1, :cond_3

    invoke-static {p1}, Lpi/L;->c(Lpi/S;)Lpi/d0;

    move-result-object v1

    check-cast v0, LBh/e;

    sget-object v2, LOh/i;->f:LOh/a;

    invoke-direct {p0, v1, v0, v2}, LOh/i;->j(Lpi/d0;LBh/e;LOh/a;)LYg/s;

    move-result-object v0

    invoke-virtual {v0}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpi/d0;

    invoke-virtual {v0}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {p1}, Lpi/L;->d(Lpi/S;)Lpi/d0;

    move-result-object p1

    check-cast p2, LBh/e;

    sget-object v2, LOh/i;->g:LOh/a;

    invoke-direct {p0, p1, p2, v2}, LOh/i;->j(Lpi/d0;LBh/e;LOh/a;)LYg/s;

    move-result-object p1

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lpi/d0;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez v0, :cond_2

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v1, p2}, Lpi/V;->e(Lpi/d0;Lpi/d0;)Lpi/M0;

    move-result-object p1

    goto :goto_1

    :cond_2
    :goto_0
    new-instance p1, LOh/k;

    invoke-direct {p1, v1, p2}, LOh/k;-><init>(Lpi/d0;Lpi/d0;)V

    :goto_1
    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "For some reason declaration for upper bound is not a class but \""

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\" while for lower it\'s \""

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p2, 0x22

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected declaration kind: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic m(LOh/i;Lpi/S;LOh/a;ILjava/lang/Object;)Lpi/S;
    .locals 9

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, LOh/a;

    sget-object v1, Lpi/I0;->COMMON:Lpi/I0;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v8}, LOh/a;-><init>(Lpi/I0;LOh/c;ZZLjava/util/Set;Lpi/d0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    invoke-direct {p0, p1, p2}, LOh/i;->l(Lpi/S;LOh/a;)Lpi/S;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic e(Lpi/S;)Lpi/B0;
    .locals 0

    invoke-virtual {p0, p1}, LOh/i;->n(Lpi/S;)Lpi/D0;

    move-result-object p1

    return-object p1
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public n(Lpi/S;)Lpi/D0;
    .locals 3

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpi/D0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, p1, v1, v2, v1}, LOh/i;->m(LOh/i;Lpi/S;LOh/a;ILjava/lang/Object;)Lpi/S;

    move-result-object p1

    invoke-direct {v0, p1}, Lpi/D0;-><init>(Lpi/S;)V

    return-object v0
.end method
