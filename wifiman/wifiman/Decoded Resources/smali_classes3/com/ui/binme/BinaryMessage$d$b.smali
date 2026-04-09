.class public final Lcom/ui/binme/BinaryMessage$d$b;
.super Lcom/ui/binme/BinaryMessage$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/binme/BinaryMessage$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/ui/binme/BinaryMessage$c;

.field private final b:Lcom/ui/binme/BinaryMessage$b;

.field private final c:[B

.field private final d:Lcom/ui/binme/BinaryMessage$f;


# direct methods
.method public constructor <init>(Lcom/ui/binme/BinaryMessage$c;Lcom/ui/binme/BinaryMessage$b;[B)V
    .locals 1

    const-string/jumbo v0, "format"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "compression"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "content"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/binme/BinaryMessage$d;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/binme/BinaryMessage$d$b;->a:Lcom/ui/binme/BinaryMessage$c;

    iput-object p2, p0, Lcom/ui/binme/BinaryMessage$d$b;->b:Lcom/ui/binme/BinaryMessage$b;

    iput-object p3, p0, Lcom/ui/binme/BinaryMessage$d$b;->c:[B

    sget-object p1, Lcom/ui/binme/BinaryMessage$f;->HEADER:Lcom/ui/binme/BinaryMessage$f;

    iput-object p1, p0, Lcom/ui/binme/BinaryMessage$d$b;->d:Lcom/ui/binme/BinaryMessage$f;

    return-void
.end method


# virtual methods
.method public a()Lcom/ui/binme/BinaryMessage$b;
    .locals 1

    iget-object v0, p0, Lcom/ui/binme/BinaryMessage$d$b;->b:Lcom/ui/binme/BinaryMessage$b;

    return-object v0
.end method

.method public b()[B
    .locals 1

    iget-object v0, p0, Lcom/ui/binme/BinaryMessage$d$b;->c:[B

    return-object v0
.end method

.method public c()Lcom/ui/binme/BinaryMessage$c;
    .locals 1

    iget-object v0, p0, Lcom/ui/binme/BinaryMessage$d$b;->a:Lcom/ui/binme/BinaryMessage$c;

    return-object v0
.end method

.method public d()Lcom/ui/binme/BinaryMessage$f;
    .locals 1

    iget-object v0, p0, Lcom/ui/binme/BinaryMessage$d$b;->d:Lcom/ui/binme/BinaryMessage$f;

    return-object v0
.end method
