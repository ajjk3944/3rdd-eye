.class public abstract Lc/I;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lc/G;Landroidx/lifecycle/o;ZLmh/l;)Lc/F;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackPressed"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lc/I$a;

    invoke-direct {v0, p2, p3}, Lc/I$a;-><init>(ZLmh/l;)V

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1, v0}, Lc/G;->h(Landroidx/lifecycle/o;Lc/F;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lc/G;->i(Lc/F;)V

    :goto_0
    return-object v0
.end method

.method public static synthetic b(Lc/G;Landroidx/lifecycle/o;ZLmh/l;ILjava/lang/Object;)Lc/F;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p2, 0x1

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lc/I;->a(Lc/G;Landroidx/lifecycle/o;ZLmh/l;)Lc/F;

    move-result-object p0

    return-object p0
.end method
