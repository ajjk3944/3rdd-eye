.class public Linet/ipaddr/ipv6/b;
.super Linet/ipaddr/g;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/ipv6/b$b;,
        Linet/ipaddr/ipv6/b$c;
    }
.end annotation


# static fields
.field public static final s:Ljava/lang/String;


# instance fields
.field private final p:Linet/ipaddr/ipv6/b$c;

.field private transient q:Linet/ipaddr/ipv6/Q$f;

.field transient r:Linet/ipaddr/ipv6/Q$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xbb

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Linet/ipaddr/ipv6/b;->s:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Linet/ipaddr/ipv6/Q;)V
    .locals 1

    const/4 v0, 0x0

    .line 12
    invoke-direct {p0, p1, v0}, Linet/ipaddr/ipv6/b;-><init>(Linet/ipaddr/ipv6/Q;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public constructor <init>(Linet/ipaddr/ipv6/Q;Linet/ipaddr/ipv6/b$c;)V
    .locals 2

    .line 5
    invoke-direct {p0, p1}, Linet/ipaddr/g;-><init>(Linet/ipaddr/j;)V

    .line 6
    invoke-virtual {p1}, Linet/ipaddr/j;->Z()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 7
    iget v0, p1, Linet/ipaddr/ipv6/Q;->v:I

    if-nez v0, :cond_0

    .line 8
    iput-object p2, p0, Linet/ipaddr/ipv6/b;->p:Linet/ipaddr/ipv6/b$c;

    return-void

    .line 9
    :cond_0
    new-instance p2, Linet/ipaddr/AddressPositionException;

    iget p1, p1, Linet/ipaddr/ipv6/Q;->v:I

    invoke-direct {p2, p1}, Linet/ipaddr/AddressPositionException;-><init>(I)V

    throw p2

    .line 10
    :cond_1
    new-instance p2, Linet/ipaddr/AddressValueException;

    invoke-virtual {p1}, Linet/ipaddr/j;->Z()I

    move-result p1

    int-to-long v0, p1

    const-string p1, "ipaddress.error.ipv6.invalid.segment.count"

    invoke-direct {p2, p1, v0, v1}, Linet/ipaddr/AddressValueException;-><init>(Ljava/lang/String;J)V

    throw p2
.end method

.method public constructor <init>(Linet/ipaddr/ipv6/Q;Ljava/lang/CharSequence;)V
    .locals 1

    const/4 v0, 0x1

    .line 11
    invoke-direct {p0, p1, p2, v0}, Linet/ipaddr/ipv6/b;-><init>(Linet/ipaddr/ipv6/Q;Ljava/lang/CharSequence;Z)V

    return-void
.end method

.method constructor <init>(Linet/ipaddr/ipv6/Q;Ljava/lang/CharSequence;Z)V
    .locals 0

    if-eqz p3, :cond_0

    .line 1
    invoke-static {p2}, Linet/ipaddr/ipv6/b;->y1(Ljava/lang/CharSequence;)Linet/ipaddr/ipv6/b$c;

    move-result-object p2

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 2
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-lez p3, :cond_1

    .line 3
    new-instance p3, Linet/ipaddr/ipv6/b$c;

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p2}, Linet/ipaddr/ipv6/b$c;-><init>(Ljava/lang/String;)V

    move-object p2, p3

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 4
    :goto_0
    invoke-direct {p0, p1, p2}, Linet/ipaddr/ipv6/b;-><init>(Linet/ipaddr/ipv6/Q;Linet/ipaddr/ipv6/b$c;)V

    return-void
.end method

