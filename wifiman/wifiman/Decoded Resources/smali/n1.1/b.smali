.class public Ln1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln1/d$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln1/b$a;
    }
.end annotation


# instance fields
.field a:Ln1/i;

.field b:F

.field c:Z

.field d:Ljava/util/ArrayList;

.field public e:Ln1/b$a;

.field f:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ln1/b;->a:Ln1/i;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Ln1/b;->b:F

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Ln1/b;->c:Z

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ln1/b;->d:Ljava/util/ArrayList;

    .line 6
    iput-boolean v0, p0, Ln1/b;->f:Z

    return-void
.end method

.method public constructor <init>(Ln1/c;)V
    .locals 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Ln1/b;->a:Ln1/i;

    const/4 v0, 0x0

    .line 9
    iput v0, p0, Ln1/b;->b:F

    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Ln1/b;->c:Z

    .line 11
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ln1/b;->d:Ljava/util/ArrayList;

    .line 12
    iput-boolean v0, p0, Ln1/b;->f:Z

    .line 13
    new-instance v0, Ln1/a;

    invoke-direct {v0, p0, p1}, Ln1/a;-><init>(Ln1/b;Ln1/c;)V

    iput-object v0, p0, Ln1/b;->e:Ln1/b$a;

    return-void
.end method

.method private v(Ln1/i;Ln1/d;)Z
    .locals 0

    iget p1, p1, Ln1/i;->m:I

    const/4 p2, 0x1

    if-gt p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    return p2
.end method

.method private x([ZLn1/i;)Ln1/i;
    .locals 9

    iget-object v0, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v0}, Ln1/b$a;->a()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v4, v1

    :goto_0
    if-ge v3, v0, :cond_3

    iget-object v5, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v5, v3}, Ln1/b$a;->d(I)F

    move-result v5

    cmpg-float v6, v5, v1

    if-gez v6, :cond_2

    iget-object v6, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v6, v3}, Ln1/b$a;->b(I)Ln1/i;

    move-result-object v6

    if-eqz p1, :cond_0

    iget v7, v6, Ln1/i;->c:I

    aget-boolean v7, p1, v7

    if-nez v7, :cond_2

    :cond_0
    if-eq v6, p2, :cond_2

    iget-object v7, v6, Ln1/i;->j:Ln1/i$a;

    sget-object v8, Ln1/i$a;->SLACK:Ln1/i$a;

    if-eq v7, v8, :cond_1

    sget-object v8, Ln1/i$a;->ERROR:Ln1/i$a;

    if-ne v7, v8, :cond_2

    :cond_1
    cmpg-float v7, v5, v4

    if-gez v7, :cond_2

    move v4, v5

    move-object v2, v6

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-object v2
.end method


# virtual methods
.method A()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Ln1/b;->a:Ln1/i;

    const-string v1, ""

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln1/b;->a:Ln1/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Ln1/b;->b:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Ln1/b;->b:F

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move v1, v4

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    iget-object v5, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v5}, Ln1/b$a;->a()I

    move-result v5

    :goto_2
    if-ge v3, v5, :cond_8

    iget-object v6, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v6, v3}, Ln1/b$a;->b(I)Ln1/i;

    move-result-object v6

    if-nez v6, :cond_2

    goto/16 :goto_6

    :cond_2
    iget-object v7, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v7, v3}, Ln1/b$a;->d(I)F

    move-result v7

    cmpl-float v8, v7, v2

    if-nez v8, :cond_3

    goto/16 :goto_6

    :cond_3
    invoke-virtual {v6}, Ln1/i;->toString()Ljava/lang/String;

    move-result-object v6

    const/high16 v9, -0x40800000    # -1.0f

    if-nez v1, :cond_4

    cmpg-float v1, v7, v2

    if-gez v1, :cond_6

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "- "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3
    mul-float/2addr v7, v9

    goto :goto_4

    :cond_4
    if-lez v8, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " + "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " - "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_6
    :goto_4
    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, v7, v1

    if-nez v1, :cond_7

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_5
    move v1, v4

    :goto_6
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_2

    :cond_8
    if-nez v1, :cond_9

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "0.0"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_9
    return-object v0
.end method

