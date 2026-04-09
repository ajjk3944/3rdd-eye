.class public final LE0/L$a;
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
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE0/L$a$a;
    }
.end annotation


# instance fields
.field final synthetic A:LE0/L;

.field private f:Z

.field private g:I

.field private h:I

.field private i:LE0/G$g;

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:LY0/b;

.field private n:J

.field private o:F

.field private p:Lmh/l;

.field private q:Lp0/c;

.field private r:Z

.field private final s:LE0/a;

.field private final t:LV/b;

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Ljava/lang/Object;

.field private y:Z

.field private z:Z


# direct methods
.method public constructor <init>(LE0/L;)V
    .locals 2

    iput-object p1, p0, LE0/L$a;->A:LE0/L;

    invoke-direct {p0}, Landroidx/compose/ui/layout/t;-><init>()V

    const p1, 0x7fffffff

    iput p1, p0, LE0/L$a;->g:I

    iput p1, p0, LE0/L$a;->h:I

    sget-object p1, LE0/G$g;->NotUsed:LE0/G$g;

    iput-object p1, p0, LE0/L$a;->i:LE0/G$g;

    sget-object p1, LY0/n;->b:LY0/n$a;

    invoke-virtual {p1}, LY0/n$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, LE0/L$a;->n:J

    new-instance p1, LE0/O;

    invoke-direct {p1, p0}, LE0/O;-><init>(LE0/b;)V

    iput-object p1, p0, LE0/L$a;->s:LE0/a;

    new-instance p1, LV/b;

    const/16 v0, 0x10

    new-array v0, v0, [LE0/L$a;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, LV/b;-><init>([Ljava/lang/Object;I)V

    iput-object p1, p0, LE0/L$a;->t:LV/b;

    const/4 p1, 0x1

    iput-boolean p1, p0, LE0/L$a;->u:Z

    iput-boolean p1, p0, LE0/L$a;->w:Z

    invoke-virtual {p0}, LE0/L$a;->g1()LE0/L$b;

    move-result-object p1

    invoke-virtual {p1}, LE0/L$b;->b()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LE0/L$a;->x:Ljava/lang/Object;

    return-void
.end method

.method private final B1()V
    .locals 4

    invoke-virtual {p0}, LE0/L$a;->q()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LE0/L$a;->a2(Z)V

    iget-object v1, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->w0()LV/b;

    move-result-object v1

    invoke-virtual {v1}, LV/b;->o()I

    move-result v2

    if-lez v2, :cond_1

    invoke-virtual {v1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v1

    :cond_0
    aget-object v3, v1, v0

    check-cast v3, LE0/G;

    invoke-virtual {v3}, LE0/G;->U()LE0/L;

    move-result-object v3

    invoke-virtual {v3}, LE0/L;->H()LE0/L$a;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v3}, LE0/L$a;->B1()V

    add-int/lit8 v0, v0, 0x1

    if-lt v0, v2, :cond_0

    :cond_1
    return-void
.end method

.method private final J1()V
    .locals 11

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    iget-object v1, p0, LE0/L$a;->A:LE0/L;

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

    invoke-virtual {v4}, LE0/G;->Y()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, LE0/G;->g0()LE0/G$g;

    move-result-object v5

    sget-object v6, LE0/G$g;->InMeasureBlock:LE0/G$g;

    if-ne v5, v6, :cond_1

    invoke-virtual {v4}, LE0/G;->U()LE0/L;

    move-result-object v5

    invoke-virtual {v5}, LE0/L;->H()LE0/L$a;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v4}, LE0/G;->U()LE0/L;

    move-result-object v4

    invoke-virtual {v4}, LE0/L;->z()LY0/b;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v4}, LY0/b;->r()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, LE0/L$a;->S1(J)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {v1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v5

    const/4 v9, 0x7

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, LE0/G;->s1(LE0/G;ZZZILjava/lang/Object;)V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_0

    :cond_2
    return-void
.end method

.method private final L1()V
    .locals 7

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LE0/G;->s1(LE0/G;ZZZILjava/lang/Object;)V

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->o0()LE0/G;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->T()LE0/G$g;

    move-result-object v1

    sget-object v2, LE0/G$g;->NotUsed:LE0/G$g;

    if-ne v1, v2, :cond_2

    iget-object v1, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    invoke-virtual {v0}, LE0/G;->W()LE0/G$e;

    move-result-object v2

    sget-object v3, LE0/L$a$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    const/4 v3, 0x3

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

.method private final R1(JFLmh/l;Lp0/c;)V
    .locals 9

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->L0()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "place is called on a deactivated node"

    invoke-static {v0}, LB0/a;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    sget-object v1, LE0/G$e;->LookaheadLayingOut:LE0/G$e;

    invoke-static {v0, v1}, LE0/L;->l(LE0/L;LE0/G$e;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LE0/L$a;->k:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, LE0/L$a;->z:Z

    iget-wide v2, p0, LE0/L$a;->n:J

    invoke-static {p1, p2, v2, v3}, LY0/n;->g(JJ)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v2}, LE0/L;->D()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v2}, LE0/L;->E()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    iget-object v2, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v2, v0}, LE0/L;->m(LE0/L;Z)V

    :cond_2
    invoke-virtual {p0}, LE0/L$a;->E1()V

    :cond_3
    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-static {v0}, LE0/K;->b(LE0/G;)LE0/m0;

    move-result-object v0

    iget-object v2, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v2}, LE0/L;->F()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {p0}, LE0/L$a;->q()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p2}, LE0/Q;->i2(J)V

    invoke-virtual {p0}, LE0/L$a;->O1()V

    goto :goto_0

    :cond_4
    iget-object v2, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v2, v1}, LE0/L;->a0(Z)V

    invoke-virtual {p0}, LE0/L$a;->p()LE0/a;

    move-result-object v2

    invoke-virtual {v2, v1}, LE0/a;->r(Z)V

    invoke-interface {v0}, LE0/m0;->getSnapshotObserver()LE0/o0;

    move-result-object v3

    iget-object v1, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v4

    new-instance v6, LE0/L$a$c;

    iget-object v1, p0, LE0/L$a;->A:LE0/L;

    invoke-direct {v6, v1, v0, p1, p2}, LE0/L$a$c;-><init>(LE0/L;LE0/m0;J)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LE0/o0;->d(LE0/o0;LE0/G;ZLmh/a;ILjava/lang/Object;)V

    :goto_0
    iput-wide p1, p0, LE0/L$a;->n:J

    iput p3, p0, LE0/L$a;->o:F

    iput-object p4, p0, LE0/L$a;->p:Lmh/l;

    iput-object p5, p0, LE0/L$a;->q:Lp0/c;

    iget-object p1, p0, LE0/L$a;->A:LE0/L;

    sget-object p2, LE0/G$e;->Idle:LE0/G$e;

    invoke-static {p1, p2}, LE0/L;->l(LE0/L;LE0/G$e;)V

    return-void
