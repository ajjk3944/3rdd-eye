.class final Lcom/ubnt/teleport/unifi/token/GoTokenSecurity$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/token/GoTokenSecurity$b;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/token/GoTokenSecurity$b$a;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;

    iput-object p2, p0, Lcom/ubnt/teleport/unifi/token/GoTokenSecurity$b$a;->b:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Token - conversion SUCCESS from SECRET xx"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/token/GoTokenSecurity$b$a;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v1, v2}, Lkotlin/text/t;->y1(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> TOKEN xx"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/token/GoTokenSecurity$b$a;->b:Ljava/lang/String;

    const-string/jumbo v3, "it"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, Lkotlin/text/t;->y1(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/ubnt/teleport/unifi/token/GoTokenSecurity$b$a;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
