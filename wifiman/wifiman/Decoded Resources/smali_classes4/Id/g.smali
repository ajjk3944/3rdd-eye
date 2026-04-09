.class public abstract LId/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LId/a$c;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LId/a$c$e;

    if-eqz v0, :cond_0

    sget p0, Ljc/d;->i:I

    goto :goto_0

    :cond_0
    instance-of v0, p0, LId/a$c$f;

    if-eqz v0, :cond_1

    sget p0, Ljc/d;->j:I

    goto :goto_0

    :cond_1
    instance-of v0, p0, LId/a$c$b;

    if-eqz v0, :cond_2

    sget p0, Ljc/d;->h:I

    goto :goto_0

    :cond_2
    instance-of v0, p0, LId/a$c$d;

    if-eqz v0, :cond_3

    sget p0, Ljc/d;->g:I

    goto :goto_0

    :cond_3
    instance-of v0, p0, LId/a$c$a;

    if-eqz v0, :cond_4

    sget p0, Ljc/d;->m:I

    goto :goto_0

    :cond_4
    instance-of v0, p0, LId/a$c$c;

    if-eqz v0, :cond_5

    sget p0, Ljc/d;->f:I

    goto :goto_0

    :cond_5
    instance-of p0, p0, LId/a$c$g;

    if-eqz p0, :cond_6

    sget p0, Ljc/d;->l:I

    :goto_0
    return p0

    :cond_6
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
