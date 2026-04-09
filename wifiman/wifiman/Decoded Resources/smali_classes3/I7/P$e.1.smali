.class public final LI7/P$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P;->Z(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LI7/P;


# direct methods
.method public constructor <init>(LI7/P;)V
    .locals 0

    iput-object p1, p0, LI7/P$e;->a:LI7/P;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, LI7/P$e;->a:LI7/P;

    invoke-static {v0}, LI7/P;->L(LI7/P;)Lcom/wireguard/android/backend/a;

    move-result-object v0

    iget-object v1, p0, LI7/P$e;->a:LI7/P;

    invoke-interface {v0, v1}, Lcom/wireguard/android/backend/a;->b(Lcom/wireguard/android/backend/c;)Lcom/wireguard/android/backend/c$a;

    move-result-object v0

    sget-object v1, Lcom/wireguard/android/backend/c$a;->DOWN:Lcom/wireguard/android/backend/c$a;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, LI7/P$e;->a:LI7/P;

    invoke-static {v0}, LI7/P;->L(LI7/P;)Lcom/wireguard/android/backend/a;

    move-result-object v0

    iget-object v2, p0, LI7/P$e;->a:LI7/P;

    const/4 v3, 0x0

    invoke-interface {v0, v2, v1, v3}, Lcom/wireguard/android/backend/a;->a(Lcom/wireguard/android/backend/c;Lcom/wireguard/android/backend/c$a;Lcom/wireguard/config/a;)Lcom/wireguard/android/backend/c$a;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
