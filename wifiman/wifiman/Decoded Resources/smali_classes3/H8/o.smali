.class public abstract LH8/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LId/a$c;)Ls9/d;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LId/a$c$e;

    if-eqz v0, :cond_0

    new-instance p0, Ls9/d$b;

    const v0, 0x7f1102e0

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_0
    instance-of v0, p0, LId/a$c$f;

    if-eqz v0, :cond_1

    new-instance p0, Ls9/d$b;

    const v0, 0x7f1102e2

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_1
    instance-of v0, p0, LId/a$c$b;

    if-eqz v0, :cond_2

    new-instance p0, Ls9/d$b;

    const v0, 0x7f1102de

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_2
    instance-of v0, p0, LId/a$c$d;

    if-eqz v0, :cond_3

    new-instance p0, Ls9/d$b;

    const v0, 0x7f1102dc

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_3
    instance-of v0, p0, LId/a$c$a;

    if-eqz v0, :cond_4

    new-instance p0, Ls9/d$b;

    const v0, 0x7f110316

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_4
    instance-of v0, p0, LId/a$c$c;

    if-eqz v0, :cond_5

    new-instance p0, Ls9/d$b;

    const v0, 0x7f1102d9

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_5
    instance-of p0, p0, LId/a$c$g;

    if-eqz p0, :cond_6

    new-instance p0, Ls9/d$b;

    const v0, 0x7f110308

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    :goto_0
    return-object p0

    :cond_6
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final b(LId/a$c;)Ls9/d;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls9/d$b;

    invoke-static {p0}, LId/g;->a(LId/a$c;)I

    move-result p0

    invoke-direct {v0, p0}, Ls9/d$b;-><init>(I)V

    return-object v0
.end method
