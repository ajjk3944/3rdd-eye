.class public final Lcom/ui/wifiman/model/teleport/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFd/D;


# instance fields
.field private final a:Lcom/ui/wifiman/model/teleport/session/TeleportSession;

.field private final b:LI7/a;

.field private final c:LKd/d;

.field private final d:LKd/b;

.field private final e:LLd/f;

.field private final f:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

.field private final g:Lgg/i;

.field private final h:Lgg/i;

.field private final i:Lgg/i;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/teleport/session/TeleportSession;LI7/a;LKd/d;LKd/b;LLd/f;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;)V
    .locals 1

    const-string v0, "teleportSession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unifiTeleport"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tunnelRecordStorage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recordFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cloudSessionService"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ssoAccountManager"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/j;->a:Lcom/ui/wifiman/model/teleport/session/TeleportSession;

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/j;->b:LI7/a;

    iput-object p3, p0, Lcom/ui/wifiman/model/teleport/j;->c:LKd/d;

    iput-object p4, p0, Lcom/ui/wifiman/model/teleport/j;->d:LKd/b;

    iput-object p5, p0, Lcom/ui/wifiman/model/teleport/j;->e:LLd/f;

    iput-object p6, p0, Lcom/ui/wifiman/model/teleport/j;->f:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    invoke-interface {p5}, LLd/f;->a()Lgg/i;

    move-result-object p4

    sget-object p5, Lcom/ui/wifiman/model/teleport/j$b;->a:Lcom/ui/wifiman/model/teleport/j$b;

    invoke-virtual {p4, p5}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p4

    invoke-virtual {p4}, Lgg/i;->W()Lgg/i;

    move-result-object p4

    const-string p5, "distinctUntilChanged(...)"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p4, p0, Lcom/ui/wifiman/model/teleport/j;->g:Lgg/i;

    invoke-interface {p3}, LKd/d;->getAll()Lgg/i;

    move-result-object p3

    invoke-interface {p2}, LI7/a;->a()Lcom/ubnt/teleport/TeleportTunnelManager;

    move-result-object p2

    invoke-interface {p2}, Lcom/ubnt/teleport/TeleportTunnelManager;->getAll()Lgg/i;

    move-result-object p2

    sget-object p5, Lcom/ui/wifiman/model/teleport/j$a;->a:Lcom/ui/wifiman/model/teleport/j$a;

    invoke-static {p3, p2, p4, p5}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    const-string p4, "refCount(...)"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/j;->h:Lgg/i;

    invoke-interface {p1}, Lcom/ui/wifiman/model/teleport/session/TeleportSession;->c()Lgg/i;

    move-result-object p1

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/j;->getAll()Lgg/i;

    move-result-object p2

    sget-object p5, Lcom/ui/wifiman/model/teleport/j$e;->a:Lcom/ui/wifiman/model/teleport/j$e;

    invoke-static {p1, p2, p5}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/j;->i:Lgg/i;

    return-void
.end method

.method public static final synthetic h(Lcom/ui/wifiman/model/teleport/j;)LKd/b;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/j;->d:LKd/b;

    return-object p0
.end method

.method public static final synthetic i(Lcom/ui/wifiman/model/teleport/j;)Lcom/ui/wifiman/model/teleport/session/TeleportSession;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/j;->a:Lcom/ui/wifiman/model/teleport/session/TeleportSession;

    return-object p0
.end method

.method public static final synthetic j(Lcom/ui/wifiman/model/teleport/j;)LKd/d;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/j;->c:LKd/d;

    return-object p0
.end method

