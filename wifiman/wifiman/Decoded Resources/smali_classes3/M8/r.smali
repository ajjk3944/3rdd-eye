.class public abstract LM8/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM8/r$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/Comparator;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LM8/r$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LM8/r$c;-><init>(Z)V

    new-instance v2, LM8/r$d;

    invoke-direct {v2, v1}, LM8/r$d;-><init>(Z)V

    invoke-interface {v0, v2}, Ljava/util/Comparator;->thenComparing(Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object v0

    const-string/jumbo v1, "thenComparing(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LM8/r;->a:Ljava/util/Comparator;

    return-void
.end method

.method private static final A(Lmh/l;LM8/a;LM8/a;)I
    .locals 0

    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {p0, p2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Comparable;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Comparable;

    invoke-static {p2, p0}, Lch/a;->e(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p0

    return p0
.end method

.method public static synthetic a()Ljava/util/List;
    .locals 1

    invoke-static {}, LM8/r;->y()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(LM8/a;)LW7/f;
    .locals 0

    invoke-static {p0}, LM8/r;->x(LM8/a;)LW7/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LM8/a;)LW7/f;
    .locals 0

    invoke-static {p0}, LM8/r;->v(LM8/a;)LW7/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lmh/l;LM8/a;LM8/a;)I
    .locals 0

    invoke-static {p0, p1, p2}, LM8/r;->A(Lmh/l;LM8/a;LM8/a;)I

    move-result p0

    return p0
.end method

.method public static synthetic e(LM8/a;)LW7/f;
    .locals 0

    invoke-static {p0}, LM8/r;->w(LM8/a;)LW7/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(LM8/a;)LW7/f;
    .locals 0

    invoke-static {p0}, LM8/r;->u(LM8/a;)LW7/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/util/List;La8/a;Ljava/util/Map;Ljava/util/List;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LM8/r;->t(Ljava/util/List;La8/a;Ljava/util/Map;Ljava/util/List;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lle/i;Lne/a;)LAf/c$a;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lle/i;->f()LS8/e;

    move-result-object v0

    invoke-virtual {v0}, LS8/e;->a()LS8/c;

    move-result-object v2

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lle/i;->m()Lke/a;

    move-result-object v1

    instance-of v3, v1, Lke/a$a$a$a;

    if-eqz v3, :cond_0

    sget-object v1, LAf/p$a;->a:LAf/p$a;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of v3, v1, Lke/a$a$a$b;

    if-eqz v3, :cond_1

    sget-object v1, LAf/p$c;->a:LAf/p$c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    instance-of v3, v1, Lke/a$a$b;

    if-nez v3, :cond_3

    instance-of v1, v1, Lke/a$b;

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    :goto_0
    invoke-static {v0}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0}, Lle/i;->e()Lh9/a;

    move-result-object v3

    invoke-virtual {p0}, Lle/i;->f()LS8/e;

    move-result-object v0

    invoke-virtual {v0}, LS8/e;->d()I

    move-result v5

    invoke-virtual {p0}, Lle/i;->f()LS8/e;

    move-result-object v0

    invoke-virtual {v0}, LS8/e;->b()LS8/d;

    move-result-object v6

    invoke-virtual {p0}, Lle/i;->q()LS8/l;

    move-result-object v7

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lne/a;->a()LS8/l;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    move-object v8, p1

    goto :goto_2

    :cond_5
    :goto_1
    invoke-virtual {p0}, Lle/i;->q()LS8/l;

    move-result-object p0

    move-object v8, p0

    :goto_2
    new-instance p0, LAf/c$a;

    move-object v1, p0

    invoke-direct/range {v1 .. v8}, LAf/c$a;-><init>(LS8/c;Lh9/a;Ljava/util/List;ILS8/d;LW7/f;LW7/f;)V

    return-object p0
.end method

