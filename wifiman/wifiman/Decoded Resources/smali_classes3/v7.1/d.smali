.class public abstract Lv7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a()Li9/a;
    .locals 1

    sget-object v0, Lo7/o;->a:Lo7/o;

    invoke-virtual {v0}, Lo7/o;->a()Li9/a;

    move-result-object v0

    return-object v0
.end method

.method public static final b(Lmh/a;)V
    .locals 1

    const-string/jumbo v0, "message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lv7/d;->a()Li9/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-interface {v0, p0}, Li9/a;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static final c(Lmh/a;Ljava/lang/Throwable;)V
    .locals 1

    const-string/jumbo v0, "message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lv7/d;->a()Li9/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-interface {v0, p0, p1}, Li9/a;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static synthetic d(Lmh/a;Ljava/lang/Throwable;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lv7/d;->c(Lmh/a;Ljava/lang/Throwable;)V

    return-void
.end method