.end method

.method public static final synthetic T0(LE0/L$a;)V
    .locals 0

    invoke-direct {p0}, LE0/L$a;->V0()V

    return-void
.end method

.method public static final synthetic U0(LE0/L$a;)V
    .locals 0

    invoke-direct {p0}, LE0/L$a;->W0()V

    return-void
.end method

.method private final V0()V
    .locals 6

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->w0()LV/b;

    move-result-object v0

    invoke-virtual {v0}, LV/b;->o()I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    aget-object v3, v0, v2

    check-cast v3, LE0/G;

    invoke-virtual {v3}, LE0/G;->U()LE0/L;

    move-result-object v3

    invoke-virtual {v3}, LE0/L;->H()LE0/L$a;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget v4, v3, LE0/L$a;->g:I

    iget v5, v3, LE0/L$a;->h:I

    if-eq v4, v5, :cond_1

    const v4, 0x7fffffff

    if-ne v5, v4, :cond_1

    invoke-direct {v3}, LE0/L$a;->B1()V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_2
    return-void
.end method

.method private final W0()V
    .locals 6

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LE0/L;->o(LE0/L;I)V

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->w0()LV/b;

    move-result-object v0

    invoke-virtual {v0}, LV/b;->o()I

    move-result v2

    if-lez v2, :cond_2

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    :cond_0
    aget-object v3, v0, v1

    check-cast v3, LE0/G;

    invoke-virtual {v3}, LE0/G;->U()LE0/L;

    move-result-object v3

    invoke-virtual {v3}, LE0/L;->H()LE0/L$a;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget v4, v3, LE0/L$a;->h:I

    iput v4, v3, LE0/L$a;->g:I

    const v4, 0x7fffffff

    iput v4, v3, LE0/L$a;->h:I

    iget-object v4, v3, LE0/L$a;->i:LE0/G$g;

    sget-object v5, LE0/G$g;->InLayoutBlock:LE0/G$g;

    if-ne v4, v5, :cond_1

    sget-object v4, LE0/G$g;->NotUsed:LE0/G$g;

    iput-object v4, v3, LE0/L$a;->i:LE0/G$g;

    :cond_1
    add-int/lit8 v1, v1, 0x1

    if-lt v1, v2, :cond_0

    :cond_2
    return-void
