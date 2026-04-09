.class public final Ls/J;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/t;
.implements LE0/r;
.implements LE0/v0;
.implements LE0/h0;


# instance fields
.field private final A:LT/q0;

.field private B:LT/z1;

.field private C:J

.field private D:LY0/r;

.field private E:LKi/g;

.field private n:Lmh/l;

.field private o:Lmh/l;

.field private p:Lmh/l;

.field private q:F

.field private r:Z

.field private s:J

.field private t:F

.field private u:F

.field private v:Z

.field private w:Ls/V;

.field private x:Landroid/view/View;

.field private y:LY0/d;

.field private z:Ls/U;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lmh/l;Lmh/l;Lmh/l;FZJFFZLs/V;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 8
    iput-object p1, p0, Ls/J;->n:Lmh/l;

    .line 9
    iput-object p2, p0, Ls/J;->o:Lmh/l;

    .line 10
    iput-object p3, p0, Ls/J;->p:Lmh/l;

    .line 11
    iput p4, p0, Ls/J;->q:F

    .line 12
    iput-boolean p5, p0, Ls/J;->r:Z

    .line 13
    iput-wide p6, p0, Ls/J;->s:J

    .line 14
    iput p8, p0, Ls/J;->t:F

    .line 15
    iput p9, p0, Ls/J;->u:F

    .line 16
    iput-boolean p10, p0, Ls/J;->v:Z

    .line 17
    iput-object p11, p0, Ls/J;->w:Ls/V;

    const/4 p1, 0x0

    .line 18
    invoke-static {}, LT/o1;->j()LT/n1;

    move-result-object p2

    invoke-static {p1, p2}, LT/o1;->h(Ljava/lang/Object;LT/n1;)LT/q0;

    move-result-object p1

    iput-object p1, p0, Ls/J;->A:LT/q0;

    .line 19
    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->b()J

    move-result-wide p1

    iput-wide p1, p0, Ls/J;->C:J

    return-void
.end method

