.class public final Lcom/ui/wifiman/model/ubiquiti/console/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQd/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/console/a$a;,
        Lcom/ui/wifiman/model/ubiquiti/console/a$b;
    }
.end annotation


# instance fields
.field private final a:LNb/e;

.field private final b:LYg/m;

.field private final c:Lgg/i;


# direct methods
.method public constructor <init>(LNb/e;Lxa/o;)V
    .locals 1

    const-string v0, "consoleCacheDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productCatalog"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/a;->a:LNb/e;

    new-instance v0, LQd/f;

    invoke-direct {v0}, LQd/f;-><init>()V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/a;->b:LYg/m;

    sget-object v0, LAg/c;->a:LAg/c;

    invoke-interface {p1}, LNb/e;->a()Lgg/i;

    move-result-object p1

    invoke-interface {p2}, Lxa/o;->b()Lgg/i;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/ubiquiti/console/a$d;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/ubiquiti/console/a$d;-><init>(Lcom/ui/wifiman/model/ubiquiti/console/a;)V

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/a;->c:Lgg/i;

    return-void
.end method

.method public static synthetic e()Ljava/util/Map;
    .locals 1

    invoke-static {}, Lcom/ui/wifiman/model/ubiquiti/console/a;->l()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic f(Lcom/ui/wifiman/model/ubiquiti/console/a;LNb/d;Lwa/a;)Lcom/ui/wifiman/model/ubiquiti/console/e;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/console/a;->i(LNb/d;Lwa/a;)Lcom/ui/wifiman/model/ubiquiti/console/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/ui/wifiman/model/ubiquiti/console/a;Lcom/ui/wifiman/model/ubiquiti/console/e;Ljava/util/UUID;)LNb/d;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/console/a;->j(Lcom/ui/wifiman/model/ubiquiti/console/e;Ljava/util/UUID;)LNb/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Lcom/ui/wifiman/model/ubiquiti/console/a;)LNb/e;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/ubiquiti/console/a;->a:LNb/e;

    return-object p0
.end method

