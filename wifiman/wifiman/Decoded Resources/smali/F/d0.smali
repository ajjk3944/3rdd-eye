.class public abstract LF/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/e;Ly/m;ZLmh/l;)Landroidx/compose/ui/e;
    .locals 0

    if-eqz p2, :cond_0

    new-instance p2, LF/d0$a;

    invoke-direct {p2, p3, p1}, LF/d0$a;-><init>(Lmh/l;Ly/m;)V

    const/4 p1, 0x1

    const/4 p3, 0x0

    invoke-static {p0, p3, p2, p1, p3}, Landroidx/compose/ui/c;->c(Landroidx/compose/ui/e;Lmh/l;Lmh/q;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p0

    :cond_0
    return-object p0
.end method
