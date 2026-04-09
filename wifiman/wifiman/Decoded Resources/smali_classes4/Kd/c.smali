.class public final LKd/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKd/b;


# instance fields
.field private final a:Lxa/o;


# direct methods
.method public constructor <init>(Lxa/o;)V
    .locals 1

    const-string v0, "productCatalog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKd/c;->a:Lxa/o;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;)Lgg/z;
    .locals 2

    const-string v0, "tunnelId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teleportConsoleState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LKd/c;->a:Lxa/o;

    invoke-interface {v0}, Lxa/o;->b()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, LKd/c$b;

    invoke-direct {v1, p2, p1}, LKd/c$b;-><init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string p2, "map(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Ljava/util/UUID;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;)Lgg/z;
    .locals 1

    const-string v0, "tunnelId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teleportConsoleState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p4}, LKd/c;->a(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;)Lgg/z;

    move-result-object p4

    new-instance v0, LKd/c$a;

    invoke-direct {v0, p1, p2, p3}, LKd/c$a;-><init>(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Ljava/util/UUID;)V

    invoke-virtual {p4, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string p2, "map(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
