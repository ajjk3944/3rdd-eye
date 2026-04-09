.class public final LL0/O$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL0/O;
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
    invoke-direct {p0}, LL0/O$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LL0/O$a;LL0/L;)LL0/M;
    .locals 0

    invoke-direct {p0, p1}, LL0/O$a;->b(LL0/L;)LL0/M;

    move-result-object p0

    return-object p0
.end method

.method private final b(LL0/L;)LL0/M;
    .locals 17

    invoke-virtual/range {p1 .. p1}, LL0/L;->j()LL0/d;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, LL0/L;->i()LL0/U;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, LL0/L;->d()LY0/t;

    move-result-object v2

    invoke-static {v0, v2}, LL0/V;->d(LL0/U;LY0/t;)LL0/U;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, LL0/L;->b()LY0/d;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, LL0/L;->c()LQ0/k$b;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, LL0/L;->g()Ljava/util/List;

    move-result-object v3

    new-instance v7, LL0/l;

    move-object v0, v7

    invoke-direct/range {v0 .. v5}, LL0/l;-><init>(LL0/d;LL0/U;Ljava/util/List;LY0/d;LQ0/k$b;)V

    invoke-virtual/range {p1 .. p1}, LL0/L;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/b;->n(J)I

    move-result v0

    invoke-virtual/range {p1 .. p1}, LL0/L;->h()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual/range {p1 .. p1}, LL0/L;->f()I

    move-result v1

    sget-object v2, LW0/t;->a:LW0/t$a;

    invoke-virtual {v2}, LW0/t$a;->b()I

    move-result v2

    invoke-static {v1, v2}, LW0/t;->e(II)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-virtual/range {p1 .. p1}, LL0/L;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/b;->h(J)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual/range {p1 .. p1}, LL0/L;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/b;->l(J)I

    move-result v1

    goto :goto_0

    :cond_1
    const v1, 0x7fffffff

    :goto_0
    invoke-virtual/range {p1 .. p1}, LL0/L;->h()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual/range {p1 .. p1}, LL0/L;->f()I

    move-result v2

    sget-object v3, LW0/t;->a:LW0/t$a;

    invoke-virtual {v3}, LW0/t$a;->b()I

    move-result v3

    invoke-static {v2, v3}, LW0/t;->e(II)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    :goto_1
    move v10, v2

    goto :goto_2

    :cond_2
    invoke-virtual/range {p1 .. p1}, LL0/L;->e()I

    move-result v2

    goto :goto_1

    :goto_2
    if-ne v0, v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v7}, LL0/l;->b()F

    move-result v2

    invoke-static {v2}, LL0/u;->d(F)I

    move-result v2

    invoke-static {v2, v0, v1}, Lsh/m;->k(III)I

    move-result v1

    :goto_3
    new-instance v13, LL0/k;

    sget-object v0, LY0/b;->b:LY0/b$a;

    invoke-virtual/range {p1 .. p1}, LL0/L;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/b;->k(J)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1, v3, v2}, LY0/b$a;->b(IIII)J

    move-result-wide v8

    invoke-virtual/range {p1 .. p1}, LL0/L;->f()I

    move-result v0

    sget-object v1, LW0/t;->a:LW0/t$a;

    invoke-virtual {v1}, LW0/t$a;->b()I

    move-result v1

    invoke-static {v0, v1}, LW0/t;->e(II)Z

    move-result v11

    const/4 v12, 0x0

    move-object v6, v13

    invoke-direct/range {v6 .. v12}, LL0/k;-><init>(LL0/l;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, LL0/M;

    invoke-virtual/range {p1 .. p1}, LL0/L;->a()J

    move-result-wide v1

    invoke-virtual {v13}, LL0/k;->A()F

    move-result v3

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-float v3, v3

    float-to-int v3, v3

    invoke-virtual {v13}, LL0/k;->h()F

    move-result v4

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-float v4, v4

    float-to-int v4, v4

    invoke-static {v3, v4}, LY0/s;->a(II)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, LY0/c;->f(JJ)J

    move-result-wide v14

    const/16 v16, 0x0

    move-object v11, v0

    move-object/from16 v12, p1

    invoke-direct/range {v11 .. v16}, LL0/M;-><init>(LL0/L;LL0/k;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