.method public B(Ln1/d;Ln1/i;Z)V
    .locals 2

    iget-boolean p1, p2, Ln1/i;->g:Z

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p2}, Ln1/b$a;->h(Ln1/i;)F

    move-result p1

    iget v0, p0, Ln1/b;->b:F

    iget v1, p2, Ln1/i;->f:F

    mul-float/2addr v1, p1

    add-float/2addr v0, v1

    iput v0, p0, Ln1/b;->b:F

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p2, p3}, Ln1/b$a;->g(Ln1/i;Z)F

    if-eqz p3, :cond_1

    invoke-virtual {p2, p0}, Ln1/i;->c(Ln1/b;)V

    :cond_1
    return-void
.end method

.method public C(Ln1/b;Z)V
    .locals 3

    iget-object v0, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v0, p1, p2}, Ln1/b$a;->i(Ln1/b;Z)F

    move-result v0

    iget v1, p0, Ln1/b;->b:F

    iget v2, p1, Ln1/b;->b:F

    mul-float/2addr v2, v0

    add-float/2addr v1, v2

    iput v1, p0, Ln1/b;->b:F

    if-eqz p2, :cond_0

    iget-object p1, p1, Ln1/b;->a:Ln1/i;

    invoke-virtual {p1, p0}, Ln1/i;->c(Ln1/b;)V

    :cond_0
    return-void
.end method

.method public D(Ln1/d;)V
    .locals 7

    iget-object v0, p1, Ln1/d;->f:[Ln1/b;

    array-length v0, v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-nez v1, :cond_7

    iget-object v2, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v2}, Ln1/b$a;->a()I

    move-result v2

    move v3, v0

    :goto_1
    if-ge v3, v2, :cond_3

    iget-object v4, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v4, v3}, Ln1/b$a;->b(I)Ln1/i;

    move-result-object v4

    iget v5, v4, Ln1/i;->d:I

    const/4 v6, -0x1

    if-ne v5, v6, :cond_1

    iget-boolean v5, v4, Ln1/i;->g:Z

    if-eqz v5, :cond_2

    :cond_1
    iget-object v5, p0, Ln1/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    iget-object v2, p0, Ln1/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-lez v2, :cond_6

    iget-object v2, p0, Ln1/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln1/i;

    iget-boolean v5, v4, Ln1/i;->g:Z

    if-eqz v5, :cond_4

    invoke-virtual {p0, p1, v4, v3}, Ln1/b;->B(Ln1/d;Ln1/i;Z)V

    goto :goto_2

    :cond_4
    iget-object v5, p1, Ln1/d;->f:[Ln1/b;

    iget v4, v4, Ln1/i;->d:I

    aget-object v4, v5, v4

    invoke-virtual {p0, v4, v3}, Ln1/b;->C(Ln1/b;Z)V

    goto :goto_2

    :cond_5
    iget-object v2, p0, Ln1/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    goto :goto_0

    :cond_6
    move v1, v3

    goto :goto_0

    :cond_7
    return-void
.end method

.method public a(Ln1/d;[Z)Ln1/i;
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p2, p1}, Ln1/b;->x([ZLn1/i;)Ln1/i;

    move-result-object p1

    return-object p1
.end method

.method public b(Ln1/i;)V
    .locals 3

    iget v0, p1, Ln1/i;->e:I

    const/4 v1, 0x1

    const/high16 v2, 0x3f800000    # 1.0f

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    const/high16 v2, 0x447a0000    # 1000.0f

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    const v2, 0x49742400    # 1000000.0f

    goto :goto_0

    :cond_2
    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    const v2, 0x4e6e6b28    # 1.0E9f

    goto :goto_0

    :cond_3
    const/4 v1, 0x5

    if-ne v0, v1, :cond_4

    const v2, 0x5368d4a5    # 1.0E12f

    :cond_4
    :goto_0
    iget-object v0, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v0, p1, v2}, Ln1/b$a;->f(Ln1/i;F)V

    return-void
.end method

.method public c(Ln1/d$a;)V
    .locals 5

    instance-of v0, p1, Ln1/b;

    if-eqz v0, :cond_0

    check-cast p1, Ln1/b;

    const/4 v0, 0x0

    iput-object v0, p0, Ln1/b;->a:Ln1/i;

    iget-object v0, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v0}, Ln1/b$a;->clear()V

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p1, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v1}, Ln1/b$a;->a()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p1, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v1, v0}, Ln1/b$a;->b(I)Ln1/i;

    move-result-object v1

    iget-object v2, p1, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v2, v0}, Ln1/b$a;->d(I)F

    move-result v2

    iget-object v3, p0, Ln1/b;->e:Ln1/b$a;

    const/4 v4, 0x1

    invoke-interface {v3, v1, v2, v4}, Ln1/b$a;->k(Ln1/i;FZ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v0}, Ln1/b$a;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Ln1/b;->a:Ln1/i;

    const/4 v0, 0x0

    iput v0, p0, Ln1/b;->b:F

    return-void
