.class public abstract Lorg/kodein/di/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/kodein/di/g;

    invoke-interface {p0}, Lorg/kodein/di/c;->i()Lrj/l2;

    invoke-interface {p0}, Lorg/kodein/di/c;->I()Lorg/kodein/di/f;

    move-result-object v1

    new-instance v2, Lorg/kodein/di/d$a;

    invoke-direct {v2, p0, p1, p2}, Lorg/kodein/di/d$a;-><init>(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)V

    const/4 p0, 0x0

    invoke-direct {v0, p0, v1, v2}, Lorg/kodein/di/g;-><init>(Lrj/l2;Lorg/kodein/di/f;Lmh/p;)V

    return-object v0
.end method

.method public static final b(Lorg/kodein/di/c;Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Lmh/a;)Lrj/x2;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "argType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arg"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/kodein/di/g;

    invoke-interface {p0}, Lorg/kodein/di/c;->i()Lrj/l2;

    invoke-interface {p0}, Lorg/kodein/di/c;->I()Lorg/kodein/di/f;

    move-result-object v1

    new-instance v8, Lorg/kodein/di/d$b;

    move-object v2, v8

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Lorg/kodein/di/d$b;-><init>(Lorg/kodein/di/c;Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Lmh/a;)V

    const/4 p0, 0x0

    invoke-direct {v0, p0, v1, v8}, Lorg/kodein/di/g;-><init>(Lrj/l2;Lorg/kodein/di/f;Lmh/p;)V

    return-object v0
.end method

.method public static final c(Lorg/kodein/di/c;Lorg/kodein/di/f;Lrj/l2;)Lorg/kodein/di/DI;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/kodein/di/i;

    invoke-direct {v0, p0, p1, p2}, Lorg/kodein/di/i;-><init>(Lorg/kodein/di/c;Lorg/kodein/di/f;Lrj/l2;)V

    return-object v0
.end method

.method public static synthetic d(Lorg/kodein/di/c;Lorg/kodein/di/f;Lrj/l2;ILjava/lang/Object;)Lorg/kodein/di/DI;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    invoke-interface {p0}, Lorg/kodein/di/c;->I()Lorg/kodein/di/f;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    invoke-interface {p0}, Lorg/kodein/di/c;->i()Lrj/l2;

    const/4 p2, 0x0

    :cond_1
    invoke-static {p0, p1, p2}, Lorg/kodein/di/d;->c(Lorg/kodein/di/c;Lorg/kodein/di/f;Lrj/l2;)Lorg/kodein/di/DI;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Lorg/kodein/di/f;
    .locals 1

    sget-object v0, Lorg/kodein/di/b;->a:Lorg/kodein/di/b;

    invoke-virtual {v0}, Lorg/kodein/di/b;->a()Lorg/kodein/di/f;

    move-result-object v0

    return-object v0
.end method

.method public static final f(Lorg/kodein/di/c;)Lrj/m2;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvj/i;

    invoke-interface {p0}, Lorg/kodein/di/c;->d()Lorg/kodein/di/DI;

    move-result-object v1

    invoke-interface {v1}, Lorg/kodein/di/DI;->y()Lorg/kodein/di/e;

    move-result-object v1

    invoke-interface {p0}, Lorg/kodein/di/c;->I()Lorg/kodein/di/f;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lvj/i;-><init>(Lorg/kodein/di/e;Lorg/kodein/di/f;)V

    return-object v0
.end method
