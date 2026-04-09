.class public abstract Linet/ipaddr/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZf/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/a$a;
    }
.end annotation


# static fields
.field public static final c:Ljava/lang/String;

.field public static final d:Ljava/lang/String;

.field public static final e:Ljava/lang/String;

.field public static final f:Ljava/lang/String;

.field public static final g:Ljava/lang/String;

.field public static final h:Linet/ipaddr/b;

.field public static final i:Linet/ipaddr/b;

.field public static final j:Linet/ipaddr/b;

.field private static k:Linet/ipaddr/ipv6/e;

.field private static l:Linet/ipaddr/ipv4/e;


# instance fields
.field final a:LZf/c;

.field protected b:LZf/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x2d

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Linet/ipaddr/a;->c:Ljava/lang/String;

    const/16 v0, 0xbb

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Linet/ipaddr/a;->d:Ljava/lang/String;

    const/16 v0, 0x2a

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Linet/ipaddr/a;->e:Ljava/lang/String;

    const/16 v0, 0x25

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Linet/ipaddr/a;->f:Ljava/lang/String;

    const/16 v0, 0x5f

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Linet/ipaddr/a;->g:Ljava/lang/String;

    new-instance v0, Linet/ipaddr/b$a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Linet/ipaddr/b$a;-><init>(Z)V

    sput-object v0, Linet/ipaddr/a;->h:Linet/ipaddr/b;

    new-instance v0, Linet/ipaddr/b$b;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Linet/ipaddr/b$b;-><init>(ZZ)V

    sput-object v0, Linet/ipaddr/a;->i:Linet/ipaddr/b;

    new-instance v0, Linet/ipaddr/b$b;

    invoke-direct {v0, v1, v1}, Linet/ipaddr/b$b;-><init>(ZZ)V

    sput-object v0, Linet/ipaddr/a;->j:Linet/ipaddr/b;

    return-void
.end method

.method protected constructor <init>(LZf/c;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Linet/ipaddr/a;->a:LZf/c;

    .line 3
    invoke-interface {p0}, LZf/b;->e()Linet/ipaddr/c;

    move-result-object v0

    invoke-interface {p1}, LZf/b;->e()Linet/ipaddr/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Linet/ipaddr/c;->g(Linet/ipaddr/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 4
    :cond_0
    new-instance v0, Linet/ipaddr/NetworkMismatchException;

    invoke-direct {v0, p1}, Linet/ipaddr/NetworkMismatchException;-><init>(Lag/g;)V

    throw v0
.end method

.method protected constructor <init>(Ljava/util/function/Function;)V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-interface {p1, p0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LZf/c;

    iput-object p1, p0, Linet/ipaddr/a;->a:LZf/c;

    .line 7
    invoke-interface {p0}, LZf/b;->e()Linet/ipaddr/c;

    move-result-object v0

    invoke-interface {p1}, LZf/b;->e()Linet/ipaddr/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Linet/ipaddr/c;->g(Linet/ipaddr/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 8
    :cond_0
    new-instance v0, Linet/ipaddr/NetworkMismatchException;

    invoke-direct {v0, p1}, Linet/ipaddr/NetworkMismatchException;-><init>(Lag/g;)V

    throw v0
.end method

.method public static j()Linet/ipaddr/ipv4/e;
    .locals 2

    sget-object v0, Linet/ipaddr/a;->l:Linet/ipaddr/ipv4/e;

    if-nez v0, :cond_1

    const-class v0, Linet/ipaddr/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Linet/ipaddr/a;->l:Linet/ipaddr/ipv4/e;

    if-nez v1, :cond_0

    new-instance v1, Linet/ipaddr/ipv4/e;

    invoke-direct {v1}, Linet/ipaddr/ipv4/e;-><init>()V

    sput-object v1, Linet/ipaddr/a;->l:Linet/ipaddr/ipv4/e;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_2
    sget-object v0, Linet/ipaddr/a;->l:Linet/ipaddr/ipv4/e;

    return-object v0
.end method

.method public static s()Linet/ipaddr/ipv6/e;
    .locals 2

    sget-object v0, Linet/ipaddr/a;->k:Linet/ipaddr/ipv6/e;

    if-nez v0, :cond_1

    const-class v0, Linet/ipaddr/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Linet/ipaddr/a;->k:Linet/ipaddr/ipv6/e;

    if-nez v1, :cond_0

    new-instance v1, Linet/ipaddr/ipv6/e;

    invoke-direct {v1}, Linet/ipaddr/ipv6/e;-><init>()V

    sput-object v1, Linet/ipaddr/a;->k:Linet/ipaddr/ipv6/e;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_2
    sget-object v0, Linet/ipaddr/a;->k:Linet/ipaddr/ipv6/e;

    return-object v0
.end method


# virtual methods
.method public A()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object v0

    invoke-interface {v0}, Lag/e;->A()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public A0()Z
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object v0

    invoke-interface {v0}, Lag/g;->A0()Z

    move-result v0

    return v0
.end method

.method public C(Linet/ipaddr/a;)Z
    .locals 1

    if-eq p1, p0, :cond_1

    invoke-virtual {p0}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object v0

    invoke-virtual {p1}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public H()I
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object v0

    invoke-interface {v0}, Lcg/b;->H()I

    move-result v0

    return v0
.end method

.method public H0()Z
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object v0

    invoke-interface {v0}, Lag/g;->H0()Z

    move-result v0

    return v0
.end method

.method public L()Z
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object v0

    invoke-interface {v0}, Lag/g;->L()Z

    move-result v0

    return v0
.end method

.method public O()Z
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object v0

    invoke-interface {v0}, Lag/g;->O()Z

    move-result v0

    return v0
.end method

.method public R()Ljava/math/BigInteger;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object v0

    invoke-interface {v0}, Lag/g;->R()Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public Y()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object v0

    invoke-interface {v0}, LZf/e;->Y()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract Z()I
.end method

.method public a0()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object v0

    invoke-interface {v0}, LZf/b;->a0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c0()Z
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object v0

    invoke-interface {v0}, Lag/g;->c0()Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Linet/ipaddr/a;

    if-eqz v1, :cond_2

    check-cast p1, Linet/ipaddr/a;

    iget-object v1, p1, Linet/ipaddr/a;->b:LZf/f;

    invoke-virtual {p0, v1}, Linet/ipaddr/a;->y(LZf/f;)Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0, p1}, Linet/ipaddr/a;->C(Linet/ipaddr/a;)Z

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public abstract f()I
.end method

.method public g(Linet/ipaddr/a;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object v0

    invoke-virtual {p1}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object p1

    invoke-interface {v0, p1}, LZf/c;->x0(LZf/c;)Z

    move-result p1

    return p1
.end method

.method public getCount()Ljava/math/BigInteger;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object v0

    invoke-interface {v0}, Lag/e;->getCount()Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public getValue()Ljava/math/BigInteger;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object v0

    invoke-interface {v0}, Lag/g;->getValue()Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()Z
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object v0

    invoke-interface {v0}, Lag/e;->i()Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/a;->Y()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Z
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object v0

    invoke-interface {v0}, Lag/e;->u()Z

    move-result v0

    return v0
.end method

.method public v()LZf/c;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/a;->a:LZf/c;

    return-object v0
.end method

.method public x()Z
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/a;->v()LZf/c;

    move-result-object v0

    invoke-interface {v0}, Lag/e;->x()Z

    move-result v0

    return v0
.end method

.method protected abstract y(LZf/f;)Z
.end method
