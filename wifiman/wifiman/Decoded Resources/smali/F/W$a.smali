.class public final LF/W$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF/W;
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
    invoke-direct {p0}, LF/W$a;-><init>()V

    return-void
.end method

.method private final c(Lm0/n0;JLR0/H;LL0/M;Lm0/S0;)V
    .locals 1

    invoke-static {p2, p3}, LL0/S;->l(J)I

    move-result v0

    invoke-interface {p4, v0}, LR0/H;->b(I)I

    move-result v0

    invoke-static {p2, p3}, LL0/S;->k(J)I

    move-result p2

    invoke-interface {p4, p2}, LR0/H;->b(I)I

    move-result p2

    if-eq v0, p2, :cond_0

    invoke-virtual {p5, v0, p2}, LL0/M;->z(II)Lm0/U0;

    move-result-object p2

    invoke-interface {p1, p2, p6}, Lm0/n0;->m(Lm0/U0;Lm0/S0;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(JLR0/a0;)LR0/a0;
    .locals 27

    invoke-virtual/range {p3 .. p3}, LR0/a0;->a()LR0/H;

    move-result-object v0

    invoke-static/range {p1 .. p2}, LL0/S;->n(J)I

    move-result v1

    invoke-interface {v0, v1}, LR0/H;->b(I)I

    move-result v0

    invoke-virtual/range {p3 .. p3}, LR0/a0;->a()LR0/H;

    move-result-object v1

    invoke-static/range {p1 .. p2}, LL0/S;->i(J)I

    move-result v2

    invoke-interface {v1, v2}, LR0/H;->b(I)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    new-instance v1, LL0/d$a;

    invoke-virtual/range {p3 .. p3}, LR0/a0;->b()LL0/d;

    move-result-object v3

    invoke-direct {v1, v3}, LL0/d$a;-><init>(LL0/d;)V

    new-instance v3, LL0/D;

    move-object v4, v3

    sget-object v5, LW0/k;->b:LW0/k$a;

    invoke-virtual {v5}, LW0/k$a;->d()LW0/k;

    move-result-object v21

    const v25, 0xefff

    const/16 v26, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v4 .. v26}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v3, v2, v0}, LL0/d$a;->c(LL0/D;II)V

    invoke-virtual {v1}, LL0/d$a;->p()LL0/d;

    move-result-object v0

    invoke-virtual/range {p3 .. p3}, LR0/a0;->a()LR0/H;

    move-result-object v1

    new-instance v2, LR0/a0;

    invoke-direct {v2, v0, v1}, LR0/a0;-><init>(LL0/d;LR0/H;)V

    return-object v2
.end method

.method public final b(Lm0/n0;LR0/Q;JJLR0/H;LL0/M;Lm0/S0;J)V
    .locals 10

    invoke-static {p3, p4}, LL0/S;->h(J)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface/range {p9 .. p11}, Lm0/S0;->I(J)V

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p3

    move-object/from16 v4, p7

    move-object/from16 v5, p8

    move-object/from16 v6, p9

    invoke-direct/range {v0 .. v6}, LF/W$a;->c(Lm0/n0;JLR0/H;LL0/M;Lm0/S0;)V

    goto/16 :goto_2

    :cond_0
    invoke-static/range {p5 .. p6}, LL0/S;->h(J)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual/range {p8 .. p8}, LL0/M;->l()LL0/L;

    move-result-object v0

    invoke-virtual {v0}, LL0/L;->i()LL0/U;

    move-result-object v0

    invoke-virtual {v0}, LL0/U;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v0

    invoke-virtual {v0}, Lm0/v0;->u()J

    move-result-wide v1

    const-wide/16 v3, 0x10

    cmp-long v1, v1, v3

    if-nez v1, :cond_1

    const/4 v0, 0x0

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lm0/v0;->u()J

    move-result-wide v0

    :goto_0
    move-wide v2, v0

    goto :goto_1

    :cond_2
    sget-object v0, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v0}, Lm0/v0$a;->a()J

    move-result-wide v0

    goto :goto_0

    :goto_1
    invoke-static {v2, v3}, Lm0/v0;->n(J)F

    move-result v0

    const v1, 0x3e4ccccd    # 0.2f

    mul-float v4, v0, v1

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v0

    move-object/from16 v8, p9

    invoke-interface {v8, v0, v1}, Lm0/S0;->I(J)V

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p5

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-direct/range {v2 .. v8}, LF/W$a;->c(Lm0/n0;JLR0/H;LL0/M;Lm0/S0;)V

    goto :goto_2

    :cond_3
    move-object/from16 v8, p9

    invoke-virtual {p2}, LR0/Q;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-interface/range {p9 .. p11}, Lm0/S0;->I(J)V

    invoke-virtual {p2}, LR0/Q;->h()J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    invoke-direct/range {v2 .. v8}, LF/W$a;->c(Lm0/n0;JLR0/H;LL0/M;Lm0/S0;)V

    :cond_4
    :goto_2
    sget-object v0, LL0/Q;->a:LL0/Q;

    move-object v1, p1

    move-object/from16 v2, p8

    invoke-virtual {v0, p1, v2}, LL0/Q;->a(Lm0/n0;LL0/M;)V

    return-void
