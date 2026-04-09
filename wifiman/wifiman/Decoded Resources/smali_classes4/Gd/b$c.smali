.class final LGd/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGd/b;->a(Landroid/content/Context;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LGd/b;


# direct methods
.method constructor <init>(LGd/b;)V
    .locals 0

    iput-object p1, p0, LGd/b$c;->a:LGd/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)Lgg/f;
    .locals 1

    const-string v0, "isTeleportOn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, LGd/b$c;->a:LGd/b;

    invoke-static {p1}, LGd/b;->e(LGd/b;)Lcom/ui/wifiman/model/teleport/TeleportConnection;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection;->disconnect()Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LGd/b$c;->a:LGd/b;

    invoke-static {p1}, LGd/b;->e(LGd/b;)Lcom/ui/wifiman/model/teleport/TeleportConnection;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection;->connect()Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LGd/b$c;->a(Ljava/lang/Boolean;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
