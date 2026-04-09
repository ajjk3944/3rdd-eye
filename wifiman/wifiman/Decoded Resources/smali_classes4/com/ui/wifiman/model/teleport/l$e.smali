.class final Lcom/ui/wifiman/model/teleport/l$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/l;-><init>(LFd/D;LI7/a;LKd/d;LKd/b;LZc/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/teleport/l$e$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/l$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/l$e;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/l$e;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/l$e;->a:Lcom/ui/wifiman/model/teleport/l$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/util/concurrent/ConcurrentHashMap;)Ljava/util/List;
    .locals 7

    const-string v0, "teleports"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "statusChecks"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/teleport/n;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/teleport/n;->a()LKd/a;

    move-result-object v2

    invoke-virtual {v2}, LKd/a;->g()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/ubnt/teleport/TeleportTunnel$d;->a(Ljava/lang/String;)Lcom/ubnt/teleport/TeleportTunnel$d;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/teleport/l$d;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/ui/wifiman/model/teleport/l$d;->a()LWc/b;

    move-result-object v2

    goto :goto_1

    :cond_0
    move-object v2, v3

    :goto_1
    invoke-virtual {v1}, Lcom/ui/wifiman/model/teleport/n;->a()LKd/a;

    move-result-object v1

    if-eqz v2, :cond_e

    instance-of v4, v2, LWc/b$a$b;

    if-eqz v4, :cond_6

    move-object v3, v2

    check-cast v3, LWc/b$a$b;

    invoke-virtual {v3}, LWc/b$a$b;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    invoke-virtual {v3}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;->e()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

    move-result-object v3

    const/4 v4, -0x1

    if-nez v3, :cond_1

    move v3, v4

    goto :goto_2

    :cond_1
    sget-object v5, Lcom/ui/wifiman/model/teleport/l$e$a;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v5, v3

    :goto_2
    if-eq v3, v4, :cond_5

    const/4 v4, 0x1

    if-eq v3, v4, :cond_4

    const/4 v4, 0x2

    if-eq v3, v4, :cond_3

    const/4 v4, 0x3

    if-ne v3, v4, :cond_2

    sget-object v3, LFd/B;->UNREACHABLE:LFd/B;

    goto/16 :goto_4

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    sget-object v3, LFd/B;->UNSTABLE:LFd/B;

    goto :goto_4

    :cond_4
    sget-object v3, LFd/B;->REACHABLE:LFd/B;

    goto :goto_4

    :cond_5
    sget-object v3, LFd/B;->UNREACHABLE:LFd/B;

    goto :goto_4

    :cond_6
    instance-of v4, v2, LWc/b$a$a;

    if-eqz v4, :cond_c

    move-object v4, v2

    check-cast v4, LWc/b$a$a;

    invoke-virtual {v4}, LWc/b$a$a;->c()Ljava/lang/Throwable;

    move-result-object v5

    instance-of v5, v5, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;

    if-eqz v5, :cond_a

    invoke-virtual {v4}, LWc/b$a$a;->c()Ljava/lang/Throwable;

    move-result-object v4

    check-cast v4, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;

    instance-of v5, v4, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    if-nez v5, :cond_e

    instance-of v5, v4, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$ApiError;

    if-nez v5, :cond_e

    instance-of v5, v4, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError;

    if-eqz v5, :cond_7

    goto :goto_4

    :cond_7
    instance-of v3, v4, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError$ResponseTimeout;

    if-nez v3, :cond_9

    instance-of v3, v4, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError;

    if-eqz v3, :cond_8

    goto :goto_3

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    :goto_3
    sget-object v3, LFd/B;->UNREACHABLE:LFd/B;

    goto :goto_4

    :cond_a
    invoke-virtual {v4}, LWc/b$a$a;->c()Ljava/lang/Throwable;

    move-result-object v5

    instance-of v5, v5, Lcom/ui/wifiman/model/teleport/l$b;

    if-eqz v5, :cond_b

    sget-object v3, LFd/B;->UNREACHABLE:LFd/B;

    goto :goto_4

    :cond_b
    invoke-virtual {v4}, LWc/b$a$a;->c()Ljava/lang/Throwable;

    move-result-object v4

    const/4 v5, 0x4

    const-string v6, "Unexpected error type occurred. Only TeleportCloud errors expected"

    invoke-static {v6, v4, v3, v5, v3}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_4

    :cond_c
    instance-of v4, v2, LWc/b$c;

    if-nez v4, :cond_e

    instance-of v4, v2, LWc/b$b;

    if-eqz v4, :cond_d

    goto :goto_4

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_e
    :goto_4
    if-eqz v2, :cond_14

    instance-of v4, v2, LWc/b$a$b;

    if-eqz v4, :cond_f

    sget-object v2, Lcom/ui/wifiman/model/teleport/n$b$a$c;->a:Lcom/ui/wifiman/model/teleport/n$b$a$c;

    goto :goto_6

    :cond_f
    instance-of v4, v2, LWc/b$c;

    if-nez v4, :cond_13

    instance-of v4, v2, LWc/b$b;

    if-eqz v4, :cond_10

    goto :goto_5

    :cond_10
    instance-of v4, v2, LWc/b$a$a;

    if-eqz v4, :cond_12

    check-cast v2, LWc/b$a$a;

    invoke-virtual {v2}, LWc/b$a$a;->c()Ljava/lang/Throwable;

    move-result-object v2

    instance-of v2, v2, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$Unauthenticated;

    if-eqz v2, :cond_11

    sget-object v2, Lcom/ui/wifiman/model/teleport/n$b$a$b;->a:Lcom/ui/wifiman/model/teleport/n$b$a$b;

    goto :goto_6

    :cond_11
    sget-object v2, Lcom/ui/wifiman/model/teleport/n$b$a$a;->a:Lcom/ui/wifiman/model/teleport/n$b$a$a;

    goto :goto_6

    :cond_12
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_13
    :goto_5
    sget-object v2, Lcom/ui/wifiman/model/teleport/n$b$a$d;->a:Lcom/ui/wifiman/model/teleport/n$b$a$d;

    :goto_6
    if-nez v2, :cond_15

    :cond_14
    sget-object v2, Lcom/ui/wifiman/model/teleport/n$b$a$d;->a:Lcom/ui/wifiman/model/teleport/n$b$a$d;

    :cond_15
    new-instance v4, Lcom/ui/wifiman/model/teleport/n$a;

    invoke-direct {v4, v1, v3, v2}, Lcom/ui/wifiman/model/teleport/n$a;-><init>(LKd/a;LFd/B;Lcom/ui/wifiman/model/teleport/n$b;)V

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_16
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/teleport/l$e;->a(Ljava/util/List;Ljava/util/concurrent/ConcurrentHashMap;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
