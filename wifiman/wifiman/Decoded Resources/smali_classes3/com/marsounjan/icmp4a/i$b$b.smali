.class public final Lcom/marsounjan/icmp4a/i$b$b;
.super Lcom/marsounjan/icmp4a/i$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/marsounjan/icmp4a/i$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:S

.field private final b:S

.field private final c:Lcom/marsounjan/icmp4a/i$c;


# direct methods
.method private constructor <init>(SS)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/marsounjan/icmp4a/i$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-short p1, p0, Lcom/marsounjan/icmp4a/i$b$b;->a:S

    .line 4
    iput-short p2, p0, Lcom/marsounjan/icmp4a/i$b$b;->b:S

    .line 5
    sget-object p1, Lcom/marsounjan/icmp4a/i$c;->ECHO_REPLY:Lcom/marsounjan/icmp4a/i$c;

    iput-object p1, p0, Lcom/marsounjan/icmp4a/i$b$b;->c:Lcom/marsounjan/icmp4a/i$c;

    return-void
.end method

.method public synthetic constructor <init>(SSLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/marsounjan/icmp4a/i$b$b;-><init>(SS)V

    return-void
.end method


# virtual methods
.method public final b()S
    .locals 1

    iget-short v0, p0, Lcom/marsounjan/icmp4a/i$b$b;->a:S

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/marsounjan/icmp4a/i$b$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/marsounjan/icmp4a/i$b$b;

    iget-short v1, p0, Lcom/marsounjan/icmp4a/i$b$b;->a:S

    iget-short v3, p1, Lcom/marsounjan/icmp4a/i$b$b;->a:S

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-short v1, p0, Lcom/marsounjan/icmp4a/i$b$b;->b:S

    iget-short p1, p1, Lcom/marsounjan/icmp4a/i$b$b;->b:S

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-short v0, p0, Lcom/marsounjan/icmp4a/i$b$b;->a:S

    invoke-static {v0}, LYg/H;->d(S)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-short v1, p0, Lcom/marsounjan/icmp4a/i$b$b;->b:S

    invoke-static {v1}, Ljava/lang/Short;->hashCode(S)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Echo(sequenceNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/marsounjan/icmp4a/i$b$b;->a:S

    invoke-static {v1}, LYg/H;->g(S)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", identifier="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/marsounjan/icmp4a/i$b$b;->b:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
