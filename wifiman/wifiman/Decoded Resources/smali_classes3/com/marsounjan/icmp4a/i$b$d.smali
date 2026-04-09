.class public final Lcom/marsounjan/icmp4a/i$b$d;
.super Lcom/marsounjan/icmp4a/i$b;
.source "SourceFile"

# interfaces
.implements LK5/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/marsounjan/icmp4a/i$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/marsounjan/icmp4a/i$b$d$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/marsounjan/icmp4a/i$b$d$a;

.field private final b:I

.field private final c:Lcom/marsounjan/icmp4a/i$c;


# direct methods
.method private constructor <init>(Lcom/marsounjan/icmp4a/i$b$d$a;I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/marsounjan/icmp4a/i$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, Lcom/marsounjan/icmp4a/i$b$d;->a:Lcom/marsounjan/icmp4a/i$b$d$a;

    .line 4
    iput p2, p0, Lcom/marsounjan/icmp4a/i$b$d;->b:I

    .line 5
    sget-object p1, Lcom/marsounjan/icmp4a/i$c;->PARAMETER_PROBLEM:Lcom/marsounjan/icmp4a/i$c;

    iput-object p1, p0, Lcom/marsounjan/icmp4a/i$b$d;->c:Lcom/marsounjan/icmp4a/i$c;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/marsounjan/icmp4a/i$b$d$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/marsounjan/icmp4a/i$b$d;-><init>(Lcom/marsounjan/icmp4a/i$b$d$a;I)V

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, Lcom/marsounjan/icmp4a/i$b$d;->b:I

    return v0
.end method

.method public final c()Lcom/marsounjan/icmp4a/i$b$d$a;
    .locals 1

    iget-object v0, p0, Lcom/marsounjan/icmp4a/i$b$d;->a:Lcom/marsounjan/icmp4a/i$b$d$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/marsounjan/icmp4a/i$b$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/marsounjan/icmp4a/i$b$d;

    iget-object v1, p0, Lcom/marsounjan/icmp4a/i$b$d;->a:Lcom/marsounjan/icmp4a/i$b$d$a;

    iget-object v3, p1, Lcom/marsounjan/icmp4a/i$b$d;->a:Lcom/marsounjan/icmp4a/i$b$d$a;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/marsounjan/icmp4a/i$b$d;->b:I

    iget p1, p1, Lcom/marsounjan/icmp4a/i$b$d;->b:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/marsounjan/icmp4a/i$b$d;->a:Lcom/marsounjan/icmp4a/i$b$d$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/marsounjan/icmp4a/i$b$d;->b:I

    invoke-static {v1}, LYg/C;->d(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "ParameterProblem(reason="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/marsounjan/icmp4a/i$b$d;->a:Lcom/marsounjan/icmp4a/i$b$d$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pointer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/marsounjan/icmp4a/i$b$d;->b:I

    invoke-static {v1}, LYg/C;->g(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