.method public constructor <init>(Ljava/net/Inet6Address;)V
    .locals 3

    .line 13
    invoke-virtual {p1}, Ljava/net/Inet6Address;->getAddress()[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1}, Linet/ipaddr/ipv6/b;->L1(Ljava/net/Inet6Address;)Linet/ipaddr/ipv6/b$c;

    move-result-object v2

    invoke-direct {p0, p1, v0, v1, v2}, Linet/ipaddr/ipv6/b;-><init>(Ljava/net/Inet6Address;[BLjava/lang/Integer;Linet/ipaddr/ipv6/b$c;)V

    return-void
.end method

.method private constructor <init>(Ljava/net/Inet6Address;[BLjava/lang/Integer;Linet/ipaddr/ipv6/b$c;)V
    .locals 1

    .line 14
    new-instance v0, Linet/ipaddr/ipv6/a;

    invoke-direct {v0, p2, p3}, Linet/ipaddr/ipv6/a;-><init>([BLjava/lang/Integer;)V

    invoke-direct {p0, v0}, Linet/ipaddr/g;-><init>(Ljava/util/function/Function;)V

    .line 15
    iput-object p4, p0, Linet/ipaddr/ipv6/b;->p:Linet/ipaddr/ipv6/b$c;

    .line 16
    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object p2

    invoke-virtual {p2, p1}, Linet/ipaddr/ipv6/Q;->g1(Ljava/net/InetAddress;)V

    return-void
.end method

.method private G1(ZZ)Linet/ipaddr/ipv6/b;
    .locals 6

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Linet/ipaddr/ipv6/Q;->z3(ZZ)Linet/ipaddr/ipv6/Q;

    move-result-object v1

    if-ne v1, v0, :cond_0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    iget-object v2, p0, Linet/ipaddr/ipv6/b;->r:Linet/ipaddr/ipv6/Q$e;

    if-eqz v2, :cond_4

    if-eqz p1, :cond_3

    if-eqz p2, :cond_2

    iget-object v0, v2, Lbg/d$g;->b:LZf/e;

    :goto_0
    check-cast v0, Linet/ipaddr/ipv6/b;

    goto :goto_1

    :cond_2
    iget-object v0, v2, Lbg/d$g;->a:LZf/e;

    goto :goto_0

    :cond_3
    iget-object v0, v2, Lbg/d$g;->c:LZf/e;

    goto :goto_0

    :goto_1
    if-nez v0, :cond_d

    :cond_4
    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Linet/ipaddr/ipv6/b;->r:Linet/ipaddr/ipv6/Q$e;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_5

    move v5, v4

    goto :goto_2

    :cond_5
    move v5, v3

    :goto_2
    if-eqz v5, :cond_6

    new-instance v2, Linet/ipaddr/ipv6/Q$e;

    invoke-direct {v2}, Linet/ipaddr/ipv6/Q$e;-><init>()V

    iput-object v2, p0, Linet/ipaddr/ipv6/b;->r:Linet/ipaddr/ipv6/Q$e;

    goto :goto_4

    :catchall_0
    move-exception p1

    goto :goto_6

    :cond_6
    if-eqz p1, :cond_9

    if-eqz p2, :cond_8

    iget-object v0, v2, Lbg/d$g;->b:LZf/e;

    check-cast v0, Linet/ipaddr/ipv6/b;

    if-nez v0, :cond_7

    :goto_3
    move v3, v4

    :cond_7
    move v5, v3

    goto :goto_4

    :cond_8
    iget-object v0, v2, Lbg/d$g;->a:LZf/e;

    check-cast v0, Linet/ipaddr/ipv6/b;

    if-nez v0, :cond_7

    goto :goto_3

    :cond_9
    iget-object v0, v2, Lbg/d$g;->c:LZf/e;

    check-cast v0, Linet/ipaddr/ipv6/b;

    if-nez v0, :cond_7

    goto :goto_3

    :goto_4
    if-eqz v5, :cond_c

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->A1()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Linet/ipaddr/ipv6/e$a;->N0(Linet/ipaddr/ipv6/Q;)Linet/ipaddr/ipv6/b;

    move-result-object v0

    if-eqz p1, :cond_b

    if-eqz p2, :cond_a

    iput-object v0, v2, Lbg/d$g;->b:LZf/e;

    goto :goto_5

    :cond_a
    iput-object v0, v2, Lbg/d$g;->a:LZf/e;

    goto :goto_5

    :cond_b
    iput-object v0, v2, Lbg/d$g;->c:LZf/e;

    :cond_c
    :goto_5
    monitor-exit p0

    :cond_d
    return-object v0

    :goto_6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private static L1(Ljava/net/Inet6Address;)Linet/ipaddr/ipv6/b$c;
    .locals 1

    invoke-virtual {p0}, Ljava/net/Inet6Address;->getScopedInterface()Ljava/net/NetworkInterface;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance p0, Linet/ipaddr/ipv6/b$c;

    invoke-direct {p0, v0}, Linet/ipaddr/ipv6/b$c;-><init>(Ljava/net/NetworkInterface;)V

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/net/Inet6Address;->getScopeId()I

    move-result p0

    if-eqz p0, :cond_1

    new-instance v0, Linet/ipaddr/ipv6/b$c;

    invoke-direct {v0, p0}, Linet/ipaddr/ipv6/b$c;-><init>(I)V

    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private N1()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->Q1()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/ipv6/b;->p:Linet/ipaddr/ipv6/b$c;

    invoke-virtual {v0}, Linet/ipaddr/ipv6/b$c;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private O1()Z
    .locals 2

    iget-object v0, p0, Linet/ipaddr/ipv6/b;->q:Linet/ipaddr/ipv6/Q$f;

    if-nez v0, :cond_2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Linet/ipaddr/ipv6/b;->q:Linet/ipaddr/ipv6/Q$f;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->Q1()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Linet/ipaddr/ipv6/Q$f;

    invoke-direct {v0}, Linet/ipaddr/ipv6/Q$f;-><init>()V

    iput-object v0, p0, Linet/ipaddr/ipv6/b;->q:Linet/ipaddr/ipv6/Q$f;

    monitor-exit p0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/Q;->K3()Z

    move-result v1

    invoke-virtual {v0}, Linet/ipaddr/ipv6/Q;->H3()Linet/ipaddr/ipv6/Q$f;

    move-result-object v0

    iput-object v0, p0, Linet/ipaddr/ipv6/b;->q:Linet/ipaddr/ipv6/Q$f;

    monitor-exit p0

    return v1

    :cond_1
    monitor-exit p0

    goto :goto_1

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method private T1(Linet/ipaddr/ipv6/b;)Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv6/b;->p:Linet/ipaddr/ipv6/b$c;

    iget-object p1, p1, Linet/ipaddr/ipv6/b;->p:Linet/ipaddr/ipv6/b$c;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private static synthetic U1([BLjava/lang/Integer;Linet/ipaddr/a;)LZf/c;
    .locals 6

    check-cast p2, Linet/ipaddr/ipv6/b;

    invoke-virtual {p2}, Linet/ipaddr/ipv6/b;->B1()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    array-length v3, p0

    const/16 v4, 0x8

    const/4 v2, 0x0

    move-object v1, p0

    move-object v5, p1

    invoke-virtual/range {v0 .. v5}, Linet/ipaddr/ipv6/e$a;->a1([BIIILjava/lang/Integer;)Linet/ipaddr/ipv6/Q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u1([BLjava/lang/Integer;Linet/ipaddr/a;)LZf/c;
    .locals 0

    invoke-static {p0, p1, p2}, Linet/ipaddr/ipv6/b;->U1([BLjava/lang/Integer;Linet/ipaddr/a;)LZf/c;

    move-result-object p0

    return-object p0
.end method

.method static synthetic v1(Linet/ipaddr/ipv6/b;)Linet/ipaddr/ipv6/b$c;
    .locals 0

    iget-object p0, p0, Linet/ipaddr/ipv6/b;->p:Linet/ipaddr/ipv6/b$c;

    return-object p0
.end method

.method private x1(Linet/ipaddr/ipv6/Q;)Linet/ipaddr/ipv6/b;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->A1()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Linet/ipaddr/ipv6/e$a;->N0(Linet/ipaddr/ipv6/Q;)Linet/ipaddr/ipv6/b;

    move-result-object p1

    return-object p1
.end method

.method static y1(Ljava/lang/CharSequence;)Linet/ipaddr/ipv6/b$c;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-nez p0, :cond_1

    return-object v0

    :cond_1
    invoke-static {v1}, Linet/ipaddr/format/validate/s;->a0(Ljava/lang/CharSequence;)I

    move-result p0

    if-gez p0, :cond_2

    new-instance p0, Linet/ipaddr/ipv6/b$c;

    invoke-direct {p0, v1}, Linet/ipaddr/ipv6/b$c;-><init>(Ljava/lang/String;)V

    return-object p0

    :cond_2
    new-instance v0, Linet/ipaddr/AddressValueException;

    const-string v1, "ipaddress.error.invalid.zone"

    int-to-long v2, p0

    invoke-direct {v0, v1, v2, v3}, Linet/ipaddr/AddressValueException;-><init>(Ljava/lang/String;J)V

    throw v0
.end method


# virtual methods
.method A1()Linet/ipaddr/ipv6/e$a;
    .locals 4

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->B1()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->Q1()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Linet/ipaddr/ipv6/b$a;

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->H1()Linet/ipaddr/ipv6/e;

    move-result-object v2

    iget-object v3, v0, Linet/ipaddr/ipv6/e$a;->b:Linet/ipaddr/ipv6/e$a$a;

    invoke-direct {v1, p0, v2, v3}, Linet/ipaddr/ipv6/b$a;-><init>(Linet/ipaddr/ipv6/b;Linet/ipaddr/ipv6/e;Linet/ipaddr/ipv6/e$a$a;)V

    iget-boolean v0, v0, Linet/ipaddr/ipv6/e$a;->c:Z

    iput-boolean v0, v1, Linet/ipaddr/ipv6/e$a;->c:Z

    return-object v1
.end method

.method B1()Linet/ipaddr/ipv6/e$a;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->H1()Linet/ipaddr/ipv6/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/e;->T()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    return-object v0
.end method

.method public C(Linet/ipaddr/a;)Z
    .locals 1

    instance-of v0, p1, Linet/ipaddr/ipv6/b;

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Linet/ipaddr/a;->C(Linet/ipaddr/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Linet/ipaddr/ipv6/b;

    invoke-direct {p0, p1}, Linet/ipaddr/ipv6/b;->T1(Linet/ipaddr/ipv6/b;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public C1(I)Linet/ipaddr/ipv6/V;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/b;->J1(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method public D1()Linet/ipaddr/ipv4/b;
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->E1()Linet/ipaddr/ipv4/e;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv4/e;->d0()Linet/ipaddr/ipv4/e$a;

    move-result-object v0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/ipv6/Q;->w3()Linet/ipaddr/ipv4/I;

    move-result-object v1

    invoke-virtual {v0, v1}, Linet/ipaddr/ipv4/e$a;->N0(Linet/ipaddr/ipv4/I;)Linet/ipaddr/ipv4/b;

    move-result-object v0

    return-object v0
.end method

.method public E1()Linet/ipaddr/ipv4/e;
    .locals 1

    invoke-static {}, Linet/ipaddr/a;->j()Linet/ipaddr/ipv4/e;

    move-result-object v0

    return-object v0
.end method

.method public F1()Linet/ipaddr/ipv6/b;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Linet/ipaddr/ipv6/b;->G1(ZZ)Linet/ipaddr/ipv6/b;

    move-result-object v0

    return-object v0
.end method

.method public H1()Linet/ipaddr/ipv6/e;
    .locals 1

    invoke-static {}, Linet/ipaddr/a;->s()Linet/ipaddr/ipv6/e;

    move-result-object v0

    return-object v0
.end method

.method public I1()Linet/ipaddr/ipv6/Q;
    .locals 1

    invoke-super {p0}, Linet/ipaddr/g;->b1()Linet/ipaddr/j;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/Q;

    return-object v0
.end method

.method public J1(I)Linet/ipaddr/ipv6/V;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-virtual {v0, p1}, Linet/ipaddr/ipv6/Q;->C3(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method public K1()Linet/ipaddr/ipv6/b;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, v0}, Linet/ipaddr/ipv6/b;->G1(ZZ)Linet/ipaddr/ipv6/b;

    move-result-object v0

    return-object v0
.end method

.method public M1()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Linet/ipaddr/ipv6/b;->N1()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected P1()Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv6/b;->r:Linet/ipaddr/ipv6/Q$e;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Linet/ipaddr/ipv6/b;->r:Linet/ipaddr/ipv6/Q$e;

    if-nez v0, :cond_0

    new-instance v0, Linet/ipaddr/ipv6/Q$e;

    invoke-direct {v0}, Linet/ipaddr/ipv6/Q$e;-><init>()V

    iput-object v0, p0, Linet/ipaddr/ipv6/b;->r:Linet/ipaddr/ipv6/Q$e;

    monitor-exit p0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    monitor-exit p0

    goto :goto_1

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public Q1()Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/ipv6/b;->p:Linet/ipaddr/ipv6/b$c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public R1()Z
    .locals 4

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Linet/ipaddr/ipv6/b;->J1(I)Linet/ipaddr/ipv6/V;

    move-result-object v1

    const v2, 0xffff

    invoke-virtual {v1, v2}, Linet/ipaddr/k;->N2(I)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move v1, v2

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Linet/ipaddr/ipv6/b;->J1(I)Linet/ipaddr/ipv6/V;

    move-result-object v3

    invoke-virtual {v3}, Lbg/b;->c0()Z

    move-result v3

    if-nez v3, :cond_0

    return v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    return v2
.end method

.method public S1()Z
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Linet/ipaddr/ipv6/b;->J1(I)Linet/ipaddr/ipv6/V;

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0xff00

    invoke-virtual {v0, v2, v1}, Linet/ipaddr/k;->P2(ILjava/lang/Integer;)Z

    move-result v0

    return v0
.end method

.method public V()Ljava/lang/String;
    .locals 2

    invoke-direct {p0}, Linet/ipaddr/ipv6/b;->O1()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/ipv6/b;->q:Linet/ipaddr/ipv6/Q$f;

    iget-object v0, v0, Linet/ipaddr/j$b;->b:Ljava/lang/String;

    if-nez v0, :cond_2

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->Q1()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Linet/ipaddr/ipv6/b;->q:Linet/ipaddr/ipv6/Q$f;

    sget-object v1, Linet/ipaddr/ipv6/Q$f;->r:Linet/ipaddr/ipv6/Q$g;

    invoke-virtual {p0, v1}, Linet/ipaddr/ipv6/b;->d2(Linet/ipaddr/ipv6/Q$g;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Linet/ipaddr/j$b;->b:Ljava/lang/String;

    move-object v0, v1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/Q;->V()Ljava/lang/String;

    move-result-object v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public V1(Linet/ipaddr/g;)Linet/ipaddr/ipv6/b;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Linet/ipaddr/ipv6/b;->W1(Linet/ipaddr/g;Z)Linet/ipaddr/ipv6/b;

    move-result-object p1

    return-object p1
.end method

.method public W1(Linet/ipaddr/g;Z)Linet/ipaddr/ipv6/b;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/b;->z1(Linet/ipaddr/g;)Linet/ipaddr/ipv6/b;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Linet/ipaddr/ipv6/Q;->r4(Linet/ipaddr/ipv6/Q;Z)Linet/ipaddr/ipv6/Q;

    move-result-object p1

    invoke-direct {p0, p1}, Linet/ipaddr/ipv6/b;->x1(Linet/ipaddr/ipv6/Q;)Linet/ipaddr/ipv6/b;

    move-result-object p1

    return-object p1
.end method

.method public X1(Z)Linet/ipaddr/ipv6/b;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-virtual {v0, p1}, Linet/ipaddr/ipv6/Q;->s4(Z)Linet/ipaddr/ipv6/Q;

    move-result-object p1

    invoke-direct {p0, p1}, Linet/ipaddr/ipv6/b;->x1(Linet/ipaddr/ipv6/Q;)Linet/ipaddr/ipv6/b;

    move-result-object p1

    return-object p1
.end method

.method public Y()Ljava/lang/String;
    .locals 2

    invoke-direct {p0}, Linet/ipaddr/ipv6/b;->O1()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/ipv6/b;->q:Linet/ipaddr/ipv6/Q$f;

    iget-object v0, v0, Lbg/d$h;->a:Ljava/lang/String;

    if-nez v0, :cond_2

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->Q1()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Linet/ipaddr/ipv6/b;->q:Linet/ipaddr/ipv6/Q$f;

    sget-object v1, Linet/ipaddr/ipv6/Q$f;->o:Linet/ipaddr/ipv6/Q$g;

    invoke-virtual {p0, v1}, Linet/ipaddr/ipv6/b;->d2(Linet/ipaddr/ipv6/Q$g;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lbg/d$h;->a:Ljava/lang/String;

    move-object v0, v1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/Q;->Y()Ljava/lang/String;

    move-result-object v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public bridge synthetic Y0()Linet/ipaddr/g;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->F1()Linet/ipaddr/ipv6/b;

    move-result-object v0

    return-object v0
.end method

.method public Y1()Linet/ipaddr/ipv6/b;
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->Q1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->B1()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v1

    invoke-virtual {v0, v1}, Linet/ipaddr/ipv6/e$a;->N0(Linet/ipaddr/ipv6/Q;)Linet/ipaddr/ipv6/b;

    move-result-object v0

    return-object v0

    :cond_0
    return-object p0
.end method

.method public Z()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public Z1(Linet/ipaddr/g;)Linet/ipaddr/ipv6/i0;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/b;->f2(Linet/ipaddr/g;)Linet/ipaddr/ipv6/i0;

    move-result-object p1

    return-object p1
.end method

.method public a0()Ljava/lang/String;
    .locals 2

    invoke-direct {p0}, Linet/ipaddr/ipv6/b;->O1()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/ipv6/b;->q:Linet/ipaddr/ipv6/Q$f;

    iget-object v0, v0, Linet/ipaddr/ipv6/Q$f;->j:Ljava/lang/String;

    if-nez v0, :cond_2

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->Q1()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Linet/ipaddr/ipv6/b;->q:Linet/ipaddr/ipv6/Q$f;

    sget-object v1, Linet/ipaddr/ipv6/Q$f;->n:Linet/ipaddr/ipv6/Q$g;

    invoke-virtual {p0, v1}, Linet/ipaddr/ipv6/b;->d2(Linet/ipaddr/ipv6/Q$g;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Linet/ipaddr/ipv6/Q$f;->j:Ljava/lang/String;

    move-object v0, v1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/Q;->a0()Ljava/lang/String;

    move-result-object v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public a2()Ldg/b;
    .locals 3

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->A1()Linet/ipaddr/ipv6/e$a;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Linet/ipaddr/ipv6/Q;->w4(Linet/ipaddr/ipv6/b;Linet/ipaddr/ipv6/e$a;Z)Ldg/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b1()Linet/ipaddr/j;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    return-object v0
.end method

.method public b2()Ljava/net/Inet6Address;
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->Q1()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->P1()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/ipv6/b;->r:Linet/ipaddr/ipv6/Q$e;

    iget-object v0, v0, Linet/ipaddr/ipv6/Q$e;->e:Ljava/net/Inet6Address;

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Linet/ipaddr/ipv6/b;->r:Linet/ipaddr/ipv6/Q$e;

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->c2()Ljava/net/Inet6Address;

    move-result-object v1

    iput-object v1, v0, Linet/ipaddr/ipv6/Q$e;->e:Ljava/net/Inet6Address;

    move-object v0, v1

    :cond_1
    return-object v0

    :cond_2
    invoke-super {p0}, Linet/ipaddr/g;->p1()Ljava/net/InetAddress;

    move-result-object v0

    check-cast v0, Ljava/net/Inet6Address;

    return-object v0
.end method

.method protected c2()Ljava/net/Inet6Address;
    .locals 4

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/Q;->q0()[B

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->Q1()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Linet/ipaddr/ipv6/b;->p:Linet/ipaddr/ipv6/b$c;

    invoke-virtual {v2}, Linet/ipaddr/ipv6/b$c;->h()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Linet/ipaddr/ipv6/b;->p:Linet/ipaddr/ipv6/b$c;

    invoke-virtual {v2}, Linet/ipaddr/ipv6/b$c;->d()I

    move-result v2

    invoke-static {v1, v0, v2}, Ljava/net/Inet6Address;->getByAddress(Ljava/lang/String;[BI)Ljava/net/Inet6Address;

    move-result-object v0

    :goto_0
    move-object v1, v0

    goto :goto_2

    :cond_0
    iget-object v2, p0, Linet/ipaddr/ipv6/b;->p:Linet/ipaddr/ipv6/b$c;

    invoke-virtual {v2}, Linet/ipaddr/ipv6/b$c;->g()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Linet/ipaddr/ipv6/b;->p:Linet/ipaddr/ipv6/b$c;

    invoke-virtual {v2}, Linet/ipaddr/ipv6/b$c;->c()Ljava/net/NetworkInterface;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Linet/ipaddr/ipv6/b;->p:Linet/ipaddr/ipv6/b$c;

    invoke-virtual {v2}, Linet/ipaddr/ipv6/b$c;->c()Ljava/net/NetworkInterface;

    move-result-object v2

    invoke-static {v1, v0, v2}, Ljava/net/Inet6Address;->getByAddress(Ljava/lang/String;[BLjava/net/NetworkInterface;)Ljava/net/Inet6Address;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->F1()Linet/ipaddr/ipv6/b;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/ipv6/b;->h2()Linet/ipaddr/ipv6/b;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/ipv6/b;->a0()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v2

    instance-of v3, v2, Ljava/net/Inet6Address;

    if-eqz v3, :cond_2

    check-cast v2, Ljava/net/Inet6Address;

    goto :goto_1

    :cond_2
    invoke-static {v1, v0, v1}, Ljava/net/Inet6Address;->getByAddress(Ljava/lang/String;[BLjava/net/NetworkInterface;)Ljava/net/Inet6Address;

    move-result-object v2

    :goto_1
    move-object v1, v2

    goto :goto_2

    :cond_3
    invoke-static {v1, v0, v1}, Ljava/net/Inet6Address;->getByAddress(Ljava/lang/String;[BLjava/net/NetworkInterface;)Ljava/net/Inet6Address;

    move-result-object v0
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :goto_2
    return-object v1
.end method

.method public d2(Linet/ipaddr/ipv6/Q$g;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-direct {p0}, Linet/ipaddr/ipv6/b;->N1()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Linet/ipaddr/ipv6/Q;->A4(Linet/ipaddr/ipv6/Q$g;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e()Linet/ipaddr/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->H1()Linet/ipaddr/ipv6/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Linet/ipaddr/i;
    .locals 1

    .line 2
    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->H1()Linet/ipaddr/ipv6/e;

    move-result-object v0

    return-object v0
.end method

.method public e2()Linet/ipaddr/ipv6/i0;
    .locals 4

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->Y1()Linet/ipaddr/ipv6/b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/b;->h2()Linet/ipaddr/ipv6/b;

    move-result-object v0

    new-instance v1, Linet/ipaddr/ipv6/i0;

    invoke-virtual {v0}, Linet/ipaddr/ipv6/b;->F1()Linet/ipaddr/ipv6/b;

    move-result-object v2

    invoke-virtual {v0}, Linet/ipaddr/ipv6/b;->K1()Linet/ipaddr/ipv6/b;

    move-result-object v0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v0, v3}, Linet/ipaddr/ipv6/i0;-><init>(Linet/ipaddr/ipv6/b;Linet/ipaddr/ipv6/b;Z)V

    return-object v1
.end method

.method public f()I
    .locals 1

    const/16 v0, 0x80

    return v0
.end method

.method public f1()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public f2(Linet/ipaddr/g;)Linet/ipaddr/ipv6/i0;
    .locals 1

    new-instance v0, Linet/ipaddr/ipv6/i0;

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/b;->z1(Linet/ipaddr/g;)Linet/ipaddr/ipv6/b;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Linet/ipaddr/ipv6/i0;-><init>(Linet/ipaddr/ipv6/b;Linet/ipaddr/ipv6/b;)V

    return-object v0
.end method

.method public g1()Z
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Linet/ipaddr/ipv6/b;->J1(I)Linet/ipaddr/ipv6/V;

    move-result-object v1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->S1()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x2

    const/16 v3, 0xf

    invoke-virtual {v1, v2, v3}, Linet/ipaddr/k;->O2(II)Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    const/16 v2, 0xa

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const v3, 0xfe80

    invoke-virtual {v1, v3, v2}, Linet/ipaddr/k;->P2(ILjava/lang/Integer;)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method protected g2(Z)Linet/ipaddr/ipv6/b;
    .locals 3

    invoke-virtual {p0}, Linet/ipaddr/a;->i()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->H1()Linet/ipaddr/ipv6/e;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/ipv6/e;->d()Linet/ipaddr/c$b;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/c$b;->allPrefixedAddressesAreSubnets()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Linet/ipaddr/i;->s(IZ)Linet/ipaddr/g;

    move-result-object p1

    check-cast p1, Linet/ipaddr/ipv6/b;

    invoke-virtual {v0}, Linet/ipaddr/c$b;->zeroHostsAreSubnets()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Linet/ipaddr/ipv6/b;->F1()Linet/ipaddr/ipv6/b;

    move-result-object p1

    :cond_0
    return-object p1

    :cond_1
    invoke-virtual {p0}, Linet/ipaddr/g;->d1()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Linet/ipaddr/g;->h1()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->F1()Linet/ipaddr/ipv6/b;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-virtual {v0, p1}, Linet/ipaddr/ipv6/Q;->p3(Z)Linet/ipaddr/ipv6/Q;

    move-result-object p1

    invoke-direct {p0, p1}, Linet/ipaddr/ipv6/b;->x1(Linet/ipaddr/ipv6/Q;)Linet/ipaddr/ipv6/b;

    move-result-object p1

    return-object p1
.end method

.method public h2()Linet/ipaddr/ipv6/b;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Linet/ipaddr/ipv6/b;->X1(Z)Linet/ipaddr/ipv6/b;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-super {p0}, Linet/ipaddr/a;->hashCode()I

    move-result v0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->Q1()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Linet/ipaddr/ipv6/b;->p:Linet/ipaddr/ipv6/b$c;

    invoke-virtual {v1}, Linet/ipaddr/ipv6/b$c;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    mul-int/2addr v0, v1

    :cond_0
    return v0
.end method

.method public bridge synthetic i1(Linet/ipaddr/g;)Linet/ipaddr/g;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/b;->V1(Linet/ipaddr/g;)Linet/ipaddr/ipv6/b;

    move-result-object p1

    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 3

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->A1()Linet/ipaddr/ipv6/e$a;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Linet/ipaddr/ipv6/Q;->M3(Linet/ipaddr/ipv6/b;Lbg/a;Ljava/util/function/Predicate;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic j1(Linet/ipaddr/g;)Linet/ipaddr/m;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/b;->Z1(Linet/ipaddr/g;)Linet/ipaddr/ipv6/i0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(I)Lag/f;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/b;->C1(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(I)Lag/l;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/b;->C1(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(I)Lcg/c;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/b;->C1(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method public n1()Linet/ipaddr/ipv4/b;
    .locals 1

    sget-object v0, Linet/ipaddr/g;->o:Linet/ipaddr/h;

    invoke-interface {v0, p0}, Linet/ipaddr/ipv4/b$a;->a(Linet/ipaddr/g;)Linet/ipaddr/ipv4/b;

    move-result-object v0

    return-object v0
.end method

.method public o1()Linet/ipaddr/ipv6/b;
    .locals 0

    return-object p0
.end method

.method public bridge synthetic p1()Ljava/net/InetAddress;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->b2()Ljava/net/Inet6Address;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic q(I)Linet/ipaddr/k;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/b;->J1(I)Linet/ipaddr/ipv6/V;

    move-result-object p1

    return-object p1
.end method

.method protected q0()Linet/ipaddr/o;
    .locals 2

    new-instance v0, Linet/ipaddr/o$a;

    invoke-direct {v0}, Linet/ipaddr/o$a;-><init>()V

    invoke-virtual {v0}, Linet/ipaddr/o$a;->t()Linet/ipaddr/ipv4/Z$a;

    move-result-object v0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->E1()Linet/ipaddr/ipv4/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Linet/ipaddr/ipv4/Z$a;->q(Linet/ipaddr/ipv4/e;)Linet/ipaddr/ipv4/Z$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv4/Z$a;->f()Linet/ipaddr/o$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/o$a;->u()Linet/ipaddr/ipv6/j0$a;

    move-result-object v0

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->H1()Linet/ipaddr/ipv6/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Linet/ipaddr/ipv6/j0$a;->v(Linet/ipaddr/ipv6/e;)Linet/ipaddr/ipv6/j0$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/j0$a;->f()Linet/ipaddr/o$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/o$a;->v()Linet/ipaddr/o;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic q1()Ljava/net/InetAddress;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->c2()Ljava/net/Inet6Address;

    move-result-object v0

    return-object v0
.end method

.method public r0()Ljava/lang/String;
    .locals 2

    invoke-direct {p0}, Linet/ipaddr/ipv6/b;->O1()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/ipv6/b;->q:Linet/ipaddr/ipv6/Q$f;

    iget-object v0, v0, Linet/ipaddr/j$b;->c:Ljava/lang/String;

    if-nez v0, :cond_2

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->Q1()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Linet/ipaddr/ipv6/b;->q:Linet/ipaddr/ipv6/Q$f;

    sget-object v1, Linet/ipaddr/ipv6/Q$f;->m:Linet/ipaddr/ipv6/Q$g;

    invoke-virtual {p0, v1}, Linet/ipaddr/ipv6/b;->d2(Linet/ipaddr/ipv6/Q$g;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Linet/ipaddr/j$b;->c:Ljava/lang/String;

    move-object v0, v1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/Q;->r0()Ljava/lang/String;

    move-result-object v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public bridge synthetic r1()Linet/ipaddr/m;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->e2()Linet/ipaddr/ipv6/i0;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic s1(Z)Linet/ipaddr/g;
    .locals 0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/b;->g2(Z)Linet/ipaddr/ipv6/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->a2()Ldg/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic t1()Linet/ipaddr/g;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->h2()Linet/ipaddr/ipv6/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic v()LZf/c;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    return-object v0
.end method

.method public v0()I
    .locals 1

    const/16 v0, 0x10

    return v0
.end method

.method w1(Linet/ipaddr/ipv6/b;Linet/ipaddr/ipv6/b;)V
    .locals 3

    if-nez p1, :cond_0

    if-eqz p2, :cond_8

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/ipv6/Q;->G3()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    if-nez v0, :cond_8

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Linet/ipaddr/ipv6/b;->I1()Linet/ipaddr/ipv6/Q;

    move-result-object v1

    :cond_2
    invoke-virtual {v0, v2, v1}, Linet/ipaddr/ipv6/Q;->m3(Linet/ipaddr/ipv6/Q;Linet/ipaddr/ipv6/Q;)V

    iget-object v0, p0, Linet/ipaddr/ipv6/b;->r:Linet/ipaddr/ipv6/Q$e;

    if-eqz v0, :cond_4

    if-eqz p1, :cond_3

    iget-object v1, v0, Lbg/d$g;->a:LZf/e;

    if-eqz v1, :cond_4

    :cond_3
    if-eqz p2, :cond_8

    iget-object v0, v0, Lbg/d$g;->c:LZf/e;

    if-nez v0, :cond_8

    :cond_4
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Linet/ipaddr/ipv6/b;->r:Linet/ipaddr/ipv6/Q$e;

    if-nez v0, :cond_5

    new-instance v0, Linet/ipaddr/ipv6/Q$e;

    invoke-direct {v0}, Linet/ipaddr/ipv6/Q$e;-><init>()V

    iput-object v0, p0, Linet/ipaddr/ipv6/b;->r:Linet/ipaddr/ipv6/Q$e;

    iput-object p1, v0, Lbg/d$g;->a:LZf/e;

    iput-object p2, v0, Lbg/d$g;->c:LZf/e;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_5
    iget-object v1, v0, Lbg/d$g;->a:LZf/e;

    if-nez v1, :cond_6

    iput-object p1, v0, Lbg/d$g;->a:LZf/e;

    :cond_6
    iget-object p1, v0, Lbg/d$g;->c:LZf/e;

    if-nez p1, :cond_7

    iput-object p2, v0, Lbg/d$g;->c:LZf/e;

    :cond_7
    :goto_1
    monitor-exit p0

    goto :goto_3

    :goto_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_8
    :goto_3
    return-void
.end method

.method protected z1(Linet/ipaddr/g;)Linet/ipaddr/ipv6/b;
    .locals 1

    invoke-virtual {p1}, Linet/ipaddr/g;->o1()Linet/ipaddr/ipv6/b;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Linet/ipaddr/AddressConversionException;

    invoke-direct {v0, p0, p1}, Linet/ipaddr/AddressConversionException;-><init>(Lag/g;Lag/g;)V

    throw v0
.end method
