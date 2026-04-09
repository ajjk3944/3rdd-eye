.class final Landroidx/compose/animation/h;
.super Lq/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/animation/h$a;
    }
.end annotation


# instance fields
.field private final A:Lmh/l;

.field private n:Lr/o0;

.field private o:Lr/o0$a;

.field private p:Lr/o0$a;

.field private q:Lr/o0$a;

.field private r:Landroidx/compose/animation/i;

.field private s:Landroidx/compose/animation/k;

.field private t:Lmh/a;

.field private u:Lq/p;

.field private v:Z

.field private w:J

.field private x:J

.field private y:Lf0/c;

.field private final z:Lmh/l;


# direct methods
.method public constructor <init>(Lr/o0;Lr/o0$a;Lr/o0$a;Lr/o0$a;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lmh/a;Lq/p;)V
    .locals 0

    invoke-direct {p0}, Lq/q;-><init>()V

    iput-object p1, p0, Landroidx/compose/animation/h;->n:Lr/o0;

    iput-object p2, p0, Landroidx/compose/animation/h;->o:Lr/o0$a;

    iput-object p3, p0, Landroidx/compose/animation/h;->p:Lr/o0$a;

    iput-object p4, p0, Landroidx/compose/animation/h;->q:Lr/o0$a;

    iput-object p5, p0, Landroidx/compose/animation/h;->r:Landroidx/compose/animation/i;

    iput-object p6, p0, Landroidx/compose/animation/h;->s:Landroidx/compose/animation/k;

    iput-object p7, p0, Landroidx/compose/animation/h;->t:Lmh/a;

    iput-object p8, p0, Landroidx/compose/animation/h;->u:Lq/p;

    invoke-static {}, Landroidx/compose/animation/f;->c()J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/animation/h;->w:J

    const/16 p7, 0xf

    const/4 p8, 0x0

    const/4 p3, 0x0

    const/4 p4, 0x0

    const/4 p5, 0x0

    const/4 p6, 0x0

    invoke-static/range {p3 .. p8}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/animation/h;->x:J

    new-instance p1, Landroidx/compose/animation/h$i;

    invoke-direct {p1, p0}, Landroidx/compose/animation/h$i;-><init>(Landroidx/compose/animation/h;)V

    iput-object p1, p0, Landroidx/compose/animation/h;->z:Lmh/l;

    new-instance p1, Landroidx/compose/animation/h$j;

    invoke-direct {p1, p0}, Landroidx/compose/animation/h$j;-><init>(Landroidx/compose/animation/h;)V

    iput-object p1, p0, Landroidx/compose/animation/h;->A:Lmh/l;

    return-void
.end method

.method private final K2(J)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/animation/h;->v:Z

    iput-wide p1, p0, Landroidx/compose/animation/h;->x:J

    return-void
.end method


# virtual methods
.method public final D2()Lf0/c;
    .locals 3

    iget-object v0, p0, Landroidx/compose/animation/h;->n:Lr/o0;

    invoke-virtual {v0}, Lr/o0;->n()Lr/o0$b;

    move-result-object v0

    sget-object v1, Lq/k;->PreEnter:Lq/k;

    sget-object v2, Lq/k;->Visible:Lq/k;

    invoke-interface {v0, v1, v2}, Lr/o0$b;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/compose/animation/h;->r:Landroidx/compose/animation/i;

    invoke-virtual {v0}, Landroidx/compose/animation/i;->b()Lq/A;

    move-result-object v0

    invoke-virtual {v0}, Lq/A;->a()Lq/g;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lq/g;->a()Lf0/c;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/compose/animation/h;->s:Landroidx/compose/animation/k;

    invoke-virtual {v0}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object v0

    invoke-virtual {v0}, Lq/A;->a()Lq/g;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lq/g;->a()Lf0/c;

    move-result-object v1

    goto :goto_1

    :cond_2
    iget-object v0, p0, Landroidx/compose/animation/h;->s:Landroidx/compose/animation/k;

    invoke-virtual {v0}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object v0

    invoke-virtual {v0}, Lq/A;->a()Lq/g;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lq/g;->a()Lf0/c;

    move-result-object v0

    if-nez v0, :cond_0

    :cond_3
    iget-object v0, p0, Landroidx/compose/animation/h;->r:Landroidx/compose/animation/i;

    invoke-virtual {v0}, Landroidx/compose/animation/i;->b()Lq/A;

    move-result-object v0

    invoke-virtual {v0}, Lq/A;->a()Lq/g;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lq/g;->a()Lf0/c;

    move-result-object v1

    :cond_4
    :goto_1
    return-object v1
.end method

.method public final E2()Landroidx/compose/animation/i;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/h;->r:Landroidx/compose/animation/i;

    return-object v0
.end method