.end method

.method public d(Ln1/d;I)Ln1/b;
    .locals 3

    iget-object v0, p0, Ln1/b;->e:Ln1/b$a;

    const-string v1, "ep"

    invoke-virtual {p1, p2, v1}, Ln1/d;->o(ILjava/lang/String;)Ln1/i;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-interface {v0, v1, v2}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object v0, p0, Ln1/b;->e:Ln1/b$a;

    const-string v1, "em"

    invoke-virtual {p1, p2, v1}, Ln1/d;->o(ILjava/lang/String;)Ln1/i;

    move-result-object p1

    const/high16 p2, -0x40800000    # -1.0f

    invoke-interface {v0, p1, p2}, Ln1/b$a;->f(Ln1/i;F)V

    return-object p0
.end method

.method e(Ln1/i;I)Ln1/b;
    .locals 1

    iget-object v0, p0, Ln1/b;->e:Ln1/b$a;

    int-to-float p2, p2

    invoke-interface {v0, p1, p2}, Ln1/b$a;->f(Ln1/i;F)V

    return-object p0
.end method

.method f(Ln1/d;)Z
    .locals 2

    invoke-virtual {p0, p1}, Ln1/b;->g(Ln1/d;)Ln1/i;

    move-result-object p1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Ln1/b;->y(Ln1/i;)V

    const/4 p1, 0x0

    :goto_0
    iget-object v1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v1}, Ln1/b$a;->a()I

    move-result v1

    if-nez v1, :cond_1

    iput-boolean v0, p0, Ln1/b;->f:Z

    :cond_1
    return p1
.end method

.method g(Ln1/d;)Ln1/i;
    .locals 14

    iget-object v0, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v0}, Ln1/b$a;->a()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v7, v2

    move v8, v7

    move v4, v3

    move v5, v4

    move v6, v5

    move-object v3, v1

    :goto_0
    if-ge v4, v0, :cond_6

    iget-object v9, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v9, v4}, Ln1/b$a;->d(I)F

    move-result v9

    iget-object v10, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v10, v4}, Ln1/b$a;->b(I)Ln1/i;

    move-result-object v10

    iget-object v11, v10, Ln1/i;->j:Ln1/i$a;

    sget-object v12, Ln1/i$a;->UNRESTRICTED:Ln1/i$a;

    const/4 v13, 0x1

    if-ne v11, v12, :cond_2

    if-nez v1, :cond_0

    invoke-direct {p0, v10, p1}, Ln1/b;->v(Ln1/i;Ln1/d;)Z

    move-result v1

    :goto_1
    move v5, v1

    move v7, v9

    move-object v1, v10

    goto :goto_3

    :cond_0
    cmpl-float v11, v7, v9

    if-lez v11, :cond_1

    invoke-direct {p0, v10, p1}, Ln1/b;->v(Ln1/i;Ln1/d;)Z

    move-result v1

    goto :goto_1

    :cond_1
    if-nez v5, :cond_5

    invoke-direct {p0, v10, p1}, Ln1/b;->v(Ln1/i;Ln1/d;)Z

    move-result v11

    if-eqz v11, :cond_5

    move v7, v9

    move-object v1, v10

    move v5, v13

    goto :goto_3

    :cond_2
    if-nez v1, :cond_5

    cmpg-float v11, v9, v2

    if-gez v11, :cond_5

    if-nez v3, :cond_3

    invoke-direct {p0, v10, p1}, Ln1/b;->v(Ln1/i;Ln1/d;)Z

    move-result v3

    :goto_2
    move v6, v3

    move v8, v9

    move-object v3, v10

    goto :goto_3

    :cond_3
    cmpl-float v11, v8, v9

    if-lez v11, :cond_4

    invoke-direct {p0, v10, p1}, Ln1/b;->v(Ln1/i;Ln1/d;)Z

    move-result v3

    goto :goto_2

    :cond_4
    if-nez v6, :cond_5

    invoke-direct {p0, v10, p1}, Ln1/b;->v(Ln1/i;Ln1/d;)Z

    move-result v11

    if-eqz v11, :cond_5

    move v8, v9

    move-object v3, v10

    move v6, v13

    :cond_5
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_6
    if-eqz v1, :cond_7

    return-object v1

    :cond_7
    return-object v3
