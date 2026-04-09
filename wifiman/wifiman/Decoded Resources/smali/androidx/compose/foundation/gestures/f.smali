.class final Landroidx/compose/foundation/gestures/f;
.super Landroidx/compose/foundation/gestures/b;
.source "SourceFile"

# interfaces
.implements LE0/h0;
.implements LE0/h;
.implements Lk0/h;
.implements Lw0/e;
.implements LE0/v0;


# instance fields
.field private final A:Z

.field private final B:Lx0/b;

.field private final C:Lw/w;

.field private final D:Lw/h;

.field private final E:Lw/A;

.field private final F:Landroidx/compose/foundation/gestures/e;

.field private final G:Lw/f;

.field private H:Lw/t;

.field private I:Lmh/p;

.field private J:Lmh/p;

.field private y:Ls/S;

.field private z:Lw/n;


# direct methods
.method public constructor <init>(Lw/y;Ls/S;Lw/n;Lw/q;ZZLy/m;Lw/d;)V
    .locals 12

    move-object v0, p0

    move-object/from16 v8, p4

    move/from16 v9, p5

    invoke-static {}, Landroidx/compose/foundation/gestures/d;->a()Lmh/l;

    move-result-object v1

    move-object/from16 v2, p7

    invoke-direct {p0, v1, v9, v2, v8}, Landroidx/compose/foundation/gestures/b;-><init>(Lmh/l;ZLy/m;Lw/q;)V

    move-object v1, p2

    iput-object v1, v0, Landroidx/compose/foundation/gestures/f;->y:Ls/S;

    move-object v1, p3

    iput-object v1, v0, Landroidx/compose/foundation/gestures/f;->z:Lw/n;

    new-instance v10, Lx0/b;

    invoke-direct {v10}, Lx0/b;-><init>()V

    iput-object v10, v0, Landroidx/compose/foundation/gestures/f;->B:Lx0/b;

    new-instance v1, Lw/w;

    invoke-direct {v1, v9}, Lw/w;-><init>(Z)V

    invoke-virtual {p0, v1}, LE0/m;->D2(LE0/j;)LE0/j;

    move-result-object v1

    check-cast v1, Lw/w;

    iput-object v1, v0, Landroidx/compose/foundation/gestures/f;->C:Lw/w;

    new-instance v1, Lw/h;

    invoke-static {}, Landroidx/compose/foundation/gestures/d;->c()Landroidx/compose/foundation/gestures/d$d;

    move-result-object v2

    invoke-static {v2}, Lq/x;->c(LY0/d;)Lr/z;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v1, v2, v3, v4, v3}, Lw/h;-><init>(Lr/z;Lf0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v0, Landroidx/compose/foundation/gestures/f;->D:Lw/h;

    iget-object v3, v0, Landroidx/compose/foundation/gestures/f;->y:Ls/S;

    iget-object v2, v0, Landroidx/compose/foundation/gestures/f;->z:Lw/n;

    if-nez v2, :cond_0

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    new-instance v11, Lw/A;

    move-object v1, v11

    move-object v2, p1

    move-object/from16 v5, p4

    move/from16 v6, p6

    move-object v7, v10

    invoke-direct/range {v1 .. v7}, Lw/A;-><init>(Lw/y;Ls/S;Lw/n;Lw/q;ZLx0/b;)V

    iput-object v11, v0, Landroidx/compose/foundation/gestures/f;->E:Lw/A;

    new-instance v1, Landroidx/compose/foundation/gestures/e;

    invoke-direct {v1, v11, v9}, Landroidx/compose/foundation/gestures/e;-><init>(Lw/A;Z)V

    iput-object v1, v0, Landroidx/compose/foundation/gestures/f;->F:Landroidx/compose/foundation/gestures/e;

    new-instance v2, Lw/f;

    move/from16 v3, p6

    move-object/from16 v4, p8

    invoke-direct {v2, v8, v11, v3, v4}, Lw/f;-><init>(Lw/q;Lw/A;ZLw/d;)V

    invoke-virtual {p0, v2}, LE0/m;->D2(LE0/j;)LE0/j;

    move-result-object v2

    check-cast v2, Lw/f;

    iput-object v2, v0, Landroidx/compose/foundation/gestures/f;->G:Lw/f;

    invoke-static {v1, v10}, Lx0/d;->a(Lx0/a;Lx0/b;)LE0/j;

    move-result-object v1

    invoke-virtual {p0, v1}, LE0/m;->D2(LE0/j;)LE0/j;

    invoke-static {}, Lk0/o;->a()Lk0/n;

    move-result-object v1

    invoke-virtual {p0, v1}, LE0/m;->D2(LE0/j;)LE0/j;

    new-instance v1, Landroidx/compose/foundation/relocation/f;

    invoke-direct {v1, v2}, Landroidx/compose/foundation/relocation/f;-><init>(LD/c;)V

    invoke-virtual {p0, v1}, LE0/m;->D2(LE0/j;)LE0/j;

    new-instance v1, Ls/D;

    new-instance v2, Landroidx/compose/foundation/gestures/f$a;

    invoke-direct {v2, p0}, Landroidx/compose/foundation/gestures/f$a;-><init>(Landroidx/compose/foundation/gestures/f;)V

    invoke-direct {v1, v2}, Ls/D;-><init>(Lmh/l;)V

    invoke-virtual {p0, v1}, LE0/m;->D2(LE0/j;)LE0/j;

    return-void
.end method

.method public static final synthetic e3(Landroidx/compose/foundation/gestures/f;)Lw/f;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/gestures/f;->G:Lw/f;

    return-object p0
.end method

.method public static final synthetic f3(Landroidx/compose/foundation/gestures/f;)Lw/h;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/gestures/f;->D:Lw/h;

    return-object p0
.end method

.method public static final synthetic g3(Landroidx/compose/foundation/gestures/f;)Lw/A;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/gestures/f;->E:Lw/A;

    return-object p0
.end method

.method private final h3()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/foundation/gestures/f;->I:Lmh/p;

    iput-object v0, p0, Landroidx/compose/foundation/gestures/f;->J:Lmh/p;

    return-void
.end method

.method private final i3(Ly0/n;J)V
    .locals 9

    invoke-virtual {p1}, Ly0/n;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly0/y;

    invoke-virtual {v4}, Ly0/y;->p()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->H:Lw/t;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p0}, LE0/k;->i(LE0/j;)LY0/d;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2, p3}, Lw/t;->a(LY0/d;Ly0/n;J)J

    move-result-wide p2

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v3

    new-instance v6, Landroidx/compose/foundation/gestures/f$e;

    const/4 v0, 0x0

    invoke-direct {v6, p0, p2, p3, v0}, Landroidx/compose/foundation/gestures/f$e;-><init>(Landroidx/compose/foundation/gestures/f;JLdh/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    invoke-virtual {p1}, Ly0/n;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    :goto_1
    if-ge v2, p2, :cond_2

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ly0/y;

    invoke-virtual {p3}, Ly0/y;->a()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method

.method private final j3()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/gestures/f$f;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/gestures/f$f;-><init>(Landroidx/compose/foundation/gestures/f;)V

    iput-object v0, p0, Landroidx/compose/foundation/gestures/f;->I:Lmh/p;

    new-instance v0, Landroidx/compose/foundation/gestures/f$g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/compose/foundation/gestures/f$g;-><init>(Landroidx/compose/foundation/gestures/f;Ldh/e;)V

    iput-object v0, p0, Landroidx/compose/foundation/gestures/f;->J:Lmh/p;

    return-void
.end method

.method private final l3()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/gestures/f$h;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/gestures/f$h;-><init>(Landroidx/compose/foundation/gestures/f;)V

    invoke-static {p0, v0}, LE0/i0;->a(Landroidx/compose/ui/e$c;Lmh/a;)V

    return-void
.end method


# virtual methods
.method public Q(Landroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public S2(Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->E:Lw/A;

    sget-object v1, Ls/L;->UserInput:Ls/L;

    new-instance v2, Landroidx/compose/foundation/gestures/f$b;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v0, v3}, Landroidx/compose/foundation/gestures/f$b;-><init>(Lmh/p;Lw/A;Ldh/e;)V

    invoke-virtual {v0, v1, v2, p2}, Lw/A;->v(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public W2(J)V
    .locals 0

    return-void
.end method

.method public X2(J)V
    .locals 7

    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->B:Lx0/b;

    invoke-virtual {v0}, Lx0/b;->e()LIi/N;

    move-result-object v1

    new-instance v4, Landroidx/compose/foundation/gestures/f$c;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, p2, v0}, Landroidx/compose/foundation/gestures/f$c;-><init>(Landroidx/compose/foundation/gestures/f;JLdh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method

.method public b3()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->E:Lw/A;

    invoke-virtual {v0}, Lw/A;->w()Z

    move-result v0

    return v0
.end method

.method public i2()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/gestures/f;->A:Z

    return v0
.end method

.method public final k3(Lw/y;Lw/q;Ls/S;ZZLw/n;Ly/m;Lw/d;)V
    .locals 15

    move-object v6, p0

    move/from16 v2, p4

    move-object/from16 v0, p6

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/b;->U2()Z

    move-result v1

    if-eq v1, v2, :cond_0

    iget-object v1, v6, Landroidx/compose/foundation/gestures/f;->F:Landroidx/compose/foundation/gestures/e;

    invoke-virtual {v1, v2}, Landroidx/compose/foundation/gestures/e;->a(Z)V

    iget-object v1, v6, Landroidx/compose/foundation/gestures/f;->C:Lw/w;

    invoke-virtual {v1, v2}, Lw/w;->E2(Z)V

    const/4 v1, 0x1

    :goto_0
    move v7, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    if-nez v0, :cond_1

    iget-object v1, v6, Landroidx/compose/foundation/gestures/f;->D:Lw/h;

    move-object v13, v1

    goto :goto_2

    :cond_1
    move-object v13, v0

    :goto_2
    iget-object v8, v6, Landroidx/compose/foundation/gestures/f;->E:Lw/A;

    iget-object v14, v6, Landroidx/compose/foundation/gestures/f;->B:Lx0/b;

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move/from16 v12, p5

    invoke-virtual/range {v8 .. v14}, Lw/A;->C(Lw/y;Lw/q;Ls/S;ZLw/n;Lx0/b;)Z

    move-result v5

    iget-object v1, v6, Landroidx/compose/foundation/gestures/f;->G:Lw/f;

    move-object/from16 v3, p2

    move/from16 v4, p5

    move-object/from16 v8, p8

    invoke-virtual {v1, v3, v4, v8}, Lw/f;->a3(Lw/q;ZLw/d;)V

    move-object/from16 v1, p3

    iput-object v1, v6, Landroidx/compose/foundation/gestures/f;->y:Ls/S;

    iput-object v0, v6, Landroidx/compose/foundation/gestures/f;->z:Lw/n;

    invoke-static {}, Landroidx/compose/foundation/gestures/d;->a()Lmh/l;

    move-result-object v1

    iget-object v0, v6, Landroidx/compose/foundation/gestures/f;->E:Lw/A;

    invoke-virtual {v0}, Lw/A;->p()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lw/q;->Vertical:Lw/q;

    :goto_3
    move-object v4, v0

    goto :goto_4

    :cond_2
    sget-object v0, Lw/q;->Horizontal:Lw/q;

    goto :goto_3

    :goto_4
    move-object v0, p0

    move/from16 v2, p4

    move-object/from16 v3, p7

    invoke-virtual/range {v0 .. v5}, Landroidx/compose/foundation/gestures/b;->d3(Lmh/l;ZLy/m;Lw/q;Z)V

    if-eqz v7, :cond_3

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/f;->h3()V

    invoke-static {p0}, LE0/w0;->b(LE0/v0;)V

    :cond_3
    return-void
.end method

.method public n2()V
    .locals 1

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/f;->l3()V

    invoke-static {p0}, Lw/b;->a(LE0/h;)Lw/t;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/gestures/f;->H:Lw/t;

    return-void
.end method

.method public o0(Landroidx/compose/ui/focus/k;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroidx/compose/ui/focus/k;->w(Z)V

    return-void
.end method

.method public q(LJ0/w;)V
    .locals 3

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/b;->U2()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->I:Lmh/p;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->J:Lmh/p;

    if-nez v0, :cond_1

    :cond_0
    invoke-direct {p0}, Landroidx/compose/foundation/gestures/f;->j3()V

    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->I:Lmh/p;

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v2}, LJ0/t;->U(LJ0/w;Ljava/lang/String;Lmh/p;ILjava/lang/Object;)V

    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->J:Lmh/p;

    if-eqz v0, :cond_3

    invoke-static {p1, v0}, LJ0/t;->V(LJ0/w;Lmh/p;)V

    :cond_3
    return-void
.end method

.method public q1()V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/f;->l3()V

    return-void
.end method

.method public r0(Landroid/view/KeyEvent;)Z
    .locals 8

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/b;->U2()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p1}, Lw0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v0

    sget-object v2, Lw0/a;->b:Lw0/a$a;

    invoke-virtual {v2}, Lw0/a$a;->j()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Lw0/a;->p(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lw0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v0

    invoke-virtual {v2}, Lw0/a$a;->k()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Lw0/a;->p(JJ)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_0
    invoke-static {p1}, Lw0/d;->b(Landroid/view/KeyEvent;)I

    move-result v0

    sget-object v1, Lw0/c;->a:Lw0/c$a;

    invoke-virtual {v1}, Lw0/c$a;->a()I

    move-result v1

    invoke-static {v0, v1}, Lw0/c;->e(II)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p1}, Lw0/d;->e(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->E:Lw/A;

    invoke-virtual {v0}, Lw/A;->p()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->G:Lw/f;

    invoke-virtual {v0}, Lw/f;->T2()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/r;->f(J)I

    move-result v0

    invoke-static {p1}, Lw0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v3

    invoke-virtual {v2}, Lw0/a$a;->k()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Lw0/a;->p(JJ)Z

    move-result p1

    if-eqz p1, :cond_1

    int-to-float p1, v0

    goto :goto_0

    :cond_1
    int-to-float p1, v0

    neg-float p1, p1

    :goto_0
    invoke-static {v1, p1}, Ll0/h;->a(FF)J

    move-result-wide v0

    goto :goto_2

    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/gestures/f;->G:Lw/f;

    invoke-virtual {v0}, Lw/f;->T2()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/r;->g(J)I

    move-result v0

    invoke-static {p1}, Lw0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v3

    invoke-virtual {v2}, Lw0/a$a;->k()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Lw0/a;->p(JJ)Z

    move-result p1

    if-eqz p1, :cond_3

    int-to-float p1, v0

    goto :goto_1

    :cond_3
    int-to-float p1, v0

    neg-float p1, p1

    :goto_1
    invoke-static {p1, v1}, Ll0/h;->a(FF)J

    move-result-wide v0

    :goto_2
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v2

    new-instance v5, Landroidx/compose/foundation/gestures/f$d;

    const/4 p1, 0x0

    invoke-direct {v5, p0, v0, v1, p1}, Landroidx/compose/foundation/gestures/f$d;-><init>(Landroidx/compose/foundation/gestures/f;JLdh/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    const/4 p1, 0x1

    goto :goto_3

    :cond_4
    const/4 p1, 0x0

    :goto_3
    return p1
.end method

.method public s0(Ly0/n;Ly0/p;J)V
    .locals 5

    invoke-virtual {p1}, Ly0/n;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly0/y;

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/b;->T2()Lmh/l;

    move-result-object v4

    invoke-interface {v4, v3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-super {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/gestures/b;->s0(Ly0/n;Ly0/p;J)V

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    sget-object v0, Ly0/p;->Main:Ly0/p;

    if-ne p2, v0, :cond_2

    invoke-virtual {p1}, Ly0/n;->f()I

    move-result p2

    sget-object v0, Ly0/q;->a:Ly0/q$a;

    invoke-virtual {v0}, Ly0/q$a;->f()I

    move-result v0

    invoke-static {p2, v0}, Ly0/q;->i(II)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-direct {p0, p1, p3, p4}, Landroidx/compose/foundation/gestures/f;->i3(Ly0/n;J)V

    :cond_2
    return-void
.end method
