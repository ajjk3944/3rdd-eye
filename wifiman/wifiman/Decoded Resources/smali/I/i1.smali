.class public final LI/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/z1;
.implements Ld0/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI/i1$a;,
        LI/i1$b;,
        LI/i1$c;
    }
.end annotation


# instance fields
.field private final a:LT/q0;

.field private final b:LT/q0;

.field private c:LL0/O;

.field private d:LI/i1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LI/i1$c;->e:LI/i1$c$b;

    invoke-virtual {v0}, LI/i1$c$b;->a()LT/n1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, LT/o1;->h(Ljava/lang/Object;LT/n1;)LT/q0;

    move-result-object v0

    iput-object v0, p0, LI/i1;->a:LT/q0;

    sget-object v0, LI/i1$b;->g:LI/i1$b$b;

    invoke-virtual {v0}, LI/i1$b$b;->a()LT/n1;

    move-result-object v0

    invoke-static {v1, v0}, LT/o1;->h(Ljava/lang/Object;LT/n1;)LT/q0;

    move-result-object v0

    iput-object v0, p0, LI/i1;->b:LT/q0;

    new-instance v0, LI/i1$a;

    invoke-direct {v0}, LI/i1$a;-><init>()V

    iput-object v0, p0, LI/i1;->d:LI/i1$a;

    return-void
.end method

.method private final p(LH/h;LI/i1$c;LI/i1$b;)LL0/M;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1}, LI/i1;->v(LI/i1$b;)LL0/O;

    move-result-object v2

    new-instance v3, LL0/d$a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-direct {v3, v5, v6, v4}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, LH/h;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, LL0/d$a;->i(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LH/h;->c()LL0/S;

    move-result-object v4

    if-eqz v4, :cond_0

    new-instance v4, LL0/D;

    move-object v7, v4

    sget-object v5, LW0/k;->b:LW0/k$a;

    invoke-virtual {v5}, LW0/k$a;->d()LW0/k;

    move-result-object v24

    const v28, 0xefff

    const/16 v29, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v7 .. v29}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, LH/h;->c()LL0/S;

    move-result-object v5

    invoke-virtual {v5}, LL0/S;->r()J

    move-result-wide v7

    invoke-static {v7, v8}, LL0/S;->l(J)I

    move-result v5

    invoke-virtual/range {p1 .. p1}, LH/h;->c()LL0/S;

    move-result-object v7

    invoke-virtual {v7}, LL0/S;->r()J

    move-result-wide v7

    invoke-static {v7, v8}, LL0/S;->k(J)I

    move-result v7

    invoke-virtual {v3, v4, v5, v7}, LL0/d$a;->c(LL0/D;II)V

    :cond_0
    invoke-virtual {v3}, LL0/d$a;->p()LL0/d;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, LI/i1$c;->e()LL0/U;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, LI/i1$c;->c()Z

    move-result v5

    invoke-virtual/range {p2 .. p2}, LI/i1$c;->b()Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_0

    :cond_1
    const v6, 0x7fffffff

    :goto_0
    invoke-virtual/range {p3 .. p3}, LI/i1$b;->b()J

    move-result-wide v8

    invoke-virtual/range {p3 .. p3}, LI/i1$b;->g()LY0/t;

    move-result-object v10

    invoke-virtual/range {p3 .. p3}, LI/i1$b;->c()LY0/d;

    move-result-object v11

    invoke-virtual/range {p3 .. p3}, LI/i1$b;->e()LQ0/k$b;

    move-result-object v12

    const/16 v14, 0x424

    const/4 v15, 0x0

    const/4 v7, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move v4, v7

    move-object v7, v13

    move/from16 v13, v16

    invoke-static/range {v1 .. v15}, LL0/O;->d(LL0/O;LL0/d;LL0/U;IZILjava/util/List;JLY0/t;LY0/d;LQ0/k$b;ZILjava/lang/Object;)LL0/M;

    move-result-object v1

    return-object v1
.end method

.method private final q()LI/i1$b;
    .locals 1

    iget-object v0, p0, LI/i1;->b:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI/i1$b;

    return-object v0