.end method

.method private final b2(LE0/G;)V
    .locals 4

    invoke-virtual {p1}, LE0/G;->o0()LE0/G;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v1, p0, LE0/L$a;->i:LE0/G$g;

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

    sget-object v1, LE0/L$a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    if-eq p1, v3, :cond_5

    const/4 v1, 0x2

    if-eq p1, v1, :cond_5

    const/4 v1, 0x3

    if-eq p1, v1, :cond_4

    const/4 v1, 0x4

    if-ne p1, v1, :cond_3

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
    :goto_2
    sget-object p1, LE0/G$g;->InLayoutBlock:LE0/G$g;

    goto :goto_3

    :cond_5
    sget-object p1, LE0/G$g;->InMeasureBlock:LE0/G$g;

    :goto_3
    iput-object p1, p0, LE0/L$a;->i:LE0/G$g;

    goto :goto_4

    :cond_6
    sget-object p1, LE0/G$g;->NotUsed:LE0/G$g;

    iput-object p1, p0, LE0/L$a;->i:LE0/G$g;

    :goto_4
    return-void
.end method

.method private final z1()V
    .locals 7

    invoke-virtual {p0}, LE0/L$a;->q()Z

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, LE0/L$a;->a2(Z)V

    if-nez v0, :cond_0

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v0}, LE0/L;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LE0/G;->s1(LE0/G;ZZZILjava/lang/Object;)V

    :cond_0
    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->w0()LV/b;

    move-result-object v0

    invoke-virtual {v0}, LV/b;->o()I

    move-result v1

    if-lez v1, :cond_4

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_1
    aget-object v3, v0, v2

    check-cast v3, LE0/G;

    invoke-virtual {v3}, LE0/G;->Z()LE0/L$a;

    move-result-object v4

    if-eqz v4, :cond_3

    iget v5, v4, LE0/L$a;->h:I

    const v6, 0x7fffffff

    if-eq v5, v6, :cond_2

    invoke-direct {v4}, LE0/L$a;->z1()V

    invoke-virtual {v3, v3}, LE0/G;->x1(LE0/G;)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_1

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Error: Child node\'s lookahead pass delegate cannot be null when in a lookahead scope."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public B()LE0/c0;
    .locals 1

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->P()LE0/c0;

    move-result-object v0

    return-object v0
.end method

.method public D0()I
    .locals 1

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroidx/compose/ui/layout/t;->D0()I

    move-result v0

    return v0
.end method

.method public final E1()V
    .locals 8

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v0}, LE0/L;->t()I

    move-result v0

    if-lez v0, :cond_4

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->w0()LV/b;

    move-result-object v0

    invoke-virtual {v0}, LV/b;->o()I

    move-result v1

    if-lez v1, :cond_4

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    move v3, v2

    :cond_0
    aget-object v4, v0, v3

    check-cast v4, LE0/G;

    invoke-virtual {v4}, LE0/G;->U()LE0/L;

    move-result-object v5

    invoke-virtual {v5}, LE0/L;->E()Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {v5}, LE0/L;->D()Z

    move-result v6

    if-eqz v6, :cond_2

    :cond_1
    invoke-virtual {v5}, LE0/L;->F()Z

    move-result v6

    if-nez v6, :cond_2

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static {v4, v2, v7, v6}, LE0/G;->q1(LE0/G;ZILjava/lang/Object;)V

    :cond_2
    invoke-virtual {v5}, LE0/L;->H()LE0/L$a;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, LE0/L$a;->E1()V

    :cond_3
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v1, :cond_0

    :cond_4
    return-void
