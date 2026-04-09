.class public final Lcom/wireguard/config/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/wireguard/config/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/Set;

.field private b:Ljava/util/Optional;

.field private c:Ljava/util/Optional;

.field private d:Ljava/util/Optional;

.field private e:Lcom/wireguard/crypto/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/wireguard/config/c$b;->a:Ljava/util/Set;

    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/wireguard/config/c$b;->b:Ljava/util/Optional;

    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/wireguard/config/c$b;->c:Ljava/util/Optional;

    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/wireguard/config/c$b;->d:Ljava/util/Optional;

    return-void
.end method

.method static synthetic a(Lcom/wireguard/config/c$b;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lcom/wireguard/config/c$b;->a:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic b(Lcom/wireguard/config/c$b;)Ljava/util/Optional;
    .locals 0

    iget-object p0, p0, Lcom/wireguard/config/c$b;->b:Ljava/util/Optional;

    return-object p0
.end method

.method static synthetic c(Lcom/wireguard/config/c$b;)Ljava/util/Optional;
    .locals 0

    iget-object p0, p0, Lcom/wireguard/config/c$b;->c:Ljava/util/Optional;

    return-object p0
.end method

.method static synthetic d(Lcom/wireguard/config/c$b;)Ljava/util/Optional;
    .locals 0

    iget-object p0, p0, Lcom/wireguard/config/c$b;->d:Ljava/util/Optional;

    return-object p0
.end method

.method static synthetic e(Lcom/wireguard/config/c$b;)Lcom/wireguard/crypto/b;
    .locals 0

    iget-object p0, p0, Lcom/wireguard/config/c$b;->e:Lcom/wireguard/crypto/b;

    return-object p0
.end method


# virtual methods
.method public f(LYf/d;)Lcom/wireguard/config/c$b;
    .locals 1

    iget-object v0, p0, Lcom/wireguard/config/c$b;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public g()Lcom/wireguard/config/c;
    .locals 5

    iget-object v0, p0, Lcom/wireguard/config/c$b;->e:Lcom/wireguard/crypto/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/wireguard/config/c;

    invoke-direct {v0, p0, v1}, Lcom/wireguard/config/c;-><init>(Lcom/wireguard/config/c$b;Lcom/wireguard/config/c$a;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/wireguard/config/BadConfigException;

    sget-object v2, Lcom/wireguard/config/BadConfigException$c;->PEER:Lcom/wireguard/config/BadConfigException$c;

    sget-object v3, Lcom/wireguard/config/BadConfigException$a;->PUBLIC_KEY:Lcom/wireguard/config/BadConfigException$a;

    sget-object v4, Lcom/wireguard/config/BadConfigException$b;->MISSING_ATTRIBUTE:Lcom/wireguard/config/BadConfigException$b;

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/wireguard/config/BadConfigException;-><init>(Lcom/wireguard/config/BadConfigException$c;Lcom/wireguard/config/BadConfigException$a;Lcom/wireguard/config/BadConfigException$b;Ljava/lang/CharSequence;)V

    throw v0
.end method

.method public h(LYf/c;)Lcom/wireguard/config/c$b;
    .locals 0

    invoke-static {p1}, Ljava/util/Optional;->of(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object p1

    iput-object p1, p0, Lcom/wireguard/config/c$b;->b:Ljava/util/Optional;

    return-object p0
.end method

.method public i(Lcom/wireguard/crypto/b;)Lcom/wireguard/config/c$b;
    .locals 0

    iput-object p1, p0, Lcom/wireguard/config/c$b;->e:Lcom/wireguard/crypto/b;

    return-object p0
.end method
