.class public final LI/e1;
.super LE0/m;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/M0;
.implements LE0/v0;
.implements Lk0/k;
.implements Lk0/b;
.implements LE0/t;
.implements LE0/s0;
.implements Lw0/e;
.implements LE0/h;
.implements LD0/h;
.implements LE0/h0;
.implements LE0/A;


# instance fields
.field private final A:LG/a;

.field private B:Ly/g;

.field private final C:Li0/d;

.field private D:LF/D;

.field private E:Z

.field private F:Landroidx/compose/ui/platform/E1;

.field private G:LIi/y0;

.field private final H:LI/g1;

.field private final I:LI/e1$r;

.field private J:LIi/y0;

.field private final N:Lmh/a;

.field private p:LI/o1;

.field private q:LI/l1;

.field private r:LJ/j;

.field private s:LH/b;

.field private t:Z

.field private u:Z

.field private v:LH/d;

.field private w:Z

.field private x:Ly/m;

.field private y:LLi/y;

.field private final z:Ly0/S;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LI/o1;LI/l1;LJ/j;LH/b;ZZLF/D;LH/d;ZLy/m;)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p7

    invoke-direct {p0}, LE0/m;-><init>()V

    move-object/from16 v2, p1

    iput-object v2, v0, LI/e1;->p:LI/o1;

    move-object/from16 v2, p2

    iput-object v2, v0, LI/e1;->q:LI/l1;

    move-object/from16 v2, p3

    iput-object v2, v0, LI/e1;->r:LJ/j;

    move-object/from16 v2, p4

    iput-object v2, v0, LI/e1;->s:LH/b;

    move/from16 v2, p5

    iput-boolean v2, v0, LI/e1;->t:Z

    move/from16 v2, p6

    iput-boolean v2, v0, LI/e1;->u:Z

    move-object/from16 v2, p8

    iput-object v2, v0, LI/e1;->v:LH/d;

    move/from16 v2, p9

    iput-boolean v2, v0, LI/e1;->w:Z

    move-object/from16 v2, p10

    iput-object v2, v0, LI/e1;->x:Ly/m;

    new-instance v2, LI/e1$w;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, LI/e1$w;-><init>(LI/e1;Ldh/e;)V

    invoke-static {v2}, Ly0/P;->a(Lmh/p;)Ly0/S;

    move-result-object v2

    invoke-virtual {p0, v2}, LE0/m;->D2(LE0/j;)LE0/j;

    move-result-object v2

    check-cast v2, Ly0/S;

    iput-object v2, v0, LI/e1;->z:Ly0/S;

    new-instance v2, LG/a;

    new-instance v4, LI/e1$z;

    invoke-direct {v4, p0, v1}, LI/e1$z;-><init>(LI/e1;LF/D;)V

    invoke-direct {v2, v4}, LG/a;-><init>(Lmh/a;)V

    invoke-virtual {p0, v2}, LE0/m;->D2(LE0/j;)LE0/j;

    move-result-object v2

    check-cast v2, LG/a;

    iput-object v2, v0, LI/e1;->A:LG/a;

    new-instance v4, LI/e1$k;

    invoke-direct {v4, p0}, LI/e1$k;-><init>(LI/e1;)V

    new-instance v5, LI/e1$l;

    invoke-direct {v5, p0}, LI/e1$l;-><init>(LI/e1;)V

    new-instance v6, LI/e1$m;

    invoke-direct {v6, p0}, LI/e1$m;-><init>(LI/e1;)V

    new-instance v8, LI/e1$n;

    invoke-direct {v8, p0}, LI/e1$n;-><init>(LI/e1;)V

    new-instance v9, LI/e1$o;

    invoke-direct {v9, p0}, LI/e1$o;-><init>(LI/e1;)V

    new-instance v11, LI/e1$p;

    invoke-direct {v11, p0}, LI/e1$p;-><init>(LI/e1;)V

    new-instance v12, LI/e1$q;

    invoke-direct {v12, p0}, LI/e1$q;-><init>(LI/e1;)V

    const/16 v13, 0x48

    const/4 v14, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    invoke-static/range {v4 .. v14}, LI/f1;->b(Lmh/a;Lmh/p;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;ILjava/lang/Object;)Li0/d;

    move-result-object v2

    invoke-virtual {p0, v2}, LE0/m;->D2(LE0/j;)LE0/j;

    move-result-object v2

    check-cast v2, Li0/d;

    iput-object v2, v0, LI/e1;->C:Li0/d;

    iget-object v2, v0, LI/e1;->s:LH/b;

    if-eqz v2, :cond_0

    invoke-interface {v2}, LH/b;->b()LF/D;

    move-result-object v3

    :cond_0
    invoke-virtual {v1, v3}, LF/D;->c(LF/D;)LF/D;

    move-result-object v1

    iput-object v1, v0, LI/e1;->D:LF/D;

    invoke-static {}, LI/h1;->b()LI/g1;

    move-result-object v1

    iput-object v1, v0, LI/e1;->H:LI/g1;

    new-instance v1, LI/e1$r;

    invoke-direct {v1, p0}, LI/e1$r;-><init>(LI/e1;)V

    iput-object v1, v0, LI/e1;->I:LI/e1$r;

    new-instance v1, LI/e1$x;

    invoke-direct {v1, p0}, LI/e1$x;-><init>(LI/e1;)V

    iput-object v1, v0, LI/e1;->N:Lmh/a;

    return-void
