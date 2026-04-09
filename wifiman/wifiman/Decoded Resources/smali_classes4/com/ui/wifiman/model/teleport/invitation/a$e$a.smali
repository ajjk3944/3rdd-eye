.class final Lcom/ui/wifiman/model/teleport/invitation/a$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/invitation/a$e;->a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/invitation/a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/invitation/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/invitation/a$e$a;->a:Lcom/ui/wifiman/model/teleport/invitation/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/teleport/n;)Lgg/f;
    .locals 3

    const-string v0, "teleport"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/invitation/a$e$a;->a:Lcom/ui/wifiman/model/teleport/invitation/a;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/invitation/a;->d(Lcom/ui/wifiman/model/teleport/invitation/a;)LFd/D;

    move-result-object v0

    invoke-interface {v0, p1}, LFd/D;->d(Lcom/ui/wifiman/model/teleport/n;)Lgg/b;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/invitation/a$e$a;->a:Lcom/ui/wifiman/model/teleport/invitation/a;

    new-instance v2, Lcom/ui/wifiman/model/teleport/invitation/a$e$a$a;

    invoke-direct {v2, v1, p1}, Lcom/ui/wifiman/model/teleport/invitation/a$e$a$a;-><init>(Lcom/ui/wifiman/model/teleport/invitation/a;Lcom/ui/wifiman/model/teleport/n;)V

    invoke-static {v2}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    new-array v1, v1, [Lgg/f;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    aput-object p1, v1, v0

    invoke-static {v1}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/n;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/invitation/a$e$a;->a(Lcom/ui/wifiman/model/teleport/n;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