.method public synthetic constructor <init>(Lmh/l;Lmh/l;Lmh/l;FZJFFZLs/V;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v5, v2

    goto :goto_0

    :cond_0
    move-object/from16 v5, p2

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    move-object v6, v2

    goto :goto_1

    :cond_1
    move-object/from16 v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    const/high16 v1, 0x7fc00000    # Float.NaN

    move v7, v1

    goto :goto_2

    :cond_2
    move/from16 v7, p4

    :goto_2
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    move v8, v1

    goto :goto_3

    :cond_3
    move/from16 v8, p5

    :goto_3
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_4

    .line 2
    sget-object v1, LY0/k;->b:LY0/k$a;

    invoke-virtual {v1}, LY0/k$a;->a()J

    move-result-wide v1

    move-wide v9, v1

    goto :goto_4

    :cond_4
    move-wide/from16 v9, p6

    :goto_4
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_5

    .line 3
    sget-object v1, LY0/h;->b:LY0/h$a;

    invoke-virtual {v1}, LY0/h$a;->c()F

    move-result v1

    move v11, v1

    goto :goto_5

    :cond_5
    move/from16 v11, p8

    :goto_5
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_6

    .line 4
    sget-object v1, LY0/h;->b:LY0/h$a;

    invoke-virtual {v1}, LY0/h$a;->c()F

    move-result v1

    move v12, v1

    goto :goto_6

    :cond_6
    move/from16 v12, p9

    :goto_6
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_7

    const/4 v1, 0x1

    move v13, v1

    goto :goto_7

    :cond_7
    move/from16 v13, p10

    :goto_7
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_8

    .line 5
    sget-object v0, Ls/V;->a:Ls/V$a;

    invoke-virtual {v0}, Ls/V$a;->a()Ls/V;

    move-result-object v0

    move-object v14, v0

    goto :goto_8

    :cond_8
    move-object/from16 v14, p11

    :goto_8
    const/4 v15, 0x0

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    .line 6
    invoke-direct/range {v3 .. v15}, Ls/J;-><init>(Lmh/l;Lmh/l;Lmh/l;FZJFFZLs/V;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lmh/l;Lmh/l;Lmh/l;FZJFFZLs/V;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p11}, Ls/J;-><init>(Lmh/l;Lmh/l;Lmh/l;FZJFFZLs/V;)V

    return-void
.end method

.method public static final synthetic D2(Ls/J;)LKi/g;
    .locals 0

    iget-object p0, p0, Ls/J;->E:LKi/g;

    return-object p0
.end method

.method public static final synthetic E2(Ls/J;)LC0/r;
    .locals 0

    invoke-direct {p0}, Ls/J;->o1()LC0/r;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic F2(Ls/J;)Ls/U;
    .locals 0

    iget-object p0, p0, Ls/J;->z:Ls/U;

    return-object p0
.end method

.method public static final synthetic G2(Ls/J;)J
    .locals 2

    iget-wide v0, p0, Ls/J;->C:J

    return-wide v0
.end method

.method public static final synthetic H2(Ls/J;)V
    .locals 0

    invoke-direct {p0}, Ls/J;->M2()V

    return-void
.end method

.method private final I2()J
    .locals 2

    iget-object v0, p0, Ls/J;->B:LT/z1;

    if-nez v0, :cond_0

    new-instance v0, Ls/J$a;

    invoke-direct {v0, p0}, Ls/J$a;-><init>(Ls/J;)V

    invoke-static {v0}, LT/o1;->e(Lmh/a;)LT/z1;

    move-result-object v0

    iput-object v0, p0, Ls/J;->B:LT/z1;

    :cond_0
    iget-object v0, p0, Ls/J;->B:LT/z1;

    if-eqz v0, :cond_1

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/g;

    invoke-virtual {v0}, Ll0/g;->v()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v0}, Ll0/g$a;->b()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method private final J2()V
    .locals 11

    iget-object v0, p0, Ls/J;->z:Ls/U;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ls/U;->dismiss()V

    :cond_0
    iget-object v0, p0, Ls/J;->x:Landroid/view/View;

    if-nez v0, :cond_1

    invoke-static {p0}, LE0/l;->a(LE0/j;)Landroid/view/View;

    move-result-object v0

    :cond_1
    move-object v2, v0

    iput-object v2, p0, Ls/J;->x:Landroid/view/View;

    iget-object v0, p0, Ls/J;->y:LY0/d;

    if-nez v0, :cond_2

    invoke-static {p0}, LE0/k;->i(LE0/j;)LY0/d;

    move-result-object v0

    :cond_2
    move-object v9, v0

    iput-object v9, p0, Ls/J;->y:LY0/d;

    iget-object v1, p0, Ls/J;->w:Ls/V;

    iget-boolean v3, p0, Ls/J;->r:Z

    iget-wide v4, p0, Ls/J;->s:J

    iget v6, p0, Ls/J;->t:F

    iget v7, p0, Ls/J;->u:F

    iget-boolean v8, p0, Ls/J;->v:Z

    iget v10, p0, Ls/J;->q:F

    invoke-interface/range {v1 .. v10}, Ls/V;->b(Landroid/view/View;ZJFFZLY0/d;F)Ls/U;

    move-result-object v0

    iput-object v0, p0, Ls/J;->z:Ls/U;

    invoke-direct {p0}, Ls/J;->N2()V

    return-void
.end method