.end method

.method public static final synthetic J2(LI/e1;)V
    .locals 0

    invoke-direct {p0}, LI/e1;->W2()V

    return-void
.end method

.method public static final synthetic K2(LI/e1;)Z
    .locals 0

    invoke-direct {p0}, LI/e1;->X2()Z

    move-result p0

    return p0
.end method

.method public static final synthetic L2(LI/e1;)LIi/y0;
    .locals 0

    iget-object p0, p0, LI/e1;->J:LIi/y0;

    return-object p0
.end method

.method public static final synthetic M2(LI/e1;)LI/e1$r;
    .locals 0

    iget-object p0, p0, LI/e1;->I:LI/e1$r;

    return-object p0
.end method

.method public static final synthetic N2(LI/e1;)LLi/y;
    .locals 0

    invoke-direct {p0}, LI/e1;->d3()LLi/y;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic O2(LI/e1;)Z
    .locals 0

    invoke-direct {p0}, LI/e1;->h3()Z

    move-result p0

    return p0
.end method

.method public static final synthetic P2(LI/e1;)V
    .locals 0

    invoke-direct {p0}, LI/e1;->i3()V

    return-void
.end method

.method public static final synthetic Q2(LI/e1;I)V
    .locals 0

    invoke-direct {p0, p1}, LI/e1;->j3(I)V

    return-void
.end method

.method public static final synthetic R2(LI/e1;)Landroidx/compose/ui/platform/n1;
    .locals 0

    invoke-direct {p0}, LI/e1;->k3()Landroidx/compose/ui/platform/n1;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic S2(LI/e1;Ly/g;)V
    .locals 0

    iput-object p1, p0, LI/e1;->B:Ly/g;

    return-void
.end method

.method public static final synthetic T2(LI/e1;Landroidx/compose/ui/platform/E1;)V
    .locals 0

    iput-object p1, p0, LI/e1;->F:Landroidx/compose/ui/platform/E1;

    return-void
.end method

.method public static final synthetic U2(LI/e1;Z)V
    .locals 0

    invoke-direct {p0, p1}, LI/e1;->l3(Z)V

    return-void
.end method

.method private final V2()V
    .locals 3

    iget-object v0, p0, LI/e1;->J:LIi/y0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LIi/y0$a;->b(LIi/y0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    iput-object v1, p0, LI/e1;->J:LIi/y0;

    invoke-direct {p0}, LI/e1;->d3()LLi/y;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, LLi/y;->h()V

    :cond_1
    return-void
.end method

.method private final W2()V
    .locals 3

    iget-object v0, p0, LI/e1;->B:Ly/g;

    if-eqz v0, :cond_0

    iget-object v1, p0, LI/e1;->x:Ly/m;

    new-instance v2, Ly/h;

    invoke-direct {v2, v0}, Ly/h;-><init>(Ly/g;)V

    invoke-interface {v1, v2}, Ly/m;->c(Ly/j;)Z

    const/4 v0, 0x0

    iput-object v0, p0, LI/e1;->B:Ly/g;

    :cond_0
    return-void
.end method

.method private final X2()Z
    .locals 1

    iget-boolean v0, p0, LI/e1;->t:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, LI/e1;->u:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final d3()LLi/y;
    .locals 5

    iget-object v0, p0, LI/e1;->y:LLi/y;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, LG/c;->a()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    sget-object v0, LKi/a;->DROP_LATEST:LKi/a;

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v3, v4, v0, v2, v1}, LLi/F;->b(IILKi/a;ILjava/lang/Object;)LLi/y;

    move-result-object v0

    iput-object v0, p0, LI/e1;->y:LLi/y;

    return-object v0
