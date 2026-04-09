.class public Lorg/msgpack/core/d$b;
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
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x200

    .line 2
    iput v0, p0, Lorg/msgpack/core/d$b;->a:I

    const/16 v0, 0x2000

    .line 3
    iput v0, p0, Lorg/msgpack/core/d$b;->b:I

    .line 4
    iput v0, p0, Lorg/msgpack/core/d$b;->c:I

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lorg/msgpack/core/d$b;->d:Z

    return-void
.end method

.method private constructor <init>(Lorg/msgpack/core/d$b;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x200

    .line 7
    iput v0, p0, Lorg/msgpack/core/d$b;->a:I

    const/16 v0, 0x2000

    .line 8
    iput v0, p0, Lorg/msgpack/core/d$b;->b:I

    .line 9
    iput v0, p0, Lorg/msgpack/core/d$b;->c:I

    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lorg/msgpack/core/d$b;->d:Z

    .line 11
    iget v0, p1, Lorg/msgpack/core/d$b;->a:I

    iput v0, p0, Lorg/msgpack/core/d$b;->a:I

    .line 12
    iget v0, p1, Lorg/msgpack/core/d$b;->b:I

    iput v0, p0, Lorg/msgpack/core/d$b;->b:I

    .line 13
    iget v0, p1, Lorg/msgpack/core/d$b;->c:I

    iput v0, p0, Lorg/msgpack/core/d$b;->c:I

    .line 14
    iget-boolean p1, p1, Lorg/msgpack/core/d$b;->d:Z

    iput-boolean p1, p0, Lorg/msgpack/core/d$b;->d:Z

    return-void
.end method


# virtual methods
.method public b()Lorg/msgpack/core/d$b;
    .locals 1

    new-instance v0, Lorg/msgpack/core/d$b;

    invoke-direct {v0, p0}, Lorg/msgpack/core/d$b;-><init>(Lorg/msgpack/core/d$b;)V

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lorg/msgpack/core/d$b;->b:I

    return v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lorg/msgpack/core/d$b;->b()Lorg/msgpack/core/d$b;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lorg/msgpack/core/d$b;->a:I

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lorg/msgpack/core/d$b;->d:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lorg/msgpack/core/d$b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lorg/msgpack/core/d$b;

    iget v0, p0, Lorg/msgpack/core/d$b;->a:I

    iget v2, p1, Lorg/msgpack/core/d$b;->a:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Lorg/msgpack/core/d$b;->b:I

    iget v2, p1, Lorg/msgpack/core/d$b;->b:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Lorg/msgpack/core/d$b;->c:I

    iget v2, p1, Lorg/msgpack/core/d$b;->c:I

    if-ne v0, v2, :cond_1

    iget-boolean v0, p0, Lorg/msgpack/core/d$b;->d:Z

    iget-boolean p1, p1, Lorg/msgpack/core/d$b;->d:Z

    if-ne v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public f()Lorg/msgpack/core/b;
    .locals 1

    new-instance v0, Lorg/msgpack/core/b;

    invoke-direct {v0, p0}, Lorg/msgpack/core/b;-><init>(Lorg/msgpack/core/d$b;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lorg/msgpack/core/d$b;->a:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lorg/msgpack/core/d$b;->b:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lorg/msgpack/core/d$b;->c:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lorg/msgpack/core/d$b;->d:Z

    add-int/2addr v0, v1

    return v0
.end method
