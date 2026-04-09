.class public final Lcom/ui/wifiman/model/discovery/engine/bonjour/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/discovery/engine/bonjour/e$a;,
        Lcom/ui/wifiman/model/discovery/engine/bonjour/e$b;,
        Lcom/ui/wifiman/model/discovery/engine/bonjour/e$c;
    }
.end annotation


# static fields
.field public static final e:Lcom/ui/wifiman/model/discovery/engine/bonjour/e$a;


# instance fields
.field private final a:Landroid/net/wifi/WifiManager;

.field private final b:Lgg/y;

.field private final c:Lgg/i;

.field private final d:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->e:Lcom/ui/wifiman/model/discovery/engine/bonjour/e$a;

    return-void
.end method

.method public constructor <init>(LZc/f;Landroid/net/wifi/WifiManager;)V
    .locals 4

    const-string v0, "networkConnection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wifiManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->a:Landroid/net/wifi/WifiManager;

    const-class p2, LLg/c;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object p2

    sget-object v0, Ljava/util/logging/Level;->OFF:Ljava/util/logging/Level;

    invoke-virtual {p2, v0}, Ljava/util/logging/Logger;->setLevel(Ljava/util/logging/Level;)V

    const-class p2, Ljavax/jmdns/impl/constants/e;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/util/logging/Logger;->setLevel(Ljava/util/logging/Level;)V

    const-class p2, Ljavax/jmdns/impl/constants/d;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/util/logging/Logger;->setLevel(Ljava/util/logging/Level;)V

    const-class p2, LLg/c$b;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/util/logging/Logger;->setLevel(Ljava/util/logging/Level;)V

    sget-object p2, Lm9/c;->a:Lm9/c;

    const-wide/16 v0, 0xbb8

    const-string v2, "RxBonjour"

    const/4 v3, 0x1

    invoke-virtual {p2, v3, v0, v1, v2}, Lm9/c;->e(IJLjava/lang/String;)Lgg/y;

    move-result-object p2

    iput-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->b:Lgg/y;

    invoke-interface {p1}, LZc/f;->getState()Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$j;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$j;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;)V

    invoke-virtual {p1, p2}, Lgg/i;->x0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$k;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e$k;

    invoke-virtual {p1, p2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->c:Lgg/i;

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$h;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$h;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;)V

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$i;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e$i;

    invoke-virtual {p1, v0}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->d:Lgg/i;

    return-void
.end method

.method public static final synthetic d(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;LKg/d;)Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->j(LKg/d;)Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;)LKg/d;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->k(Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;)LKg/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Lb8/c;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->m(Lb8/c;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic h(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;)Landroid/net/wifi/WifiManager;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->a:Landroid/net/wifi/WifiManager;

    return-object p0
.end method

.method public static final synthetic i(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Lgg/h;)LKg/e;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->n(Lgg/h;)LKg/e;

    move-result-object p0

    return-object p0
.end method

.method private final j(LKg/d;)Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;
    .locals 11

    invoke-static {}, LZg/U;->c()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, LKg/d;->q()Ljava/util/Enumeration;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, LKg/d;->q()Ljava/util/Enumeration;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-static {v2}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, v3

    :goto_1
    if-eqz v2, :cond_0

    invoke-virtual {p1, v2}, LKg/d;->r(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-static {v0}, LZg/U;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v7

    invoke-virtual {p1}, LKg/d;->n()Ljava/lang/String;

    move-result-object v5

    const-string v0, "getName(...)"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LKg/d;->A()Ljava/lang/String;

    move-result-object v6

    const-string v0, "getType(...)"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/d0;->b()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1}, LKg/d;->i()[Ljava/net/Inet4Address;

    move-result-object v1

    const-string v2, "getInet4Addresses(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_2
    if-ge v4, v2, :cond_3

    aget-object v8, v1, v4

    invoke-static {v8}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v0, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_3
    sget-object v1, LYg/J;->a:LYg/J;

    invoke-static {v0}, LZg/d0;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v8

    invoke-static {}, LZg/d0;->b()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1}, LKg/d;->k()[Ljava/net/Inet6Address;

    move-result-object v1

    const-string v2, "getInet6Addresses(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v2, v1

    :goto_3
    if-ge v3, v2, :cond_4

    aget-object v4, v1, v3

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_4
    sget-object v1, LYg/J;->a:LYg/J;

    invoke-static {v0}, LZg/d0;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v9

    invoke-virtual {p1}, LKg/d;->o()I

    move-result v10

    new-instance p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;

    move-object v4, p1

    invoke-direct/range {v4 .. v10}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;I)V

    return-object p1
.end method

.method private final k(Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;)LKg/d;
    .locals 8

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->c()I

    move-result v3

    const/4 v6, 0x1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;->d()Ljava/util/Map;

    move-result-object v7

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, LKg/d;->d(Ljava/lang/String;Ljava/lang/String;IIIZLjava/util/Map;)LKg/d;

    move-result-object p1

    const-string v0, "create(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final l(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, ".local."

    const/4 v3, 0x0

    invoke-static {p1, v2, v3, v0, v1}, Lkotlin/text/t;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private final m(Lb8/c;)Z
    .locals 2

    sget-object v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :cond_2
    return v0
.end method

.method private final n(Lgg/h;)LKg/e;
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$l;

    invoke-direct {v0, p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$l;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Lgg/h;)V

    return-object v0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->d:Lgg/i;

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->b:Lgg/y;

    invoke-virtual {v0, v1}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f;

    invoke-virtual {v0, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->b:Lgg/y;

    invoke-virtual {v0, v1}, Lgg/i;->g2(Lgg/y;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->a1()Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$g;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/e$g;

    invoke-virtual {v0, v1}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v0

    const-string v1, "doOnNext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lgg/i;
    .locals 2

    const-string v0, "serviceType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->d:Lgg/i;

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->b:Lgg/y;

    invoke-virtual {v0, v1}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$d;

    invoke-direct {v1, p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$d;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->b:Lgg/y;

    invoke-virtual {v0, v1}, Lgg/i;->g2(Lgg/y;)Lgg/i;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->b:Lgg/y;

    invoke-virtual {v0, v1}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->a1()Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$e;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    const-string v0, "doOnNext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c(Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;)Lgg/b;
    .locals 2

    const-string v0, "bs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->d:Lgg/i;

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->b:Lgg/y;

    invoke-virtual {v0, v1}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$m;

    invoke-direct {v1, p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$m;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/e;Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour$a;)V

    invoke-virtual {v0, v1}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e;->b:Lgg/y;

    invoke-virtual {p1, v0}, Lgg/b;->i0(Lgg/y;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string v0, "observeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