.method public final F2()Landroidx/compose/animation/k;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/h;->s:Landroidx/compose/animation/k;

    return-object v0
.end method

.method public final G2(Lmh/a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/h;->t:Lmh/a;

    return-void
.end method

.method public final H2(Landroidx/compose/animation/i;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/h;->r:Landroidx/compose/animation/i;

    return-void
.end method

.method public final I2(Landroidx/compose/animation/k;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/h;->s:Landroidx/compose/animation/k;

    return-void
.end method

.method public final J2(Lq/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/h;->u:Lq/p;

    return-void
.end method

.method public final L2(Lr/o0$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/h;->p:Lr/o0$a;

    return-void
.end method

.method public final M2(Lr/o0$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/h;->o:Lr/o0$a;

    return-void
.end method

.method public final N2(Lr/o0$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/h;->q:Lr/o0$a;

    return-void
.end method

.method public final O2(Lr/o0;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/h;->n:Lr/o0;

    return-void
.end method

.method public final P2(Lq/k;J)J
    .locals 1

    sget-object v0, Landroidx/compose/animation/h$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Landroidx/compose/animation/h;->s:Landroidx/compose/animation/k;

    invoke-virtual {p1}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object p1

    invoke-virtual {p1}, Lq/A;->a()Lq/g;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lq/g;->d()Lmh/l;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {p2, p3}, LY0/r;->b(J)LY0/r;

    move-result-object p2

    invoke-interface {p1, p2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY0/r;

    invoke-virtual {p1}, LY0/r;->j()J

    move-result-wide p2

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    iget-object p1, p0, Landroidx/compose/animation/h;->r:Landroidx/compose/animation/i;

    invoke-virtual {p1}, Landroidx/compose/animation/i;->b()Lq/A;

    move-result-object p1

    invoke-virtual {p1}, Lq/A;->a()Lq/g;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lq/g;->d()Lmh/l;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {p2, p3}, LY0/r;->b(J)LY0/r;

    move-result-object p2

    invoke-interface {p1, p2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY0/r;

    invoke-virtual {p1}, LY0/r;->j()J

    move-result-wide p2

    :cond_2
    :goto_0
    return-wide p2
.end method

.method public final Q2(Lq/k;J)J
    .locals 3

    iget-object v0, p0, Landroidx/compose/animation/h;->r:Landroidx/compose/animation/i;

    invoke-virtual {v0}, Landroidx/compose/animation/i;->b()Lq/A;

    move-result-object v0

    invoke-virtual {v0}, Lq/A;->f()Lq/w;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lq/w;->b()Lmh/l;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p2, p3}, LY0/r;->b(J)LY0/r;

    move-result-object v1

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/n;

    invoke-virtual {v0}, LY0/n;->n()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-object v0, LY0/n;->b:LY0/n$a;

    invoke-virtual {v0}, LY0/n$a;->a()J

    move-result-wide v0

    :goto_0
    iget-object v2, p0, Landroidx/compose/animation/h;->s:Landroidx/compose/animation/k;

    invoke-virtual {v2}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object v2

    invoke-virtual {v2}, Lq/A;->f()Lq/w;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lq/w;->b()Lmh/l;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {p2, p3}, LY0/r;->b(J)LY0/r;

    move-result-object p2

    invoke-interface {v2, p2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LY0/n;

    invoke-virtual {p2}, LY0/n;->n()J

    move-result-wide p2

    goto :goto_1

    :cond_1
    sget-object p2, LY0/n;->b:LY0/n$a;

    invoke-virtual {p2}, LY0/n$a;->a()J

    move-result-wide p2

    :goto_1
    sget-object v2, Landroidx/compose/animation/h$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    const/4 v2, 0x1

    if-eq p1, v2, :cond_3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_4

    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    move-wide v0, p2

    goto :goto_2

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    sget-object p1, LY0/n;->b:LY0/n$a;

    invoke-virtual {p1}, LY0/n$a;->a()J

    move-result-wide v0

    :cond_4
    :goto_2
    return-wide v0
.end method

.method public final R2(Lq/k;J)J
    .locals 10

    iget-object v0, p0, Landroidx/compose/animation/h;->y:Lf0/c;

    if-nez v0, :cond_0

    sget-object p1, LY0/n;->b:LY0/n$a;

    invoke-virtual {p1}, LY0/n$a;->a()J

    move-result-wide p1

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/animation/h;->D2()Lf0/c;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object p1, LY0/n;->b:LY0/n$a;

    invoke-virtual {p1}, LY0/n$a;->a()J

    move-result-wide p1

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/compose/animation/h;->y:Lf0/c;

    invoke-virtual {p0}, Landroidx/compose/animation/h;->D2()Lf0/c;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, LY0/n;->b:LY0/n$a;

    invoke-virtual {p1}, LY0/n$a;->a()J

    move-result-wide p1

    goto :goto_0

    :cond_2
    sget-object v0, Landroidx/compose/animation/h$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_6

    const/4 v0, 0x2

    if-eq p1, v0, :cond_5

    const/4 v0, 0x3

    if-ne p1, v0, :cond_4

    iget-object p1, p0, Landroidx/compose/animation/h;->s:Landroidx/compose/animation/k;

    invoke-virtual {p1}, Landroidx/compose/animation/k;->b()Lq/A;

    move-result-object p1

    invoke-virtual {p1}, Lq/A;->a()Lq/g;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lq/g;->d()Lmh/l;

    move-result-object p1

    invoke-static {p2, p3}, LY0/r;->b(J)LY0/r;

    move-result-object v0

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY0/r;

    invoke-virtual {p1}, LY0/r;->j()J

    move-result-wide v6

    invoke-virtual {p0}, Landroidx/compose/animation/h;->D2()Lf0/c;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    sget-object p1, LY0/t;->Ltr:LY0/t;

    move-wide v1, p2

    move-wide v3, v6

    move-object v5, p1

    invoke-interface/range {v0 .. v5}, Lf0/c;->a(JJLY0/t;)J

    move-result-wide v8

    iget-object v0, p0, Landroidx/compose/animation/h;->y:Lf0/c;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface/range {v0 .. v5}, Lf0/c;->a(JJLY0/t;)J

    move-result-wide p1

    invoke-static {v8, v9, p1, p2}, LY0/n;->k(JJ)J

    move-result-wide p1

    goto :goto_0

    :cond_3
    sget-object p1, LY0/n;->b:LY0/n$a;

    invoke-virtual {p1}, LY0/n$a;->a()J

    move-result-wide p1

    goto :goto_0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    sget-object p1, LY0/n;->b:LY0/n$a;

    invoke-virtual {p1}, LY0/n$a;->a()J

    move-result-wide p1

    goto :goto_0

    :cond_6
    sget-object p1, LY0/n;->b:LY0/n$a;

    invoke-virtual {p1}, LY0/n$a;->a()J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
    .locals 20

    move-object/from16 v0, p0

    move-wide/from16 v1, p3

    iget-object v3, v0, Landroidx/compose/animation/h;->n:Lr/o0;

    invoke-virtual {v3}, Lr/o0;->i()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, v0, Landroidx/compose/animation/h;->n:Lr/o0;

    invoke-virtual {v4}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    if-ne v3, v4, :cond_0

    iput-object v5, v0, Landroidx/compose/animation/h;->y:Lf0/c;

    goto :goto_0

    :cond_0
    iget-object v3, v0, Landroidx/compose/animation/h;->y:Lf0/c;

    if-nez v3, :cond_2

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/animation/h;->D2()Lf0/c;

    move-result-object v3

    if-nez v3, :cond_1

    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->o()Lf0/c;

    move-result-object v3

    :cond_1
    iput-object v3, v0, Landroidx/compose/animation/h;->y:Lf0/c;

    :cond_2
    :goto_0
    invoke-interface/range {p1 .. p1}, LC0/o;->a1()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface/range {p2 .. p4}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v4

    invoke-virtual {v3}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v5

    invoke-static {v4, v5}, LY0/s;->a(II)J

    move-result-wide v4

    iput-wide v4, v0, Landroidx/compose/animation/h;->w:J

    invoke-direct {v0, v1, v2}, Landroidx/compose/animation/h;->K2(J)V

    invoke-static {v4, v5}, LY0/r;->g(J)I

    move-result v7

    invoke-static {v4, v5}, LY0/r;->f(J)I

    move-result v8

    new-instance v10, Landroidx/compose/animation/h$b;

    invoke-direct {v10, v3}, Landroidx/compose/animation/h$b;-><init>(Landroidx/compose/ui/layout/t;)V

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v9, 0x0

    move-object/from16 v6, p1

    invoke-static/range {v6 .. v12}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object v1

    return-object v1

    :cond_3
    iget-object v3, v0, Landroidx/compose/animation/h;->t:Lmh/a;

    invoke-interface {v3}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_a

    iget-object v3, v0, Landroidx/compose/animation/h;->u:Lq/p;

    invoke-interface {v3}, Lq/p;->a()Lmh/l;

    move-result-object v12

    invoke-interface/range {p2 .. p4}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v3

    invoke-virtual {v7}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v4

    invoke-static {v3, v4}, LY0/s;->a(II)J

    move-result-wide v3

    iget-wide v8, v0, Landroidx/compose/animation/h;->w:J

    invoke-static {v8, v9}, Landroidx/compose/animation/f;->d(J)Z

    move-result v6

    if-eqz v6, :cond_4

    iget-wide v8, v0, Landroidx/compose/animation/h;->w:J

    move-wide v14, v8

    goto :goto_1

    :cond_4
    move-wide v14, v3

    :goto_1
    iget-object v6, v0, Landroidx/compose/animation/h;->o:Lr/o0$a;

    if-eqz v6, :cond_5

    iget-object v5, v0, Landroidx/compose/animation/h;->z:Lmh/l;

    new-instance v8, Landroidx/compose/animation/h$e;

    invoke-direct {v8, v0, v14, v15}, Landroidx/compose/animation/h$e;-><init>(Landroidx/compose/animation/h;J)V

    invoke-virtual {v6, v5, v8}, Lr/o0$a;->a(Lmh/l;Lmh/l;)LT/z1;

    move-result-object v5

    :cond_5
    if-eqz v5, :cond_6

    invoke-interface {v5}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LY0/r;

    invoke-virtual {v3}, LY0/r;->j()J

    move-result-wide v3

    :cond_6
    invoke-static {v1, v2, v3, v4}, LY0/c;->f(JJ)J

    move-result-wide v1

    iget-object v3, v0, Landroidx/compose/animation/h;->p:Lr/o0$a;

    if-eqz v3, :cond_7

    sget-object v4, Landroidx/compose/animation/h$f;->a:Landroidx/compose/animation/h$f;

    new-instance v5, Landroidx/compose/animation/h$g;

    invoke-direct {v5, v0, v14, v15}, Landroidx/compose/animation/h$g;-><init>(Landroidx/compose/animation/h;J)V

    invoke-virtual {v3, v4, v5}, Lr/o0$a;->a(Lmh/l;Lmh/l;)LT/z1;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-interface {v3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LY0/n;

    invoke-virtual {v3}, LY0/n;->n()J

    move-result-wide v3

    :goto_2
    move-wide v10, v3

    goto :goto_3

    :cond_7
    sget-object v3, LY0/n;->b:LY0/n$a;

    invoke-virtual {v3}, LY0/n$a;->a()J

    move-result-wide v3

    goto :goto_2

    :goto_3
    iget-object v3, v0, Landroidx/compose/animation/h;->q:Lr/o0$a;

    if-eqz v3, :cond_8

    iget-object v4, v0, Landroidx/compose/animation/h;->A:Lmh/l;

    new-instance v5, Landroidx/compose/animation/h$h;

    invoke-direct {v5, v0, v14, v15}, Landroidx/compose/animation/h$h;-><init>(Landroidx/compose/animation/h;J)V

    invoke-virtual {v3, v4, v5}, Lr/o0$a;->a(Lmh/l;Lmh/l;)LT/z1;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-interface {v3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LY0/n;

    invoke-virtual {v3}, LY0/n;->n()J

    move-result-wide v3

    goto :goto_4

    :cond_8
    sget-object v3, LY0/n;->b:LY0/n$a;

    invoke-virtual {v3}, LY0/n$a;->a()J

    move-result-wide v3

    :goto_4
    iget-object v13, v0, Landroidx/compose/animation/h;->y:Lf0/c;

    if-eqz v13, :cond_9

    sget-object v18, LY0/t;->Ltr:LY0/t;

    move-wide/from16 v16, v1

    invoke-interface/range {v13 .. v18}, Lf0/c;->a(JJLY0/t;)J

    move-result-wide v5

    goto :goto_5

    :cond_9
    sget-object v5, LY0/n;->b:LY0/n$a;

    invoke-virtual {v5}, LY0/n$a;->a()J

    move-result-wide v5

    :goto_5
    invoke-static {v5, v6, v3, v4}, LY0/n;->l(JJ)J

    move-result-wide v8

    invoke-static {v1, v2}, LY0/r;->g(J)I

    move-result v14

    invoke-static {v1, v2}, LY0/r;->f(J)I

    move-result v15

    new-instance v17, Landroidx/compose/animation/h$c;

    move-object/from16 v6, v17

    invoke-direct/range {v6 .. v12}, Landroidx/compose/animation/h$c;-><init>(Landroidx/compose/ui/layout/t;JJLmh/l;)V

    const/16 v18, 0x4

    const/16 v19, 0x0

    const/16 v16, 0x0

    move-object/from16 v13, p1

    invoke-static/range {v13 .. v19}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object v1

    return-object v1

    :cond_a
    invoke-interface/range {p2 .. p4}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v3

    invoke-virtual {v1}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v4

    new-instance v6, Landroidx/compose/animation/h$d;

    invoke-direct {v6, v1}, Landroidx/compose/animation/h$d;-><init>(Landroidx/compose/ui/layout/t;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object v1

    return-object v1
.end method

.method public n2()V
    .locals 2

    invoke-super {p0}, Landroidx/compose/ui/e$c;->n2()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/animation/h;->v:Z

    invoke-static {}, Landroidx/compose/animation/f;->c()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/animation/h;->w:J

    return-void
.end method