.end method

.method private final r()LI/i1$c;
    .locals 1

    iget-object v0, p0, LI/i1;->a:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI/i1$c;

    return-object v0
.end method

.method private final s(LI/i1$c;LI/i1$b;)LL0/M;
    .locals 19

    move-object/from16 v1, p0

    invoke-virtual/range {p1 .. p1}, LI/i1$c;->d()LI/o1;

    move-result-object v0

    invoke-virtual {v0}, LI/o1;->l()LH/h;

    move-result-object v0

    iget-object v2, v1, LI/i1;->d:LI/i1$a;

    invoke-static {v2}, Landroidx/compose/runtime/snapshots/j;->F(Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v2

    check-cast v2, LI/i1$a;

    invoke-virtual {v2}, LI/i1$a;->o()LL0/M;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v2}, LI/i1$a;->s()Ljava/lang/CharSequence;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-static {v4, v0}, Lkotlin/text/t;->x(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_3

    invoke-virtual {v2}, LI/i1$a;->i()LL0/S;

    move-result-object v4

    invoke-virtual {v0}, LH/h;->c()LL0/S;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v2}, LI/i1$a;->p()Z

    move-result v4

    invoke-virtual/range {p1 .. p1}, LI/i1$c;->b()Z

    move-result v5

    if-ne v4, v5, :cond_3

    invoke-virtual {v2}, LI/i1$a;->q()Z

    move-result v4

    invoke-virtual/range {p1 .. p1}, LI/i1$c;->c()Z

    move-result v5

    if-ne v4, v5, :cond_3

    invoke-virtual {v2}, LI/i1$a;->n()LY0/t;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, LI/i1$b;->g()LY0/t;

    move-result-object v5

    if-ne v4, v5, :cond_3

    invoke-virtual {v2}, LI/i1$a;->k()F

    move-result v4

    invoke-virtual/range {p2 .. p2}, LI/i1$b;->c()LY0/d;

    move-result-object v5

    invoke-interface {v5}, LY0/d;->getDensity()F

    move-result v5

    cmpg-float v4, v4, v5

    if-nez v4, :cond_3

    invoke-virtual {v2}, LI/i1$a;->m()F

    move-result v4

    invoke-virtual/range {p2 .. p2}, LI/i1$b;->c()LY0/d;

    move-result-object v5

    invoke-interface {v5}, LY0/l;->y()F

    move-result v5

    cmpg-float v4, v4, v5

    if-nez v4, :cond_3

    invoke-virtual {v2}, LI/i1$a;->j()J

    move-result-wide v4

    invoke-virtual/range {p2 .. p2}, LI/i1$b;->b()J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, LY0/b;->f(JJ)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v2}, LI/i1$a;->l()LQ0/k$b;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, LI/i1$b;->e()LQ0/k$b;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v3}, LL0/M;->w()LL0/k;

    move-result-object v4

    invoke-virtual {v4}, LL0/k;->j()LL0/l;

    move-result-object v4

    invoke-virtual {v4}, LL0/l;->c()Z

    move-result v4

    if-nez v4, :cond_3

    invoke-virtual {v2}, LI/i1$a;->r()LL0/U;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    invoke-virtual/range {p1 .. p1}, LI/i1$c;->e()LL0/U;

    move-result-object v6

    invoke-virtual {v4, v6}, LL0/U;->G(LL0/U;)Z

    move-result v4

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    invoke-virtual {v2}, LI/i1$a;->r()LL0/U;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual/range {p1 .. p1}, LI/i1$c;->e()LL0/U;

    move-result-object v5

    invoke-virtual {v2, v5}, LL0/U;->F(LL0/U;)Z

    move-result v5

    :cond_1
    if-eqz v4, :cond_2

    if-eqz v5, :cond_2

    return-object v3

    :cond_2
    if-eqz v4, :cond_3

    new-instance v4, LL0/L;

    invoke-virtual {v3}, LL0/M;->l()LL0/L;

    move-result-object v0

    invoke-virtual {v0}, LL0/L;->j()LL0/d;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, LI/i1$c;->e()LL0/U;

    move-result-object v8

    invoke-virtual {v3}, LL0/M;->l()LL0/L;

    move-result-object v0

    invoke-virtual {v0}, LL0/L;->g()Ljava/util/List;

    move-result-object v9

    invoke-virtual {v3}, LL0/M;->l()LL0/L;

    move-result-object v0

    invoke-virtual {v0}, LL0/L;->e()I

    move-result v10

    invoke-virtual {v3}, LL0/M;->l()LL0/L;

    move-result-object v0

    invoke-virtual {v0}, LL0/L;->h()Z

    move-result v11

    invoke-virtual {v3}, LL0/M;->l()LL0/L;

    move-result-object v0

    invoke-virtual {v0}, LL0/L;->f()I

    move-result v12

    invoke-virtual {v3}, LL0/M;->l()LL0/L;

    move-result-object v0

    invoke-virtual {v0}, LL0/L;->b()LY0/d;

    move-result-object v13

    invoke-virtual {v3}, LL0/M;->l()LL0/L;

    move-result-object v0

    invoke-virtual {v0}, LL0/L;->d()LY0/t;

    move-result-object v14

    invoke-virtual {v3}, LL0/M;->l()LL0/L;

    move-result-object v0

    invoke-virtual {v0}, LL0/L;->c()LQ0/k$b;

    move-result-object v15

    invoke-virtual {v3}, LL0/M;->l()LL0/L;

    move-result-object v0

    invoke-virtual {v0}, LL0/L;->a()J

    move-result-wide v16

    const/16 v18, 0x0

    move-object v6, v4

    invoke-direct/range {v6 .. v18}, LL0/L;-><init>(LL0/d;LL0/U;Ljava/util/List;IZILY0/d;LY0/t;LQ0/k$b;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const-wide/16 v5, 0x0

    invoke-static/range {v3 .. v8}, LL0/M;->b(LL0/M;LL0/L;JILjava/lang/Object;)LL0/M;

    move-result-object v0

    return-object v0

    :cond_3
    move-object/from16 v2, p1

    move-object/from16 v4, p2

    invoke-direct {v1, v0, v2, v4}, LI/i1;->p(LH/h;LI/i1$c;LI/i1$b;)LL0/M;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    sget-object v3, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/g$a;->c()Landroidx/compose/runtime/snapshots/g;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/g;->i()Z

    move-result v6

    if-nez v6, :cond_4

    iget-object v6, v1, LI/i1;->d:LI/i1$a;

    invoke-static {}, Landroidx/compose/runtime/snapshots/j;->I()Ljava/lang/Object;

    move-result-object v7

    monitor-enter v7

    :try_start_0
    invoke-static {v6, v1, v3}, Landroidx/compose/runtime/snapshots/j;->h0(Landroidx/compose/runtime/snapshots/n;Ld0/k;Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/n;

    move-result-object v6

    check-cast v6, LI/i1$a;

    invoke-virtual {v6, v0}, LI/i1$a;->D(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, LH/h;->c()LL0/S;

    move-result-object v0

    invoke-virtual {v6, v0}, LI/i1$a;->t(LL0/S;)V

    invoke-virtual/range {p1 .. p1}, LI/i1$c;->b()Z

    move-result v0

    invoke-virtual {v6, v0}, LI/i1$a;->A(Z)V

    invoke-virtual/range {p1 .. p1}, LI/i1$c;->c()Z

    move-result v0

    invoke-virtual {v6, v0}, LI/i1$a;->B(Z)V

    invoke-virtual/range {p1 .. p1}, LI/i1$c;->e()LL0/U;

    move-result-object v0

    invoke-virtual {v6, v0}, LI/i1$a;->C(LL0/U;)V

    invoke-virtual/range {p2 .. p2}, LI/i1$b;->g()LY0/t;

    move-result-object v0

    invoke-virtual {v6, v0}, LI/i1$a;->y(LY0/t;)V

    invoke-virtual/range {p2 .. p2}, LI/i1$b;->d()F

    move-result v0

    invoke-virtual {v6, v0}, LI/i1$a;->v(F)V

    invoke-virtual/range {p2 .. p2}, LI/i1$b;->f()F

    move-result v0

    invoke-virtual {v6, v0}, LI/i1$a;->x(F)V

    invoke-virtual/range {p2 .. p2}, LI/i1$b;->b()J

    move-result-wide v8

    invoke-virtual {v6, v8, v9}, LI/i1$a;->u(J)V

    invoke-virtual/range {p2 .. p2}, LI/i1$b;->e()LQ0/k$b;

    move-result-object v0

    invoke-virtual {v6, v0}, LI/i1$a;->w(LQ0/k$b;)V

    invoke-virtual {v6, v5}, LI/i1$a;->z(LL0/M;)V

    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v7

    invoke-static {v3, v1}, Landroidx/compose/runtime/snapshots/j;->Q(Landroidx/compose/runtime/snapshots/g;Ld0/k;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v7

    throw v0

    :cond_4
    :goto_1
    return-object v5
.end method

.method private final v(LI/i1$b;)LL0/O;
    .locals 4

    iget-object v0, p0, LI/i1;->c:LL0/O;

    if-nez v0, :cond_0

    new-instance v0, LL0/O;

    invoke-virtual {p1}, LI/i1$b;->e()LQ0/k$b;

    move-result-object v1

    invoke-virtual {p1}, LI/i1$b;->c()LY0/d;

    move-result-object v2

    invoke-virtual {p1}, LI/i1$b;->g()LY0/t;

    move-result-object p1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, p1, v3}, LL0/O;-><init>(LQ0/k$b;LY0/d;LY0/t;I)V

    iput-object v0, p0, LI/i1;->c:LL0/O;

    :cond_0
    return-object v0
.end method

.method private final w(LI/i1$b;)V
    .locals 1

    iget-object v0, p0, LI/i1;->b:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final x(LI/i1$c;)V
    .locals 1

    iget-object v0, p0, LI/i1;->a:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public g(Landroidx/compose/runtime/snapshots/n;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LI/i1$a;

    iput-object p1, p0, LI/i1;->d:LI/i1$a;

    return-void
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI/i1;->t()LL0/M;

    move-result-object v0

    return-object v0
.end method

.method public i()Landroidx/compose/runtime/snapshots/n;
    .locals 1

    iget-object v0, p0, LI/i1;->d:LI/i1$a;

    return-object v0
.end method

.method public j(Landroidx/compose/runtime/snapshots/n;Landroidx/compose/runtime/snapshots/n;Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;
    .locals 0

    return-object p3
.end method

.method public t()LL0/M;
    .locals 3

    invoke-direct {p0}, LI/i1;->r()LI/i1$c;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-direct {p0}, LI/i1;->q()LI/i1$b;

    move-result-object v2

    if-nez v2, :cond_1

    return-object v1

    :cond_1
    invoke-direct {p0, v0, v2}, LI/i1;->s(LI/i1$c;LI/i1$b;)LL0/M;

    move-result-object v0

    return-object v0
.end method

.method public final u(LY0/d;LY0/t;LQ0/k$b;J)LL0/M;
    .locals 8

    new-instance v7, LI/i1$b;

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-direct/range {v0 .. v6}, LI/i1$b;-><init>(LY0/d;LY0/t;LQ0/k$b;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v7}, LI/i1;->w(LI/i1$b;)V

    invoke-direct {p0}, LI/i1;->r()LI/i1$c;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p1, v7}, LI/i1;->s(LI/i1$c;LI/i1$b;)LL0/M;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Called layoutWithNewMeasureInputs before updateNonMeasureInputs"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final y(LI/o1;LL0/U;ZZ)V
    .locals 1

    new-instance v0, LI/i1$c;

    invoke-direct {v0, p1, p2, p3, p4}, LI/i1$c;-><init>(LI/o1;LL0/U;ZZ)V

    invoke-direct {p0, v0}, LI/i1;->x(LI/i1$c;)V

    return-void
.end method
