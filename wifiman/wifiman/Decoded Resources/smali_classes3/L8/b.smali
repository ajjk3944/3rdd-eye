.class public abstract LL8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LW7/a;I)Ls9/d;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls9/d$a;

    invoke-virtual {p0}, LW7/a;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LL8/b$a;

    invoke-direct {v2, p1, p0}, LL8/b$a;-><init>(ILW7/a;)V

    invoke-direct {v0, v1, v2}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    return-object v0
.end method

.method public static synthetic b(LW7/a;IILjava/lang/Object;)Ls9/d;
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-static {p0, p1}, LL8/b;->a(LW7/a;I)Ls9/d;

    move-result-object p0

    return-object p0
.end method
