.class public Lh1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh1/e;
.implements Lg1/f;


# instance fields
.field final a:Lg1/g;

.field private b:I

.field private c:Lj1/h;

.field private d:I

.field private e:I

.field private f:F

.field private g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lg1/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lh1/h;->d:I

    iput v0, p0, Lh1/h;->e:I

    const/4 v0, 0x0

    iput v0, p0, Lh1/h;->f:F

    iput-object p1, p0, Lh1/h;->a:Lg1/g;

    return-void
.end method


# virtual methods
.method public a()Lj1/e;
    .locals 1

    iget-object v0, p0, Lh1/h;->c:Lj1/h;

    if-nez v0, :cond_0

    new-instance v0, Lj1/h;

    invoke-direct {v0}, Lj1/h;-><init>()V

    iput-object v0, p0, Lh1/h;->c:Lj1/h;

    :cond_0
    iget-object v0, p0, Lh1/h;->c:Lj1/h;

    return-object v0
.end method

.method public apply()V
    .locals 2

    iget-object v0, p0, Lh1/h;->c:Lj1/h;

    iget v1, p0, Lh1/h;->b:I

    invoke-virtual {v0, v1}, Lj1/h;->j1(I)V

    iget v0, p0, Lh1/h;->d:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v1, p0, Lh1/h;->c:Lj1/h;

    invoke-virtual {v1, v0}, Lj1/h;->g1(I)V

    goto :goto_0

    :cond_0
    iget v0, p0, Lh1/h;->e:I

    if-eq v0, v1, :cond_1

    iget-object v1, p0, Lh1/h;->c:Lj1/h;

    invoke-virtual {v1, v0}, Lj1/h;->h1(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lh1/h;->c:Lj1/h;

    iget v1, p0, Lh1/h;->f:F

    invoke-virtual {v0, v1}, Lj1/h;->i1(F)V

    :goto_0
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lh1/h;->g:Ljava/lang/Object;

    return-void
.end method

.method public c()Lh1/e;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Lj1/e;)V
    .locals 1

    instance-of v0, p1, Lj1/h;

    if-eqz v0, :cond_0

    check-cast p1, Lj1/h;

    iput-object p1, p0, Lh1/h;->c:Lj1/h;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lh1/h;->c:Lj1/h;

    :goto_0
    return-void
.end method

.method public e(Ljava/lang/Object;)Lh1/h;
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lh1/h;->d:I

    iget-object v0, p0, Lh1/h;->a:Lg1/g;

    invoke-virtual {v0, p1}, Lg1/g;->e(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lh1/h;->e:I

    const/4 p1, 0x0

    iput p1, p0, Lh1/h;->f:F

    return-object p0
.end method

.method public f(F)Lh1/h;
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lh1/h;->d:I

    iput v0, p0, Lh1/h;->e:I

    iput p1, p0, Lh1/h;->f:F

    return-object p0
.end method

.method public g(I)V
    .locals 0

    iput p1, p0, Lh1/h;->b:I

    return-void
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lh1/h;->g:Ljava/lang/Object;

    return-object v0
.end method

.method public h(Ljava/lang/Object;)Lh1/h;
    .locals 1

    iget-object v0, p0, Lh1/h;->a:Lg1/g;

    invoke-virtual {v0, p1}, Lg1/g;->e(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lh1/h;->d:I

    const/4 p1, -0x1

    iput p1, p0, Lh1/h;->e:I

    const/4 p1, 0x0

    iput p1, p0, Lh1/h;->f:F

    return-object p0
.end method
