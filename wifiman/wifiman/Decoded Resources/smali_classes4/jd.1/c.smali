.class public final Ljd/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljd/b;


# instance fields
.field private final a:Lgg/i;

.field private final b:Lgg/i;

.field private final c:Lgg/i;

.field private final d:Lgg/i;

.field private final e:Lgg/i;

.field private final f:Lgg/i;

.field private final g:Lgg/i;

.field private final h:Lgg/i;

.field private final i:Lgg/i;

.field private final j:Lgg/i;

.field private final k:Lgg/i;


# direct methods
.method public constructor <init>(LZc/f;LZc/a;Lje/u;LDc/e;Lbe/e;LCc/n;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    const-string v3, "networkConnectionManager"

    move-object/from16 v4, p1

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "internetAvailabilityService"

    move-object/from16 v5, p2

    invoke-static {v5, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "wifiConnectionService"

    move-object/from16 v6, p3

    invoke-static {v6, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "networkDiscovery"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "unifiWifimanApi"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "deviceManager"

    move-object/from16 v7, p6

    invoke-static {v7, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    invoke-interface/range {p1 .. p1}, LZc/f;->getState()Lgg/i;

    move-result-object v3

    sget-object v8, Ljd/c$k;->a:Ljd/c$k;

    invoke-virtual {v3, v8}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v3

    invoke-virtual {v3}, Lgg/i;->W()Lgg/i;

    move-result-object v3

    const/4 v8, 0x1

    invoke-virtual {v3, v8}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v3

    invoke-virtual {v3}, Ljg/a;->i2()Lgg/i;

    move-result-object v3

    const-string v9, "refCount(...)"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, v0, Ljd/c;->a:Lgg/i;

    invoke-interface/range {p1 .. p1}, LZc/f;->getState()Lgg/i;

    move-result-object v10

    sget-object v11, Ljd/c$l;->a:Ljd/c$l;

    invoke-virtual {v10, v11}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v10

    invoke-virtual {v10}, Lgg/i;->W()Lgg/i;

    move-result-object v10

    invoke-virtual {v10, v8}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v10

    invoke-virtual {v10}, Ljg/a;->i2()Lgg/i;

    move-result-object v10

    invoke-static {v10, v9}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v10, v0, Ljd/c;->b:Lgg/i;

    invoke-interface/range {p1 .. p1}, LZc/f;->getState()Lgg/i;

    move-result-object v11

    sget-object v12, Ljd/c$f;->a:Ljd/c$f;

    invoke-virtual {v11, v12}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v11

    invoke-virtual {v11}, Lgg/i;->W()Lgg/i;

    move-result-object v11

    const-string v12, "distinctUntilChanged(...)"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v11, v0, Ljd/c;->c:Lgg/i;

    invoke-interface/range {p6 .. p6}, LCc/n;->a()Lgg/i;

    move-result-object v11

    invoke-interface/range {p4 .. p4}, LDc/e;->b()Lgg/i;

    move-result-object v13

    sget-object v14, Ljd/c$h;->a:Ljd/c$h;

    invoke-virtual {v13, v14}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v13

    sget-object v14, Ljd/c$i;->a:Ljd/c$i;

    invoke-static {v11, v13, v14}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v11

    invoke-virtual {v11}, Lgg/i;->W()Lgg/i;

    move-result-object v11

    invoke-static {v11, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v11, v0, Ljd/c;->d:Lgg/i;

    invoke-interface/range {p5 .. p5}, Lbe/e;->a()Lgg/i;

    move-result-object v11

    sget-object v13, Ljd/c$b;->a:Ljd/c$b;

    invoke-virtual {v11, v13}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v11

    invoke-virtual {v11}, Lgg/i;->W()Lgg/i;

    move-result-object v11

    new-instance v13, Ljd/c$c;

    invoke-direct {v13, v1}, Ljd/c$c;-><init>(LDc/e;)V

    invoke-virtual {v11, v13}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v11

    invoke-virtual {v11}, Lgg/i;->W()Lgg/i;

    move-result-object v11

    invoke-static {v11, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v11, v0, Ljd/c;->e:Lgg/i;

    invoke-interface/range {p3 .. p3}, Lje/u;->a()Lgg/i;

    move-result-object v6

    sget-object v13, Ljd/c$d;->a:Ljd/c$d;

    invoke-virtual {v6, v13}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v6

    invoke-virtual {v6}, Lgg/i;->W()Lgg/i;

    move-result-object v6

    invoke-interface/range {p6 .. p6}, LCc/n;->a()Lgg/i;

    move-result-object v13

    sget-object v14, Ljd/c$e;->a:Ljd/c$e;

    invoke-static {v6, v11, v13, v14}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object v6

    invoke-virtual {v6}, Lgg/i;->W()Lgg/i;

    move-result-object v6

    invoke-static {v6, v12}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v6, v0, Ljd/c;->f:Lgg/i;

    new-instance v6, Ljd/c$g;

    invoke-direct {v6, v0, v2}, Ljd/c$g;-><init>(Ljd/c;Lbe/e;)V

    invoke-virtual {v3, v6}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v6

    invoke-virtual {v6}, Lgg/i;->W()Lgg/i;

    move-result-object v6

    invoke-virtual {v6, v8}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v6

    invoke-virtual {v6}, Ljg/a;->i2()Lgg/i;

    move-result-object v6

    invoke-static {v6, v9}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v6, v0, Ljd/c;->g:Lgg/i;

    invoke-interface/range {p4 .. p4}, LDc/e;->b()Lgg/i;

    move-result-object v1

    invoke-interface/range {p6 .. p6}, LCc/n;->a()Lgg/i;

    move-result-object v6

    invoke-interface/range {p5 .. p5}, Lbe/e;->a()Lgg/i;

    move-result-object v11

    sget-object v12, Ljd/c$o;->a:Ljd/c$o;

    invoke-virtual {v11, v12}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v11

    new-instance v12, Ljd/c$p;

    invoke-direct {v12, v0}, Ljd/c$p;-><init>(Ljd/c;)V

    invoke-static {v1, v6, v11, v12}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v8}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v12

    invoke-static {v12, v9}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v12, v0, Ljd/c;->h:Lgg/i;

    new-instance v1, Ljd/c$a;

    invoke-direct {v1, v2, v0}, Ljd/c$a;-><init>(Lbe/e;Ljd/c;)V

    invoke-virtual {v3, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v8}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v1

    invoke-static {v1, v9}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Ljd/c;->i:Lgg/i;

    invoke-interface/range {p1 .. p1}, LZc/f;->getState()Lgg/i;

    move-result-object v1

    invoke-interface/range {p6 .. p6}, LCc/n;->b()Lgg/i;

    move-result-object v2

    new-instance v3, Ljd/c$j;

    invoke-direct {v3, v0}, Ljd/c$j;-><init>(Ljd/c;)V

    invoke-static {v1, v2, v10, v3}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v8}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v1

    invoke-static {v1, v9}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Ljd/c;->j:Lgg/i;

    invoke-virtual/range {p0 .. p0}, Ljd/c;->d()Lgg/i;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Ljd/c;->c()Lgg/i;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Ljd/c;->b()Lgg/i;

    move-result-object v14

    invoke-interface/range {p2 .. p2}, LZc/a;->a()Lgg/i;

    move-result-object v15

    invoke-interface/range {p1 .. p1}, LZc/f;->getState()Lgg/i;

    move-result-object v1

    sget-object v2, Ljd/c$m;->a:Ljd/c$m;

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v16

    sget-object v17, Ljd/c$n;->a:Ljd/c$n;

    invoke-static/range {v11 .. v17}, Lgg/i;->r(LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;Lkg/j;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object v1

    invoke-virtual {v1, v8}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v1

    invoke-virtual {v1}, Ljg/a;->i2()Lgg/i;

    move-result-object v1

    invoke-static {v1, v9}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Ljd/c;->k:Lgg/i;

    return-void
.end method

.method public static final synthetic e(Ljd/c;Lce/b$a;LCc/a;)Ljd/a$b;
    .locals 0

    invoke-direct {p0, p1, p2}, Ljd/c;->l(Lce/b$a;LCc/a;)Ljd/a$b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Ljd/c;)Lgg/i;
    .locals 0

    iget-object p0, p0, Ljd/c;->f:Lgg/i;

    return-object p0
.end method

.method public static final synthetic g(Ljd/c;)Lgg/i;
    .locals 0

    iget-object p0, p0, Ljd/c;->c:Lgg/i;

    return-object p0
.end method

.method public static final synthetic h(Ljd/c;Lce/b$a;)Ljava/lang/Integer;
    .locals 0

    invoke-direct {p0, p1}, Ljd/c;->m(Lce/b$a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Ljd/c;)Lgg/i;
    .locals 0

    iget-object p0, p0, Ljd/c;->d:Lgg/i;

    return-object p0
.end method

.method public static final synthetic j(Ljd/c;Lce/b$a;)LS8/g;
    .locals 0

    invoke-direct {p0, p1}, Ljd/c;->n(Lce/b$a;)LS8/g;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(Ljd/c;Linet/ipaddr/g;)Linet/ipaddr/g;
    .locals 0

    invoke-direct {p0, p1}, Ljd/c;->o(Linet/ipaddr/g;)Linet/ipaddr/g;

    move-result-object p0

    return-object p0
.end method

.method private final l(Lce/b$a;LCc/a;)Ljd/a$b;
    .locals 15

    sget-object v1, Ljd/a$c;->GENERIC:Ljd/a$c;

    invoke-virtual/range {p1 .. p1}, Lce/b$a;->f()Linet/ipaddr/g;

    move-result-object v0

    const/4 v2, 0x0

    move-object v6, p0

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Ljd/c;->o(Linet/ipaddr/g;)Linet/ipaddr/g;

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lce/b$a;->b()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Ljd/a$a;->WIRELESS:Ljd/a$a;

    :goto_1
    move-object v4, v0

    goto :goto_2

    :cond_1
    sget-object v0, Ljd/a$a;->WIRED:Ljd/a$a;

    goto :goto_1

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lce/b$a;->g()Ljava/lang/String;

    move-result-object v0

    invoke-direct/range {p0 .. p1}, Ljd/c;->m(Lce/b$a;)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lce/b$a;->e()Ljava/lang/Integer;

    move-result-object v7

    sget-object v8, LMd/g$b;->b:LMd/g$b;

    invoke-virtual {v8}, LMd/g$b;->b()I

    move-result v8

    if-nez v7, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-ne v9, v8, :cond_3

    invoke-virtual/range {p1 .. p1}, Lce/b$a;->c()Ljava/lang/Integer;

    move-result-object v7

    if-eqz v7, :cond_5

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v2

    sget-object v7, LMd/g;->a:LMd/g$a;

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lce/b$a;->e()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, LMd/g$a;->b(LMd/g$a;Ljava/lang/String;ILjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_3
    :goto_3
    sget-object v8, LMd/g$c;->b:LMd/g$c;

    invoke-virtual {v8}, LMd/g$c;->b()I

    move-result v8

    if-nez v7, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v8, :cond_5

    invoke-virtual/range {p1 .. p1}, Lce/b$a;->d()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_5

    sget-object v9, LMd/g;->a:LMd/g$a;

    invoke-virtual/range {p1 .. p1}, Lce/b$a;->e()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, LMd/g$a;->b(LMd/g$a;Ljava/lang/String;ILjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :cond_5
    :goto_4
    invoke-direct/range {p0 .. p1}, Ljd/c;->n(Lce/b$a;)LS8/g;

    move-result-object v7

    new-instance v8, Ljd/a$d;

    invoke-direct {v8, v0, v2, v7, v5}, Ljd/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;LS8/g;Ljava/lang/Integer;)V

    new-instance v7, Ljd/a$b;

    move-object v0, v7

    move-object v2, v3

    move-object v3, v4

    move-object/from16 v4, p2

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Ljd/a$b;-><init>(Ljd/a$c;Linet/ipaddr/g;Ljd/a$a;LCc/a;Ljd/a$d;)V

    return-object v7
.end method

.method private final m(Lce/b$a;)Ljava/lang/Integer;
    .locals 1

    invoke-direct {p0, p1}, Ljd/c;->n(Lce/b$a;)LS8/g;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lce/b$a;->a()Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private final n(Lce/b$a;)LS8/g;
    .locals 1

    invoke-virtual {p1}, Lce/b$a;->h()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    sget-object v0, LS8/g;->b:LS8/g$a;

    invoke-virtual {v0, p1}, LS8/g$a;->a(I)LS8/g;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private final o(Linet/ipaddr/g;)Linet/ipaddr/g;
    .locals 1

    invoke-virtual {p1}, Linet/ipaddr/g;->g1()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Ljd/c;->k:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Ljd/c;->j:Lgg/i;

    return-object v0
.end method

.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, Ljd/c;->i:Lgg/i;

    return-object v0
.end method

.method public d()Lgg/i;
    .locals 1

    iget-object v0, p0, Ljd/c;->g:Lgg/i;

    return-object v0
.end method
