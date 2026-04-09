.class public abstract Lbj/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lbj/o;Laj/b;)Lbj/h;
    .locals 1

    const-string v0, "sb"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Laj/b;->e()Laj/g;

    move-result-object v0

    invoke-virtual {v0}, Laj/g;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lbj/k;

    invoke-direct {v0, p0, p1}, Lbj/k;-><init>(Lbj/o;Laj/b;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lbj/h;

    invoke-direct {v0, p0}, Lbj/h;-><init>(Lbj/o;)V

    :goto_0
    return-object v0
.end method
