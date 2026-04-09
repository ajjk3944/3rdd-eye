.class public final Lcom/ui/wifiman/model/teleport/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/teleport/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/teleport/l$a;,
        Lcom/ui/wifiman/model/teleport/l$b;,
        Lcom/ui/wifiman/model/teleport/l$c;,
        Lcom/ui/wifiman/model/teleport/l$d;
    }
.end annotation


# static fields
.field public static final m:Lcom/ui/wifiman/model/teleport/l$a;


# instance fields
.field private final a:LI7/a;

.field private final b:LKd/d;

.field private final c:LKd/b;

.field private final d:LZc/f;

.field private final e:Lgg/i;

.field private final f:Lgg/i;

.field private final g:Lgg/i;

.field private final h:Lgg/i;

.field private final i:Lgg/i;

.field private final j:Lgg/b;

.field private final k:Lgg/i;

.field private final l:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/teleport/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/teleport/l$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/teleport/l;->m:Lcom/ui/wifiman/model/teleport/l$a;

    return-void
.end method

.method public constructor <init>(LFd/D;LI7/a;LKd/d;LKd/b;LZc/f;)V
    .locals 4

    const-string v0, "teleportManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unifiTeleport"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tunnelRecordStorage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tunnelRecordFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkConnection"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/l;->a:LI7/a;

    iput-object p3, p0, Lcom/ui/wifiman/model/teleport/l;->b:LKd/d;

    iput-object p4, p0, Lcom/ui/wifiman/model/teleport/l;->c:LKd/b;

    iput-object p5, p0, Lcom/ui/wifiman/model/teleport/l;->d:LZc/f;

    invoke-interface {p1}, LFd/D;->getAll()Lgg/i;

    move-result-object p2

    sget-object p3, Lcom/ui/wifiman/model/teleport/l$l;->a:Lcom/ui/wifiman/model/teleport/l$l;

    invoke-virtual {p2, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->e1()Lgg/i;

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

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/l;->e:Lgg/i;

    new-instance p2, Lcom/ui/wifiman/model/teleport/l$j;

    invoke-direct {p2}, Lcom/ui/wifiman/model/teleport/l$j;-><init>()V

    invoke-static {p2}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p2

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/ui/wifiman/model/teleport/l$p;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/model/teleport/l$p;-><init>(Lcom/ui/wifiman/model/teleport/l;)V

    invoke-virtual {p2, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->h1()Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/l;->f:Lgg/i;

    new-instance v1, Lcom/ui/wifiman/model/teleport/l$k;

    invoke-direct {v1}, Lcom/ui/wifiman/model/teleport/l$k;-><init>()V

    invoke-static {v1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/teleport/l$q;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/teleport/l$q;-><init>(Lcom/ui/wifiman/model/teleport/l;)V

    invoke-virtual {v1, v0}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object v0

    const-wide/16 v1, 0x3e8

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lgg/i;->U1(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->e1()Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p3}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v0

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-virtual {v0, v1}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    invoke-static {v0, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ui/wifiman/model/teleport/l;->g:Lgg/i;

    invoke-interface {p5}, LZc/f;->getState()Lgg/i;

    move-result-object p5

    sget-object v1, Lcom/ui/wifiman/model/teleport/l$f;->a:Lcom/ui/wifiman/model/teleport/l$f;

    invoke-virtual {p5, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p5

    invoke-virtual {p5}, Lgg/i;->W()Lgg/i;

    move-result-object p5

    invoke-virtual {p5, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p5

    invoke-virtual {p5}, Ljg/a;->i2()Lgg/i;

    move-result-object p5

    invoke-static {p5, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p5, p0, Lcom/ui/wifiman/model/teleport/l;->h:Lgg/i;

    const-class p5, Lcom/ui/wifiman/model/teleport/l$c$a;

    invoke-virtual {p2, p5}, Lgg/i;->Z0(Ljava/lang/Class;)Lgg/i;

    move-result-object p2

    const-string p5, "ofType(R::class.java)"

    invoke-static {p2, p5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p5, Lcom/ui/wifiman/model/teleport/l$m;

    invoke-direct {p5, p0}, Lcom/ui/wifiman/model/teleport/l$m;-><init>(Lcom/ui/wifiman/model/teleport/l;)V

    invoke-virtual {p2, p5}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->h1()Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/l;->i:Lgg/i;

    sget-object p5, LAg/c;->a:LAg/c;

    invoke-interface {p1}, LFd/D;->getAll()Lgg/i;

    move-result-object v1

    sget-object v2, Lcom/ui/wifiman/model/teleport/l$n;->a:Lcom/ui/wifiman/model/teleport/l$n;

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    const-string v2, "map(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p5, v1, p2}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object p2

    new-instance p5, Lcom/ui/wifiman/model/teleport/l$o;

    invoke-direct {p5, p0}, Lcom/ui/wifiman/model/teleport/l$o;-><init>(Lcom/ui/wifiman/model/teleport/l;)V

    invoke-virtual {p2, p5}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object p2

    const-string p5, "switchMapCompletable(...)"

    invoke-static {p2, p5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/l;->j:Lgg/b;

    invoke-interface {p1}, LFd/D;->getAll()Lgg/i;

    move-result-object p5

    sget-object v1, Lcom/ui/wifiman/model/teleport/l$e;->a:Lcom/ui/wifiman/model/teleport/l$e;

    invoke-static {p5, v0, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p5

    invoke-virtual {p5}, Lgg/i;->e1()Lgg/i;

    move-result-object p5

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p5, v0}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p5

    invoke-virtual {p5, p2}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    invoke-virtual {p2, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/teleport/l;->k:Lgg/i;

    invoke-interface {p1}, LFd/D;->a()Lgg/i;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/teleport/l$g;->a:Lcom/ui/wifiman/model/teleport/l$g;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/l;->getAll()Lgg/i;

    move-result-object p2

    sget-object p5, Lcom/ui/wifiman/model/teleport/l$h;->a:Lcom/ui/wifiman/model/teleport/l$h;

    invoke-static {p1, p2, p5}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/l;->l:Lgg/i;

    return-void
.end method

.method public static final synthetic a(Lcom/ui/wifiman/model/teleport/l;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/l;->e:Lgg/i;

    return-object p0
.end method

.method public static final synthetic b(Lcom/ui/wifiman/model/teleport/l;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/l;->i:Lgg/i;

    return-object p0
.end method

.method public static final synthetic c(Lcom/ui/wifiman/model/teleport/l;)LKd/b;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/l;->c:LKd/b;

    return-object p0
.end method

.method public static final synthetic d(Lcom/ui/wifiman/model/teleport/l;)LKd/d;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/l;->b:LKd/d;

    return-object p0
.end method

.method public static final synthetic e(Lcom/ui/wifiman/model/teleport/l;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/l;->f:Lgg/i;

    return-object p0
.end method

.method public static final synthetic f(Lcom/ui/wifiman/model/teleport/l;)LI7/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/l;->a:LI7/a;

    return-object p0
.end method

.method public static final synthetic g(Lcom/ui/wifiman/model/teleport/l;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/teleport/l;->h:Lgg/i;

    return-object p0
.end method

.method public static final synthetic h(Lcom/ui/wifiman/model/teleport/l;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)Lgg/i;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/teleport/l;->i(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method private final i(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)Lgg/i;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/l;->a:LI7/a;

    invoke-interface {v0}, LI7/a;->d()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;

    move-result-object v0

    invoke-interface {p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;->getConfig()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;->a()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;->b(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/l$i;

    invoke-direct {v1, p0, p1}, Lcom/ui/wifiman/model/teleport/l$i;-><init>(Lcom/ui/wifiman/model/teleport/l;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;)V

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "flatMapPublisher(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public getAll()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/l;->k:Lgg/i;

    return-object v0
.end method