.end method

.method public G0()I
    .locals 1

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroidx/compose/ui/layout/t;->G0()I

    move-result v0

    return v0
.end method

.method protected K0(JFLmh/l;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, LE0/L$a;->R1(JFLmh/l;Lp0/c;)V

    return-void
.end method

.method public L()LE0/b;
    .locals 1

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->o0()LE0/G;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LE0/G;->U()LE0/L;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LE0/L;->C()LE0/b;

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

    invoke-direct/range {v0 .. v5}, LE0/L$a;->R1(JFLmh/l;Lp0/c;)V

    return-void
.end method

.method public final M1()V
    .locals 1

    const v0, 0x7fffffff

    iput v0, p0, LE0/L$a;->h:I

    iput v0, p0, LE0/L$a;->g:I

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LE0/L$a;->a2(Z)V

    return-void
.end method

.method public final O1()V
    .locals 5

    const/4 v0, 0x1

    iput-boolean v0, p0, LE0/L$a;->z:Z

    iget-object v1, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->o0()LE0/G;

    move-result-object v1

    invoke-virtual {p0}, LE0/L$a;->q()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    invoke-direct {p0}, LE0/L$a;->z1()V

    iget-boolean v2, p0, LE0/L$a;->f:Z

    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    invoke-static {v1, v3, v0, v2}, LE0/G;->q1(LE0/G;ZILjava/lang/Object;)V

    :cond_0
    if-eqz v1, :cond_4

    iget-boolean v2, p0, LE0/L$a;->f:Z

    if-nez v2, :cond_5

    invoke-virtual {v1}, LE0/G;->W()LE0/G$e;

    move-result-object v2

    sget-object v4, LE0/G$e;->LayingOut:LE0/G$e;

    if-eq v2, v4, :cond_1

    invoke-virtual {v1}, LE0/G;->W()LE0/G$e;

    move-result-object v2

    sget-object v4, LE0/G$e;->LookaheadLayingOut:LE0/G$e;

    if-ne v2, v4, :cond_5

    :cond_1
    iget v2, p0, LE0/L$a;->h:I

    const v4, 0x7fffffff

    if-ne v2, v4, :cond_2

    move v3, v0

    :cond_2
    if-nez v3, :cond_3

    const-string v2, "Place was called on a node which was placed already"

    invoke-static {v2}, LB0/a;->b(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v1}, LE0/G;->U()LE0/L;

    move-result-object v2

    invoke-static {v2}, LE0/L;->d(LE0/L;)I

    move-result v2

    iput v2, p0, LE0/L$a;->h:I

    invoke-virtual {v1}, LE0/G;->U()LE0/L;

    move-result-object v1

    invoke-static {v1}, LE0/L;->d(LE0/L;)I

    move-result v2

    add-int/2addr v2, v0

    invoke-static {v1, v2}, LE0/L;->o(LE0/L;I)V

    goto :goto_0

    :cond_4
    iput v3, p0, LE0/L$a;->h:I

    :cond_5
    :goto_0
    invoke-virtual {p0}, LE0/L$a;->g0()V

    return-void
.end method

.method public Q(Lmh/l;)V
    .locals 4

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

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

    invoke-virtual {v3}, LE0/L;->C()LE0/b;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {p1, v3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_1
    return-void
.end method

.method public R(I)I
    .locals 1

    invoke-direct {p0}, LE0/L$a;->L1()V

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, LE0/Q;->R(I)I

    move-result p1

    return p1
.end method

.method public S(I)I
    .locals 1

    invoke-direct {p0}, LE0/L$a;->L1()V

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, LE0/Q;->S(I)I

    move-result p1

    return p1
.end method

.method public final S1(J)Z
    .locals 6

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->L0()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "measure is called on a deactivated node"

    invoke-static {v0}, LB0/a;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->o0()LE0/G;

    move-result-object v0

    iget-object v1, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    iget-object v2, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v2}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v2

    invoke-virtual {v2}, LE0/G;->E()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_2

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LE0/G;->E()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    move v0, v4

    goto :goto_1

    :cond_2
    :goto_0
    move v0, v3

    :goto_1
    invoke-virtual {v1, v0}, LE0/G;->A1(Z)V

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->Y()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, LE0/L$a;->m:LY0/b;

    if-nez v0, :cond_3

    move v0, v4

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, LY0/b;->r()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, LY0/b;->f(JJ)Z

    move-result v0

    :goto_2
    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    iget-object p1, p0, LE0/L$a;->A:LE0/L;

    invoke-static {p1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object p1

    invoke-virtual {p1}, LE0/G;->n0()LE0/m0;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object p2, p0, LE0/L$a;->A:LE0/L;

    invoke-static {p2}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object p2

    invoke-interface {p1, p2, v3}, LE0/m0;->s(LE0/G;Z)V

    :cond_5
    iget-object p1, p0, LE0/L$a;->A:LE0/L;

    invoke-static {p1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object p1

    invoke-virtual {p1}, LE0/G;->z1()V

    return v4

    :cond_6
    :goto_3
    invoke-static {p1, p2}, LY0/b;->a(J)LY0/b;

    move-result-object v0

    iput-object v0, p0, LE0/L$a;->m:LY0/b;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/t;->S0(J)V

    invoke-virtual {p0}, LE0/L$a;->p()LE0/a;

    move-result-object v0

    invoke-virtual {v0, v4}, LE0/a;->s(Z)V

    sget-object v0, LE0/L$a$d;->a:LE0/L$a$d;

    invoke-virtual {p0, v0}, LE0/L$a;->Q(Lmh/l;)V

    iget-boolean v0, p0, LE0/L$a;->l:Z

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->E0()J

    move-result-wide v0

    goto :goto_4

    :cond_7
    const/high16 v0, -0x80000000

    invoke-static {v0, v0}, LY0/s;->a(II)J

    move-result-wide v0

    :goto_4
    iput-boolean v3, p0, LE0/L$a;->l:Z

    iget-object v2, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v2}, LE0/L;->K()LE0/c0;

    move-result-object v2

    invoke-virtual {v2}, LE0/c0;->C2()LE0/Q;

    move-result-object v2

    if-eqz v2, :cond_8

    move v5, v3

    goto :goto_5

    :cond_8
    move v5, v4

    :goto_5
    if-nez v5, :cond_9

    const-string v5, "Lookahead result from lookaheadRemeasure cannot be null"

    invoke-static {v5}, LB0/a;->b(Ljava/lang/String;)V

    :cond_9
    iget-object v5, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v5, p1, p2}, LE0/L;->g(LE0/L;J)V

    invoke-virtual {v2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result p1

    invoke-virtual {v2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result p2

    invoke-static {p1, p2}, LY0/s;->a(II)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/t;->Q0(J)V

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result p1

    invoke-virtual {v2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result p2

    if-ne p1, p2, :cond_b

    invoke-static {v0, v1}, LY0/r;->f(J)I

    move-result p1

    invoke-virtual {v2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result p2

    if-eq p1, p2, :cond_a

    goto :goto_6

    :cond_a
    move v3, v4

    :cond_b
    :goto_6
    return v3
.end method

.method public T(J)Landroidx/compose/ui/layout/t;
    .locals 3

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

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
    sget-object v2, LE0/G$e;->LookaheadMeasuring:LE0/G$e;

    if-eq v0, v2, :cond_2

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->o0()LE0/G;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LE0/G;->W()LE0/G$e;

    move-result-object v1

    :cond_1
    sget-object v0, LE0/G$e;->LookaheadLayingOut:LE0/G$e;

    if-ne v1, v0, :cond_3

    :cond_2
    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LE0/L;->i(LE0/L;Z)V

    :cond_3
    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-direct {p0, v0}, LE0/L$a;->b2(LE0/G;)V

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->T()LE0/G$g;

    move-result-object v0

    sget-object v1, LE0/G$g;->NotUsed:LE0/G$g;

    if-ne v0, v1, :cond_4

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->v()V

    :cond_4
    invoke-virtual {p0, p1, p2}, LE0/L$a;->S1(J)Z

    return-object p0
.end method

.method public final U1()V
    .locals 9

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v0, p0, LE0/L$a;->f:Z

    iget-boolean v2, p0, LE0/L$a;->k:Z

    if-nez v2, :cond_0

    const-string v2, "replace() called on item that was not placed"

    invoke-static {v2}, LB0/a;->b(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iput-boolean v1, p0, LE0/L$a;->z:Z

    invoke-virtual {p0}, LE0/L$a;->q()Z

    move-result v2

    iget-wide v4, p0, LE0/L$a;->n:J

    iget-object v7, p0, LE0/L$a;->p:Lmh/l;

    iget-object v8, p0, LE0/L$a;->q:Lp0/c;

    const/4 v6, 0x0

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, LE0/L$a;->R1(JFLmh/l;Lp0/c;)V

    if-eqz v2, :cond_1

    iget-boolean v2, p0, LE0/L$a;->z:Z

    if-nez v2, :cond_1

    iget-object v2, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v2}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v2

    invoke-virtual {v2}, LE0/G;->o0()LE0/G;

    move-result-object v2

    if-eqz v2, :cond_1

    const/4 v3, 0x0

    invoke-static {v2, v1, v0, v3}, LE0/G;->q1(LE0/G;ZILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    iput-boolean v1, p0, LE0/L$a;->f:Z

    return-void

    :goto_1
    iput-boolean v1, p0, LE0/L$a;->f:Z

    throw v0
.end method

.method public final W1(Z)V
    .locals 0

    iput-boolean p1, p0, LE0/L$a;->u:Z

    return-void
.end method

.method public X(LC0/a;)I
    .locals 4

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

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
    sget-object v2, LE0/G$e;->LookaheadMeasuring:LE0/G$e;

    const/4 v3, 0x1

    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, LE0/L$a;->p()LE0/a;

    move-result-object v0

    invoke-virtual {v0, v3}, LE0/a;->u(Z)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->o0()LE0/G;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LE0/G;->W()LE0/G$e;

    move-result-object v1

    :cond_2
    sget-object v0, LE0/G$e;->LookaheadLayingOut:LE0/G$e;

    if-ne v1, v0, :cond_3

    invoke-virtual {p0}, LE0/L$a;->p()LE0/a;

    move-result-object v0

    invoke-virtual {v0, v3}, LE0/a;->t(Z)V

    :cond_3
    :goto_1
    iput-boolean v3, p0, LE0/L$a;->j:Z

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, LE0/P;->X(LC0/a;)I

    move-result p1

    const/4 v0, 0x0

    iput-boolean v0, p0, LE0/L$a;->j:Z

    return p1
.end method

.method public final Y0()Ljava/util/List;
    .locals 8

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->H()Ljava/util/List;

    iget-boolean v0, p0, LE0/L$a;->u:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LE0/L$a;->t:LV/b;

    invoke-virtual {v0}, LV/b;->g()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    iget-object v1, p0, LE0/L$a;->t:LV/b;

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

    invoke-virtual {v6}, LE0/L;->H()LE0/L$a;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v1, v6}, LV/b;->b(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v6}, LE0/G;->U()LE0/L;

    move-result-object v6

    invoke-virtual {v6}, LE0/L;->H()LE0/L$a;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

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

    iput-boolean v4, p0, LE0/L$a;->u:Z

    iget-object v0, p0, LE0/L$a;->t:LV/b;

    invoke-virtual {v0}, LV/b;->g()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final Y1(LE0/G$g;)V
    .locals 0

    iput-object p1, p0, LE0/L$a;->i:LE0/G$g;

    return-void
.end method

.method public final Z0()LY0/b;
    .locals 1

    iget-object v0, p0, LE0/L$a;->m:LY0/b;

    return-object v0
.end method

.method public final Z1(I)V
    .locals 0

    iput p1, p0, LE0/L$a;->h:I

    return-void
.end method

.method public a2(Z)V
    .locals 0

    iput-boolean p1, p0, LE0/L$a;->r:Z

    return-void
.end method

.method public b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LE0/L$a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final c1()Z
    .locals 1

    iget-boolean v0, p0, LE0/L$a;->v:Z

    return v0
.end method

.method public final c2()Z
    .locals 2

    invoke-virtual {p0}, LE0/L$a;->b()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, LE0/Q;->b()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, LE0/L$a;->w:Z

    if-nez v0, :cond_1

    return v1

    :cond_1
    iput-boolean v1, p0, LE0/L$a;->w:Z

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, LE0/Q;->b()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LE0/L$a;->x:Ljava/lang/Object;

    const/4 v0, 0x1

    return v0
.end method

.method public g0()V
    .locals 12

    const/4 v0, 0x1

    iput-boolean v0, p0, LE0/L$a;->v:Z

    invoke-virtual {p0}, LE0/L$a;->p()LE0/a;

    move-result-object v1

    invoke-virtual {v1}, LE0/a;->o()V

    iget-object v1, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v1}, LE0/L;->F()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, LE0/L$a;->J1()V

    :cond_0
    invoke-virtual {p0}, LE0/L$a;->B()LE0/c0;

    move-result-object v1

    invoke-virtual {v1}, LE0/c0;->C2()LE0/Q;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v2, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v2}, LE0/L;->c(LE0/L;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    iget-boolean v2, p0, LE0/L$a;->j:Z

    if-nez v2, :cond_3

    invoke-virtual {v1}, LE0/P;->L1()Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v2}, LE0/L;->F()Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_1
    iget-object v2, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v2, v3}, LE0/L;->m(LE0/L;Z)V

    iget-object v2, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v2}, LE0/L;->B()LE0/G$e;

    move-result-object v2

    iget-object v4, p0, LE0/L$a;->A:LE0/L;

    sget-object v5, LE0/G$e;->LookaheadLayingOut:LE0/G$e;

    invoke-static {v4, v5}, LE0/L;->l(LE0/L;LE0/G$e;)V

    iget-object v4, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v4}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v4

    invoke-static {v4}, LE0/K;->b(LE0/G;)LE0/m0;

    move-result-object v4

    iget-object v5, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v5, v3}, LE0/L;->b0(Z)V

    invoke-interface {v4}, LE0/m0;->getSnapshotObserver()LE0/o0;

    move-result-object v6

    iget-object v4, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v4}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v7

    new-instance v9, LE0/L$a$b;

    iget-object v4, p0, LE0/L$a;->A:LE0/L;

    invoke-direct {v9, p0, v1, v4}, LE0/L$a$b;-><init>(LE0/L$a;LE0/Q;LE0/L;)V

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, LE0/o0;->f(LE0/o0;LE0/G;ZLmh/a;ILjava/lang/Object;)V

    iget-object v4, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v4, v2}, LE0/L;->l(LE0/L;LE0/G$e;)V

    iget-object v2, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v2}, LE0/L;->E()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, LE0/P;->L1()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, LE0/L$a;->requestLayout()V

    :cond_2
    iget-object v1, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v1, v3}, LE0/L;->n(LE0/L;Z)V

    :cond_3
    invoke-virtual {p0}, LE0/L$a;->p()LE0/a;

    move-result-object v1

    invoke-virtual {v1}, LE0/a;->l()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, LE0/L$a;->p()LE0/a;

    move-result-object v1

    invoke-virtual {v1, v0}, LE0/a;->q(Z)V

    :cond_4
    invoke-virtual {p0}, LE0/L$a;->p()LE0/a;

    move-result-object v0

    invoke-virtual {v0}, LE0/a;->g()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, LE0/L$a;->p()LE0/a;

    move-result-object v0

    invoke-virtual {v0}, LE0/a;->k()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, LE0/L$a;->p()LE0/a;

    move-result-object v0

    invoke-virtual {v0}, LE0/a;->n()V

    :cond_5
    iput-boolean v3, p0, LE0/L$a;->v:Z

    return-void
