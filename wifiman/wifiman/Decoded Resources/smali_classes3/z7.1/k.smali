.class public final Lz7/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz7/x;


# instance fields
.field private final a:Lmh/l;

.field private final b:Lmh/a;


# direct methods
.method public constructor <init>(Lmh/l;Lmh/a;)V
    .locals 1

    const-string/jumbo v0, "rawMulticastSocketFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "interfacesProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lz7/k;->a:Lmh/l;

    .line 3
    iput-object p2, p0, Lz7/k;->b:Lmh/a;

    return-void
.end method

.method public synthetic constructor <init>(Lmh/l;Lmh/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 4
    invoke-static {}, Lz7/l;->b()Lmh/l;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 5
    invoke-static {}, Lz7/l;->a()Lmh/a;

    move-result-object p2

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2}, Lz7/k;-><init>(Lmh/l;Lmh/a;)V

    return-void
.end method

.method public static final synthetic b(Lz7/k;Lz7/m;)I
    .locals 0

    invoke-direct {p0, p1}, Lz7/k;->c(Lz7/m;)I

    move-result p0

    return p0
.end method

.method private final c(Lz7/m;)I
    .locals 2

    invoke-interface {p1}, Lz7/m;->b()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-interface {p1}, Lz7/m;->a()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lz7/m;->getType()Lz7/p;

    move-result-object v0

    sget-object v1, Lz7/p;->VPN:Lz7/p;

    if-ne v0, v1, :cond_1

    const/16 p1, 0x64

    goto :goto_1

    :cond_1
    invoke-interface {p1}, Lz7/m;->getType()Lz7/p;

    move-result-object v0

    sget-object v1, Lz7/p;->WIFI:Lz7/p;

    if-ne v0, v1, :cond_2

    const/16 p1, 0x32

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Lz7/m;->getType()Lz7/p;

    move-result-object p1

    sget-object v0, Lz7/p;->ETHERNET:Lz7/p;

    if-ne p1, v0, :cond_3

    const/16 p1, 0x14

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    const/16 p1, -0x64

    :goto_1
    return p1
.end method


# virtual methods
.method public a(Ljava/lang/Integer;)Ljava/net/DatagramSocket;
    .locals 4

    new-instance v0, Lz7/k$b;

    invoke-direct {v0, p1}, Lz7/k$b;-><init>(Ljava/lang/Integer;)V

    invoke-static {v0}, Lx7/a;->c(Lmh/a;)V

    iget-object v0, p0, Lz7/k;->a:Lmh/l;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/net/MulticastSocket;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/net/DatagramSocket;->setBroadcast(Z)V

    invoke-virtual {p1, v0}, Ljava/net/DatagramSocket;->setReuseAddress(Z)V

    iget-object v0, p0, Lz7/k;->b:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lz7/m;

    invoke-direct {p0, v3}, Lz7/k;->c(Lz7/m;)I

    move-result v3

    if-lez v3, :cond_1

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v0, Lz7/k$a;

    invoke-direct {v0, p0}, Lz7/k$a;-><init>(Lz7/k;)V

    invoke-static {v1, v0}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz7/m;

    if-eqz v0, :cond_3

    invoke-interface {v0, p1}, Lz7/m;->c(Ljava/net/MulticastSocket;)V

    :cond_3
    return-object p1
.end method
