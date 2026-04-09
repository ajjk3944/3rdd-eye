.class public final Lcom/ui/wifiman/model/teleport/invitation/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/teleport/invitation/a$a;
    }
.end annotation


# static fields
.field public static final g:Lcom/ui/wifiman/model/teleport/invitation/a$a;


# instance fields
.field private final a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

.field private final b:LFd/D;

.field private final c:LFg/a;

.field private final d:Lgg/b;

.field private final e:Lgg/i;

.field private final f:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/teleport/invitation/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/teleport/invitation/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/teleport/invitation/a;->g:Lcom/ui/wifiman/model/teleport/invitation/a$a;

    return-void
.end method

.method public constructor <init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;LI7/a;LFd/D;)V
    .locals 3

    const-string v0, "secret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teleport"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teleportManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/invitation/a;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    iput-object p3, p0, Lcom/ui/wifiman/model/teleport/invitation/a;->b:LFd/D;

    sget-object p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$b$b;->a:Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$b$b;

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    const-string p3, "createDefault(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/invitation/a;->c:LFg/a;

    invoke-interface {p2}, LI7/a;->a()Lcom/ubnt/teleport/TeleportTunnelManager;

    move-result-object p3

    invoke-interface {p3}, Lcom/ubnt/teleport/TeleportTunnelManager;->getAll()Lgg/i;

    move-result-object p3

    invoke-virtual {p3}, Lgg/i;->o0()Lgg/z;

    move-result-object p3

    new-instance v0, Lcom/ui/wifiman/model/teleport/invitation/a$b;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/teleport/invitation/a$b;-><init>(Lcom/ui/wifiman/model/teleport/invitation/a;)V

    invoke-virtual {p3, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p3

    sget-object v0, Lcom/ui/wifiman/model/teleport/invitation/a$c;->a:Lcom/ui/wifiman/model/teleport/invitation/a$c;

    invoke-virtual {p3, v0}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p3

    const-string v0, "flatMapCompletable(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/ui/wifiman/model/teleport/invitation/a;->d:Lgg/b;

    invoke-interface {p2}, LI7/a;->d()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;

    move-result-object p2

    invoke-interface {p2}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;->a()Lgg/z;

    move-result-object p2

    invoke-virtual {p3, p2}, Lgg/b;->k(Lgg/D;)Lgg/z;

    move-result-object p2

    new-instance p3, Lcom/ui/wifiman/model/teleport/invitation/a$h;

    invoke-direct {p3, p0}, Lcom/ui/wifiman/model/teleport/invitation/a$h;-><init>(Lcom/ui/wifiman/model/teleport/invitation/a;)V

    invoke-virtual {p2, p3}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p2

    sget-object p3, Lcom/ui/wifiman/model/teleport/invitation/a$i;->a:Lcom/ui/wifiman/model/teleport/invitation/a$i;

    invoke-virtual {p2, p3}, Lgg/z;->L(Lkg/n;)Lgg/z;

    move-result-object p2

    sget-object p3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError$ResponseTimeout;

    const-string v1, "Timeout after 10000 ms"

    invoke-direct {v0, v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CommunicationError$ResponseTimeout;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object v0

    const-wide/16 v1, 0x2710

    invoke-virtual {p2, v1, v2, p3, v0}, Lgg/z;->S(JLjava/util/concurrent/TimeUnit;Lgg/D;)Lgg/z;

    move-result-object p2

    sget-object p3, Lcom/ui/wifiman/model/teleport/invitation/a$j;->a:Lcom/ui/wifiman/model/teleport/invitation/a$j;

    invoke-virtual {p2, p3}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p2

    sget-object p3, Lcom/ui/wifiman/model/teleport/invitation/a$k;->a:Lcom/ui/wifiman/model/teleport/invitation/a$k;

    invoke-virtual {p2, p3}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p2

    invoke-virtual {p2}, Lgg/z;->W()Lgg/i;

    move-result-object p2

    sget-object p3, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$b;->a:Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor$a$b;

    invoke-virtual {p2, p3}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    const-string v0, "refCount(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/invitation/a;->e:Lgg/i;

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0, p3}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    const-string p2, "observeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/invitation/a;->f:Lgg/i;

    return-void
.end method

.method public static final synthetic d(Lcom/ui/wifiman/model/teleport/invitation/a;)LFd/D;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/invitation/a;->b:LFd/D;

    return-object p0
.end method

.method public static final synthetic e(Lcom/ui/wifiman/model/teleport/invitation/a;)LFg/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/invitation/a;->c:LFg/a;

    return-object p0
.end method


# virtual methods
.method public a()Lgg/b;
    .locals 2

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/invitation/a;->b()Lgg/i;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/teleport/invitation/a$d;->a:Lcom/ui/wifiman/model/teleport/invitation/a$d;

    invoke-virtual {v0, v1}, Lgg/i;->v0(Lkg/n;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/invitation/a$e;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/model/teleport/invitation/a$e;-><init>(Lcom/ui/wifiman/model/teleport/invitation/a;)V

    invoke-virtual {v0, v1}, Lgg/i;->t0(Lkg/n;)Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/invitation/a$f;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/model/teleport/invitation/a$f;-><init>(Lcom/ui/wifiman/model/teleport/invitation/a;)V

    invoke-virtual {v0, v1}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/invitation/a$g;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/model/teleport/invitation/a$g;-><init>(Lcom/ui/wifiman/model/teleport/invitation/a;)V

    invoke-virtual {v0, v1}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object v0

    const-string v1, "subscribeOn(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/invitation/a;->e:Lgg/i;

    return-object v0
.end method

.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/invitation/a;->f:Lgg/i;

    return-object v0
.end method

.method public f()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/invitation/a;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    return-object v0
.end method
