.class public abstract LIi/y0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIi/y0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static synthetic a(LIi/y0;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, LIi/y0;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static synthetic b(LIi/y0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-interface {p0, p1}, LIi/y0;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: cancel"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(LIi/y0;Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Ldh/i$b$a;->a(Ldh/i$b;Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static d(LIi/y0;Ldh/i$c;)Ldh/i$b;
    .locals 0

    invoke-static {p0, p1}, Ldh/i$b$a;->b(Ldh/i$b;Ldh/i$c;)Ldh/i$b;

    move-result-object p0

    return-object p0
.end method

.method public static e(LIi/y0;Ldh/i$c;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, Ldh/i$b$a;->c(Ldh/i$b;Ldh/i$c;)Ldh/i;

    move-result-object p0

    return-object p0
.end method

.method public static f(LIi/y0;LIi/y0;)LIi/y0;
    .locals 0

    return-object p1
.end method

.method public static g(LIi/y0;Ldh/i;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, Ldh/i$b$a;->d(Ldh/i$b;Ldh/i;)Ldh/i;

    move-result-object p0

    return-object p0
.end method
