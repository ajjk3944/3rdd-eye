.class public abstract Lf2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;Lmh/l;)Lf2/e;
    .locals 2

    const-string v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf2/e;

    new-instance v1, Lf2/i;

    invoke-direct {v1}, Lf2/i;-><init>()V

    invoke-interface {p1, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lf2/i;->a()Lf2/h;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lf2/e;-><init>(Ljava/lang/String;Lf2/h;)V

    return-object v0
.end method