.end method

.method public final g1()LE0/L$b;
    .locals 1

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v0}, LE0/L;->I()LE0/L$b;

    move-result-object v0

    return-object v0
.end method

.method public final h1()LE0/G$g;
    .locals 1

    iget-object v0, p0, LE0/L$a;->i:LE0/G$g;

    return-object v0
.end method

.method public k0(Z)V
    .locals 2

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LE0/P;->J1()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p1}, LE0/P;->k0(Z)V

    :cond_2
    :goto_1
    iput-boolean p1, p0, LE0/L$a;->y:Z

    return-void
.end method

.method public final o1()Z
    .locals 1

    iget-boolean v0, p0, LE0/L$a;->k:Z

    return v0
.end method

.method public p()LE0/a;
    .locals 1

    iget-object v0, p0, LE0/L$a;->s:LE0/a;

    return-object v0
.end method

.method public q()Z
    .locals 1

    iget-boolean v0, p0, LE0/L$a;->r:Z

    return v0
.end method

.method public final q1(Z)V
    .locals 9

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->o0()LE0/G;

    move-result-object v0

    iget-object v1, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v1}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->T()LE0/G$g;

    move-result-object v1

    if-eqz v0, :cond_6

    sget-object v2, LE0/G$g;->NotUsed:LE0/G$g;

    if-eq v1, v2, :cond_6

    :cond_0
    move-object v3, v0

    invoke-virtual {v3}, LE0/G;->T()LE0/G$g;

    move-result-object v0

    if-ne v0, v1, :cond_1

    invoke-virtual {v3}, LE0/G;->o0()LE0/G;

    move-result-object v0

    if-nez v0, :cond_0

    :cond_1
    sget-object v0, LE0/L$a$a;->b:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    invoke-virtual {v3}, LE0/G;->a0()LE0/G;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v3, p1}, LE0/G;->p1(Z)V

    goto :goto_0

    :cond_2
    invoke-virtual {v3, p1}, LE0/G;->t1(Z)V

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Intrinsics isn\'t used by the parent"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-virtual {v3}, LE0/G;->a0()LE0/G;

    move-result-object v0

    if-eqz v0, :cond_5

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v4, p1

    invoke-static/range {v3 .. v8}, LE0/G;->s1(LE0/G;ZZZILjava/lang/Object;)V

    goto :goto_0

    :cond_5
    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v4, p1

    invoke-static/range {v3 .. v8}, LE0/G;->w1(LE0/G;ZZZILjava/lang/Object;)V

    :cond_6
    :goto_0
    return-void
