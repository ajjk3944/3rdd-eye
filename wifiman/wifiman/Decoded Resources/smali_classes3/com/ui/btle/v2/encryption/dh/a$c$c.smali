.class final Lcom/ui/btle/v2/encryption/dh/a$c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/btle/v2/encryption/dh/a$c;->b(LYg/s;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/btle/v2/encryption/dh/a;

.field final synthetic b:[B

.field final synthetic c:[B


# direct methods
.method constructor <init>(Lcom/ui/btle/v2/encryption/dh/a;[B[B)V
    .locals 0

    iput-object p1, p0, Lcom/ui/btle/v2/encryption/dh/a$c$c;->a:Lcom/ui/btle/v2/encryption/dh/a;

    iput-object p2, p0, Lcom/ui/btle/v2/encryption/dh/a$c$c;->b:[B

    iput-object p3, p0, Lcom/ui/btle/v2/encryption/dh/a$c$c;->c:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/btle/v2/d;)[B
    .locals 5

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/btle/v2/encryption/dh/a$c$c$a;->a:Lcom/ui/btle/v2/encryption/dh/a$c$c$a;

    invoke-static {v0}, Lb9/a;->c(Lmh/a;)V

    iget-object v0, p0, Lcom/ui/btle/v2/encryption/dh/a$c$c;->a:Lcom/ui/btle/v2/encryption/dh/a;

    iget-object v1, p0, Lcom/ui/btle/v2/encryption/dh/a$c$c;->b:[B

    iget-object v2, p0, Lcom/ui/btle/v2/encryption/dh/a$c$c;->c:[B

    sget-object v3, Lcom/ui/btle/v2/encryption/dh/a$b;->Companion:Lcom/ui/btle/v2/encryption/dh/a$b$a;

    invoke-virtual {v3, p1}, Lcom/ui/btle/v2/encryption/dh/a$b$a;->a(Lcom/ui/btle/v2/d;)[B

    move-result-object p1

    const/4 v3, 0x0

    if-eqz p1, :cond_1

    iget-object v4, p0, Lcom/ui/btle/v2/encryption/dh/a$c$c;->a:Lcom/ui/btle/v2/encryption/dh/a;

    invoke-static {v4}, Lcom/ui/btle/v2/encryption/dh/a;->d(Lcom/ui/btle/v2/encryption/dh/a;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-static {v4}, Ld9/a;->a(Ljava/lang/String;)[B

    move-result-object v3

    :cond_0
    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/ui/btle/v2/encryption/dh/d;->a([B[B[B[B)[B

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lcom/ui/btle/v2/encryption/dh/DiffieHellman$Error$KeyExchange;

    const-string/jumbo v0, "Failed to parse DH server public key"

    const/4 v1, 0x2

    invoke-direct {p1, v0, v3, v1, v3}, Lcom/ui/btle/v2/encryption/dh/DiffieHellman$Error$KeyExchange;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/btle/v2/d;

    invoke-virtual {p0, p1}, Lcom/ui/btle/v2/encryption/dh/a$c$c;->a(Lcom/ui/btle/v2/d;)[B

    move-result-object p1

    return-object p1
.end method
