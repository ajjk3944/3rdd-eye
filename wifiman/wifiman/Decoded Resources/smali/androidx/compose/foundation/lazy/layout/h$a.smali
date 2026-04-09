.class final Landroidx/compose/foundation/lazy/layout/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/lazy/layout/d$b;
.implements LB/O;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/lazy/layout/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/lazy/layout/h$a$a;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:J

.field private final c:LB/N;

.field private d:Landroidx/compose/ui/layout/x$a;

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Landroidx/compose/foundation/lazy/layout/h$a$a;

.field private i:Z

.field final synthetic j:Landroidx/compose/foundation/lazy/layout/h;


# direct methods
.method private constructor <init>(Landroidx/compose/foundation/lazy/layout/h;IJLB/N;)V
    .locals 0

    .line 2
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/h$a;->j:Landroidx/compose/foundation/lazy/layout/h;

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p2, p0, Landroidx/compose/foundation/lazy/layout/h$a;->a:I

    .line 5
    iput-wide p3, p0, Landroidx/compose/foundation/lazy/layout/h$a;->b:J

    .line 6
    iput-object p5, p0, Landroidx/compose/foundation/lazy/layout/h$a;->c:LB/N;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/foundation/lazy/layout/h;IJLB/N;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Landroidx/compose/foundation/lazy/layout/h$a;-><init>(Landroidx/compose/foundation/lazy/layout/h;IJLB/N;)V

    return-void
.end method

