.class final LJ7/v$a$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/v$a;->h(Ljava/lang/String;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LJ7/v;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(LJ7/v;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LJ7/v$a$b;->a:LJ7/v;

    iput-object p2, p0, LJ7/v$a$b;->b:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;)LJ7/m;
    .locals 8

    new-instance v0, LJ7/v$a$b$a;

    invoke-direct {v0, p1}, LJ7/v$a$b$a;-><init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;)V

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    iget-object v0, p0, LJ7/v$a$b;->a:LJ7/v;

    invoke-static {v0}, LJ7/v;->e(LJ7/v;)Lokhttp3/OkHttpClient;

    move-result-object v2

    new-instance v0, LJ7/m;

    iget-object v4, p0, LJ7/v$a$b;->b:Ljava/lang/String;

    const-string/jumbo v1, "clientName"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "longTermSecret"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v1, v0

    move-object v5, p1

    invoke-direct/range {v1 .. v7}, LJ7/m;-><init>(Lokhttp3/OkHttpClient;Ljava/lang/String;Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    invoke-virtual {p0, p1}, LJ7/v$a$b;->a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;)LJ7/m;

    move-result-object p1

    return-object p1
.end method
