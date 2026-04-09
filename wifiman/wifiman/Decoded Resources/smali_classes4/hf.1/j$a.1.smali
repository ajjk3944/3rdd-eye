.class public final Lhf/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx6/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhf/j;->d([Lhf/h;LT/l;I)Lx6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Ljava/util/List;

.field private final b:F

.field private final c:F

.field private final d:F

.field private final e:F

.field private final f:F

.field private final g:F

.field private final h:F


# direct methods
.method constructor <init>([Lhf/h;)V
    .locals 12

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p1, v3

    invoke-virtual {v4}, Lhf/h;->a()[F

    move-result-object v4

    new-instance v5, Ljava/util/ArrayList;

    array-length v6, v4

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    array-length v6, v4

    move v7, v2

    move v8, v7

    :goto_1
    if-ge v7, v6, :cond_0

    aget v9, v4, v7

    add-int/lit8 v10, v8, 0x1

    new-instance v11, Lx6/c;

    int-to-float v8, v8

    invoke-direct {v11, v8, v9}, Lx6/c;-><init>(FF)V

    invoke-interface {v5, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    move v8, v10

    goto :goto_1

    :cond_0
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iput-object v0, p0, Lhf/j$a;->a:Ljava/util/List;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lhf/j$a;->b:F

    array-length v1, p1

    if-eqz v1, :cond_3

    aget-object v1, p1, v2

    invoke-virtual {v1}, Lhf/h;->a()[F

    move-result-object v1

    array-length v1, v1

    int-to-float v1, v1

    const/4 v2, 0x2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    invoke-static {p1}, LZg/n;->g0([Ljava/lang/Object;)I

    move-result v3

    const/4 v4, 0x1

    if-gt v4, v3, :cond_2

    :goto_2
    aget-object v5, p1, v4

    invoke-virtual {v5}, Lhf/h;->a()[F

    move-result-object v5

    array-length v5, v5

    int-to-float v5, v5

    sub-float/2addr v5, v2

    invoke-static {v1, v5}, Ljava/lang/Math;->min(FF)F

    move-result v1

    if-eq v4, v3, :cond_2

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_2
    iput v1, p0, Lhf/j$a;->c:F

    const p1, 0x3c23d70a    # 0.01f

    iput p1, p0, Lhf/j$a;->d:F

    iput v0, p0, Lhf/j$a;->e:F

    iput v0, p0, Lhf/j$a;->g:F

    iput v0, p0, Lhf/j$a;->h:F

    return-void

    :cond_3
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1
.end method


# virtual methods
.method public a()F
    .locals 1

    iget v0, p0, Lhf/j$a;->e:F

    return v0
.end method

.method public b()F
    .locals 1

    iget v0, p0, Lhf/j$a;->c:F

    return v0
.end method

.method public c()F
    .locals 1

    iget v0, p0, Lhf/j$a;->d:F

    return v0
.end method

.method public d()F
    .locals 1

    iget v0, p0, Lhf/j$a;->h:F

    return v0
.end method

.method public e()F
    .locals 1

    iget v0, p0, Lhf/j$a;->b:F

    return v0
.end method

.method public f()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lhf/j$a;->a:Ljava/util/List;

    return-object v0
.end method

.method public g()F
    .locals 1

    iget v0, p0, Lhf/j$a;->g:F

    return v0
.end method

.method public getId()I
    .locals 1

    invoke-static {p0}, Lx6/b$a;->a(Lx6/b;)I

    move-result v0

    return v0
.end method

.method public h()F
    .locals 1

    iget v0, p0, Lhf/j$a;->f:F

    return v0
.end method
