.class public final LE0/L$b;
.super Landroidx/compose/ui/layout/t;
.source "SourceFile"

# interfaces
.implements LC0/B;
.implements LE0/b;
.implements LE0/W;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE0/L;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE0/L$b$a;
    }
.end annotation


# instance fields
.field private A:Z

.field private B:Lmh/l;

.field private C:Lp0/c;

.field private D:J

.field private E:F

.field private final F:Lmh/a;

.field private G:Z

.field private H:Z

.field final synthetic I:LE0/L;

.field private f:Z

.field private g:I

.field private h:I

.field private i:Z

.field private j:Z

.field private k:LE0/G$g;

.field private l:Z

.field private m:J

.field private n:Lmh/l;

.field private o:Lp0/c;

.field private p:F

.field private q:Z

.field private r:Ljava/lang/Object;

.field private s:Z

.field private t:Z

.field private final u:LE0/a;

.field private final v:LV/b;

.field private w:Z

.field private x:Z

.field private final y:Lmh/a;

.field private z:F


# direct methods
.method public constructor <init>(LE0/L;)V
    .locals 5

    iput-object p1, p0, LE0/L$b;->I:LE0/L;

    invoke-direct {p0}, Landroidx/compose/ui/layout/t;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, LE0/L$b;->g:I

    iput v0, p0, LE0/L$b;->h:I

    sget-object v0, LE0/G$g;->NotUsed:LE0/G$g;

    iput-object v0, p0, LE0/L$b;->k:LE0/G$g;

    sget-object v0, LY0/n;->b:LY0/n$a;

    invoke-virtual {v0}, LY0/n$a;->a()J

    move-result-wide v1

    iput-wide v1, p0, LE0/L$b;->m:J

    const/4 v1, 0x1

    iput-boolean v1, p0, LE0/L$b;->q:Z

    new-instance v2, LE0/H;

    invoke-direct {v2, p0}, LE0/H;-><init>(LE0/b;)V

    iput-object v2, p0, LE0/L$b;->u:LE0/a;

    new-instance v2, LV/b;

    const/16 v3, 0x10

    new-array v3, v3, [LE0/L$b;

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, LV/b;-><init>([Ljava/lang/Object;I)V

    iput-object v2, p0, LE0/L$b;->v:LV/b;

    iput-boolean v1, p0, LE0/L$b;->w:Z

    new-instance v1, LE0/L$b$b;

    invoke-direct {v1, p0}, LE0/L$b$b;-><init>(LE0/L$b;)V

    iput-object v1, p0, LE0/L$b;->y:Lmh/a;

    invoke-virtual {v0}, LY0/n$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, LE0/L$b;->D:J

    new-instance v0, LE0/L$b$c;

    invoke-direct {v0, p1, p0}, LE0/L$b$c;-><init>(LE0/L;LE0/L$b;)V

    iput-object v0, p0, LE0/L$b;->F:Lmh/a;

    return-void
.end method

.method private final O1()V
    .locals 8

    invoke-virtual {p0}, LE0/L$b;->q()Z

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, LE0/L$b;->g2(Z)V

    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    if-nez v0, :cond_1

    invoke-virtual {v1}, LE0/G;->d0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v1

    invoke-static/range {v2 .. v7}, LE0/G;->w1(LE0/G;ZZZILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, LE0/G;->Y()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v1

    invoke-static/range {v2 .. v7}, LE0/G;->s1(LE0/G;ZZZILjava/lang/Object;)V

    :cond_1
    :goto_0
    invoke-virtual {v1}, LE0/G;->m0()LE0/c0;

    move-result-object v0

    invoke-virtual {v1}, LE0/G;->P()LE0/c0;

    move-result-object v2

    invoke-virtual {v2}, LE0/c0;->H2()LE0/c0;

    move-result-object v2

    :goto_1
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LE0/c0;->z2()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v0}, LE0/c0;->R2()V

    :cond_2
    invoke-virtual {v0}, LE0/c0;->H2()LE0/c0;

    move-result-object v0

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, LE0/G;->w0()LV/b;

    move-result-object v0

    invoke-virtual {v0}, LV/b;->o()I

    move-result v2

    if-lez v2, :cond_6

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    const/4 v3, 0x0

    :cond_4
    aget-object v4, v0, v3

    check-cast v4, LE0/G;

    invoke-virtual {v4}, LE0/G;->p0()I

    move-result v5

    const v6, 0x7fffffff

    if-eq v5, v6, :cond_5

    invoke-virtual {v4}, LE0/G;->c0()LE0/L$b;

    move-result-object v5

    invoke-direct {v5}, LE0/L$b;->O1()V

    invoke-virtual {v1, v4}, LE0/G;->x1(LE0/G;)V

    :cond_5
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_4

    :cond_6
    return-void
.end method

.method private final R1()V
    .locals 4

    invoke-virtual {p0}, LE0/L$b;->q()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LE0/L$b;->g2(Z)V

    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->m0()LE0/c0;

    move-result-object v2

    invoke-virtual {v1}, LE0/G;->P()LE0/c0;

    move-result-object v1

    invoke-virtual {v1}, LE0/c0;->H2()LE0/c0;

    move-result-object v1

    :goto_0
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, LE0/c0;->h3()V

    invoke-virtual {v2}, LE0/c0;->H2()LE0/c0;

    move-result-object v2

    goto :goto_0

    :cond_0
    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->w0()LV/b;

    move-result-object v1

    invoke-virtual {v1}, LV/b;->o()I

    move-result v2

    if-lez v2, :cond_2

    invoke-virtual {v1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v1

    :cond_1
    aget-object v3, v1, v0

    check-cast v3, LE0/G;

    invoke-virtual {v3}, LE0/G;->c0()LE0/L$b;

    move-result-object v3

    invoke-direct {v3}, LE0/L$b;->R1()V

    add-int/lit8 v0, v0, 0x1

    if-lt v0, v2, :cond_1

    :cond_2
    return-void
.end method

.method public static final synthetic T0(LE0/L$b;)V
    .locals 0

    invoke-direct {p0}, LE0/L$b;->c1()V

    return-void
.end method

.method public static final synthetic U0(LE0/L$b;)V
    .locals 0

    invoke-direct {p0}, LE0/L$b;->g1()V

    return-void
.end method

.method private final U1()V
    .locals 11

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v0}, LE0/G;->w0()LV/b;

    move-result-object v0

    invoke-virtual {v0}, LV/b;->o()I

    move-result v2

    if-lez v2, :cond_2

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    const/4 v3, 0x0

    :cond_0
    aget-object v4, v0, v3

    check-cast v4, LE0/G;

    invoke-virtual {v4}, LE0/G;->d0()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, LE0/G;->f0()LE0/G$g;

    move-result-object v5

    sget-object v6, LE0/G$g;->InMeasureBlock:LE0/G$g;

    if-ne v5, v6, :cond_1

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static {v4, v5, v6, v5}, LE0/G;->l1(LE0/G;LY0/b;ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {v1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v5

    const/4 v9, 0x7

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, LE0/G;->w1(LE0/G;ZZZILjava/lang/Object;)V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_0

    :cond_2
    return-void
.end method

.method public static final synthetic V0(LE0/L$b;)Lp0/c;
    .locals 0

    iget-object p0, p0, LE0/L$b;->C:Lp0/c;

    return-object p0
.end method

.method public static final synthetic W0(LE0/L$b;)Lmh/l;
    .locals 0

    iget-object p0, p0, LE0/L$b;->B:Lmh/l;

    return-object p0
.end method

.method private final W1()V
    .locals 7

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LE0/G;->w1(LE0/G;ZZZILjava/lang/Object;)V

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->o0()LE0/G;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->T()LE0/G$g;

    move-result-object v1

    sget-object v2, LE0/G$g;->NotUsed:LE0/G$g;

    if-ne v1, v2, :cond_2

    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    invoke-virtual {v0}, LE0/G;->W()LE0/G$e;

    move-result-object v2

    sget-object v3, LE0/L$b$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    invoke-virtual {v0}, LE0/G;->T()LE0/G$g;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, LE0/G$g;->InLayoutBlock:LE0/G$g;

    goto :goto_0

    :cond_1
    sget-object v0, LE0/G$g;->InMeasureBlock:LE0/G$g;

    :goto_0
    invoke-virtual {v1, v0}, LE0/G;->D1(LE0/G$g;)V

    :cond_2
    return-void
.end method

.method public static final synthetic Y0(LE0/L$b;)J
    .locals 2

    iget-wide v0, p0, LE0/L$b;->D:J

    return-wide v0
.end method

.method public static final synthetic Z0(LE0/L$b;)F
    .locals 0

    iget p0, p0, LE0/L$b;->E:F

    return p0
.end method

.method private final a2(JFLmh/l;Lp0/c;)V
    .locals 7

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->L0()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "place is called on a deactivated node"

    invoke-static {v0}, LB0/a;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    sget-object v1, LE0/G$e;->LayingOut:LE0/G$e;

    invoke-static {v0, v1}, LE0/L;->l(LE0/L;LE0/G$e;)V

    iput-wide p1, p0, LE0/L$b;->m:J

    iput p3, p0, LE0/L$b;->p:F

    iput-object p4, p0, LE0/L$b;->n:Lmh/l;

    iput-object p5, p0, LE0/L$b;->o:Lp0/c;

    const/4 v0, 0x1

    iput-boolean v0, p0, LE0/L$b;->j:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, LE0/L$b;->A:Z

    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    invoke-static {v1}, LE0/K;->b(LE0/G;)LE0/m0;

    move-result-object v1

    iget-object v2, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v2}, LE0/L;->A()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p0}, LE0/L$b;->q()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v1

    move-wide v2, p1

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, LE0/c0;->e3(JFLmh/l;Lp0/c;)V

    invoke-virtual {p0}, LE0/L$b;->Z1()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LE0/L$b;->p()LE0/a;

    move-result-object v2

    invoke-virtual {v2, v0}, LE0/a;->r(Z)V

    iget-object v2, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v2, v0}, LE0/L;->Y(Z)V

    iput-object p4, p0, LE0/L$b;->B:Lmh/l;

    iput-wide p1, p0, LE0/L$b;->D:J

    iput p3, p0, LE0/L$b;->E:F

    iput-object p5, p0, LE0/L$b;->C:Lp0/c;

    invoke-interface {v1}, LE0/m0;->getSnapshotObserver()LE0/o0;

    move-result-object p1

    iget-object p2, p0, LE0/L$b;->I:LE0/L;

    invoke-static {p2}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object p2

    iget-object p3, p0, LE0/L$b;->F:Lmh/a;

    invoke-virtual {p1, p2, v0, p3}, LE0/o0;->c(LE0/G;ZLmh/a;)V

    :goto_0
    iget-object p1, p0, LE0/L$b;->I:LE0/L;

    sget-object p2, LE0/G$e;->Idle:LE0/G$e;

    invoke-static {p1, p2}, LE0/L;->l(LE0/L;LE0/G$e;)V

    return-void
.end method

.method private final b2(JFLmh/l;Lp0/c;)V
    .locals 10

    const/4 v0, 0x1

    iput-boolean v0, p0, LE0/L$b;->t:Z

    iget-wide v1, p0, LE0/L$b;->m:J

    invoke-static {p1, p2, v1, v2}, LY0/n;->g(JJ)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-boolean v1, p0, LE0/L$b;->G:Z

    if-eqz v1, :cond_3

    :cond_0
    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v1}, LE0/L;->u()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v1}, LE0/L;->v()Z

    move-result v1

    if-nez v1, :cond_1

    iget-boolean v1, p0, LE0/L$b;->G:Z

    if-eqz v1, :cond_2

    :cond_1
    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v1, v0}, LE0/L;->j(LE0/L;Z)V

    iput-boolean v2, p0, LE0/L$b;->G:Z

    :cond_2
    invoke-virtual {p0}, LE0/L$b;->S1()V

    :cond_3
    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    invoke-static {v1}, LE0/M;->a(LE0/G;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v1}, LE0/L;->K()LE0/c0;

    move-result-object v1

    invoke-virtual {v1}, LE0/c0;->I2()LE0/c0;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, LE0/P;->q1()Landroidx/compose/ui/layout/t$a;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    move-object v3, v1

    goto :goto_2

    :cond_5
    :goto_1
    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    invoke-static {v1}, LE0/K;->b(LE0/G;)LE0/m0;

    move-result-object v1

    invoke-interface {v1}, LE0/m0;->getPlacementScope()Landroidx/compose/ui/layout/t$a;

    move-result-object v1

    goto :goto_0

    :goto_2
    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v1}, LE0/L;->H()LE0/L$a;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->o0()LE0/G;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, LE0/G;->U()LE0/L;

    move-result-object v1

    invoke-static {v1, v2}, LE0/L;->o(LE0/L;I)V

    :cond_6
    const v1, 0x7fffffff

    invoke-virtual {v4, v1}, LE0/L$a;->Z1(I)V

    invoke-static {p1, p2}, LY0/n;->h(J)I

    move-result v5

    invoke-static {p1, p2}, LY0/n;->i(J)I

    move-result v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Landroidx/compose/ui/layout/t$a;->h(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    :cond_7
    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v1}, LE0/L;->H()LE0/L$a;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, LE0/L$a;->o1()Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_3

    :cond_8
    move v0, v2

    :goto_3
    if-eqz v0, :cond_9

    const-string v0, "Error: Placement happened before lookahead."

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_9
    invoke-direct/range {p0 .. p5}, LE0/L$b;->a2(JFLmh/l;Lp0/c;)V

    return-void
