.class public LLg/q;
.super LKg/d;
.source "SourceFile"

# interfaces
.implements LLg/d;
.implements LLg/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLg/q$b;
    }
.end annotation


# static fields
.field private static r:LEj/b;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:I

.field private h:I

.field private i:I

.field private j:[B

.field private k:Ljava/util/Map;

.field private final l:Ljava/util/Set;

.field private final m:Ljava/util/Set;

.field private transient n:Ljava/lang/String;

.field private o:Z

.field private p:Z

.field private final q:LLg/q$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, LLg/q;

    invoke-static {v0}, LEj/c;->i(Ljava/lang/Class;)LEj/b;

    move-result-object v0

    sput-object v0, LLg/q;->r:LEj/b;

    return-void
.end method

.method constructor <init>(LKg/d;)V
    .locals 6

    .line 24
    invoke-direct {p0}, LKg/d;-><init>()V

    .line 25
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, LLg/q;->l:Ljava/util/Set;

    .line 26
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, LLg/q;->m:Ljava/util/Set;

    if-eqz p1, :cond_1

    .line 27
    invoke-virtual {p1}, LKg/d;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LLg/q;->a:Ljava/lang/String;

    .line 28
    invoke-virtual {p1}, LKg/d;->t()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LLg/q;->b:Ljava/lang/String;

    .line 29
    invoke-virtual {p1}, LKg/d;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LLg/q;->c:Ljava/lang/String;

    .line 30
    invoke-virtual {p1}, LKg/d;->n()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LLg/q;->d:Ljava/lang/String;

    .line 31
    invoke-virtual {p1}, LKg/d;->x()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LLg/q;->e:Ljava/lang/String;

    .line 32
    invoke-virtual {p1}, LKg/d;->o()I

    move-result v0

    iput v0, p0, LLg/q;->g:I

    .line 33
    invoke-virtual {p1}, LKg/d;->B()I

    move-result v0

    iput v0, p0, LLg/q;->h:I

    .line 34
    invoke-virtual {p1}, LKg/d;->p()I

    move-result v0

    iput v0, p0, LLg/q;->i:I

    .line 35
    invoke-virtual {p1}, LKg/d;->z()[B

    move-result-object v0

    iput-object v0, p0, LLg/q;->j:[B

    .line 36
    invoke-virtual {p1}, LKg/d;->F()Z

    move-result v0

    iput-boolean v0, p0, LLg/q;->o:Z

    .line 37
    invoke-virtual {p1}, LKg/d;->k()[Ljava/net/Inet6Address;

    move-result-object v0

    .line 38
    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    .line 39
    iget-object v5, p0, LLg/q;->m:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p1}, LKg/d;->i()[Ljava/net/Inet4Address;

    move-result-object p1

    .line 41
    array-length v0, p1

    :goto_1
    if-ge v2, v0, :cond_1

    aget-object v1, p1, v2

    .line 42
    iget-object v3, p0, LLg/q;->l:Ljava/util/Set;

    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 43
    :cond_1
    new-instance p1, LLg/q$b;

    invoke-direct {p1, p0}, LLg/q$b;-><init>(LLg/q;)V

    iput-object p1, p0, LLg/q;->q:LLg/q$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIZLjava/util/Map;)V
    .locals 7

    .line 1
    invoke-static {p1, p2, p3}, LLg/r;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-static {p8}, LPg/a;->e(Ljava/util/Map;)[B

    move-result-object v6

    move-object v0, p0

    move v2, p4

    move v3, p5

    move v4, p6

    move v5, p7

    invoke-direct/range {v0 .. v6}, LLg/q;-><init>(Ljava/util/Map;IIIZ[B)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIZ[B)V
    .locals 7

    .line 2
    invoke-static {p1, p2, p3}, LLg/r;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    move-object v0, p0

    move v2, p4

    move v3, p5

    move v4, p6

    move v5, p7

    move-object v6, p8

    invoke-direct/range {v0 .. v6}, LLg/q;-><init>(Ljava/util/Map;IIIZ[B)V

    return-void
.end method

.method constructor <init>(Ljava/util/Map;IIIZLjava/lang/String;)V
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    .line 4
    invoke-direct/range {v0 .. v6}, LLg/q;-><init>(Ljava/util/Map;IIIZ[B)V

    .line 5
    :try_start_0
    invoke-static {p6}, LPg/a;->a(Ljava/lang/String;)[B

    move-result-object p1

    iput-object p1, p0, LLg/q;->j:[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    iput-object p6, p0, LLg/q;->f:Ljava/lang/String;

    return-void

    :catch_0
    move-exception p1

    .line 7
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Unexpected exception: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public constructor <init>(Ljava/util/Map;IIIZLjava/util/Map;)V
    .locals 7

    .line 3
    invoke-static {p6}, LPg/a;->e(Ljava/util/Map;)[B

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, LLg/q;-><init>(Ljava/util/Map;IIIZ[B)V

    return-void
.end method

.method constructor <init>(Ljava/util/Map;IIIZ[B)V
    .locals 1

    .line 8
    invoke-direct {p0}, LKg/d;-><init>()V

    .line 9
    invoke-static {p1}, LLg/q;->N(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    .line 10
    sget-object v0, LKg/d$a;->Domain:LKg/d$a;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, LLg/q;->a:Ljava/lang/String;

    .line 11
    sget-object v0, LKg/d$a;->Protocol:LKg/d$a;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, LLg/q;->b:Ljava/lang/String;

    .line 12
    sget-object v0, LKg/d$a;->Application:LKg/d$a;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, LLg/q;->c:Ljava/lang/String;

    .line 13
    sget-object v0, LKg/d$a;->Instance:LKg/d$a;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, LLg/q;->d:Ljava/lang/String;

    .line 14
    sget-object v0, LKg/d$a;->Subtype:LKg/d$a;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, LLg/q;->e:Ljava/lang/String;

    .line 15
    iput p2, p0, LLg/q;->g:I

    .line 16
    iput p3, p0, LLg/q;->h:I

    .line 17
    iput p4, p0, LLg/q;->i:I

    .line 18
    iput-object p6, p0, LLg/q;->j:[B

    const/4 p1, 0x0

    .line 19
    invoke-virtual {p0, p1}, LLg/q;->l0(Z)V

    .line 20
    new-instance p1, LLg/q$b;

    invoke-direct {p1, p0}, LLg/q$b;-><init>(LLg/q;)V

    iput-object p1, p0, LLg/q;->q:LLg/q$b;

    .line 21
    iput-boolean p5, p0, LLg/q;->o:Z

    .line 22
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, LLg/q;->l:Ljava/util/Set;

    .line 23
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, LLg/q;->m:Ljava/util/Set;

    return-void
.end method

.method protected static N(Ljava/util/Map;)Ljava/util/Map;
    .locals 5

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, LKg/d$a;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sget-object v1, LKg/d$a;->Domain:LKg/d$a;

    invoke-interface {p0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "local"

    if-eqz v2, :cond_0

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    move-object v3, v2

    :cond_2
    :goto_1
    invoke-static {v3}, LLg/q;->h0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, LKg/d$a;->Protocol:LKg/d$a;

    invoke-interface {p0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "tcp"

    if-eqz v2, :cond_3

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_2

    :cond_3
    move-object v2, v3

    :goto_2
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_4

    goto :goto_3

    :cond_4
    move-object v3, v2

    :cond_5
    :goto_3
    invoke-static {v3}, LLg/q;->h0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, LKg/d$a;->Application:LKg/d$a;

    invoke-interface {p0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    const-string v3, ""

    if-eqz v2, :cond_6

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_4

    :cond_6
    move-object v2, v3

    :goto_4
    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_8

    :cond_7
    move-object v2, v3

    :cond_8
    invoke-static {v2}, LLg/q;->h0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, LKg/d$a;->Instance:LKg/d$a;

    invoke-interface {p0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_5

    :cond_9
    move-object v2, v3

    :goto_5
    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_b

    :cond_a
    move-object v2, v3

    :cond_b
    invoke-static {v2}, LLg/q;->h0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, LKg/d$a;->Subtype:LKg/d$a;

    invoke-interface {p0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    goto :goto_6

    :cond_c
    move-object p0, v3

    :goto_6
    if-eqz p0, :cond_e

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_d

    goto :goto_7

    :cond_d
    move-object v3, p0

    :cond_e
    :goto_7
    invoke-static {v3}, LLg/q;->h0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method static P(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    .locals 2

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, LKg/d$a;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sget-object v1, LKg/d$a;->Instance:LKg/d$a;

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LKg/d$a;->Application:LKg/d$a;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LKg/d$a;->Protocol:LKg/d$a;

    invoke-interface {v0, p0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LKg/d$a;->Domain:LKg/d$a;

    invoke-interface {v0, p0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LKg/d$a;->Subtype:LKg/d$a;

    invoke-interface {v0, p0, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private V(LLg/h;)Z
    .locals 3

    sget-object v0, LLg/q$a;->a:[I

    invoke-virtual {p1}, LLg/b;->g()Ljavax/jmdns/impl/constants/e;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    sget-object v0, LLg/q;->r:LEj/b;

    const-string v1, "Unhandled expired record: {}"

    invoke-interface {v0, v1, p1}, LEj/b;->d(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LLg/b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, LLg/q;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, LLg/h$a;

    sget-object v2, Ljavax/jmdns/impl/constants/e;->TYPE_A:Ljavax/jmdns/impl/constants/e;

    invoke-virtual {p1}, LLg/b;->g()Ljavax/jmdns/impl/constants/e;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0}, LLg/h$a;->W()Ljava/net/InetAddress;

    move-result-object p1

    check-cast p1, Ljava/net/Inet4Address;

    iget-object v0, p0, LLg/q;->l:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, LLg/q;->r:LEj/b;

    const-string v2, "Removed expired IPv4: {}"

    invoke-interface {v0, v2, p1}, LEj/b;->n(Ljava/lang/String;Ljava/lang/Object;)V

    return v1

    :cond_1
    sget-object v0, LLg/q;->r:LEj/b;

    const-string v1, "Expired IPv4 not in this service: {}"

    invoke-interface {v0, v1, p1}, LEj/b;->n(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, LLg/h$a;->W()Ljava/net/InetAddress;

    move-result-object p1

    check-cast p1, Ljava/net/Inet6Address;

    iget-object v0, p0, LLg/q;->m:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, LLg/q;->r:LEj/b;

    const-string v2, "Removed expired IPv6: {}"

    invoke-interface {v0, v2, p1}, LEj/b;->n(Ljava/lang/String;Ljava/lang/Object;)V

    return v1

    :cond_3
    sget-object v0, LLg/q;->r:LEj/b;

    const-string v1, "Expired IPv6 not in this service: {}"

    invoke-interface {v0, v1, p1}, LEj/b;->n(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method private W(LLg/a;JLLg/h;)Z
    .locals 4

    sget-object v0, LLg/q$a;->a:[I

    invoke-virtual {p4}, LLg/b;->g()Ljavax/jmdns/impl/constants/e;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_7

    const/4 v3, 0x2

    if-eq v0, v3, :cond_6

    const/4 v3, 0x3

    if-eq v0, v3, :cond_2

    const/4 p1, 0x4

    if-eq v0, p1, :cond_1

    const/4 p1, 0x5

    if-eq v0, p1, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual {p0}, LLg/q;->x()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_8

    invoke-virtual {p4}, LLg/b;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {p4}, LLg/b;->h()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LLg/q;->e:Ljava/lang/String;

    goto/16 :goto_5

    :cond_1
    invoke-virtual {p4}, LLg/b;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, LLg/q;->u()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_8

    check-cast p4, LLg/h$g;

    invoke-virtual {p4}, LLg/h$g;->W()[B

    move-result-object p1

    iput-object p1, p0, LLg/q;->j:[B

    const/4 p1, 0x0

    iput-object p1, p0, LLg/q;->k:Ljava/util/Map;

    goto/16 :goto_5

    :cond_2
    invoke-virtual {p4}, LLg/b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, LLg/q;->u()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    check-cast p4, LLg/h$f;

    iget-object v0, p0, LLg/q;->f:Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-virtual {p4}, LLg/h$f;->Y()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_1

    :cond_4
    :goto_0
    move v0, v1

    :goto_1
    invoke-virtual {p4}, LLg/h$f;->Y()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, LLg/q;->f:Ljava/lang/String;

    invoke-virtual {p4}, LLg/h$f;->W()I

    move-result v3

    iput v3, p0, LLg/q;->g:I

    invoke-virtual {p4}, LLg/h$f;->Z()I

    move-result v3

    iput v3, p0, LLg/q;->h:I

    invoke-virtual {p4}, LLg/h$f;->X()I

    move-result p4

    iput p4, p0, LLg/q;->i:I

    if-eqz v0, :cond_9

    iget-object p4, p0, LLg/q;->l:Ljava/util/Set;

    invoke-interface {p4}, Ljava/util/Set;->clear()V

    iget-object p4, p0, LLg/q;->m:Ljava/util/Set;

    invoke-interface {p4}, Ljava/util/Set;->clear()V

    iget-object p4, p0, LLg/q;->f:Ljava/lang/String;

    sget-object v0, Ljavax/jmdns/impl/constants/e;->TYPE_A:Ljavax/jmdns/impl/constants/e;

    sget-object v1, Ljavax/jmdns/impl/constants/d;->CLASS_IN:Ljavax/jmdns/impl/constants/d;

    invoke-virtual {p1, p4, v0, v1}, LLg/a;->p(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;)Ljava/util/Collection;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_2
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLg/b;

    invoke-virtual {p0, p1, p2, p3, v0}, LLg/q;->b(LLg/a;JLLg/b;)V

    goto :goto_2

    :cond_5
    iget-object p4, p0, LLg/q;->f:Ljava/lang/String;

    sget-object v0, Ljavax/jmdns/impl/constants/e;->TYPE_AAAA:Ljavax/jmdns/impl/constants/e;

    sget-object v1, Ljavax/jmdns/impl/constants/d;->CLASS_IN:Ljavax/jmdns/impl/constants/d;

    invoke-virtual {p1, p4, v0, v1}, LLg/a;->p(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;)Ljava/util/Collection;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_3
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLg/b;

    invoke-virtual {p0, p1, p2, p3, v0}, LLg/q;->b(LLg/a;JLLg/b;)V

    goto :goto_3

    :cond_6
    invoke-virtual {p4}, LLg/b;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, LLg/q;->w()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_8

    check-cast p4, LLg/h$a;

    invoke-virtual {p4}, LLg/h$a;->W()Ljava/net/InetAddress;

    move-result-object p1

    instance-of p1, p1, Ljava/net/Inet6Address;

    if-eqz p1, :cond_8

    invoke-virtual {p4}, LLg/h$a;->W()Ljava/net/InetAddress;

    move-result-object p1

    check-cast p1, Ljava/net/Inet6Address;

    iget-object p2, p0, LLg/q;->m:Ljava/util/Set;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_5

    :cond_7
    invoke-virtual {p4}, LLg/b;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, LLg/q;->w()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_8

    check-cast p4, LLg/h$a;

    invoke-virtual {p4}, LLg/h$a;->W()Ljava/net/InetAddress;

    move-result-object p1

    instance-of p1, p1, Ljava/net/Inet4Address;

    if-eqz p1, :cond_8

    invoke-virtual {p4}, LLg/h$a;->W()Ljava/net/InetAddress;

    move-result-object p1

    check-cast p1, Ljava/net/Inet4Address;

    iget-object p2, p0, LLg/q;->l:Ljava/util/Set;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_5

    :cond_8
    :goto_4
    move v1, v2

    :cond_9
    :goto_5
    return v1
.end method

.method private final X()Z
    .locals 1

    iget-object v0, p0, LLg/q;->l:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-gtz v0, :cond_1

    iget-object v0, p0, LLg/q;->m:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method static h0(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    const-string v0, "."

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :cond_1
    const-string v1, "_"

    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :cond_2
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v2

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_3
    return-object p0
.end method


# virtual methods
.method public A()Ljava/lang/String;
    .locals 8

    invoke-virtual {p0}, LLg/q;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, LLg/q;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, LLg/q;->e()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    const-string v5, ""

    const-string v6, "_"

    const-string v7, "."

    if-lez v4, :cond_0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v5

    :goto_0
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :cond_1
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public B()I
    .locals 1

    iget v0, p0, LLg/q;->h:I

    return v0
.end method

.method public declared-synchronized D()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, LLg/q;->Y()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LLg/q;->X()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLg/q;->z()[B

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLg/q;->z()[B

    move-result-object v0

    array-length v0, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public E(LKg/d;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LLg/q;

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    check-cast p1, LLg/q;

    iget-object v1, p0, LLg/q;->l:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    iget-object v3, p1, LLg/q;->l:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, LLg/q;->m:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    iget-object v3, p1, LLg/q;->m:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, LLg/q;->l:Ljava/util/Set;

    iget-object v3, p1, LLg/q;->l:Ljava/util/Set;

    invoke-interface {v1, v3}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LLg/q;->m:Ljava/util/Set;

    iget-object p1, p1, LLg/q;->m:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    move v0, v2

    :cond_1
    return v0

    :cond_2
    invoke-virtual {p0}, LLg/q;->l()[Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {p1}, LKg/d;->l()[Ljava/net/InetAddress;

    move-result-object p1

    array-length v3, v1

    array-length v4, p1

    if-ne v3, v4, :cond_3

    new-instance v3, Ljava/util/HashSet;

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    new-instance v1, Ljava/util/HashSet;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    move v0, v2

    :cond_3
    return v0
.end method

.method public F()Z
    .locals 1

    iget-boolean v0, p0, LLg/q;->o:Z

    return v0
.end method

.method G([B)V
    .locals 0

    iput-object p1, p0, LLg/q;->j:[B

    const/4 p1, 0x0

    iput-object p1, p0, LLg/q;->k:Ljava/util/Map;

    return-void
.end method

.method H(Ljava/net/Inet4Address;)V
    .locals 1

    iget-object v0, p0, LLg/q;->l:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method I(Ljava/net/Inet6Address;)V
    .locals 1

    iget-object v0, p0, LLg/q;->m:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public K(Ljavax/jmdns/impl/constants/d;ZILLg/k;)Ljava/util/Collection;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    sget-object v3, Ljavax/jmdns/impl/constants/d;->CLASS_ANY:Ljavax/jmdns/impl/constants/d;

    if-eq v1, v3, :cond_0

    sget-object v3, Ljavax/jmdns/impl/constants/d;->CLASS_IN:Ljavax/jmdns/impl/constants/d;

    if-ne v1, v3, :cond_2

    :cond_0
    invoke-virtual/range {p0 .. p0}, LLg/q;->x()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    new-instance v1, LLg/h$e;

    invoke-virtual/range {p0 .. p0}, LLg/q;->U()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljavax/jmdns/impl/constants/d;->CLASS_IN:Ljavax/jmdns/impl/constants/d;

    const/4 v6, 0x0

    invoke-virtual/range {p0 .. p0}, LLg/q;->u()Ljava/lang/String;

    move-result-object v8

    move-object v3, v1

    move/from16 v7, p3

    invoke-direct/range {v3 .. v8}, LLg/h$e;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/d;ZILjava/lang/String;)V

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    new-instance v1, LLg/h$e;

    invoke-virtual/range {p0 .. p0}, LLg/q;->A()Ljava/lang/String;

    move-result-object v10

    sget-object v5, Ljavax/jmdns/impl/constants/d;->CLASS_IN:Ljavax/jmdns/impl/constants/d;

    const/4 v12, 0x0

    invoke-virtual/range {p0 .. p0}, LLg/q;->u()Ljava/lang/String;

    move-result-object v14

    move-object v9, v1

    move-object v11, v5

    move/from16 v13, p3

    invoke-direct/range {v9 .. v14}, LLg/h$e;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/d;ZILjava/lang/String;)V

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, LLg/h$f;

    invoke-virtual/range {p0 .. p0}, LLg/q;->u()Ljava/lang/String;

    move-result-object v12

    iget v3, v0, LLg/q;->i:I

    iget v4, v0, LLg/q;->h:I

    iget v6, v0, LLg/q;->g:I

    invoke-virtual/range {p4 .. p4}, LLg/k;->p()Ljava/lang/String;

    move-result-object v19

    move-object v11, v1

    move-object v13, v5

    move/from16 v14, p2

    move/from16 v15, p3

    move/from16 v16, v3

    move/from16 v17, v4

    move/from16 v18, v6

    invoke-direct/range {v11 .. v19}, LLg/h$f;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/d;ZIIIILjava/lang/String;)V

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, LLg/h$g;

    invoke-virtual/range {p0 .. p0}, LLg/q;->u()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, LLg/q;->z()[B

    move-result-object v8

    move-object v3, v1

    move/from16 v6, p2

    move/from16 v7, p3

    invoke-direct/range {v3 .. v8}, LLg/h$g;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/d;ZI[B)V

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    return-object v2
.end method

.method public L(LMg/a;Ljavax/jmdns/impl/constants/g;)V
    .locals 1

    iget-object v0, p0, LLg/q;->q:LLg/q$b;

    invoke-virtual {v0, p1, p2}, LLg/i$b;->a(LMg/a;Ljavax/jmdns/impl/constants/g;)V

    return-void
.end method

.method public M()Z
    .locals 1

    iget-object v0, p0, LLg/q;->q:LLg/q$b;

    invoke-virtual {v0}, LLg/i$b;->c()Z

    move-result v0

    return v0
.end method

.method public O()LLg/q;
    .locals 8

    new-instance v7, LLg/q;

    invoke-virtual {p0}, LLg/q;->S()Ljava/util/Map;

    move-result-object v1

    iget v2, p0, LLg/q;->g:I

    iget v3, p0, LLg/q;->h:I

    iget v4, p0, LLg/q;->i:I

    iget-boolean v5, p0, LLg/q;->o:Z

    iget-object v6, p0, LLg/q;->j:[B

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LLg/q;-><init>(Ljava/util/Map;IIIZ[B)V

    iget-object v0, p0, LLg/q;->f:Ljava/lang/String;

    invoke-virtual {v7, v0}, LLg/q;->m0(Ljava/lang/String;)V

    invoke-virtual {p0}, LLg/q;->k()[Ljava/net/Inet6Address;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    iget-object v5, v7, LLg/q;->m:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LLg/q;->i()[Ljava/net/Inet4Address;

    move-result-object v0

    array-length v1, v0

    :goto_1
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget-object v4, v7, LLg/q;->l:Ljava/util/Set;

    invoke-interface {v4, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-object v7
.end method

.method public Q()LLg/l;
    .locals 1

    iget-object v0, p0, LLg/q;->q:LLg/q$b;

    invoke-virtual {v0}, LLg/i$b;->d()LLg/l;

    move-result-object v0

    return-object v0
.end method

.method declared-synchronized R()Ljava/util/Map;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LLg/q;->k:Ljava/util/Map;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LLg/q;->z()[B

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p0}, LLg/q;->z()[B

    move-result-object v1

    invoke-static {v0, v1}, LPg/a;->b(Ljava/util/Map;[B)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v1

    :try_start_2
    sget-object v2, LLg/q;->r:LEj/b;

    const-string v3, "Malformed TXT Field "

    invoke-interface {v2, v3, v1}, LEj/b;->r(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    iput-object v0, p0, LLg/q;->k:Ljava/util/Map;

    :cond_0
    iget-object v0, p0, LLg/q;->k:Ljava/util/Map;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    monitor-exit p0

    return-object v0

    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public S()Ljava/util/Map;
    .locals 3

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, LKg/d$a;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sget-object v1, LKg/d$a;->Domain:LKg/d$a;

    invoke-virtual {p0}, LLg/q;->f()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, LKg/d$a;->Protocol:LKg/d$a;

    invoke-virtual {p0}, LLg/q;->t()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, LKg/d$a;->Application:LKg/d$a;

    invoke-virtual {p0}, LLg/q;->e()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, LKg/d$a;->Instance:LKg/d$a;

    invoke-virtual {p0}, LLg/q;->n()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, LKg/d$a;->Subtype:LKg/d$a;

    invoke-virtual {p0}, LLg/q;->x()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public U()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, LLg/q;->x()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "._sub."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LLg/q;->A()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public Y()Z
    .locals 1

    iget-object v0, p0, LLg/q;->f:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public Z()Z
    .locals 1

    iget-object v0, p0, LLg/q;->q:LLg/q$b;

    invoke-virtual {v0}, LLg/i$b;->g()Z

    move-result v0

    return v0
.end method

.method public a0()Z
    .locals 1

    iget-object v0, p0, LLg/q;->q:LLg/q$b;

    invoke-virtual {v0}, LLg/i$b;->j()Z

    move-result v0

    return v0
.end method

.method public b(LLg/a;JLLg/b;)V
    .locals 1

    instance-of v0, p4, LLg/h;

    if-nez v0, :cond_1

    sget-object p1, LLg/q;->r:LEj/b;

    const-string p2, "DNSEntry is not of type \'DNSRecord\' but of type {}"

    if-nez p4, :cond_0

    const-string p3, "null"

    goto :goto_0

    :cond_0
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p3

    :goto_0
    invoke-interface {p1, p2, p3}, LEj/b;->d(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_1
    check-cast p4, LLg/h;

    invoke-virtual {p4, p2, p3}, LLg/h;->k(J)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0, p4}, LLg/q;->V(LLg/h;)Z

    move-result p1

    goto :goto_1

    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, LLg/q;->W(LLg/a;JLLg/h;)Z

    move-result p1

    :goto_1
    if-eqz p1, :cond_5

    invoke-virtual {p0}, LLg/q;->Q()LLg/l;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, LLg/q;->D()Z

    move-result p2

    if-eqz p2, :cond_3

    new-instance p2, LLg/p;

    invoke-virtual {p0}, LLg/q;->A()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0}, LLg/q;->n()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0}, LLg/q;->O()LLg/q;

    move-result-object v0

    invoke-direct {p2, p1, p3, p4, v0}, LLg/p;-><init>(LLg/l;Ljava/lang/String;Ljava/lang/String;LKg/d;)V

    invoke-virtual {p1, p2}, LLg/l;->Q0(LKg/c;)V

    :cond_3
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0

    goto :goto_2

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_4
    sget-object p1, LLg/q;->r:LEj/b;

    const-string p2, "JmDNS not available."

    invoke-interface {p1, p2}, LEj/b;->l(Ljava/lang/String;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public bridge synthetic c()LKg/d;
    .locals 1

    invoke-virtual {p0}, LLg/q;->O()LLg/q;

    move-result-object v0

    return-object v0
.end method

.method public c0(LMg/a;Ljavax/jmdns/impl/constants/g;)Z
    .locals 1

    iget-object v0, p0, LLg/q;->q:LLg/q$b;

    invoke-virtual {v0, p1, p2}, LLg/i$b;->l(LMg/a;Ljavax/jmdns/impl/constants/g;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LLg/q;->O()LLg/q;

    move-result-object v0

    return-object v0
.end method

.method public d0()Z
    .locals 1

    iget-object v0, p0, LLg/q;->q:LLg/q$b;

    invoke-virtual {v0}, LLg/i$b;->r()Z

    move-result v0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LLg/q;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public e0()Z
    .locals 1

    iget-boolean v0, p0, LLg/q;->p:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LLg/q;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLg/q;->u()Ljava/lang/String;

    move-result-object v0

    check-cast p1, LLg/q;

    invoke-virtual {p1}, LLg/q;->u()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LLg/q;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "local"

    :goto_0
    return-object v0
.end method

.method public f0()Z
    .locals 1

    iget-object v0, p0, LLg/q;->q:LLg/q$b;

    invoke-virtual {v0}, LLg/i$b;->s()Z

    move-result v0

    return v0
.end method

.method public g0(LMg/a;)V
    .locals 1

    iget-object v0, p0, LLg/q;->q:LLg/q$b;

    invoke-virtual {v0, p1}, LLg/i$b;->t(LMg/a;)V

    return-void
.end method

.method public h(LMg/a;)Z
    .locals 1

    iget-object v0, p0, LLg/q;->q:LLg/q$b;

    invoke-virtual {v0, p1}, LLg/i$b;->h(LMg/a;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, LLg/q;->u()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()[Ljava/net/Inet4Address;
    .locals 2

    iget-object v0, p0, LLg/q;->l:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v1

    new-array v1, v1, [Ljava/net/Inet4Address;

    invoke-interface {v0, v1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/net/Inet4Address;

    return-object v0
.end method

.method public i0()Z
    .locals 1

    iget-object v0, p0, LLg/q;->q:LLg/q$b;

    invoke-virtual {v0}, LLg/i$b;->v()Z

    move-result v0

    return v0
.end method

.method public j0(LLg/l;)V
    .locals 1

    iget-object v0, p0, LLg/q;->q:LLg/q$b;

    invoke-virtual {v0, p1}, LLg/q$b;->y(LLg/l;)V

    return-void
.end method

.method public k()[Ljava/net/Inet6Address;
    .locals 2

    iget-object v0, p0, LLg/q;->m:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v1

    new-array v1, v1, [Ljava/net/Inet6Address;

    invoke-interface {v0, v1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/net/Inet6Address;

    return-object v0
.end method

.method k0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LLg/q;->d:Ljava/lang/String;

    const/4 p1, 0x0

    iput-object p1, p0, LLg/q;->n:Ljava/lang/String;

    return-void
.end method

.method public l()[Ljava/net/InetAddress;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, LLg/q;->l:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    iget-object v2, p0, LLg/q;->m:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, LLg/q;->l:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, LLg/q;->m:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/net/InetAddress;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/net/InetAddress;

    return-object v0
.end method

.method public l0(Z)V
    .locals 1

    iput-boolean p1, p0, LLg/q;->p:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, LLg/q;->q:LLg/q$b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LLg/q$b;->C(LMg/a;)V

    :cond_0
    return-void
.end method

.method public m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LLg/q;->n:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LLg/q;->u()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LLg/q;->n:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, LLg/q;->n:Ljava/lang/String;

    return-object v0
.end method

.method m0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LLg/q;->f:Ljava/lang/String;

    return-void
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LLg/q;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public n0(J)Z
    .locals 1

    iget-object v0, p0, LLg/q;->q:LLg/q$b;

    invoke-virtual {v0, p1, p2}, LLg/i$b;->E(J)Z

    move-result p1

    return p1
.end method

.method public o()I
    .locals 1

    iget v0, p0, LLg/q;->g:I

    return v0
.end method

.method public p()I
    .locals 1

    iget v0, p0, LLg/q;->i:I

    return v0
.end method

.method public q()Ljava/util/Enumeration;
    .locals 2

    invoke-virtual {p0}, LLg/q;->R()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    :goto_0
    new-instance v1, Ljava/util/Vector;

    invoke-direct {v1, v0}, Ljava/util/Vector;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized r(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, LLg/q;->R()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    monitor-exit p0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    :try_start_1
    sget-object v0, LPg/a;->b:[B

    if-ne p1, v0, :cond_1

    const-string p1, "true"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    :try_start_2
    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, LPg/a;->d([BII)Ljava/lang/String;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public t()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LLg/q;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "tcp"

    :goto_0
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " name: \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LLg/q;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {p0}, LLg/q;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0}, LLg/q;->U()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' address: \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LLg/q;->l()[Ljava/net/InetAddress;

    move-result-object v1

    array-length v2, v1

    if-lez v2, :cond_1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v4, 0x3a

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LLg/q;->o()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v4, 0x20

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const-string v1, "(null):"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LLg/q;->o()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_2
    const-string v1, "\' status: \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LLg/q;->q:LLg/q$b;

    invoke-virtual {v1}, LLg/i$b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LLg/q;->F()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "\' is persistent,"

    goto :goto_1

    :cond_3
    const-string v1, "\',"

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LLg/q;->D()Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, " has data"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_4
    const-string v1, " has NO data"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    invoke-virtual {p0}, LLg/q;->z()[B

    move-result-object v1

    array-length v1, v1

    if-lez v1, :cond_6

    invoke-virtual {p0}, LLg/q;->R()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    invoke-static {v3}, LPg/a;->c([B)Ljava/lang/String;

    move-result-object v3

    const-string v4, "\n\t"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_5
    const-string v1, ", empty"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Ljava/lang/String;
    .locals 8

    invoke-virtual {p0}, LLg/q;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, LLg/q;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, LLg/q;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, LLg/q;->n()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    const-string v6, ""

    const-string v7, "."

    if-lez v5, :cond_0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v6

    :goto_0
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const-string v5, "_"

    if-lez v3, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v6

    :goto_1
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    :cond_2
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public w()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LLg/q;->f:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public x()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LLg/q;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public z()[B
    .locals 2

    iget-object v0, p0, LLg/q;->j:[B

    if-eqz v0, :cond_0

    array-length v1, v0

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, LPg/a;->c:[B

    :goto_0
    return-object v0
.end method