.method private final K2(LC0/r;)V
    .locals 1

    iget-object v0, p0, Ls/J;->A:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final M2()V
    .locals 8

    iget-object v0, p0, Ls/J;->y:LY0/d;

    if-nez v0, :cond_0

    invoke-static {p0}, LE0/k;->i(LE0/j;)LY0/d;

    move-result-object v0

    iput-object v0, p0, Ls/J;->y:LY0/d;

    :cond_0
    iget-object v1, p0, Ls/J;->n:Lmh/l;

    invoke-interface {v1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll0/g;

    invoke-virtual {v1}, Ll0/g;->v()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/h;->c(J)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-direct {p0}, Ls/J;->I2()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/h;->c(J)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-direct {p0}, Ls/J;->I2()J

    move-result-wide v3

    invoke-static {v3, v4, v1, v2}, Ll0/g;->r(JJ)J

    move-result-wide v1

    iput-wide v1, p0, Ls/J;->C:J

    iget-object v1, p0, Ls/J;->o:Lmh/l;

    if-eqz v1, :cond_2

    invoke-interface {v1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/g;

    invoke-virtual {v0}, Ll0/g;->v()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->d(J)Ll0/g;

    move-result-object v0

    invoke-virtual {v0}, Ll0/g;->v()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/h;->c(J)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ll0/g;->v()J

    move-result-wide v0

    invoke-direct {p0}, Ls/J;->I2()J

    move-result-wide v2

    invoke-static {v2, v3, v0, v1}, Ll0/g;->r(JJ)J

    move-result-wide v0

    :goto_1
    move-wide v5, v0

    goto :goto_2

    :cond_2
    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v0}, Ll0/g$a;->b()J

    move-result-wide v0

    goto :goto_1

    :goto_2
    iget-object v0, p0, Ls/J;->z:Ls/U;

    if-nez v0, :cond_3

    invoke-direct {p0}, Ls/J;->J2()V

    :cond_3
    iget-object v2, p0, Ls/J;->z:Ls/U;

    if-eqz v2, :cond_4

    iget-wide v3, p0, Ls/J;->C:J

    iget v7, p0, Ls/J;->q:F

    invoke-interface/range {v2 .. v7}, Ls/U;->a(JJF)V

    :cond_4
    invoke-direct {p0}, Ls/J;->N2()V

    return-void

    :cond_5
    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v0}, Ll0/g$a;->b()J

    move-result-wide v0

    iput-wide v0, p0, Ls/J;->C:J

    iget-object v0, p0, Ls/J;->z:Ls/U;

    if-eqz v0, :cond_6

    invoke-interface {v0}, Ls/U;->dismiss()V

    :cond_6
    return-void
.end method

