.class public final Lcom/wireguard/config/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/wireguard/config/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/Set;

.field private final b:Ljava/util/Set;

.field private final c:Ljava/util/Set;

.field private final d:Ljava/util/Set;

.field private e:Lcom/wireguard/crypto/c;

.field private f:Ljava/util/Optional;

.field private g:Ljava/util/Optional;

.field private h:Ljava/util/Optional;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/wireguard/config/b$b;->a:Ljava/util/Set;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/wireguard/config/b$b;->b:Ljava/util/Set;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/wireguard/config/b$b;->c:Ljava/util/Set;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/wireguard/config/b$b;->d:Ljava/util/Set;

    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/wireguard/config/b$b;->f:Ljava/util/Optional;

    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/wireguard/config/b$b;->g:Ljava/util/Optional;

    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/wireguard/config/b$b;->h:Ljava/util/Optional;

    return-void
.end method

.method static synthetic a(Lcom/wireguard/config/b$b;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lcom/wireguard/config/b$b;->a:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic b(Lcom/wireguard/config/b$b;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lcom/wireguard/config/b$b;->b:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic c(Lcom/wireguard/config/b$b;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lcom/wireguard/config/b$b;->c:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic d(Lcom/wireguard/config/b$b;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lcom/wireguard/config/b$b;->d:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic e(Lcom/wireguard/config/b$b;)Lcom/wireguard/crypto/c;
    .locals 0

    iget-object p0, p0, Lcom/wireguard/config/b$b;->e:Lcom/wireguard/crypto/c;

    return-object p0
.end method

.method static synthetic f(Lcom/wireguard/config/b$b;)Ljava/util/Optional;
    .locals 0

    iget-object p0, p0, Lcom/wireguard/config/b$b;->f:Ljava/util/Optional;

    return-object p0
.end method

.method static synthetic g(Lcom/wireguard/config/b$b;)Ljava/util/Optional;
    .locals 0

    iget-object p0, p0, Lcom/wireguard/config/b$b;->g:Ljava/util/Optional;

    return-object p0
.end method

.method static synthetic h(Lcom/wireguard/config/b$b;)Ljava/util/Optional;
    .locals 0

    iget-object p0, p0, Lcom/wireguard/config/b$b;->h:Ljava/util/Optional;

    return-object p0
.end method


# virtual methods
.method public i(LYf/d;)Lcom/wireguard/config/b$b;
    .locals 1

    iget-object v0, p0, Lcom/wireguard/config/b$b;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public j(Ljava/util/Collection;)Lcom/wireguard/config/b$b;
    .locals 1

    iget-object v0, p0, Lcom/wireguard/config/b$b;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public k()Lcom/wireguard/config/b;
    .locals 5

    iget-object v0, p0, Lcom/wireguard/config/b$b;->e:Lcom/wireguard/crypto/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/wireguard/config/b$b;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/wireguard/config/b$b;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/wireguard/config/BadConfigException;

    sget-object v2, Lcom/wireguard/config/BadConfigException$c;->INTERFACE:Lcom/wireguard/config/BadConfigException$c;

    sget-object v3, Lcom/wireguard/config/BadConfigException$a;->INCLUDED_APPLICATIONS:Lcom/wireguard/config/BadConfigException$a;

    sget-object v4, Lcom/wireguard/config/BadConfigException$b;->INVALID_KEY:Lcom/wireguard/config/BadConfigException$b;

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/wireguard/config/BadConfigException;-><init>(Lcom/wireguard/config/BadConfigException$c;Lcom/wireguard/config/BadConfigException$a;Lcom/wireguard/config/BadConfigException$b;Ljava/lang/CharSequence;)V

    throw v0

    :cond_1
    :goto_0
    new-instance v0, Lcom/wireguard/config/b;

    invoke-direct {v0, p0, v1}, Lcom/wireguard/config/b;-><init>(Lcom/wireguard/config/b$b;Lcom/wireguard/config/b$a;)V

    return-object v0

    :cond_2
    new-instance v0, Lcom/wireguard/config/BadConfigException;

    sget-object v2, Lcom/wireguard/config/BadConfigException$c;->INTERFACE:Lcom/wireguard/config/BadConfigException$c;

    sget-object v3, Lcom/wireguard/config/BadConfigException$a;->PRIVATE_KEY:Lcom/wireguard/config/BadConfigException$a;

    sget-object v4, Lcom/wireguard/config/BadConfigException$b;->MISSING_ATTRIBUTE:Lcom/wireguard/config/BadConfigException$b;

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/wireguard/config/BadConfigException;-><init>(Lcom/wireguard/config/BadConfigException$c;Lcom/wireguard/config/BadConfigException$a;Lcom/wireguard/config/BadConfigException$b;Ljava/lang/CharSequence;)V

    throw v0
.end method

.method public l(Lcom/wireguard/crypto/c;)Lcom/wireguard/config/b$b;
    .locals 0

    iput-object p1, p0, Lcom/wireguard/config/b$b;->e:Lcom/wireguard/crypto/c;

    return-object p0
.end method

.method public m(Ljava/net/InetAddress;)Lcom/wireguard/config/b$b;
    .locals 0

    if-nez p1, :cond_0

    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/util/Optional;->of(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/wireguard/config/b$b;->f:Ljava/util/Optional;

    return-object p0
.end method

.method public n(I)Lcom/wireguard/config/b$b;
    .locals 4

    if-ltz p1, :cond_1

    const v0, 0xffff

    if-gt p1, v0, :cond_1

    if-nez p1, :cond_0

    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Optional;->of(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/wireguard/config/b$b;->g:Ljava/util/Optional;

    return-object p0

    :cond_1
    new-instance v0, Lcom/wireguard/config/BadConfigException;

    sget-object v1, Lcom/wireguard/config/BadConfigException$c;->INTERFACE:Lcom/wireguard/config/BadConfigException$c;

    sget-object v2, Lcom/wireguard/config/BadConfigException$a;->LISTEN_PORT:Lcom/wireguard/config/BadConfigException$a;

    sget-object v3, Lcom/wireguard/config/BadConfigException$b;->INVALID_VALUE:Lcom/wireguard/config/BadConfigException$b;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/wireguard/config/BadConfigException;-><init>(Lcom/wireguard/config/BadConfigException$c;Lcom/wireguard/config/BadConfigException$a;Lcom/wireguard/config/BadConfigException$b;Ljava/lang/CharSequence;)V

    throw v0
.end method

.method public o(I)Lcom/wireguard/config/b$b;
    .locals 4

    if-ltz p1, :cond_1

    if-nez p1, :cond_0

    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Optional;->of(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/wireguard/config/b$b;->h:Ljava/util/Optional;

    return-object p0

    :cond_1
    new-instance v0, Lcom/wireguard/config/BadConfigException;

    sget-object v1, Lcom/wireguard/config/BadConfigException$c;->INTERFACE:Lcom/wireguard/config/BadConfigException$c;

    sget-object v2, Lcom/wireguard/config/BadConfigException$a;->MTU:Lcom/wireguard/config/BadConfigException$a;

    sget-object v3, Lcom/wireguard/config/BadConfigException$b;->INVALID_VALUE:Lcom/wireguard/config/BadConfigException$b;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/wireguard/config/BadConfigException;-><init>(Lcom/wireguard/config/BadConfigException$c;Lcom/wireguard/config/BadConfigException$a;Lcom/wireguard/config/BadConfigException$b;Ljava/lang/CharSequence;)V

    throw v0
.end method
