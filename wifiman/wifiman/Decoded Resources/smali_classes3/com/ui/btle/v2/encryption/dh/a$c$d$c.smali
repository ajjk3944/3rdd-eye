.class final Lcom/ui/btle/v2/encryption/dh/a$c$d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/btle/v2/encryption/dh/a$c$d;->b([B)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:[B


# direct methods
.method constructor <init>([B)V
    .locals 0

    iput-object p1, p0, Lcom/ui/btle/v2/encryption/dh/a$c$d$c;->a:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/btle/v2/d;)Lgg/D;
    .locals 3

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/btle/v2/encryption/dh/a$a;->Companion:Lcom/ui/btle/v2/encryption/dh/a$a$a;

    invoke-virtual {v0, p1}, Lcom/ui/btle/v2/encryption/dh/a$a$a;->a(Lcom/ui/btle/v2/d;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/ui/btle/v2/encryption/dh/a$c$d$c;->a:[B

    invoke-static {p1}, LZ8/c$a;->b([B)[B

    move-result-object p1

    invoke-static {p1}, LZ8/c$a;->a([B)LZ8/c$a;

    move-result-object p1

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/ui/btle/v2/encryption/dh/DiffieHellman$Error$Auth;

    const-string v0, "DH Authentication failed"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/ui/btle/v2/encryption/dh/DiffieHellman$Error$Auth;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/btle/v2/d;

    invoke-virtual {p0, p1}, Lcom/ui/btle/v2/encryption/dh/a$c$d$c;->a(Lcom/ui/btle/v2/d;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
