.class public final Ls0/m;
.super Ls0/o;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lnh/a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:F

.field private final c:F

.field private final d:F

.field private final e:F

.field private final f:F

.field private final g:F

.field private final h:F

.field private final i:Ljava/util/List;

.field private final j:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ls0/o;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Ls0/m;->a:Ljava/lang/String;

    iput p2, p0, Ls0/m;->b:F

    iput p3, p0, Ls0/m;->c:F

    iput p4, p0, Ls0/m;->d:F

    iput p5, p0, Ls0/m;->e:F

    iput p6, p0, Ls0/m;->f:F

    iput p7, p0, Ls0/m;->g:F

    iput p8, p0, Ls0/m;->h:F

    iput-object p9, p0, Ls0/m;->i:Ljava/util/List;

    iput-object p10, p0, Ls0/m;->j:Ljava/util/List;

    return-void
.end method

.method public static final synthetic b(Ls0/m;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Ls0/m;->j:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public final e(I)Ls0/o;
    .locals 1

    iget-object v0, p0, Ls0/m;->j:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls0/o;

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_5

    instance-of v2, p1, Ls0/m;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Ls0/m;->a:Ljava/lang/String;

    check-cast p1, Ls0/m;

    iget-object v3, p1, Ls0/m;->a:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget v2, p0, Ls0/m;->b:F

    iget v3, p1, Ls0/m;->b:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_5

    iget v2, p0, Ls0/m;->c:F

    iget v3, p1, Ls0/m;->c:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_5

    iget v2, p0, Ls0/m;->d:F

    iget v3, p1, Ls0/m;->d:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_5

    iget v2, p0, Ls0/m;->e:F

    iget v3, p1, Ls0/m;->e:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_5

    iget v2, p0, Ls0/m;->f:F

    iget v3, p1, Ls0/m;->f:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_5

    iget v2, p0, Ls0/m;->g:F

    iget v3, p1, Ls0/m;->g:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_5

    iget v2, p0, Ls0/m;->h:F

    iget v3, p1, Ls0/m;->h:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_5

    iget-object v2, p0, Ls0/m;->i:Ljava/util/List;

    iget-object v3, p1, Ls0/m;->i:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Ls0/m;->j:Ljava/util/List;

    iget-object p1, p1, Ls0/m;->j:Ljava/util/List;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v0

    :cond_5
    :goto_0
    return v1
.end method

.method public final f()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ls0/m;->i:Ljava/util/List;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls0/m;->a:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Ls0/m;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls0/m;->b:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls0/m;->c:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls0/m;->d:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls0/m;->e:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls0/m;->f:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls0/m;->g:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls0/m;->h:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls0/m;->i:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls0/m;->j:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()F
    .locals 1

    iget v0, p0, Ls0/m;->c:F

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Ls0/m$a;

    invoke-direct {v0, p0}, Ls0/m$a;-><init>(Ls0/m;)V

    return-object v0
.end method

.method public final j()F
    .locals 1

    iget v0, p0, Ls0/m;->d:F

    return v0
.end method

.method public final k()F
    .locals 1

    iget v0, p0, Ls0/m;->b:F

    return v0
.end method

.method public final q()F
    .locals 1

    iget v0, p0, Ls0/m;->e:F

    return v0
.end method

.method public final s()F
    .locals 1

    iget v0, p0, Ls0/m;->f:F

    return v0
.end method

.method public final u()I
    .locals 1

    iget-object v0, p0, Ls0/m;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final v()F
    .locals 1

    iget v0, p0, Ls0/m;->g:F

    return v0
.end method

.method public final w()F
    .locals 1

    iget v0, p0, Ls0/m;->h:F

    return v0
.end method