.method private final N2()V
    .locals 5

    iget-object v0, p0, Ls/J;->z:Ls/U;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Ls/J;->y:LY0/d;

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-interface {v0}, Ls/U;->h()J

    move-result-wide v2

    iget-object v4, p0, Ls/J;->D:LY0/r;

    invoke-static {v2, v3, v4}, LY0/r;->d(JLjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, Ls/J;->p:Lmh/l;

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ls/U;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/s;->d(J)J

    move-result-wide v3

    invoke-interface {v1, v3, v4}, LY0/d;->f0(J)J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/k;->c(J)LY0/k;

    move-result-object v1

    invoke-interface {v2, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-interface {v0}, Ls/U;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->b(J)LY0/r;

    move-result-object v0

    iput-object v0, p0, Ls/J;->D:LY0/r;

    :cond_3
    return-void
.end method

.method private final o1()LC0/r;
    .locals 1

    iget-object v0, p0, Ls/J;->A:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC0/r;

    return-object v0
.end method


# virtual methods
.method public B(LC0/r;)V
    .locals 0

    invoke-direct {p0, p1}, Ls/J;->K2(LC0/r;)V

    return-void
.end method

.method public J(Lo0/c;)V
    .locals 1

    invoke-interface {p1}, Lo0/c;->X1()V

    iget-object p1, p0, Ls/J;->E:LKi/g;

    if-eqz p1, :cond_0

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-interface {p1, v0}, LKi/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LKi/k;->b(Ljava/lang/Object;)LKi/k;

    :cond_0
    return-void
.end method

.method public final L2(Lmh/l;Lmh/l;FZJFFZLmh/l;Ls/V;)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p3

    move/from16 v2, p4

    move-wide/from16 v3, p5

    move/from16 v5, p7

    move/from16 v6, p8

    move/from16 v7, p9

    move-object/from16 v8, p11

    iget v9, v0, Ls/J;->q:F

    iget-wide v10, v0, Ls/J;->s:J

    iget v12, v0, Ls/J;->t:F

    iget-boolean v13, v0, Ls/J;->r:Z

    iget v14, v0, Ls/J;->u:F

    iget-boolean v15, v0, Ls/J;->v:Z

    move/from16 v16, v15

    iget-object v15, v0, Ls/J;->w:Ls/V;

    move-object/from16 v17, v15

    iget-object v15, v0, Ls/J;->x:Landroid/view/View;

    move-object/from16 v18, v15

    iget-object v15, v0, Ls/J;->y:LY0/d;

    move-object/from16 v19, v15

    move-object/from16 v15, p1

    iput-object v15, v0, Ls/J;->n:Lmh/l;

    move-object/from16 v15, p2

    iput-object v15, v0, Ls/J;->o:Lmh/l;

    iput v1, v0, Ls/J;->q:F

    iput-boolean v2, v0, Ls/J;->r:Z

    iput-wide v3, v0, Ls/J;->s:J

    iput v5, v0, Ls/J;->t:F

    iput v6, v0, Ls/J;->u:F

    iput-boolean v7, v0, Ls/J;->v:Z

    move-object/from16 v15, p10

    iput-object v15, v0, Ls/J;->p:Lmh/l;

    iput-object v8, v0, Ls/J;->w:Ls/V;

    invoke-static/range {p0 .. p0}, LE0/l;->a(LE0/j;)Landroid/view/View;

    move-result-object v15

    move-object/from16 p1, v15

    invoke-static/range {p0 .. p0}, LE0/k;->i(LE0/j;)LY0/d;

    move-result-object v15

    move-object/from16 p2, v15

    iget-object v15, v0, Ls/J;->z:Ls/U;

    if-eqz v15, :cond_2

    invoke-static {v1, v9}, Ls/K;->a(FF)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface/range {p11 .. p11}, Ls/V;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-static {v3, v4, v10, v11}, LY0/k;->f(JJ)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v5, v12}, LY0/h;->n(FF)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v6, v14}, LY0/h;->n(FF)Z

    move-result v1

    if-eqz v1, :cond_1

    if-ne v2, v13, :cond_1

    move/from16 v1, v16

    if-ne v7, v1, :cond_1

    move-object/from16 v1, v17

    invoke-static {v8, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object/from16 v2, p1

    move-object/from16 v1, v18

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object/from16 v2, p2

    move-object/from16 v1, v19

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    invoke-direct/range {p0 .. p0}, Ls/J;->J2()V

    :cond_2
    invoke-direct/range {p0 .. p0}, Ls/J;->M2()V

    return-void
.end method

.method public n2()V
    .locals 9

    invoke-virtual {p0}, Ls/J;->q1()V

    const/4 v0, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v1, v2, v2, v0, v2}, LKi/j;->b(ILKi/a;Lmh/l;ILjava/lang/Object;)LKi/g;

    move-result-object v0

    iput-object v0, p0, Ls/J;->E:LKi/g;

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v3

    new-instance v6, Ls/J$c;

    invoke-direct {v6, p0, v2}, Ls/J$c;-><init>(Ls/J;Ldh/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method

.method public o2()V
    .locals 1

    iget-object v0, p0, Ls/J;->z:Ls/U;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ls/U;->dismiss()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Ls/J;->z:Ls/U;

    return-void
.end method

.method public q(LJ0/w;)V
    .locals 2

    invoke-static {}, Ls/K;->b()LJ0/v;

    move-result-object v0

    new-instance v1, Ls/J$b;

    invoke-direct {v1, p0}, Ls/J$b;-><init>(Ls/J;)V

    invoke-interface {p1, v0, v1}, LJ0/w;->b(LJ0/v;Ljava/lang/Object;)V

    return-void
.end method

.method public q1()V
    .locals 1

    new-instance v0, Ls/J$d;

    invoke-direct {v0, p0}, Ls/J$d;-><init>(Ls/J;)V

    invoke-static {p0, v0}, LE0/i0;->a(Landroidx/compose/ui/e$c;Lmh/a;)V

    return-void
.end method
