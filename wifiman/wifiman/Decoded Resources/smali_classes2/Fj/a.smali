.class public LFj/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEj/b;


# instance fields
.field a:Ljava/lang/String;

.field b:LGj/f;

.field c:Ljava/util/Queue;


# direct methods
.method public constructor <init>(LGj/f;Ljava/util/Queue;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFj/a;->b:LGj/f;

    invoke-virtual {p1}, LGj/f;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LFj/a;->a:Ljava/lang/String;

    iput-object p2, p0, LFj/a;->c:Ljava/util/Queue;

    return-void
.end method

.method private b(LFj/b;LEj/d;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 3

    new-instance v0, LFj/d;

    invoke-direct {v0}, LFj/d;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LFj/d;->j(J)V

    invoke-virtual {v0, p1}, LFj/d;->c(LFj/b;)V

    iget-object p1, p0, LFj/a;->b:LGj/f;

    invoke-virtual {v0, p1}, LFj/d;->d(LGj/f;)V

    iget-object p1, p0, LFj/a;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, LFj/d;->e(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, LFj/d;->f(LEj/d;)V

    invoke-virtual {v0, p3}, LFj/d;->g(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LFj/d;->h(Ljava/lang/String;)V

    invoke-virtual {v0, p4}, LFj/d;->b([Ljava/lang/Object;)V

    invoke-virtual {v0, p5}, LFj/d;->i(Ljava/lang/Throwable;)V

    iget-object p1, p0, LFj/a;->c:Ljava/util/Queue;

    invoke-interface {p1, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private e(LFj/b;LEj/d;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    instance-of v1, p5, Ljava/lang/Throwable;

    if-eqz v1, :cond_0

    filled-new-array {p4}, [Ljava/lang/Object;

    move-result-object v6

    move-object v7, p5

    check-cast v7, Ljava/lang/Throwable;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v2 .. v7}, LFj/a;->b(LFj/b;LEj/d;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    filled-new-array {p4, p5}, [Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, LFj/a;->b(LFj/b;LEj/d;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private f(LFj/b;LEj/d;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 12

    invoke-static/range {p4 .. p4}, LGj/b;->a([Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-static/range {p4 .. p4}, LGj/b;->b([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, LFj/a;->b(LFj/b;LEj/d;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    const/4 v11, 0x0

    move-object v6, p0

    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    move-object/from16 v10, p4

    invoke-direct/range {v6 .. v11}, LFj/a;->b(LFj/b;LEj/d;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private i(LFj/b;LEj/d;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 6

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LFj/a;->b(LFj/b;LEj/d;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method private k(LFj/b;LEj/d;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 6

    filled-new-array {p4}, [Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, LFj/a;->b(LFj/b;LEj/d;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    sget-object v0, LFj/b;->WARN:LFj/b;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, LFj/a;->k(LFj/b;LEj/d;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    sget-object v1, LFj/b;->DEBUG:LFj/b;

    const/4 v2, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, LFj/a;->e(LFj/b;LEj/d;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    sget-object v0, LFj/b;->TRACE:LFj/b;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, LFj/a;->k(LFj/b;LEj/d;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public g(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    sget-object v1, LFj/b;->TRACE:LFj/b;

    const/4 v2, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, LFj/a;->e(LFj/b;LEj/d;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LFj/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public varargs h(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    sget-object v0, LFj/b;->WARN:LFj/b;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, LFj/a;->f(LFj/b;LEj/d;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public isDebugEnabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    sget-object v1, LFj/b;->WARN:LFj/b;

    const/4 v2, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, LFj/a;->e(LFj/b;LEj/d;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public l(Ljava/lang/String;)V
    .locals 2

    sget-object v0, LFj/b;->DEBUG:LFj/b;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, v1}, LFj/a;->i(LFj/b;LEj/d;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public m()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public n(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    sget-object v0, LFj/b;->DEBUG:LFj/b;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, LFj/a;->k(LFj/b;LEj/d;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public varargs o(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    sget-object v0, LFj/b;->DEBUG:LFj/b;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, LFj/a;->f(LFj/b;LEj/d;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public p(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    sget-object v0, LFj/b;->INFO:LFj/b;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, LFj/a;->i(LFj/b;LEj/d;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public r(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    sget-object v0, LFj/b;->WARN:LFj/b;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, LFj/a;->i(LFj/b;LEj/d;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public s(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    sget-object v0, LFj/b;->DEBUG:LFj/b;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, LFj/a;->i(LFj/b;LEj/d;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public t(Ljava/lang/String;)V
    .locals 2

    sget-object v0, LFj/b;->WARN:LFj/b;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, v1}, LFj/a;->i(LFj/b;LEj/d;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public varargs v(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    sget-object v0, LFj/b;->TRACE:LFj/b;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1, p2}, LFj/a;->f(LFj/b;LEj/d;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
