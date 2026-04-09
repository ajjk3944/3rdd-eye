.class public abstract Luj/t;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Luj/d;Lrj/m2;Ljava/lang/Object;)Lorg/kodein/di/f;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctx"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Luj/d;->a(Lrj/m2;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object p2, Lorg/kodein/di/f;->a:Lorg/kodein/di/f$a;

    invoke-interface {p0}, Luj/d;->c()Lorg/kodein/type/q;

    move-result-object p0

    invoke-virtual {p2, p0, p1}, Lorg/kodein/di/f$a;->a(Lorg/kodein/type/q;Ljava/lang/Object;)Lorg/kodein/di/f;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
