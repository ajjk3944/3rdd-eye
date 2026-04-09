.class final Lcom/google/android/gms/internal/measurement/F5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field private a:I

.field private b:Z

.field private c:Ljava/util/Iterator;

.field private final synthetic d:Lcom/google/android/gms/internal/measurement/y5;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/measurement/y5;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/F5;->d:Lcom/google/android/gms/internal/measurement/y5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    .line 3
    iput p1, p0, Lcom/google/android/gms/internal/measurement/F5;->a:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/y5;Lcom/google/android/gms/internal/measurement/G5;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/F5;-><init>(Lcom/google/android/gms/internal/measurement/y5;)V

    return-void
.end method

.method private final a()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/F5;->c:Ljava/util/Iterator;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/F5;->d:Lcom/google/android/gms/internal/measurement/y5;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/y5;->k(Lcom/google/android/gms/internal/measurement/y5;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/F5;->c:Ljava/util/Iterator;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/F5;->c:Ljava/util/Iterator;

    return-object v0
.end method


# virtual methods
.method public final hasNext()Z
    .locals 3

    iget v0, p0, Lcom/google/android/gms/internal/measurement/F5;->a:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/F5;->d:Lcom/google/android/gms/internal/measurement/y5;

    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/y5;->d(Lcom/google/android/gms/internal/measurement/y5;)I

    move-result v2

    if-lt v0, v2, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/F5;->d:Lcom/google/android/gms/internal/measurement/y5;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/y5;->k(Lcom/google/android/gms/internal/measurement/y5;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/F5;->a()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    return v1
.end method

.method public final synthetic next()Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/F5;->b:Z

    iget v1, p0, Lcom/google/android/gms/internal/measurement/F5;->a:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/google/android/gms/internal/measurement/F5;->a:I

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/F5;->d:Lcom/google/android/gms/internal/measurement/y5;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/y5;->d(Lcom/google/android/gms/internal/measurement/y5;)I

    move-result v0

    if-ge v1, v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/F5;->d:Lcom/google/android/gms/internal/measurement/y5;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/y5;->s(Lcom/google/android/gms/internal/measurement/y5;)[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/measurement/F5;->a:I

    aget-object v0, v0, v1

    check-cast v0, Lcom/google/android/gms/internal/measurement/C5;

    return-object v0

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/F5;->a()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0
.end method

.method public final remove()V
    .locals 3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/F5;->b:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/F5;->b:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/F5;->d:Lcom/google/android/gms/internal/measurement/y5;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/y5;->q(Lcom/google/android/gms/internal/measurement/y5;)V

    iget v0, p0, Lcom/google/android/gms/internal/measurement/F5;->a:I

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/F5;->d:Lcom/google/android/gms/internal/measurement/y5;

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/y5;->d(Lcom/google/android/gms/internal/measurement/y5;)I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/F5;->d:Lcom/google/android/gms/internal/measurement/y5;

    iget v1, p0, Lcom/google/android/gms/internal/measurement/F5;->a:I

    add-int/lit8 v2, v1, -0x1

    iput v2, p0, Lcom/google/android/gms/internal/measurement/F5;->a:I

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/y5;->f(Lcom/google/android/gms/internal/measurement/y5;I)Ljava/lang/Object;

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/F5;->a()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "remove() was called before next()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
