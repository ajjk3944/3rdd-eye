.class public abstract LY6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY6/k$c;,
        LY6/k$b;
    }
.end annotation


# instance fields
.field a:I

.field b:[I

.field c:[Ljava/lang/String;

.field d:[I

.field e:Z

.field f:Z


# direct methods
.method constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x20

    .line 2
    new-array v1, v0, [I

    iput-object v1, p0, LY6/k;->b:[I

    .line 3
    new-array v1, v0, [Ljava/lang/String;

    iput-object v1, p0, LY6/k;->c:[Ljava/lang/String;

    .line 4
    new-array v0, v0, [I

    iput-object v0, p0, LY6/k;->d:[I

    return-void
.end method

.method constructor <init>(LY6/k;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iget v0, p1, LY6/k;->a:I

    iput v0, p0, LY6/k;->a:I

    .line 7
    iget-object v0, p1, LY6/k;->b:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iput-object v0, p0, LY6/k;->b:[I

    .line 8
    iget-object v0, p1, LY6/k;->c:[Ljava/lang/String;

    invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, LY6/k;->c:[Ljava/lang/String;

    .line 9
    iget-object v0, p1, LY6/k;->d:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iput-object v0, p0, LY6/k;->d:[I

    .line 10
    iget-boolean v0, p1, LY6/k;->e:Z

    iput-boolean v0, p0, LY6/k;->e:Z

    .line 11
    iget-boolean p1, p1, LY6/k;->f:Z

    iput-boolean p1, p0, LY6/k;->f:Z

    return-void
.end method

.method public static b0(Lej/g;)LY6/k;
    .locals 1

    new-instance v0, LY6/m;

    invoke-direct {v0, p0}, LY6/m;-><init>(Lej/g;)V

    return-object v0
.end method


# virtual methods
.method public abstract C()D
.end method

.method public abstract J()I
.end method

.method public abstract P()J
.end method

.method public abstract S()Ljava/lang/String;
.end method

.method public abstract T()Ljava/lang/Object;
.end method

.method public abstract Y()Ljava/lang/String;
.end method

.method public abstract a()V
.end method

.method public abstract d0()LY6/k$c;
.end method

.method public abstract f0()LY6/k;
.end method

.method public abstract g()V
.end method

.method public final getPath()Ljava/lang/String;
    .locals 4

    iget v0, p0, LY6/k;->a:I

    iget-object v1, p0, LY6/k;->b:[I

    iget-object v2, p0, LY6/k;->c:[Ljava/lang/String;

    iget-object v3, p0, LY6/k;->d:[I

    invoke-static {v0, v1, v2, v3}, LY6/l;->a(I[I[Ljava/lang/String;[I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract h()V
.end method

.method public abstract j()V
.end method

.method public abstract m0()V
.end method

.method final n0(I)V
    .locals 3

    iget v0, p0, LY6/k;->a:I

    iget-object v1, p0, LY6/k;->b:[I

    array-length v2, v1

    if-ne v0, v2, :cond_1

    const/16 v2, 0x100

    if-eq v0, v2, :cond_0

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, LY6/k;->b:[I

    iget-object v0, p0, LY6/k;->c:[Ljava/lang/String;

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, LY6/k;->c:[Ljava/lang/String;

    iget-object v0, p0, LY6/k;->d:[I

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, LY6/k;->d:[I

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/squareup/moshi/JsonDataException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Nesting too deep at "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LY6/k;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/squareup/moshi/JsonDataException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, LY6/k;->b:[I

    iget v1, p0, LY6/k;->a:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, LY6/k;->a:I

    aput p1, v0, v1

    return-void
.end method

.method public final o0()Ljava/lang/Object;
    .locals 6

    sget-object v0, LY6/k$a;->a:[I

    invoke-virtual {p0}, LY6/k;->d0()LY6/k$c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Expected a value but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LY6/k;->d0()LY6/k$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LY6/k;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-virtual {p0}, LY6/k;->T()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-virtual {p0}, LY6/k;->y()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-virtual {p0}, LY6/k;->C()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-virtual {p0}, LY6/k;->Y()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_4
    new-instance v0, LY6/p;

    invoke-direct {v0}, LY6/p;-><init>()V

    invoke-virtual {p0}, LY6/k;->g()V

    :goto_0
    invoke-virtual {p0}, LY6/k;->s()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, LY6/k;->S()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, LY6/k;->o0()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/squareup/moshi/JsonDataException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "Map key \'"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' has multiple values at path "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LY6/k;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " and "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/squareup/moshi/JsonDataException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p0}, LY6/k;->j()V

    return-object v0

    :pswitch_5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, LY6/k;->a()V

    :goto_1
    invoke-virtual {p0}, LY6/k;->s()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, LY6/k;->o0()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, LY6/k;->h()V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p()Z
    .locals 1

    iget-boolean v0, p0, LY6/k;->f:Z

    return v0
.end method

.method public abstract p0(LY6/k$b;)I
.end method

.method public abstract q0(LY6/k$b;)I
.end method

.method public final r0(Z)V
    .locals 0

    iput-boolean p1, p0, LY6/k;->f:Z

    return-void
.end method

.method public abstract s()Z
.end method

.method public final s0(Z)V
    .locals 0

    iput-boolean p1, p0, LY6/k;->e:Z

    return-void
.end method

.method public abstract t0()V
.end method

.method public abstract u0()V
.end method

.method public final v()Z
    .locals 1

    iget-boolean v0, p0, LY6/k;->e:Z

    return v0
.end method

.method final v0(Ljava/lang/String;)Lcom/squareup/moshi/JsonEncodingException;
    .locals 2

    new-instance v0, Lcom/squareup/moshi/JsonEncodingException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " at path "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LY6/k;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/squareup/moshi/JsonEncodingException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract y()Z
.end method
