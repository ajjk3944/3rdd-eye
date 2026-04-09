.class public abstract Laj/w;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Laj/b;Lmh/l;)Laj/b;
    .locals 1

    const-string v0, "from"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builderAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Laj/e;

    invoke-direct {v0, p0}, Laj/e;-><init>(Laj/b;)V

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Laj/e;->a()Laj/g;

    move-result-object p0

    new-instance p1, Laj/v;

    invoke-virtual {v0}, Laj/e;->b()Lcj/e;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Laj/v;-><init>(Laj/g;Lcj/e;)V

    return-object p1
.end method

.method public static synthetic b(Laj/b;Lmh/l;ILjava/lang/Object;)Laj/b;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p0, Laj/b;->d:Laj/b$a;

    :cond_0
    invoke-static {p0, p1}, Laj/w;->a(Laj/b;Lmh/l;)Laj/b;

    move-result-object p0

    return-object p0
.end method
