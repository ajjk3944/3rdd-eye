.class public abstract LId/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LId/b$a;
    }
.end annotation


# direct methods
.method public static final a(Lcom/ui/wifiman/model/teleport/h;ZLOd/a;)LId/a;
    .locals 3

    const-string v0, "console"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    sget-object p0, LId/a$c$d;->a:LId/a$c$d;

    goto/16 :goto_5

    :cond_0
    if-nez p2, :cond_1

    sget-object p0, LId/a$b;->a:LId/a$b;

    goto/16 :goto_5

    :cond_1
    invoke-interface {p2}, LOd/a;->b()LOd/a$b;

    move-result-object p1

    instance-of p1, p1, LOd/a$b$b$a;

    if-eqz p1, :cond_2

    sget-object p0, LId/a$c$a;->a:LId/a$c$a;

    goto/16 :goto_5

    :cond_2
    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h;->s()LFd/B;

    move-result-object p1

    const/4 v0, -0x1

    if-nez p1, :cond_3

    move p1, v0

    goto :goto_0

    :cond_3
    sget-object v1, LId/b$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    :goto_0
    const/4 v1, 0x2

    if-eq p1, v0, :cond_6

    const/4 v0, 0x1

    if-eq p1, v0, :cond_5

    if-eq p1, v1, :cond_6

    const/4 v0, 0x3

    if-ne p1, v0, :cond_4

    goto :goto_1

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_5
    sget-object p0, LId/a$c$b;->a:LId/a$c$b;

    goto/16 :goto_5

    :cond_6
    :goto_1
    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h;->t()LRd/a;

    move-result-object p1

    instance-of v0, p1, LRd/a$a;

    if-eqz v0, :cond_7

    sget-object p0, LId/a$c$e;->a:LId/a$c$e;

    goto/16 :goto_5

    :cond_7
    instance-of v0, p1, LRd/a$c;

    if-eqz v0, :cond_8

    sget-object p0, LId/a$c$f;->a:LId/a$c$f;

    goto/16 :goto_5

    :cond_8
    instance-of v0, p1, LRd/a$b$a;

    if-eqz v0, :cond_a

    invoke-interface {p2}, LOd/a;->a()LOd/a$b;

    move-result-object p0

    instance-of p0, p0, LOd/a$b$b$a;

    if-eqz p0, :cond_9

    sget-object p0, LId/a$c$a;->a:LId/a$c$a;

    goto/16 :goto_5

    :cond_9
    sget-object p0, LId/a$a;->a:LId/a$a;

    goto/16 :goto_5

    :cond_a
    instance-of p2, p1, LRd/a$b$b$b;

    if-eqz p2, :cond_d

    new-instance p1, Lcom/ui/wifiman/model/teleport/tunnel/TeleportAvailableNonFatal;

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h;->t()LRd/a;

    move-result-object p0

    instance-of p2, p0, LRd/a$b$b$b;

    const/4 v0, 0x0

    if-eqz p2, :cond_b

    check-cast p0, LRd/a$b$b$b;

    goto :goto_2

    :cond_b
    move-object p0, v0

    :goto_2
    if-eqz p0, :cond_c

    invoke-virtual {p0}, LRd/a$b$b$b;->a()Lcom/ui/common/semver/SemVer;

    move-result-object p0

    goto :goto_3

    :cond_c
    move-object p0, v0

    :goto_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Teleport unsupported because UnsupportedNetworkVersion : "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/ui/wifiman/model/teleport/tunnel/TeleportAvailableNonFatal;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0, v1, v0}, LZ7/b;->f(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p0, LId/a$c$f;->a:LId/a$c$f;

    goto :goto_5

    :cond_d
    instance-of p1, p1, LRd/a$b$b$a;

    if-eqz p1, :cond_16

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h;->h()Z

    move-result p1

    if-eqz p1, :cond_15

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h;->y()Lcom/ui/wifiman/model/teleport/n$b;

    move-result-object p1

    instance-of p2, p1, Lcom/ui/wifiman/model/teleport/n$b$a$a;

    if-nez p2, :cond_14

    instance-of p2, p1, Lcom/ui/wifiman/model/teleport/n$b$a$d;

    if-eqz p2, :cond_e

    goto :goto_4

    :cond_e
    instance-of p2, p1, Lcom/ui/wifiman/model/teleport/n$b$a$c;

    if-eqz p2, :cond_f

    sget-object p0, LId/a$a;->a:LId/a$a;

    goto :goto_5

    :cond_f
    instance-of p2, p1, Lcom/ui/wifiman/model/teleport/n$b$a$b;

    if-eqz p2, :cond_12

    instance-of p1, p0, Lcom/ui/wifiman/model/teleport/h$c;

    if-eqz p1, :cond_10

    sget-object p0, LId/a$c$g;->a:LId/a$c$g;

    goto :goto_5

    :cond_10
    instance-of p0, p0, Lcom/ui/wifiman/model/teleport/h$a;

    if-eqz p0, :cond_11

    sget-object p0, LId/a$c$c;->a:LId/a$c$c;

    goto :goto_5

    :cond_11
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_12
    instance-of p0, p1, Lcom/ui/wifiman/model/teleport/n$b$b;

    if-eqz p0, :cond_13

    sget-object p0, LId/a$c$c;->a:LId/a$c$c;

    goto :goto_5

    :cond_13
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_14
    :goto_4
    sget-object p0, LId/a$b;->a:LId/a$b;

    goto :goto_5

    :cond_15
    sget-object p0, LId/a$c$c;->a:LId/a$c$c;

    :goto_5
    return-object p0

    :cond_16
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
