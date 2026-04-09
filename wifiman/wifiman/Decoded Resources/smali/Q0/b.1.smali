.class public abstract LQ0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LQ0/N;Landroid/content/Context;)Landroid/graphics/Typeface;
    .locals 0

    invoke-static {p0, p1}, LQ0/b;->c(LQ0/N;Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LQ0/N;Landroid/content/Context;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LQ0/b;->d(LQ0/N;Landroid/content/Context;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LQ0/N;Landroid/content/Context;)Landroid/graphics/Typeface;
    .locals 0

    invoke-virtual {p0}, LQ0/N;->d()I

    move-result p0

    invoke-static {p1, p0}, Lv1/h;->g(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object p0
.end method

.method private static final d(LQ0/N;Landroid/content/Context;Ldh/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, LIi/p;

    invoke-static {p2}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v0}, LIi/p;->A()V

    invoke-virtual {p0}, LQ0/N;->d()I

    move-result v1

    new-instance v2, LQ0/b$a;

    invoke-direct {v2, v0, p0}, LQ0/b$a;-><init>(LIi/n;LQ0/N;)V

    const/4 p0, 0x0

    invoke-static {p1, v1, v2, p0}, Lv1/h;->i(Landroid/content/Context;ILv1/h$e;Landroid/os/Handler;)V

    invoke-virtual {v0}, LIi/p;->u()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_0
    return-object p0
.end method
