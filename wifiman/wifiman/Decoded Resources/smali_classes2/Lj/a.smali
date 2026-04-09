.class final LLj/a;
.super LLj/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLj/a$b;
    }
.end annotation


# instance fields
.field private final c:Landroid/graphics/Rect;

.field private final d:LLj/b$b;


# direct methods
.method private constructor <init>(Landroid/graphics/Rect;LLj/b$b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LLj/b;-><init>()V

    .line 3
    iput-object p1, p0, LLj/a;->c:Landroid/graphics/Rect;

    .line 4
    iput-object p2, p0, LLj/a;->d:LLj/b$b;

    return-void
.end method

.method synthetic constructor <init>(Landroid/graphics/Rect;LLj/b$b;LLj/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LLj/a;-><init>(Landroid/graphics/Rect;LLj/b$b;)V

    return-void
.end method


# virtual methods
.method public b()LLj/b$b;
    .locals 1

    iget-object v0, p0, LLj/a;->d:LLj/b$b;

    return-object v0
.end method

.method public c()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, LLj/a;->c:Landroid/graphics/Rect;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LLj/b;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, LLj/b;

    iget-object v1, p0, LLj/a;->c:Landroid/graphics/Rect;

    invoke-virtual {p1}, LLj/b;->c()Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LLj/a;->d:LLj/b$b;

    invoke-virtual {p1}, LLj/b;->b()LLj/b$b;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LLj/a;->c:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v1, p0, LLj/a;->d:LLj/b$b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ImageProcessingOptions{roi="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LLj/a;->c:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", orientation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LLj/a;->d:LLj/b$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
