.class public final Lcom/ui/binme/BinaryMessage;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/binme/BinaryMessage$a;,
        Lcom/ui/binme/BinaryMessage$b;,
        Lcom/ui/binme/BinaryMessage$Error;,
        Lcom/ui/binme/BinaryMessage$c;,
        Lcom/ui/binme/BinaryMessage$d;,
        Lcom/ui/binme/BinaryMessage$e;,
        Lcom/ui/binme/BinaryMessage$f;
    }
.end annotation


# static fields
.field public static final c:Lcom/ui/binme/BinaryMessage$a;


# instance fields
.field private final a:Lcom/ui/binme/BinaryMessage$d$b;

.field private final b:Lcom/ui/binme/BinaryMessage$d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/binme/BinaryMessage$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/binme/BinaryMessage$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/binme/BinaryMessage;->c:Lcom/ui/binme/BinaryMessage$a;

    return-void
.end method

.method public constructor <init>(Lcom/ui/binme/BinaryMessage$d$b;Lcom/ui/binme/BinaryMessage$d$a;)V
    .locals 1

    const-string/jumbo v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/binme/BinaryMessage;->a:Lcom/ui/binme/BinaryMessage$d$b;

    iput-object p2, p0, Lcom/ui/binme/BinaryMessage;->b:Lcom/ui/binme/BinaryMessage$d$a;

    return-void
.end method


# virtual methods
.method public final a()Lcom/ui/binme/BinaryMessage$d$a;
    .locals 1

    iget-object v0, p0, Lcom/ui/binme/BinaryMessage;->b:Lcom/ui/binme/BinaryMessage$d$a;

    return-object v0
.end method

.method public final b()Lcom/ui/binme/BinaryMessage$d$b;
    .locals 1

    iget-object v0, p0, Lcom/ui/binme/BinaryMessage;->a:Lcom/ui/binme/BinaryMessage$d$b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/binme/BinaryMessage;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/binme/BinaryMessage;

    iget-object v1, p0, Lcom/ui/binme/BinaryMessage;->a:Lcom/ui/binme/BinaryMessage$d$b;

    iget-object v3, p1, Lcom/ui/binme/BinaryMessage;->a:Lcom/ui/binme/BinaryMessage$d$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/binme/BinaryMessage;->b:Lcom/ui/binme/BinaryMessage$d$a;

    iget-object p1, p1, Lcom/ui/binme/BinaryMessage;->b:Lcom/ui/binme/BinaryMessage$d$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/ui/binme/BinaryMessage;->a:Lcom/ui/binme/BinaryMessage$d$b;

    invoke-virtual {v0}, Lcom/ui/binme/BinaryMessage$d;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/binme/BinaryMessage;->b:Lcom/ui/binme/BinaryMessage$d$a;

    invoke-virtual {v1}, Lcom/ui/binme/BinaryMessage$d;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/ui/binme/BinaryMessage;->a:Lcom/ui/binme/BinaryMessage$d$b;

    iget-object v1, p0, Lcom/ui/binme/BinaryMessage;->b:Lcom/ui/binme/BinaryMessage$d$a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BinaryMessage(header="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", body="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
