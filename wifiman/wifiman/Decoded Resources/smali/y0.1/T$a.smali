.class final Ly0/T$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly0/b;
.implements LY0/d;
.implements Ldh/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly0/T;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Ldh/e;

.field private final synthetic b:Ly0/T;

.field private c:LIi/n;

.field private d:Ly0/p;

.field private final e:Ldh/i;

.field final synthetic f:Ly0/T;


# direct methods
.method public constructor <init>(Ly0/T;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Ly0/T$a;->f:Ly0/T;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ly0/T$a;->a:Ldh/e;

    iput-object p1, p0, Ly0/T$a;->b:Ly0/T;

    sget-object p1, Ly0/p;->Main:Ly0/p;

    iput-object p1, p0, Ly0/T$a;->d:Ly0/p;

    sget-object p1, Ldh/j;->a:Ldh/j;

    iput-object p1, p0, Ly0/T$a;->e:Ldh/i;

    return-void
.end method

.method public static final synthetic b(Ly0/T$a;)LIi/n;
    .locals 0

    iget-object p0, p0, Ly0/T$a;->c:LIi/n;

    return-object p0
.end method

.method public static final synthetic q(Ly0/T$a;Ly0/p;)V
    .locals 0

    iput-object p1, p0, Ly0/T$a;->d:Ly0/p;

    return-void
.end method

.method public static final synthetic s(Ly0/T$a;LIi/n;)V
    .locals 0

    iput-object p1, p0, Ly0/T$a;->c:LIi/n;

    return-void
.end method


# virtual methods
.method public A1(Ly0/p;Ldh/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, LIi/p;

    invoke-static {p2}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v0}, LIi/p;->A()V

    invoke-static {p0, p1}, Ly0/T$a;->q(Ly0/T$a;Ly0/p;)V

    invoke-static {p0, v0}, Ly0/T$a;->s(Ly0/T$a;LIi/n;)V

    invoke-virtual {v0}, LIi/p;->u()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_0
    return-object p1
.end method

.method public F0(F)J
    .locals 2

    iget-object v0, p0, Ly0/T$a;->b:Ly0/T;

    invoke-interface {v0, p1}, LY0/d;->F0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public K1(J)J
    .locals 1

    iget-object v0, p0, Ly0/T$a;->b:Ly0/T;

    invoke-interface {v0, p1, p2}, LY0/d;->K1(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public N0(F)F
    .locals 1

    iget-object v0, p0, Ly0/T$a;->b:Ly0/T;

    invoke-interface {v0, p1}, LY0/d;->N0(F)F

    move-result p1

    return p1
.end method

.method public N1(J)F
    .locals 1

    iget-object v0, p0, Ly0/T$a;->b:Ly0/T;

    invoke-interface {v0, p1, p2}, LY0/d;->N1(J)F

    move-result p1

    return p1
.end method

.method public O0(JLmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p4, Ly0/T$a$a;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Ly0/T$a$a;

    iget v1, v0, Ly0/T$a$a;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly0/T$a$a;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly0/T$a$a;

    invoke-direct {v0, p0, p4}, Ly0/T$a$a;-><init>(Ly0/T$a;Ldh/e;)V

    :goto_0
    iget-object p4, v0, Ly0/T$a$a;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Ly0/T$a$a;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ly0/T$a$a;->a:Ljava/lang/Object;

    check-cast p1, LIi/y0;

    :try_start_0
    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    const-wide/16 v4, 0x0

    cmp-long p4, p1, v4

    if-gtz p4, :cond_3

    iget-object p4, p0, Ly0/T$a;->c:LIi/n;

    if-eqz p4, :cond_3

    sget-object v2, LYg/u;->b:LYg/u$a;

    new-instance v2, Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException;

    invoke-direct {v2, p1, p2}, Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException;-><init>(J)V

    invoke-static {v2}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p4, v2}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :cond_3
    iget-object p4, p0, Ly0/T$a;->f:Ly0/T;

    invoke-virtual {p4}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v4

    new-instance v7, Ly0/T$a$b;

    const/4 p4, 0x0

    invoke-direct {v7, p1, p2, p0, p4}, Ly0/T$a$b;-><init>(JLy0/T$a;Ldh/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object p1

    :try_start_1
    iput-object p1, v0, Ly0/T$a$a;->a:Ljava/lang/Object;

    iput v3, v0, Ly0/T$a$a;->d:I

    invoke-interface {p3, p0, v0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p4, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    sget-object p2, Landroidx/compose/ui/input/pointer/CancelTimeoutCancellationException;->a:Landroidx/compose/ui/input/pointer/CancelTimeoutCancellationException;

    invoke-interface {p1, p2}, LIi/y0;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-object p4

    :goto_2
    sget-object p3, Landroidx/compose/ui/input/pointer/CancelTimeoutCancellationException;->a:Landroidx/compose/ui/input/pointer/CancelTimeoutCancellationException;

    invoke-interface {p1, p3}, LIi/y0;->cancel(Ljava/util/concurrent/CancellationException;)V

    throw p2
.end method

.method public T1(JLmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p4, Ly0/T$a$c;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Ly0/T$a$c;

    iget v1, v0, Ly0/T$a$c;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly0/T$a$c;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly0/T$a$c;

    invoke-direct {v0, p0, p4}, Ly0/T$a$c;-><init>(Ly0/T$a;Ldh/e;)V

    :goto_0
    iget-object p4, v0, Ly0/T$a$c;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Ly0/T$a$c;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    iput v3, v0, Ly0/T$a$c;->c:I

    invoke-virtual {p0, p1, p2, p3, v0}, Ly0/T$a;->O0(JLmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p4
    :try_end_1
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p4, v1, :cond_3

    return-object v1

    :catch_0
    const/4 p4, 0x0

    :cond_3
    :goto_1
    return-object p4
.end method

.method public Z()Ly0/n;
    .locals 1

    iget-object v0, p0, Ly0/T$a;->f:Ly0/T;

    invoke-static {v0}, Ly0/T;->E2(Ly0/T;)Ly0/n;

    move-result-object v0

    return-object v0
.end method

.method public d1(F)F
    .locals 1

    iget-object v0, p0, Ly0/T$a;->b:Ly0/T;

    invoke-interface {v0, p1}, LY0/d;->d1(F)F

    move-result p1

    return p1
.end method

.method public e0(F)J
    .locals 2

    iget-object v0, p0, Ly0/T$a;->b:Ly0/T;

    invoke-interface {v0, p1}, LY0/l;->e0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public f0(J)J
    .locals 1

    iget-object v0, p0, Ly0/T$a;->b:Ly0/T;

    invoke-interface {v0, p1, p2}, LY0/d;->f0(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public getContext()Ldh/i;
    .locals 1

    iget-object v0, p0, Ly0/T$a;->e:Ldh/i;

    return-object v0
.end method

.method public getDensity()F
    .locals 1

    iget-object v0, p0, Ly0/T$a;->b:Ly0/T;

    invoke-virtual {v0}, Ly0/T;->getDensity()F

    move-result v0

    return v0
.end method

.method public getViewConfiguration()Landroidx/compose/ui/platform/w1;
    .locals 1

    iget-object v0, p0, Ly0/T$a;->f:Ly0/T;

    invoke-virtual {v0}, Ly0/T;->getViewConfiguration()Landroidx/compose/ui/platform/w1;

    move-result-object v0

    return-object v0
.end method

.method public h()J
    .locals 2

    iget-object v0, p0, Ly0/T$a;->f:Ly0/T;

    invoke-static {v0}, Ly0/T;->D2(Ly0/T;)J

    move-result-wide v0

    return-wide v0
.end method

.method public n0(J)F
    .locals 1

    iget-object v0, p0, Ly0/T$a;->b:Ly0/T;

    invoke-interface {v0, p1, p2}, LY0/l;->n0(J)F

    move-result p1

    return p1
.end method

.method public n1()J
    .locals 2

    iget-object v0, p0, Ly0/T$a;->f:Ly0/T;

    invoke-virtual {v0}, Ly0/T;->n1()J

    move-result-wide v0

    return-wide v0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ly0/T$a;->f:Ly0/T;

    invoke-static {v0}, Ly0/T;->F2(Ly0/T;)LV/b;

    move-result-object v0

    iget-object v1, p0, Ly0/T$a;->f:Ly0/T;

    monitor-enter v0

    :try_start_0
    invoke-static {v1}, Ly0/T;->F2(Ly0/T;)LV/b;

    move-result-object v1

    invoke-virtual {v1, p0}, LV/b;->x(Ljava/lang/Object;)Z

    sget-object v1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    iget-object v0, p0, Ly0/T$a;->a:Ldh/e;

    invoke-interface {v0, p1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final v(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Ly0/T$a;->c:LIi/n;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, LIi/n;->cancel(Ljava/lang/Throwable;)Z

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Ly0/T$a;->c:LIi/n;

    return-void
.end method

.method public x(I)F
    .locals 1

    iget-object v0, p0, Ly0/T$a;->b:Ly0/T;

    invoke-interface {v0, p1}, LY0/d;->x(I)F

    move-result p1

    return p1
.end method

.method public x1(F)I
    .locals 1

    iget-object v0, p0, Ly0/T$a;->b:Ly0/T;

    invoke-interface {v0, p1}, LY0/d;->x1(F)I

    move-result p1

    return p1
.end method

.method public y()F
    .locals 1

    iget-object v0, p0, Ly0/T$a;->b:Ly0/T;

    invoke-virtual {v0}, Ly0/T;->y()F

    move-result v0

    return v0
.end method

.method public final z(Ly0/n;Ly0/p;)V
    .locals 1

    iget-object v0, p0, Ly0/T$a;->d:Ly0/p;

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Ly0/T$a;->c:LIi/n;

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Ly0/T$a;->c:LIi/n;

    invoke-static {p1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, p1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
