.class final Lb3/i;
.super Lb3/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb3/i$b;
    }
.end annotation


# instance fields
.field private final a:Lb3/r;


# direct methods
.method private constructor <init>(Lb3/r;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lb3/s;-><init>()V

    .line 3
    iput-object p1, p0, Lb3/i;->a:Lb3/r;

    return-void
.end method

.method synthetic constructor <init>(Lb3/r;Lb3/i$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lb3/i;-><init>(Lb3/r;)V

    return-void
.end method


# virtual methods
.method public b()Lb3/r;
    .locals 1

    iget-object v0, p0, Lb3/i;->a:Lb3/r;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lb3/s;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    check-cast p1, Lb3/s;

    iget-object v1, p0, Lb3/i;->a:Lb3/r;

    invoke-virtual {p1}, Lb3/s;->b()Lb3/r;

    move-result-object p1

    if-nez v1, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0

    :cond_3
    return v2
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lb3/i;->a:Lb3/r;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const v1, 0xf4243

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ExternalPrivacyContext{prequest="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb3/i;->a:Lb3/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
