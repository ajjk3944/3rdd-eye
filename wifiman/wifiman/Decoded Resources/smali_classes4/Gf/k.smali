.class public final LGf/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:J

.field private final b:Ls9/d;

.field private final c:Z

.field private final d:Z

.field private final e:Ljava/util/List;

.field private final f:Ljava/util/List;

.field private final g:Ls9/d;

.field private final h:LS8/c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(JLs9/d;ZZLjava/util/List;Ljava/util/List;Ls9/d;LS8/c;)V
    .locals 1

    const-string v0, "ssid"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channels"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labels"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signal"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, LGf/k;->a:J

    .line 4
    iput-object p3, p0, LGf/k;->b:Ls9/d;

    .line 5
    iput-boolean p4, p0, LGf/k;->c:Z

    .line 6
    iput-boolean p5, p0, LGf/k;->d:Z

    .line 7
    iput-object p6, p0, LGf/k;->e:Ljava/util/List;

    .line 8
    iput-object p7, p0, LGf/k;->f:Ljava/util/List;

    .line 9
    iput-object p8, p0, LGf/k;->g:Ls9/d;

    .line 10
    iput-object p9, p0, LGf/k;->h:LS8/c;

    return-void
.end method

.method public synthetic constructor <init>(JLs9/d;ZZLjava/util/List;Ljava/util/List;Ls9/d;LS8/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p9}, LGf/k;-><init>(JLs9/d;ZZLjava/util/List;Ljava/util/List;Ls9/d;LS8/c;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LGf/k;->e:Ljava/util/List;

    return-object v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, LGf/k;->a:J

    return-wide v0
.end method

.method public final c()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LGf/k;->f:Ljava/util/List;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, LGf/k;->c:Z

    return v0
.end method

.method public final e()Ls9/d;
    .locals 1

    iget-object v0, p0, LGf/k;->g:Ls9/d;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LGf/k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LGf/k;

    iget-wide v3, p0, LGf/k;->a:J

    iget-wide v5, p1, LGf/k;->a:J

    invoke-static {v3, v4, v5, v6}, Lm0/v0;->m(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LGf/k;->b:Ls9/d;

    iget-object v3, p1, LGf/k;->b:Ls9/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, LGf/k;->c:Z

    iget-boolean v3, p1, LGf/k;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, LGf/k;->d:Z

    iget-boolean v3, p1, LGf/k;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, LGf/k;->e:Ljava/util/List;

    iget-object v3, p1, LGf/k;->e:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, LGf/k;->f:Ljava/util/List;

    iget-object v3, p1, LGf/k;->f:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, LGf/k;->g:Ls9/d;

    iget-object v3, p1, LGf/k;->g:Ls9/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, LGf/k;->h:LS8/c;

    iget-object p1, p1, LGf/k;->h:LS8/c;

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final f()Ls9/d;
    .locals 1

    iget-object v0, p0, LGf/k;->b:Ls9/d;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, LGf/k;->d:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, LGf/k;->a:J

    invoke-static {v0, v1}, Lm0/v0;->s(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LGf/k;->b:Ls9/d;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LGf/k;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LGf/k;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LGf/k;->e:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LGf/k;->f:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LGf/k;->g:Ls9/d;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LGf/k;->h:LS8/c;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-wide v0, p0, LGf/k;->a:J

    invoke-static {v0, v1}, Lm0/v0;->t(J)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LGf/k;->b:Ls9/d;

    iget-boolean v2, p0, LGf/k;->c:Z

    iget-boolean v3, p0, LGf/k;->d:Z

    iget-object v4, p0, LGf/k;->e:Ljava/util/List;

    iget-object v5, p0, LGf/k;->f:Ljava/util/List;

    iget-object v6, p0, LGf/k;->g:Ls9/d;

    iget-object v7, p0, LGf/k;->h:LS8/c;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Model(dotColor="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", ssid="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", linked="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", unknownSSID="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", channels="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", labels="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", signal="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", band="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
