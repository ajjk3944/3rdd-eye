.class public abstract Ldh/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldh/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static synthetic a(Ldh/i;Ldh/i$b;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, Ldh/i$a;->c(Ldh/i;Ldh/i$b;)Ldh/i;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ldh/i;Ldh/i;)Ldh/i;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ldh/j;->a:Ldh/j;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ldh/h;

    invoke-direct {v0}, Ldh/h;-><init>()V

    invoke-interface {p1, p0, v0}, Ldh/i;->fold(Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldh/i;

    :goto_0
    return-object p0
.end method

.method private static c(Ldh/i;Ldh/i$b;)Ldh/i;
    .locals 3

    const-string v0, "acc"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ldh/i$b;->getKey()Ldh/i$c;

    move-result-object v0

    invoke-interface {p0, v0}, Ldh/i;->minusKey(Ldh/i$c;)Ldh/i;

    move-result-object p0

    sget-object v0, Ldh/j;->a:Ldh/j;

    if-ne p0, v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v1, Ldh/f;->m0:Ldh/f$b;

    invoke-interface {p0, v1}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v2

    check-cast v2, Ldh/f;

    if-nez v2, :cond_1

    new-instance v0, Ldh/d;

    invoke-direct {v0, p0, p1}, Ldh/d;-><init>(Ldh/i;Ldh/i$b;)V

    :goto_0
    move-object p1, v0

    goto :goto_1

    :cond_1
    invoke-interface {p0, v1}, Ldh/i;->minusKey(Ldh/i$c;)Ldh/i;

    move-result-object p0

    if-ne p0, v0, :cond_2

    new-instance p0, Ldh/d;

    invoke-direct {p0, p1, v2}, Ldh/d;-><init>(Ldh/i;Ldh/i$b;)V

    move-object p1, p0

    goto :goto_1

    :cond_2
    new-instance v0, Ldh/d;

    new-instance v1, Ldh/d;

    invoke-direct {v1, p0, p1}, Ldh/d;-><init>(Ldh/i;Ldh/i$b;)V

    invoke-direct {v0, v1, v2}, Ldh/d;-><init>(Ldh/i;Ldh/i$b;)V

    goto :goto_0

    :goto_1
    return-object p1
.end method
