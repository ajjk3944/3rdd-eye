.class public final LM/G;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LF/u0;

.field private b:LR0/H;

.field private c:Lmh/l;

.field private d:LF/E;

.field private final e:LT/q0;

.field private f:LR0/c0;

.field private g:Landroidx/compose/ui/platform/h0;

.field private h:Landroidx/compose/ui/platform/q1;

.field private i:Lu0/a;

.field private j:Landroidx/compose/ui/focus/o;

.field private final k:LT/q0;

.field private final l:LT/q0;

.field private m:J

.field private n:Ljava/lang/Integer;

.field private o:J

.field private final p:LT/q0;

.field private final q:LT/q0;

.field private r:I

.field private s:LR0/Q;

.field private t:LM/x;

.field private final u:LF/U;

.field private final v:LM/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LF/u0;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM/G;->a:LF/u0;

    invoke-static {}, LF/y0;->d()LR0/H;

    move-result-object p1

    iput-object p1, p0, LM/G;->b:LR0/H;

    sget-object p1, LM/G$d;->a:LM/G$d;

    iput-object p1, p0, LM/G;->c:Lmh/l;

    new-instance p1, LR0/Q;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, LR0/Q;-><init>(Ljava/lang/String;JLL0/S;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LM/G;->e:LT/q0;

    sget-object p1, LR0/c0;->a:LR0/c0$a;

    invoke-virtual {p1}, LR0/c0$a;->c()LR0/c0;

    move-result-object p1

    iput-object p1, p0, LM/G;->f:LR0/c0;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v2

    iput-object v2, p0, LM/G;->k:LT/q0;

    invoke-static {p1, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LM/G;->l:LT/q0;

    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide v2

    iput-wide v2, p0, LM/G;->m:J

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide v2

    iput-wide v2, p0, LM/G;->o:J

    invoke-static {v0, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LM/G;->p:LT/q0;

    invoke-static {v0, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LM/G;->q:LT/q0;

    const/4 p1, -0x1

    iput p1, p0, LM/G;->r:I

    new-instance p1, LR0/Q;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, LR0/Q;-><init>(Ljava/lang/String;JLL0/S;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LM/G;->s:LR0/Q;

    new-instance p1, LM/G$i;

    invoke-direct {p1, p0}, LM/G$i;-><init>(LM/G;)V

    iput-object p1, p0, LM/G;->u:LF/U;

    new-instance p1, LM/G$c;

    invoke-direct {p1, p0}, LM/G$c;-><init>(LM/G;)V

    iput-object p1, p0, LM/G;->v:LM/i;

    return-void
.end method

.method private final W(Ll0/g;)V
    .locals 1

    iget-object v0, p0, LM/G;->q:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final Y(LF/p;)V
    .locals 1

    iget-object v0, p0, LM/G;->p:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic a(LM/G;LL0/d;J)LR0/Q;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LM/G;->q(LL0/d;J)LR0/Q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LM/G;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, LM/G;->n:Ljava/lang/Integer;

    return-object p0
.end method

.method public static final synthetic c(LM/G;)J
    .locals 2

    iget-wide v0, p0, LM/G;->m:J

    return-wide v0
.end method

.method private final c0(LF/q;)V
    .locals 2

    iget-object v0, p0, LM/G;->d:LF/E;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LF/E;->d()LF/q;

    move-result-object v1

    if-ne v1, p1, :cond_0

    const/4 v0, 0x0

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, LF/E;->B(LF/q;)V

    :cond_1
    return-void
.end method

.method public static final synthetic d(LM/G;)J
    .locals 2

    iget-wide v0, p0, LM/G;->o:J

    return-wide v0
.end method

.method public static final synthetic e(LM/G;Ll0/g;)V
    .locals 0

    invoke-direct {p0, p1}, LM/G;->W(Ll0/g;)V

    return-void
.end method

.method public static final synthetic f(LM/G;Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, LM/G;->n:Ljava/lang/Integer;

    return-void
.end method

.method public static final synthetic g(LM/G;J)V
    .locals 0

    iput-wide p1, p0, LM/G;->m:J

    return-void
.end method

.method public static final synthetic h(LM/G;J)V
    .locals 0

    iput-wide p1, p0, LM/G;->o:J

    return-void
.end method

.method public static final synthetic i(LM/G;LF/p;)V
    .locals 0

    invoke-direct {p0, p1}, LM/G;->Y(LF/p;)V

    return-void
.end method

.method public static final synthetic j(LM/G;LF/q;)V
    .locals 0

    invoke-direct {p0, p1}, LM/G;->c0(LF/q;)V

    return-void
.end method

.method public static final synthetic k(LM/G;I)V
    .locals 0

    iput p1, p0, LM/G;->r:I

    return-void
.end method

.method public static final synthetic l(LM/G;Z)V
    .locals 0

    invoke-direct {p0, p1}, LM/G;->m0(Z)V

    return-void
.end method

.method public static final synthetic m(LM/G;LR0/Q;JZZLM/r;Z)J
    .locals 0

    invoke-direct/range {p0 .. p7}, LM/G;->n0(LR0/Q;JZZLM/r;Z)J

    move-result-wide p0

    return-wide p0
.end method

.method private final m0(Z)V
    .locals 1

    iget-object v0, p0, LM/G;->d:LF/E;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, LF/E;->K(Z)V

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p0}, LM/G;->l0()V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LM/G;->R()V

    :goto_1
    return-void
.end method

.method private final n0(LR0/Q;JZZLM/r;Z)J
    .locals 13

    move-object v0, p0

    move/from16 v9, p7

    iget-object v1, v0, LM/G;->d:LF/E;

    if-eqz v1, :cond_14

    invoke-virtual {v1}, LF/E;->j()LF/j0;

    move-result-object v1

    if-nez v1, :cond_0

    goto/16 :goto_d

    :cond_0
    iget-object v2, v0, LM/G;->b:LR0/H;

    invoke-virtual {p1}, LR0/Q;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, LL0/S;->n(J)I

    move-result v3

    invoke-interface {v2, v3}, LR0/H;->b(I)I

    move-result v2

    iget-object v3, v0, LM/G;->b:LR0/H;

    invoke-virtual {p1}, LR0/Q;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, LL0/S;->i(J)I

    move-result v4

    invoke-interface {v3, v4}, LR0/H;->b(I)I

    move-result v3

    invoke-static {v2, v3}, LL0/T;->b(II)J

    move-result-wide v5

    const/4 v10, 0x0

    move-wide v2, p2

    invoke-virtual {v1, v2, v3, v10}, LF/j0;->d(JZ)I

    move-result v11

    if-nez p5, :cond_2

    if-eqz p4, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v5, v6}, LL0/S;->n(J)I

    move-result v2

    goto :goto_1

    :cond_2
    :goto_0
    move v2, v11

    :goto_1
    if-eqz p5, :cond_4

    if-eqz p4, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {v5, v6}, LL0/S;->i(J)I

    move-result v3

    goto :goto_3

    :cond_4
    :goto_2
    move v3, v11

    :goto_3
    iget-object v12, v0, LM/G;->t:LM/x;

    const/4 v4, -0x1

    if-nez p4, :cond_6

    if-eqz v12, :cond_6

    iget v7, v0, LM/G;->r:I

    if-ne v7, v4, :cond_5

    goto :goto_4

    :cond_5
    move v4, v7

    :cond_6
    :goto_4
    invoke-virtual {v1}, LF/j0;->f()LL0/M;

    move-result-object v1

    move/from16 v7, p4

    move/from16 v8, p5

    invoke-static/range {v1 .. v8}, LM/y;->c(LL0/M;IIIJZZ)LM/x;

    move-result-object v1

    invoke-interface {v1, v12}, LM/x;->j(LM/x;)Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {p1}, LR0/Q;->h()J

    move-result-wide v1

    return-wide v1

    :cond_7
    iput-object v1, v0, LM/G;->t:LM/x;

    iput v11, v0, LM/G;->r:I

    move-object/from16 v2, p6

    invoke-interface {v2, v1}, LM/r;->a(LM/x;)LM/l;

    move-result-object v1

    iget-object v2, v0, LM/G;->b:LR0/H;

    invoke-virtual {v1}, LM/l;->e()LM/l$a;

    move-result-object v3

    invoke-virtual {v3}, LM/l$a;->c()I

    move-result v3

    invoke-interface {v2, v3}, LR0/H;->a(I)I

    move-result v2

    iget-object v3, v0, LM/G;->b:LR0/H;

    invoke-virtual {v1}, LM/l;->c()LM/l$a;

    move-result-object v1

    invoke-virtual {v1}, LM/l$a;->c()I

    move-result v1

    invoke-interface {v3, v1}, LR0/H;->a(I)I

    move-result v1

    invoke-static {v2, v1}, LL0/T;->b(II)J

    move-result-wide v1

    invoke-virtual {p1}, LR0/Q;->h()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, LL0/S;->g(JJ)Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {p1}, LR0/Q;->h()J

    move-result-wide v1

    return-wide v1

    :cond_8
    invoke-static {v1, v2}, LL0/S;->m(J)Z

    move-result v3

    invoke-virtual {p1}, LR0/Q;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, LL0/S;->m(J)Z

    move-result v4

    const/4 v5, 0x1

    if-eq v3, v4, :cond_9

    invoke-static {v1, v2}, LL0/S;->i(J)I

    move-result v3

    invoke-static {v1, v2}, LL0/S;->n(J)I

    move-result v4

    invoke-static {v3, v4}, LL0/T;->b(II)J

    move-result-wide v3

    invoke-virtual {p1}, LR0/Q;->h()J

    move-result-wide v6

    invoke-static {v3, v4, v6, v7}, LL0/S;->g(JJ)Z

    move-result v3

    if-eqz v3, :cond_9

    move v3, v5

    goto :goto_5

    :cond_9
    move v3, v10

    :goto_5
    invoke-static {v1, v2}, LL0/S;->h(J)Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {p1}, LR0/Q;->h()J

    move-result-wide v6

    invoke-static {v6, v7}, LL0/S;->h(J)Z

    move-result v4

    if-eqz v4, :cond_a

    move v4, v5

    goto :goto_6

    :cond_a
    move v4, v10

    :goto_6
    if-eqz v9, :cond_b

    invoke-virtual {p1}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-lez v6, :cond_b

    if-nez v3, :cond_b

    if-nez v4, :cond_b

    iget-object v3, v0, LM/G;->i:Lu0/a;

    if-eqz v3, :cond_b

    sget-object v4, Lu0/b;->a:Lu0/b$a;

    invoke-virtual {v4}, Lu0/b$a;->b()I

    move-result v4

    invoke-interface {v3, v4}, Lu0/a;->a(I)V

    :cond_b
    invoke-virtual {p1}, LR0/Q;->f()LL0/d;

    move-result-object v3

    invoke-direct {p0, v3, v1, v2}, LM/G;->q(LL0/d;J)LR0/Q;

    move-result-object v3

    iget-object v4, v0, LM/G;->c:Lmh/l;

    invoke-interface {v4, v3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    if-nez v9, :cond_c

    invoke-static {v1, v2}, LL0/S;->h(J)Z

    move-result v3

    xor-int/2addr v3, v5

    invoke-direct {p0, v3}, LM/G;->m0(Z)V

    :cond_c
    iget-object v3, v0, LM/G;->d:LF/E;

    if-nez v3, :cond_d

    goto :goto_7

    :cond_d
    invoke-virtual {v3, v9}, LF/E;->D(Z)V

    :goto_7
    iget-object v3, v0, LM/G;->d:LF/E;

    if-nez v3, :cond_e

    goto :goto_9

    :cond_e
    invoke-static {v1, v2}, LL0/S;->h(J)Z

    move-result v4

    if-nez v4, :cond_f

    invoke-static {p0, v5}, LM/H;->c(LM/G;Z)Z

    move-result v4

    if-eqz v4, :cond_f

    move v4, v5

    goto :goto_8

    :cond_f
    move v4, v10

    :goto_8
    invoke-virtual {v3, v4}, LF/E;->M(Z)V

    :goto_9
    iget-object v3, v0, LM/G;->d:LF/E;

    if-nez v3, :cond_10

    goto :goto_b

    :cond_10
    invoke-static {v1, v2}, LL0/S;->h(J)Z

    move-result v4

    if-nez v4, :cond_11

    invoke-static {p0, v10}, LM/H;->c(LM/G;Z)Z

    move-result v4

    if-eqz v4, :cond_11

    move v4, v5

    goto :goto_a

    :cond_11
    move v4, v10

    :goto_a
    invoke-virtual {v3, v4}, LF/E;->L(Z)V

    :goto_b
    iget-object v3, v0, LM/G;->d:LF/E;

    if-nez v3, :cond_12

    goto :goto_c

    :cond_12
    invoke-static {v1, v2}, LL0/S;->h(J)Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-static {p0, v5}, LM/H;->c(LM/G;Z)Z

    move-result v4

    if-eqz v4, :cond_13

    move v10, v5

    :cond_13
    invoke-virtual {v3, v10}, LF/E;->J(Z)V

    :goto_c
    return-wide v1

    :cond_14
    :goto_d
    sget-object v1, LL0/S;->b:LL0/S$a;

    invoke-virtual {v1}, LL0/S$a;->a()J

    move-result-wide v1

    return-wide v1
.end method

.method public static synthetic p(LM/G;ZILjava/lang/Object;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-virtual {p0, p1}, LM/G;->o(Z)V

    return-void
.end method

.method private final q(LL0/d;J)LR0/Q;
    .locals 8

    new-instance v7, LR0/Q;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    move-object v1, p1

    move-wide v2, p2

    invoke-direct/range {v0 .. v6}, LR0/Q;-><init>(LL0/d;JLL0/S;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method public static synthetic u(LM/G;Ll0/g;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, LM/G;->t(Ll0/g;)V

    return-void
.end method

.method public static synthetic w(LM/G;ZILjava/lang/Object;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-virtual {p0, p1}, LM/G;->v(Z)V

    return-void
.end method

.method private final z()Ll0/i;
    .locals 11

    iget-object v0, p0, LM/G;->d:LF/E;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, LF/E;->z()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_7

    iget-object v1, p0, LM/G;->b:LR0/H;

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v2

    invoke-virtual {v2}, LR0/Q;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->n(J)I

    move-result v2

    invoke-interface {v1, v2}, LR0/H;->b(I)I

    move-result v1

    iget-object v2, p0, LM/G;->b:LR0/H;

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v3

    invoke-virtual {v3}, LR0/Q;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, LL0/S;->i(J)I

    move-result v3

    invoke-interface {v2, v3}, LR0/H;->b(I)I

    move-result v2

    iget-object v3, p0, LM/G;->d:LF/E;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, LF/E;->i()LC0/r;

    move-result-object v3

    if-eqz v3, :cond_1

    const/4 v4, 0x1

    invoke-virtual {p0, v4}, LM/G;->G(Z)J

    move-result-wide v4

    invoke-interface {v3, v4, v5}, LC0/r;->o0(J)J

    move-result-wide v3

    goto :goto_1

    :cond_1
    sget-object v3, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v3}, Ll0/g$a;->c()J

    move-result-wide v3

    :goto_1
    iget-object v5, p0, LM/G;->d:LF/E;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, LF/E;->i()LC0/r;

    move-result-object v5

    if-eqz v5, :cond_2

    const/4 v6, 0x0

    invoke-virtual {p0, v6}, LM/G;->G(Z)J

    move-result-wide v6

    invoke-interface {v5, v6, v7}, LC0/r;->o0(J)J

    move-result-wide v5

    goto :goto_2

    :cond_2
    sget-object v5, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v5}, Ll0/g$a;->c()J

    move-result-wide v5

    :goto_2
    iget-object v7, p0, LM/G;->d:LF/E;

    const/4 v8, 0x0

    if-eqz v7, :cond_4

    invoke-virtual {v7}, LF/E;->i()LC0/r;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-virtual {v0}, LF/E;->j()LF/j0;

    move-result-object v9

    if-eqz v9, :cond_3

    invoke-virtual {v9}, LF/j0;->f()LL0/M;

    move-result-object v9

    if-eqz v9, :cond_3

    invoke-virtual {v9, v1}, LL0/M;->e(I)Ll0/i;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ll0/i;->n()F

    move-result v1

    goto :goto_3

    :cond_3
    move v1, v8

    :goto_3
    invoke-static {v8, v1}, Ll0/h;->a(FF)J

    move-result-wide v9

    invoke-interface {v7, v9, v10}, LC0/r;->o0(J)J

    move-result-wide v9

    invoke-static {v9, v10}, Ll0/g;->n(J)F

    move-result v1

    goto :goto_4

    :cond_4
    move v1, v8

    :goto_4
    iget-object v7, p0, LM/G;->d:LF/E;

    if-eqz v7, :cond_6

    invoke-virtual {v7}, LF/E;->i()LC0/r;

    move-result-object v7

    if-eqz v7, :cond_6

    invoke-virtual {v0}, LF/E;->j()LF/j0;

    move-result-object v9

    if-eqz v9, :cond_5

    invoke-virtual {v9}, LF/j0;->f()LL0/M;

    move-result-object v9

    if-eqz v9, :cond_5

    invoke-virtual {v9, v2}, LL0/M;->e(I)Ll0/i;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ll0/i;->n()F

    move-result v2

    goto :goto_5

    :cond_5
    move v2, v8

    :goto_5
    invoke-static {v8, v2}, Ll0/h;->a(FF)J

    move-result-wide v8

    invoke-interface {v7, v8, v9}, LC0/r;->o0(J)J

    move-result-wide v7

    invoke-static {v7, v8}, Ll0/g;->n(J)F

    move-result v8

    :cond_6
    invoke-static {v3, v4}, Ll0/g;->m(J)F

    move-result v2

    invoke-static {v5, v6}, Ll0/g;->m(J)F

    move-result v7

    invoke-static {v2, v7}, Ljava/lang/Math;->min(FF)F

    move-result v2

    invoke-static {v3, v4}, Ll0/g;->m(J)F

    move-result v7

    invoke-static {v5, v6}, Ll0/g;->m(J)F

    move-result v9

    invoke-static {v7, v9}, Ljava/lang/Math;->max(FF)F

    move-result v7

    invoke-static {v1, v8}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-static {v3, v4}, Ll0/g;->n(J)F

    move-result v3

    invoke-static {v5, v6}, Ll0/g;->n(J)F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    const/16 v4, 0x19

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-virtual {v0}, LF/E;->v()LF/S;

    move-result-object v0

    invoke-virtual {v0}, LF/S;->a()LY0/d;

    move-result-object v0

    invoke-interface {v0}, LY0/d;->getDensity()F

    move-result v0

    mul-float/2addr v4, v0

    add-float/2addr v3, v4

    new-instance v0, Ll0/i;

    invoke-direct {v0, v2, v1, v7, v3}, Ll0/i;-><init>(FFFF)V

    return-object v0

    :cond_7
    sget-object v0, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {v0}, Ll0/i$a;->a()Ll0/i;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final A()Ll0/g;
    .locals 1

    iget-object v0, p0, LM/G;->q:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/g;

    return-object v0
.end method

.method public final B(LY0/d;)J
    .locals 4

    iget-object v0, p0, LM/G;->b:LR0/H;

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v1

    invoke-virtual {v1}, LR0/Q;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->n(J)I

    move-result v1

    invoke-interface {v0, v1}, LR0/H;->b(I)I

    move-result v0

    iget-object v1, p0, LM/G;->d:LF/E;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LF/E;->j()LF/j0;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v1}, LF/j0;->f()LL0/M;

    move-result-object v1

    invoke-virtual {v1}, LL0/M;->l()LL0/L;

    move-result-object v2

    invoke-virtual {v2}, LL0/L;->j()LL0/d;

    move-result-object v2

    invoke-virtual {v2}, LL0/d;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v0, v3, v2}, Lsh/m;->k(III)I

    move-result v0

    invoke-virtual {v1, v0}, LL0/M;->e(I)Ll0/i;

    move-result-object v0

    invoke-virtual {v0}, Ll0/i;->k()F

    move-result v1

    invoke-static {}, LF/V;->b()F

    move-result v2

    invoke-interface {p1, v2}, LY0/d;->d1(F)F

    move-result p1

    const/4 v2, 0x2

    int-to-float v2, v2

    div-float/2addr p1, v2

    add-float/2addr v1, p1

    invoke-virtual {v0}, Ll0/i;->e()F

    move-result p1

    invoke-static {v1, p1}, Ll0/h;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public final C()LF/p;
    .locals 1

    iget-object v0, p0, LM/G;->p:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF/p;

    return-object v0
.end method

.method public final D()Z
    .locals 1

    iget-object v0, p0, LM/G;->k:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final E()Z
    .locals 1

    iget-object v0, p0, LM/G;->l:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final F()Landroidx/compose/ui/focus/o;
    .locals 1

    iget-object v0, p0, LM/G;->j:Landroidx/compose/ui/focus/o;

    return-object v0
.end method

.method public final G(Z)J
    .locals 4

    iget-object v0, p0, LM/G;->d:LF/E;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, LF/E;->j()LF/j0;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, LF/j0;->f()LL0/M;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, LM/G;->N()LL0/d;

    move-result-object v1

    if-nez v1, :cond_1

    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->b()J

    move-result-wide v0

    return-wide v0

    :cond_1
    invoke-virtual {v0}, LL0/M;->l()LL0/L;

    move-result-object v2

    invoke-virtual {v2}, LL0/L;->j()LL0/d;

    move-result-object v2

    invoke-virtual {v2}, LL0/d;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, LL0/d;->k()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->b()J

    move-result-wide v0

    return-wide v0

    :cond_2
    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v1

    invoke-virtual {v1}, LR0/Q;->h()J

    move-result-wide v1

    if-eqz p1, :cond_3

    invoke-static {v1, v2}, LL0/S;->n(J)I

    move-result v1

    goto :goto_0

    :cond_3
    invoke-static {v1, v2}, LL0/S;->i(J)I

    move-result v1

    :goto_0
    iget-object v2, p0, LM/G;->b:LR0/H;

    invoke-interface {v2, v1}, LR0/H;->b(I)I

    move-result v1

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v2

    invoke-virtual {v2}, LR0/Q;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->m(J)Z

    move-result v2

    invoke-static {v0, v1, p1, v2}, LM/M;->b(LL0/M;IZZ)J

    move-result-wide v0

    return-wide v0

    :cond_4
    :goto_1
    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public final H()Lu0/a;
    .locals 1

    iget-object v0, p0, LM/G;->i:Lu0/a;

    return-object v0
.end method

.method public final I()LM/i;
    .locals 1

    iget-object v0, p0, LM/G;->v:LM/i;

    return-object v0
.end method

.method public final J()LR0/H;
    .locals 1

    iget-object v0, p0, LM/G;->b:LR0/H;

    return-object v0
.end method

.method public final K()Lmh/l;
    .locals 1

    iget-object v0, p0, LM/G;->c:Lmh/l;

    return-object v0
.end method

.method public final L()LF/E;
    .locals 1

    iget-object v0, p0, LM/G;->d:LF/E;

    return-object v0
.end method

.method public final M()LF/U;
    .locals 1

    iget-object v0, p0, LM/G;->u:LF/U;

    return-object v0
.end method

.method public final N()LL0/d;
    .locals 1

    iget-object v0, p0, LM/G;->d:LF/E;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF/E;->v()LF/S;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF/S;->k()LL0/d;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final O()LR0/Q;
    .locals 1

    iget-object v0, p0, LM/G;->e:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LR0/Q;

    return-object v0
.end method

.method public final P()LR0/c0;
    .locals 1

    iget-object v0, p0, LM/G;->f:LR0/c0;

    return-object v0
.end method

.method public final Q(Z)LF/U;
    .locals 1

    new-instance v0, LM/G$b;

    invoke-direct {v0, p0, p1}, LM/G$b;-><init>(LM/G;Z)V

    return-object v0
.end method

.method public final R()V
    .locals 2

    iget-object v0, p0, LM/G;->h:Landroidx/compose/ui/platform/q1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/compose/ui/platform/q1;->a()Landroidx/compose/ui/platform/s1;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Landroidx/compose/ui/platform/s1;->Shown:Landroidx/compose/ui/platform/s1;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LM/G;->h:Landroidx/compose/ui/platform/q1;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/compose/ui/platform/q1;->c()V

    :cond_1
    return-void
.end method

.method public final S()Z
    .locals 2

    iget-object v0, p0, LM/G;->s:LR0/Q;

    invoke-virtual {v0}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v1

    invoke-virtual {v1}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final T()V
    .locals 4

    iget-object v0, p0, LM/G;->g:Landroidx/compose/ui/platform/h0;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/compose/ui/platform/h0;->a()LL0/d;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v1

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v2

    invoke-virtual {v2}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v1, v2}, LR0/S;->c(LR0/Q;I)LL0/d;

    move-result-object v1

    invoke-virtual {v1, v0}, LL0/d;->q(LL0/d;)LL0/d;

    move-result-object v1

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v2

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v3

    invoke-virtual {v3}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v2, v3}, LR0/S;->b(LR0/Q;I)LL0/d;

    move-result-object v2

    invoke-virtual {v1, v2}, LL0/d;->q(LL0/d;)LL0/d;

    move-result-object v1

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v2

    invoke-virtual {v2}, LR0/Q;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->l(J)I

    move-result v2

    invoke-virtual {v0}, LL0/d;->length()I

    move-result v0

    add-int/2addr v2, v0

    invoke-static {v2, v2}, LL0/T;->b(II)J

    move-result-wide v2

    invoke-direct {p0, v1, v2, v3}, LM/G;->q(LL0/d;J)LR0/Q;

    move-result-object v0

    iget-object v1, p0, LM/G;->c:Lmh/l;

    invoke-interface {v1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, LF/q;->None:LF/q;

    invoke-direct {p0, v0}, LM/G;->c0(LF/q;)V

    iget-object v0, p0, LM/G;->a:LF/u0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LF/u0;->a()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final U()V
    .locals 9

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v0

    invoke-virtual {v0}, LR0/Q;->f()LL0/d;

    move-result-object v0

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v1

    invoke-virtual {v1}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v2, v1}, LL0/T;->b(II)J

    move-result-wide v1

    invoke-direct {p0, v0, v1, v2}, LM/G;->q(LL0/d;J)LR0/Q;

    move-result-object v0

    iget-object v1, p0, LM/G;->c:Lmh/l;

    invoke-interface {v1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, LM/G;->s:LR0/Q;

    invoke-virtual {v0}, LR0/Q;->h()J

    move-result-wide v4

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, LR0/Q;->d(LR0/Q;LL0/d;JLL0/S;ILjava/lang/Object;)LR0/Q;

    move-result-object v0

    iput-object v0, p0, LM/G;->s:LR0/Q;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LM/G;->v(Z)V

    return-void
.end method

.method public final V(Landroidx/compose/ui/platform/h0;)V
    .locals 0

    iput-object p1, p0, LM/G;->g:Landroidx/compose/ui/platform/h0;

    return-void
.end method

.method public final X(J)V
    .locals 3

    iget-object v0, p0, LM/G;->d:LF/E;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, p2}, LF/E;->A(J)V

    :goto_0
    iget-object v0, p0, LM/G;->d:LF/E;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    sget-object v1, LL0/S;->b:LL0/S$a;

    invoke-virtual {v1}, LL0/S$a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LF/E;->I(J)V

    :goto_1
    invoke-static {p1, p2}, LL0/S;->h(J)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, LM/G;->x()V

    :cond_2
    return-void
.end method

.method public final Z(Z)V
    .locals 1

    iget-object v0, p0, LM/G;->k:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final a0(Z)V
    .locals 1

    iget-object v0, p0, LM/G;->l:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final b0(Landroidx/compose/ui/focus/o;)V
    .locals 0

    iput-object p1, p0, LM/G;->j:Landroidx/compose/ui/focus/o;

    return-void
.end method

.method public final d0(Lu0/a;)V
    .locals 0

    iput-object p1, p0, LM/G;->i:Lu0/a;

    return-void
.end method

.method public final e0(LR0/H;)V
    .locals 0

    iput-object p1, p0, LM/G;->b:LR0/H;

    return-void
.end method

.method public final f0(Lmh/l;)V
    .locals 0

    iput-object p1, p0, LM/G;->c:Lmh/l;

    return-void
.end method

.method public final g0(J)V
    .locals 3

    iget-object v0, p0, LM/G;->d:LF/E;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, p2}, LF/E;->I(J)V

    :goto_0
    iget-object v0, p0, LM/G;->d:LF/E;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    sget-object v1, LL0/S;->b:LL0/S$a;

    invoke-virtual {v1}, LL0/S$a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LF/E;->A(J)V

    :goto_1
    invoke-static {p1, p2}, LL0/S;->h(J)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, LM/G;->x()V

    :cond_2
    return-void
.end method

.method public final h0(LF/E;)V
    .locals 0

    iput-object p1, p0, LM/G;->d:LF/E;

    return-void
.end method

.method public final i0(Landroidx/compose/ui/platform/q1;)V
    .locals 0

    iput-object p1, p0, LM/G;->h:Landroidx/compose/ui/platform/q1;

    return-void
.end method

.method public final j0(LR0/Q;)V
    .locals 1

    iget-object v0, p0, LM/G;->e:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final k0(LR0/c0;)V
    .locals 0

    iput-object p1, p0, LM/G;->f:LR0/c0;

    return-void
.end method

.method public final l0()V
    .locals 9

    invoke-virtual {p0}, LM/G;->E()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, LM/G;->d:LF/E;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF/E;->y()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, LM/G;->f:LR0/c0;

    instance-of v0, v0, LR0/J;

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v1

    invoke-virtual {v1}, LR0/Q;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->h(J)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    if-nez v0, :cond_1

    new-instance v1, LM/G$e;

    invoke-direct {v1, p0}, LM/G$e;-><init>(LM/G;)V

    move-object v5, v1

    goto :goto_0

    :cond_1
    move-object v5, v2

    :goto_0
    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v1

    invoke-virtual {v1}, LR0/Q;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, LL0/S;->h(J)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, LM/G;->D()Z

    move-result v1

    if-eqz v1, :cond_2

    if-nez v0, :cond_2

    new-instance v0, LM/G$f;

    invoke-direct {v0, p0}, LM/G$f;-><init>(LM/G;)V

    move-object v7, v0

    goto :goto_1

    :cond_2
    move-object v7, v2

    :goto_1
    invoke-virtual {p0}, LM/G;->D()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, LM/G;->g:Landroidx/compose/ui/platform/h0;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Landroidx/compose/ui/platform/h0;->c()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    new-instance v0, LM/G$g;

    invoke-direct {v0, p0}, LM/G$g;-><init>(LM/G;)V

    move-object v6, v0

    goto :goto_2

    :cond_3
    move-object v6, v2

    :goto_2
    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v0

    invoke-virtual {v0}, LR0/Q;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->j(J)I

    move-result v0

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v1

    invoke-virtual {v1}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-eq v0, v1, :cond_4

    new-instance v2, LM/G$h;

    invoke-direct {v2, p0}, LM/G$h;-><init>(LM/G;)V

    :cond_4
    move-object v8, v2

    iget-object v3, p0, LM/G;->h:Landroidx/compose/ui/platform/q1;

    if-eqz v3, :cond_5

    invoke-direct {p0}, LM/G;->z()Ll0/i;

    move-result-object v4

    invoke-interface/range {v3 .. v8}, Landroidx/compose/ui/platform/q1;->b(Ll0/i;Lmh/a;Lmh/a;Lmh/a;Lmh/a;)V

    :cond_5
    :goto_3
    return-void
.end method

.method public final n()V
    .locals 3

    iget-object v0, p0, LM/G;->d:LF/E;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, LL0/S;->b:LL0/S$a;

    invoke-virtual {v1}, LL0/S$a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LF/E;->A(J)V

    :goto_0
    iget-object v0, p0, LM/G;->d:LF/E;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    sget-object v1, LL0/S;->b:LL0/S$a;

    invoke-virtual {v1}, LL0/S$a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LF/E;->I(J)V

    :goto_1
    return-void
.end method

.method public final o(Z)V
    .locals 3

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v0

    invoke-virtual {v0}, LR0/Q;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LM/G;->g:Landroidx/compose/ui/platform/h0;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v1

    invoke-static {v1}, LR0/S;->a(LR0/Q;)LL0/d;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/compose/ui/platform/h0;->b(LL0/d;)V

    :cond_1
    if-nez p1, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object p1

    invoke-virtual {p1}, LR0/Q;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->k(J)I

    move-result p1

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v0

    invoke-virtual {v0}, LR0/Q;->f()LL0/d;

    move-result-object v0

    invoke-static {p1, p1}, LL0/T;->b(II)J

    move-result-wide v1

    invoke-direct {p0, v0, v1, v2}, LM/G;->q(LL0/d;J)LR0/Q;

    move-result-object p1

    iget-object v0, p0, LM/G;->c:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, LF/q;->None:LF/q;

    invoke-direct {p0, p1}, LM/G;->c0(LF/q;)V

    return-void
.end method

.method public final r()LF/U;
    .locals 1

    new-instance v0, LM/G$a;

    invoke-direct {v0, p0}, LM/G$a;-><init>(LM/G;)V

    return-object v0
.end method

.method public final s()V
    .locals 3

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v0

    invoke-virtual {v0}, LR0/Q;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LM/G;->g:Landroidx/compose/ui/platform/h0;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v1

    invoke-static {v1}, LR0/S;->a(LR0/Q;)LL0/d;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/compose/ui/platform/h0;->b(LL0/d;)V

    :cond_1
    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v0

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v1

    invoke-virtual {v1}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v0, v1}, LR0/S;->c(LR0/Q;I)LL0/d;

    move-result-object v0

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v1

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v2

    invoke-virtual {v2}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v1, v2}, LR0/S;->b(LR0/Q;I)LL0/d;

    move-result-object v1

    invoke-virtual {v0, v1}, LL0/d;->q(LL0/d;)LL0/d;

    move-result-object v0

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v1

    invoke-virtual {v1}, LR0/Q;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->l(J)I

    move-result v1

    invoke-static {v1, v1}, LL0/T;->b(II)J

    move-result-wide v1

    invoke-direct {p0, v0, v1, v2}, LM/G;->q(LL0/d;J)LR0/Q;

    move-result-object v0

    iget-object v1, p0, LM/G;->c:Lmh/l;

    invoke-interface {v1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, LF/q;->None:LF/q;

    invoke-direct {p0, v0}, LM/G;->c0(LF/q;)V

    iget-object v0, p0, LM/G;->a:LF/u0;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LF/u0;->a()V

    :cond_2
    return-void
.end method

.method public final t(Ll0/g;)V
    .locals 8

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v0

    invoke-virtual {v0}, LR0/Q;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LM/G;->d:LF/E;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF/E;->j()LF/j0;

    move-result-object v0

    :goto_0
    move-object v1, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    if-eqz p1, :cond_1

    if-eqz v1, :cond_1

    iget-object v0, p0, LM/G;->b:LR0/H;

    invoke-virtual {p1}, Ll0/g;->v()J

    move-result-wide v2

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LF/j0;->e(LF/j0;JZILjava/lang/Object;)I

    move-result v1

    invoke-interface {v0, v1}, LR0/H;->a(I)I

    move-result v0

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v0

    invoke-virtual {v0}, LR0/Q;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->k(J)I

    move-result v0

    :goto_2
    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v1

    invoke-static {v0}, LL0/T;->a(I)J

    move-result-wide v3

    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, LR0/Q;->d(LR0/Q;LL0/d;JLL0/S;ILjava/lang/Object;)LR0/Q;

    move-result-object v0

    iget-object v1, p0, LM/G;->c:Lmh/l;

    invoke-interface {v1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object p1

    invoke-virtual {p1}, LR0/Q;->i()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_3

    sget-object p1, LF/q;->Cursor:LF/q;

    goto :goto_3

    :cond_3
    sget-object p1, LF/q;->None:LF/q;

    :goto_3
    invoke-direct {p0, p1}, LM/G;->c0(LF/q;)V

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LM/G;->m0(Z)V

    return-void
.end method

.method public final v(Z)V
    .locals 1

    iget-object v0, p0, LM/G;->d:LF/E;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF/E;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LM/G;->j:Landroidx/compose/ui/focus/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/focus/o;->f()V

    :cond_0
    invoke-virtual {p0}, LM/G;->O()LR0/Q;

    move-result-object v0

    iput-object v0, p0, LM/G;->s:LR0/Q;

    invoke-direct {p0, p1}, LM/G;->m0(Z)V

    sget-object p1, LF/q;->Selection:LF/q;

    invoke-direct {p0, p1}, LM/G;->c0(LF/q;)V

    return-void
.end method

.method public final x()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LM/G;->m0(Z)V

    sget-object v0, LF/q;->None:LF/q;

    invoke-direct {p0, v0}, LM/G;->c0(LF/q;)V

    return-void
.end method

.method public final y()Landroidx/compose/ui/platform/h0;
    .locals 1

    iget-object v0, p0, LM/G;->g:Landroidx/compose/ui/platform/h0;

    return-object v0
.end method
