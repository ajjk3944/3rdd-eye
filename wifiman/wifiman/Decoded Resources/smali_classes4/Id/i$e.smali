.class final LId/i$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LId/i;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LId/i;


# direct methods
.method constructor <init>(LId/i;)V
    .locals 0

    iput-object p1, p0, LId/i$e;->a:LId/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZc/e;

    check-cast p2, Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    check-cast p3, Ll9/a;

    check-cast p4, LWc/b;

    invoke-virtual {p0, p1, p2, p3, p4}, LId/i$e;->b(LZc/e;Lcom/ui/wifiman/model/teleport/TeleportConnection$a;Ll9/a;LWc/b;)LId/h$a;

    move-result-object p1

    return-object p1
.end method

.method public final b(LZc/e;Lcom/ui/wifiman/model/teleport/TeleportConnection$a;Ll9/a;LWc/b;)LId/h$a;
    .locals 1

    const-string v0, "networkConnection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tunnelState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ui/wifiman/model/teleport/h;

    invoke-virtual {p4}, LWc/b;->a()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, LOd/a;

    instance-of v0, p2, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b;

    if-nez v0, :cond_8

    instance-of v0, p2, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$a;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p2, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;

    if-eqz v0, :cond_7

    if-nez p3, :cond_1

    sget-object p1, LId/h$a$d;->a:LId/h$a$d;

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, LZc/e;->f()LZc/e$b;

    move-result-object p1

    sget-object v0, LZc/e$b;->CONNECTED:LZc/e$b;

    if-ne p1, v0, :cond_2

    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    invoke-static {p3, p1, p4}, LId/b;->a(Lcom/ui/wifiman/model/teleport/h;ZLOd/a;)LId/a;

    move-result-object p1

    instance-of p3, p1, LId/a$b;

    if-eqz p3, :cond_3

    sget-object p1, LId/h$a$d;->a:LId/h$a$d;

    goto :goto_2

    :cond_3
    instance-of p3, p1, LId/a$c;

    if-eqz p3, :cond_4

    new-instance p2, LId/h$a$c;

    check-cast p1, LId/a$c;

    invoke-direct {p2, p1}, LId/h$a$c;-><init>(LId/a$c;)V

    move-object p1, p2

    goto :goto_2

    :cond_4
    instance-of p1, p1, LId/a$a;

    if-eqz p1, :cond_6

    check-cast p2, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;->b()Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object p2, p0, LId/i$e;->a:LId/i;

    new-instance p3, LId/h$a$b;

    invoke-virtual {p2, p1}, LId/i;->e(Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)LId/c;

    move-result-object p1

    invoke-direct {p3, p1}, LId/h$a$b;-><init>(LId/c;)V

    move-object p1, p3

    goto :goto_2

    :cond_5
    sget-object p1, LId/h$a$a;->a:LId/h$a$a;

    goto :goto_2

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    :goto_1
    sget-object p1, LId/h$a$a;->a:LId/h$a$a;

    :goto_2
    return-object p1
.end method
