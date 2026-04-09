.class final LKi/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKi/i;
.implements LIi/a1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKi/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/Object;

.field private b:LIi/p;

.field final synthetic c:LKi/e;


# direct methods
.method public constructor <init>(LKi/e;)V
    .locals 0

    iput-object p1, p0, LKi/e$a;->c:LKi/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LKi/f;->m()LNi/C;

    move-result-object p1

    iput-object p1, p0, LKi/e$a;->a:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic c(LKi/e$a;)V
    .locals 0

    invoke-direct {p0}, LKi/e$a;->h()V

    return-void
.end method

.method public static final synthetic d(LKi/e$a;LIi/p;)V
    .locals 0

    iput-object p1, p0, LKi/e$a;->b:LIi/p;

    return-void
.end method

.method public static final synthetic e(LKi/e$a;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LKi/e$a;->a:Ljava/lang/Object;

    return-void
.end method

.method private final f(LKi/m;IJLdh/e;)Ljava/lang/Object;
    .locals 10

    iget-object v6, p0, LKi/e$a;->c:LKi/e;

    invoke-static {p5}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v0

    invoke-static {v0}, LIi/r;->b(Ldh/e;)LIi/p;

    move-result-object v7

    :try_start_0
    invoke-static {p0, v7}, LKi/e$a;->d(LKi/e$a;LIi/p;)V

    move-object v0, v6

    move-object v1, p1

    move v2, p2

    move-wide v3, p3

    move-object v5, p0

    invoke-static/range {v0 .. v5}, LKi/e;->F(LKi/e;LKi/m;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LKi/f;->r()LNi/C;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {v6, p0, p1, p2}, LKi/e;->C(LKi/e;LIi/a1;LKi/m;I)V

    goto/16 :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    invoke-static {}, LKi/f;->h()LNi/C;

    move-result-object p2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-ne v0, p2, :cond_a

    invoke-virtual {v6}, LKi/e;->l0()J

    move-result-wide v0

    cmp-long p2, p3, v0

    if-gez p2, :cond_1

    invoke-virtual {p1}, LNi/b;->c()V

    :cond_1
    invoke-static {}, LKi/e;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LKi/m;

    :cond_2
    :goto_0
    invoke-virtual {v6}, LKi/e;->t0()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {p0}, LKi/e$a;->c(LKi/e$a;)V

    goto/16 :goto_2

    :cond_3
    invoke-static {}, LKi/e;->t()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object p2

    invoke-virtual {p2, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide p2

    sget p4, LKi/f;->b:I

    int-to-long v0, p4

    div-long v0, p2, v0

    int-to-long v2, p4

    rem-long v2, p2, v2

    long-to-int p4, v2

    iget-wide v2, p1, LNi/z;->c:J

    cmp-long v2, v2, v0

    if-eqz v2, :cond_5

    invoke-static {v6, v0, v1, p1}, LKi/e;->p(LKi/e;JLKi/m;)LKi/m;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    move-object p1, v0

    :cond_5
    move-object v0, v6

    move-object v1, p1

    move v2, p4

    move-wide v3, p2

    move-object v5, p0

    invoke-static/range {v0 .. v5}, LKi/e;->F(LKi/e;LKi/m;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LKi/f;->r()LNi/C;

    move-result-object v1

    if-ne v0, v1, :cond_6

    invoke-static {v6, p0, p1, p4}, LKi/e;->C(LKi/e;LIi/a1;LKi/m;I)V

    goto :goto_2

    :cond_6
    invoke-static {}, LKi/f;->h()LNi/C;

    move-result-object p4

    if-ne v0, p4, :cond_7

    invoke-virtual {v6}, LKi/e;->l0()J

    move-result-wide v0

    cmp-long p2, p2, v0

    if-gez p2, :cond_2

    invoke-virtual {p1}, LNi/b;->c()V

    goto :goto_0

    :cond_7
    invoke-static {}, LKi/f;->s()LNi/C;

    move-result-object p2

    if-eq v0, p2, :cond_9

    invoke-virtual {p1}, LNi/b;->c()V

    invoke-static {p0, v0}, LKi/e$a;->e(LKi/e$a;Ljava/lang/Object;)V

    invoke-static {p0, v9}, LKi/e$a;->d(LKi/e$a;LIi/p;)V

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object p2, v6, LKi/e;->b:Lmh/l;

    if-eqz p2, :cond_8

    invoke-static {v6, p2, v0}, LKi/e;->m(LKi/e;Lmh/l;Ljava/lang/Object;)Lmh/q;

    move-result-object v9

    :cond_8
    :goto_1
    invoke-virtual {v7, p1, v9}, LIi/p;->b0(Ljava/lang/Object;Lmh/q;)V

    goto :goto_2

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "unexpected"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-virtual {p1}, LNi/b;->c()V

    invoke-static {p0, v0}, LKi/e$a;->e(LKi/e$a;Ljava/lang/Object;)V

    invoke-static {p0, v9}, LKi/e$a;->d(LKi/e$a;LIi/p;)V

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object p2, v6, LKi/e;->b:Lmh/l;

    if-eqz p2, :cond_8

    invoke-static {v6, p2, v0}, LKi/e;->m(LKi/e;Lmh/l;Ljava/lang/Object;)Lmh/q;

    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_2
    invoke-virtual {v7}, LIi/p;->u()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_b

    invoke-static {p5}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_b
    return-object p1

    :goto_3
    invoke-virtual {v7}, LIi/p;->K()V

    throw p1
.end method

.method private final g()Z
    .locals 1

    invoke-static {}, LKi/f;->z()LNi/C;

    move-result-object v0

    iput-object v0, p0, LKi/e$a;->a:Ljava/lang/Object;

    iget-object v0, p0, LKi/e$a;->c:LKi/e;

    invoke-virtual {v0}, LKi/e;->b0()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {v0}, LNi/B;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    throw v0
.end method

.method private final h()V
    .locals 3

    iget-object v0, p0, LKi/e$a;->b:LIi/p;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, LKi/e$a;->b:LIi/p;

    invoke-static {}, LKi/f;->z()LNi/C;

    move-result-object v1

    iput-object v1, p0, LKi/e$a;->a:Ljava/lang/Object;

    iget-object v1, p0, LKi/e$a;->c:LKi/e;

    invoke-virtual {v1}, LKi/e;->b0()Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, LYg/u;->b:LYg/u$a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object v2, LYg/u;->b:LYg/u$a;

    invoke-static {v1}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Ldh/e;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, LKi/e$a;->a:Ljava/lang/Object;

    invoke-static {}, LKi/f;->m()LNi/C;

    move-result-object v1

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, LKi/e$a;->a:Ljava/lang/Object;

    invoke-static {}, LKi/f;->z()LNi/C;

    move-result-object v1

    if-eq v0, v1, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, LKi/e$a;->c:LKi/e;

    invoke-static {}, LKi/e;->s()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LKi/m;

    :cond_1
    :goto_0
    invoke-virtual {v0}, LKi/e;->t0()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-direct {p0}, LKi/e$a;->g()Z

    move-result v2

    goto :goto_1

    :cond_2
    invoke-static {}, LKi/e;->t()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v9

    sget v3, LKi/f;->b:I

    int-to-long v4, v3

    div-long v4, v9, v4

    int-to-long v6, v3

    rem-long v6, v9, v6

    long-to-int v11, v6

    iget-wide v6, v1, LNi/z;->c:J

    cmp-long v3, v6, v4

    if-eqz v3, :cond_4

    invoke-static {v0, v4, v5, v1}, LKi/e;->p(LKi/e;JLKi/m;)LKi/m;

    move-result-object v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    move-object v1, v3

    :cond_4
    const/4 v8, 0x0

    move-object v3, v0

    move-object v4, v1

    move v5, v11

    move-wide v6, v9

    invoke-static/range {v3 .. v8}, LKi/e;->F(LKi/e;LKi/m;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {}, LKi/f;->r()LNi/C;

    move-result-object v4

    if-eq v3, v4, :cond_7

    invoke-static {}, LKi/f;->h()LNi/C;

    move-result-object v4

    if-ne v3, v4, :cond_5

    invoke-virtual {v0}, LKi/e;->l0()J

    move-result-wide v3

    cmp-long v3, v9, v3

    if-gez v3, :cond_1

    invoke-virtual {v1}, LNi/b;->c()V

    goto :goto_0

    :cond_5
    invoke-static {}, LKi/f;->s()LNi/C;

    move-result-object v0

    if-ne v3, v0, :cond_6

    move-object v4, p0

    move-object v5, v1

    move v6, v11

    move-wide v7, v9

    move-object v9, p1

    invoke-direct/range {v4 .. v9}, LKi/e$a;->f(LKi/m;IJLdh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_6
    invoke-virtual {v1}, LNi/b;->c()V

    iput-object v3, p0, LKi/e$a;->a:Ljava/lang/Object;

    :goto_1
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "unreachable"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(LNi/z;I)V
    .locals 1

    iget-object v0, p0, LKi/e$a;->b:LIi/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LIi/p;->b(LNi/z;I)V

    :cond_0
    return-void
.end method

.method public final i(Ljava/lang/Object;)Z
    .locals 5

    iget-object v0, p0, LKi/e$a;->b:LIi/p;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, LKi/e$a;->b:LIi/p;

    iput-object p1, p0, LKi/e$a;->a:Ljava/lang/Object;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v3, p0, LKi/e$a;->c:LKi/e;

    iget-object v4, v3, LKi/e;->b:Lmh/l;

    if-eqz v4, :cond_0

    invoke-static {v3, v4, p1}, LKi/e;->m(LKi/e;Lmh/l;Ljava/lang/Object;)Lmh/q;

    move-result-object v1

    :cond_0
    invoke-static {v0, v2, v1}, LKi/f;->u(LIi/n;Ljava/lang/Object;Lmh/q;)Z

    move-result p1

    return p1
.end method

.method public final j()V
    .locals 3

    iget-object v0, p0, LKi/e$a;->b:LIi/p;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, LKi/e$a;->b:LIi/p;

    invoke-static {}, LKi/f;->z()LNi/C;

    move-result-object v1

    iput-object v1, p0, LKi/e$a;->a:Ljava/lang/Object;

    iget-object v1, p0, LKi/e$a;->c:LKi/e;

    invoke-virtual {v1}, LKi/e;->b0()Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, LYg/u;->b:LYg/u$a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object v2, LYg/u;->b:LYg/u$a;

    invoke-static {v1}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public next()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LKi/e$a;->a:Ljava/lang/Object;

    invoke-static {}, LKi/f;->m()LNi/C;

    move-result-object v1

    if-eq v0, v1, :cond_1

    invoke-static {}, LKi/f;->m()LNi/C;

    move-result-object v1

    iput-object v1, p0, LKi/e$a;->a:Ljava/lang/Object;

    invoke-static {}, LKi/f;->z()LNi/C;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, LKi/e$a;->c:LKi/e;

    invoke-static {v0}, LKi/e;->r(LKi/e;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, LNi/B;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "`hasNext()` has not been invoked"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