.end method

.method private final c1()V
    .locals 7

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->w0()LV/b;

    move-result-object v1

    invoke-virtual {v1}, LV/b;->o()I

    move-result v2

    if-lez v2, :cond_2

    invoke-virtual {v1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x0

    :cond_0
    aget-object v4, v1, v3

    check-cast v4, LE0/G;

    invoke-virtual {v4}, LE0/G;->c0()LE0/L$b;

    move-result-object v5

    iget v5, v5, LE0/L$b;->g:I

    invoke-virtual {v4}, LE0/G;->p0()I

    move-result v6

    if-eq v5, v6, :cond_1

    invoke-virtual {v0}, LE0/G;->h1()V

    invoke-virtual {v0}, LE0/G;->D0()V

    invoke-virtual {v4}, LE0/G;->p0()I

    move-result v5

    const v6, 0x7fffffff

    if-ne v5, v6, :cond_1

    invoke-virtual {v4}, LE0/G;->c0()LE0/L$b;

    move-result-object v4

    invoke-direct {v4}, LE0/L$b;->R1()V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_0

    :cond_2
    return-void
.end method

.method private final g1()V
    .locals 7

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LE0/L;->p(LE0/L;I)V

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->w0()LV/b;

    move-result-object v0

    invoke-virtual {v0}, LV/b;->o()I

    move-result v2

    if-lez v2, :cond_2

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    move v3, v1

    :cond_0
    aget-object v4, v0, v3

    check-cast v4, LE0/G;

    invoke-virtual {v4}, LE0/G;->c0()LE0/L$b;

    move-result-object v4

    iget v5, v4, LE0/L$b;->h:I

    iput v5, v4, LE0/L$b;->g:I

    const v5, 0x7fffffff

    iput v5, v4, LE0/L$b;->h:I

    iput-boolean v1, v4, LE0/L$b;->t:Z

    iget-object v5, v4, LE0/L$b;->k:LE0/G$g;

    sget-object v6, LE0/G$g;->InLayoutBlock:LE0/G$g;

    if-ne v5, v6, :cond_1

    sget-object v5, LE0/G$g;->NotUsed:LE0/G$g;

    iput-object v5, v4, LE0/L$b;->k:LE0/G$g;

    :cond_1
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_0

    :cond_2
    return-void
.end method

.method private final h2(LE0/G;)V
    .locals 4

    invoke-virtual {p1}, LE0/G;->o0()LE0/G;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v1, p0, LE0/L$b;->k:LE0/G$g;

    sget-object v2, LE0/G$g;->NotUsed:LE0/G$g;

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    invoke-virtual {p1}, LE0/G;->E()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move p1, v3

    :goto_1
    if-nez p1, :cond_2

    const-string p1, "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"

    invoke-static {p1}, LB0/a;->b(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v0}, LE0/G;->W()LE0/G$e;

    move-result-object p1

    sget-object v1, LE0/L$b$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    if-eq p1, v3, :cond_4

    const/4 v1, 0x2

    if-ne p1, v1, :cond_3

    sget-object p1, LE0/G$g;->InLayoutBlock:LE0/G$g;

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Measurable could be only measured from the parent\'s measure or layout block. Parents state is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LE0/G;->W()LE0/G$e;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    sget-object p1, LE0/G$g;->InMeasureBlock:LE0/G$g;

    :goto_2
    iput-object p1, p0, LE0/L$b;->k:LE0/G$g;

    goto :goto_3

    :cond_5
    sget-object p1, LE0/G$g;->NotUsed:LE0/G$g;

    iput-object p1, p0, LE0/L$b;->k:LE0/G$g;

    :goto_3
    return-void
.end method


# virtual methods
.method public B()LE0/c0;
    .locals 1

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->P()LE0/c0;

    move-result-object v0

    return-object v0
.end method

.method public final B1()F
    .locals 1

    iget v0, p0, LE0/L$b;->z:F

    return v0
.end method

.method public D0()I
    .locals 1

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/layout/t;->D0()I

    move-result v0

    return v0
.end method

.method public final E1(Z)V
    .locals 9

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->o0()LE0/G;

    move-result-object v0

    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->T()LE0/G$g;

    move-result-object v1

    if-eqz v0, :cond_4

    sget-object v2, LE0/G$g;->NotUsed:LE0/G$g;

    if-eq v1, v2, :cond_4

    :cond_0
    move-object v3, v0

    invoke-virtual {v3}, LE0/G;->T()LE0/G$g;

    move-result-object v0

    if-ne v0, v1, :cond_1

    invoke-virtual {v3}, LE0/G;->o0()LE0/G;

    move-result-object v0

    if-nez v0, :cond_0

    :cond_1
    sget-object v0, LE0/L$b$a;->b:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    invoke-virtual {v3, p1}, LE0/G;->t1(Z)V

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Intrinsics isn\'t used by the parent"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v4, p1

    invoke-static/range {v3 .. v8}, LE0/G;->w1(LE0/G;ZZZILjava/lang/Object;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public G0()I
    .locals 1

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/layout/t;->G0()I

    move-result v0

    return v0
.end method

.method public final J1()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LE0/L$b;->q:Z

    return-void
.end method

.method protected K0(JFLmh/l;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, LE0/L$b;->b2(JFLmh/l;Lp0/c;)V

    return-void
.end method

.method public L()LE0/b;
    .locals 1

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->o0()LE0/G;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LE0/G;->U()LE0/L;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LE0/L;->r()LE0/b;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected L0(JFLp0/c;)V
    .locals 6

    const/4 v4, 0x0

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LE0/L$b;->b2(JFLmh/l;Lp0/c;)V

    return-void
.end method

.method public final L1()Z
    .locals 1

    iget-boolean v0, p0, LE0/L$b;->t:Z

    return v0
.end method

.method public final M1()V
    .locals 2

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    const/4 v1, 0x1

    invoke-static {v0, v1}, LE0/L;->i(LE0/L;Z)V

    return-void
.end method

.method public Q(Lmh/l;)V
    .locals 4

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->w0()LV/b;

    move-result-object v0

    invoke-virtual {v0}, LV/b;->o()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    aget-object v3, v0, v2

    check-cast v3, LE0/G;

    invoke-virtual {v3}, LE0/G;->U()LE0/L;

    move-result-object v3

    invoke-virtual {v3}, LE0/L;->r()LE0/b;

    move-result-object v3

    invoke-interface {p1, v3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_1
    return-void
.end method

.method public R(I)I
    .locals 1

    invoke-direct {p0}, LE0/L$b;->W1()V

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-interface {v0, p1}, LC0/n;->R(I)I

    move-result p1

    return p1
.end method

.method public S(I)I
    .locals 1

    invoke-direct {p0}, LE0/L$b;->W1()V

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-interface {v0, p1}, LC0/n;->S(I)I

    move-result p1

    return p1
.end method

.method public final S1()V
    .locals 8

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v0}, LE0/L;->s()I

    move-result v0

    if-lez v0, :cond_3

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->w0()LV/b;

    move-result-object v0

    invoke-virtual {v0}, LV/b;->o()I

    move-result v1

    if-lez v1, :cond_3

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    move v3, v2

    :cond_0
    aget-object v4, v0, v3

    check-cast v4, LE0/G;

    invoke-virtual {v4}, LE0/G;->U()LE0/L;

    move-result-object v5

    invoke-virtual {v5}, LE0/L;->v()Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {v5}, LE0/L;->u()Z

    move-result v6

    if-eqz v6, :cond_2

    :cond_1
    invoke-virtual {v5}, LE0/L;->A()Z

    move-result v6

    if-nez v6, :cond_2

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static {v4, v2, v7, v6}, LE0/G;->u1(LE0/G;ZILjava/lang/Object;)V

    :cond_2
    invoke-virtual {v5}, LE0/L;->I()LE0/L$b;

    move-result-object v4

    invoke-virtual {v4}, LE0/L$b;->S1()V

    add-int/lit8 v3, v3, 0x1

    if-lt v3, v1, :cond_0

    :cond_3
    return-void
.end method

.method public T(J)Landroidx/compose/ui/layout/t;
    .locals 2

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->T()LE0/G$g;

    move-result-object v0

    sget-object v1, LE0/G$g;->NotUsed:LE0/G$g;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->v()V

    :cond_0
    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-static {v0}, LE0/M;->a(LE0/G;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v0}, LE0/L;->H()LE0/L$a;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, LE0/L$a;->Y1(LE0/G$g;)V

    invoke-virtual {v0, p1, p2}, LE0/L$a;->T(J)Landroidx/compose/ui/layout/t;

    :cond_1
    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-direct {p0, v0}, LE0/L$b;->h2(LE0/G;)V

    invoke-virtual {p0, p1, p2}, LE0/L$b;->c2(J)Z

    return-object p0
.end method

.method public X(LC0/a;)I
    .locals 4

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->o0()LE0/G;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LE0/G;->W()LE0/G$e;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    sget-object v2, LE0/G$e;->Measuring:LE0/G$e;

    const/4 v3, 0x1

    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, LE0/L$b;->p()LE0/a;

    move-result-object v0

    invoke-virtual {v0, v3}, LE0/a;->u(Z)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->o0()LE0/G;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LE0/G;->W()LE0/G$e;

    move-result-object v1

    :cond_2
    sget-object v0, LE0/G$e;->LayingOut:LE0/G$e;

    if-ne v1, v0, :cond_3

    invoke-virtual {p0}, LE0/L$b;->p()LE0/a;

    move-result-object v0

    invoke-virtual {v0, v3}, LE0/a;->t(Z)V

    :cond_3
    :goto_1
    iput-boolean v3, p0, LE0/L$b;->l:Z

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0, p1}, LE0/P;->X(LC0/a;)I

    move-result p1

    const/4 v0, 0x0

    iput-boolean v0, p0, LE0/L$b;->l:Z

    return p1
.end method

.method public final Y1()V
    .locals 1

    const v0, 0x7fffffff

    iput v0, p0, LE0/L$b;->h:I

    iput v0, p0, LE0/L$b;->g:I

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LE0/L$b;->g2(Z)V

    return-void
.end method

.method public final Z1()V
    .locals 6

    const/4 v0, 0x1

    iput-boolean v0, p0, LE0/L$b;->A:Z

    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->o0()LE0/G;

    move-result-object v1

    invoke-virtual {p0}, LE0/L$b;->B()LE0/c0;

    move-result-object v2

    invoke-virtual {v2}, LE0/c0;->J2()F

    move-result v2

    iget-object v3, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v3}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v3

    invoke-virtual {v3}, LE0/G;->m0()LE0/c0;

    move-result-object v4

    invoke-virtual {v3}, LE0/G;->P()LE0/c0;

    move-result-object v3

    :goto_0
    if-eq v4, v3, :cond_0

    const-string v5, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, LE0/C;

    invoke-virtual {v4}, LE0/c0;->J2()F

    move-result v5

    add-float/2addr v2, v5

    invoke-virtual {v4}, LE0/c0;->H2()LE0/c0;

    move-result-object v4

    goto :goto_0

    :cond_0
    iget v3, p0, LE0/L$b;->z:F

    cmpg-float v3, v2, v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    iput v2, p0, LE0/L$b;->z:F

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LE0/G;->h1()V

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, LE0/G;->D0()V

    :cond_3
    :goto_1
    invoke-virtual {p0}, LE0/L$b;->q()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_5

    if-eqz v1, :cond_4

    invoke-virtual {v1}, LE0/G;->D0()V

    :cond_4
    invoke-direct {p0}, LE0/L$b;->O1()V

    iget-boolean v2, p0, LE0/L$b;->f:Z

    if-eqz v2, :cond_5

    if-eqz v1, :cond_5

    const/4 v2, 0x0

    invoke-static {v1, v3, v0, v2}, LE0/G;->u1(LE0/G;ZILjava/lang/Object;)V

    :cond_5
    if-eqz v1, :cond_8

    iget-boolean v2, p0, LE0/L$b;->f:Z

    if-nez v2, :cond_9

    invoke-virtual {v1}, LE0/G;->W()LE0/G$e;

    move-result-object v2

    sget-object v4, LE0/G$e;->LayingOut:LE0/G$e;

    if-ne v2, v4, :cond_9

    iget v2, p0, LE0/L$b;->h:I

    const v4, 0x7fffffff

    if-ne v2, v4, :cond_6

    move v3, v0

    :cond_6
    if-nez v3, :cond_7

    const-string v2, "Place was called on a node which was placed already"

    invoke-static {v2}, LB0/a;->b(Ljava/lang/String;)V

    :cond_7
    invoke-virtual {v1}, LE0/G;->U()LE0/L;

    move-result-object v2

    invoke-static {v2}, LE0/L;->e(LE0/L;)I

    move-result v2

    iput v2, p0, LE0/L$b;->h:I

    invoke-virtual {v1}, LE0/G;->U()LE0/L;

    move-result-object v1

    invoke-static {v1}, LE0/L;->e(LE0/L;)I

    move-result v2

    add-int/2addr v2, v0

    invoke-static {v1, v2}, LE0/L;->p(LE0/L;I)V

    goto :goto_2

    :cond_8
    iput v3, p0, LE0/L$b;->h:I

    :cond_9
    :goto_2
    invoke-virtual {p0}, LE0/L$b;->g0()V

    return-void
.end method

.method public b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LE0/L$b;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public final c2(J)Z
    .locals 6

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->L0()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "measure is called on a deactivated node"

    invoke-static {v0}, LB0/a;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-static {v0}, LE0/K;->b(LE0/G;)LE0/m0;

    move-result-object v0

    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->o0()LE0/G;

    move-result-object v1

    iget-object v2, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v2}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v2

    iget-object v3, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v3}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v3

    invoke-virtual {v3}, LE0/G;->E()Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_2

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LE0/G;->E()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v1, v5

    goto :goto_1

    :cond_2
    :goto_0
    move v1, v4

    :goto_1
    invoke-virtual {v2, v1}, LE0/G;->A1(Z)V

    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->d0()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->H0()J

    move-result-wide v1

    invoke-static {v1, v2, p1, p2}, LY0/b;->f(JJ)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    iget-object p1, p0, LE0/L$b;->I:LE0/L;

    invoke-static {p1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object p1

    const/4 p2, 0x2

    const/4 v1, 0x0

    invoke-static {v0, p1, v5, p2, v1}, LE0/m0;->m(LE0/m0;LE0/G;ZILjava/lang/Object;)V

    iget-object p1, p0, LE0/L$b;->I:LE0/L;

    invoke-static {p1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object p1

    invoke-virtual {p1}, LE0/G;->z1()V

    return v5

    :cond_4
    :goto_2
    invoke-virtual {p0}, LE0/L$b;->p()LE0/a;

    move-result-object v0

    invoke-virtual {v0, v5}, LE0/a;->s(Z)V

    sget-object v0, LE0/L$b$d;->a:LE0/L$b$d;

    invoke-virtual {p0, v0}, LE0/L$b;->Q(Lmh/l;)V

    iput-boolean v4, p0, LE0/L$b;->i:Z

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->h()J

    move-result-wide v0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/t;->S0(J)V

    iget-object v2, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v2, p1, p2}, LE0/L;->h(LE0/L;J)V

    iget-object p1, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {p1}, LE0/L;->K()LE0/c0;

    move-result-object p1

    invoke-virtual {p1}, LE0/c0;->h()J

    move-result-wide p1

    invoke-static {p1, p2, v0, v1}, LY0/r;->e(JJ)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {p1}, LE0/L;->K()LE0/c0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/ui/layout/t;->I0()I

    move-result p1

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->I0()I

    move-result p2

    if-ne p1, p2, :cond_6

    iget-object p1, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {p1}, LE0/L;->K()LE0/c0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/ui/layout/t;->C0()I

    move-result p1

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->C0()I

    move-result p2

    if-eq p1, p2, :cond_5

    goto :goto_3

    :cond_5
    move v4, v5

    :cond_6
    :goto_3
    iget-object p1, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {p1}, LE0/L;->K()LE0/c0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/ui/layout/t;->I0()I

    move-result p1

    iget-object p2, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {p2}, LE0/L;->K()LE0/c0;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result p2

    invoke-static {p1, p2}, LY0/s;->a(II)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/t;->Q0(J)V

    return v4
.end method

.method public final d2()V
    .locals 9

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v0, p0, LE0/L$b;->f:Z

    iget-boolean v2, p0, LE0/L$b;->j:Z

    if-nez v2, :cond_0

    const-string v2, "replace called on unplaced item"

    invoke-static {v2}, LB0/a;->b(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p0}, LE0/L$b;->q()Z

    move-result v2

    iget-wide v4, p0, LE0/L$b;->m:J

    iget v6, p0, LE0/L$b;->p:F

    iget-object v7, p0, LE0/L$b;->n:Lmh/l;

    iget-object v8, p0, LE0/L$b;->o:Lp0/c;

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, LE0/L$b;->a2(JFLmh/l;Lp0/c;)V

    if-eqz v2, :cond_1

    iget-boolean v2, p0, LE0/L$b;->A:Z

    if-nez v2, :cond_1

    iget-object v2, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v2}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v2

    invoke-virtual {v2}, LE0/G;->o0()LE0/G;

    move-result-object v2

    if-eqz v2, :cond_1

    const/4 v3, 0x0

    invoke-static {v2, v1, v0, v3}, LE0/G;->u1(LE0/G;ZILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    iput-boolean v1, p0, LE0/L$b;->f:Z

    return-void

    :goto_1
    iput-boolean v1, p0, LE0/L$b;->f:Z

    throw v0
.end method

.method public final e2(Z)V
    .locals 0

    iput-boolean p1, p0, LE0/L$b;->w:Z

    return-void
.end method

.method public final f2(LE0/G$g;)V
    .locals 0

    iput-object p1, p0, LE0/L$b;->k:LE0/G$g;

    return-void
.end method

.method public g0()V
    .locals 6

    const/4 v0, 0x1

    iput-boolean v0, p0, LE0/L$b;->x:Z

    invoke-virtual {p0}, LE0/L$b;->p()LE0/a;

    move-result-object v1

    invoke-virtual {v1}, LE0/a;->o()V

    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v1}, LE0/L;->A()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, LE0/L$b;->U1()V

    :cond_0
    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v1}, LE0/L;->b(LE0/L;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    iget-boolean v1, p0, LE0/L$b;->l:Z

    if-nez v1, :cond_3

    invoke-virtual {p0}, LE0/L$b;->B()LE0/c0;

    move-result-object v1

    invoke-virtual {v1}, LE0/P;->L1()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v1}, LE0/L;->A()Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_1
    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v1, v2}, LE0/L;->j(LE0/L;Z)V

    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v1}, LE0/L;->B()LE0/G$e;

    move-result-object v1

    iget-object v3, p0, LE0/L$b;->I:LE0/L;

    sget-object v4, LE0/G$e;->LayingOut:LE0/G$e;

    invoke-static {v3, v4}, LE0/L;->l(LE0/L;LE0/G$e;)V

    iget-object v3, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v3, v2}, LE0/L;->Z(Z)V

    iget-object v3, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v3}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v3

    invoke-static {v3}, LE0/K;->b(LE0/G;)LE0/m0;

    move-result-object v4

    invoke-interface {v4}, LE0/m0;->getSnapshotObserver()LE0/o0;

    move-result-object v4

    iget-object v5, p0, LE0/L$b;->y:Lmh/a;

    invoke-virtual {v4, v3, v2, v5}, LE0/o0;->e(LE0/G;ZLmh/a;)V

    iget-object v3, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v3, v1}, LE0/L;->l(LE0/L;LE0/G$e;)V

    invoke-virtual {p0}, LE0/L$b;->B()LE0/c0;

    move-result-object v1

    invoke-virtual {v1}, LE0/P;->L1()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v1}, LE0/L;->v()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, LE0/L$b;->requestLayout()V

    :cond_2
    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v1, v2}, LE0/L;->k(LE0/L;Z)V

    :cond_3
    invoke-virtual {p0}, LE0/L$b;->p()LE0/a;

    move-result-object v1

    invoke-virtual {v1}, LE0/a;->l()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, LE0/L$b;->p()LE0/a;

    move-result-object v1

    invoke-virtual {v1, v0}, LE0/a;->q(Z)V

    :cond_4
    invoke-virtual {p0}, LE0/L$b;->p()LE0/a;

    move-result-object v0

    invoke-virtual {v0}, LE0/a;->g()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, LE0/L$b;->p()LE0/a;

    move-result-object v0

    invoke-virtual {v0}, LE0/a;->k()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, LE0/L$b;->p()LE0/a;

    move-result-object v0

    invoke-virtual {v0}, LE0/a;->n()V

    :cond_5
    iput-boolean v2, p0, LE0/L$b;->x:Z

    return-void
