.class public abstract LU9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU9/e$a;
    }
.end annotation


# direct methods
.method public static synthetic a()Ljava/lang/String;
    .locals 1

    invoke-static {}, LU9/e;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(LEb/w;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, LU9/e;->d(LEb/w;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LEb/z;)LU9/b;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LEb/z;->d()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    move-object v3, v2

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x2

    if-eqz v4, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LEb/w;

    invoke-virtual {v4}, LEb/w;->g()LEb/w$f;

    move-result-object v6

    sget-object v7, LU9/e$a;->a:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v7, v6

    const/4 v7, 0x1

    if-eq v6, v7, :cond_3

    if-eq v6, v5, :cond_3

    const/4 v7, 0x3

    if-ne v6, v7, :cond_2

    new-instance v6, LU9/c;

    invoke-direct {v6, v4}, LU9/c;-><init>(LEb/w;)V

    invoke-static {v6, v2, v5, v2}, LS9/a;->f(Lmh/a;Ljava/lang/Throwable;ILjava/lang/Object;)V

    :cond_1
    move-object v5, v2

    goto :goto_3

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    instance-of v5, v4, LEb/w$c;

    if-nez v5, :cond_6

    instance-of v5, v4, LEb/w$e;

    if-nez v5, :cond_6

    instance-of v5, v4, LEb/w$d;

    if-nez v5, :cond_6

    instance-of v5, v4, LEb/w$g;

    if-nez v5, :cond_6

    instance-of v5, v4, LEb/w$a;

    if-eqz v5, :cond_4

    goto :goto_1

    :cond_4
    instance-of v5, v4, LEb/w$h;

    if-eqz v5, :cond_5

    move-object v5, v2

    goto :goto_2

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_6
    :goto_1
    move-object v5, v4

    :goto_2
    if-eqz v5, :cond_1

    invoke-virtual {p0}, LEb/z;->e()LEb/C;

    move-result-object v6

    invoke-virtual {v6}, LEb/C;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, LEb/w;->f()Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    move-object v3, v5

    :cond_7
    :goto_3
    if-eqz v5, :cond_0

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_8
    invoke-static {v1}, LZg/v;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    if-nez v3, :cond_9

    new-instance v0, LU9/d;

    invoke-direct {v0}, LU9/d;-><init>()V

    invoke-static {v0, v2, v5, v2}, LS9/a;->f(Lmh/a;Ljava/lang/Throwable;ILjava/lang/Object;)V

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, LZg/v;->r0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v3

    :cond_9
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    const-string/jumbo v1, "no primary MFA method available"

    if-nez v0, :cond_b

    check-cast v3, LEb/w;

    if-eqz v3, :cond_a

    new-instance v0, LU9/b;

    invoke-direct {v0, v3, p0, v2}, LU9/b;-><init>(LEb/w;Ljava/util/Set;LEb/w;)V

    return-object v0

    :cond_a
    new-instance p0, Lcom/ui/core/ui/sso/UiSSO$Error$InvalidMFAParams;

    invoke-direct {p0, v1}, Lcom/ui/core/ui/sso/UiSSO$Error$InvalidMFAParams;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b
    new-instance p0, Lcom/ui/core/ui/sso/UiSSO$Error$InvalidMFAParams;

    invoke-direct {p0, v1}, Lcom/ui/core/ui/sso/UiSSO$Error$InvalidMFAParams;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final d(LEb/w;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "MFA Auth has unknown state - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final e()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "MFA no primary method received, choosing the first one in the list"

    return-object v0
.end method
