.class public final LI9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:J

.field private final b:J

.field private final c:J

.field private final d:J

.field private final e:J

.field private final f:J

.field private final g:J

.field private final h:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(JJJJJJJJ)V
    .locals 3

    move-object v0, p0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-wide v1, p1

    .line 3
    iput-wide v1, v0, LI9/e;->a:J

    move-wide v1, p3

    .line 4
    iput-wide v1, v0, LI9/e;->b:J

    move-wide v1, p5

    .line 5
    iput-wide v1, v0, LI9/e;->c:J

    move-wide v1, p7

    .line 6
    iput-wide v1, v0, LI9/e;->d:J

    move-wide v1, p9

    .line 7
    iput-wide v1, v0, LI9/e;->e:J

    move-wide v1, p11

    .line 8
    iput-wide v1, v0, LI9/e;->f:J

    move-wide/from16 v1, p13

    .line 9
    iput-wide v1, v0, LI9/e;->g:J

    move-wide/from16 v1, p15

    .line 10
    iput-wide v1, v0, LI9/e;->h:J

    return-void
.end method

.method public synthetic constructor <init>(JJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p16}, LI9/e;-><init>(JJJJJJJJ)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, LI9/e;->a:J

    return-wide v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, LI9/e;->e:J

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, LI9/e;->b:J

    return-wide v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, LI9/e;->f:J

    return-wide v0
.end method

.method public final e()J
    .locals 2

    iget-wide v0, p0, LI9/e;->d:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LI9/e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LI9/e;

    iget-wide v3, p0, LI9/e;->a:J

    iget-wide v5, p1, LI9/e;->a:J

    invoke-static {v3, v4, v5, v6}, Lm0/v0;->m(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, LI9/e;->b:J

    iget-wide v5, p1, LI9/e;->b:J

    invoke-static {v3, v4, v5, v6}, Lm0/v0;->m(JJ)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, LI9/e;->c:J

    iget-wide v5, p1, LI9/e;->c:J

    invoke-static {v3, v4, v5, v6}, Lm0/v0;->m(JJ)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, LI9/e;->d:J

    iget-wide v5, p1, LI9/e;->d:J

    invoke-static {v3, v4, v5, v6}, Lm0/v0;->m(JJ)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, LI9/e;->e:J

    iget-wide v5, p1, LI9/e;->e:J

    invoke-static {v3, v4, v5, v6}, Lm0/v0;->m(JJ)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, LI9/e;->f:J

    iget-wide v5, p1, LI9/e;->f:J

    invoke-static {v3, v4, v5, v6}, Lm0/v0;->m(JJ)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, LI9/e;->g:J

    iget-wide v5, p1, LI9/e;->g:J

    invoke-static {v3, v4, v5, v6}, Lm0/v0;->m(JJ)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, LI9/e;->h:J

    iget-wide v5, p1, LI9/e;->h:J

    invoke-static {v3, v4, v5, v6}, Lm0/v0;->m(JJ)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final f()J
    .locals 2

    iget-wide v0, p0, LI9/e;->h:J

    return-wide v0
.end method

.method public final g()J
    .locals 2

    iget-wide v0, p0, LI9/e;->c:J

    return-wide v0
.end method

.method public final h()J
    .locals 2

    iget-wide v0, p0, LI9/e;->g:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, LI9/e;->a:J

    invoke-static {v0, v1}, Lm0/v0;->s(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LI9/e;->b:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LI9/e;->c:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LI9/e;->d:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LI9/e;->e:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LI9/e;->f:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LI9/e;->g:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LI9/e;->h:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-wide v0, p0, LI9/e;->a:J

    invoke-static {v0, v1}, Lm0/v0;->t(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, LI9/e;->b:J

    invoke-static {v1, v2}, Lm0/v0;->t(J)Ljava/lang/String;

    move-result-object v1

    iget-wide v2, p0, LI9/e;->c:J

    invoke-static {v2, v3}, Lm0/v0;->t(J)Ljava/lang/String;

    move-result-object v2

    iget-wide v3, p0, LI9/e;->d:J

    invoke-static {v3, v4}, Lm0/v0;->t(J)Ljava/lang/String;

    move-result-object v3

    iget-wide v4, p0, LI9/e;->e:J

    invoke-static {v4, v5}, Lm0/v0;->t(J)Ljava/lang/String;

    move-result-object v4

    iget-wide v5, p0, LI9/e;->f:J

    invoke-static {v5, v6}, Lm0/v0;->t(J)Ljava/lang/String;

    move-result-object v5

    iget-wide v6, p0, LI9/e;->g:J

    invoke-static {v6, v7}, Lm0/v0;->t(J)Ljava/lang/String;

    move-result-object v6

    iget-wide v7, p0, LI9/e;->h:J

    invoke-static {v7, v8}, Lm0/v0;->t(J)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Colors(checkedThumbColor="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", disabledCheckedThumbColor="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", uncheckedThumbColor="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", disabledUncheckedThumbColor="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", checkedTrackColor="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", disabledCheckedTrackColor="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", uncheckedTrackColor="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", disabledUncheckedTrackColor="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