.end method

.method public g2(Z)V
    .locals 0

    iput-boolean p1, p0, LE0/L$b;->s:Z

    return-void
.end method

.method public final h1()Ljava/util/List;
    .locals 8

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->L1()V

    iget-boolean v0, p0, LE0/L$b;->w:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LE0/L$b;->v:LV/b;

    invoke-virtual {v0}, LV/b;->g()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    iget-object v1, p0, LE0/L$b;->v:LV/b;

    invoke-virtual {v0}, LE0/G;->w0()LV/b;

    move-result-object v2

    invoke-virtual {v2}, LV/b;->o()I

    move-result v3

    const/4 v4, 0x0

    if-lez v3, :cond_3

    invoke-virtual {v2}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v2

    move v5, v4

    :cond_1
    aget-object v6, v2, v5

    check-cast v6, LE0/G;

    invoke-virtual {v1}, LV/b;->o()I

    move-result v7

    if-gt v7, v5, :cond_2

    invoke-virtual {v6}, LE0/G;->U()LE0/L;

    move-result-object v6

    invoke-virtual {v6}, LE0/L;->I()LE0/L$b;

    move-result-object v6

    invoke-virtual {v1, v6}, LV/b;->b(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v6}, LE0/G;->U()LE0/L;

    move-result-object v6

    invoke-virtual {v6}, LE0/L;->I()LE0/L$b;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, LV/b;->C(ILjava/lang/Object;)Ljava/lang/Object;

    :goto_0
    add-int/lit8 v5, v5, 0x1

    if-lt v5, v3, :cond_1

    :cond_3
    invoke-virtual {v0}, LE0/G;->H()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v1}, LV/b;->o()I

    move-result v2

    invoke-virtual {v1, v0, v2}, LV/b;->A(II)V

    iput-boolean v4, p0, LE0/L$b;->w:Z

    iget-object v0, p0, LE0/L$b;->v:LV/b;

    invoke-virtual {v0}, LV/b;->g()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final i2()Z
    .locals 2

    invoke-virtual {p0}, LE0/L$b;->b()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->b()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, LE0/L$b;->q:Z

    if-nez v0, :cond_1

    return v1

    :cond_1
    iput-boolean v1, p0, LE0/L$b;->q:Z

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->b()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LE0/L$b;->r:Ljava/lang/Object;

    const/4 v0, 0x1

    return v0
