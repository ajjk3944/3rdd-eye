.class public final Lw9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:F

.field private final b:F

.field private final c:F

.field private final d:F

.field private final e:Lz/N;

.field private final f:Lz/N;

.field private final g:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(FFFFLz/N;Lz/N;F)V
    .locals 1

    const-string/jumbo v0, "contentPadding"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "contentPaddingIconOnly"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lw9/b;->a:F

    .line 4
    iput p2, p0, Lw9/b;->b:F

    .line 5
    iput p3, p0, Lw9/b;->c:F

    .line 6
    iput p4, p0, Lw9/b;->d:F

    .line 7
    iput-object p5, p0, Lw9/b;->e:Lz/N;

    .line 8
    iput-object p6, p0, Lw9/b;->f:Lz/N;

    .line 9
    iput p7, p0, Lw9/b;->g:F

    return-void
.end method

.method public synthetic constructor <init>(FFFFLz/N;Lz/N;FLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lw9/b;-><init>(FFFFLz/N;Lz/N;F)V

    return-void
.end method


# virtual methods
.method public final a()Lz/N;
    .locals 1

    iget-object v0, p0, Lw9/b;->e:Lz/N;

    return-object v0
.end method

.method public final b()Lz/N;
    .locals 1

    iget-object v0, p0, Lw9/b;->f:Lz/N;

    return-object v0
.end method

.method public final c()F
    .locals 1

    iget v0, p0, Lw9/b;->g:F

    return v0
.end method

.method public final d()F
    .locals 1

    iget v0, p0, Lw9/b;->c:F

    return v0
.end method

.method public final e()F
    .locals 1

    iget v0, p0, Lw9/b;->a:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lw9/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lw9/b;

    iget v1, p0, Lw9/b;->a:F

    iget v3, p1, Lw9/b;->a:F

    invoke-static {v1, v3}, LY0/h;->n(FF)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lw9/b;->b:F

    iget v3, p1, Lw9/b;->b:F

    invoke-static {v1, v3}, LY0/h;->n(FF)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lw9/b;->c:F

    iget v3, p1, Lw9/b;->c:F

    invoke-static {v1, v3}, LY0/h;->n(FF)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lw9/b;->d:F

    iget v3, p1, Lw9/b;->d:F

    invoke-static {v1, v3}, LY0/h;->n(FF)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lw9/b;->e:Lz/N;

    iget-object v3, p1, Lw9/b;->e:Lz/N;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lw9/b;->f:Lz/N;

    iget-object v3, p1, Lw9/b;->f:Lz/N;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lw9/b;->g:F

    iget p1, p1, Lw9/b;->g:F

    invoke-static {v1, p1}, LY0/h;->n(FF)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()F
    .locals 1

    iget v0, p0, Lw9/b;->d:F

    return v0
.end method

.method public final g()F
    .locals 1

    iget v0, p0, Lw9/b;->b:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lw9/b;->a:F

    invoke-static {v0}, LY0/h;->p(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lw9/b;->b:F

    invoke-static {v1}, LY0/h;->p(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lw9/b;->c:F

    invoke-static {v1}, LY0/h;->p(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lw9/b;->d:F

    invoke-static {v1}, LY0/h;->p(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lw9/b;->e:Lz/N;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lw9/b;->f:Lz/N;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lw9/b;->g:F

    invoke-static {v1}, LY0/h;->p(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget v0, p0, Lw9/b;->a:F

    invoke-static {v0}, LY0/h;->r(F)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lw9/b;->b:F

    invoke-static {v1}, LY0/h;->r(F)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lw9/b;->c:F

    invoke-static {v2}, LY0/h;->r(F)Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lw9/b;->d:F

    invoke-static {v3}, LY0/h;->r(F)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lw9/b;->e:Lz/N;

    iget-object v5, p0, Lw9/b;->f:Lz/N;

    iget v6, p0, Lw9/b;->g:F

    invoke-static {v6}, LY0/h;->r(F)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Dimens(heightMin="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", widthMin="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", cornerRadius="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", iconSize="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", contentPadding="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", contentPaddingIconOnly="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", contentSpacing="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
