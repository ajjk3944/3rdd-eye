.class public final LL0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL0/s;


# instance fields
.field private final a:LL0/d;

.field private final b:Ljava/util/List;

.field private final c:LYg/m;

.field private final d:LYg/m;

.field private final e:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LL0/d;LL0/U;Ljava/util/List;LY0/d;LQ0/k$b;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, LL0/l;->a:LL0/d;

    move-object/from16 v2, p3

    iput-object v2, v0, LL0/l;->b:Ljava/util/List;

    sget-object v2, LYg/q;->NONE:LYg/q;

    new-instance v3, LL0/l$b;

    invoke-direct {v3, v0}, LL0/l$b;-><init>(LL0/l;)V

    invoke-static {v2, v3}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object v3

    iput-object v3, v0, LL0/l;->c:LYg/m;

    new-instance v3, LL0/l$a;

    invoke-direct {v3, v0}, LL0/l$a;-><init>(LL0/l;)V

    invoke-static {v2, v3}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object v2

    iput-object v2, v0, LL0/l;->d:LYg/m;

    invoke-virtual/range {p2 .. p2}, LL0/U;->M()LL0/v;

    move-result-object v2

    invoke-static {v1, v2}, LL0/e;->o(LL0/d;LL0/v;)Ljava/util/List;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LL0/d$c;

    invoke-virtual {v7}, LL0/d$c;->h()I

    move-result v8

    invoke-virtual {v7}, LL0/d$c;->f()I

    move-result v9

    invoke-static {v1, v8, v9}, LL0/e;->g(LL0/d;II)LL0/d;

    move-result-object v8

    invoke-virtual {v7}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LL0/v;

    invoke-static {v0, v9, v2}, LL0/l;->d(LL0/l;LL0/v;LL0/v;)LL0/v;

    move-result-object v9

    new-instance v10, LL0/r;

    invoke-virtual {v8}, LL0/d;->k()Ljava/lang/String;

    move-result-object v11

    move-object/from16 v15, p2

    invoke-virtual {v15, v9}, LL0/U;->I(LL0/v;)LL0/U;

    move-result-object v12

    invoke-virtual {v8}, LL0/d;->g()Ljava/util/List;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, LL0/l;->g()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v7}, LL0/d$c;->h()I

    move-result v9

    invoke-virtual {v7}, LL0/d$c;->f()I

    move-result v14

    invoke-static {v8, v9, v14}, LL0/m;->a(Ljava/util/List;II)Ljava/util/List;

    move-result-object v14

    move-object/from16 v15, p4

    move-object/from16 v16, p5

    invoke-static/range {v11 .. v16}, LL0/t;->a(Ljava/lang/String;LL0/U;Ljava/util/List;Ljava/util/List;LY0/d;LQ0/k$b;)LL0/s;

    move-result-object v8

    invoke-virtual {v7}, LL0/d$c;->h()I

    move-result v9

    invoke-virtual {v7}, LL0/d$c;->f()I

    move-result v7

    invoke-direct {v10, v8, v9, v7}, LL0/r;-><init>(LL0/s;II)V

    invoke-interface {v4, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    iput-object v4, v0, LL0/l;->e:Ljava/util/List;

    return-void
.end method

.method public static final synthetic d(LL0/l;LL0/v;LL0/v;)LL0/v;
    .locals 0

    invoke-direct {p0, p1, p2}, LL0/l;->h(LL0/v;LL0/v;)LL0/v;

    move-result-object p0

    return-object p0
.end method

.method private final h(LL0/v;LL0/v;)LL0/v;
    .locals 14

    invoke-virtual {p1}, LL0/v;->i()I

    move-result v0

    sget-object v1, LW0/l;->b:LW0/l$a;

    invoke-virtual {v1}, LW0/l$a;->f()I

    move-result v1

    invoke-static {v0, v1}, LW0/l;->j(II)Z

    move-result v0

    if-nez v0, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    invoke-virtual/range {p2 .. p2}, LL0/v;->i()I

    move-result v3

    const/16 v12, 0x1fd

    const/4 v13, 0x0

    const/4 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v13}, LL0/v;->b(LL0/v;IIJLW0/q;LL0/z;LW0/h;IILW0/s;ILjava/lang/Object;)LL0/v;

    move-result-object v0

    :goto_0
    return-object v0
.end method


# virtual methods
.method public a()F
    .locals 1

    iget-object v0, p0, LL0/l;->c:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public b()F
    .locals 1

    iget-object v0, p0, LL0/l;->d:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public c()Z
    .locals 5

    iget-object v0, p0, LL0/l;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LL0/r;

    invoke-virtual {v4}, LL0/r;->b()LL0/s;

    move-result-object v4

    invoke-interface {v4}, LL0/s;->c()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v2
.end method

.method public final e()LL0/d;
    .locals 1

    iget-object v0, p0, LL0/l;->a:LL0/d;

    return-object v0
.end method

.method public final f()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LL0/l;->e:Ljava/util/List;

    return-object v0
.end method

.method public final g()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LL0/l;->b:Ljava/util/List;

    return-object v0
.end method
