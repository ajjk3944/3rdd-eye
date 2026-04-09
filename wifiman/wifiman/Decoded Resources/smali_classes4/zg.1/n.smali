.class public abstract Lzg/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(ZZLDj/b;ZLDg/g;Lzg/m;)Z
    .locals 2

    invoke-interface {p5}, Lzg/m;->c()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {p4}, LDg/g;->clear()V

    return v1

    :cond_0
    if-eqz p0, :cond_4

    if-eqz p3, :cond_2

    if-eqz p1, :cond_4

    invoke-interface {p5}, Lzg/m;->error()Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p2, p0}, LDj/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, LDj/b;->a()V

    :goto_0
    return v1

    :cond_2
    invoke-interface {p5}, Lzg/m;->error()Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-interface {p4}, LDg/g;->clear()V

    invoke-interface {p2, p0}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return v1

    :cond_3
    if-eqz p1, :cond_4

    invoke-interface {p2}, LDj/b;->a()V

    return v1

    :cond_4
    const/4 p0, 0x0

    return p0
.end method

.method public static b(LDg/f;LDj/b;ZLhg/c;Lzg/m;)V
    .locals 10

    const/4 v0, 0x1

    move v1, v0

    :cond_0
    :goto_0
    invoke-interface {p4}, Lzg/m;->b()Z

    move-result v2

    invoke-interface {p0}, LDg/f;->poll()Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_1

    move v9, v0

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    move v9, v3

    :goto_1
    move v3, v9

    move-object v4, p1

    move v5, p2

    move-object v6, p0

    move-object v7, p4

    invoke-static/range {v2 .. v7}, Lzg/n;->a(ZZLDj/b;ZLDg/g;Lzg/m;)Z

    move-result v2

    if-eqz v2, :cond_3

    if-eqz p3, :cond_2

    invoke-interface {p3}, Lhg/c;->dispose()V

    :cond_2
    return-void

    :cond_3
    if-eqz v9, :cond_4

    neg-int v1, v1

    invoke-interface {p4, v1}, Lzg/m;->e(I)I

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_4
    invoke-interface {p4}, Lzg/m;->d()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-eqz v4, :cond_5

    invoke-interface {p4, p1, v8}, Lzg/m;->g(LDj/b;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-wide v4, 0x7fffffffffffffffL

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    const-wide/16 v2, 0x1

    invoke-interface {p4, v2, v3}, Lzg/m;->f(J)J

    goto :goto_0

    :cond_5
    invoke-interface {p0}, LDg/g;->clear()V

    if-eqz p3, :cond_6

    invoke-interface {p3}, Lhg/c;->dispose()V

    :cond_6
    invoke-static {}, Lio/reactivex/rxjava3/exceptions/MissingBackpressureException;->a()Lio/reactivex/rxjava3/exceptions/MissingBackpressureException;

    move-result-object p0

    invoke-interface {p1, p0}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
