.class public abstract Lcom/wireguard/android/backend/GoBackend$d;
.super Landroid/net/VpnService;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/wireguard/android/backend/GoBackend;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation


# instance fields
.field private a:Lcom/wireguard/android/backend/GoBackend;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/net/VpnService;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/net/VpnService$Builder;
    .locals 1

    new-instance v0, Landroid/net/VpnService$Builder;

    invoke-direct {v0, p0}, Landroid/net/VpnService$Builder;-><init>(Landroid/net/VpnService;)V

    return-object v0
.end method

.method public b(Lcom/wireguard/android/backend/GoBackend;)V
    .locals 0

    iput-object p1, p0, Lcom/wireguard/android/backend/GoBackend$d;->a:Lcom/wireguard/android/backend/GoBackend;

    return-void
.end method

.method public onCreate()V
    .locals 1

    invoke-static {}, Lcom/wireguard/android/backend/GoBackend;->d()Lcom/wireguard/android/backend/GoBackend$c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/wireguard/android/backend/GoBackend$c;->a(Ljava/lang/Object;)Z

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    return-void
.end method

.method public onDestroy()V
    .locals 4

    iget-object v0, p0, Lcom/wireguard/android/backend/GoBackend$d;->a:Lcom/wireguard/android/backend/GoBackend;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/wireguard/android/backend/GoBackend;->f(Lcom/wireguard/android/backend/GoBackend;)Lcom/wireguard/android/backend/c;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/wireguard/android/backend/GoBackend$d;->a:Lcom/wireguard/android/backend/GoBackend;

    invoke-static {v1}, Lcom/wireguard/android/backend/GoBackend;->h(Lcom/wireguard/android/backend/GoBackend;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/wireguard/android/backend/GoBackend;->i(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/wireguard/android/backend/GoBackend$d;->a:Lcom/wireguard/android/backend/GoBackend;

    invoke-static {v1}, Lcom/wireguard/android/backend/GoBackend;->j(Lcom/wireguard/android/backend/GoBackend;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    iget-object v1, p0, Lcom/wireguard/android/backend/GoBackend$d;->a:Lcom/wireguard/android/backend/GoBackend;

    invoke-static {v1}, Lcom/wireguard/android/backend/GoBackend;->j(Lcom/wireguard/android/backend/GoBackend;)I

    move-result v1

    invoke-static {v1}, Lcom/wireguard/android/backend/GoBackend;->l(I)V

    :cond_0
    iget-object v1, p0, Lcom/wireguard/android/backend/GoBackend$d;->a:Lcom/wireguard/android/backend/GoBackend;

    const/4 v3, 0x0

    invoke-static {v1, v3}, Lcom/wireguard/android/backend/GoBackend;->g(Lcom/wireguard/android/backend/GoBackend;Lcom/wireguard/android/backend/c;)Lcom/wireguard/android/backend/c;

    iget-object v1, p0, Lcom/wireguard/android/backend/GoBackend$d;->a:Lcom/wireguard/android/backend/GoBackend;

    invoke-static {v1, v2}, Lcom/wireguard/android/backend/GoBackend;->k(Lcom/wireguard/android/backend/GoBackend;I)I

    iget-object v1, p0, Lcom/wireguard/android/backend/GoBackend$d;->a:Lcom/wireguard/android/backend/GoBackend;

    invoke-static {v1, v3}, Lcom/wireguard/android/backend/GoBackend;->m(Lcom/wireguard/android/backend/GoBackend;Lcom/wireguard/config/a;)Lcom/wireguard/config/a;

    sget-object v1, Lcom/wireguard/android/backend/c$a;->DOWN:Lcom/wireguard/android/backend/c$a;

    invoke-interface {v0, v1}, Lcom/wireguard/android/backend/c;->c(Lcom/wireguard/android/backend/c$a;)V

    :cond_1
    invoke-static {}, Lcom/wireguard/android/backend/GoBackend;->d()Lcom/wireguard/android/backend/GoBackend$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/wireguard/android/backend/GoBackend$c;->d()Lcom/wireguard/android/backend/GoBackend$c;

    move-result-object v0

    invoke-static {v0}, Lcom/wireguard/android/backend/GoBackend;->e(Lcom/wireguard/android/backend/GoBackend$c;)Lcom/wireguard/android/backend/GoBackend$c;

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 2

    invoke-static {}, Lcom/wireguard/android/backend/GoBackend;->d()Lcom/wireguard/android/backend/GoBackend$c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/wireguard/android/backend/GoBackend$c;->a(Ljava/lang/Object;)Z

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "WireGuard/GoBackend"

    const-string v1, "Service started by Always-on VPN feature"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/wireguard/android/backend/GoBackend;->n()Lcom/wireguard/android/backend/GoBackend$b;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/wireguard/android/backend/GoBackend;->n()Lcom/wireguard/android/backend/GoBackend$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/wireguard/android/backend/GoBackend$b;->a()V

    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result p1

    return p1
.end method
