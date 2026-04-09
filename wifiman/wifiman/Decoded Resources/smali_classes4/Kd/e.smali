.class public final LKd/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKd/d;


# instance fields
.field private final a:Lac/e;

.field private final b:Lxa/o;

.field private final c:Lgg/i;


# direct methods
.method public constructor <init>(Lac/e;Lxa/o;)V
    .locals 1

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productCatalog"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKd/e;->a:Lac/e;

    iput-object p2, p0, LKd/e;->b:Lxa/o;

    invoke-interface {p1}, Lac/e;->a()Lgg/i;

    move-result-object p1

    invoke-interface {p2}, Lxa/o;->b()Lgg/i;

    move-result-object p2

    new-instance v0, LKd/e$a;

    invoke-direct {v0, p0}, LKd/e$a;-><init>(LKd/e;)V

    invoke-static {p1, p2, v0}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    const-string p2, "observeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKd/e;->c:Lgg/i;

    return-void
.end method

.method public static final synthetic e(LKd/e;Lac/b;Lwa/a;)LKd/a;
    .locals 0

    invoke-direct {p0, p1, p2}, LKd/e;->h(Lac/b;Lwa/a;)LKd/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(LKd/e;LKd/a;)Lac/b;
    .locals 0

    invoke-direct {p0, p1}, LKd/e;->i(LKd/a;)Lac/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(LKd/e;)Lac/e;
    .locals 0

    iget-object p0, p0, LKd/e;->a:Lac/e;

    return-object p0
.end method

.method private final h(Lac/b;Lwa/a;)LKd/a;
    .locals 18

    move-object/from16 v0, p2

    invoke-virtual/range {p1 .. p1}, Lac/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/ubnt/teleport/TeleportTunnel$d;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lac/b;->l()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    new-instance v4, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    invoke-direct {v4, v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lac/b;->m()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    const-string v5, "fromString(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->b(Ljava/util/UUID;)Ljava/util/UUID;

    move-result-object v1

    move-object v5, v1

    goto :goto_1

    :cond_1
    move-object v5, v2

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lac/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lac/b;->i()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lac/b;->j()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lac/b;->n()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lac/b;->k()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, Lua/a$a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v6}, Lwa/a;->c(Ljava/lang/String;)Lua/a;

    move-result-object v6

    check-cast v6, Lxa/a$d;

    if-nez v6, :cond_2

    invoke-interface {v0, v1}, Lwa/a;->d(Ljava/lang/String;)Lua/a;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lxa/a$d;

    :cond_2
    move-object v11, v6

    goto :goto_2

    :cond_3
    move-object v11, v2

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lac/b;->e()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lac/b;->c()Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lac/b;->g()Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lac/b;->f()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual/range {p1 .. p1}, Lac/b;->h()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v2, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$a;

    invoke-virtual/range {p1 .. p1}, Lac/b;->f()Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual/range {p1 .. p1}, Lac/b;->h()Ljava/lang/Double;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    move-object/from16 v17, v5

    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    invoke-direct {v2, v0, v1, v5, v6}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$a;-><init>(DD)V

    :goto_3
    move-object v14, v2

    goto :goto_4

    :cond_4
    move-object/from16 v17, v5

    goto :goto_3

    :goto_4
    new-instance v0, LKd/a$a;

    const/16 v16, 0x0

    move-object v6, v0

    invoke-direct/range {v6 .. v16}, LKd/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxa/a$d;Ljava/lang/String;Ljava/lang/Integer;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$a;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, LKd/a;

    const/4 v7, 0x0

    move-object v2, v1

    move-object/from16 v5, v17

    invoke-direct/range {v2 .. v7}, LKd/a;-><init>(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Ljava/util/UUID;LKd/a$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private final i(LKd/a;)Lac/b;
    .locals 19

    invoke-virtual/range {p1 .. p1}, LKd/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, LKd/a;->e()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;->a()Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    invoke-virtual/range {p1 .. p1}, LKd/a;->c()LKd/a$a;

    move-result-object v0

    invoke-virtual {v0}, LKd/a$a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, LKd/a;->f()Ljava/util/UUID;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v5, v0

    goto :goto_1

    :cond_1
    move-object v5, v2

    :goto_1
    invoke-virtual/range {p1 .. p1}, LKd/a;->c()LKd/a$a;

    move-result-object v0

    invoke-virtual {v0}, LKd/a$a;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, LKd/a;->c()LKd/a$a;

    move-result-object v0

    invoke-virtual {v0}, LKd/a$a;->h()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, LKd/a;->c()LKd/a$a;

    move-result-object v0

    invoke-virtual {v0}, LKd/a$a;->j()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, LKd/a;->c()LKd/a$a;

    move-result-object v0

    invoke-virtual {v0}, LKd/a$a;->i()Lxa/a$d;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lua/a;->getId-2jxHnRY()Ljava/lang/String;

    move-result-object v0

    move-object v10, v0

    goto :goto_2

    :cond_2
    move-object v10, v2

    :goto_2
    invoke-virtual/range {p1 .. p1}, LKd/a;->c()LKd/a$a;

    move-result-object v0

    invoke-virtual {v0}, LKd/a$a;->d()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, LKd/a;->c()LKd/a$a;

    move-result-object v0

    invoke-virtual {v0}, LKd/a$a;->c()Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, LKd/a;->c()LKd/a$a;

    move-result-object v0

    invoke-virtual {v0}, LKd/a$a;->f()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, LKd/a;->c()LKd/a$a;

    move-result-object v0

    invoke-virtual {v0}, LKd/a$a;->e()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$a;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$a;->a()D

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    move-object v13, v0

    goto :goto_3

    :cond_3
    move-object v13, v2

    :goto_3
    invoke-virtual/range {p1 .. p1}, LKd/a;->c()LKd/a$a;

    move-result-object v0

    invoke-virtual {v0}, LKd/a$a;->e()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$a;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$a;->b()D

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    move-object/from16 v17, v0

    goto :goto_4

    :cond_4
    move-object/from16 v17, v2

    :goto_4
    new-instance v18, Lac/b;

    move-object/from16 v0, v18

    const/16 v15, 0x100

    const/16 v16, 0x0

    const/4 v9, 0x0

    move-object v2, v3

    move-object v3, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move-object/from16 v13, v17

    invoke-direct/range {v0 .. v16}, Lac/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v18
.end method


# virtual methods
.method public a(LKd/a;)Lgg/b;
    .locals 1

    const-string v0, "record"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LKd/e$d;

    invoke-direct {v0, p0, p1}, LKd/e$d;-><init>(LKd/e;LKd/a;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string v0, "observeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b(Ljava/lang/String;)Lgg/b;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LKd/e$b;

    invoke-direct {v0, p0, p1}, LKd/e$b;-><init>(LKd/e;Ljava/lang/String;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string v0, "observeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c(Ljava/lang/String;)Lgg/z;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LKd/e$c;

    invoke-direct {v0, p0, p1}, LKd/e$c;-><init>(LKd/e;Ljava/lang/String;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string v0, "observeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public d(Ljava/lang/String;LKd/a$a;)Lgg/b;
    .locals 2

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "console"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LKd/e;->b:Lxa/o;

    invoke-interface {v0}, Lxa/o;->b()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, LKd/e$e;

    invoke-direct {v1, p0, p1, p2}, LKd/e$e;-><init>(LKd/e;Ljava/lang/String;LKd/a$a;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string p2, "observeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getAll()Lgg/i;
    .locals 1

    iget-object v0, p0, LKd/e;->c:Lgg/i;

    return-object v0
.end method
