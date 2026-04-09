.class public final Lcom/ubnt/teleport/unifi/token/GoTokenSecurity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/token/GoTokenSecurity;->a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/token/GoTokenSecurity;

.field final synthetic b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;


# direct methods
.method public constructor <init>(Lcom/ubnt/teleport/unifi/token/GoTokenSecurity;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/token/GoTokenSecurity$a;->a:Lcom/ubnt/teleport/unifi/token/GoTokenSecurity;

    iput-object p2, p0, Lcom/ubnt/teleport/unifi/token/GoTokenSecurity$a;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/ubnt/teleport/unifi/token/GoTokenSecurity$a;->a:Lcom/ubnt/teleport/unifi/token/GoTokenSecurity;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/token/GoTokenSecurity$a;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ubnt/teleport/unifi/token/GoTokenSecurity;->c(Lcom/ubnt/teleport/unifi/token/GoTokenSecurity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
