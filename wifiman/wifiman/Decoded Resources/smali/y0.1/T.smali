.class public final Ly0/T;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements Ly0/S;
.implements Ly0/G;
.implements LY0/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly0/T$a;,
        Ly0/T$b;
    }
.end annotation


# instance fields
.field private n:Ljava/lang/Object;

.field private o:Ljava/lang/Object;

.field private p:[Ljava/lang/Object;

.field private q:Lmh/p;

.field private r:LIi/y0;

.field private s:Ly0/n;

.field private final t:LV/b;

.field private final u:LV/b;

.field private v:Ly0/n;

.field private w:J

.field private x:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lmh/p;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Ly0/T;->n:Ljava/lang/Object;

    iput-object p2, p0, Ly0/T;->o:Ljava/lang/Object;

    iput-object p3, p0, Ly0/T;->p:[Ljava/lang/Object;

    iput-object p4, p0, Ly0/T;->q:Lmh/p;

    invoke-static {}, Ly0/P;->b()Ly0/n;

    move-result-object p1

    iput-object p1, p0, Ly0/T;->s:Ly0/n;

    new-instance p1, LV/b;

    const/16 p2, 0x10

    new-array p3, p2, [Ly0/T$a;

    const/4 p4, 0x0

    invoke-direct {p1, p3, p4}, LV/b;-><init>([Ljava/lang/Object;I)V

    iput-object p1, p0, Ly0/T;->t:LV/b;

    new-instance p1, LV/b;

    new-array p2, p2, [Ly0/T$a;

    invoke-direct {p1, p2, p4}, LV/b;-><init>([Ljava/lang/Object;I)V

    iput-object p1, p0, Ly0/T;->u:LV/b;

    sget-object p1, LY0/r;->b:LY0/r$a;

    invoke-virtual {p1}, LY0/r$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Ly0/T;->w:J

    return-void
.end method

.method public static final synthetic D2(Ly0/T;)J
    .locals 2

    iget-wide v0, p0, Ly0/T;->w:J

    return-wide v0
.end method

.method public static final synthetic E2(Ly0/T;)Ly0/n;
    .locals 0

    iget-object p0, p0, Ly0/T;->s:Ly0/n;

    return-object p0
.end method

.method public static final synthetic F2(Ly0/T;)LV/b;
    .locals 0

    iget-object p0, p0, Ly0/T;->t:LV/b;

    return-object p0
.end method

.method private final G2(Ly0/n;Ly0/p;)V
    .locals 4

    iget-object v0, p0, Ly0/T;->t:LV/b;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ly0/T;->u:LV/b;

    iget-object v2, p0, Ly0/T;->t:LV/b;

    invoke-virtual {v1}, LV/b;->o()I

    move-result v3

    invoke-virtual {v1, v3, v2}, LV/b;->c(ILV/b;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    :try_start_1
    sget-object v0, Ly0/T$b;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ly0/T;->u:LV/b;

    invoke-virtual {v0}, LV/b;->o()I

    move-result v2

    if-lez v2, :cond_4

    sub-int/2addr v2, v1

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    :cond_1
    aget-object v1, v0, v2

    check-cast v1, Ly0/T$a;

    invoke-virtual {v1, p1, p2}, Ly0/T$a;->z(Ly0/n;Ly0/p;)V

    add-int/lit8 v2, v2, -0x1

    if-gez v2, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    iget-object v0, p0, Ly0/T;->u:LV/b;

    invoke-virtual {v0}, LV/b;->o()I

    move-result v1

    if-lez v1, :cond_4

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_3
    aget-object v3, v0, v2

    check-cast v3, Ly0/T$a;

    invoke-virtual {v3, p1, p2}, Ly0/T$a;->z(Ly0/n;Ly0/p;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_3

    :cond_4
    :goto_0
    iget-object p1, p0, Ly0/T;->u:LV/b;

    invoke-virtual {p1}, LV/b;->h()V

    return-void

    :goto_1
    iget-object p2, p0, Ly0/T;->u:LV/b;

    invoke-virtual {p2}, LV/b;->h()V

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method


# virtual methods
.method public C0()V
    .locals 26

    move-object/from16 v0, p0

    iget-object v1, v0, Ly0/T;->v:Ly0/n;

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v1}, Ly0/n;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_3

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly0/y;

    invoke-virtual {v6}, Ly0/y;->i()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v1}, Ly0/n;->c()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    :goto_1
    if-ge v4, v3, :cond_1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly0/y;

    invoke-virtual {v5}, Ly0/y;->f()J

    move-result-wide v7

    invoke-virtual {v5}, Ly0/y;->h()J

    move-result-wide v11

    invoke-virtual {v5}, Ly0/y;->o()J

    move-result-wide v9

    invoke-virtual {v5}, Ly0/y;->j()F

    move-result v14

    invoke-virtual {v5}, Ly0/y;->h()J

    move-result-wide v17

    invoke-virtual {v5}, Ly0/y;->o()J

    move-result-wide v15

    invoke-virtual {v5}, Ly0/y;->i()Z

    move-result v19

    invoke-virtual {v5}, Ly0/y;->i()Z

    move-result v20

    new-instance v5, Ly0/y;

    move-object v6, v5

    const/16 v24, 0x600

    const/16 v25, 0x0

    const/4 v13, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    invoke-direct/range {v6 .. v25}, Ly0/y;-><init>(JJJZFJJZZIJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    new-instance v1, Ly0/n;

    invoke-direct {v1, v2}, Ly0/n;-><init>(Ljava/util/List;)V

    iput-object v1, v0, Ly0/T;->s:Ly0/n;

    sget-object v2, Ly0/p;->Initial:Ly0/p;

    invoke-direct {v0, v1, v2}, Ly0/T;->G2(Ly0/n;Ly0/p;)V

    sget-object v2, Ly0/p;->Main:Ly0/p;

    invoke-direct {v0, v1, v2}, Ly0/T;->G2(Ly0/n;Ly0/p;)V

    sget-object v2, Ly0/p;->Final:Ly0/p;

    invoke-direct {v0, v1, v2}, Ly0/T;->G2(Ly0/n;Ly0/p;)V

    const/4 v1, 0x0

    iput-object v1, v0, Ly0/T;->v:Ly0/n;

    return-void

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public H2()Lmh/p;
    .locals 1

    iget-object v0, p0, Ly0/T;->q:Lmh/p;

    return-object v0
.end method

.method public final I2(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lmh/p;)V
    .locals 2

    iget-object v0, p0, Ly0/T;->n:Ljava/lang/Object;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iput-object p1, p0, Ly0/T;->n:Ljava/lang/Object;

    iget-object p1, p0, Ly0/T;->o:Ljava/lang/Object;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    move v0, v1

    :cond_0
    iput-object p2, p0, Ly0/T;->o:Ljava/lang/Object;

    iget-object p1, p0, Ly0/T;->p:[Ljava/lang/Object;

    if-eqz p1, :cond_1

    if-nez p3, :cond_1

    move v0, v1

    :cond_1
    if-nez p1, :cond_2

    if-eqz p3, :cond_2

    move v0, v1

    :cond_2
    if-eqz p1, :cond_3

    if-eqz p3, :cond_3

    invoke-static {p3, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    move v1, v0

    :goto_0
    iput-object p3, p0, Ly0/T;->p:[Ljava/lang/Object;

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Ly0/T;->Z1()V

    :cond_4
    iput-object p4, p0, Ly0/T;->q:Lmh/p;

    return-void
.end method

.method public M1()V
    .locals 0

    invoke-virtual {p0}, Ly0/T;->Z1()V

    return-void
.end method

.method public P(Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 4

    new-instance v0, LIi/p;

    invoke-static {p2}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v0}, LIi/p;->A()V

    new-instance v1, Ly0/T$a;

    invoke-direct {v1, p0, v0}, Ly0/T$a;-><init>(Ly0/T;Ldh/e;)V

    invoke-static {p0}, Ly0/T;->F2(Ly0/T;)LV/b;

    move-result-object v2

    monitor-enter v2

    :try_start_0
    invoke-static {p0}, Ly0/T;->F2(Ly0/T;)LV/b;

    move-result-object v3

    invoke-virtual {v3, v1}, LV/b;->b(Ljava/lang/Object;)Z

    invoke-static {p1, v1, v1}, Ldh/g;->a(Lmh/p;Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    sget-object v3, LYg/u;->b:LYg/u$a;

    sget-object v3, LYg/J;->a:LYg/J;

    invoke-static {v3}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p1, v3}, Ldh/e;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    new-instance p1, Ly0/T$c;

    invoke-direct {p1, v1}, Ly0/T$c;-><init>(Ly0/T$a;)V

    invoke-interface {v0, p1}, LIi/n;->B(Lmh/l;)V

    invoke-virtual {v0}, LIi/p;->u()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1
.end method

.method public T0()V
    .locals 0

    invoke-virtual {p0}, Ly0/T;->Z1()V

    return-void
.end method

.method public V1(Z)V
    .locals 0

    iput-boolean p1, p0, Ly0/T;->x:Z

    return-void
.end method

.method public Z1()V
    .locals 2

    iget-object v0, p0, Ly0/T;->r:LIi/y0;

    if-eqz v0, :cond_0

    new-instance v1, Landroidx/compose/ui/input/pointer/PointerInputResetException;

    invoke-direct {v1}, Landroidx/compose/ui/input/pointer/PointerInputResetException;-><init>()V

    invoke-interface {v0, v1}, LIi/y0;->cancel(Ljava/util/concurrent/CancellationException;)V

    const/4 v0, 0x0

    iput-object v0, p0, Ly0/T;->r:LIi/y0;

    :cond_0
    return-void
.end method

.method public getDensity()F
    .locals 1

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->K()LY0/d;

    move-result-object v0

    invoke-interface {v0}, LY0/d;->getDensity()F

    move-result v0

    return v0
.end method

.method public getViewConfiguration()Landroidx/compose/ui/platform/w1;
    .locals 1

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->s0()Landroidx/compose/ui/platform/w1;

    move-result-object v0

    return-object v0
.end method

.method public h()J
    .locals 2

    iget-wide v0, p0, Ly0/T;->w:J

    return-wide v0
.end method

.method public n1()J
    .locals 7

    invoke-virtual {p0}, Ly0/T;->getViewConfiguration()Landroidx/compose/ui/platform/w1;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/platform/w1;->e()J

    move-result-wide v0

    invoke-interface {p0, v0, v1}, LY0/d;->K1(J)J

    move-result-wide v0

    invoke-virtual {p0}, Ly0/T;->h()J

    move-result-wide v2

    invoke-static {v0, v1}, Ll0/m;->i(J)F

    move-result v4

    invoke-static {v2, v3}, LY0/r;->g(J)I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v4, v5

    const/4 v5, 0x0

    invoke-static {v5, v4}, Ljava/lang/Math;->max(FF)F

    move-result v4

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v4, v6

    invoke-static {v0, v1}, Ll0/m;->g(J)F

    move-result v0

    invoke-static {v2, v3}, LY0/r;->f(J)I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    invoke-static {v5, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    div-float/2addr v0, v6

    invoke-static {v4, v0}, Ll0/n;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public o2()V
    .locals 0

    invoke-virtual {p0}, Ly0/T;->Z1()V

    invoke-super {p0}, Landroidx/compose/ui/e$c;->o2()V

    return-void
.end method

.method public s0(Ly0/n;Ly0/p;J)V
    .locals 6

    iput-wide p3, p0, Ly0/T;->w:J

    sget-object p3, Ly0/p;->Initial:Ly0/p;

    if-ne p2, p3, :cond_0

    iput-object p1, p0, Ly0/T;->s:Ly0/n;

    :cond_0
    iget-object p3, p0, Ly0/T;->r:LIi/y0;

    const/4 p4, 0x0

    if-nez p3, :cond_1

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v0

    sget-object v2, LIi/P;->UNDISPATCHED:LIi/P;

    new-instance v3, Ly0/T$d;

    invoke-direct {v3, p0, p4}, Ly0/T$d;-><init>(Ly0/T;Ldh/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object p3

    iput-object p3, p0, Ly0/T;->r:LIi/y0;

    :cond_1
    invoke-direct {p0, p1, p2}, Ly0/T;->G2(Ly0/n;Ly0/p;)V

    invoke-virtual {p1}, Ly0/n;->c()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p3, :cond_3

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly0/y;

    invoke-static {v2}, Ly0/o;->d(Ly0/y;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    :goto_1
    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, p4

    :goto_2
    iput-object p1, p0, Ly0/T;->v:Ly0/n;

    return-void
.end method

.method public y()F
    .locals 1

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->K()LY0/d;

    move-result-object v0

    invoke-interface {v0}, LY0/l;->y()F

    move-result v0

    return v0
.end method