.end method

.method public getKey()Ln1/i;
    .locals 1

    iget-object v0, p0, Ln1/b;->a:Ln1/i;

    return-object v0
.end method

.method h(Ln1/i;Ln1/i;IFLn1/i;Ln1/i;I)Ln1/b;
    .locals 5

    const/high16 v0, 0x3f800000    # 1.0f

    if-ne p2, p5, :cond_0

    iget-object p3, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p3, p1, v0}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p6, v0}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    const/high16 p3, -0x40000000    # -2.0f

    invoke-interface {p1, p2, p3}, Ln1/b$a;->f(Ln1/i;F)V

    return-object p0

    :cond_0
    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float v1, p4, v1

    const/high16 v2, -0x40800000    # -1.0f

    if-nez v1, :cond_2

    iget-object p4, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p4, p1, v0}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p2, v2}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p5, v2}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p6, v0}, Ln1/b$a;->f(Ln1/i;F)V

    if-gtz p3, :cond_1

    if-lez p7, :cond_6

    :cond_1
    neg-int p1, p3

    add-int/2addr p1, p7

    int-to-float p1, p1

    iput p1, p0, Ln1/b;->b:F

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    cmpg-float v1, p4, v1

    if-gtz v1, :cond_3

    iget-object p4, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p4, p1, v2}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p2, v0}, Ln1/b$a;->f(Ln1/i;F)V

    int-to-float p1, p3

    iput p1, p0, Ln1/b;->b:F

    goto :goto_0

    :cond_3
    cmpl-float v1, p4, v0

    if-ltz v1, :cond_4

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p6, v2}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p5, v0}, Ln1/b$a;->f(Ln1/i;F)V

    neg-int p1, p7

    int-to-float p1, p1

    iput p1, p0, Ln1/b;->b:F

    goto :goto_0

    :cond_4
    iget-object v1, p0, Ln1/b;->e:Ln1/b$a;

    sub-float v3, v0, p4

    mul-float v4, v3, v0

    invoke-interface {v1, p1, v4}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    mul-float v1, v3, v2

    invoke-interface {p1, p2, v1}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    mul-float/2addr v2, p4

    invoke-interface {p1, p5, v2}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    mul-float/2addr v0, p4

    invoke-interface {p1, p6, v0}, Ln1/b$a;->f(Ln1/i;F)V

    if-gtz p3, :cond_5

    if-lez p7, :cond_6

    :cond_5
    neg-int p1, p3

    int-to-float p1, p1

    mul-float/2addr p1, v3

    int-to-float p2, p7

    mul-float/2addr p2, p4

    add-float/2addr p1, p2

    iput p1, p0, Ln1/b;->b:F

    :cond_6
    :goto_0
    return-object p0
.end method

.method i(Ln1/i;I)Ln1/b;
    .locals 0

    iput-object p1, p0, Ln1/b;->a:Ln1/i;

    int-to-float p2, p2

    iput p2, p1, Ln1/i;->f:F

    iput p2, p0, Ln1/b;->b:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Ln1/b;->f:Z

    return-object p0
.end method

.method j(Ln1/i;Ln1/i;F)Ln1/b;
    .locals 2

    iget-object v0, p0, Ln1/b;->e:Ln1/b$a;

    const/high16 v1, -0x40800000    # -1.0f

    invoke-interface {v0, p1, v1}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p2, p3}, Ln1/b$a;->f(Ln1/i;F)V

    return-object p0
.end method

.method public k(Ln1/i;Ln1/i;Ln1/i;Ln1/i;F)Ln1/b;
    .locals 2

    iget-object v0, p0, Ln1/b;->e:Ln1/b$a;

    const/high16 v1, -0x40800000    # -1.0f

    invoke-interface {v0, p1, v1}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-interface {p1, p2, v0}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p3, p5}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    neg-float p2, p5

    invoke-interface {p1, p4, p2}, Ln1/b$a;->f(Ln1/i;F)V

    return-object p0
