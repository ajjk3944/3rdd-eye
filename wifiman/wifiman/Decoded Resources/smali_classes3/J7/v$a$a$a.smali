.class final LJ7/v$a$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/v$a$a;->c(Ljava/lang/String;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LJ7/v$a$a$a;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;

    iput-object p2, p0, LJ7/v$a$a$a;->b:Ljava/lang/String;

    iput-object p3, p0, LJ7/v$a$a$a;->c:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud;)Lgg/D;
    .locals 4

    iget-object v0, p0, LJ7/v$a$a$a;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;

    check-cast v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    iget-object v1, p0, LJ7/v$a$a$a;->b:Ljava/lang/String;

    const-string/jumbo v2, "clientId"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LJ7/v$a$a$a;->c:Ljava/lang/String;

    const-string/jumbo v3, "clientName"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud;->e(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Ljava/lang/String;Ljava/lang/String;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud;

    invoke-virtual {p0, p1}, LJ7/v$a$a$a;->a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
