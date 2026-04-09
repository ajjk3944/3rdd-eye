.class public Lorg/msgpack/core/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/msgpack/core/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private a:Z

.field private b:Z

.field private c:Ljava/nio/charset/CodingErrorAction;

.field private d:Ljava/nio/charset/CodingErrorAction;

.field private e:I

.field private f:I

.field private g:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lorg/msgpack/core/d$c;->a:Z

    .line 3
    iput-boolean v0, p0, Lorg/msgpack/core/d$c;->b:Z

    .line 4
    sget-object v0, Ljava/nio/charset/CodingErrorAction;->REPLACE:Ljava/nio/charset/CodingErrorAction;

    iput-object v0, p0, Lorg/msgpack/core/d$c;->c:Ljava/nio/charset/CodingErrorAction;

    .line 5
    iput-object v0, p0, Lorg/msgpack/core/d$c;->d:Ljava/nio/charset/CodingErrorAction;

    const v0, 0x7fffffff

    .line 6
    iput v0, p0, Lorg/msgpack/core/d$c;->e:I

    const/16 v0, 0x2000

    .line 7
    iput v0, p0, Lorg/msgpack/core/d$c;->f:I

    .line 8
    iput v0, p0, Lorg/msgpack/core/d$c;->g:I

    return-void
.end method

.method private constructor <init>(Lorg/msgpack/core/d$c;)V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lorg/msgpack/core/d$c;->a:Z

    .line 11
    iput-boolean v0, p0, Lorg/msgpack/core/d$c;->b:Z

    .line 12
    sget-object v0, Ljava/nio/charset/CodingErrorAction;->REPLACE:Ljava/nio/charset/CodingErrorAction;

    iput-object v0, p0, Lorg/msgpack/core/d$c;->c:Ljava/nio/charset/CodingErrorAction;

    .line 13
    iput-object v0, p0, Lorg/msgpack/core/d$c;->d:Ljava/nio/charset/CodingErrorAction;

    const v0, 0x7fffffff

    .line 14
    iput v0, p0, Lorg/msgpack/core/d$c;->e:I

    const/16 v0, 0x2000

    .line 15
    iput v0, p0, Lorg/msgpack/core/d$c;->f:I

    .line 16
    iput v0, p0, Lorg/msgpack/core/d$c;->g:I

    .line 17
    iget-boolean v0, p1, Lorg/msgpack/core/d$c;->a:Z

    iput-boolean v0, p0, Lorg/msgpack/core/d$c;->a:Z

    .line 18
    iget-boolean v0, p1, Lorg/msgpack/core/d$c;->b:Z

    iput-boolean v0, p0, Lorg/msgpack/core/d$c;->b:Z

    .line 19
    iget-object v0, p1, Lorg/msgpack/core/d$c;->c:Ljava/nio/charset/CodingErrorAction;

    iput-object v0, p0, Lorg/msgpack/core/d$c;->c:Ljava/nio/charset/CodingErrorAction;

    .line 20
    iget-object v0, p1, Lorg/msgpack/core/d$c;->d:Ljava/nio/charset/CodingErrorAction;

    iput-object v0, p0, Lorg/msgpack/core/d$c;->d:Ljava/nio/charset/CodingErrorAction;

    .line 21
    iget v0, p1, Lorg/msgpack/core/d$c;->e:I

    iput v0, p0, Lorg/msgpack/core/d$c;->e:I

    .line 22
    iget p1, p1, Lorg/msgpack/core/d$c;->f:I

    iput p1, p0, Lorg/msgpack/core/d$c;->f:I

    return-void
.end method


# virtual methods
.method public b()Lorg/msgpack/core/d$c;
    .locals 1

    new-instance v0, Lorg/msgpack/core/d$c;

    invoke-direct {v0, p0}, Lorg/msgpack/core/d$c;-><init>(Lorg/msgpack/core/d$c;)V

    return-object v0
.end method

.method public c()Ljava/nio/charset/CodingErrorAction;
    .locals 1

    iget-object v0, p0, Lorg/msgpack/core/d$c;->c:Ljava/nio/charset/CodingErrorAction;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lorg/msgpack/core/d$c;->b()Lorg/msgpack/core/d$c;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/nio/charset/CodingErrorAction;
    .locals 1

    iget-object v0, p0, Lorg/msgpack/core/d$c;->d:Ljava/nio/charset/CodingErrorAction;

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lorg/msgpack/core/d$c;->b:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lorg/msgpack/core/d$c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lorg/msgpack/core/d$c;

    iget-boolean v0, p0, Lorg/msgpack/core/d$c;->a:Z

    iget-boolean v2, p1, Lorg/msgpack/core/d$c;->a:Z

    if-ne v0, v2, :cond_1

    iget-boolean v0, p0, Lorg/msgpack/core/d$c;->b:Z

    iget-boolean v2, p1, Lorg/msgpack/core/d$c;->b:Z

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lorg/msgpack/core/d$c;->c:Ljava/nio/charset/CodingErrorAction;

    iget-object v2, p1, Lorg/msgpack/core/d$c;->c:Ljava/nio/charset/CodingErrorAction;

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lorg/msgpack/core/d$c;->d:Ljava/nio/charset/CodingErrorAction;

    iget-object v2, p1, Lorg/msgpack/core/d$c;->d:Ljava/nio/charset/CodingErrorAction;

    if-ne v0, v2, :cond_1

    iget v0, p0, Lorg/msgpack/core/d$c;->e:I

    iget v2, p1, Lorg/msgpack/core/d$c;->e:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Lorg/msgpack/core/d$c;->g:I

    iget v2, p1, Lorg/msgpack/core/d$c;->g:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Lorg/msgpack/core/d$c;->f:I

    iget p1, p1, Lorg/msgpack/core/d$c;->f:I

    if-ne v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lorg/msgpack/core/d$c;->a:Z

    return v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lorg/msgpack/core/d$c;->g:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lorg/msgpack/core/d$c;->a:Z

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lorg/msgpack/core/d$c;->b:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lorg/msgpack/core/d$c;->c:Ljava/nio/charset/CodingErrorAction;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lorg/msgpack/core/d$c;->d:Ljava/nio/charset/CodingErrorAction;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lorg/msgpack/core/d$c;->e:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lorg/msgpack/core/d$c;->f:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lorg/msgpack/core/d$c;->g:I

    add-int/2addr v0, v1

    return v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lorg/msgpack/core/d$c;->e:I

    return v0
.end method

.method public k(Lorg/msgpack/core/buffer/d;)Lorg/msgpack/core/f;
    .locals 1

    new-instance v0, Lorg/msgpack/core/f;

    invoke-direct {v0, p1, p0}, Lorg/msgpack/core/f;-><init>(Lorg/msgpack/core/buffer/d;Lorg/msgpack/core/d$c;)V

    return-object v0
.end method

.method public l([B)Lorg/msgpack/core/f;
    .locals 1

    new-instance v0, Lorg/msgpack/core/buffer/a;

    invoke-direct {v0, p1}, Lorg/msgpack/core/buffer/a;-><init>([B)V

    invoke-virtual {p0, v0}, Lorg/msgpack/core/d$c;->k(Lorg/msgpack/core/buffer/d;)Lorg/msgpack/core/f;

    move-result-object p1

    return-object p1
.end method