.end method

.method private final h3()Z
    .locals 4

    iget-object v0, p0, LI/e1;->F:Landroidx/compose/ui/platform/E1;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/compose/ui/platform/E1;->a()Z

    move-result v0

    if-ne v0, v2, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-boolean v3, p0, LI/e1;->E:Z

    if-eqz v3, :cond_1

    if-eqz v0, :cond_1

    move v1, v2

    :cond_1
    return v1
.end method

.method private final i3()V
    .locals 8

    iget-object v0, p0, LI/e1;->r:LJ/j;

    invoke-direct {p0}, LI/e1;->h3()Z

    move-result v1

    invoke-virtual {v0, v1}, LJ/j;->v0(Z)V

    invoke-direct {p0}, LI/e1;->h3()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, LI/e1;->G:LIi/y0;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v2

    new-instance v5, LI/e1$s;

    invoke-direct {v5, p0, v1}, LI/e1$s;-><init>(LI/e1;Ldh/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object v0

    iput-object v0, p0, LI/e1;->G:LIi/y0;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LI/e1;->h3()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LI/e1;->G:LIi/y0;

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LIi/y0$a;->b(LIi/y0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_1
    iput-object v1, p0, LI/e1;->G:LIi/y0;

    :cond_2
    :goto_0
    return-void
.end method

.method private final j3(I)V
    .locals 2

    sget-object v0, LR0/r;->b:LR0/r$a;

    invoke-virtual {v0}, LR0/r$a;->e()I

    move-result v1

    invoke-static {p1, v1}, LR0/r;->m(II)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, LR0/r$a;->a()I

    move-result v0

    invoke-static {p1, v0}, LR0/r;->m(II)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LI/e1;->v:LH/d;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    new-instance v1, LI/e1$t;

    invoke-direct {v1, p0, p1}, LI/e1$t;-><init>(LI/e1;I)V

    invoke-interface {v0, v1}, LH/d;->a(Lmh/a;)V

    :cond_1
    return-void

    :cond_2
    :goto_0
    iget-object v0, p0, LI/e1;->I:LI/e1$r;

    invoke-virtual {v0, p1}, LI/e1$r;->a(I)V

    return-void
.end method

.method private final k3()Landroidx/compose/ui/platform/n1;
    .locals 2

    invoke-static {}, Landroidx/compose/ui/platform/k0;->q()LT/H0;

    move-result-object v0

    invoke-static {p0, v0}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/n1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No software keyboard controller"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final l3(Z)V
    .locals 6

    if-nez p1, :cond_0

    iget-object p1, p0, LI/e1;->D:LF/D;

    invoke-virtual {p1}, LF/D;->j()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Lu/b;->a(LD0/h;)Lu/a;

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v0

    new-instance v3, LI/e1$y;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1, p1}, LI/e1$y;-><init>(LI/e1;Lu/a;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object p1

    iput-object p1, p0, LI/e1;->J:LIi/y0;

    return-void
.end method


# virtual methods
.method public B(LC0/r;)V
    .locals 1

    iget-object v0, p0, LI/e1;->q:LI/l1;

    invoke-virtual {v0, p1}, LI/l1;->n(LC0/r;)V

    return-void
.end method

.method public C0()V
    .locals 1

    iget-object v0, p0, LI/e1;->A:LG/a;

    invoke-virtual {v0}, LG/a;->C0()V

    iget-object v0, p0, LI/e1;->z:Ly0/S;

    invoke-interface {v0}, LE0/s0;->C0()V

    return-void
.end method

.method public J1(Lk0/l;)V
    .locals 4

    iget-boolean v0, p0, LI/e1;->E:Z

    invoke-interface {p1}, Lk0/l;->isFocused()Z

    move-result v1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Lk0/l;->isFocused()Z

    move-result v0

    iput-boolean v0, p0, LI/e1;->E:Z

    invoke-direct {p0}, LI/e1;->i3()V

    invoke-interface {p1}, Lk0/l;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, LI/e1;->X2()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LI/e1;->l3(Z)V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, LI/e1;->V2()V

    iget-object v0, p0, LI/e1;->p:LI/o1;

    invoke-static {v0}, LI/o1;->d(LI/o1;)LH/l;

    move-result-object v1

    invoke-static {v0}, LI/o1;->b(LI/o1;)LH/b;

    move-result-object v0

    sget-object v2, LK/c;->MergeIfPossible:LK/c;

    invoke-virtual {v1}, LH/l;->g()LI/I;

    move-result-object v3

    invoke-virtual {v3}, LI/I;->f()LI/m;

    move-result-object v3

    invoke-virtual {v3}, LI/m;->e()V

    invoke-virtual {v1}, LH/l;->g()LI/I;

    move-result-object v3

    invoke-static {v3}, LI/H;->e(LI/I;)V

    const/4 v3, 0x1

    invoke-static {v1, v0, v3, v2}, LH/l;->a(LH/l;LH/b;ZLK/c;)V

    iget-object v0, p0, LI/e1;->p:LI/o1;

    invoke-virtual {v0}, LI/o1;->f()V

    :cond_2
    :goto_0
    iget-object v0, p0, LI/e1;->A:LG/a;

    invoke-virtual {v0, p1}, LG/a;->J1(Lk0/l;)V

    return-void
.end method

.method public Q(Landroid/view/KeyEvent;)Z
    .locals 6

    iget-object v0, p0, LI/e1;->H:LI/g1;

    iget-object v2, p0, LI/e1;->p:LI/o1;

    iget-object v3, p0, LI/e1;->r:LJ/j;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->h()LT/H0;

    move-result-object v1

    invoke-static {p0, v1}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lk0/e;

    invoke-direct {p0}, LI/e1;->k3()Landroidx/compose/ui/platform/n1;

    move-result-object v5

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, LI/g1;->c(Landroid/view/KeyEvent;LI/o1;LJ/j;Lk0/e;Landroidx/compose/ui/platform/n1;)Z

    move-result p1

    return p1
.end method

.method public S1()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final Y2()Z
    .locals 1

    iget-boolean v0, p0, LI/e1;->t:Z

    return v0
.end method

.method public final Z2()Ly/m;
    .locals 1

    iget-object v0, p0, LI/e1;->x:Ly/m;

    return-object v0
.end method

.method public final a3()LF/D;
    .locals 1

    iget-object v0, p0, LI/e1;->D:LF/D;

    return-object v0
.end method

.method public final b3()Z
    .locals 1

    iget-boolean v0, p0, LI/e1;->u:Z

    return v0
.end method

.method public final c3()Z
    .locals 1

    iget-boolean v0, p0, LI/e1;->w:Z

    return v0
.end method

.method public final e3()LJ/j;
    .locals 1

    iget-object v0, p0, LI/e1;->r:LJ/j;

    return-object v0
.end method

.method public final f3()LI/o1;
    .locals 1

    iget-object v0, p0, LI/e1;->p:LI/o1;

    return-object v0
.end method

.method public final g3()LI/l1;
    .locals 1

    iget-object v0, p0, LI/e1;->q:LI/l1;

    return-object v0
.end method

.method public final m3(LI/o1;LI/l1;LJ/j;LH/b;ZZLF/D;LH/d;ZLy/m;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move/from16 v4, p5

    move/from16 v5, p6

    move-object/from16 v6, p10

    iget-boolean v7, v0, LI/e1;->t:Z

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v7, :cond_0

    iget-boolean v10, v0, LI/e1;->u:Z

    if-nez v10, :cond_0

    move v10, v8

    goto :goto_0

    :cond_0
    move v10, v9

    :goto_0
    if-eqz v4, :cond_1

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    move v8, v9

    :goto_1
    iget-object v11, v0, LI/e1;->p:LI/o1;

    iget-object v12, v0, LI/e1;->D:LF/D;

    iget-object v13, v0, LI/e1;->r:LJ/j;

    iget-object v14, v0, LI/e1;->x:Ly/m;

    iput-object v1, v0, LI/e1;->p:LI/o1;

    move-object/from16 v15, p2

    iput-object v15, v0, LI/e1;->q:LI/l1;

    iput-object v2, v0, LI/e1;->r:LJ/j;

    iput-object v3, v0, LI/e1;->s:LH/b;

    iput-boolean v4, v0, LI/e1;->t:Z

    iput-boolean v5, v0, LI/e1;->u:Z

    if-eqz v3, :cond_2

    invoke-interface/range {p4 .. p4}, LH/b;->b()LF/D;

    move-result-object v3

    :goto_2
    move-object/from16 v5, p7

    goto :goto_3

    :cond_2
    const/4 v3, 0x0

    goto :goto_2

    :goto_3
    invoke-virtual {v5, v3}, LF/D;->c(LF/D;)LF/D;

    move-result-object v3

    iput-object v3, v0, LI/e1;->D:LF/D;

    move-object/from16 v3, p8

    iput-object v3, v0, LI/e1;->v:LH/d;

    move/from16 v3, p9

    iput-boolean v3, v0, LI/e1;->w:Z

    iput-object v6, v0, LI/e1;->x:Ly/m;

    if-ne v8, v10, :cond_3

    invoke-static {v1, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v0, LI/e1;->D:LF/D;

    invoke-static {v1, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :cond_3
    if-eqz v8, :cond_4

    invoke-direct/range {p0 .. p0}, LI/e1;->h3()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-direct {v0, v9}, LI/e1;->l3(Z)V

    goto :goto_4

    :cond_4
    if-nez v8, :cond_5

    invoke-direct/range {p0 .. p0}, LI/e1;->V2()V

    :cond_5
    :goto_4
    if-eq v7, v4, :cond_6

    invoke-static/range {p0 .. p0}, LE0/w0;->b(LE0/v0;)V

    :cond_6
    invoke-static {v2, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, v0, LI/e1;->z:Ly0/S;

    invoke-interface {v1}, Ly0/S;->Z1()V

    iget-object v1, v0, LI/e1;->A:LG/a;

    invoke-virtual {v1}, LG/a;->Z1()V

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, v0, LI/e1;->N:Lmh/a;

    invoke-virtual {v2, v1}, LJ/j;->y0(Lmh/a;)V

    :cond_7
    invoke-static {v6, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    iget-object v1, v0, LI/e1;->z:Ly0/S;

    invoke-interface {v1}, Ly0/S;->Z1()V

    iget-object v1, v0, LI/e1;->A:LG/a;

    invoke-virtual {v1}, LG/a;->Z1()V

    :cond_8
    return-void
.end method

.method public n2()V
    .locals 2

    invoke-virtual {p0}, LI/e1;->q1()V

    iget-object v0, p0, LI/e1;->r:LJ/j;

    iget-object v1, p0, LI/e1;->N:Lmh/a;

    invoke-virtual {v0, v1}, LJ/j;->y0(Lmh/a;)V

    return-void
.end method

.method public o2()V
    .locals 2

    invoke-direct {p0}, LI/e1;->V2()V

    iget-object v0, p0, LI/e1;->r:LJ/j;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LJ/j;->y0(Lmh/a;)V

    return-void
.end method

.method public q(LJ0/w;)V
    .locals 11

    iget-object v0, p0, LI/e1;->p:LI/o1;

    invoke-virtual {v0}, LI/o1;->i()LH/h;

    move-result-object v0

    invoke-virtual {v0}, LH/h;->f()J

    move-result-wide v1

    new-instance v9, LL0/d;

    invoke-virtual {v0}, LH/h;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1, v9}, LJ0/t;->c0(LJ0/w;LL0/d;)V

    invoke-static {p1, v1, v2}, LJ0/t;->r0(LJ0/w;J)V

    iget-boolean v0, p0, LI/e1;->t:Z

    if-nez v0, :cond_0

    invoke-static {p1}, LJ0/t;->l(LJ0/w;)V

    :cond_0
    invoke-direct {p0}, LI/e1;->X2()Z

    move-result v0

    invoke-static {p1, v0}, LJ0/t;->b0(LJ0/w;Z)V

    new-instance v0, LI/e1$b;

    invoke-direct {v0, p0}, LI/e1$b;-><init>(LI/e1;)V

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {p1, v3, v0, v4, v3}, LJ0/t;->u(LJ0/w;Ljava/lang/String;Lmh/l;ILjava/lang/Object;)V

    invoke-direct {p0}, LI/e1;->X2()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, LI/e1$c;

    invoke-direct {v0, p0}, LI/e1$c;-><init>(LI/e1;)V

    invoke-static {p1, v3, v0, v4, v3}, LJ0/t;->q0(LJ0/w;Ljava/lang/String;Lmh/l;ILjava/lang/Object;)V

    new-instance v0, LI/e1$d;

    invoke-direct {v0, p0}, LI/e1$d;-><init>(LI/e1;)V

    invoke-static {p1, v3, v0, v4, v3}, LJ0/t;->x(LJ0/w;Ljava/lang/String;Lmh/l;ILjava/lang/Object;)V

    :cond_1
    new-instance v0, LI/e1$e;

    invoke-direct {v0, p0}, LI/e1$e;-><init>(LI/e1;)V

    invoke-static {p1, v3, v0, v4, v3}, LJ0/t;->l0(LJ0/w;Ljava/lang/String;Lmh/q;ILjava/lang/Object;)V

    iget-object v0, p0, LI/e1;->D:LF/D;

    invoke-virtual {v0}, LF/D;->g()I

    move-result v6

    new-instance v8, LI/e1$f;

    invoke-direct {v8, p0, v6}, LI/e1$f;-><init>(LI/e1;I)V

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v7, 0x0

    move-object v5, p1

    invoke-static/range {v5 .. v10}, LJ0/t;->C(LJ0/w;ILjava/lang/String;Lmh/a;ILjava/lang/Object;)V

    new-instance v0, LI/e1$g;

    invoke-direct {v0, p0}, LI/e1$g;-><init>(LI/e1;)V

    invoke-static {p1, v3, v0, v4, v3}, LJ0/t;->A(LJ0/w;Ljava/lang/String;Lmh/a;ILjava/lang/Object;)V

    new-instance v0, LI/e1$h;

    invoke-direct {v0, p0}, LI/e1$h;-><init>(LI/e1;)V

    invoke-static {p1, v3, v0, v4, v3}, LJ0/t;->E(LJ0/w;Ljava/lang/String;Lmh/a;ILjava/lang/Object;)V

    invoke-static {v1, v2}, LL0/S;->h(J)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, LI/e1$i;

    invoke-direct {v0, p0}, LI/e1$i;-><init>(LI/e1;)V

    invoke-static {p1, v3, v0, v4, v3}, LJ0/t;->h(LJ0/w;Ljava/lang/String;Lmh/a;ILjava/lang/Object;)V

    iget-boolean v0, p0, LI/e1;->t:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, LI/e1;->u:Z

    if-nez v0, :cond_2

    new-instance v0, LI/e1$j;

    invoke-direct {v0, p0}, LI/e1$j;-><init>(LI/e1;)V

    invoke-static {p1, v3, v0, v4, v3}, LJ0/t;->j(LJ0/w;Ljava/lang/String;Lmh/a;ILjava/lang/Object;)V

    :cond_2
    invoke-direct {p0}, LI/e1;->X2()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, LI/e1$a;

    invoke-direct {v0, p0}, LI/e1$a;-><init>(LI/e1;)V

    invoke-static {p1, v3, v0, v4, v3}, LJ0/t;->P(LJ0/w;Ljava/lang/String;Lmh/a;ILjava/lang/Object;)V

    :cond_3
    iget-object v0, p0, LI/e1;->s:LH/b;

    if-eqz v0, :cond_4

    invoke-interface {v0, p1}, LH/b;->q(LJ0/w;)V

    :cond_4
    return-void
.end method

.method public q1()V
    .locals 1

    new-instance v0, LI/e1$v;

    invoke-direct {v0, p0}, LI/e1$v;-><init>(LI/e1;)V

    invoke-static {p0, v0}, LE0/i0;->a(Landroidx/compose/ui/e$c;Lmh/a;)V

    return-void
.end method

.method public r0(Landroid/view/KeyEvent;)Z
    .locals 8

    iget-object v0, p0, LI/e1;->H:LI/g1;

    iget-object v2, p0, LI/e1;->p:LI/o1;

    iget-object v3, p0, LI/e1;->q:LI/l1;

    iget-object v4, p0, LI/e1;->r:LJ/j;

    iget-boolean v1, p0, LI/e1;->t:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, LI/e1;->u:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    :goto_0
    move v5, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    iget-boolean v6, p0, LI/e1;->w:Z

    new-instance v7, LI/e1$u;

    invoke-direct {v7, p0}, LI/e1$u;-><init>(LI/e1;)V

    move-object v1, p1

    invoke-virtual/range {v0 .. v7}, LI/g1;->b(Landroid/view/KeyEvent;LI/o1;LI/l1;LJ/j;ZZLmh/a;)Z

    move-result p1

    return p1
.end method

.method public s0(Ly0/n;Ly0/p;J)V
    .locals 1

    iget-object v0, p0, LI/e1;->A:LG/a;

    invoke-virtual {v0, p1, p2, p3, p4}, LG/a;->s0(Ly0/n;Ly0/p;J)V

    iget-object v0, p0, LI/e1;->z:Ly0/S;

    invoke-interface {v0, p1, p2, p3, p4}, LE0/s0;->s0(Ly0/n;Ly0/p;J)V

    return-void
.end method