.method public static final synthetic c(Landroidx/compose/foundation/lazy/layout/h$a;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/foundation/lazy/layout/h$a;->f:Z

    return p0
.end method

.method private final d()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/h$a;->d:Landroidx/compose/ui/layout/x$a;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final e()Z
    .locals 2

    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/layout/h$a;->f:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/h$a;->j:Landroidx/compose/foundation/lazy/layout/h;

    invoke-static {v0}, Landroidx/compose/foundation/lazy/layout/h;->a(Landroidx/compose/foundation/lazy/layout/h;)LB/r;

    move-result-object v0

    invoke-virtual {v0}, LB/r;->d()Lmh/a;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LB/t;

    invoke-interface {v0}, LB/t;->a()I

    move-result v0

    iget v1, p0, Landroidx/compose/foundation/lazy/layout/h$a;->a:I

    if-ltz v1, :cond_0

    if-ge v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final f()V
    .locals 4

    invoke-direct {p0}, Landroidx/compose/foundation/lazy/layout/h$a;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/h$a;->d:Landroidx/compose/ui/layout/x$a;

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/h$a;->j:Landroidx/compose/foundation/lazy/layout/h;

    invoke-static {v0}, Landroidx/compose/foundation/lazy/layout/h;->a(Landroidx/compose/foundation/lazy/layout/h;)LB/r;

    move-result-object v0

    invoke-virtual {v0}, LB/r;->d()Lmh/a;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LB/t;

    iget v1, p0, Landroidx/compose/foundation/lazy/layout/h$a;->a:I

    invoke-interface {v0, v1}, LB/t;->b(I)Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Landroidx/compose/foundation/lazy/layout/h$a;->a:I

    invoke-interface {v0, v2}, LB/t;->d(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/h$a;->j:Landroidx/compose/foundation/lazy/layout/h;

    invoke-static {v2}, Landroidx/compose/foundation/lazy/layout/h;->a(Landroidx/compose/foundation/lazy/layout/h;)LB/r;

    move-result-object v2

    iget v3, p0, Landroidx/compose/foundation/lazy/layout/h$a;->a:I

    invoke-virtual {v2, v3, v1, v0}, LB/r;->b(ILjava/lang/Object;Ljava/lang/Object;)Lmh/p;

    move-result-object v0

    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/h$a;->j:Landroidx/compose/foundation/lazy/layout/h;

    invoke-static {v2}, Landroidx/compose/foundation/lazy/layout/h;->b(Landroidx/compose/foundation/lazy/layout/h;)Landroidx/compose/ui/layout/x;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Landroidx/compose/ui/layout/x;->i(Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/layout/x$a;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/h$a;->d:Landroidx/compose/ui/layout/x$a;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Request was already composed!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Callers should check whether the request is still valid before calling performComposition()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final g(J)V
    .locals 3

    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/layout/h$a;->f:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/layout/h$a;->e:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/foundation/lazy/layout/h$a;->e:Z

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/h$a;->d:Landroidx/compose/ui/layout/x$a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/compose/ui/layout/x$a;->c()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {v0, v2, p1, p2}, Landroidx/compose/ui/layout/x$a;->b(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "performComposition() must be called before performMeasure()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Request was already measured!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Callers should check whether the request is still valid before calling performMeasure()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final h()Landroidx/compose/foundation/lazy/layout/h$a$a;
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/h$a;->d:Landroidx/compose/ui/layout/x$a;

    if-eqz v0, :cond_1

    new-instance v1, Lkotlin/jvm/internal/N;

    invoke-direct {v1}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v2, Landroidx/compose/foundation/lazy/layout/h$a$b;

    invoke-direct {v2, v1}, Landroidx/compose/foundation/lazy/layout/h$a$b;-><init>(Lkotlin/jvm/internal/N;)V

    const-string v3, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode"

    invoke-interface {v0, v3, v2}, Landroidx/compose/ui/layout/x$a;->a(Ljava/lang/Object;Lmh/l;)V

    iget-object v0, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    new-instance v1, Landroidx/compose/foundation/lazy/layout/h$a$a;

    invoke-direct {v1, p0, v0}, Landroidx/compose/foundation/lazy/layout/h$a$a;-><init>(Landroidx/compose/foundation/lazy/layout/h$a;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Should precompose before resolving nested prefetch states"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final i(LB/P;J)Z
    .locals 4

    invoke-interface {p1}, LB/P;->a()J

    move-result-wide v0

    iget-boolean p1, p0, Landroidx/compose/foundation/lazy/layout/h$a;->i:Z

    if-eqz p1, :cond_0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-gtz p1, :cond_1

    :cond_0
    cmp-long p1, p2, v0

    if-gez p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public a(LB/P;)Z
    .locals 11

    invoke-direct {p0}, Landroidx/compose/foundation/lazy/layout/h$a;->e()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/h$a;->j:Landroidx/compose/foundation/lazy/layout/h;

    invoke-static {v0}, Landroidx/compose/foundation/lazy/layout/h;->a(Landroidx/compose/foundation/lazy/layout/h;)LB/r;

    move-result-object v0

    invoke-virtual {v0}, LB/r;->d()Lmh/a;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LB/t;

    iget v2, p0, Landroidx/compose/foundation/lazy/layout/h$a;->a:I

    invoke-interface {v0, v2}, LB/t;->d(I)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0}, Landroidx/compose/foundation/lazy/layout/h$a;->d()Z

    move-result v2

    const-wide/16 v3, 0x0

    const/4 v5, 0x1

    if-nez v2, :cond_4

    if-eqz v0, :cond_1

    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/h$a;->c:LB/N;

    invoke-virtual {v2}, LB/N;->f()Lo/G;

    move-result-object v2

    invoke-virtual {v2, v0}, Lo/O;->a(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/h$a;->c:LB/N;

    invoke-virtual {v2}, LB/N;->f()Lo/G;

    move-result-object v2

    invoke-virtual {v2, v0}, Lo/O;->c(Ljava/lang/Object;)J

    move-result-wide v6

    goto :goto_0

    :cond_1
    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/h$a;->c:LB/N;

    invoke-virtual {v2}, LB/N;->e()J

    move-result-wide v6

    :goto_0
    invoke-direct {p0, p1, v6, v7}, Landroidx/compose/foundation/lazy/layout/h$a;->i(LB/P;J)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/h$a;->c:LB/N;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    const-string v8, "compose:lazy:prefetch:compose"

    invoke-static {v8}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0}, Landroidx/compose/foundation/lazy/layout/h$a;->f()V

    sget-object v8, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v8

    sub-long/2addr v8, v6

    if-eqz v0, :cond_2

    invoke-virtual {v2}, LB/N;->f()Lo/G;

    move-result-object v6

    invoke-virtual {v6, v0, v3, v4}, Lo/O;->e(Ljava/lang/Object;J)J

    move-result-wide v6

    invoke-static {v2, v8, v9, v6, v7}, LB/N;->a(LB/N;JJ)J

    move-result-wide v6

    invoke-virtual {v2}, LB/N;->f()Lo/G;

    move-result-object v10

    invoke-virtual {v10, v0, v6, v7}, Lo/G;->p(Ljava/lang/Object;J)V

    :cond_2
    invoke-virtual {v2}, LB/N;->e()J

    move-result-wide v6

    invoke-static {v2, v8, v9, v6, v7}, LB/N;->a(LB/N;JJ)J

    move-result-wide v6

    invoke-static {v2, v6, v7}, LB/N;->b(LB/N;J)V

    goto :goto_1

    :catchall_0
    move-exception p1

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1

    :cond_3
    return v5

    :cond_4
    :goto_1
    iget-boolean v2, p0, Landroidx/compose/foundation/lazy/layout/h$a;->i:Z

    if-nez v2, :cond_8

    iget-boolean v2, p0, Landroidx/compose/foundation/lazy/layout/h$a;->g:Z

    if-nez v2, :cond_6

    invoke-interface {p1}, LB/P;->a()J

    move-result-wide v6

    cmp-long v2, v6, v3

    if-lez v2, :cond_5

    const-string v2, "compose:lazy:prefetch:resolve-nested"

    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_1
    invoke-direct {p0}, Landroidx/compose/foundation/lazy/layout/h$a;->h()Landroidx/compose/foundation/lazy/layout/h$a$a;

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/foundation/lazy/layout/h$a;->h:Landroidx/compose/foundation/lazy/layout/h$a$a;

    iput-boolean v5, p0, Landroidx/compose/foundation/lazy/layout/h$a;->g:Z

    sget-object v2, LYg/J;->a:LYg/J;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1

    :cond_5
    return v5

    :cond_6
    :goto_2
    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/h$a;->h:Landroidx/compose/foundation/lazy/layout/h$a$a;

    if-eqz v2, :cond_7

    invoke-virtual {v2, p1}, Landroidx/compose/foundation/lazy/layout/h$a$a;->a(LB/P;)Z

    move-result v2

    goto :goto_3

    :cond_7
    move v2, v1

    :goto_3
    if-eqz v2, :cond_8

    return v5

    :cond_8
    iget-boolean v2, p0, Landroidx/compose/foundation/lazy/layout/h$a;->e:Z

    if-nez v2, :cond_c

    iget-wide v6, p0, Landroidx/compose/foundation/lazy/layout/h$a;->b:J

    invoke-static {v6, v7}, LY0/b;->p(J)Z

    move-result v2

    if-nez v2, :cond_c

    if-eqz v0, :cond_9

    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/h$a;->c:LB/N;

    invoke-virtual {v2}, LB/N;->h()Lo/G;

    move-result-object v2

    invoke-virtual {v2, v0}, Lo/O;->a(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/h$a;->c:LB/N;

    invoke-virtual {v2}, LB/N;->h()Lo/G;

    move-result-object v2

    invoke-virtual {v2, v0}, Lo/O;->c(Ljava/lang/Object;)J

    move-result-wide v6

    goto :goto_4

    :cond_9
    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/h$a;->c:LB/N;

    invoke-virtual {v2}, LB/N;->g()J

    move-result-wide v6

    :goto_4
    invoke-direct {p0, p1, v6, v7}, Landroidx/compose/foundation/lazy/layout/h$a;->i(LB/P;J)Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/h$a;->c:LB/N;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    const-string v2, "compose:lazy:prefetch:measure"

    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_2
    iget-wide v7, p0, Landroidx/compose/foundation/lazy/layout/h$a;->b:J

    invoke-direct {p0, v7, v8}, Landroidx/compose/foundation/lazy/layout/h$a;->g(J)V

    sget-object v2, LYg/J;->a:LYg/J;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-static {}, Landroid/os/Trace;->endSection()V

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v7

    sub-long/2addr v7, v5

    if-eqz v0, :cond_a

    invoke-virtual {p1}, LB/N;->h()Lo/G;

    move-result-object v2

    invoke-virtual {v2, v0, v3, v4}, Lo/O;->e(Ljava/lang/Object;J)J

    move-result-wide v2

    invoke-static {p1, v7, v8, v2, v3}, LB/N;->a(LB/N;JJ)J

    move-result-wide v2

    invoke-virtual {p1}, LB/N;->h()Lo/G;

    move-result-object v4

    invoke-virtual {v4, v0, v2, v3}, Lo/G;->p(Ljava/lang/Object;J)V

    :cond_a
    invoke-virtual {p1}, LB/N;->g()J

    move-result-wide v2

    invoke-static {p1, v7, v8, v2, v3}, LB/N;->a(LB/N;JJ)J

    move-result-wide v2

    invoke-static {p1, v2, v3}, LB/N;->c(LB/N;J)V

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1

    :cond_b
    return v5

    :cond_c
    :goto_5
    return v1
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/foundation/lazy/layout/h$a;->i:Z

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/layout/h$a;->f:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/foundation/lazy/layout/h$a;->f:Z

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/h$a;->d:Landroidx/compose/ui/layout/x$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/compose/ui/layout/x$a;->dispose()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/h$a;->d:Landroidx/compose/ui/layout/x$a;

    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HandleAndRequestImpl { index = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/foundation/lazy/layout/h$a;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", constraints = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroidx/compose/foundation/lazy/layout/h$a;->b:J

    invoke-static {v1, v2}, LY0/b;->q(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isComposed = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Landroidx/compose/foundation/lazy/layout/h$a;->d()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isMeasured = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/foundation/lazy/layout/h$a;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isCanceled = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/foundation/lazy/layout/h$a;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
