.class final Lb1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/u;


# instance fields
.field private final a:Lb1/f;

.field private final b:Lmh/l;

.field private final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb1/f;Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/k;->a:Lb1/f;

    iput-object p2, p0, Lb1/k;->b:Lmh/l;

    invoke-virtual {p1}, Lb1/f;->a()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lb1/k;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Lmh/l;
    .locals 1

    iget-object v0, p0, Lb1/k;->b:Lmh/l;

    return-object v0
.end method

.method public final b()Lb1/f;
    .locals 1

    iget-object v0, p0, Lb1/k;->a:Lb1/f;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lb1/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb1/k;->a:Lb1/f;

    invoke-virtual {v0}, Lb1/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast p1, Lb1/k;

    iget-object v1, p1, Lb1/k;->a:Lb1/f;

    invoke-virtual {v1}, Lb1/f;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb1/k;->b:Lmh/l;

    iget-object p1, p1, Lb1/k;->b:Lmh/l;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public g0()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lb1/k;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lb1/k;->a:Lb1/f;

    invoke-virtual {v0}, Lb1/f;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lb1/k;->b:Lmh/l;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
