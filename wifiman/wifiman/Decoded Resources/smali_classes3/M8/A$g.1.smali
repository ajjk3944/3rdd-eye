.class final LM8/A$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/A;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM8/A$g$a;
    }
.end annotation


# instance fields
.field final synthetic a:LM8/A;


# direct methods
.method constructor <init>(LM8/A;)V
    .locals 0

    iput-object p1, p0, LM8/A$g;->a:LM8/A;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Lle/f;)LS8/l;
    .locals 0

    invoke-static {p0}, LM8/A$g;->l(Lle/f;)LS8/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lde/E;LS8/c;Ljava/util/List;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LM8/A$g;->m(Lde/E;LS8/c;Ljava/util/List;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lmh/p;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2}, LM8/A$g;->n(Lmh/p;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Lle/f;)LS8/l;
    .locals 0

    invoke-static {p0}, LM8/A$g;->j(Lle/f;)LS8/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lle/f;)LS8/l;
    .locals 0

    invoke-static {p0}, LM8/A$g;->k(Lle/f;)LS8/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lle/f;)LS8/l;
    .locals 0

    invoke-static {p0}, LM8/A$g;->i(Lle/f;)LS8/l;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lle/f;)LS8/l;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lle/f;->c()Lle/i;

    move-result-object p0

    invoke-virtual {p0}, Lle/i;->q()LS8/l;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lle/f;)LS8/l;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LS8/c;->GHZ_2_4:LS8/c;

    invoke-virtual {p0, v0}, Lle/f;->d(LS8/c;)Lle/i;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lle/i;->q()LS8/l;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final k(Lle/f;)LS8/l;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LS8/c;->GHZ_5:LS8/c;

    invoke-virtual {p0, v0}, Lle/f;->d(LS8/c;)Lle/i;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lle/i;->q()LS8/l;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final l(Lle/f;)LS8/l;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LS8/c;->GHZ_6:LS8/c;

    invoke-virtual {p0, v0}, Lle/f;->d(LS8/c;)Lle/i;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lle/i;->q()LS8/l;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final m(Lde/E;LS8/c;Ljava/util/List;)LYg/J;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "results"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lde/E;->e()Lic/c;

    move-result-object p0

    sget-object p1, LM8/A$g$a;->c:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p1, p0

    const/4 p1, 0x1

    if-eq p0, p1, :cond_1

    const/4 p1, 0x2

    if-ne p0, p1, :cond_0

    sget-object p0, Lie/c;->e:Lie/c$a;

    invoke-virtual {p0}, Lie/c$a;->f()Ljava/util/Comparator;

    move-result-object p0

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lie/c;->e:Lie/c$a;

    invoke-virtual {p0}, Lie/c$a;->e()Ljava/util/Comparator;

    move-result-object p0

    :goto_0
    invoke-static {p2, p0}, LZg/v;->B(Ljava/util/List;Ljava/util/Comparator;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final n(Lmh/p;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LM8/A$b$c;

    check-cast p2, Lde/E;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3}, LM8/A$g;->h(LM8/A$b$c;Lde/E;Ljava/lang/Boolean;)LEe/g;

    move-result-object p1

    return-object p1
.end method

.method public final h(LM8/A$b$c;Lde/E;Ljava/lang/Boolean;)LEe/g;
    .locals 19

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string/jumbo v2, "resultsContent"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "config"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "searchMode"

    move-object/from16 v3, p3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v0, LM8/A$b$c$a;

    const/4 v4, 0x1

    if-eqz v2, :cond_d

    check-cast v0, LM8/A$b$c$a;

    invoke-virtual {v0}, LM8/A$b$c$a;->b()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-virtual/range {p2 .. p2}, Lde/E;->f()Lic/d;

    move-result-object v1

    sget-object v5, LM8/A$g$a;->b:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v5, v1

    if-eq v1, v4, :cond_6

    const/4 v5, 0x2

    if-ne v1, v5, :cond_5

    invoke-virtual {v0}, LM8/A$b$c$a;->a()LS8/c;

    move-result-object v1

    const/4 v6, -0x1

    if-nez v1, :cond_0

    move v1, v6

    goto :goto_0

    :cond_0
    sget-object v7, LM8/A$g$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v7, v1

    :goto_0
    if-eq v1, v6, :cond_4

    if-eq v1, v4, :cond_3

    if-eq v1, v5, :cond_2

    const/4 v5, 0x3

    if-ne v1, v5, :cond_1

    sget-object v1, Lle/f;->g:Lle/f$a;

    new-instance v5, LM8/E;

    invoke-direct {v5}, LM8/E;-><init>()V

    invoke-virtual {v1, v5}, Lle/f$a;->k(Lmh/l;)Ljava/util/Comparator;

    move-result-object v1

    goto :goto_1

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    sget-object v1, Lle/f;->g:Lle/f$a;

    new-instance v5, LM8/D;

    invoke-direct {v5}, LM8/D;-><init>()V

    invoke-virtual {v1, v5}, Lle/f$a;->k(Lmh/l;)Ljava/util/Comparator;

    move-result-object v1

    goto :goto_1

    :cond_3
    sget-object v1, Lle/f;->g:Lle/f$a;

    new-instance v5, LM8/C;

    invoke-direct {v5}, LM8/C;-><init>()V

    invoke-virtual {v1, v5}, Lle/f$a;->k(Lmh/l;)Ljava/util/Comparator;

    move-result-object v1

    goto :goto_1

    :cond_4
    sget-object v1, Lle/f;->g:Lle/f$a;

    new-instance v5, LM8/B;

    invoke-direct {v5}, LM8/B;-><init>()V

    invoke-virtual {v1, v5}, Lle/f$a;->k(Lmh/l;)Ljava/util/Comparator;

    move-result-object v1

    goto :goto_1

    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_6
    sget-object v1, Lle/f;->g:Lle/f$a;

    invoke-virtual {v1}, Lle/f$a;->j()Ljava/util/Comparator;

    move-result-object v1

    :goto_1
    invoke-static {v2, v1}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_a

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, v4, :cond_7

    invoke-static {v1}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lle/f;

    invoke-virtual {v2}, Lle/f;->e()Lle/i;

    move-result-object v2

    if-eqz v2, :cond_7

    goto :goto_3

    :cond_7
    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lle/f;

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_9

    invoke-virtual {v2}, Lle/f;->e()Lle/i;

    move-result-object v4

    if-nez v4, :cond_8

    :cond_9
    invoke-virtual {v0}, LM8/A$b$c$a;->a()LS8/c;

    move-result-object v4

    invoke-static {v2, v4}, LM8/r;->i(Lle/f;LS8/c;)LGf/i$c;

    move-result-object v2

    invoke-interface {v9, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_a
    :goto_3
    invoke-virtual {v0}, LM8/A$b$c$a;->a()LS8/c;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v1, Ls9/d$a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, LM8/A$g$c;

    invoke-direct {v3, v0}, LM8/A$g$c;-><init>(LS8/c;)V

    invoke-direct {v1, v2, v3}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    goto :goto_4

    :cond_b
    new-instance v1, Ls9/d$b;

    const v0, 0x7f1103fb

    invoke-direct {v1, v0}, Ls9/d$b;-><init>(I)V

    :goto_4
    new-instance v0, LGf/i$b;

    invoke-direct {v0, v1}, LGf/i$b;-><init>(Ls9/d;)V

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_c
    new-instance v0, LEe/g$a$a;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const-string/jumbo v6, "networks"

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, v0

    invoke-direct/range {v5 .. v11}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v3, p0

    goto/16 :goto_b

    :cond_d
    instance-of v2, v0, LM8/A$b$c$b;

    if-eqz v2, :cond_14

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, LM8/A$b$c$b;

    invoke-virtual {v0}, LM8/A$b$c$b;->b()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lie/c;

    invoke-virtual {v5}, Lie/c;->a()LS8/e;

    move-result-object v6

    invoke-virtual {v6}, LS8/e;->a()LS8/c;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_e

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    check-cast v7, Ljava/util/List;

    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_f
    new-instance v3, LM8/F;

    invoke-direct {v3, v1}, LM8/F;-><init>(Lde/E;)V

    new-instance v1, LM8/G;

    invoke-direct {v1, v3}, LM8/G;-><init>(Lmh/p;)V

    invoke-interface {v2, v1}, Ljava/util/Map;->forEach(Ljava/util/function/BiConsumer;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_10
    new-instance v3, LM8/A$g$b;

    invoke-direct {v3}, LM8/A$g$b;-><init>()V

    invoke-static {v1, v3}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    move-object/from16 v3, p0

    iget-object v5, v3, LM8/A$g;->a:LM8/A;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v1, v7}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_13

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v8}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lie/c;

    invoke-virtual {v9}, Lie/c;->a()LS8/e;

    move-result-object v9

    invoke-virtual {v9}, LS8/e;->a()LS8/c;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v11, "quality-"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v10

    if-le v10, v4, :cond_11

    invoke-static {v9}, LNe/h;->c(LS8/c;)Ls9/d;

    move-result-object v9

    :goto_8
    move-object v14, v9

    goto :goto_9

    :cond_11
    const/4 v9, 0x0

    goto :goto_8

    :goto_9
    check-cast v8, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v8, v7}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_12

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lie/c;

    new-instance v11, LGf/i$a;

    invoke-virtual {v10}, Lie/c;->a()LS8/e;

    move-result-object v12

    invoke-static {v5, v12}, LM8/A;->Q0(LM8/A;LS8/e;)Ljava/lang/String;

    move-result-object v12

    new-instance v15, LGf/b;

    new-instance v7, Ls9/d$c;

    invoke-virtual {v10}, Lie/c;->a()LS8/e;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, LS8/e;->d()I

    move-result v16

    invoke-static/range {v16 .. v16}, Lvf/g;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v7, v4}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v10}, Lie/c;->b()LS8/f;

    move-result-object v4

    move-object/from16 p2, v1

    const/4 v1, 0x1

    invoke-static {v4, v1}, LNe/j;->c(LS8/f;Z)Ls9/d;

    move-result-object v4

    invoke-virtual {v0}, LM8/A$b$c$b;->a()Ljava/util/HashSet;

    move-result-object v1

    invoke-virtual {v10}, Lie/c;->a()LS8/e;

    move-result-object v10

    invoke-virtual {v10}, LS8/e;->d()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v1, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    invoke-direct {v15, v7, v4, v1}, LGf/b;-><init>(Ls9/d;Ls9/d;Z)V

    invoke-direct {v11, v12, v15}, LGf/i$a;-><init>(Ljava/lang/String;LGf/b;)V

    invoke-interface {v9, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p2

    const/4 v4, 0x1

    const/16 v7, 0xa

    goto :goto_a

    :cond_12
    move-object/from16 p2, v1

    new-instance v1, LEe/g$a$a;

    const/4 v15, 0x0

    const/16 v17, 0x4

    const/16 v18, 0x0

    move-object v12, v1

    move-object/from16 v16, v9

    invoke-direct/range {v12 .. v18}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v6, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p2

    const/4 v4, 0x1

    const/16 v7, 0xa

    goto/16 :goto_7

    :cond_13
    move-object v0, v6

    goto :goto_b

    :cond_14
    move-object/from16 v3, p0

    instance-of v0, v0, LM8/A$b$c$c;

    if-eqz v0, :cond_15

    new-instance v0, LEe/g$a$b;

    new-instance v1, LGf/i$b;

    new-instance v2, Ls9/d$b;

    const v4, 0x7f110406

    invoke-direct {v2, v4}, Ls9/d$b;-><init>(I)V

    invoke-direct {v1, v2}, LGf/i$b;-><init>(Ls9/d;)V

    invoke-direct {v0, v1}, LEe/g$a$b;-><init>(LEe/g$b;)V

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :goto_b
    new-instance v1, LEe/g;

    invoke-direct {v1, v0}, LEe/g;-><init>(Ljava/util/List;)V

    return-object v1

    :cond_15
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