.method public static final synthetic k(Lcom/ui/wifiman/model/teleport/j;)LI7/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/j;->b:LI7/a;

    return-object p0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/j;->i:Lgg/i;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lgg/b;
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/j;->a:Lcom/ui/wifiman/model/teleport/session/TeleportSession;

    invoke-interface {v0, p1}, Lcom/ui/wifiman/model/teleport/session/TeleportSession;->g(Ljava/lang/String;)Lgg/b;

    move-result-object v0

    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/j;->c:LKd/d;

    invoke-interface {v1, p1}, LKd/d;->c(Ljava/lang/String;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ll9/a;

    const/4 v1, 0x0

    invoke-direct {p1, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    :goto_0
    new-instance v1, Lcom/ui/wifiman/model/teleport/j$j;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/model/teleport/j$j;-><init>(Lcom/ui/wifiman/model/teleport/j;)V

    invoke-virtual {p1, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    const/4 v1, 0x2

    new-array v1, v1, [Lgg/f;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    aput-object p1, v1, v0

    invoke-static {v1}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    const-string v0, "concatArray(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c()Lgg/b;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/j;->f:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    invoke-interface {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;->a()Lgg/i;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/teleport/j$k;->a:Lcom/ui/wifiman/model/teleport/j$k;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/j$l;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/model/teleport/j$l;-><init>(Lcom/ui/wifiman/model/teleport/j;)V

    invoke-virtual {v0, v1}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string v1, "switchMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public d(Lcom/ui/wifiman/model/teleport/n;)Lgg/b;
    .locals 4

    const-string v0, "teleport"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/j;->b:LI7/a;

    invoke-interface {v0}, LI7/a;->a()Lcom/ubnt/teleport/TeleportTunnelManager;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/n;->b()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ubnt/teleport/TeleportTunnelManager;->c(Lcom/ubnt/teleport/TeleportTunnel;)Lgg/b;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/j;->c:LKd/d;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/n;->a()LKd/a;

    move-result-object v2

    invoke-interface {v1, v2}, LKd/d;->a(LKd/a;)Lgg/b;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/n;->a()LKd/a;

    move-result-object p1

    invoke-virtual {p1}, LKd/a;->c()LKd/a$a;

    move-result-object p1

    invoke-virtual {p1}, LKd/a$a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/j;->b(Ljava/lang/String;)Lgg/b;

    move-result-object p1

    const/4 v2, 0x3

    new-array v2, v2, [Lgg/f;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    aput-object p1, v2, v0

    invoke-static {v2}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    const-string v0, "concatArray(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public e(Ljava/lang/String;)Lgg/z;
    .locals 2

    const-string v0, "consoleId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/j;->e:LLd/f;

    invoke-interface {v0}, LLd/f;->a()Lgg/i;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/teleport/j$h;->a:Lcom/ui/wifiman/model/teleport/j$h;

    invoke-virtual {v0, v1}, Lgg/i;->x0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/j$i;

    invoke-direct {v1, p0, p1}, Lcom/ui/wifiman/model/teleport/j$i;-><init>(Lcom/ui/wifiman/model/teleport/j;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string v0, "flatMap(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public f(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;)Lgg/z;
    .locals 2

    const-string v0, "publicSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "siteState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/j;->b:LI7/a;

    invoke-interface {v0}, LI7/a;->d()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;->b(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/j$f;

    invoke-direct {v1, p0, p1}, Lcom/ui/wifiman/model/teleport/j$f;-><init>(Lcom/ui/wifiman/model/teleport/j;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/j$g;

    invoke-direct {v1, p0, p1, p2}, Lcom/ui/wifiman/model/teleport/j$g;-><init>(Lcom/ui/wifiman/model/teleport/j;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string p2, "flatMap(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public g(Ljava/lang/String;)Lgg/b;
    .locals 2

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/j;->c:LKd/d;

    invoke-interface {v0, p1}, LKd/d;->c(Ljava/lang/String;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/j$c;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/teleport/j$c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/teleport/j$d;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/teleport/j$d;-><init>(Lcom/ui/wifiman/model/teleport/j;)V

    invoke-virtual {p1, v0}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string v0, "flatMapCompletable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getAll()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/j;->h:Lgg/i;

    return-object v0
.end method
