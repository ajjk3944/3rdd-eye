.class public abstract LV6/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LS6/j;LV6/p;)LV6/f;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "glideRequestType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LS6/j$c;

    if-eqz v0, :cond_0

    sget-object p0, LV6/f$c;->a:LV6/f$c;

    goto :goto_1

    :cond_0
    instance-of v0, p0, LS6/j$b;

    if-eqz v0, :cond_1

    sget-object p0, LV6/f$b;->a:LV6/f$b;

    goto :goto_1

    :cond_1
    instance-of v0, p0, LS6/j$d;

    if-eqz v0, :cond_2

    new-instance v0, LV6/f$d;

    check-cast p0, LS6/j$d;

    invoke-virtual {p0}, LS6/j$d;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, LS6/j$d;->b()LS6/a;

    move-result-object p0

    invoke-direct {v0, v1, p0, p1}, LV6/f$d;-><init>(Ljava/lang/Object;LS6/a;LV6/p;)V

    move-object p0, v0

    goto :goto_1

    :cond_2
    instance-of p1, p0, LS6/j$a;

    if-eqz p1, :cond_4

    new-instance p1, LV6/f$a;

    check-cast p0, LS6/j$a;

    invoke-virtual {p0}, LS6/j$a;->a()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_3

    check-cast v0, Landroid/graphics/drawable/Drawable;

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, LS6/j$a;->b()Ljava/lang/Throwable;

    move-result-object p0

    invoke-direct {p1, v0, p0}, LV6/f$a;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/Throwable;)V

    move-object p0, p1

    :goto_1
    return-object p0

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