.method private final i(LNb/d;Lwa/a;)Lcom/ui/wifiman/model/ubiquiti/console/e;
    .locals 19

    move-object/from16 v0, p2

    invoke-virtual/range {p1 .. p1}, LNb/d;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, LNb/d;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    sget-object v4, Lcom/ui/common/semver/SemVer;->i:Lcom/ui/common/semver/SemVer$a;

    invoke-virtual {v4, v1}, Lcom/ui/common/semver/SemVer$a;->b(Ljava/lang/String;)Lcom/ui/common/semver/SemVer;

    move-result-object v1

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object v5, v2

    :goto_0
    invoke-virtual/range {p1 .. p1}, LNb/d;->g()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object v4, Lh9/a;->b:Lh9/a$b;

    invoke-virtual {v4, v1}, Lh9/a$b;->e(Ljava/lang/String;)Lh9/a;

    move-result-object v1

    move-object v4, v1

    goto :goto_1

    :cond_1
    move-object v4, v2

    :goto_1
    invoke-virtual/range {p1 .. p1}, LNb/d;->i()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, LNb/d;->d()Ljava/lang/Float;

    move-result-object v1

    const/4 v7, 0x2

    if-eqz v1, :cond_2

    invoke-virtual/range {p1 .. p1}, LNb/d;->e()Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v1, LW7/c;

    new-instance v8, LW7/c$a;

    invoke-virtual/range {p1 .. p1}, LNb/d;->d()Ljava/lang/Float;

    move-result-object v9

    invoke-static {v9}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    move-result v9

    float-to-double v9, v9

    invoke-virtual/range {p1 .. p1}, LNb/d;->e()Ljava/lang/Float;

    move-result-object v11

    invoke-static {v11}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v11

    float-to-double v11, v11

    invoke-direct {v8, v9, v10, v11, v12}, LW7/c$a;-><init>(DD)V

    invoke-direct {v1, v8, v2, v7, v2}, LW7/c;-><init>(LW7/c$a;Ljava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_2
    move-object v1, v2

    :goto_2
    invoke-virtual/range {p1 .. p1}, LNb/d;->f()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, LNb/d;->h()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, LNb/d;->l()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_4

    invoke-static {v9}, Lua/a$a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v0, v11}, Lwa/a;->c(Ljava/lang/String;)Lua/a;

    move-result-object v11

    check-cast v11, Lxa/a$d;

    if-nez v11, :cond_3

    invoke-interface {v0, v9}, Lwa/a;->d(Ljava/lang/String;)Lua/a;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lxa/a$d;

    :cond_3
    move-object v12, v11

    goto :goto_3

    :cond_4
    move-object v12, v2

    :goto_3
    invoke-virtual/range {p1 .. p1}, LNb/d;->n()Ljava/lang/Boolean;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, LNb/d;->k()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    sget-object v2, Lcom/ui/common/semver/SemVer;->i:Lcom/ui/common/semver/SemVer$a;

    invoke-virtual {v2, v0}, Lcom/ui/common/semver/SemVer$a;->b(Ljava/lang/String;)Lcom/ui/common/semver/SemVer;

    move-result-object v2

    :cond_5
    invoke-virtual/range {p1 .. p1}, LNb/d;->j()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-direct/range {p0 .. p0}, Lcom/ui/wifiman/model/ubiquiti/console/a;->k()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    const/4 v9, -0x1

    if-nez v0, :cond_6

    move v0, v9

    goto :goto_4

    :cond_6
    sget-object v11, Lcom/ui/wifiman/model/ubiquiti/console/a$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v11, v0

    :goto_4
    if-eq v0, v9, :cond_d

    const/4 v9, 0x1

    if-eq v0, v9, :cond_c

    if-eq v0, v7, :cond_b

    const/4 v7, 0x3

    if-eq v0, v7, :cond_a

    const/4 v7, 0x4

    if-eq v0, v7, :cond_9

    const/4 v7, 0x5

    if-ne v0, v7, :cond_8

    invoke-virtual/range {p1 .. p1}, LNb/d;->k()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    sget-object v7, Lcom/ui/common/semver/SemVer;->i:Lcom/ui/common/semver/SemVer$a;

    invoke-virtual {v7, v0}, Lcom/ui/common/semver/SemVer$a;->b(Ljava/lang/String;)Lcom/ui/common/semver/SemVer;

    move-result-object v0

    if-eqz v0, :cond_7

    new-instance v7, LRd/a$b$b$b;

    invoke-direct {v7, v0}, LRd/a$b$b$b;-><init>(Lcom/ui/common/semver/SemVer;)V

    goto :goto_5

    :cond_7
    sget-object v7, LRd/a$c;->a:LRd/a$c;

    goto :goto_5

    :cond_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_9
    sget-object v7, LRd/a$b$b$a;->a:LRd/a$b$b$a;

    goto :goto_5

    :cond_a
    sget-object v7, LRd/a$b$a;->a:LRd/a$b$a;

    goto :goto_5

    :cond_b
    sget-object v7, LRd/a$a;->a:LRd/a$a;

    goto :goto_5

    :cond_c
    sget-object v7, LRd/a$c;->a:LRd/a$c;

    goto :goto_5

    :cond_d
    sget-object v7, LRd/a$c;->a:LRd/a$c;

    :goto_5
    if-nez v7, :cond_f

    :cond_e
    sget-object v7, LRd/a$c;->a:LRd/a$c;

    :cond_f
    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;

    move-object v14, v0

    invoke-direct {v0, v2, v7}, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;-><init>(Lcom/ui/common/semver/SemVer;LRd/a;)V

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/e;

    move-object v2, v0

    const/16 v17, 0x100

    const/16 v18, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v7, v1

    invoke-direct/range {v2 .. v18}, Lcom/ui/wifiman/model/ubiquiti/console/e;-><init>(Ljava/lang/String;Lh9/a;Lcom/ui/common/semver/SemVer;Ljava/lang/String;LW7/c;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lxa/a$d;Ljava/lang/Boolean;Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;Lcom/ui/wifiman/model/ubiquiti/console/e$a$c;Lcom/ui/wifiman/model/ubiquiti/console/e$a$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final j(Lcom/ui/wifiman/model/ubiquiti/console/e;Ljava/util/UUID;)LNb/d;
    .locals 17

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/e;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/e;->i()Lh9/a;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const-string v3, ""

    invoke-virtual {v0, v3}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v5, v0

    goto :goto_0

    :cond_0
    move-object v5, v2

    :goto_0
    invoke-virtual/range {p2 .. p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v0, "toString(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/e;->e()Lcom/ui/common/semver/SemVer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/ui/common/semver/SemVer;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    goto :goto_1

    :cond_1
    move-object v4, v2

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/e;->k()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/e;->g()LW7/c;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LW7/c;->b()LW7/c$a;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LW7/c$a;->a()D

    move-result-wide v7

    double-to-float v0, v7

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    move-object v7, v0

    goto :goto_2

    :cond_2
    move-object v7, v2

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/e;->g()LW7/c;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LW7/c;->b()LW7/c$a;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LW7/c$a;->b()D

    move-result-wide v8

    double-to-float v0, v8

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    move-object v8, v0

    goto :goto_3

    :cond_3
    move-object v8, v2

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/e;->h()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/e;->d()Ljava/lang/Boolean;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/e;->j()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/e;->m()Lxa/a$d;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-interface {v0}, Lua/a;->getId-2jxHnRY()Ljava/lang/String;

    move-result-object v0

    move-object v12, v0

    goto :goto_4

    :cond_4
    move-object v12, v2

    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/e;->o()Ljava/lang/Boolean;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/e;->l()Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;->b()Lcom/ui/common/semver/SemVer;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/ui/common/semver/SemVer;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v14, v0

    goto :goto_5

    :cond_5
    move-object v14, v2

    :goto_5
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/e;->l()Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;->a()LRd/a;

    move-result-object v0

    goto :goto_6

    :cond_6
    move-object v0, v2

    :goto_6
    instance-of v15, v0, LRd/a$a;

    if-eqz v15, :cond_7

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->DISABLED:Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    goto :goto_7

    :cond_7
    instance-of v15, v0, LRd/a$c;

    if-eqz v15, :cond_8

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->UNSUPPORTED:Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    goto :goto_7

    :cond_8
    instance-of v15, v0, LRd/a$b$a;

    if-eqz v15, :cond_9

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->ENABLED:Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    goto :goto_7

    :cond_9
    instance-of v15, v0, LRd/a$b$b$a;

    if-eqz v15, :cond_a

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->ENABLED_PERMISSIONS_DENIED:Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    goto :goto_7

    :cond_a
    instance-of v15, v0, LRd/a$b$b$b;

    if-eqz v15, :cond_b

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->ENABLED_NETWORK_VERSION_UNSUPPORTED:Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    goto :goto_7

    :cond_b
    if-nez v0, :cond_d

    move-object v0, v2

    :goto_7
    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->getId()Ljava/lang/String;

    move-result-object v0

    move-object v15, v0

    goto :goto_8

    :cond_c
    move-object v15, v2

    :goto_8
    new-instance v16, LNb/d;

    move-object/from16 v0, v16

    move-object v2, v3

    move-object v3, v4

    move-object v4, v6

    move-object v6, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move-object v13, v14

    move-object v14, v15

    invoke-direct/range {v0 .. v14}, LNb/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V

    return-object v16

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private final k()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/a;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method private static final l()Ljava/util/Map;
    .locals 4

    invoke-static {}, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->getEntries()Lfh/a;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, LZg/U;->d(I)I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Lsh/m;->d(II)I

    move-result v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/ui/wifiman/model/ubiquiti/console/a$a;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/ubiquiti/console/a$a;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v2
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/a;->c:Lgg/i;

    return-object v0
.end method

.method public b(Ljava/util/UUID;)Lgg/b;
    .locals 1

    const-string v0, "accountId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/a$e;

    invoke-direct {v0, p1, p0}, Lcom/ui/wifiman/model/ubiquiti/console/a$e;-><init>(Ljava/util/UUID;Lcom/ui/wifiman/model/ubiquiti/console/a;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string v0, "subscribeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c(Ljava/util/List;Ljava/util/UUID;)Lgg/b;
    .locals 1

    const-string v0, "consoles"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accountId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/a$f;

    invoke-direct {v0, p1, p0, p2}, Lcom/ui/wifiman/model/ubiquiti/console/a$f;-><init>(Ljava/util/List;Lcom/ui/wifiman/model/ubiquiti/console/a;Ljava/util/UUID;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string p2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string p2, "subscribeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public d()Lgg/b;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/a$c;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/ubiquiti/console/a$c;-><init>(Lcom/ui/wifiman/model/ubiquiti/console/a;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object v0

    const-string v1, "subscribeOn(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
