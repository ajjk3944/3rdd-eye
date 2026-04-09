.class public Lcom/wireguard/crypto/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/wireguard/crypto/b;

.field private final b:Lcom/wireguard/crypto/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/wireguard/crypto/b;->e()Lcom/wireguard/crypto/b;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/wireguard/crypto/c;-><init>(Lcom/wireguard/crypto/b;)V

    return-void
.end method

.method public constructor <init>(Lcom/wireguard/crypto/b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/wireguard/crypto/c;->a:Lcom/wireguard/crypto/b;

    .line 4
    invoke-static {p1}, Lcom/wireguard/crypto/b;->f(Lcom/wireguard/crypto/b;)Lcom/wireguard/crypto/b;

    move-result-object p1

    iput-object p1, p0, Lcom/wireguard/crypto/c;->b:Lcom/wireguard/crypto/b;

    return-void
.end method


# virtual methods
.method public a()Lcom/wireguard/crypto/b;
    .locals 1

    iget-object v0, p0, Lcom/wireguard/crypto/c;->a:Lcom/wireguard/crypto/b;

    return-object v0
.end method

.method public b()Lcom/wireguard/crypto/b;
    .locals 1

    iget-object v0, p0, Lcom/wireguard/crypto/c;->b:Lcom/wireguard/crypto/b;

    return-object v0
.end method
