.class public final Lcom/ui/wifiman/model/teleport/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/teleport/TeleportConnection;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/teleport/b$a;,
        Lcom/ui/wifiman/model/teleport/b$b;
    }
.end annotation


# static fields
.field public static final m:Lcom/ui/wifiman/model/teleport/b$a;


# instance fields
.field private final a:LI7/a;

.field private final b:LFd/D;

.field private final c:LFd/C;

.field private final d:Lcom/ui/wifiman/model/teleport/session/TeleportSession;

.field private final e:LP7/a;

.field private final f:LFg/c;

.field private final g:LFg/a;

.field private final h:Lgg/i;

.field private final i:Lgg/b;

.field private final j:Lgg/i;

.field private final k:Lgg/i;

.field private final l:Lgg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/teleport/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/teleport/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/teleport/b;->m:Lcom/ui/wifiman/model/teleport/b$a;

    return-void
.end method

.method public constructor <init>(LI7/a;LFd/D;LFd/C;Lcom/ui/wifiman/model/teleport/session/TeleportSession;LP7/a;)V
    .locals 3

    const-string v0, "teleport"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teleportManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consoleService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teleportSession"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/b;->a:LI7/a;

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/b;->b:LFd/D;

    iput-object p3, p0, Lcom/ui/wifiman/model/teleport/b;->c:LFd/C;

    iput-object p4, p0, Lcom/ui/wifiman/model/teleport/b;->d:Lcom/ui/wifiman/model/teleport/session/TeleportSession;

    iput-object p5, p0, Lcom/ui/wifiman/model/teleport/b;->e:LP7/a;

    invoke-static {}, LFg/c;->j2()LFg/c;

    move-result-object p2

    const-string p3, "create(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/b;->f:LFg/c;

    sget-object p3, Lcom/ui/wifiman/model/teleport/b$b$b;->a:Lcom/ui/wifiman/model/teleport/b$b$b;

    invoke-static {p3}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p3

    const-string p4, "createDefault(...)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/ui/wifiman/model/teleport/b;->g:LFg/a;

    invoke-virtual {p3}, Lgg/i;->W()Lgg/i;

    move-result-object p3

    invoke-virtual {p3}, Lgg/i;->e1()Lgg/i;

    move-result-object p3

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p4

    const/4 p5, 0x0

    const/4 v0, 0x1

    invoke-virtual {p3, p4, p5, v0}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p3

    invoke-virtual {p3, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p3

    invoke-virtual {p3}, Ljg/a;->i2()Lgg/i;

    move-result-object p3

    const-string p4, "refCount(...)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/ui/wifiman/model/teleport/b;->h:Lgg/i;

    invoke-virtual {p2}, Lgg/i;->o0()Lgg/z;

    move-result-object p2

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {p2, v1}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object p2

    new-instance v1, Lcom/ui/wifiman/model/teleport/b$f;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/model/teleport/b$f;-><init>(Lcom/ui/wifiman/model/teleport/b;)V

    invoke-virtual {p2, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p2

    sget-object v1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$CancelledByUser;->a:Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$CancelledByUser;

    invoke-static {v1}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object v1

    invoke-virtual {p2, v1}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object p2

    const-string v1, "andThen(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/b;->i:Lgg/b;

    invoke-interface {p1}, LI7/a;->a()Lcom/ubnt/teleport/TeleportTunnelManager;

    move-result-object p1

    invoke-interface {p1}, Lcom/ubnt/teleport/TeleportTunnelManager;->a()Lgg/i;

    move-result-object p1

    sget-object v1, Lcom/ui/wifiman/model/teleport/b$m;->a:Lcom/ui/wifiman/model/teleport/b$m;

    invoke-virtual {p1, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v1, Lcom/ui/wifiman/model/teleport/b$n;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/model/teleport/b$n;-><init>(Lcom/ui/wifiman/model/teleport/b;)V

    invoke-static {p1, p3, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    sget-object p3, Lcom/ui/wifiman/model/teleport/b$o;->a:Lcom/ui/wifiman/model/teleport/b$o;

    invoke-virtual {p1, p3}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/b;->j:Lgg/i;

    sget-object p3, LAg/c;->a:LAg/c;

    const-wide/16 v1, 0x64

    invoke-direct {p0, p1, v1, v2}, Lcom/ui/wifiman/model/teleport/b;->p(Lgg/i;J)Lgg/i;

    move-result-object v1

    invoke-virtual {p3, p1, v1}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object p3

    new-instance v1, LFd/y;

    invoke-direct {v1}, LFd/y;-><init>()V

    invoke-virtual {p3, v1}, Lgg/i;->r1(Lkg/b;)Lgg/i;

    move-result-object p3

    sget-object v1, Lcom/ui/wifiman/model/teleport/b$x;->a:Lcom/ui/wifiman/model/teleport/b$x;

    invoke-virtual {p3, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p3

    invoke-virtual {p3}, Lgg/i;->W()Lgg/i;

    move-result-object p3

    invoke-virtual {p3}, Lgg/i;->e1()Lgg/i;

    move-result-object p3

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {p3, v1, p5, v0}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p3

    invoke-virtual {p3, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p3

    invoke-virtual {p3}, Ljg/a;->i2()Lgg/i;

    move-result-object p3

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/ui/wifiman/model/teleport/b;->k:Lgg/i;

    invoke-direct {p0}, Lcom/ui/wifiman/model/teleport/b;->q()Lgg/b;

    move-result-object p3

    invoke-direct {p0}, Lcom/ui/wifiman/model/teleport/b;->s()Lgg/b;

    move-result-object p4

    const/4 v1, 0x2

    new-array v1, v1, [Lgg/f;

    aput-object p3, v1, p5

    aput-object p4, v1, v0

    invoke-static {v1}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p3

    invoke-virtual {p3, p2}, Lgg/b;->K(Lgg/f;)Lgg/b;

    move-result-object p2

    new-instance p3, Lcom/ui/wifiman/model/teleport/b$p;

    invoke-direct {p3, p0}, Lcom/ui/wifiman/model/teleport/b$p;-><init>(Lcom/ui/wifiman/model/teleport/b;)V

    invoke-virtual {p1, p3}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->o0()Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->y()Lgg/b;

    move-result-object p1

    invoke-virtual {p2, p1}, Lgg/b;->X(Lgg/f;)Lgg/b;

    move-result-object p1

    const-string p2, "takeUntil(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/teleport/b;->y(Lgg/b;)Lgg/b;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/teleport/b$q;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/teleport/b$q;-><init>(Lcom/ui/wifiman/model/teleport/b;)V

    invoke-virtual {p1, p2}, Lgg/b;->z(Lkg/f;)Lgg/b;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/teleport/b$r;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/teleport/b$r;-><init>(Lcom/ui/wifiman/model/teleport/b;)V

    invoke-virtual {p1, p2}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    new-instance p2, LFd/z;

    invoke-direct {p2, p0}, LFd/z;-><init>(Lcom/ui/wifiman/model/teleport/b;)V

    invoke-virtual {p1, p2}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/teleport/b$s;->a:Lcom/ui/wifiman/model/teleport/b$s;

    invoke-virtual {p1, p2}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    invoke-virtual {p1}, Lgg/b;->c0()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->E0()Lgg/b;

    move-result-object p1

    const-string p2, "ignoreElements(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/b;->l:Lgg/b;

    return-void
.end method

.method private static final A(LYg/s;LYg/s;)LYg/s;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYg/s;->a()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {v0}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a;->a()F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_0

    cmpg-float v1, p1, v2

    if-gez v1, :cond_0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p0, p1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-static {v0, p0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static synthetic a(LYg/s;LYg/s;)LYg/s;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/teleport/b;->A(LYg/s;LYg/s;)LYg/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()V
    .locals 0

    invoke-static {}, Lcom/ui/wifiman/model/teleport/b;->u()V

    return-void
.end method

.method public static synthetic c()V
    .locals 0

    invoke-static {}, Lcom/ui/wifiman/model/teleport/b;->r()V

    return-void
.end method

.method public static synthetic d(Lcom/ui/wifiman/model/teleport/b;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/teleport/b;->t(Lcom/ui/wifiman/model/teleport/b;)V

    return-void
.end method

.method public static final synthetic e(Lcom/ui/wifiman/model/teleport/b;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)Lcom/ui/wifiman/model/teleport/TeleportConnection$a;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/teleport/b;->n(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcom/ui/wifiman/model/teleport/b;Lcom/ui/wifiman/model/teleport/b$b;)Lcom/ui/wifiman/model/teleport/TeleportConnection$a;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/teleport/b;->o(Lcom/ui/wifiman/model/teleport/b$b;)Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/ui/wifiman/model/teleport/b;)LP7/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/b;->e:LP7/a;

    return-object p0
.end method

.method public static final synthetic h(Lcom/ui/wifiman/model/teleport/b;)LFg/c;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/b;->f:LFg/c;

    return-object p0
.end method

.method public static final synthetic i(Lcom/ui/wifiman/model/teleport/b;Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)J
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/teleport/b;->v(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic j(Lcom/ui/wifiman/model/teleport/b;)LFd/D;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/b;->b:LFd/D;

    return-object p0
.end method

.method public static final synthetic k(Lcom/ui/wifiman/model/teleport/b;)LFg/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/b;->g:LFg/a;

    return-object p0
.end method

.method public static final synthetic l(Lcom/ui/wifiman/model/teleport/b;Ljava/lang/Throwable;)Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/teleport/b;->x(Ljava/lang/Throwable;)Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(Lcom/ui/wifiman/model/teleport/b;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/teleport/b;->z(Ljava/lang/Throwable;)V

    return-void
.end method

.method private final n(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)Lcom/ui/wifiman/model/teleport/TeleportConnection$a;
    .locals 4

    instance-of v0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c$a;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c$a;

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c$a;->a()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/teleport/b;->x(Ljava/lang/Throwable;)Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;-><init>(Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)V

    goto :goto_2

    :cond_0
    instance-of v0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c$c;

    const/4 v1, 0x0

    if-nez v0, :cond_8

    instance-of v0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c$b;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$b$c;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$a;

    invoke-direct {v0, v3, v2, v1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$a;-><init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_2
    instance-of v0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$b$d;

    if-eqz v0, :cond_3

    new-instance v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$b;

    invoke-direct {v0, v3, v2, v1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$b;-><init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_3
    instance-of v0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$b$e;

    if-nez v0, :cond_7

    instance-of v0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$b$b;

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    instance-of v0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$b$a;

    if-eqz v0, :cond_5

    new-instance v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$d;

    invoke-direct {v0, v3, v2, v1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$d;-><init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_5
    instance-of v0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;

    if-eqz v0, :cond_6

    new-instance v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$a;

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;->a()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$e;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$a;-><init>(LH7/b;)V

    goto :goto_2

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    :goto_0
    new-instance v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$e;

    invoke-direct {v0, v3, v2, v1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$e;-><init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_8
    :goto_1
    new-instance v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;-><init>(Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)V

    :goto_2
    return-object v0
.end method

.method private final o(Lcom/ui/wifiman/model/teleport/b$b;)Lcom/ui/wifiman/model/teleport/TeleportConnection$a;
    .locals 3

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/b$b$a;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;

    check-cast p1, Lcom/ui/wifiman/model/teleport/b$b$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/b$b$a;->a()Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;-><init>(Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/b$b$c;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    instance-of p1, p1, Lcom/ui/wifiman/model/teleport/b$b$b;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;-><init>(Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)V

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    new-instance v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$c;

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, p1, v2, v1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$c;-><init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    return-object v0
.end method

.method private final p(Lgg/i;J)Lgg/i;
    .locals 2

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v1, Lcom/ui/wifiman/model/teleport/b$c;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/model/teleport/b$c;-><init>(Lcom/ui/wifiman/model/teleport/b;)V

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    new-instance v1, Lcom/ui/wifiman/model/teleport/b$d;

    invoke-direct {v1, v0, p2, p3}, Lcom/ui/wifiman/model/teleport/b$d;-><init>(Lkotlin/jvm/internal/N;J)V

    invoke-virtual {p1, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/teleport/b$e;

    invoke-direct {p2, v0}, Lcom/ui/wifiman/model/teleport/b$e;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-virtual {p1, p2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string p2, "distinctUntilChanged(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final q()Lgg/b;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/b;->d:Lcom/ui/wifiman/model/teleport/session/TeleportSession;

    invoke-interface {v0}, Lcom/ui/wifiman/model/teleport/session/TeleportSession;->d()Lgg/i;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/teleport/b$g;->a:Lcom/ui/wifiman/model/teleport/b$g;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/teleport/b$h;->a:Lcom/ui/wifiman/model/teleport/b$h;

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string v1, "flatMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final r()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "TeleportConnection - Connect FINISHED"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private final s()Lgg/b;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/b;->c:LFd/C;

    invoke-interface {v0}, LFd/C;->a()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/teleport/b$j;->a:Lcom/ui/wifiman/model/teleport/b$j;

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/b$k;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/model/teleport/b$k;-><init>(Lcom/ui/wifiman/model/teleport/b;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/teleport/b$l;->a:Lcom/ui/wifiman/model/teleport/b$l;

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string v1, "flatMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final t(Lcom/ui/wifiman/model/teleport/b;)V
    .locals 1

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/b;->g:LFg/a;

    sget-object v0, Lcom/ui/wifiman/model/teleport/b$b$b;->a:Lcom/ui/wifiman/model/teleport/b$b$b;

    invoke-virtual {p0, v0}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private static final u()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "TeleportConnection - Disconnect FINISHED"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private final v(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)J
    .locals 5

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_2

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$c;

    const-wide/16 v1, 0xbb8

    if-eqz v0, :cond_1

    :goto_0
    move-wide v0, v1

    goto :goto_2

    :cond_1
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$a;

    const-wide/16 v3, 0x3e8

    if-eqz v0, :cond_2

    :goto_1
    move-wide v0, v3

    goto :goto_2

    :cond_2
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$b;

    if-eqz v0, :cond_3

    const-wide/16 v0, 0x2ee0

    goto :goto_2

    :cond_3
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$e;

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$d;

    if-eqz v0, :cond_5

    goto :goto_1

    :cond_5
    instance-of p1, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$a;

    if-eqz p1, :cond_6

    goto :goto_1

    :goto_2
    return-wide v0

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final x(Ljava/lang/Throwable;)Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;
    .locals 1

    instance-of v0, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Cloud;

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Cloud;-><init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$InterruptedByUser;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$CancelledByUser;->a:Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$CancelledByUser;

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Tunnel;

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Tunnel;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;

    if-eqz v0, :cond_3

    new-instance v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$ConsoleConnection;

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$ConsoleConnection;-><init>(Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;)V

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private final y(Lgg/b;)Lgg/b;
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/b$w;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/teleport/b$w;-><init>(Lcom/ui/wifiman/model/teleport/b;)V

    invoke-virtual {p1, v0}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string v0, "onErrorResumeNext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final z(Ljava/lang/Throwable;)V
    .locals 2

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$CancelledByUser;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/b;->e:LP7/a;

    new-instance v1, LP7/c$p$a;

    invoke-direct {v1, p1}, LP7/c$p$a;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, LP7/a;->b(LP7/c;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public connect()Lgg/b;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/b;->e:LP7/a;

    sget-object v1, LP7/c$p$b;->c:LP7/c$p$b;

    invoke-interface {v0, v1}, LP7/a;->d(LP7/c;)Lgg/b;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/b;->l:Lgg/b;

    invoke-virtual {v0, v1}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/teleport/b$i;->a:Lcom/ui/wifiman/model/teleport/b$i;

    invoke-virtual {v0, v1}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object v0

    new-instance v1, LFd/x;

    invoke-direct {v1}, LFd/x;-><init>()V

    invoke-virtual {v0, v1}, Lgg/b;->w(Lkg/a;)Lgg/b;

    move-result-object v0

    invoke-virtual {v0}, Lgg/b;->l()Lgg/b;

    move-result-object v0

    const-string v1, "cache(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public disconnect()Lgg/b;
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/b;->i:Lgg/b;

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/teleport/b;->y(Lgg/b;)Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/b$t;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/model/teleport/b$t;-><init>(Lcom/ui/wifiman/model/teleport/b;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v1

    const-string v2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/b;->K(Lgg/f;)Lgg/b;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/teleport/b$u;->a:Lcom/ui/wifiman/model/teleport/b$u;

    invoke-virtual {v0, v1}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object v0

    new-instance v1, LFd/w;

    invoke-direct {v1}, LFd/w;-><init>()V

    invoke-virtual {v0, v1}, Lgg/b;->w(Lkg/a;)Lgg/b;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/teleport/b$v;->a:Lcom/ui/wifiman/model/teleport/b$v;

    invoke-virtual {v0, v1}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string v1, "onErrorResumeNext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getState()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/b;->k:Lgg/i;

    return-object v0
.end method

.method protected final w()LI7/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/b;->a:LI7/a;

    return-object v0
.end method