.end method

.method public k0(Z)V
    .locals 2

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/P;->J1()Z

    move-result v0

    if-eq p1, v0, :cond_0

    iget-object v1, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v1}, LE0/L;->K()LE0/c0;

    move-result-object v1

    invoke-virtual {v1, v0}, LE0/P;->k0(Z)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LE0/L$b;->G:Z

    :cond_0
    iput-boolean p1, p0, LE0/L$b;->H:Z

    return-void
.end method

.method public final o1()LY0/b;
    .locals 2

    iget-boolean v0, p0, LE0/L$b;->i:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->H0()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/b;->a(J)LY0/b;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public p()LE0/a;
    .locals 1

    iget-object v0, p0, LE0/L$b;->u:LE0/a;

    return-object v0
.end method

.method public q()Z
    .locals 1

    iget-boolean v0, p0, LE0/L$b;->s:Z

    return v0
.end method

.method public final q1()Z
    .locals 1

    iget-boolean v0, p0, LE0/L$b;->x:Z

    return v0
.end method

.method public r0()V
    .locals 7

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LE0/G;->w1(LE0/G;ZZZILjava/lang/Object;)V

    return-void
.end method

.method public final r1()LE0/G$g;
    .locals 1

    iget-object v0, p0, LE0/L$b;->k:LE0/G$g;

    return-object v0
