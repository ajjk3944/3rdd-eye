.class final Ls/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lm0/J0;

.field private b:Lm0/n0;

.field private c:Lo0/a;

.field private d:Lm0/U0;


# direct methods
.method public constructor <init>(Lm0/J0;Lm0/n0;Lo0/a;Lm0/U0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ls/d;->a:Lm0/J0;

    .line 3
    iput-object p2, p0, Ls/d;->b:Lm0/n0;

    .line 4
    iput-object p3, p0, Ls/d;->c:Lo0/a;

    .line 5
    iput-object p4, p0, Ls/d;->d:Lm0/U0;

    return-void
.end method

.method public synthetic constructor <init>(Lm0/J0;Lm0/n0;Lo0/a;Lm0/U0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    .line 6
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Ls/d;-><init>(Lm0/J0;Lm0/n0;Lo0/a;Lm0/U0;)V

    return-void
.end method

.method public static final synthetic a(Ls/d;)Lm0/n0;
    .locals 0

    iget-object p0, p0, Ls/d;->b:Lm0/n0;

    return-object p0
.end method

.method public static final synthetic b(Ls/d;)Lo0/a;
    .locals 0

    iget-object p0, p0, Ls/d;->c:Lo0/a;

    return-object p0
.end method

.method public static final synthetic c(Ls/d;)Lm0/J0;
    .locals 0

    iget-object p0, p0, Ls/d;->a:Lm0/J0;

    return-object p0
.end method

.method public static final synthetic d(Ls/d;Lm0/n0;)V
    .locals 0

    iput-object p1, p0, Ls/d;->b:Lm0/n0;

    return-void
.end method

.method public static final synthetic e(Ls/d;Lo0/a;)V
    .locals 0

    iput-object p1, p0, Ls/d;->c:Lo0/a;

    return-void
.end method

.method public static final synthetic f(Ls/d;Lm0/J0;)V
    .locals 0

    iput-object p1, p0, Ls/d;->a:Lm0/J0;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ls/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ls/d;

    iget-object v1, p0, Ls/d;->a:Lm0/J0;

    iget-object v3, p1, Ls/d;->a:Lm0/J0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ls/d;->b:Lm0/n0;

    iget-object v3, p1, Ls/d;->b:Lm0/n0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ls/d;->c:Lo0/a;

    iget-object v3, p1, Ls/d;->c:Lo0/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ls/d;->d:Lm0/U0;

    iget-object p1, p1, Ls/d;->d:Lm0/U0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final g()Lm0/U0;
    .locals 1

    iget-object v0, p0, Ls/d;->d:Lm0/U0;

    if-nez v0, :cond_0

    invoke-static {}, Lm0/Y;->a()Lm0/U0;

    move-result-object v0

    iput-object v0, p0, Ls/d;->d:Lm0/U0;

    :cond_0
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Ls/d;->a:Lm0/J0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ls/d;->b:Lm0/n0;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ls/d;->c:Lo0/a;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ls/d;->d:Lm0/U0;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BorderCache(imageBitmap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ls/d;->a:Lm0/J0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", canvas="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ls/d;->b:Lm0/n0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", canvasDrawScope="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ls/d;->c:Lo0/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", borderPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ls/d;->d:Lm0/U0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
