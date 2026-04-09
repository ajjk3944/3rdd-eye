.class public abstract Lbj/I;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Laj/b;Ljava/lang/String;)Lbj/H;
    .locals 1

    const-string v0, "json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Laj/b;->e()Laj/g;

    move-result-object p0

    invoke-virtual {p0}, Laj/g;->a()Z

    move-result p0

    if-nez p0, :cond_0

    new-instance p0, Lbj/H;

    invoke-direct {p0, p1}, Lbj/H;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p0, Lbj/J;

    invoke-direct {p0, p1}, Lbj/J;-><init>(Ljava/lang/String;)V

    :goto_0
    return-object p0
.end method
