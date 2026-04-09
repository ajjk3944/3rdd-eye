.class public abstract Lcom/ui/binme/BinaryMessage$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/binme/BinaryMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/binme/BinaryMessage$d$a;,
        Lcom/ui/binme/BinaryMessage$d$b;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/binme/BinaryMessage$d;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lcom/ui/binme/BinaryMessage$b;
.end method

.method public abstract b()[B
.end method

.method public abstract c()Lcom/ui/binme/BinaryMessage$c;
.end method

.method public abstract d()Lcom/ui/binme/BinaryMessage$f;
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const-string/jumbo v1, "null cannot be cast to non-null type com.ui.binme.BinaryMessage.Fragment"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/ui/binme/BinaryMessage$d;

    invoke-virtual {p0}, Lcom/ui/binme/BinaryMessage$d;->d()Lcom/ui/binme/BinaryMessage$f;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage$d;->d()Lcom/ui/binme/BinaryMessage$f;

    move-result-object v3

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, Lcom/ui/binme/BinaryMessage$d;->c()Lcom/ui/binme/BinaryMessage$c;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage$d;->c()Lcom/ui/binme/BinaryMessage$c;

    move-result-object v3

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    invoke-virtual {p0}, Lcom/ui/binme/BinaryMessage$d;->a()Lcom/ui/binme/BinaryMessage$b;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage$d;->a()Lcom/ui/binme/BinaryMessage$b;

    move-result-object v3

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    invoke-virtual {p0}, Lcom/ui/binme/BinaryMessage$d;->b()[B

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/binme/BinaryMessage$d;->b()[B

    move-result-object p1

    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lcom/ui/binme/BinaryMessage$d;->d()Lcom/ui/binme/BinaryMessage$f;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/ui/binme/BinaryMessage$d;->c()Lcom/ui/binme/BinaryMessage$c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/ui/binme/BinaryMessage$d;->a()Lcom/ui/binme/BinaryMessage$b;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/ui/binme/BinaryMessage$d;->b()[B

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