.method public static final i(Lle/f;LS8/c;)LGf/i$c;
    .locals 18

    move-object/from16 v0, p1

    const-string v1, "<this>"

    move-object/from16 v8, p0

    invoke-static {v8, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lle/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static/range {p0 .. p0}, LM8/r;->n(Lle/f;)J

    move-result-wide v9

    invoke-virtual/range {p0 .. p0}, Lle/f;->e()Lle/i;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v11, 0x1

    if-eqz v2, :cond_0

    move v12, v11

    goto :goto_0

    :cond_0
    move v12, v3

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lle/f;->c()Lle/i;

    move-result-object v2

    invoke-virtual {v2}, Lle/i;->r()Lke/c;

    move-result-object v2

    instance-of v4, v2, Lke/c$a;

    if-eqz v4, :cond_1

    new-instance v4, Ls9/d$c;

    check-cast v2, Lke/c$a;

    invoke-virtual {v2}, Lke/c$a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v13, v4

    goto :goto_1

    :cond_1
    instance-of v2, v2, Lke/c$b;

    if-eqz v2, :cond_a

    new-instance v2, Ls9/d$c;

    invoke-virtual/range {p0 .. p0}, Lle/f;->c()Lle/i;

    move-result-object v4

    invoke-virtual {v4}, Lle/i;->e()Lh9/a;

    move-result-object v4

    invoke-virtual {v4}, Lh9/a;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v13, v2

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lle/f;->c()Lle/i;

    move-result-object v2

    invoke-virtual {v2}, Lle/i;->r()Lke/c;

    move-result-object v2

    instance-of v4, v2, Lke/c$a;

    if-eqz v4, :cond_2

    move v14, v3

    goto :goto_2

    :cond_2
    instance-of v2, v2, Lke/c$b;

    if-eqz v2, :cond_9

    move v14, v11

    :goto_2
    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v2, p0

    invoke-static/range {v2 .. v7}, LM8/r;->l(Lle/f;ZZZILjava/lang/Object;)Ljava/util/List;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Lle/f;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lle/i;

    if-eqz v0, :cond_4

    invoke-virtual {v4}, Lle/i;->f()LS8/e;

    move-result-object v6

    invoke-virtual {v6}, LS8/e;->a()LS8/c;

    move-result-object v6

    if-ne v0, v6, :cond_5

    :cond_4
    invoke-virtual {v4}, Lle/i;->f()LS8/e;

    move-result-object v4

    invoke-virtual {v4}, LS8/e;->d()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :cond_5
    if-eqz v5, :cond_3

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    invoke-static {v3}, LZg/v;->g0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, LZg/v;->V0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v16

    if-nez v0, :cond_7

    invoke-virtual/range {p0 .. p0}, Lle/f;->c()Lle/i;

    move-result-object v0

    goto :goto_4

    :cond_7
    invoke-virtual/range {p0 .. p1}, Lle/f;->d(LS8/c;)Lle/i;

    move-result-object v0

    :goto_4
    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lle/i;->q()LS8/l;

    move-result-object v0

    goto :goto_5

    :cond_8
    move-object v0, v5

    :goto_5
    const/4 v2, 0x2

    invoke-static {v0, v11, v5, v2, v5}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v0

    new-instance v11, LGf/j;

    const/16 v17, 0x0

    move-object v2, v11

    move-wide v3, v9

    move-object v5, v13

    move v6, v12

    move v7, v14

    move-object/from16 v8, v16

    move-object v9, v15

    move-object v10, v0

    move-object v0, v11

    move-object/from16 v11, v17

    invoke-direct/range {v2 .. v11}, LGf/j;-><init>(JLs9/d;ZZLjava/util/List;Ljava/util/List;Ls9/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, LGf/i$c;

    invoke-direct {v2, v1, v0}, LGf/i$c;-><init>(Ljava/lang/String;LGf/j;)V

    return-object v2

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public static final j(Lle/f;ZZZ)Ljava/util/List;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    if-eqz p3, :cond_2

    invoke-virtual {p0}, Lle/f;->a()Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lle/i;

    invoke-virtual {v3}, Lle/i;->l()LS8/a;

    move-result-object v3

    sget-object v4, LS8/a;->BE:LS8/a;

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    check-cast v2, Lle/i;

    if-eqz v2, :cond_2

    sget-object p3, LAf/v$a;->a:LAf/v$a;

    if-eqz p3, :cond_2

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lle/f;->e()Lle/i;

    move-result-object p1

    if-eqz p1, :cond_3

    sget-object p1, LAf/p$a;->a:LAf/p$a;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {p0}, Lle/f;->c()Lle/i;

    move-result-object p0

    invoke-virtual {p0}, Lle/i;->p()LS8/j;

    move-result-object p0

    if-eqz p0, :cond_5

    if-eqz p2, :cond_4

    move-object v1, p0

    :cond_4
    if-eqz v1, :cond_5

    new-instance p0, LAf/x;

    invoke-direct {p0, v1}, LAf/x;-><init>(LS8/j;)V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    return-object v0
.end method

.method public static final k(Lle/i;ZZ)Ljava/util/List;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lle/i;->p()LS8/j;

    move-result-object v1

    if-eqz v1, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    new-instance p1, LAf/x;

    invoke-direct {p1, v1}, LAf/x;-><init>(LS8/j;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lle/i;->l()LS8/a;

    move-result-object p0

    if-nez p0, :cond_2

    const/4 p0, -0x1

    goto :goto_1

    :cond_2
    sget-object p1, LM8/r$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p1, p0

    :goto_1
    const/4 p1, 0x1

    if-ne p0, p1, :cond_3

    sget-object p0, LAf/v$a;->a:LAf/v$a;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    return-object v0
.end method

.method public static synthetic l(Lle/f;ZZZILjava/lang/Object;)Ljava/util/List;
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x1

    if-eqz p5, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move p3, v0

    :cond_2
    invoke-static {p0, p1, p2, p3}, LM8/r;->j(Lle/f;ZZZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lle/i;ZZILjava/lang/Object;)Ljava/util/List;
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x1

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v0

    :cond_1
    invoke-static {p0, p1, p2}, LM8/r;->k(Lle/i;ZZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Lle/f;)J
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lle/f;->c()Lle/i;

    move-result-object p0

    invoke-static {p0}, LM8/r;->o(Lle/i;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final o(Lle/i;)J
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lle/i;->r()Lke/c;

    move-result-object v0

    invoke-virtual {v0}, Lke/c;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lle/i;->k()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-static {v0}, LM8/r;->p(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final p(Ljava/lang/String;)J
    .locals 9

    const-string/jumbo v0, "ssid"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    move-result p0

    rem-int/lit16 p0, p0, 0x168

    int-to-float v2, p0

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const v4, 0x3f4ccccd    # 0.8f

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lm0/v0$a;->h(Lm0/v0$a;FFFFLn0/x;ILjava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final q(Ljava/util/Map;LCc/a$b;Ljava/util/Map;Z)LAf/c;
    .locals 10

    const-string/jumbo v0, "signals"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "statistics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, LZg/v;->r0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lle/i;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lle/i;->e()Lh9/a;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lh9/a;->toString()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_c

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    if-eqz p1, :cond_0

    sget-object p3, Lcom/ubnt/usurvey/product/m$c;->SMALL:Lcom/ubnt/usurvey/product/m$c;

    sget-object v1, LPe/a;->a:LPe/a;

    invoke-virtual {v1}, LPe/a;->c()Ls9/b;

    move-result-object v1

    invoke-static {p1, p3, v1}, Ln8/m;->e(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;)Ls9/a;

    move-result-object p3

    move-object v3, p3

    goto :goto_0

    :cond_0
    move-object v3, v0

    :goto_0
    if-eqz p1, :cond_1

    invoke-interface {p1}, LCc/a;->getName()Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_1

    new-instance v1, Ls9/d$c;

    invoke-direct {v1, p3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v4, v1

    goto :goto_1

    :cond_1
    new-instance p3, Ls9/d$b;

    const v1, 0x7f1103f4

    invoke-direct {p3, v1}, Ls9/d$b;-><init>(I)V

    move-object v4, p3

    :goto_1
    if-eqz p1, :cond_2

    invoke-interface {p1}, LCc/a;->getName()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_2
    move-object p1, v0

    :goto_2
    const/4 p3, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_3

    move v5, v1

    goto :goto_3

    :cond_3
    move v5, p3

    :goto_3
    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v7, p3

    :cond_4
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lle/i;

    invoke-virtual {v8}, Lle/i;->c()Ljava/util/Set;

    move-result-object v9

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_5

    move p3, v1

    :cond_5
    invoke-virtual {v8}, Lle/i;->l()LS8/a;

    move-result-object v8

    sget-object v9, LS8/a;->BE:LS8/a;

    if-ne v8, v9, :cond_4

    move v7, v1

    goto :goto_4

    :cond_6
    if-eqz p3, :cond_7

    sget-object p3, LAf/w;->a:LAf/w;

    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    if-eqz v7, :cond_8

    sget-object p3, LAf/v$a;->a:LAf/v$a;

    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    sget-object p3, LYg/J;->a:LYg/J;

    invoke-static {p1}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    sget-object p1, LS8/c;->GHZ_2_4:LS8/c;

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lle/i;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lle/i;->k()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, LS8/k;->a(Ljava/lang/String;)LS8/k;

    move-result-object p3

    invoke-interface {p2, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lne/a;

    invoke-static {p1, p3}, LM8/r;->h(Lle/i;Lne/a;)LAf/c$a;

    move-result-object p1

    move-object v7, p1

    goto :goto_5

    :cond_9
    move-object v7, v0

    :goto_5
    sget-object p1, LS8/c;->GHZ_5:LS8/c;

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lle/i;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lle/i;->k()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, LS8/k;->a(Ljava/lang/String;)LS8/k;

    move-result-object p3

    invoke-interface {p2, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lne/a;

    invoke-static {p1, p3}, LM8/r;->h(Lle/i;Lne/a;)LAf/c$a;

    move-result-object p1

    move-object v8, p1

    goto :goto_6

    :cond_a
    move-object v8, v0

    :goto_6
    sget-object p1, LS8/c;->GHZ_6:LS8/c;

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lle/i;

    if-eqz p0, :cond_b

    invoke-virtual {p0}, Lle/i;->k()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LS8/k;->a(Ljava/lang/String;)LS8/k;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lne/a;

    invoke-static {p0, p1}, LM8/r;->h(Lle/i;Lne/a;)LAf/c$a;

    move-result-object p0

    move-object v9, p0

    goto :goto_7

    :cond_b
    move-object v9, v0

    :goto_7
    new-instance p0, LAf/c;

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, LAf/c;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;ZLjava/util/List;LAf/c$a;LAf/c$a;LAf/c$a;)V

    return-object p0

    :cond_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p1, "no signals"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic r(Ljava/util/Map;LCc/a$b;Ljava/util/Map;ZILjava/lang/Object;)LAf/c;
    .locals 0

    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    :cond_0
    invoke-static {p0, p1, p2, p3}, LM8/r;->q(Ljava/util/Map;LCc/a$b;Ljava/util/Map;Z)LAf/c;

    move-result-object p0

    return-object p0
.end method

.method public static final s(Ljava/util/List;La8/a;Ljava/util/Map;Lic/a;LS8/c;)Ljava/util/List;
    .locals 6

    const-string/jumbo v0, "signals"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "devices"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "statistics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sortType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La8/a;

    invoke-direct {v0}, La8/a;-><init>()V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lle/i;

    invoke-virtual {v1}, Lle/i;->i()La8/b;

    move-result-object v2

    new-instance v3, LM8/k;

    invoke-direct {v3}, LM8/k;-><init>()V

    invoke-virtual {v0, v2, v3}, La8/a;->b(La8/b;Lmh/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object p0

    new-instance v1, LM8/l;

    invoke-direct {v1, p0, p1, p2}, LM8/l;-><init>(Ljava/util/List;La8/a;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, La8/a;->c(Lmh/l;)V

    invoke-static {p0}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-static {p0}, LZg/v;->l1(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p0

    sget-object p1, LM8/r$a;->c:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x1

    if-eq p1, p2, :cond_7

    const/4 p3, 0x2

    if-ne p1, p3, :cond_6

    const/4 p1, -0x1

    if-nez p4, :cond_1

    move p4, p1

    goto :goto_1

    :cond_1
    sget-object v0, LM8/r$a;->b:[I

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p4

    aget p4, v0, p4

    :goto_1
    if-eq p4, p1, :cond_5

    if-eq p4, p2, :cond_4

    if-eq p4, p3, :cond_3

    const/4 p1, 0x3

    if-ne p4, p1, :cond_2

    new-instance p1, LM8/p;

    invoke-direct {p1}, LM8/p;-><init>()V

    invoke-static {p1}, LM8/r;->z(Lmh/l;)Ljava/util/Comparator;

    move-result-object p1

    goto :goto_2

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    new-instance p1, LM8/o;

    invoke-direct {p1}, LM8/o;-><init>()V

    invoke-static {p1}, LM8/r;->z(Lmh/l;)Ljava/util/Comparator;

    move-result-object p1

    goto :goto_2

    :cond_4
    new-instance p1, LM8/n;

    invoke-direct {p1}, LM8/n;-><init>()V

    invoke-static {p1}, LM8/r;->z(Lmh/l;)Ljava/util/Comparator;

    move-result-object p1

    goto :goto_2

    :cond_5
    new-instance p1, LM8/m;

    invoke-direct {p1}, LM8/m;-><init>()V

    invoke-static {p1}, LM8/r;->z(Lmh/l;)Ljava/util/Comparator;

    move-result-object p1

    :goto_2
    invoke-static {p0, p1}, LZg/v;->B(Ljava/util/List;Ljava/util/Comparator;)V

    goto :goto_3

    :cond_6
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_7
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    if-le p1, p2, :cond_8

    new-instance p1, LM8/r$b;

    invoke-direct {p1}, LM8/r$b;-><init>()V

    invoke-static {p0, p1}, LZg/v;->B(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_8
    :goto_3
    check-cast p0, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    const/16 p2, 0xa

    invoke-static {p0, p2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LM8/a;

    invoke-virtual {p2}, LM8/a;->b()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p2}, LM8/a;->a()LCc/a$b;

    move-result-object v1

    invoke-virtual {p2}, LM8/a;->c()Ljava/util/Map;

    move-result-object v2

    const/16 v4, 0x8

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LM8/r;->r(Ljava/util/Map;LCc/a$b;Ljava/util/Map;ZILjava/lang/Object;)LAf/c;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    return-object p1
.end method

.method private static final t(Ljava/util/List;La8/a;Ljava/util/Map;Ljava/util/List;)LYg/J;
    .locals 7

    const-string/jumbo v0, "apSignals"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    move-object v0, p3

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, LS8/c;->getEntries()Lfh/a;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LS8/c;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, -0x1

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lle/i;

    invoke-virtual {v5}, Lle/i;->f()LS8/e;

    move-result-object v5

    invoke-virtual {v5}, LS8/e;->a()LS8/c;

    move-result-object v5

    if-ne v5, v2, :cond_1

    goto :goto_3

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_2
    move v4, v6

    :goto_3
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v4

    if-eq v4, v6, :cond_3

    goto :goto_4

    :cond_3
    const/4 v3, 0x0

    :goto_4
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-interface {p3, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lle/i;

    if-eqz v3, :cond_0

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    new-instance v1, LM8/a;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    const-string v3, "<get-values>(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, LZg/v;->p0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lle/i;

    invoke-virtual {v2}, Lle/i;->i()La8/b;

    move-result-object v2

    invoke-virtual {p1, v2}, La8/a;->a(La8/b;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LCc/a$b;

    invoke-direct {v1, v0, v2, p2}, LM8/a;-><init>(Ljava/util/Map;LCc/a$b;Ljava/util/Map;)V

    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string/jumbo p1, "signal by band map should not be empty here"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final u(LM8/a;)LW7/f;
    .locals 6

    const-string/jumbo v0, "device"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LM8/a;->b()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lle/i;

    invoke-virtual {v2}, Lle/i;->q()LS8/l;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    move-object v0, v1

    goto :goto_1

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    move-object v2, v0

    check-cast v2, Lle/i;

    invoke-virtual {v2}, Lle/i;->q()LS8/l;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lle/i;

    invoke-virtual {v4}, Lle/i;->q()LS8/l;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v2, v4}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v5

    if-gez v5, :cond_5

    move-object v0, v3

    move-object v2, v4

    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_4

    :goto_1
    check-cast v0, Lle/i;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lle/i;->q()LS8/l;

    move-result-object v1

    :cond_6
    return-object v1
.end method

.method private static final v(LM8/a;)LW7/f;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LM8/a;->b()Ljava/util/Map;

    move-result-object p0

    sget-object v0, LS8/c;->GHZ_2_4:LS8/c;

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lle/i;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lle/i;->q()LS8/l;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final w(LM8/a;)LW7/f;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LM8/a;->b()Ljava/util/Map;

    move-result-object p0

    sget-object v0, LS8/c;->GHZ_5:LS8/c;

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lle/i;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lle/i;->q()LS8/l;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final x(LM8/a;)LW7/f;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LM8/a;->b()Ljava/util/Map;

    move-result-object p0

    sget-object v0, LS8/c;->GHZ_6:LS8/c;

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lle/i;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lle/i;->q()LS8/l;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final y()Ljava/util/List;
    .locals 1

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    return-object v0
.end method

.method private static final z(Lmh/l;)Ljava/util/Comparator;
    .locals 1

    new-instance v0, LM8/q;

    invoke-direct {v0, p0}, LM8/q;-><init>(Lmh/l;)V

    return-object v0
.end method
