.class public final Lm0/N0;
.super Lm0/e1;
.source "SourceFile"


# instance fields
.field private final e:Ljava/util/List;

.field private final f:Ljava/util/List;

.field private final g:J

.field private final h:J

.field private final i:I


# direct methods
.method private constructor <init>(Ljava/util/List;Ljava/util/List;JJI)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lm0/e1;-><init>()V

    .line 3
    iput-object p1, p0, Lm0/N0;->e:Ljava/util/List;

    .line 4
    iput-object p2, p0, Lm0/N0;->f:Ljava/util/List;

    .line 5
    iput-wide p3, p0, Lm0/N0;->g:J

    .line 6
    iput-wide p5, p0, Lm0/N0;->h:J

    .line 7
    iput p7, p0, Lm0/N0;->i:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lm0/N0;-><init>(Ljava/util/List;Ljava/util/List;JJI)V

    return-void
.end method


# virtual methods
.method public b(J)Landroid/graphics/Shader;
    .locals 11

    iget-wide v0, p0, Lm0/N0;->g:J

    invoke-static {v0, v1}, Ll0/g;->m(J)F

    move-result v0

    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-static {p1, p2}, Ll0/m;->i(J)F

    move-result v0

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lm0/N0;->g:J

    invoke-static {v2, v3}, Ll0/g;->m(J)F

    move-result v0

    :goto_0
    iget-wide v2, p0, Lm0/N0;->g:J

    invoke-static {v2, v3}, Ll0/g;->n(J)F

    move-result v2

    cmpg-float v2, v2, v1

    if-nez v2, :cond_1

    invoke-static {p1, p2}, Ll0/m;->g(J)F

    move-result v2

    goto :goto_1

    :cond_1
    iget-wide v2, p0, Lm0/N0;->g:J

    invoke-static {v2, v3}, Ll0/g;->n(J)F

    move-result v2

    :goto_1
    iget-wide v3, p0, Lm0/N0;->h:J

    invoke-static {v3, v4}, Ll0/g;->m(J)F

    move-result v3

    cmpg-float v3, v3, v1

    if-nez v3, :cond_2

    invoke-static {p1, p2}, Ll0/m;->i(J)F

    move-result v3

    goto :goto_2

    :cond_2
    iget-wide v3, p0, Lm0/N0;->h:J

    invoke-static {v3, v4}, Ll0/g;->m(J)F

    move-result v3

    :goto_2
    iget-wide v4, p0, Lm0/N0;->h:J

    invoke-static {v4, v5}, Ll0/g;->n(J)F

    move-result v4

    cmpg-float v1, v4, v1

    if-nez v1, :cond_3

    invoke-static {p1, p2}, Ll0/m;->g(J)F

    move-result p1

    goto :goto_3

    :cond_3
    iget-wide p1, p0, Lm0/N0;->h:J

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    :goto_3
    iget-object v8, p0, Lm0/N0;->e:Ljava/util/List;

    iget-object v9, p0, Lm0/N0;->f:Ljava/util/List;

    invoke-static {v0, v2}, Ll0/h;->a(FF)J

    move-result-wide v4

    invoke-static {v3, p1}, Ll0/h;->a(FF)J

    move-result-wide v6

    iget v10, p0, Lm0/N0;->i:I

    invoke-static/range {v4 .. v10}, Lm0/f1;->a(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm0/N0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Lm0/N0;->e:Ljava/util/List;

    check-cast p1, Lm0/N0;

    iget-object v3, p1, Lm0/N0;->e:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lm0/N0;->f:Ljava/util/List;

    iget-object v3, p1, Lm0/N0;->f:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lm0/N0;->g:J

    iget-wide v5, p1, Lm0/N0;->g:J

    invoke-static {v3, v4, v5, v6}, Ll0/g;->j(JJ)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lm0/N0;->h:J

    iget-wide v5, p1, Lm0/N0;->h:J

    invoke-static {v3, v4, v5, v6}, Ll0/g;->j(JJ)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lm0/N0;->i:I

    iget p1, p1, Lm0/N0;->i:I

    invoke-static {v1, p1}, Lm0/m1;->f(II)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lm0/N0;->e:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lm0/N0;->f:Ljava/util/List;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lm0/N0;->g:J

    invoke-static {v1, v2}, Ll0/g;->o(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lm0/N0;->h:J

    invoke-static {v1, v2}, Ll0/g;->o(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lm0/N0;->i:I

    invoke-static {v1}, Lm0/m1;->g(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-wide v0, p0, Lm0/N0;->g:J

    invoke-static {v0, v1}, Ll0/h;->b(J)Z

    move-result v0

    const-string v1, ""

    const-string v2, ", "

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "start="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p0, Lm0/N0;->g:J

    invoke-static {v3, v4}, Ll0/g;->t(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-wide v3, p0, Lm0/N0;->h:J

    invoke-static {v3, v4}, Ll0/h;->b(J)Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "end="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p0, Lm0/N0;->h:J

    invoke-static {v3, v4}, Ll0/g;->t(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "LinearGradient(colors="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lm0/N0;->e:Ljava/util/List;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", stops="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lm0/N0;->f:Ljava/util/List;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "tileMode="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lm0/N0;->i:I

    invoke-static {v0}, Lm0/m1;->h(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
