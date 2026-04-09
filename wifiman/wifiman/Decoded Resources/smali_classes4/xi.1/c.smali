.class public abstract Lxi/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lli/o;)LYh/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lli/o;->d()LWh/a;

    move-result-object p0

    instance-of v0, p0, LYh/e;

    if-eqz v0, :cond_0

    check-cast p0, LYh/e;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    sget-object p0, LYh/e;->i:LYh/e;

    :cond_1
    return-object p0
.end method
