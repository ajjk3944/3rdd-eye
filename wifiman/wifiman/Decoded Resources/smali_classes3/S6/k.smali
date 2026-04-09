.class public final LS6/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS6/k$a;
    }
.end annotation


# static fields
.field private static final h:LS6/k$a;


# instance fields
.field private final a:Lf0/c;

.field private final b:Ljava/lang/String;

.field private final c:LC0/h;

.field private final d:Lm0/w0;

.field private final e:F

.field private final f:J

.field private final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LS6/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LS6/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LS6/k;->h:LS6/k$a;

    return-void
.end method

.method private constructor <init>(Lf0/c;Ljava/lang/String;LC0/h;Lm0/w0;FJLjava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "alignment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "contentScale"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "tag"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LS6/k;->a:Lf0/c;

    .line 4
    iput-object p2, p0, LS6/k;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, LS6/k;->c:LC0/h;

    .line 6
    iput-object p4, p0, LS6/k;->d:Lm0/w0;

    .line 7
    iput p5, p0, LS6/k;->e:F

    .line 8
    iput-wide p6, p0, LS6/k;->f:J

    .line 9
    iput-object p8, p0, LS6/k;->g:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lf0/c;Ljava/lang/String;LC0/h;Lm0/w0;FJLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    .line 10
    sget-object v0, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v0}, Lf0/c$a;->e()Lf0/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    and-int/lit8 v1, p9, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, v2

    goto :goto_1

    :cond_1
    move-object v1, p2

    :goto_1
    and-int/lit8 v3, p9, 0x4

    if-eqz v3, :cond_2

    .line 11
    sget-object v3, LC0/h;->a:LC0/h$a;

    invoke-virtual {v3}, LC0/h$a;->a()LC0/h;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, p3

    :goto_2
    and-int/lit8 v4, p9, 0x8

    if-eqz v4, :cond_3

    goto :goto_3

    :cond_3
    move-object v2, p4

    :goto_3
    and-int/lit8 v4, p9, 0x10

    if-eqz v4, :cond_4

    const/high16 v4, 0x3f800000    # 1.0f

    goto :goto_4

    :cond_4
    move v4, p5

    :goto_4
    and-int/lit8 v5, p9, 0x20

    if-eqz v5, :cond_5

    const/4 v5, -0x1

    .line 12
    invoke-static {v5, v5}, LY0/s;->a(II)J

    move-result-wide v5

    goto :goto_5

    :cond_5
    move-wide v5, p6

    :goto_5
    and-int/lit8 v7, p9, 0x40

    if-eqz v7, :cond_6

    .line 13
    const-string v7, ""

    goto :goto_6

    :cond_6
    move-object/from16 v7, p8

    :goto_6
    const/4 v8, 0x0

    move-object p1, p0

    move-object p2, v0

    move-object p3, v1

    move-object p4, v3

    move-object p5, v2

    move p6, v4

    move-wide/from16 p7, v5

    move-object/from16 p9, v7

    move-object/from16 p10, v8

    .line 14
    invoke-direct/range {p1 .. p10}, LS6/k;-><init>(Lf0/c;Ljava/lang/String;LC0/h;Lm0/w0;FJLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lf0/c;Ljava/lang/String;LC0/h;Lm0/w0;FJLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, LS6/k;-><init>(Lf0/c;Ljava/lang/String;LC0/h;Lm0/w0;FJLjava/lang/String;)V

    return-void
.end method

.method public static synthetic b(LS6/k;Lf0/c;Ljava/lang/String;LC0/h;Lm0/w0;FJLjava/lang/String;ILjava/lang/Object;)LS6/k;
    .locals 9

    move-object v0, p0

    and-int/lit8 v1, p9, 0x1

    if-eqz v1, :cond_0

    iget-object v1, v0, LS6/k;->a:Lf0/c;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, p9, 0x2

    if-eqz v2, :cond_1

    iget-object v2, v0, LS6/k;->b:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v2, p2

    :goto_1
    and-int/lit8 v3, p9, 0x4

    if-eqz v3, :cond_2

    iget-object v3, v0, LS6/k;->c:LC0/h;

    goto :goto_2

    :cond_2
    move-object v3, p3

    :goto_2
    and-int/lit8 v4, p9, 0x8

    if-eqz v4, :cond_3

    iget-object v4, v0, LS6/k;->d:Lm0/w0;

    goto :goto_3

    :cond_3
    move-object v4, p4

    :goto_3
    and-int/lit8 v5, p9, 0x10

    if-eqz v5, :cond_4

    iget v5, v0, LS6/k;->e:F

    goto :goto_4

    :cond_4
    move v5, p5

    :goto_4
    and-int/lit8 v6, p9, 0x20

    if-eqz v6, :cond_5

    iget-wide v6, v0, LS6/k;->f:J

    goto :goto_5

    :cond_5
    move-wide v6, p6

    :goto_5
    and-int/lit8 v8, p9, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, LS6/k;->g:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p8

    :goto_6
    move-object p1, v1

    move-object p2, v2

    move-object p3, v3

    move-object p4, v4

    move p5, v5

    move-wide p6, v6

    move-object/from16 p8, v8

    invoke-virtual/range {p0 .. p8}, LS6/k;->a(Lf0/c;Ljava/lang/String;LC0/h;Lm0/w0;FJLjava/lang/String;)LS6/k;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Lf0/c;Ljava/lang/String;LC0/h;Lm0/w0;FJLjava/lang/String;)LS6/k;
    .locals 11

    const-string/jumbo v0, "alignment"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "contentScale"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "tag"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LS6/k;

    const/4 v10, 0x0

    move-object v1, v0

    move-object v3, p2

    move-object v5, p4

    move/from16 v6, p5

    move-wide/from16 v7, p6

    invoke-direct/range {v1 .. v10}, LS6/k;-><init>(Lf0/c;Ljava/lang/String;LC0/h;Lm0/w0;FJLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final c()Lf0/c;
    .locals 1

    iget-object v0, p0, LS6/k;->a:Lf0/c;

    return-object v0
.end method

.method public final d()F
    .locals 1

    iget v0, p0, LS6/k;->e:F

    return v0
.end method

.method public final e()Lm0/w0;
    .locals 1

    iget-object v0, p0, LS6/k;->d:Lm0/w0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LS6/k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LS6/k;

    iget-object v1, p0, LS6/k;->a:Lf0/c;

    iget-object v3, p1, LS6/k;->a:Lf0/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LS6/k;->b:Ljava/lang/String;

    iget-object v3, p1, LS6/k;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LS6/k;->c:LC0/h;

    iget-object v3, p1, LS6/k;->c:LC0/h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LS6/k;->d:Lm0/w0;

    iget-object v3, p1, LS6/k;->d:Lm0/w0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, LS6/k;->e:F

    iget v3, p1, LS6/k;->e:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, LS6/k;->f:J

    iget-wide v5, p1, LS6/k;->f:J

    invoke-static {v3, v4, v5, v6}, LY0/r;->e(JJ)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, LS6/k;->g:Ljava/lang/String;

    iget-object p1, p1, LS6/k;->g:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LS6/k;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final g()LC0/h;
    .locals 1

    iget-object v0, p0, LS6/k;->c:LC0/h;

    return-object v0
.end method

.method public final h()J
    .locals 2

    iget-wide v0, p0, LS6/k;->f:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LS6/k;->a:Lf0/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LS6/k;->b:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LS6/k;->c:LC0/h;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LS6/k;->d:Lm0/w0;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LS6/k;->e:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS6/k;->f:J

    invoke-static {v1, v2}, LY0/r;->h(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LS6/k;->g:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LS6/k;->g:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "ImageOptions(alignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LS6/k;->a:Lf0/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", contentDescription="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LS6/k;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", contentScale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LS6/k;->c:LC0/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", colorFilter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LS6/k;->d:Lm0/w0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", alpha="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LS6/k;->e:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", requestSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LS6/k;->f:J

    invoke-static {v1, v2}, LY0/r;->i(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LS6/k;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
