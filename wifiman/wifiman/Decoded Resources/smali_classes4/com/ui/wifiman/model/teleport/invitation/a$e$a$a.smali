.class public final Lcom/ui/wifiman/model/teleport/invitation/a$e$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/invitation/a$e$a;->a(Lcom/ui/wifiman/model/teleport/n;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/invitation/a;

.field final synthetic b:Lcom/ui/wifiman/model/teleport/n;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/teleport/invitation/a;Lcom/ui/wifiman/model/teleport/n;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/invitation/a$e$a$a;->a:Lcom/ui/wifiman/model/teleport/invitation/a;

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/invitation/a$e$a$a;->b:Lcom/ui/wifiman/model/teleport/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/invitation/a$e$a$a;->a:Lcom/ui/wifiman/model/teleport/invitation/a;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/invitation/a;->e(Lcom/ui/wifiman/model/teleport/invitation/a;)LFg/a;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$b$d;

    iget-object v2, p0, Lcom/ui/wifiman/model/teleport/invitation/a$e$a$a;->b:Lcom/ui/wifiman/model/teleport/n;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/teleport/n;->a()LKd/a;

    move-result-object v2

    invoke-virtual {v2}, LKd/a;->c()LKd/a$a;

    move-result-object v2

    invoke-virtual {v2}, LKd/a$a;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$b$d;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