.end method

.method public l(FFFLn1/i;Ln1/i;Ln1/i;Ln1/i;)Ln1/b;
    .locals 4

    const/4 v0, 0x0

    iput v0, p0, Ln1/b;->b:F

    cmpl-float v1, p2, v0

    const/high16 v2, -0x40800000    # -1.0f

    const/high16 v3, 0x3f800000    # 1.0f

    if-eqz v1, :cond_3

    cmpl-float v1, p1, p3

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    cmpl-float v1, p1, v0

    if-nez v1, :cond_1

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p4, v3}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p5, v2}, Ln1/b$a;->f(Ln1/i;F)V

    goto :goto_1

    :cond_1
    cmpl-float v0, p3, v0

    if-nez v0, :cond_2

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p6, v3}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p7, v2}, Ln1/b$a;->f(Ln1/i;F)V

    goto :goto_1

    :cond_2
    div-float/2addr p1, p2

    div-float/2addr p3, p2

    div-float/2addr p1, p3

    iget-object p2, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p2, p4, v3}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p2, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p2, p5, v2}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p2, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p2, p7, p1}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p2, p0, Ln1/b;->e:Ln1/b$a;

    neg-float p1, p1

    invoke-interface {p2, p6, p1}, Ln1/b$a;->f(Ln1/i;F)V

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p4, v3}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p5, v2}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p7, v3}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p6, v2}, Ln1/b$a;->f(Ln1/i;F)V

    :goto_1
    return-object p0
.end method

.method public m(Ln1/i;I)Ln1/b;
    .locals 1

    if-gez p2, :cond_0

    mul-int/lit8 p2, p2, -0x1

    int-to-float p2, p2

    iput p2, p0, Ln1/b;->b:F

    iget-object p2, p0, Ln1/b;->e:Ln1/b$a;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-interface {p2, p1, v0}, Ln1/b$a;->f(Ln1/i;F)V

    goto :goto_0

    :cond_0
    int-to-float p2, p2

    iput p2, p0, Ln1/b;->b:F

    iget-object p2, p0, Ln1/b;->e:Ln1/b$a;

    const/high16 v0, -0x40800000    # -1.0f

    invoke-interface {p2, p1, v0}, Ln1/b$a;->f(Ln1/i;F)V

    :goto_0
    return-object p0
.end method

.method public n(Ln1/i;Ln1/i;I)Ln1/b;
    .locals 2

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    if-gez p3, :cond_0

    mul-int/lit8 p3, p3, -0x1

    const/4 v0, 0x1

    :cond_0
    int-to-float p3, p3

    iput p3, p0, Ln1/b;->b:F

    :cond_1
    const/high16 p3, 0x3f800000    # 1.0f

    const/high16 v1, -0x40800000    # -1.0f

    if-nez v0, :cond_2

    iget-object v0, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v0, p1, v1}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p2, p3}, Ln1/b$a;->f(Ln1/i;F)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v0, p1, p3}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p2, v1}, Ln1/b$a;->f(Ln1/i;F)V

    :goto_0
    return-object p0
.end method

.method public o(Ln1/i;Ln1/i;Ln1/i;I)Ln1/b;
    .locals 2

    const/4 v0, 0x0

    if-eqz p4, :cond_1

    if-gez p4, :cond_0

    mul-int/lit8 p4, p4, -0x1

    const/4 v0, 0x1

    :cond_0
    int-to-float p4, p4

    iput p4, p0, Ln1/b;->b:F

    :cond_1
    const/high16 p4, 0x3f800000    # 1.0f

    const/high16 v1, -0x40800000    # -1.0f

    if-nez v0, :cond_2

    iget-object v0, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v0, p1, v1}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p2, p4}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p3, p4}, Ln1/b$a;->f(Ln1/i;F)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v0, p1, p4}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p2, v1}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p3, v1}, Ln1/b$a;->f(Ln1/i;F)V

    :goto_0
    return-object p0
.end method

