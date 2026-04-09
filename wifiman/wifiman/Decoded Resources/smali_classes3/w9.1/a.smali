.class public final Lw9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:J

.field private final b:J

.field private final c:J

.field private final d:J

.field private final e:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(JJJJJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lw9/a;->a:J

    .line 4
    iput-wide p3, p0, Lw9/a;->b:J

    .line 5
    iput-wide p5, p0, Lw9/a;->c:J

    .line 6
    iput-wide p7, p0, Lw9/a;->d:J

    .line 7
    iput-wide p9, p0, Lw9/a;->e:J

    return-void
.end method

.method public synthetic constructor <init>(JJJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    and-int/lit8 v0, p11, 0x4

    if-eqz v0, :cond_0

    move-wide/from16 v6, p3

    goto :goto_0

    :cond_0
    move-wide/from16 v6, p5

    :goto_0
    const/4 v12, 0x0

    move-object v1, p0

    move-wide v2, p1

    move-wide/from16 v4, p3

    move-wide/from16 v8, p7

    move-wide/from16 v10, p9

    .line 8
    invoke-direct/range {v1 .. v12}, Lw9/a;-><init>(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p10}, Lw9/a;-><init>(JJJJJ)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Lw9/a;->a:J

    return-wide v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lw9/a;->b:J

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lw9/a;->d:J

    return-wide v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, Lw9/a;->e:J

    return-wide v0
.end method

.method public final e()J
    .locals 2

    iget-wide v0, p0, Lw9/a;->c:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lw9/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lw9/a;

    iget-wide v3, p0, Lw9/a;->a:J

    iget-wide v5, p1, Lw9/a;->a:J

    invoke-static {v3, v4, v5, v6}, Lm0/v0;->m(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lw9/a;->b:J

    iget-wide v5, p1, Lw9/a;->b:J

    invoke-static {v3, v4, v5, v6}, Lm0/v0;->m(JJ)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lw9/a;->c:J

    iget-wide v5, p1, Lw9/a;->c:J

    invoke-static {v3, v4, v5, v6}, Lm0/v0;->m(JJ)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lw9/a;->d:J

    iget-wide v5, p1, Lw9/a;->d:J

    invoke-static {v3, v4, v5, v6}, Lm0/v0;->m(JJ)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lw9/a;->e:J

    iget-wide v5, p1, Lw9/a;->e:J

    invoke-static {v3, v4, v5, v6}, Lm0/v0;->m(JJ)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lw9/a;->a:J

    invoke-static {v0, v1}, Lm0/v0;->s(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lw9/a;->b:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lw9/a;->c:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lw9/a;->d:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lw9/a;->e:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-wide v0, p0, Lw9/a;->a:J

    invoke-static {v0, v1}, Lm0/v0;->t(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Lw9/a;->b:J

    invoke-static {v1, v2}, Lm0/v0;->t(J)Ljava/lang/String;

    move-result-object v1

    iget-wide v2, p0, Lw9/a;->c:J

    invoke-static {v2, v3}, Lm0/v0;->t(J)Ljava/lang/String;

    move-result-object v2

    iget-wide v3, p0, Lw9/a;->d:J

    invoke-static {v3, v4}, Lm0/v0;->t(J)Ljava/lang/String;

    move-result-object v3

    iget-wide v4, p0, Lw9/a;->e:J

    invoke-static {v4, v5}, Lm0/v0;->t(J)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Colors(backgroundColor="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", contentColor="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", iconTint="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", disabledBackgroundColor="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", disabledContentColor="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
