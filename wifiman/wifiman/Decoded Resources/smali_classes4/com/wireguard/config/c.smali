.class public final Lcom/wireguard/config/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/wireguard/config/c$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Set;

.field private final b:Ljava/util/Optional;

.field private final c:Ljava/util/Optional;

.field private final d:Ljava/util/Optional;

.field private final e:Lcom/wireguard/crypto/b;


# direct methods
.method private constructor <init>(Lcom/wireguard/config/c$b;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-static {p1}, Lcom/wireguard/config/c$b;->a(Lcom/wireguard/config/c$b;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/wireguard/config/c;->a:Ljava/util/Set;

    .line 4
    invoke-static {p1}, Lcom/wireguard/config/c$b;->b(Lcom/wireguard/config/c$b;)Ljava/util/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/wireguard/config/c;->b:Ljava/util/Optional;

    .line 5
    invoke-static {p1}, Lcom/wireguard/config/c$b;->c(Lcom/wireguard/config/c$b;)Ljava/util/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/wireguard/config/c;->c:Ljava/util/Optional;

    .line 6
    invoke-static {p1}, Lcom/wireguard/config/c$b;->d(Lcom/wireguard/config/c$b;)Ljava/util/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/wireguard/config/c;->d:Ljava/util/Optional;

    .line 7
    invoke-static {p1}, Lcom/wireguard/config/c$b;->e(Lcom/wireguard/config/c$b;)Lcom/wireguard/crypto/b;

    move-result-object p1

    const-string v0, "Peers must have a public key"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/wireguard/config/c;->e:Lcom/wireguard/crypto/b;

    return-void
.end method

.method synthetic constructor <init>(Lcom/wireguard/config/c$b;Lcom/wireguard/config/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/wireguard/config/c;-><init>(Lcom/wireguard/config/c$b;)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/StringBuilder;Lcom/wireguard/crypto/b;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/wireguard/config/c;->j(Ljava/lang/StringBuilder;Lcom/wireguard/crypto/b;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/StringBuilder;Ljava/lang/Integer;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/wireguard/config/c;->i(Ljava/lang/StringBuilder;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic c(Ljava/lang/StringBuilder;LYf/c;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/wireguard/config/c;->g(Ljava/lang/StringBuilder;LYf/c;)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/StringBuilder;LYf/c;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/wireguard/config/c;->h(Ljava/lang/StringBuilder;LYf/c;)V

    return-void
.end method

.method private static synthetic g(Ljava/lang/StringBuilder;LYf/c;)V
    .locals 1

    const-string v0, " @"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static synthetic h(Ljava/lang/StringBuilder;LYf/c;)V
    .locals 1

    const-string v0, "endpoint="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static synthetic i(Ljava/lang/StringBuilder;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "persistent_keepalive_interval="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static synthetic j(Ljava/lang/StringBuilder;Lcom/wireguard/crypto/b;)V
    .locals 1

    const-string v0, "preshared_key="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/wireguard/crypto/b;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public e()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/wireguard/config/c;->a:Ljava/util/Set;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lcom/wireguard/config/c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/wireguard/config/c;

    iget-object v0, p0, Lcom/wireguard/config/c;->a:Ljava/util/Set;

    iget-object v2, p1, Lcom/wireguard/config/c;->a:Ljava/util/Set;

    invoke-interface {v0, v2}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/wireguard/config/c;->b:Ljava/util/Optional;

    iget-object v2, p1, Lcom/wireguard/config/c;->b:Ljava/util/Optional;

    invoke-virtual {v0, v2}, Ljava/util/Optional;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/wireguard/config/c;->c:Ljava/util/Optional;

    iget-object v2, p1, Lcom/wireguard/config/c;->c:Ljava/util/Optional;

    invoke-virtual {v0, v2}, Ljava/util/Optional;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/wireguard/config/c;->d:Ljava/util/Optional;

    iget-object v2, p1, Lcom/wireguard/config/c;->d:Ljava/util/Optional;

    invoke-virtual {v0, v2}, Ljava/util/Optional;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/wireguard/config/c;->e:Lcom/wireguard/crypto/b;

    iget-object p1, p1, Lcom/wireguard/config/c;->e:Lcom/wireguard/crypto/b;

    invoke-virtual {v0, p1}, Lcom/wireguard/crypto/b;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public f()Ljava/util/Optional;
    .locals 1

    iget-object v0, p0, Lcom/wireguard/config/c;->b:Ljava/util/Optional;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/wireguard/config/c;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    add-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/wireguard/config/c;->b:Ljava/util/Optional;

    invoke-virtual {v2}, Ljava/util/Optional;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/wireguard/config/c;->c:Ljava/util/Optional;

    invoke-virtual {v2}, Ljava/util/Optional;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/wireguard/config/c;->d:Ljava/util/Optional;

    invoke-virtual {v2}, Ljava/util/Optional;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/wireguard/config/c;->e:Lcom/wireguard/crypto/b;

    invoke-virtual {v1}, Lcom/wireguard/crypto/b;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public k()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "public_key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/wireguard/config/c;->e:Lcom/wireguard/crypto/b;

    invoke-virtual {v1}, Lcom/wireguard/crypto/b;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/wireguard/config/c;->a:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYf/d;

    const-string v4, "allowed_ip="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/wireguard/config/c;->b:Ljava/util/Optional;

    new-instance v2, LYf/j;

    invoke-direct {v2}, LYf/j;-><init>()V

    invoke-virtual {v1, v2}, Ljava/util/Optional;->flatMap(Ljava/util/function/Function;)Ljava/util/Optional;

    move-result-object v1

    new-instance v2, LYf/k;

    invoke-direct {v2, v0}, LYf/k;-><init>(Ljava/lang/StringBuilder;)V

    invoke-virtual {v1, v2}, Ljava/util/Optional;->ifPresent(Ljava/util/function/Consumer;)V

    iget-object v1, p0, Lcom/wireguard/config/c;->c:Ljava/util/Optional;

    new-instance v2, LYf/l;

    invoke-direct {v2, v0}, LYf/l;-><init>(Ljava/lang/StringBuilder;)V

    invoke-virtual {v1, v2}, Ljava/util/Optional;->ifPresent(Ljava/util/function/Consumer;)V

    iget-object v1, p0, Lcom/wireguard/config/c;->d:Ljava/util/Optional;

    new-instance v2, LYf/m;

    invoke-direct {v2, v0}, LYf/m;-><init>(Ljava/lang/StringBuilder;)V

    invoke-virtual {v1, v2}, Ljava/util/Optional;->ifPresent(Ljava/util/function/Consumer;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "(Peer "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/wireguard/config/c;->e:Lcom/wireguard/crypto/b;

    invoke-virtual {v1}, Lcom/wireguard/crypto/b;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/wireguard/config/c;->b:Ljava/util/Optional;

    new-instance v2, LYf/i;

    invoke-direct {v2, v0}, LYf/i;-><init>(Ljava/lang/StringBuilder;)V

    invoke-virtual {v1, v2}, Ljava/util/Optional;->ifPresent(Ljava/util/function/Consumer;)V

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
