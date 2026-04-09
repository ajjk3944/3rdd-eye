.class public abstract Lxe/B;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/B$e;
    }
.end annotation


# static fields
.field private static final a:LT/H0;

.field private static final b:LT/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxe/x;

    invoke-direct {v0}, Lxe/x;-><init>()V

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, Lxe/B;->a:LT/H0;

    new-instance v0, Lxe/y;

    invoke-direct {v0}, Lxe/y;-><init>()V

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, Lxe/B;->b:LT/H0;

    return-void
.end method

.method private static final A(LT/z1;)Z
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final B()LN/n0;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No Modal Sheet state set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final C()Lxe/f$b;
    .locals 7

    new-instance v6, Lxe/f$c;

    new-instance v3, Lxe/n;

    invoke-direct {v3}, Lxe/n;-><init>()V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-wide/16 v1, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lxe/f$c;-><init>(JLmh/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method private static final D()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static final synthetic E(Lf2/u;Lxe/r0;Lmh/q;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lxe/B;->F(Lf2/u;Lxe/r0;Lmh/q;)V

    return-void
.end method

.method private static final F(Lf2/u;Lxe/r0;Lmh/q;)V
    .locals 21

    sget-object v0, Lxe/a;->a:Lxe/a;

    invoke-virtual {v0}, Lxe/a;->w()Lmh/r;

    move-result-object v10

    const/16 v11, 0xfe

    const/4 v12, 0x0

    const-string v2, "empty"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v12}, Lg2/k;->b(Lf2/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/r;ILjava/lang/Object;)V

    sget-object v16, Lxe/I$c;->a:Lxe/I$c;

    invoke-virtual {v0}, Lxe/a;->H()Lmh/q;

    move-result-object v18

    const/16 v19, 0x10

    const/16 v20, 0x0

    const/16 v17, 0x0

    move-object/from16 v13, p1

    move-object/from16 v14, p0

    move-object/from16 v15, p2

    invoke-static/range {v13 .. v20}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v4, Lxe/I$p;->a:Lxe/I$p;

    sget-object v5, LAe/n;->FADE_IN:LAe/n;

    invoke-virtual {v0}, Lxe/a;->S()Lmh/q;

    move-result-object v6

    move-object/from16 v1, p1

    move-object/from16 v2, p0

    move-object/from16 v3, p2

    invoke-static/range {v1 .. v6}, Lxe/B;->H(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;)V

    sget-object v10, Lxe/I$t;->a:Lxe/I$t;

    sget-object v11, LAe/n;->SLIDE_FROM_BOTTOM:LAe/n;

    invoke-virtual {v0}, Lxe/a;->T()Lmh/q;

    move-result-object v12

    move-object/from16 v7, p1

    move-object/from16 v8, p0

    move-object/from16 v9, p2

    invoke-static/range {v7 .. v12}, Lxe/B;->H(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;)V

    sget-object v4, Lxe/I$b;->a:Lxe/I$b;

    invoke-virtual {v0}, Lxe/a;->U()Lmh/q;

    move-result-object v6

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v12, Lxe/I$L;->a:Lxe/I$L;

    invoke-virtual {v0}, Lxe/a;->V()Lmh/q;

    move-result-object v14

    const/16 v15, 0x10

    const/16 v16, 0x0

    const/4 v13, 0x0

    move-object/from16 v9, p1

    move-object/from16 v10, p0

    move-object/from16 v11, p2

    invoke-static/range {v9 .. v16}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v4, Lxe/I$g;->a:Lxe/I$g;

    invoke-virtual {v0}, Lxe/a;->W()Lmh/q;

    move-result-object v6

    invoke-static/range {v1 .. v8}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v12, Lxe/I$I;->a:Lxe/I$I;

    invoke-virtual {v0}, Lxe/a;->b()Lmh/q;

    move-result-object v14

    invoke-static/range {v9 .. v16}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v4, Lxe/I$J;->a:Lxe/I$J;

    invoke-virtual {v0}, Lxe/a;->c()Lmh/q;

    move-result-object v6

    invoke-static/range {v1 .. v8}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v12, Lxe/I$d;->a:Lxe/I$d;

    invoke-virtual {v0}, Lxe/a;->d()Lmh/q;

    move-result-object v14

    invoke-static/range {v9 .. v16}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v4, Lxe/I$a;->a:Lxe/I$a;

    invoke-virtual {v0}, Lxe/a;->e()Lmh/q;

    move-result-object v6

    invoke-static/range {v1 .. v8}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v12, Lxe/I$s;->a:Lxe/I$s;

    invoke-virtual {v0}, Lxe/a;->f()Lmh/q;

    move-result-object v14

    invoke-static/range {v9 .. v16}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v4, Lxe/I$r;->a:Lxe/I$r;

    invoke-virtual {v0}, Lxe/a;->g()Lmh/q;

    move-result-object v6

    invoke-static/range {v1 .. v8}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v12, Lxe/I$q;->a:Lxe/I$q;

    invoke-virtual {v0}, Lxe/a;->h()Lmh/q;

    move-result-object v14

    invoke-static/range {v9 .. v16}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v4, Lxe/I$e;->a:Lxe/I$e;

    invoke-virtual {v0}, Lxe/a;->i()Lmh/q;

    move-result-object v6

    invoke-static/range {v1 .. v8}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v12, Lxe/I$f;->a:Lxe/I$f;

    invoke-virtual {v0}, Lxe/a;->j()Lmh/q;

    move-result-object v14

    invoke-static/range {v9 .. v16}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v4, Lxe/N;->a:Lxe/N;

    invoke-virtual {v0}, Lxe/a;->k()Lmh/q;

    move-result-object v6

    invoke-static/range {v1 .. v8}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v12, Lxe/M;->a:Lxe/M;

    invoke-virtual {v0}, Lxe/a;->m()Lmh/q;

    move-result-object v14

    invoke-static/range {v9 .. v16}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v4, Lxe/I$R;->a:Lxe/I$R;

    invoke-virtual {v0}, Lxe/a;->n()Lmh/q;

    move-result-object v6

    invoke-static/range {v1 .. v8}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v12, Lxe/I$Q;->a:Lxe/I$Q;

    invoke-virtual {v0}, Lxe/a;->o()Lmh/q;

    move-result-object v14

    invoke-static/range {v9 .. v16}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v4, Lxe/I$O;->a:Lxe/I$O;

    invoke-virtual {v0}, Lxe/a;->p()Lmh/q;

    move-result-object v6

    invoke-static/range {v1 .. v8}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v12, Lxe/I$P;->a:Lxe/I$P;

    invoke-virtual {v0}, Lxe/a;->q()Lmh/q;

    move-result-object v14

    invoke-static/range {v9 .. v16}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v4, Lxe/I$M;->a:Lxe/I$M;

    invoke-virtual {v0}, Lxe/a;->r()Lmh/q;

    move-result-object v6

    invoke-static/range {v1 .. v8}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v12, Lxe/I$N;->a:Lxe/I$N;

    invoke-virtual {v0}, Lxe/a;->s()Lmh/q;

    move-result-object v14

    invoke-static/range {v9 .. v16}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v4, Lxe/I$K;->a:Lxe/I$K;

    invoke-virtual {v0}, Lxe/a;->t()Lmh/q;

    move-result-object v6

    invoke-static/range {v1 .. v8}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v12, Lxe/I$G;->a:Lxe/I$G;

    invoke-virtual {v0}, Lxe/a;->u()Lmh/q;

    move-result-object v14

    invoke-static/range {v9 .. v16}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v4, Lxe/I$H;->a:Lxe/I$H;

    invoke-virtual {v0}, Lxe/a;->v()Lmh/q;

    move-result-object v6

    invoke-static/range {v1 .. v8}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v12, Lxe/I$E;->a:Lxe/I$E;

    invoke-virtual {v0}, Lxe/a;->x()Lmh/q;

    move-result-object v14

    invoke-static/range {v9 .. v16}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v4, Lxe/I$F;->a:Lxe/I$F;

    invoke-virtual {v0}, Lxe/a;->y()Lmh/q;

    move-result-object v6

    invoke-static/range {v1 .. v8}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v12, Lxe/I$y;->a:Lxe/I$y;

    invoke-virtual {v0}, Lxe/a;->z()Lmh/q;

    move-result-object v14

    invoke-static/range {v9 .. v16}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v4, Lxe/I$C;->a:Lxe/I$C;

    invoke-virtual {v0}, Lxe/a;->A()Lmh/q;

    move-result-object v6

    invoke-static/range {v1 .. v8}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v12, Lxe/I$B;->a:Lxe/I$B;

    invoke-virtual {v0}, Lxe/a;->B()Lmh/q;

    move-result-object v14

    invoke-static/range {v9 .. v16}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v4, Lxe/I$z;->a:Lxe/I$z;

    invoke-virtual {v0}, Lxe/a;->C()Lmh/q;

    move-result-object v6

    invoke-static/range {v1 .. v8}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v12, Lxe/I$A;->a:Lxe/I$A;

    invoke-virtual {v0}, Lxe/a;->D()Lmh/q;

    move-result-object v14

    invoke-static/range {v9 .. v16}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v4, Lxe/I$D;->a:Lxe/I$D;

    invoke-virtual {v0}, Lxe/a;->E()Lmh/q;

    move-result-object v6

    invoke-static/range {v1 .. v8}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v12, Lxe/I$l;->a:Lxe/I$l;

    invoke-virtual {v0}, Lxe/a;->F()Lmh/q;

    move-result-object v14

    invoke-static/range {v9 .. v16}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v4, Lxe/I$m;->a:Lxe/I$m;

    invoke-virtual {v0}, Lxe/a;->G()Lmh/q;

    move-result-object v6

    invoke-static/range {v1 .. v8}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v12, Lxe/I$n;->a:Lxe/I$n;

    invoke-virtual {v0}, Lxe/a;->I()Lmh/q;

    move-result-object v14

    invoke-static/range {v9 .. v16}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v4, Lxe/I$x;->a:Lxe/I$x;

    invoke-virtual {v0}, Lxe/a;->J()Lmh/q;

    move-result-object v6

    invoke-static/range {v1 .. v8}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v12, Lxe/I$h;->a:Lxe/I$h;

    invoke-virtual {v0}, Lxe/a;->K()Lmh/q;

    move-result-object v14

    invoke-static/range {v9 .. v16}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v4, Lxe/I$k;->a:Lxe/I$k;

    invoke-virtual {v0}, Lxe/a;->L()Lmh/q;

    move-result-object v6

    invoke-static/range {v1 .. v8}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v12, Lxe/I$i;->a:Lxe/I$i;

    invoke-virtual {v0}, Lxe/a;->M()Lmh/q;

    move-result-object v14

    invoke-static/range {v9 .. v16}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v4, Lxe/I$j;->a:Lxe/I$j;

    invoke-virtual {v0}, Lxe/a;->N()Lmh/q;

    move-result-object v6

    invoke-static/range {v1 .. v8}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v12, Lxe/I$v;->a:Lxe/I$v;

    invoke-virtual {v0}, Lxe/a;->O()Lmh/q;

    move-result-object v14

    invoke-static/range {v9 .. v16}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v4, Lxe/I$w;->a:Lxe/I$w;

    invoke-virtual {v0}, Lxe/a;->P()Lmh/q;

    move-result-object v6

    invoke-static/range {v1 .. v8}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v12, Lxe/I$u;->a:Lxe/I$u;

    invoke-virtual {v0}, Lxe/a;->Q()Lmh/q;

    move-result-object v14

    invoke-static/range {v9 .. v16}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    sget-object v4, Lxe/I$o;->a:Lxe/I$o;

    invoke-virtual {v0}, Lxe/a;->R()Lmh/q;

    move-result-object v6

    invoke-static/range {v1 .. v8}, Lxe/B;->I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V

    return-void
.end method

.method static synthetic G(Lf2/u;Lxe/r0;Lmh/q;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lxe/B;->F(Lf2/u;Lxe/r0;Lmh/q;)V

    return-void
.end method

.method private static final H(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;)V
    .locals 0

    invoke-interface {p0, p3}, Lxe/r0;->b(LAe/p;)V

    invoke-static {p1, p3, p4, p2, p5}, LAe/a;->a(Lf2/u;LAe/p;LAe/n;Lmh/q;Lmh/q;)V

    return-void
.end method

.method static synthetic I(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;ILjava/lang/Object;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p4, 0x0

    :cond_0
    move-object v4, p4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lxe/B;->H(Lxe/r0;Lf2/u;Lmh/q;LAe/p;LAe/n;Lmh/q;)V

    return-void
.end method

.method public static final J()LT/H0;
    .locals 1

    sget-object v0, Lxe/B;->b:LT/H0;

    return-object v0
.end method

.method public static final K()LT/H0;
    .locals 1

    sget-object v0, Lxe/B;->a:LT/H0;

    return-object v0
.end method

.method public static final L(Lxe/F;Lf2/n;Lf2/n;LQe/d;)V
    .locals 6

    const-string v0, "screen"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navControllerModal"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wifimanRootController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lxe/F$g;

    if-eqz v0, :cond_2

    check-cast p0, Lxe/F$g;

    invoke-virtual {p0}, Lxe/F$g;->a()LQe/c$a;

    move-result-object p0

    invoke-interface {p3, p0}, LQe/d;->f(LQe/c$a;)V

    invoke-virtual {p1}, Lf2/n;->G()Lf2/r;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lf2/r;->w()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    sget-object p3, Lxe/I$p;->a:Lxe/I$p;

    invoke-virtual {p3}, Lxe/I$p;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    invoke-virtual {p3}, Lxe/I$p;->a()Ljava/lang/String;

    move-result-object v1

    new-instance p0, Lxe/i;

    invoke-direct {p0}, Lxe/i;-><init>()V

    invoke-static {p0}, Lf2/A;->a(Lmh/l;)Lf2/y;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    :cond_1
    new-instance p0, Lxe/q;

    invoke-direct {p0}, Lxe/q;-><init>()V

    invoke-static {p0}, Lf2/A;->a(Lmh/l;)Lf2/y;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "empty"

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_2
    instance-of p3, p0, Lxe/F$a;

    if-eqz p3, :cond_3

    sget-object p0, Lxe/I$c;->a:Lxe/I$c;

    invoke-virtual {p0}, Lxe/I$c;->a()Ljava/lang/String;

    move-result-object v1

    new-instance p0, Lxe/r;

    invoke-direct {p0}, Lxe/r;-><init>()V

    invoke-static {p0}, Lf2/A;->a(Lmh/l;)Lf2/y;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_3
    instance-of p3, p0, Lxe/F$i$e;

    if-eqz p3, :cond_4

    sget-object p0, Lxe/I$t;->a:Lxe/I$t;

    invoke-virtual {p0}, Lxe/I$t;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_4
    instance-of p3, p0, Lxe/F$i$b;

    if-eqz p3, :cond_5

    sget-object p0, Lxe/I$b;->a:Lxe/I$b;

    invoke-virtual {p0}, Lxe/I$b;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_5
    instance-of p3, p0, Lxe/F$i$d;

    if-eqz p3, :cond_6

    sget-object p0, Lxe/I$g;->a:Lxe/I$g;

    invoke-virtual {p0}, Lxe/I$g;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_6
    instance-of p3, p0, Lxe/F$i$f;

    if-eqz p3, :cond_7

    sget-object p0, Lxe/I$I;->a:Lxe/I$I;

    invoke-virtual {p0}, Lxe/I$I;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_7
    instance-of p3, p0, Lxe/F$i$g;

    if-eqz p3, :cond_8

    sget-object p0, Lxe/I$J;->a:Lxe/I$J;

    invoke-virtual {p0}, Lxe/I$J;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_8
    instance-of p3, p0, Lxe/F$i$h;

    if-eqz p3, :cond_9

    sget-object p0, Lxe/I$L;->a:Lxe/I$L;

    invoke-virtual {p0}, Lxe/I$L;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_9
    instance-of p3, p0, Lxe/F$i$c;

    if-eqz p3, :cond_a

    sget-object p0, Lxe/I$d;->a:Lxe/I$d;

    invoke-virtual {p0}, Lxe/I$d;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_a
    instance-of p3, p0, Lxe/F$i$a;

    if-eqz p3, :cond_b

    sget-object p0, Lxe/I$a;->a:Lxe/I$a;

    invoke-virtual {p0}, Lxe/I$a;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_b
    instance-of p3, p0, Lxe/F$d;

    if-eqz p3, :cond_c

    sget-object p0, Lxe/I$l;->a:Lxe/I$l;

    invoke-virtual {p0}, Lxe/I$l;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_c
    instance-of p3, p0, Lxe/F$e$b;

    if-eqz p3, :cond_d

    sget-object p0, Lxe/I$m;->a:Lxe/I$m;

    invoke-virtual {p0}, Lxe/I$m;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_d
    instance-of p3, p0, Lxe/F$e$a;

    if-eqz p3, :cond_e

    sget-object p0, Lxe/I$n;->a:Lxe/I$n;

    invoke-virtual {p0}, Lxe/I$n;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_e
    instance-of p3, p0, Lxe/F$k;

    if-eqz p3, :cond_f

    sget-object p1, Lxe/I$x;->a:Lxe/I$x;

    check-cast p0, Lxe/F$k;

    invoke-virtual {p0}, Lxe/F$k;->a()Lef/b;

    move-result-object p0

    invoke-virtual {p1, p0}, Lxe/I$x;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_f
    instance-of p3, p0, Lxe/F$h$a;

    if-eqz p3, :cond_10

    sget-object p0, Lxe/I$r;->a:Lxe/I$r;

    invoke-virtual {p0}, Lxe/I$r;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_10
    instance-of p3, p0, Lxe/F$h$c;

    if-eqz p3, :cond_11

    sget-object p0, Lxe/I$q;->a:Lxe/I$q;

    invoke-virtual {p0}, Lxe/I$q;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_11
    instance-of p3, p0, Lxe/F$h$b;

    if-eqz p3, :cond_12

    sget-object p0, Lxe/I$s;->a:Lxe/I$s;

    invoke-virtual {p0}, Lxe/I$s;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_12
    instance-of p3, p0, Lxe/F$b$a;

    if-eqz p3, :cond_13

    sget-object p2, Lxe/I$e;->a:Lxe/I$e;

    check-cast p0, Lxe/F$b$a;

    invoke-virtual {p0}, Lxe/F$b$a;->a()LJe/b;

    move-result-object p0

    invoke-virtual {p2, p0}, Lxe/I$e;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_13
    instance-of p3, p0, Lxe/F$b$b;

    if-eqz p3, :cond_14

    sget-object p1, Lxe/I$f;->a:Lxe/I$f;

    check-cast p0, Lxe/F$b$b;

    invoke-virtual {p0}, Lxe/F$b$b;->a()LJe/m;

    move-result-object p0

    invoke-virtual {p1, p0}, Lxe/I$f;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_14
    instance-of p3, p0, Lxe/F$c$b;

    if-eqz p3, :cond_15

    sget-object p0, Lxe/N;->a:Lxe/N;

    invoke-virtual {p0}, Lxe/N;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_15
    instance-of p3, p0, Lxe/F$c$a;

    if-eqz p3, :cond_16

    sget-object p0, Lxe/M;->a:Lxe/M;

    invoke-virtual {p0}, Lxe/M;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_16
    instance-of p3, p0, Lxe/H;

    if-eqz p3, :cond_17

    sget-object p0, Lxe/I$R;->a:Lxe/I$R;

    invoke-virtual {p0}, Lxe/I$R;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_17
    instance-of p3, p0, Lxe/G;

    if-eqz p3, :cond_18

    sget-object p0, Lxe/I$Q;->a:Lxe/I$Q;

    invoke-virtual {p0}, Lxe/I$Q;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_18
    instance-of p3, p0, Lxe/F$p$a;

    if-eqz p3, :cond_19

    sget-object p2, Lxe/I$O;->a:Lxe/I$O;

    check-cast p0, Lxe/F$p$a;

    invoke-virtual {p0}, Lxe/F$p$a;->a()LCf/c;

    move-result-object p0

    invoke-virtual {p2, p0}, Lxe/I$O;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_19
    instance-of p3, p0, Lxe/F$p$b;

    if-eqz p3, :cond_1a

    sget-object p0, Lxe/I$P;->a:Lxe/I$P;

    invoke-virtual {p0}, Lxe/I$P;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_1a
    instance-of p3, p0, Lxe/F$n;

    if-eqz p3, :cond_1b

    sget-object p2, Lxe/I$M;->a:Lxe/I$M;

    check-cast p0, Lxe/F$n;

    invoke-virtual {p0}, Lxe/F$n;->a()Lxf/d;

    move-result-object p0

    invoke-virtual {p2, p0}, Lxe/I$M;->f(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_1b
    instance-of p3, p0, Lxe/F$o;

    if-eqz p3, :cond_1c

    sget-object p2, Lxe/I$N;->a:Lxe/I$N;

    new-instance p3, Lcom/ui/wifiman/ui/wifi/channel/b;

    check-cast p0, Lxe/F$o;

    invoke-virtual {p0}, Lxe/F$o;->a()LS8/e;

    move-result-object p0

    invoke-direct {p3, p0}, Lcom/ui/wifiman/ui/wifi/channel/b;-><init>(LS8/e;)V

    invoke-virtual {p2, p3}, Lxe/I$N;->r(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_1c
    instance-of p3, p0, Lxe/F$m$e;

    if-eqz p3, :cond_1d

    sget-object p1, Lxe/I$K;->a:Lxe/I$K;

    check-cast p0, Lxe/F$m$e;

    invoke-virtual {p0}, Lxe/F$m$e;->a()Lcom/ui/wifiman/ui/teleport/L;

    move-result-object p0

    invoke-virtual {p1, p0}, Lxe/I$K;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_1d
    instance-of p3, p0, Lxe/F$m$c;

    if-eqz p3, :cond_1e

    sget-object p1, Lxe/I$G;->a:Lxe/I$G;

    check-cast p0, Lxe/F$m$c;

    invoke-virtual {p0}, Lxe/F$m$c;->a()Lsf/b;

    move-result-object p0

    invoke-virtual {p1, p0}, Lxe/I$G;->f(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance p0, Lxe/s;

    invoke-direct {p0}, Lxe/s;-><init>()V

    invoke-static {p0}, Lf2/A;->a(Lmh/l;)Lf2/y;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_1e
    instance-of p3, p0, Lxe/F$m$d;

    if-eqz p3, :cond_1f

    sget-object p0, Lxe/I$H;->a:Lxe/I$H;

    invoke-virtual {p0}, Lxe/I$H;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_1f
    instance-of p3, p0, Lxe/F$m$a;

    if-eqz p3, :cond_20

    sget-object p1, Lxe/I$E;->a:Lxe/I$E;

    check-cast p0, Lxe/F$m$a;

    invoke-virtual {p0}, Lxe/F$m$a;->a()Lcom/ui/wifiman/ui/teleport/consoles/b;

    move-result-object p0

    invoke-virtual {p1, p0}, Lxe/I$E;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_20
    instance-of p3, p0, Lxe/F$m$b;

    if-eqz p3, :cond_21

    sget-object p1, Lxe/I$F;->a:Lxe/I$F;

    check-cast p0, Lxe/F$m$b;

    invoke-virtual {p0}, Lxe/F$m$b;->a()Lcom/ui/wifiman/ui/teleport/consoles/v;

    move-result-object p0

    invoke-virtual {p1, p0}, Lxe/I$F;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_21
    instance-of p3, p0, Lxe/F$l$e;

    if-eqz p3, :cond_22

    sget-object p1, Lxe/I$y;->a:Lxe/I$y;

    check-cast p0, Lxe/F$l$e;

    invoke-virtual {p0}, Lxe/F$l$e;->a()Lnf/e;

    move-result-object p0

    invoke-virtual {p1, p0}, Lxe/I$y;->q(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_22
    instance-of p3, p0, Lxe/F$l$d;

    if-eqz p3, :cond_23

    sget-object p0, Lxe/I$C;->a:Lxe/I$C;

    invoke-virtual {p0}, Lxe/I$C;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_23
    instance-of p3, p0, Lxe/F$l$b;

    if-eqz p3, :cond_24

    sget-object p1, Lxe/I$B;->a:Lxe/I$B;

    check-cast p0, Lxe/F$l$b;

    invoke-virtual {p0}, Lxe/F$l$b;->a()Ljf/f;

    move-result-object p0

    invoke-virtual {p1, p0}, Lxe/I$B;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance p0, Lxe/t;

    invoke-direct {p0}, Lxe/t;-><init>()V

    invoke-static {p0}, Lf2/A;->a(Lmh/l;)Lf2/y;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_24
    instance-of p3, p0, Lxe/F$l$f;

    if-eqz p3, :cond_25

    sget-object p1, Lxe/I$z;->a:Lxe/I$z;

    check-cast p0, Lxe/F$l$f;

    invoke-virtual {p0}, Lxe/F$l$f;->a()Lif/a;

    move-result-object p0

    invoke-virtual {p1, p0}, Lxe/I$z;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance p0, Lxe/u;

    invoke-direct {p0}, Lxe/u;-><init>()V

    invoke-static {p0}, Lf2/A;->a(Lmh/l;)Lf2/y;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_25
    instance-of p3, p0, Lxe/F$l$c;

    if-eqz p3, :cond_26

    sget-object p1, Lxe/I$A;->a:Lxe/I$A;

    check-cast p0, Lxe/F$l$c;

    invoke-virtual {p0}, Lxe/F$l$c;->a()Lcom/ui/wifiman/ui/speedtest/feedback/c;

    move-result-object p0

    invoke-virtual {p1, p0}, Lxe/I$A;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_26
    instance-of p3, p0, Lxe/F$l$a;

    if-eqz p3, :cond_27

    sget-object p0, Lxe/I$D;->a:Lxe/I$D;

    invoke-virtual {p0}, Lxe/I$D;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_27
    instance-of p3, p0, Lxe/F$j$e;

    if-eqz p3, :cond_28

    sget-object p2, Lxe/I$h;->a:Lxe/I$h;

    check-cast p0, Lxe/F$j$e;

    invoke-virtual {p0}, Lxe/F$j$e;->a()LYe/e;

    move-result-object p0

    invoke-virtual {p2, p0}, Lxe/I$h;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_28
    instance-of p3, p0, Lxe/F$j$c;

    if-eqz p3, :cond_29

    sget-object p2, Lxe/I$j;->a:Lxe/I$j;

    check-cast p0, Lxe/F$j$c;

    invoke-virtual {p0}, Lxe/F$j$c;->a()LWe/a;

    move-result-object p0

    invoke-virtual {p2, p0}, Lxe/I$j;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_29
    instance-of p1, p0, Lxe/F$j$d;

    if-eqz p1, :cond_2a

    sget-object p1, Lxe/I$k;->a:Lxe/I$k;

    check-cast p0, Lxe/F$j$d;

    invoke-virtual {p0}, Lxe/F$j$d;->a()LXe/a;

    move-result-object p0

    invoke-virtual {p1, p0}, Lxe/I$k;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_2a
    instance-of p1, p0, Lxe/F$j$b;

    if-eqz p1, :cond_2b

    sget-object p1, Lxe/I$i;->a:Lxe/I$i;

    check-cast p0, Lxe/F$j$b;

    invoke-virtual {p0}, Lxe/F$j$b;->a()LVe/a;

    move-result-object p0

    invoke-virtual {p1, p0}, Lxe/I$i;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_2b
    instance-of p1, p0, Lxe/F$j$f;

    if-eqz p1, :cond_2c

    sget-object p0, Lxe/I$v;->a:Lxe/I$v;

    invoke-virtual {p0}, Lxe/I$v;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_2c
    instance-of p1, p0, Lxe/F$j$g;

    if-eqz p1, :cond_2d

    sget-object p1, Lxe/I$w;->a:Lxe/I$w;

    check-cast p0, Lxe/F$j$g;

    invoke-virtual {p0}, Lxe/F$j$g;->a()Lcom/ui/wifiman/ui/signal/D;

    move-result-object p0

    invoke-virtual {p1, p0}, Lxe/I$w;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_2d
    instance-of p1, p0, Lxe/F$j$a;

    if-eqz p1, :cond_2e

    sget-object p0, Lxe/I$u;->a:Lxe/I$u;

    invoke-virtual {p0}, Lxe/I$u;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto :goto_1

    :cond_2e
    instance-of p1, p0, Lxe/F$f$c;

    if-eqz p1, :cond_2f

    sget-object p0, Lxe/I$o;->a:Lxe/I$o;

    sget-object p1, LOe/a;->PERMISSION_LOCATION:LOe/a;

    invoke-virtual {p0, p1}, Lxe/I$o;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto :goto_1

    :cond_2f
    instance-of p1, p0, Lxe/F$f$d;

    if-eqz p1, :cond_30

    sget-object p0, Lxe/I$o;->a:Lxe/I$o;

    sget-object p1, LOe/a;->LOCATION_ACCESS:LOe/a;

    invoke-virtual {p0, p1}, Lxe/I$o;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto :goto_1

    :cond_30
    instance-of p1, p0, Lxe/F$f$a;

    if-eqz p1, :cond_31

    sget-object p0, Lxe/I$o;->a:Lxe/I$o;

    sget-object p1, LOe/a;->PERMISSION_CELLULAR:LOe/a;

    invoke-virtual {p0, p1}, Lxe/I$o;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto :goto_1

    :cond_31
    instance-of p0, p0, Lxe/F$f$b;

    if-eqz p0, :cond_32

    sget-object p0, Lxe/I$o;->a:Lxe/I$o;

    sget-object p1, LOe/a;->NO_WIFIMAN_API:LOe/a;

    invoke-virtual {p0, p1}, Lxe/I$o;->g(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    :goto_1
    return-void

    :cond_32
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final M(Lf2/z;)LYg/J;
    .locals 3

    const-string v0, "$this$navOptions"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1, v0}, Lf2/z;->e(Lf2/z;ILmh/l;ILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final N(Lf2/z;)LYg/J;
    .locals 2

    const-string v0, "$this$navOptions"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxe/p;

    invoke-direct {v0}, Lxe/p;-><init>()V

    const-string v1, "empty"

    invoke-virtual {p0, v1, v0}, Lf2/z;->d(Ljava/lang/String;Lmh/l;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final O(Lf2/G;)LYg/J;
    .locals 1

    const-string v0, "$this$popUpTo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lf2/G;->c(Z)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final P(Lf2/z;)LYg/J;
    .locals 2

    const-string v0, "$this$navOptions"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxe/o;

    invoke-direct {v0}, Lxe/o;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lf2/z;->c(ILmh/l;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final Q(Lf2/G;)LYg/J;
    .locals 1

    const-string v0, "$this$popUpTo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lf2/G;->c(Z)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final R(Lf2/z;)LYg/J;
    .locals 3

    const-string v0, "$this$navOptions"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "empty"

    invoke-static {p0, v2, v0, v1, v0}, Lf2/z;->f(Lf2/z;Ljava/lang/String;Lmh/l;ILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final S(Lf2/z;)LYg/J;
    .locals 3

    const-string v0, "$this$navOptions"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "empty"

    invoke-static {p0, v2, v0, v1, v0}, Lf2/z;->f(Lf2/z;Ljava/lang/String;Lmh/l;ILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final T(Lf2/z;)LYg/J;
    .locals 3

    const-string v0, "$this$navOptions"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "empty"

    invoke-static {p0, v2, v0, v1, v0}, Lf2/z;->f(Lf2/z;Ljava/lang/String;Lmh/l;ILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static synthetic a(Lf2/z;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/B;->M(Lf2/z;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()LN/n0;
    .locals 1

    invoke-static {}, Lxe/B;->B()LN/n0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lf2/z;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/B;->R(Lf2/z;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lf2/G;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/B;->Q(Lf2/G;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e()Lxe/f$b;
    .locals 1

    invoke-static {}, Lxe/B;->C()Lxe/f$b;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f(Lxe/h;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lxe/B;->z(Lxe/h;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lxe/r0;Lf2/w;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lxe/B;->w(Lxe/r0;Lf2/w;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lxe/r0;Lf2/u;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lxe/B;->v(Lxe/r0;Lf2/u;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lxe/r0;Lf2/w;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lxe/B;->t(Lxe/r0;Lf2/w;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lf2/G;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/B;->O(Lf2/G;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lf2/w;LIi/N;LN/n0;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Lxe/B;->s(Lf2/w;LIi/N;LN/n0;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l()LYg/J;
    .locals 1

    invoke-static {}, Lxe/B;->D()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic m(Lf2/z;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/B;->T(Lf2/z;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lf2/z;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/B;->N(Lf2/z;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(LT/z1;LN/o0;)Z
    .locals 0

    invoke-static {p0, p1}, Lxe/B;->y(LT/z1;LN/o0;)Z

    move-result p0

    return p0
.end method

.method public static synthetic p(Lf2/z;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/B;->P(Lf2/z;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lf2/z;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/B;->S(Lf2/z;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Lxe/r0;Lf2/w;LT/l;I)V
    .locals 10

    const-string v0, "analytics"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navHostController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x77d2f940

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_2

    and-int/lit8 v1, p3, 0x8

    if-nez v1, :cond_0

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-interface {p2, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    :goto_1
    or-int/2addr v1, p3

    goto :goto_2

    :cond_2
    move v1, p3

    :goto_2
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_4

    invoke-interface {p2, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_3

    :cond_3
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v1, v2

    :cond_4
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_6

    invoke-interface {p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_5

    :cond_6
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_7

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.AppModalNavigation (WiFimanAppNavigation.kt:181)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_7
    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_8

    sget-object v0, Ldh/j;->a:Ldh/j;

    invoke-static {v0, p2}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object v0

    new-instance v2, LT/A;

    invoke-direct {v2, v0}, LT/A;-><init>(LIi/N;)V

    invoke-interface {p2, v2}, LT/l;->K(Ljava/lang/Object;)V

    move-object v0, v2

    :cond_8
    check-cast v0, LT/A;

    invoke-virtual {v0}, LT/A;->a()LIi/N;

    move-result-object v0

    sget-object v2, Lxe/B;->b:LT/H0;

    invoke-interface {p2, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LN/n0;

    const v3, -0x1af3c7e7

    invoke-interface {p2, v3}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_9

    new-instance v3, Lxe/f$c;

    new-instance v7, Lxe/v;

    invoke-direct {v7, p1, v0, v2}, Lxe/v;-><init>(Lf2/w;LIi/N;LN/n0;)V

    const/4 v8, 0x1

    const/4 v9, 0x0

    const-wide/16 v5, 0x0

    move-object v4, v3

    invoke-direct/range {v4 .. v9}, Lxe/f$c;-><init>(JLmh/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v3, Lxe/f$c;

    invoke-interface {p2}, LT/l;->J()V

    sget-object v0, Lxe/B;->a:LT/H0;

    invoke-virtual {v0, v3}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v0

    new-instance v1, Lxe/B$a;

    invoke-direct {v1, v2, p1, p0, v3}, Lxe/B$a;-><init>(LN/n0;Lf2/w;Lxe/r0;Lxe/f$b;)V

    const/16 v2, 0x36

    const v3, 0xc99be00

    const/4 v4, 0x1

    invoke-static {v3, v4, v1, p2, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v1

    sget v2, LT/I0;->i:I

    or-int/lit8 v2, v2, 0x30

    invoke-static {v0, v1, p2, v2}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_5
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_b

    new-instance v0, Lxe/w;

    invoke-direct {v0, p0, p1, p3}, Lxe/w;-><init>(Lxe/r0;Lf2/w;I)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_b
    return-void
.end method

.method private static final s(Lf2/w;LIi/N;LN/n0;)LYg/J;
    .locals 8

    invoke-virtual {p0}, Lf2/n;->L()Lf2/k;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf2/k;->f()Lf2/r;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf2/r;->w()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const-string v2, "empty"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lf2/n;->Z()Z

    goto :goto_1

    :cond_1
    new-instance v5, Lxe/B$b;

    invoke-direct {v5, p2, v1}, Lxe/B$b;-><init>(LN/n0;Ldh/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v7}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :goto_1
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final t(Lxe/r0;Lf2/w;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lxe/B;->r(Lxe/r0;Lf2/w;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final u(Lxe/r0;Lf2/w;LT/l;I)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    move/from16 v14, p3

    const-string v1, "analytics"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "navHostController"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x760c9d27

    move-object/from16 v2, p2

    invoke-interface {v2, v1}, LT/l;->r(I)LT/l;

    move-result-object v13

    and-int/lit8 v2, v14, 0x6

    const/4 v3, 0x4

    if-nez v2, :cond_2

    and-int/lit8 v2, v14, 0x8

    if-nez v2, :cond_0

    invoke-interface {v13, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-interface {v13, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    const/4 v2, 0x2

    :goto_1
    or-int/2addr v2, v14

    goto :goto_2

    :cond_2
    move v2, v14

    :goto_2
    and-int/lit8 v4, v14, 0x30

    if-nez v4, :cond_4

    invoke-interface {v13, v15}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v2, v4

    :cond_4
    and-int/lit8 v4, v2, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_6

    invoke-interface {v13}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {v13}, LT/l;->C()V

    move-object/from16 v19, v13

    goto/16 :goto_6

    :cond_6
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_7

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.AppNavigation (WiFimanAppNavigation.kt:160)"

    invoke-static {v1, v2, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_7
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static {v1, v4, v6, v5}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1}, Lvf/c;->a(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v1, Lxe/I$p;->a:Lxe/I$p;

    invoke-virtual {v1}, Lxe/I$p;->a()Ljava/lang/String;

    move-result-object v5

    sget-object v1, LAe/n;->SLIDE_FROM_RIGHT:LAe/n;

    invoke-virtual {v1}, LAe/n;->getEnterTransition()Lmh/l;

    move-result-object v7

    invoke-virtual {v1}, LAe/n;->getExitTransition()Lmh/l;

    move-result-object v8

    invoke-virtual {v1}, LAe/n;->getPopEnterTransition()Lmh/l;

    move-result-object v9

    invoke-virtual {v1}, LAe/n;->getPopExitTransition()Lmh/l;

    move-result-object v10

    const v1, 0x64411f68

    invoke-interface {v13, v1}, LT/l;->U(I)V

    and-int/lit8 v1, v2, 0xe

    if-eq v1, v3, :cond_9

    and-int/lit8 v1, v2, 0x8

    if-eqz v1, :cond_8

    invoke-interface {v13, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_5

    :cond_8
    const/4 v6, 0x0

    :cond_9
    :goto_5
    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v6, :cond_a

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v1, v3, :cond_b

    :cond_a
    new-instance v1, Lxe/j;

    invoke-direct {v1, v0}, Lxe/j;-><init>(Lxe/r0;)V

    invoke-interface {v13, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    move-object v11, v1

    check-cast v11, Lmh/l;

    invoke-interface {v13}, LT/l;->J()V

    shr-int/lit8 v1, v2, 0x3

    and-int/lit8 v1, v1, 0xe

    const v2, 0x6db0030

    or-int v16, v1, v2

    const/16 v17, 0x0

    const/16 v18, 0x218

    const/4 v6, 0x0

    const/4 v12, 0x0

    const/16 v19, 0x0

    move-object/from16 v1, p1

    move-object v2, v5

    move-object v3, v4

    move-object v4, v6

    move-object v5, v12

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object/from16 v10, v19

    move-object v12, v13

    move-object/from16 v19, v13

    move/from16 v13, v16

    move/from16 v14, v17

    move/from16 v15, v18

    invoke-static/range {v1 .. v15}, Lg2/m;->b(Lf2/w;Ljava/lang/String;Landroidx/compose/ui/e;Lf0/c;Ljava/lang/String;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    :goto_6
    invoke-interface/range {v19 .. v19}, LT/l;->z()LT/X0;

    move-result-object v1

    if-eqz v1, :cond_d

    new-instance v2, Lxe/k;

    move-object/from16 v3, p1

    move/from16 v4, p3

    invoke-direct {v2, v0, v3, v4}, Lxe/k;-><init>(Lxe/r0;Lf2/w;I)V

    invoke-interface {v1, v2}, LT/X0;->a(Lmh/p;)V

    :cond_d
    return-void
.end method

.method private static final v(Lxe/r0;Lf2/u;)LYg/J;
    .locals 2

    const-string v0, "$this$NavHost"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, p0, v0, v1, v0}, Lxe/B;->G(Lf2/u;Lxe/r0;Lmh/q;ILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final w(Lxe/r0;Lf2/w;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lxe/B;->u(Lxe/r0;Lf2/w;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final x(Lxe/h;LT/l;I)V
    .locals 29

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "vm"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0x16f36cbc

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x2

    const/4 v13, 0x4

    if-nez v3, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v13

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v1

    move v14, v3

    goto :goto_1

    :cond_1
    move v14, v1

    :goto_1
    and-int/lit8 v3, v14, 0x3

    if-ne v3, v4, :cond_3

    invoke-interface {v15}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v15}, LT/l;->C()V

    move-object v5, v15

    goto/16 :goto_5

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.AppPopup (WiFimanAppNavigation.kt:262)"

    invoke-static {v2, v14, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    sget-object v19, LT/l;->a:LT/l$a;

    invoke-virtual/range {v19 .. v19}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_5

    sget-object v2, Ldh/j;->a:Ldh/j;

    invoke-static {v2, v15}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object v2

    new-instance v3, LT/A;

    invoke-direct {v3, v2}, LT/A;-><init>(LIi/N;)V

    invoke-interface {v15, v3}, LT/l;->K(Ljava/lang/Object;)V

    move-object v2, v3

    :cond_5
    check-cast v2, LT/A;

    invoke-virtual {v2}, LT/A;->a()LIi/N;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lxe/h;->o0()LLi/N;

    move-result-object v3

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v10, 0x1

    invoke-static {v3, v11, v15, v12, v10}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v3

    sget-object v9, LN/o0;->Hidden:LN/o0;

    const v4, 0x4ae9fdc9    # 7667428.5f

    invoke-interface {v15, v4}, LT/l;->U(I)V

    invoke-interface {v15, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_6

    invoke-virtual/range {v19 .. v19}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_7

    :cond_6
    new-instance v5, Lxe/l;

    invoke-direct {v5, v3}, Lxe/l;-><init>(LT/z1;)V

    invoke-interface {v15, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v5, Lmh/l;

    invoke-interface {v15}, LT/l;->J()V

    const/16 v8, 0xc06

    const/16 v16, 0x2

    const/4 v4, 0x0

    const/4 v6, 0x1

    move-object v3, v9

    move-object v7, v15

    move-object/from16 v20, v9

    move/from16 v9, v16

    invoke-static/range {v3 .. v9}, LN/m0;->j(LN/o0;Lr/i;Lmh/l;ZLT/l;II)LN/n0;

    move-result-object v9

    int-to-float v3, v12

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v8

    sget-object v3, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v3}, Lm0/v0$a;->d()J

    move-result-wide v16

    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object v3

    invoke-interface {v15, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm0/v0;

    invoke-virtual {v3}, Lm0/v0;->u()J

    move-result-wide v21

    sget-object v3, LQ/b;->a:LQ/b;

    const/4 v4, 0x6

    invoke-virtual {v3, v15, v4}, LQ/b;->b(LT/l;I)Lm0/i1;

    move-result-object v7

    new-instance v3, Lxe/B$c;

    invoke-direct {v3, v0, v9, v2}, Lxe/B$c;-><init>(Lxe/h;LN/n0;LIi/N;)V

    const/16 v5, 0x36

    const v6, 0x4df6e272    # 5.1775443E8f

    invoke-static {v6, v10, v3, v15, v5}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v3

    sget-object v5, Lxe/a;->a:Lxe/a;

    invoke-virtual {v5}, Lxe/a;->l()Lmh/p;

    move-result-object v18

    sget v5, LN/n0;->e:I

    shl-int/lit8 v4, v5, 0x6

    const v5, 0x301b0006

    or-int v23, v4, v5

    const/16 v24, 0x10a

    const/4 v4, 0x0

    const/4 v6, 0x0

    const-wide/16 v25, 0x0

    move-object v5, v9

    move-object/from16 v28, v9

    move/from16 v27, v10

    move-wide/from16 v9, v16

    move-wide/from16 v11, v21

    move/from16 v21, v14

    move-wide/from16 v13, v25

    move-object/from16 p1, v15

    move-object/from16 v15, v18

    move-object/from16 v16, p1

    move/from16 v17, v23

    move/from16 v18, v24

    invoke-static/range {v3 .. v18}, LN/m0;->b(Lmh/q;Landroidx/compose/ui/e;LN/n0;ZLm0/i1;FJJJLmh/p;LT/l;II)V

    invoke-virtual/range {v28 .. v28}, LN/n0;->g()LN/o0;

    move-result-object v3

    move-object/from16 v4, v20

    if-eq v3, v4, :cond_8

    move/from16 v12, v27

    goto :goto_3

    :cond_8
    const/4 v12, 0x0

    :goto_3
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const v4, 0x4aeb20b0    # 7704664.0f

    move-object/from16 v5, p1

    invoke-interface {v5, v4}, LT/l;->U(I)V

    invoke-interface {v5, v12}, LT/l;->c(Z)Z

    move-result v4

    invoke-interface {v5, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    and-int/lit8 v6, v21, 0xe

    const/4 v7, 0x4

    if-ne v6, v7, :cond_9

    goto :goto_4

    :cond_9
    const/16 v27, 0x0

    :goto_4
    or-int v4, v4, v27

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_a

    invoke-virtual/range {v19 .. v19}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_b

    :cond_a
    new-instance v6, Lxe/B$d;

    const/4 v4, 0x0

    invoke-direct {v6, v12, v2, v0, v4}, Lxe/B$d;-><init>(ZLIi/N;Lxe/h;Ldh/e;)V

    invoke-interface {v5, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, Lmh/p;

    invoke-interface {v5}, LT/l;->J()V

    const/4 v2, 0x0

    invoke-static {v3, v6, v5, v2}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    :goto_5
    invoke-interface {v5}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_d

    new-instance v3, Lxe/m;

    invoke-direct {v3, v0, v1}, Lxe/m;-><init>(Lxe/h;I)V

    invoke-interface {v2, v3}, LT/X0;->a(Lmh/p;)V

    :cond_d
    return-void
.end method

.method private static final y(LT/z1;LN/o0;)Z
    .locals 3

    const-string v0, "popupState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Popup bottom sheet state change: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object v0, Lxe/B$e;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    if-eq p1, v2, :cond_2

    const/4 p0, 0x3

    if-ne p1, p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    invoke-static {p0}, Lxe/B;->A(LT/z1;)Z

    move-result v0

    :cond_2
    :goto_0
    return v0
.end method

.method private static final z(Lxe/h;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lxe/B;->x(Lxe/h;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
