.class final Lb3/f;
.super Lb3/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb3/f$b;
    }
.end annotation


# instance fields
.field private final a:Lb3/s;

.field private final b:Lb3/p$b;


# direct methods
.method private constructor <init>(Lb3/s;Lb3/p$b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lb3/p;-><init>()V

    .line 3
    iput-object p1, p0, Lb3/f;->a:Lb3/s;

    .line 4
    iput-object p2, p0, Lb3/f;->b:Lb3/p$b;

    return-void
.end method

.method synthetic constructor <init>(Lb3/s;Lb3/p$b;Lb3/f$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lb3/f;-><init>(Lb3/s;Lb3/p$b;)V

    return-void
.end method


# virtual methods
.method public b()Lb3/s;
    .locals 1

    iget-object v0, p0, Lb3/f;->a:Lb3/s;

    return-object v0
.end method

.method public c()Lb3/p$b;
    .locals 1

    iget-object v0, p0, Lb3/f;->b:Lb3/p$b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lb3/p;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    check-cast p1, Lb3/p;

    iget-object v1, p0, Lb3/f;->a:Lb3/s;

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lb3/p;->b()Lb3/s;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lb3/p;->b()Lb3/s;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    iget-object v1, p0, Lb3/f;->b:Lb3/p$b;

    if-nez v1, :cond_2

    invoke-virtual {p1}, Lb3/p;->c()Lb3/p$b;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lb3/p;->c()Lb3/p$b;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    move v0, v2

    :goto_1
    return v0

    :cond_4
    return v2
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lb3/f;->a:Lb3/s;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const v2, 0xf4243

    xor-int/2addr v0, v2

    mul-int/2addr v0, v2

    iget-object v2, p0, Lb3/f;->b:Lb3/p$b;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ComplianceData{privacyContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb3/f;->a:Lb3/s;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", productIdOrigin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb3/f;->b:Lb3/p$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
