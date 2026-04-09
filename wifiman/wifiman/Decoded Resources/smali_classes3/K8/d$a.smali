.class public abstract LK8/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(LK8/d;LFd/B;)Lcom/ui/wifiman/ui/teleport/z;
    .locals 1

    const/4 p0, -0x1

    if-nez p1, :cond_0

    move p1, p0

    goto :goto_0

    :cond_0
    sget-object v0, LK8/d$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    if-eq p1, p0, :cond_4

    const/4 p0, 0x1

    if-eq p1, p0, :cond_3

    const/4 p0, 0x2

    if-eq p1, p0, :cond_2

    const/4 p0, 0x3

    if-ne p1, p0, :cond_1

    sget-object p0, Lcom/ui/wifiman/ui/teleport/z;->UNSTABLE:Lcom/ui/wifiman/ui/teleport/z;

    goto :goto_1

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    sget-object p0, Lcom/ui/wifiman/ui/teleport/z;->ONLINE:Lcom/ui/wifiman/ui/teleport/z;

    goto :goto_1

    :cond_3
    sget-object p0, Lcom/ui/wifiman/ui/teleport/z;->OFFLINE:Lcom/ui/wifiman/ui/teleport/z;

    goto :goto_1

    :cond_4
    sget-object p0, Lcom/ui/wifiman/ui/teleport/z;->LOADING:Lcom/ui/wifiman/ui/teleport/z;

    :goto_1
    return-object p0
.end method

.method public static b(LK8/d;Lcom/ui/wifiman/model/teleport/h;)Ls9/a;
    .locals 13

    const-string p0, "$receiver"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/h;->n()Lxa/a$d;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    sget-object v1, Lcom/ubnt/usurvey/product/m$c;->NORMAL:Lcom/ubnt/usurvey/product/m$c;

    invoke-static {p0, v1}, Lcom/ubnt/usurvey/product/o;->b(Lxa/a$d;Lcom/ubnt/usurvey/product/m$c;)Lcom/ubnt/usurvey/product/m;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    if-eqz p0, :cond_3

    instance-of p1, p0, Lcom/ubnt/usurvey/product/m$a;

    if-eqz p1, :cond_1

    new-instance p1, Ls9/c$a;

    check-cast p0, Lcom/ubnt/usurvey/product/m$a;

    invoke-virtual {p0}, Lcom/ubnt/usurvey/product/m$a;->a()I

    move-result p0

    const/4 v1, 0x2

    invoke-direct {p1, p0, v0, v1, v0}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_1
    instance-of p1, p0, Lcom/ubnt/usurvey/product/m$b;

    if-eqz p1, :cond_2

    new-instance p1, Ls9/c$b;

    check-cast p0, Lcom/ubnt/usurvey/product/m$b;

    invoke-virtual {p0}, Lcom/ubnt/usurvey/product/m$b;->a()Ljava/net/URI;

    move-result-object v1

    new-instance p0, Ls9/b$a;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const v3, 0x7f0703c3

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Ls9/b$a;-><init>(ILs9/b$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, Ls9/c$b;-><init>(Ljava/net/URI;Ls9/a$b;Ls9/a$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/h;->p()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/h;->r()Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_5

    sget-object v0, LMd/g;->a:LMd/g$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/h;->p()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/h;->r()Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LMd/g$a;->b(LMd/g$a;Ljava/lang/String;ILjava/lang/Integer;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_4

    sget-object p1, LL8/j;->a:LL8/j;

    invoke-virtual {p1, p0}, LL8/j;->a(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v1

    if-eqz v1, :cond_4

    new-instance p1, Ls9/c$b;

    new-instance p0, Ls9/b$a;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const v3, 0x7f0703c3

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Ls9/b$a;-><init>(ILs9/b$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, Ls9/c$b;-><init>(Ljava/net/URI;Ls9/a$b;Ls9/a$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_4
    new-instance p1, Ls9/b$a;

    const/4 v11, 0x6

    const/4 v12, 0x0

    const v8, 0x7f0703c3

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v7, p1

    invoke-direct/range {v7 .. v12}, Ls9/b$a;-><init>(ILs9/b$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_5
    new-instance p1, Ls9/b$a;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const v1, 0x7f0703c3

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Ls9/b$a;-><init>(ILs9/b$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    return-object p1
.end method
