.class public abstract Ldh/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldh/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Ldh/f;Ldh/i$c;)Ldh/i$b;
    .locals 2

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ldh/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Ldh/b;

    invoke-interface {p0}, Ldh/i$b;->getKey()Ldh/i$c;

    move-result-object v0

    invoke-virtual {p1, v0}, Ldh/b;->a(Ldh/i$c;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, Ldh/b;->b(Ldh/i$b;)Ldh/i$b;

    move-result-object p0

    if-eqz p0, :cond_0

    move-object v1, p0

    :cond_0
    return-object v1

    :cond_1
    sget-object v0, Ldh/f;->m0:Ldh/f$b;

    if-ne v0, p1, :cond_2

    const-string p1, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object p0, v1

    :goto_0
    return-object p0
.end method

.method public static b(Ldh/f;Ldh/i$c;)Ldh/i;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ldh/b;

    if-eqz v0, :cond_1

    check-cast p1, Ldh/b;

    invoke-interface {p0}, Ldh/i$b;->getKey()Ldh/i$c;

    move-result-object v0

    invoke-virtual {p1, v0}, Ldh/b;->a(Ldh/i$c;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, Ldh/b;->b(Ldh/i$b;)Ldh/i$b;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object p0, Ldh/j;->a:Ldh/j;

    :cond_0
    return-object p0

    :cond_1
    sget-object v0, Ldh/f;->m0:Ldh/f$b;

    if-ne v0, p1, :cond_2

    sget-object p0, Ldh/j;->a:Ldh/j;

    :cond_2
    return-object p0
.end method
