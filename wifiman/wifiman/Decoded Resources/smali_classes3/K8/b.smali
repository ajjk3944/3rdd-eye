.class public abstract LK8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LId/c;)Ls9/d;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LId/c$h;

    if-eqz v0, :cond_0

    new-instance p0, Ls9/d$a;

    const-string/jumbo v0, "unknown"

    sget-object v1, LK8/b$a;->a:LK8/b$a;

    invoke-direct {p0, v0, v1}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    goto :goto_1

    :cond_0
    instance-of v0, p0, LId/c$b;

    if-nez v0, :cond_6

    instance-of v0, p0, LId/c$a;

    if-nez v0, :cond_6

    instance-of v0, p0, LId/c$g;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    instance-of v0, p0, LId/c$f;

    if-eqz v0, :cond_2

    new-instance p0, Ls9/d$b;

    const v0, 0x7f110304

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_1

    :cond_2
    instance-of v0, p0, LId/c$d;

    if-eqz v0, :cond_3

    new-instance p0, Ls9/d$b;

    const v0, 0x7f110306

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_1

    :cond_3
    instance-of v0, p0, LId/c$e;

    if-eqz v0, :cond_4

    new-instance p0, Ls9/d$b;

    const v0, 0x7f110308

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_1

    :cond_4
    instance-of p0, p0, LId/c$c;

    if-eqz p0, :cond_5

    const/4 p0, 0x0

    goto :goto_1

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_6
    :goto_0
    new-instance p0, Ls9/d$a;

    const-string/jumbo v0, "tunnelConnection"

    sget-object v1, LK8/b$b;->a:LK8/b$b;

    invoke-direct {p0, v0, v1}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    :goto_1
    return-object p0
.end method

.method public static final b(LId/c;)Lec/a;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LId/c$h;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance p0, Lec/a$a;

    const v0, 0x7f11030b

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lec/a$a;-><init>(I[Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    instance-of v0, p0, LId/c$b;

    if-nez v0, :cond_6

    instance-of v0, p0, LId/c$a;

    if-nez v0, :cond_6

    instance-of v0, p0, LId/c$g;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    instance-of v0, p0, LId/c$f;

    if-eqz v0, :cond_2

    new-instance p0, Lec/a$a;

    const v0, 0x7f110305

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lec/a$a;-><init>(I[Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    instance-of v0, p0, LId/c$d;

    if-eqz v0, :cond_3

    new-instance p0, Lec/a$a;

    const v0, 0x7f110307

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lec/a$a;-><init>(I[Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    instance-of v0, p0, LId/c$e;

    if-eqz v0, :cond_4

    new-instance p0, Lec/a$a;

    const v0, 0x7f110309

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lec/a$a;-><init>(I[Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    instance-of p0, p0, LId/c$c;

    if-eqz p0, :cond_5

    const/4 p0, 0x0

    goto :goto_1

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_6
    :goto_0
    new-instance p0, Lec/a$a;

    const v0, 0x7f110303

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lec/a$a;-><init>(I[Ljava/lang/Object;)V

    :goto_1
    return-object p0
.end method

.method public static final c(LId/c;)Lec/a;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lec/a$a;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const v1, 0x7f1102d8

    invoke-direct {p0, v1, v0}, Lec/a$a;-><init>(I[Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final d(LId/c;)Ls9/d;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LId/c$h;

    if-eqz v0, :cond_0

    new-instance p0, Ls9/d$b;

    const v0, 0x7f11030b

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_1

    :cond_0
    instance-of v0, p0, LId/c$b;

    if-nez v0, :cond_6

    instance-of v0, p0, LId/c$a;

    if-nez v0, :cond_6

    instance-of v0, p0, LId/c$g;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    instance-of v0, p0, LId/c$f;

    if-eqz v0, :cond_2

    new-instance p0, Ls9/d$b;

    const v0, 0x7f110305

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_1

    :cond_2
    instance-of v0, p0, LId/c$d;

    if-eqz v0, :cond_3

    new-instance p0, Ls9/d$b;

    const v0, 0x7f110307

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_1

    :cond_3
    instance-of v0, p0, LId/c$e;

    if-eqz v0, :cond_4

    new-instance p0, Ls9/d$b;

    const v0, 0x7f110309

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_1

    :cond_4
    instance-of p0, p0, LId/c$c;

    if-eqz p0, :cond_5

    const/4 p0, 0x0

    goto :goto_1

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_6
    :goto_0
    new-instance p0, Ls9/d$b;

    const v0, 0x7f110303

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    :goto_1
    return-object p0
.end method
