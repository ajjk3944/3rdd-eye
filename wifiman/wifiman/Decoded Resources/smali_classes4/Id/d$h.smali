.class final LId/d$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LId/d;->h(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;


# direct methods
.method constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;)V
    .locals 0

    iput-object p1, p0, LId/d$h;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LJd/b;)Lgg/f;
    .locals 2

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LId/d$h;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    new-instance v1, LId/d$h$a;

    invoke-direct {v1, p1, v0}, LId/d$h$a;-><init>(LJd/b;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJd/b;

    invoke-virtual {p0, p1}, LId/d$h;->a(LJd/b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
