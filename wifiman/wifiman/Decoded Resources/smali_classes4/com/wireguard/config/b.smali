.class public final Lcom/wireguard/config/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/wireguard/config/b$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Set;

.field private final b:Ljava/util/Set;

.field private final c:Ljava/util/Set;

.field private final d:Ljava/util/Set;

.field private final e:Lcom/wireguard/crypto/c;

.field private final f:Ljava/util/Optional;

.field private final g:Ljava/util/Optional;

.field private final h:Ljava/util/Optional;


# direct methods
.method private constructor <init>(Lcom/wireguard/config/b$b;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-static {p1}, Lcom/wireguard/config/b$b;->a(Lcom/wireguard/config/b$b;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/wireguard/config/b;->a:Ljava/util/Set;

    .line 4
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-static {p1}, Lcom/wireguard/config/b$b;->b(Lcom/wireguard/config/b$b;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/wireguard/config/b;->b:Ljava/util/Set;

    .line 5
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-static {p1}, Lcom/wireguard/config/b$b;->c(Lcom/wireguard/config/b$b;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/wireguard/config/b;->c:Ljava/util/Set;

    .line 6
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-static {p1}, Lcom/wireguard/config/b$b;->d(Lcom/wireguard/config/b$b;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/wireguard/config/b;->d:Ljava/util/Set;

    .line 7
    invoke-static {p1}, Lcom/wireguard/config/b$b;->e(Lcom/wireguard/config/b$b;)Lcom/wireguard/crypto/c;

    move-result-object v0

    const-string v1, "Interfaces must have a private key"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object v0, p0, Lcom/wireguard/config/b;->e:Lcom/wireguard/crypto/c;

    .line 8
    invoke-static {p1}, Lcom/wireguard/config/b$b;->f(Lcom/wireguard/config/b$b;)Ljava/util/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/wireguard/config/b;->f:Ljava/util/Optional;

    .line 9
    invoke-static {p1}, Lcom/wireguard/config/b$b;->g(Lcom/wireguard/config/b$b;)Ljava/util/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/wireguard/config/b;->g:Ljava/util/Optional;

    .line 10
    invoke-static {p1}, Lcom/wireguard/config/b$b;->h(Lcom/wireguard/config/b$b;)Ljava/util/Optional;

    move-result-object p1

    iput-object p1, p0, Lcom/wireguard/config/b;->h:Ljava/util/Optional;

    return-void
.end method

.method synthetic constructor <init>(Lcom/wireguard/config/b$b;Lcom/wireguard/config/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/wireguard/config/b;-><init>(Lcom/wireguard/config/b$b;)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/StringBuilder;Ljava/net/InetAddress;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/wireguard/config/b;->j(Ljava/lang/StringBuilder;Ljava/net/InetAddress;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/StringBuilder;Ljava/lang/Integer;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/wireguard/config/b;->k(Ljava/lang/StringBuilder;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic c(Ljava/lang/StringBuilder;Ljava/lang/Integer;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/wireguard/config/b;->m(Ljava/lang/StringBuilder;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/StringBuilder;Ljava/net/InetAddress;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/wireguard/config/b;->l(Ljava/lang/StringBuilder;Ljava/net/InetAddress;)V

    return-void
.end method

.method private static synthetic j(Ljava/lang/StringBuilder;Ljava/net/InetAddress;)V
    .locals 1

    const-string v0, " @"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static synthetic k(Ljava/lang/StringBuilder;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, " @"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static synthetic l(Ljava/lang/StringBuilder;Ljava/net/InetAddress;)V
    .locals 1

    const-string v0, "listen_addr="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static synthetic m(Ljava/lang/StringBuilder;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "listen_port="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public e()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/wireguard/config/b;->a:Ljava/util/Set;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lcom/wireguard/config/b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/wireguard/config/b;

    iget-object v0, p0, Lcom/wireguard/config/b;->a:Ljava/util/Set;

    iget-object v2, p1, Lcom/wireguard/config/b;->a:Ljava/util/Set;

    invoke-interface {v0, v2}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/wireguard/config/b;->b:Ljava/util/Set;

    iget-object v2, p1, Lcom/wireguard/config/b;->b:Ljava/util/Set;

    invoke-interface {v0, v2}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/wireguard/config/b;->c:Ljava/util/Set;

    iget-object v2, p1, Lcom/wireguard/config/b;->c:Ljava/util/Set;

    invoke-interface {v0, v2}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/wireguard/config/b;->d:Ljava/util/Set;

    iget-object v2, p1, Lcom/wireguard/config/b;->d:Ljava/util/Set;

    invoke-interface {v0, v2}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/wireguard/config/b;->e:Lcom/wireguard/crypto/c;

    iget-object v2, p1, Lcom/wireguard/config/b;->e:Lcom/wireguard/crypto/c;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/wireguard/config/b;->f:Ljava/util/Optional;

    iget-object v2, p1, Lcom/wireguard/config/b;->f:Ljava/util/Optional;

    invoke-virtual {v0, v2}, Ljava/util/Optional;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/wireguard/config/b;->g:Ljava/util/Optional;

    iget-object v2, p1, Lcom/wireguard/config/b;->g:Ljava/util/Optional;

    invoke-virtual {v0, v2}, Ljava/util/Optional;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/wireguard/config/b;->h:Ljava/util/Optional;

    iget-object p1, p1, Lcom/wireguard/config/b;->h:Ljava/util/Optional;

    invoke-virtual {v0, p1}, Ljava/util/Optional;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public f()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/wireguard/config/b;->b:Ljava/util/Set;

    return-object v0
.end method

.method public g()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/wireguard/config/b;->c:Ljava/util/Set;

    return-object v0
.end method

.method public h()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/wireguard/config/b;->d:Ljava/util/Set;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/wireguard/config/b;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    add-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/wireguard/config/b;->b:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/wireguard/config/b;->c:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/wireguard/config/b;->d:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/wireguard/config/b;->e:Lcom/wireguard/crypto/c;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/wireguard/config/b;->f:Ljava/util/Optional;

    invoke-virtual {v2}, Ljava/util/Optional;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/wireguard/config/b;->g:Ljava/util/Optional;

    invoke-virtual {v2}, Ljava/util/Optional;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/wireguard/config/b;->h:Ljava/util/Optional;

    invoke-virtual {v1}, Ljava/util/Optional;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public i()Ljava/util/Optional;
    .locals 1

    iget-object v0, p0, Lcom/wireguard/config/b;->h:Ljava/util/Optional;

    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "private_key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/wireguard/config/b;->e:Lcom/wireguard/crypto/c;

    invoke-virtual {v1}, Lcom/wireguard/crypto/c;->a()Lcom/wireguard/crypto/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/wireguard/crypto/b;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/wireguard/config/b;->f:Ljava/util/Optional;

    new-instance v2, LYf/g;

    invoke-direct {v2, v0}, LYf/g;-><init>(Ljava/lang/StringBuilder;)V

    invoke-virtual {v1, v2}, Ljava/util/Optional;->ifPresent(Ljava/util/function/Consumer;)V

    iget-object v1, p0, Lcom/wireguard/config/b;->g:Ljava/util/Optional;

    new-instance v2, LYf/h;

    invoke-direct {v2, v0}, LYf/h;-><init>(Ljava/lang/StringBuilder;)V

    invoke-virtual {v1, v2}, Ljava/util/Optional;->ifPresent(Ljava/util/function/Consumer;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "(Interface "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/wireguard/config/b;->e:Lcom/wireguard/crypto/c;

    invoke-virtual {v1}, Lcom/wireguard/crypto/c;->b()Lcom/wireguard/crypto/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/wireguard/crypto/b;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/wireguard/config/b;->f:Ljava/util/Optional;

    new-instance v2, LYf/e;

    invoke-direct {v2, v0}, LYf/e;-><init>(Ljava/lang/StringBuilder;)V

    invoke-virtual {v1, v2}, Ljava/util/Optional;->ifPresent(Ljava/util/function/Consumer;)V

    iget-object v1, p0, Lcom/wireguard/config/b;->g:Ljava/util/Optional;

    new-instance v2, LYf/f;

    invoke-direct {v2, v0}, LYf/f;-><init>(Ljava/lang/StringBuilder;)V

    invoke-virtual {v1, v2}, Ljava/util/Optional;->ifPresent(Ljava/util/function/Consumer;)V

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
