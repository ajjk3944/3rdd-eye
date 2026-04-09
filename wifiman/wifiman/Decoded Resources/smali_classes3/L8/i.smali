.class public abstract LL8/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lec/a;)Ls9/d;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lec/a$b;

    if-eqz v0, :cond_0

    new-instance v0, Ls9/d$c;

    check-cast p0, Lec/a$b;

    invoke-virtual {p0}, Lec/a$b;->b()Ljava/lang/CharSequence;

    move-result-object p0

    invoke-direct {v0, p0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lec/a$a;

    if-eqz v0, :cond_3

    new-instance v0, Ls9/d$b;

    check-cast p0, Lec/a$a;

    invoke-virtual {p0}, Lec/a$a;->c()I

    move-result v1

    invoke-virtual {p0}, Lec/a$a;->b()[Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, LZg/n;->d1([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    if-nez p0, :cond_2

    :cond_1
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p0

    :cond_2
    invoke-direct {v0, v1, p0}, Ls9/d$b;-><init>(ILjava/util/List;)V

    :goto_0
    return-object v0

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
