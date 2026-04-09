.class public abstract LS6/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LS6/k;LJ0/w;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LS6/m;->c(LS6/k;LJ0/w;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LS6/k;)Landroidx/compose/ui/e;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "imageOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LS6/k;->f()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, LS6/l;

    invoke-direct {v0, p1}, LS6/l;-><init>(LS6/k;)V

    const/4 p1, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, p1, v1}, LJ0/m;->c(Landroidx/compose/ui/e;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method private static final c(LS6/k;LJ0/w;)LYg/J;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LS6/k;->f()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, LJ0/t;->a0(LJ0/w;Ljava/lang/String;)V

    sget-object p0, LJ0/g;->b:LJ0/g$a;

    invoke-virtual {p0}, LJ0/g$a;->d()I

    move-result p0

    invoke-static {p1, p0}, LJ0/t;->i0(LJ0/w;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
