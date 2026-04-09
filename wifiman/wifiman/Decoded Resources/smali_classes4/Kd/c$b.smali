.class final LKd/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKd/c;->a(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LKd/c$b;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    iput-object p2, p0, LKd/c$b;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lwa/a;)LKd/a$a;
    .locals 12

    const-string v0, "catalog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LKd/c$b;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;->a()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, LKd/c$b;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "local-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, LKd/c$b;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;->h()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, LKd/c$b;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, ""

    :cond_1
    move-object v3, v0

    iget-object v0, p0, LKd/c$b;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;->i()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, LKd/c$b;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;->j()Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, LKd/c$b;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {p1, v0}, Lwa/a;->d(Ljava/lang/String;)Lua/a;

    move-result-object p1

    check-cast p1, Lxa/a$d;

    :goto_0
    move-object v6, p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    iget-object p1, p0, LKd/c$b;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;->d()Ljava/lang/String;

    move-result-object v7

    iget-object p1, p0, LKd/c$b;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;->c()Ljava/lang/Integer;

    move-result-object v8

    iget-object p1, p0, LKd/c$b;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;->g()Ljava/lang/String;

    move-result-object v10

    iget-object p1, p0, LKd/c$b;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;->f()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$a;

    move-result-object v9

    new-instance p1, LKd/a$a;

    const/4 v11, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v11}, LKd/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxa/a$d;Ljava/lang/String;Ljava/lang/Integer;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$a;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwa/a;

    invoke-virtual {p0, p1}, LKd/c$b;->a(Lwa/a;)LKd/a$a;

    move-result-object p1

    return-object p1
.end method
