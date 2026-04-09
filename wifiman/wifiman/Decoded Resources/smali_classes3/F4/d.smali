.class public interface abstract LF4/d;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, LF4/A;->b(Ljava/lang/Class;)LF4/A;

    move-result-object p1

    invoke-interface {p0, p1}, LF4/d;->f(LF4/A;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(LF4/A;)Ljava/util/Set;
    .locals 0

    invoke-interface {p0, p1}, LF4/d;->h(LF4/A;)Lf5/b;

    move-result-object p1

    invoke-interface {p1}, Lf5/b;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    return-object p1
.end method

.method public abstract c(LF4/A;)Lf5/a;
.end method

.method public abstract d(LF4/A;)Lf5/b;
.end method

.method public e(Ljava/lang/Class;)Lf5/b;
    .locals 0

    invoke-static {p1}, LF4/A;->b(Ljava/lang/Class;)LF4/A;

    move-result-object p1

    invoke-interface {p0, p1}, LF4/d;->d(LF4/A;)Lf5/b;

    move-result-object p1

    return-object p1
.end method

.method public f(LF4/A;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0, p1}, LF4/d;->d(LF4/A;)Lf5/b;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {p1}, Lf5/b;->get()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public g(Ljava/lang/Class;)Ljava/util/Set;
    .locals 0

    invoke-static {p1}, LF4/A;->b(Ljava/lang/Class;)LF4/A;

    move-result-object p1

    invoke-interface {p0, p1}, LF4/d;->b(LF4/A;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public abstract h(LF4/A;)Lf5/b;
.end method

.method public i(Ljava/lang/Class;)Lf5/a;
    .locals 0

    invoke-static {p1}, LF4/A;->b(Ljava/lang/Class;)LF4/A;

    move-result-object p1

    invoke-interface {p0, p1}, LF4/d;->c(LF4/A;)Lf5/a;

    move-result-object p1

    return-object p1
.end method
