.class public abstract LZ7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2

    const-string/jumbo v0, "message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    sget-object v0, LSj/a;->a:LSj/a$b;

    invoke-virtual {v0, p2}, LSj/a$b;->r(Ljava/lang/String;)LSj/a$c;

    :cond_0
    const/4 p2, 0x0

    if-eqz p1, :cond_1

    sget-object v0, LSj/a;->a:LSj/a$b;

    sget-object v1, LZ7/a;->a:LZ7/a;

    invoke-virtual {v1, p0}, LZ7/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-array p2, p2, [Ljava/lang/Object;

    invoke-virtual {v0, p1, p0, p2}, LSj/a$b;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    sget-object p1, LSj/a;->a:LSj/a$b;

    sget-object v0, LZ7/a;->a:LZ7/a;

    invoke-virtual {v0, p0}, LZ7/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-array p2, p2, [Ljava/lang/Object;

    invoke-virtual {p1, p0, p2}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static synthetic b(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p4, p3, 0x2

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-static {p0, p1, p2}, LZ7/b;->a(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public static final c(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2

    const-string/jumbo v0, "message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    sget-object v0, LSj/a;->a:LSj/a$b;

    invoke-virtual {v0, p2}, LSj/a$b;->r(Ljava/lang/String;)LSj/a$c;

    :cond_0
    const/4 p2, 0x0

    if-eqz p1, :cond_1

    sget-object v0, LSj/a;->a:LSj/a$b;

    sget-object v1, LZ7/a;->a:LZ7/a;

    invoke-virtual {v1, p0}, LZ7/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-array p2, p2, [Ljava/lang/Object;

    invoke-virtual {v0, p1, p0, p2}, LSj/a$b;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    sget-object p1, LSj/a;->a:LSj/a$b;

    sget-object v0, LZ7/a;->a:LZ7/a;

    invoke-virtual {v0, p0}, LZ7/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-array p2, p2, [Ljava/lang/Object;

    invoke-virtual {p1, p0, p2}, LSj/a$b;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static final d(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "exception"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    sget-object v0, LSj/a;->a:LSj/a$b;

    invoke-virtual {v0, p1}, LSj/a$b;->r(Ljava/lang/String;)LSj/a$c;

    :cond_0
    sget-object p1, LSj/a;->a:LSj/a$b;

    invoke-virtual {p1, p0}, LSj/a$b;->d(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p4, p3, 0x2

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-static {p0, p1, p2}, LZ7/b;->c(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic f(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LZ7/b;->d(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public static final g(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    sget-object v0, LSj/a;->a:LSj/a$b;

    invoke-virtual {v0, p1}, LSj/a$b;->r(Ljava/lang/String;)LSj/a$c;

    :cond_0
    sget-object p1, LSj/a;->a:LSj/a$b;

    sget-object v0, LZ7/a;->a:LZ7/a;

    invoke-virtual {v0, p0}, LZ7/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1, p0, v0}, LSj/a$b;->n(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final i(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2

    const-string/jumbo v0, "message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    sget-object v0, LSj/a;->a:LSj/a$b;

    invoke-virtual {v0, p2}, LSj/a$b;->r(Ljava/lang/String;)LSj/a$c;

    :cond_0
    const/4 p2, 0x0

    if-eqz p1, :cond_1

    sget-object v0, LSj/a;->a:LSj/a$b;

    sget-object v1, LZ7/a;->a:LZ7/a;

    invoke-virtual {v1, p0}, LZ7/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-array p2, p2, [Ljava/lang/Object;

    invoke-virtual {v0, p1, p0, p2}, LSj/a$b;->p(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    sget-object p1, LSj/a;->a:LSj/a$b;

    sget-object v0, LZ7/a;->a:LZ7/a;

    invoke-virtual {v0, p0}, LZ7/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-array p2, p2, [Ljava/lang/Object;

    invoke-virtual {p1, p0, p2}, LSj/a$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static synthetic j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p4, p3, 0x2

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-static {p0, p1, p2}, LZ7/b;->i(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method