.end method

.method public final d(LF/S;JLY0/t;LL0/M;)LYg/y;
    .locals 0

    invoke-virtual {p1, p2, p3, p4, p5}, LF/S;->l(JLY0/t;LL0/M;)LL0/M;

    move-result-object p1

    new-instance p2, LYg/y;

    invoke-virtual {p1}, LL0/M;->B()J

    move-result-wide p3

    invoke-static {p3, p4}, LY0/r;->g(J)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1}, LL0/M;->B()J

    move-result-wide p4

    invoke-static {p4, p5}, LY0/r;->f(J)I

    move-result p4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-direct {p2, p3, p4, p1}, LYg/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method

.method public final e(LR0/Q;LF/S;LL0/M;LC0/r;LR0/Z;ZLR0/H;)V
    .locals 7

    if-nez p6, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, LR0/Q;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->k(J)I

    move-result p1

    invoke-interface {p7, p1}, LR0/H;->b(I)I

    move-result p1

    invoke-virtual {p3}, LL0/M;->l()LL0/L;

    move-result-object p6

    invoke-virtual {p6}, LL0/L;->j()LL0/d;

    move-result-object p6

    invoke-virtual {p6}, LL0/d;->length()I

    move-result p6

    if-ge p1, p6, :cond_1

    invoke-virtual {p3, p1}, LL0/M;->d(I)Ll0/i;

    move-result-object p1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p3, p1}, LL0/M;->d(I)Ll0/i;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, LF/S;->j()LL0/U;

    move-result-object v0

    invoke-virtual {p2}, LF/S;->a()LY0/d;

    move-result-object v1

    invoke-virtual {p2}, LF/S;->b()LQ0/k$b;

    move-result-object v2

    const/16 v5, 0x18

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, LF/X;->b(LL0/U;LY0/d;LQ0/k$b;Ljava/lang/String;IILjava/lang/Object;)J

    move-result-wide p1

    new-instance p3, Ll0/i;

    invoke-static {p1, p2}, LY0/r;->f(J)I

    move-result p1

    int-to-float p1, p1

    const/4 p2, 0x0

    const/high16 p6, 0x3f800000    # 1.0f

    invoke-direct {p3, p2, p2, p6, p1}, Ll0/i;-><init>(FFFF)V

    move-object p1, p3

    :goto_0
    invoke-virtual {p1}, Ll0/i;->k()F

    move-result p2

    invoke-virtual {p1}, Ll0/i;->n()F

    move-result p3

    invoke-static {p2, p3}, Ll0/h;->a(FF)J

    move-result-wide p2

    invoke-interface {p4, p2, p3}, LC0/r;->o0(J)J

    move-result-wide p2

    invoke-static {p2, p3}, Ll0/g;->m(J)F

    move-result p4

    invoke-static {p2, p3}, Ll0/g;->n(J)F

    move-result p2

    invoke-static {p4, p2}, Ll0/h;->a(FF)J

    move-result-wide p2

    invoke-virtual {p1}, Ll0/i;->r()F

    move-result p4

    invoke-virtual {p1}, Ll0/i;->j()F

    move-result p1

    invoke-static {p4, p1}, Ll0/n;->a(FF)J

    move-result-wide p6

    invoke-static {p2, p3, p6, p7}, Ll0/j;->b(JJ)Ll0/i;

    move-result-object p1

    invoke-virtual {p5, p1}, LR0/Z;->c(Ll0/i;)Z

    return-void
