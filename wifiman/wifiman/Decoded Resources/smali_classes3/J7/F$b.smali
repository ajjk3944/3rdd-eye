.class final LJ7/F$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/F;->e(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Ljava/lang/String;Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LJ7/F;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;


# direct methods
.method constructor <init>(LJ7/F;Ljava/lang/String;Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;)V
    .locals 0

    iput-object p1, p0, LJ7/F$b;->a:LJ7/F;

    iput-object p2, p0, LJ7/F$b;->b:Ljava/lang/String;

    iput-object p3, p0, LJ7/F$b;->c:Ljava/lang/String;

    iput-object p4, p0, LJ7/F$b;->d:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lgg/D;
    .locals 6

    iget-object v0, p0, LJ7/F$b;->a:LJ7/F;

    new-instance v1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;

    const-string/jumbo v2, "token"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadTokenRequest;

    iget-object v3, p0, LJ7/F$b;->b:Ljava/lang/String;

    iget-object v4, p0, LJ7/F$b;->c:Ljava/lang/String;

    iget-object v5, p0, LJ7/F$b;->d:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    invoke-virtual {v5}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;->a()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadTokenRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v1, p1, v2}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;-><init>(Ljava/lang/String;LK7/b;)V

    new-instance p1, Lkotlin/jvm/internal/N;

    invoke-direct {p1}, Lkotlin/jvm/internal/N;-><init>()V

    invoke-static {v0}, LJ7/n;->g(LJ7/n;)LK7/a;

    move-result-object v2

    invoke-interface {v2, v1}, LK7/a;->c(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;)Lgg/z;

    move-result-object v2

    new-instance v3, LJ7/o;

    invoke-direct {v3, v0}, LJ7/o;-><init>(LJ7/n;)V

    new-instance v4, LJ7/n$e;

    invoke-direct {v4, v3}, LJ7/n$e;-><init>(Lmh/l;)V

    invoke-virtual {v2, v4}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v2

    new-instance v3, LJ7/p;

    invoke-direct {v3, v0}, LJ7/p;-><init>(LJ7/n;)V

    new-instance v4, LJ7/n$d;

    invoke-direct {v4, v3}, LJ7/n$d;-><init>(Lmh/l;)V

    invoke-virtual {v2, v4}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v2

    sget-object v3, LJ7/q;->a:LJ7/q;

    new-instance v4, LJ7/n$e;

    invoke-direct {v4, v3}, LJ7/n$e;-><init>(Lmh/l;)V

    invoke-virtual {v2, v4}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v2

    new-instance v3, LJ7/F$b$a;

    const-wide/16 v4, 0xc8

    invoke-direct {v3, v0, p1, v4, v5}, LJ7/F$b$a;-><init>(LJ7/n;Lkotlin/jvm/internal/N;J)V

    new-instance v0, LJ7/n$e;

    invoke-direct {v0, v3}, LJ7/n$e;-><init>(Lmh/l;)V

    invoke-virtual {v2, v0}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x4e20

    invoke-virtual {v0, v3, v4, v2}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object v0

    new-instance v2, LJ7/F$b$b;

    invoke-direct {v2, p1, v1}, LJ7/F$b$b;-><init>(Lkotlin/jvm/internal/N;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;)V

    new-instance p1, LJ7/n$e;

    invoke-direct {p1, v2}, LJ7/n$e;-><init>(Lmh/l;)V

    invoke-virtual {v0, p1}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "protected inline fun <re\u2026On(Schedulers.io())\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LJ7/F$b;->a(Ljava/lang/String;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
