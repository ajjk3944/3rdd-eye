.class public final Lrd/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrd/d$a;,
        Lrd/d$b;
    }
.end annotation


# static fields
.field public static final e:Lrd/d$a;


# instance fields
.field private final a:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;

.field private final b:Lgg/i;

.field private final c:Lgg/i;

.field private final d:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrd/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrd/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lrd/d;->e:Lrd/d$a;

    return-void
.end method

.method public constructor <init>(LZc/f;Lje/u;Lld/b;Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;)V
    .locals 1

    const-string v0, "networkConnection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wifiConnectionService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bonjour"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lrd/d;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;

    invoke-interface {p1}, LZc/f;->getState()Lgg/i;

    move-result-object p1

    invoke-interface {p2}, Lje/u;->a()Lgg/i;

    move-result-object p2

    sget-object p4, Lrd/d$c;->a:Lrd/d$c;

    invoke-static {p1, p2, p4}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p4, "refCount(...)"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lrd/d;->b:Lgg/i;

    invoke-interface {p3}, Lld/b;->a()Lgg/i;

    move-result-object p3

    sget-object v0, Lrd/d$j;->a:Lrd/d$j;

    invoke-virtual {p3, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p3

    invoke-virtual {p3}, Lgg/i;->W()Lgg/i;

    move-result-object p3

    const-string v0, "distinctUntilChanged(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lrd/d;->c:Lgg/i;

    new-instance p3, Lrd/d$d;

    invoke-direct {p3, p0}, Lrd/d$d;-><init>(Lrd/d;)V

    invoke-virtual {p1, p3}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p3

    invoke-virtual {p1, p3}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    sget-object p3, Lrd/d$e;->a:Lrd/d$e;

    invoke-virtual {p1, p3}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lrd/d;->d:Lgg/i;

    return-void
.end method

.method public static synthetic b()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    invoke-static {}, Lrd/d;->g()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic c(Lrd/d;Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;)Lrd/b$a;
    .locals 0

    invoke-direct {p0, p1}, Lrd/d;->e(Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;)Lrd/b$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lrd/d;)Lgg/i;
    .locals 0

    invoke-direct {p0}, Lrd/d;->f()Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method private final e(Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;)Lrd/b$a;
    .locals 9

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->a()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, LZg/v;->r0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/Inet4Address;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Local Speedtest Discovery - IGNORED(No IPv4) - "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    invoke-static {p1, v1, v0, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-object v1

    :cond_0
    invoke-static {v0}, Lee/b;->a(Ljava/net/InetAddress;)Linet/ipaddr/g;

    move-result-object v3

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->c()I

    move-result v4

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->d()Ljava/util/Map;

    move-result-object v0

    const-string v2, "model"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->d()Ljava/util/Map;

    move-result-object v0

    const-string v2, "wifiExperience"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    sget-object v2, LS8/g;->b:LS8/g$a;

    invoke-virtual {v2, v0}, LS8/g$a;->a(I)LS8/g;

    move-result-object v0

    move-object v7, v0

    goto :goto_0

    :cond_1
    move-object v7, v1

    :goto_0
    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->d()Ljava/util/Map;

    move-result-object p1

    const-string v0, "type"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_2

    invoke-static {p1}, Lrd/f;->a(Ljava/lang/String;)Lrd/b$a$a;

    move-result-object v1

    :cond_2
    move-object v8, v1

    new-instance p1, Lrd/b$a;

    move-object v2, p1

    invoke-direct/range {v2 .. v8}, Lrd/b$a;-><init>(Linet/ipaddr/g;ILjava/lang/String;Ljava/lang/String;LS8/g;Lrd/b$a$a;)V

    return-object p1
.end method

.method private final f()Lgg/i;
    .locals 4

    sget-object v0, LAg/c;->a:LAg/c;

    iget-object v1, p0, Lrd/d;->c:Lgg/i;

    iget-object v2, p0, Lrd/d;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;

    const-string v3, "_wifiman-local-speedtest._tcp"

    invoke-interface {v2, v3}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;->b(Ljava/lang/String;)Lgg/i;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object v0

    sget-object v1, Lrd/d$f;->a:Lrd/d$f;

    invoke-virtual {v0, v1}, Lgg/i;->v0(Lkg/n;)Lgg/i;

    move-result-object v0

    new-instance v1, Lrd/c;

    invoke-direct {v1}, Lrd/c;-><init>()V

    sget-object v2, Lrd/d$g;->a:Lrd/d$g;

    invoke-virtual {v0, v1, v2}, Lgg/i;->s1(Lkg/q;Lkg/b;)Lgg/i;

    move-result-object v0

    new-instance v1, Lrd/d$h;

    invoke-direct {v1, p0}, Lrd/d$h;-><init>(Lrd/d;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    sget-object v1, Lrd/d$i;->a:Lrd/d$i;

    invoke-virtual {v0, v1}, Lgg/i;->p1(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->e1()Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object v0

    const-string v1, "observeOn(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final g()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lrd/d;->d:Lgg/i;

    return-object v0
.end method