.end method

.method public final f(LR0/Z;LR0/k;Lmh/l;)V
    .locals 7

    invoke-virtual {p2}, LR0/k;->f()LR0/Q;

    move-result-object v0

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, LR0/Q;->d(LR0/Q;LL0/d;JLL0/S;ILjava/lang/Object;)LR0/Q;

    move-result-object p2

    invoke-interface {p3, p2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, LR0/Z;->a()V

    return-void
.end method

.method public final g(Ljava/util/List;LR0/k;Lmh/l;LR0/Z;)V
    .locals 0

    invoke-virtual {p2, p1}, LR0/k;->b(Ljava/util/List;)LR0/Q;

    move-result-object p1

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p4, p2, p1}, LR0/Z;->d(LR0/Q;LR0/Q;)Z

    :cond_0
    invoke-interface {p3, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final h(LR0/T;LR0/Q;LR0/k;LR0/s;Lmh/l;Lmh/l;)LR0/Z;
    .locals 0

    invoke-virtual/range {p0 .. p6}, LF/W$a;->i(LR0/T;LR0/Q;LR0/k;LR0/s;Lmh/l;Lmh/l;)LR0/Z;

    move-result-object p1

    return-object p1
.end method

.method public final i(LR0/T;LR0/Q;LR0/k;LR0/s;Lmh/l;Lmh/l;)LR0/Z;
    .locals 2

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v1, LF/W$a$a;

    invoke-direct {v1, p3, p5, v0}, LF/W$a$a;-><init>(LR0/k;Lmh/l;Lkotlin/jvm/internal/N;)V

    invoke-virtual {p1, p2, p4, v1, p6}, LR0/T;->d(LR0/Q;LR0/s;Lmh/l;Lmh/l;)LR0/Z;

    move-result-object p1

    iput-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    return-object p1
.end method

.method public final j(JLF/j0;LR0/k;LR0/H;Lmh/l;)V
    .locals 7

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p3

    move-wide v1, p1

    invoke-static/range {v0 .. v5}, LF/j0;->e(LF/j0;JZILjava/lang/Object;)I

    move-result p1

    invoke-interface {p5, p1}, LR0/H;->a(I)I

    move-result p1

    invoke-virtual {p4}, LR0/k;->f()LR0/Q;

    move-result-object v0

    invoke-static {p1}, LL0/T;->a(I)J

    move-result-wide v2

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, LR0/Q;->d(LR0/Q;LL0/d;JLL0/S;ILjava/lang/Object;)LR0/Q;

    move-result-object p1

    invoke-interface {p6, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final k(LR0/Z;LR0/Q;LR0/H;LF/j0;)V
    .locals 9

    invoke-virtual {p4}, LF/j0;->c()LC0/r;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, LC0/r;->M()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p4}, LF/j0;->b()LC0/r;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p4}, LF/j0;->f()LL0/M;

    move-result-object v5

    new-instance v6, LF/W$a$b;

    invoke-direct {v6, v0}, LF/W$a$b;-><init>(LC0/r;)V

    invoke-static {v0}, LM/A;->b(LC0/r;)Ll0/i;

    move-result-object v7

    const/4 p4, 0x0

    invoke-interface {v0, v1, p4}, LC0/r;->J(LC0/r;Z)Ll0/i;

    move-result-object v8

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v2 .. v8}, LR0/Z;->e(LR0/Q;LR0/H;LL0/M;Lmh/l;Ll0/i;Ll0/i;)Z

    :cond_1
    return-void
.end method