.end method

.method public requestLayout()V
    .locals 4

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, LE0/G;->u1(LE0/G;ZILjava/lang/Object;)V

    return-void
.end method

.method public s(I)I
    .locals 1

    invoke-direct {p0}, LE0/L$b;->W1()V

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-interface {v0, p1}, LC0/n;->s(I)I

    move-result p1

    return p1
.end method

.method public s0(I)I
    .locals 1

    invoke-direct {p0}, LE0/L$b;->W1()V

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-interface {v0, p1}, LC0/n;->s0(I)I

    move-result p1

    return p1
.end method

.method public v()Ljava/util/Map;
    .locals 3

    iget-boolean v0, p0, LE0/L$b;->l:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v0}, LE0/L;->B()LE0/G$e;

    move-result-object v0

    sget-object v2, LE0/G$e;->Measuring:LE0/G$e;

    if-ne v0, v2, :cond_0

    invoke-virtual {p0}, LE0/L$b;->p()LE0/a;

    move-result-object v0

    invoke-virtual {v0, v1}, LE0/a;->s(Z)V

    invoke-virtual {p0}, LE0/L$b;->p()LE0/a;

    move-result-object v0

    invoke-virtual {v0}, LE0/a;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LE0/L$b;->I:LE0/L;

    invoke-virtual {v0}, LE0/L;->O()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LE0/L$b;->p()LE0/a;

    move-result-object v0

    invoke-virtual {v0, v1}, LE0/a;->r(Z)V

    :cond_1
    :goto_0
    invoke-virtual {p0}, LE0/L$b;->B()LE0/c0;

    move-result-object v0

    invoke-virtual {v0, v1}, LE0/P;->S1(Z)V

    invoke-virtual {p0}, LE0/L$b;->g0()V

    invoke-virtual {p0}, LE0/L$b;->B()LE0/c0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LE0/P;->S1(Z)V

    invoke-virtual {p0}, LE0/L$b;->p()LE0/a;

    move-result-object v0

    invoke-virtual {v0}, LE0/a;->h()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final z1()I
    .locals 1

    iget v0, p0, LE0/L$b;->h:I

    return v0
.end method
