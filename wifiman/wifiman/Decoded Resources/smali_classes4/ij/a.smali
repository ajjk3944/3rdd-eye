.class public abstract Lij/a;
.super Ljava/util/AbstractMap;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lij/a$b;,
        Lij/a$d;,
        Lij/a$c;,
        Lij/a$a;
    }
.end annotation


# static fields
.field protected static final i:Ljava/lang/Object;


# instance fields
.field transient a:F

.field transient b:I

.field transient c:[Lij/a$b;

.field transient d:I

.field transient e:I

.field transient f:Lij/a$a;

.field transient g:Lij/a$c;

.field transient h:Lij/a$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lij/a;->i:Ljava/lang/Object;

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    return-void
.end method

.method protected constructor <init>(IF)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    if-ltz p1, :cond_1

    const/4 v0, 0x0

    cmpg-float v0, p2, v0

    if-lez v0, :cond_0

    .line 3
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iput p2, p0, Lij/a;->a:F

    .line 5
    invoke-virtual {p0, p1}, Lij/a;->n(I)I

    move-result p1

    .line 6
    invoke-virtual {p0, p1, p2}, Lij/a;->p(IF)I

    move-result p2

    iput p2, p0, Lij/a;->d:I

    .line 7
    new-array p1, p1, [Lij/a$b;

    iput-object p1, p0, Lij/a;->c:[Lij/a$b;

    .line 8
    invoke-virtual {p0}, Lij/a;->M0()V

    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Load factor must be greater than 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 10
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Initial capacity must be a non negative number"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private d(Ljava/util/Map;)V
    .locals 2

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v1, p0, Lij/a;->b:I

    add-int/2addr v1, v0

    int-to-float v0, v1

    iget v1, p0, Lij/a;->a:F

    div-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v0, v1

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lij/a;->n(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lij/a;->f0(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lij/a;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method protected B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p1, :cond_0

    sget-object p1, Lij/a;->i:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method protected C0(Ljava/lang/Object;)Lij/a$b;
    .locals 3

    invoke-virtual {p0, p1}, Lij/a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lij/a;->E0(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lij/a;->c:[Lij/a$b;

    array-length v2, v1

    invoke-virtual {p0, v0, v2}, Lij/a;->G0(II)I

    move-result v2

    aget-object v1, v1, v2

    :goto_0
    if-eqz v1, :cond_1

    iget v2, v1, Lij/a$b;->b:I

    if-ne v2, v0, :cond_0

    iget-object v2, v1, Lij/a$b;->c:Ljava/lang/Object;

    invoke-virtual {p0, p1, v2}, Lij/a;->N0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    iget-object v1, v1, Lij/a$b;->a:Lij/a$b;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method protected abstract E(Lij/a$b;ILjava/lang/Object;Ljava/lang/Object;)Lij/a$b;
.end method

.method protected E0(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    shl-int/lit8 v0, p1, 0x9

    not-int v0, v0

    add-int/2addr p1, v0

    ushr-int/lit8 v0, p1, 0xe

    xor-int/2addr p1, v0

    shl-int/lit8 v0, p1, 0x4

    add-int/2addr p1, v0

    ushr-int/lit8 v0, p1, 0xa

    xor-int/2addr p1, v0

    return p1
.end method

.method protected G0(II)I
    .locals 0

    add-int/lit8 p2, p2, -0x1

    and-int/2addr p1, p2

    return p1
.end method

.method protected abstract K()Ljava/util/Iterator;
.end method

.method protected abstract M0()V
.end method

.method protected N0(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-eq p1, p2, :cond_1

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method protected abstract P()Ljava/util/Iterator;
.end method

.method protected P0(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-eq p1, p2, :cond_1

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method protected abstract S()Ljava/util/Iterator;
.end method

.method public abstract T0()Lgj/a;
.end method

.method protected U0(Lij/a$b;ILij/a$b;)V
    .locals 0

    if-nez p3, :cond_0

    iget-object p3, p0, Lij/a;->c:[Lij/a$b;

    iget-object p1, p1, Lij/a$b;->a:Lij/a$b;

    aput-object p1, p3, p2

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lij/a$b;->a:Lij/a$b;

    iput-object p1, p3, Lij/a$b;->a:Lij/a$b;

    :goto_0
    return-void
.end method

.method protected V0(Lij/a$b;ILij/a$b;)V
    .locals 1

    iget v0, p0, Lij/a;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lij/a;->e:I

    invoke-virtual {p0, p1, p2, p3}, Lij/a;->U0(Lij/a$b;ILij/a$b;)V

    iget p2, p0, Lij/a;->b:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p0, Lij/a;->b:I

    invoke-virtual {p0, p1}, Lij/a;->d0(Lij/a$b;)V

    return-void
.end method

.method protected W0(Lij/a$b;IILjava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lij/a;->c:[Lij/a$b;

    aget-object p2, v0, p2

    iput-object p2, p1, Lij/a$b;->a:Lij/a$b;

    iput p3, p1, Lij/a$b;->b:I

    iput-object p4, p1, Lij/a$b;->c:Ljava/lang/Object;

    iput-object p5, p1, Lij/a$b;->d:Ljava/lang/Object;

    return-void
.end method

.method protected abstract X0(Lij/a$b;Ljava/lang/Object;)V
.end method

.method public clear()V
    .locals 3

    iget v0, p0, Lij/a;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lij/a;->e:I

    iget-object v0, p0, Lij/a;->c:[Lij/a$b;

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_0

    const/4 v2, 0x0

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lij/a;->b:I

    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 3

    invoke-virtual {p0, p1}, Lij/a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lij/a;->E0(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lij/a;->c:[Lij/a$b;

    array-length v2, v1

    invoke-virtual {p0, v0, v2}, Lij/a;->G0(II)I

    move-result v2

    aget-object v1, v1, v2

    :goto_0
    if-eqz v1, :cond_1

    iget v2, v1, Lij/a$b;->b:I

    if-ne v2, v0, :cond_0

    iget-object v2, v1, Lij/a$b;->c:Ljava/lang/Object;

    invoke-virtual {p0, p1, v2}, Lij/a;->N0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object v1, v1, Lij/a$b;->a:Lij/a$b;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public abstract containsValue(Ljava/lang/Object;)Z
.end method

.method protected d0(Lij/a$b;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p1, Lij/a$b;->a:Lij/a$b;

    iput-object v0, p1, Lij/a$b;->c:Ljava/lang/Object;

    iput-object v0, p1, Lij/a$b;->d:Ljava/lang/Object;

    return-void
.end method

.method public entrySet()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lij/a;->f:Lij/a$a;

    if-nez v0, :cond_0

    new-instance v0, Lij/a$a;

    invoke-direct {v0, p0}, Lij/a$a;-><init>(Lij/a;)V

    iput-object v0, p0, Lij/a;->f:Lij/a$a;

    :cond_0
    iget-object v0, p0, Lij/a;->f:Lij/a$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljava/util/Map;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-virtual {p0}, Lij/a;->size()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lij/a;->T0()Lgj/a;

    move-result-object v1

    :cond_3
    :try_start_0
    invoke-interface {v1}, Lgj/a;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Lgj/a;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1}, Lgj/a;->getValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_5

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_4

    invoke-interface {p1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_4
    return v2

    :cond_5
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v3, :cond_3

    return v2

    :cond_6
    return v0

    :catch_0
    return v2
.end method

.method protected f0(I)V
    .locals 7

    iget-object v0, p0, Lij/a;->c:[Lij/a$b;

    array-length v1, v0

    if-gt p1, v1, :cond_0

    return-void

    :cond_0
    iget v2, p0, Lij/a;->b:I

    if-nez v2, :cond_1

    iget v0, p0, Lij/a;->a:F

    invoke-virtual {p0, p1, v0}, Lij/a;->p(IF)I

    move-result v0

    iput v0, p0, Lij/a;->d:I

    new-array p1, p1, [Lij/a$b;

    iput-object p1, p0, Lij/a;->c:[Lij/a$b;

    goto :goto_3

    :cond_1
    new-array v2, p1, [Lij/a$b;

    iget v3, p0, Lij/a;->e:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lij/a;->e:I

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_4

    aget-object v3, v0, v1

    if-eqz v3, :cond_3

    const/4 v4, 0x0

    aput-object v4, v0, v1

    :goto_1
    iget-object v4, v3, Lij/a$b;->a:Lij/a$b;

    iget v5, v3, Lij/a$b;->b:I

    invoke-virtual {p0, v5, p1}, Lij/a;->G0(II)I

    move-result v5

    aget-object v6, v2, v5

    iput-object v6, v3, Lij/a$b;->a:Lij/a$b;

    aput-object v3, v2, v5

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    move-object v3, v4

    goto :goto_1

    :cond_3
    :goto_2
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_4
    iget v0, p0, Lij/a;->a:F

    invoke-virtual {p0, p1, v0}, Lij/a;->p(IF)I

    move-result p1

    iput p1, p0, Lij/a;->d:I

    iput-object v2, p0, Lij/a;->c:[Lij/a$b;

    :goto_3
    return-void
.end method

.method protected abstract h(Lij/a$b;I)V
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Lij/a;->K()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public isEmpty()Z
    .locals 1

    iget v0, p0, Lij/a;->b:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lij/a;->g:Lij/a$c;

    if-nez v0, :cond_0

    new-instance v0, Lij/a$c;

    invoke-direct {v0, p0}, Lij/a$c;-><init>(Lij/a;)V

    iput-object v0, p0, Lij/a;->g:Lij/a$c;

    :cond_0
    iget-object v0, p0, Lij/a;->g:Lij/a$c;

    return-object v0
.end method

.method protected l(IILjava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lij/a;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lij/a;->e:I

    iget-object v0, p0, Lij/a;->c:[Lij/a$b;

    aget-object v0, v0, p1

    invoke-virtual {p0, v0, p2, p3, p4}, Lij/a;->E(Lij/a$b;ILjava/lang/Object;Ljava/lang/Object;)Lij/a$b;

    move-result-object p2

    invoke-virtual {p0, p2, p1}, Lij/a;->h(Lij/a$b;I)V

    iget p1, p0, Lij/a;->b:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lij/a;->b:I

    invoke-virtual {p0}, Lij/a;->r()V

    return-void
.end method

.method protected n(I)I
    .locals 2

    const/high16 v0, 0x40000000    # 2.0f

    if-le p1, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    :goto_0
    if-ge v1, p1, :cond_1

    shl-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-le v1, v0, :cond_2

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    return v0
.end method

.method protected p(IF)I
    .locals 0

    int-to-float p1, p1

    mul-float/2addr p1, p2

    float-to-int p1, p1

    return p1
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-virtual {p0, p1}, Lij/a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lij/a;->E0(Ljava/lang/Object;)I

    move-result v1

    iget-object v2, p0, Lij/a;->c:[Lij/a$b;

    array-length v2, v2

    invoke-virtual {p0, v1, v2}, Lij/a;->G0(II)I

    move-result v2

    iget-object v3, p0, Lij/a;->c:[Lij/a$b;

    aget-object v3, v3, v2

    :goto_0
    if-eqz v3, :cond_1

    iget v4, v3, Lij/a$b;->b:I

    if-ne v4, v1, :cond_0

    iget-object v4, v3, Lij/a$b;->c:Ljava/lang/Object;

    invoke-virtual {p0, v0, v4}, Lij/a;->N0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Lij/a$b;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, v3, p2}, Lij/a;->X0(Lij/a$b;Ljava/lang/Object;)V

    return-object p1

    :cond_0
    iget-object v3, v3, Lij/a$b;->a:Lij/a$b;

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v2, v1, p1, p2}, Lij/a;->l(IILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0, p1}, Lij/a;->d(Ljava/util/Map;)V

    return-void
.end method

.method protected r()V
    .locals 2

    iget v0, p0, Lij/a;->b:I

    iget v1, p0, Lij/a;->d:I

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lij/a;->c:[Lij/a$b;

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x2

    const/high16 v1, 0x40000000    # 2.0f

    if-gt v0, v1, :cond_0

    invoke-virtual {p0, v0}, Lij/a;->f0(I)V

    :cond_0
    return-void
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-virtual {p0, p1}, Lij/a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lij/a;->E0(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lij/a;->c:[Lij/a$b;

    array-length v1, v1

    invoke-virtual {p0, v0, v1}, Lij/a;->G0(II)I

    move-result v1

    iget-object v2, p0, Lij/a;->c:[Lij/a$b;

    aget-object v2, v2, v1

    const/4 v3, 0x0

    move-object v4, v3

    :goto_0
    if-eqz v2, :cond_1

    iget v5, v2, Lij/a$b;->b:I

    if-ne v5, v0, :cond_0

    iget-object v5, v2, Lij/a$b;->c:Ljava/lang/Object;

    invoke-virtual {p0, p1, v5}, Lij/a;->N0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v2}, Lij/a$b;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, v2, v1, v4}, Lij/a;->V0(Lij/a$b;ILij/a$b;)V

    return-object p1

    :cond_0
    iget-object v4, v2, Lij/a$b;->a:Lij/a$b;

    move-object v6, v4

    move-object v4, v2

    move-object v2, v6

    goto :goto_0

    :cond_1
    return-object v3
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lij/a;->b:I

    return v0
.end method

.method protected t()Lij/a;
    .locals 2

    :try_start_0
    invoke-super {p0}, Ljava/util/AbstractMap;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lij/a;

    iget-object v1, p0, Lij/a;->c:[Lij/a$b;

    array-length v1, v1

    new-array v1, v1, [Lij/a$b;

    iput-object v1, v0, Lij/a;->c:[Lij/a$b;

    const/4 v1, 0x0

    iput-object v1, v0, Lij/a;->f:Lij/a$a;

    iput-object v1, v0, Lij/a;->g:Lij/a$c;

    iput-object v1, v0, Lij/a;->h:Lij/a$d;

    const/4 v1, 0x0

    iput v1, v0, Lij/a;->e:I

    iput v1, v0, Lij/a;->b:I

    invoke-virtual {v0}, Lij/a;->M0()V

    invoke-virtual {v0, p0}, Lij/a;->putAll(Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    invoke-direct {v0}, Ljava/lang/InternalError;-><init>()V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    invoke-virtual {p0}, Lij/a;->size()I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "{}"

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lij/a;->size()I

    move-result v1

    const/16 v2, 0x20

    mul-int/2addr v1, v2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lij/a;->T0()Lgj/a;

    move-result-object v1

    invoke-interface {v1}, Lgj/a;->hasNext()Z

    move-result v3

    :cond_1
    :goto_0
    if-eqz v3, :cond_4

    invoke-interface {v1}, Lgj/a;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1}, Lgj/a;->getValue()Ljava/lang/Object;

    move-result-object v4

    const-string v5, "(this Map)"

    if-ne v3, p0, :cond_2

    move-object v3, v5

    :cond_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v3, 0x3d

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-ne v4, p0, :cond_3

    move-object v4, v5

    :cond_3
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Lgj/a;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v4, 0x2c

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_4
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public values()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lij/a;->h:Lij/a$d;

    if-nez v0, :cond_0

    new-instance v0, Lij/a$d;

    invoke-direct {v0, p0}, Lij/a$d;-><init>(Lij/a;)V

    iput-object v0, p0, Lij/a;->h:Lij/a$d;

    :cond_0
    iget-object v0, p0, Lij/a;->h:Lij/a$d;

    return-object v0
.end method