.method public p(Ln1/i;Ln1/i;Ln1/i;I)Ln1/b;
    .locals 2

    const/4 v0, 0x0

    if-eqz p4, :cond_1

    if-gez p4, :cond_0

    mul-int/lit8 p4, p4, -0x1

    const/4 v0, 0x1

    :cond_0
    int-to-float p4, p4

    iput p4, p0, Ln1/b;->b:F

    :cond_1
    const/high16 p4, 0x3f800000    # 1.0f

    const/high16 v1, -0x40800000    # -1.0f

    if-nez v0, :cond_2

    iget-object v0, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v0, p1, v1}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p2, p4}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p3, v1}, Ln1/b$a;->f(Ln1/i;F)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v0, p1, p4}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p2, v1}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p3, p4}, Ln1/b$a;->f(Ln1/i;F)V

    :goto_0
    return-object p0
.end method

.method public q(Ln1/i;Ln1/i;Ln1/i;Ln1/i;F)Ln1/b;
    .locals 2

    iget-object v0, p0, Ln1/b;->e:Ln1/b$a;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-interface {v0, p3, v1}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p3, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p3, p4, v1}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p3, p0, Ln1/b;->e:Ln1/b$a;

    const/high16 p4, -0x41000000    # -0.5f

    invoke-interface {p3, p1, p4}, Ln1/b$a;->f(Ln1/i;F)V

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, p2, p4}, Ln1/b$a;->f(Ln1/i;F)V

    neg-float p1, p5

    iput p1, p0, Ln1/b;->b:F

    return-object p0
.end method

.method r()V
    .locals 2

    iget v0, p0, Ln1/b;->b:F

    const/4 v1, 0x0

    cmpg-float v1, v0, v1

    if-gez v1, :cond_0

    const/high16 v1, -0x40800000    # -1.0f

    mul-float/2addr v0, v1

    iput v0, p0, Ln1/b;->b:F

    iget-object v0, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v0}, Ln1/b$a;->c()V

    :cond_0
    return-void
.end method

.method s()Z
    .locals 2

    iget-object v0, p0, Ln1/b;->a:Ln1/i;

    if-eqz v0, :cond_1

    iget-object v0, v0, Ln1/i;->j:Ln1/i$a;

    sget-object v1, Ln1/i$a;->UNRESTRICTED:Ln1/i$a;

    if-eq v0, v1, :cond_0

    iget v0, p0, Ln1/b;->b:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method t(Ln1/i;)Z
    .locals 1

    iget-object v0, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v0, p1}, Ln1/b$a;->j(Ln1/i;)Z

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ln1/b;->A()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Z
    .locals 2

    iget-object v0, p0, Ln1/b;->a:Ln1/i;

    if-nez v0, :cond_0

    iget v0, p0, Ln1/b;->b:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    iget-object v0, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v0}, Ln1/b$a;->a()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public w(Ln1/i;)Ln1/i;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Ln1/b;->x([ZLn1/i;)Ln1/i;

    move-result-object p1

    return-object p1
.end method

.method y(Ln1/i;)V
    .locals 3

    iget-object v0, p0, Ln1/b;->a:Ln1/i;

    const/high16 v1, -0x40800000    # -1.0f

    if-eqz v0, :cond_0

    iget-object v2, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v2, v0, v1}, Ln1/b$a;->f(Ln1/i;F)V

    const/4 v0, 0x0

    iput-object v0, p0, Ln1/b;->a:Ln1/i;

    :cond_0
    iget-object v0, p0, Ln1/b;->e:Ln1/b$a;

    const/4 v2, 0x1

    invoke-interface {v0, p1, v2}, Ln1/b$a;->g(Ln1/i;Z)F

    move-result v0

    mul-float/2addr v0, v1

    iput-object p1, p0, Ln1/b;->a:Ln1/i;

    const/high16 p1, 0x3f800000    # 1.0f

    cmpl-float p1, v0, p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget p1, p0, Ln1/b;->b:F

    div-float/2addr p1, v0

    iput p1, p0, Ln1/b;->b:F

    iget-object p1, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {p1, v0}, Ln1/b$a;->e(F)V

    return-void
.end method

.method public z()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ln1/b;->a:Ln1/i;

    iget-object v0, p0, Ln1/b;->e:Ln1/b$a;

    invoke-interface {v0}, Ln1/b$a;->clear()V

    const/4 v0, 0x0

    iput v0, p0, Ln1/b;->b:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Ln1/b;->f:Z

    return-void
.end method