.end method

.method public r0()V
    .locals 7

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v1

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LE0/G;->s1(LE0/G;ZZZILjava/lang/Object;)V

    return-void
.end method

.method public final r1()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LE0/L$a;->w:Z

    return-void
.end method

.method public requestLayout()V
    .locals 4

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, LE0/G;->q1(LE0/G;ZILjava/lang/Object;)V

    return-void
.end method

.method public s(I)I
    .locals 1

    invoke-direct {p0}, LE0/L$a;->L1()V

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, LE0/Q;->s(I)I

    move-result p1

    return p1
.end method

.method public s0(I)I
    .locals 1

    invoke-direct {p0}, LE0/L$a;->L1()V

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v0}, LE0/L;->K()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, LE0/Q;->s0(I)I

    move-result p1

    return p1
.end method

.method public v()Ljava/util/Map;
    .locals 3

    iget-boolean v0, p0, LE0/L$a;->j:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v0}, LE0/L;->B()LE0/G$e;

    move-result-object v0

    sget-object v2, LE0/G$e;->LookaheadMeasuring:LE0/G$e;

    if-ne v0, v2, :cond_0

    invoke-virtual {p0}, LE0/L$a;->p()LE0/a;

    move-result-object v0

    invoke-virtual {v0, v1}, LE0/a;->s(Z)V

    invoke-virtual {p0}, LE0/L$a;->p()LE0/a;

    move-result-object v0

    invoke-virtual {v0}, LE0/a;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LE0/L$a;->A:LE0/L;

    invoke-virtual {v0}, LE0/L;->P()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LE0/L$a;->p()LE0/a;

    move-result-object v0

    invoke-virtual {v0, v1}, LE0/a;->r(Z)V

    :cond_1
    :goto_0
    invoke-virtual {p0}, LE0/L$a;->B()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0, v1}, LE0/P;->S1(Z)V

    :goto_1
    invoke-virtual {p0}, LE0/L$a;->g0()V

    invoke-virtual {p0}, LE0/L$a;->B()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LE0/P;->S1(Z)V

    :goto_2
    invoke-virtual {p0}, LE0/L$a;->p()LE0/a;

    move-result-object v0

    invoke-virtual {v0}, LE0/a;->h()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
