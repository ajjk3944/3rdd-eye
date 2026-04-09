.class public abstract Lc3/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(La3/h;La3/e;)V
    .locals 1

    instance-of v0, p0, Lc3/s;

    if-eqz v0, :cond_0

    check-cast p0, Lc3/s;

    invoke-virtual {p0}, Lc3/s;->d()Lc3/p;

    move-result-object p0

    invoke-virtual {p0, p1}, Lc3/p;->f(La3/e;)Lc3/p;

    move-result-object p0

    invoke-static {}, Lc3/u;->c()Lc3/u;

    move-result-object p1

    invoke-virtual {p1}, Lc3/u;->e()Lj3/r;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, p0, v0}, Lj3/r;->u(Lc3/p;I)Ld3/g;

    goto :goto_0

    :cond_0
    const-string p1, "ForcedSender"

    const-string v0, "Expected instance of `TransportImpl`, got `%s`."

    invoke-static {p1, v0, p0}, Lg3/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
