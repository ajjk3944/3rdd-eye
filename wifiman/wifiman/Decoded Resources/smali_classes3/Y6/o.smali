.class public abstract LY6/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# instance fields
.field a:I

.field b:[I

.field c:[Ljava/lang/String;

.field d:[I

.field e:Ljava/lang/String;

.field f:Z

.field g:Z

.field h:Z

.field i:I


# direct methods
.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LY6/o;->a:I

    const/16 v0, 0x20

    new-array v1, v0, [I

    iput-object v1, p0, LY6/o;->b:[I

    new-array v1, v0, [Ljava/lang/String;

    iput-object v1, p0, LY6/o;->c:[Ljava/lang/String;

    new-array v0, v0, [I

    iput-object v0, p0, LY6/o;->d:[I

    const/4 v0, -0x1

    iput v0, p0, LY6/o;->i:I

    return-void
.end method

.method public static S(Lej/f;)LY6/o;
    .locals 1

    new-instance v0, LY6/n;

    invoke-direct {v0, p0}, LY6/n;-><init>(Lej/f;)V

    return-object v0
.end method


# virtual methods
.method public final C()Z
    .locals 1

    iget-boolean v0, p0, LY6/o;->f:Z

    return v0
.end method

.method public abstract J(Ljava/lang/String;)LY6/o;
.end method

.method public abstract P()LY6/o;
.end method

.method final T()I
    .locals 2

    iget v0, p0, LY6/o;->a:I

    if-eqz v0, :cond_0

    iget-object v1, p0, LY6/o;->b:[I

    add-int/lit8 v0, v0, -0x1

    aget v0, v1, v0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "JsonWriter is closed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final Y()V
    .locals 2

    invoke-virtual {p0}, LY6/o;->T()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "Nesting problem."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LY6/o;->h:Z

    return-void
.end method

.method public abstract a()LY6/o;
.end method

.method final b0(I)V
    .locals 3

    iget-object v0, p0, LY6/o;->b:[I

    iget v1, p0, LY6/o;->a:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, LY6/o;->a:I

    aput p1, v0, v1

    return-void
.end method

.method final d0(I)V
    .locals 2

    iget-object v0, p0, LY6/o;->b:[I

    iget v1, p0, LY6/o;->a:I

    add-int/lit8 v1, v1, -0x1

    aput p1, v0, v1

    return-void
.end method

.method public final f0(Z)V
    .locals 0

    iput-boolean p1, p0, LY6/o;->f:Z

    return-void
.end method

.method public final g()I
    .locals 2

    invoke-virtual {p0}, LY6/o;->T()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "Nesting problem."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget v0, p0, LY6/o;->i:I

    iget v1, p0, LY6/o;->a:I

    iput v1, p0, LY6/o;->i:I

    return v0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 4

    iget v0, p0, LY6/o;->a:I

    iget-object v1, p0, LY6/o;->b:[I

    iget-object v2, p0, LY6/o;->c:[Ljava/lang/String;

    iget-object v3, p0, LY6/o;->d:[I

    invoke-static {v0, v1, v2, v3}, LY6/l;->a(I[I[Ljava/lang/String;[I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract h()LY6/o;
.end method

.method final j()Z
    .locals 3

    iget v0, p0, LY6/o;->a:I

    iget-object v1, p0, LY6/o;->b:[I

    array-length v2, v1

    if-eq v0, v2, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/16 v2, 0x100

    if-eq v0, v2, :cond_1

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, LY6/o;->b:[I

    iget-object v0, p0, LY6/o;->c:[Ljava/lang/String;

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, LY6/o;->c:[Ljava/lang/String;

    iget-object v0, p0, LY6/o;->d:[I

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, LY6/o;->d:[I

    const/4 v0, 0x1

    return v0

    :cond_1
    new-instance v0, Lcom/squareup/moshi/JsonDataException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Nesting too deep at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LY6/o;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": circular reference?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/squareup/moshi/JsonDataException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final m0(Z)V
    .locals 0

    iput-boolean p1, p0, LY6/o;->g:Z

    return-void
.end method

.method public abstract n0(D)LY6/o;
.end method

.method public abstract o0(J)LY6/o;
.end method

.method public abstract p()LY6/o;
.end method

.method public final p0(Lej/g;)LY6/o;
    .locals 2

    iget-boolean v0, p0, LY6/o;->h:Z

    if-nez v0, :cond_2

    invoke-virtual {p0}, LY6/o;->t0()Lej/f;

    move-result-object v0

    :try_start_0
    invoke-interface {p1, v0}, Lej/g;->q(Lej/B;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lej/B;->close()V

    :cond_0
    return-object p0

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_1

    :try_start_1
    invoke-interface {v0}, Lej/B;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BufferedSource cannot be used as a map key in JSON at path "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LY6/o;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract q0(Ljava/lang/Number;)LY6/o;
.end method

.method public abstract r0(Ljava/lang/String;)LY6/o;
.end method

.method public final s(I)V
    .locals 0

    iput p1, p0, LY6/o;->i:I

    return-void
.end method

.method public abstract s0(Z)LY6/o;
.end method

.method public abstract t0()Lej/f;
.end method

.method public abstract v()LY6/o;
.end method

.method public final y()Z
    .locals 1

    iget-boolean v0, p0, LY6/o;->g:Z

    return v0
.end method
