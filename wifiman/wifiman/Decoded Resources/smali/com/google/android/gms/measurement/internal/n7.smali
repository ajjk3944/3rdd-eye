.class public final Lcom/google/android/gms/measurement/internal/n7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:Lcom/google/android/gms/internal/measurement/w2;

.field private c:Ljava/lang/String;

.field private d:Ljava/util/Map;

.field private e:Lcom/google/android/gms/measurement/internal/s5;

.field private f:J

.field private g:J

.field private h:I


# direct methods
.method private constructor <init>(JLcom/google/android/gms/internal/measurement/w2;Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/measurement/internal/s5;JJJI)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/google/android/gms/measurement/internal/n7;->a:J

    .line 4
    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/n7;->b:Lcom/google/android/gms/internal/measurement/w2;

    .line 5
    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/n7;->c:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/google/android/gms/measurement/internal/n7;->d:Ljava/util/Map;

    .line 7
    iput-object p6, p0, Lcom/google/android/gms/measurement/internal/n7;->e:Lcom/google/android/gms/measurement/internal/s5;

    .line 8
    iput-wide p9, p0, Lcom/google/android/gms/measurement/internal/n7;->f:J

    .line 9
    iput-wide p11, p0, Lcom/google/android/gms/measurement/internal/n7;->g:J

    .line 10
    iput p13, p0, Lcom/google/android/gms/measurement/internal/n7;->h:I

    return-void
.end method

.method synthetic constructor <init>(JLcom/google/android/gms/internal/measurement/w2;Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/measurement/internal/s5;JJJILcom/google/android/gms/measurement/internal/p7;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p13}, Lcom/google/android/gms/measurement/internal/n7;-><init>(JLcom/google/android/gms/internal/measurement/w2;Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/measurement/internal/s5;JJJI)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/measurement/internal/n7;->h:I

    return v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/n7;->g:J

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/measurement/internal/n7;->a:J

    return-wide v0
.end method

.method public final d()Lcom/google/android/gms/measurement/internal/s5;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/n7;->e:Lcom/google/android/gms/measurement/internal/s5;

    return-object v0
.end method

.method public final e()Lcom/google/android/gms/measurement/internal/N6;
    .locals 10

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/n7;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v5, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v9, Lcom/google/android/gms/measurement/internal/N6;

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/n7;->a:J

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/n7;->b:Lcom/google/android/gms/internal/measurement/w2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/N3;->i()[B

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/n7;->c:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/n7;->e:Lcom/google/android/gms/measurement/internal/s5;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/s5;->zza()I

    move-result v6

    iget-wide v7, p0, Lcom/google/android/gms/measurement/internal/n7;->f:J

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/measurement/internal/N6;-><init>(J[BLjava/lang/String;Landroid/os/Bundle;IJ)V

    return-object v9
.end method

.method public final f()Lcom/google/android/gms/measurement/internal/W6;
    .locals 4

    new-instance v0, Lcom/google/android/gms/measurement/internal/W6;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/n7;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/n7;->d:Ljava/util/Map;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/n7;->e:Lcom/google/android/gms/measurement/internal/s5;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/W6;-><init>(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/measurement/internal/s5;)V

    return-object v0
.end method

.method public final g()Lcom/google/android/gms/internal/measurement/w2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/n7;->b:Lcom/google/android/gms/internal/measurement/w2;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/n7;->c:Ljava/lang/String;

    return-object v0
.end method
