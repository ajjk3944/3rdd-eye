.class public final LI7/P$D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P;->D0(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)Lgg/b;
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

    iput-object p1, p0, LI7/P$D;->a:LI7/P;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LI7/P$D;->a:LI7/P;

    invoke-static {v0}, LI7/P;->O(LI7/P;)LFg/a;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

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
