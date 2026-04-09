.class public final Ll0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll0/k$a;
    }
.end annotation


# static fields
.field public static final i:Ll0/k$a;

.field private static final j:Ll0/k;


# instance fields
.field private final a:F

.field private final b:F

.field private final c:F

.field private final d:F

.field private final e:J

.field private final f:J

.field private final g:J

.field private final h:J


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Ll0/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll0/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ll0/k;->i:Ll0/k$a;

    sget-object v0, Ll0/a;->a:Ll0/a$a;

    invoke-virtual {v0}, Ll0/a$a;->a()J

    move-result-wide v5

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ll0/l;->d(FFFFJ)Ll0/k;

    move-result-object v0

    sput-object v0, Ll0/k;->j:Ll0/k;

    return-void
.end method

.method private constructor <init>(FFFFJJJJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Ll0/k;->a:F

    .line 4
    iput p2, p0, Ll0/k;->b:F

    .line 5
    iput p3, p0, Ll0/k;->c:F

    .line 6
    iput p4, p0, Ll0/k;->d:F

    .line 7
    iput-wide p5, p0, Ll0/k;->e:J

    .line 8
    iput-wide p7, p0, Ll0/k;->f:J

    .line 9
    iput-wide p9, p0, Ll0/k;->g:J

    .line 10
    iput-wide p11, p0, Ll0/k;->h:J

    return-void
.end method

.method public synthetic constructor <init>(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p12}, Ll0/k;-><init>(FFFFJJJJ)V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    iget v0, p0, Ll0/k;->d:F

    return v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Ll0/k;->h:J

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Ll0/k;->g:J

    return-wide v0
.end method

.method public final d()F
    .locals 2

    iget v0, p0, Ll0/k;->d:F

    iget v1, p0, Ll0/k;->b:F

    sub-float/2addr v0, v1

    return v0
.end method

.method public final e()F
    .locals 1

    iget v0, p0, Ll0/k;->a:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ll0/k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ll0/k;

    iget v1, p0, Ll0/k;->a:F

    iget v3, p1, Ll0/k;->a:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Ll0/k;->b:F

    iget v3, p1, Ll0/k;->b:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Ll0/k;->c:F

    iget v3, p1, Ll0/k;->c:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Ll0/k;->d:F

    iget v3, p1, Ll0/k;->d:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Ll0/k;->e:J

    iget-wide v5, p1, Ll0/k;->e:J

    invoke-static {v3, v4, v5, v6}, Ll0/a;->c(JJ)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Ll0/k;->f:J

    iget-wide v5, p1, Ll0/k;->f:J

    invoke-static {v3, v4, v5, v6}, Ll0/a;->c(JJ)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Ll0/k;->g:J

    iget-wide v5, p1, Ll0/k;->g:J

    invoke-static {v3, v4, v5, v6}, Ll0/a;->c(JJ)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Ll0/k;->h:J

    iget-wide v5, p1, Ll0/k;->h:J

    invoke-static {v3, v4, v5, v6}, Ll0/a;->c(JJ)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final f()F
    .locals 1

    iget v0, p0, Ll0/k;->c:F

    return v0
.end method

.method public final g()F
    .locals 1

    iget v0, p0, Ll0/k;->b:F

    return v0
.end method

.method public final h()J
    .locals 2

    iget-wide v0, p0, Ll0/k;->e:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Ll0/k;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll0/k;->b:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll0/k;->c:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll0/k;->d:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Ll0/k;->e:J

    invoke-static {v1, v2}, Ll0/a;->f(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Ll0/k;->f:J

    invoke-static {v1, v2}, Ll0/a;->f(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Ll0/k;->g:J

    invoke-static {v1, v2}, Ll0/a;->f(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Ll0/k;->h:J

    invoke-static {v1, v2}, Ll0/a;->f(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()J
    .locals 2

    iget-wide v0, p0, Ll0/k;->f:J

    return-wide v0
.end method

.method public final j()F
    .locals 2

    iget v0, p0, Ll0/k;->c:F

    iget v1, p0, Ll0/k;->a:F

    sub-float/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-wide v0, p0, Ll0/k;->e:J

    iget-wide v2, p0, Ll0/k;->f:J

    iget-wide v4, p0, Ll0/k;->g:J

    iget-wide v6, p0, Ll0/k;->h:J

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget v9, p0, Ll0/k;->a:F

    const/4 v10, 0x1

    invoke-static {v9, v10}, Ll0/c;->a(FI)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, ", "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v11, p0, Ll0/k;->b:F

    invoke-static {v11, v10}, Ll0/c;->a(FI)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v11, p0, Ll0/k;->c:F

    invoke-static {v11, v10}, Ll0/c;->a(FI)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v9, p0, Ll0/k;->d:F

    invoke-static {v9, v10}, Ll0/c;->a(FI)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v0, v1, v2, v3}, Ll0/a;->c(JJ)Z

    move-result v9

    const/16 v11, 0x29

    const-string v12, "RoundRect(rect="

    if-eqz v9, :cond_1

    invoke-static {v2, v3, v4, v5}, Ll0/a;->c(JJ)Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-static {v4, v5, v6, v7}, Ll0/a;->c(JJ)Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-static {v0, v1}, Ll0/a;->d(J)F

    move-result v2

    invoke-static {v0, v1}, Ll0/a;->e(J)F

    move-result v3

    cmpg-float v2, v2, v3

    if-nez v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", radius="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0, v1}, Ll0/a;->d(J)F

    move-result v0

    invoke-static {v0, v10}, Ll0/c;->a(FI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", x="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0, v1}, Ll0/a;->d(J)F

    move-result v3

    invoke-static {v3, v10}, Ll0/c;->a(FI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", y="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0, v1}, Ll0/a;->e(J)F

    move-result v0

    invoke-static {v0, v10}, Ll0/c;->a(FI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ", topLeft="

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0, v1}, Ll0/a;->g(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", topRight="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2, v3}, Ll0/a;->g(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bottomRight="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4, v5}, Ll0/a;->g(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bottomLeft="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v6, v7}, Ll0/a;->g(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
