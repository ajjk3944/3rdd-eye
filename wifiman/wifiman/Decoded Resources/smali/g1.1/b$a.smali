.class Lg1/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg1/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:F

.field b:F

.field c:F

.field d:Z

.field e:Ljava/lang/String;

.field f:Ljava/lang/String;

.field g:F

.field h:F

.field i:F


# direct methods
.method constructor <init>(FFFLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lg1/b$a;->d:Z

    const/4 v0, 0x0

    iput v0, p0, Lg1/b$a;->g:F

    iput p1, p0, Lg1/b$a;->a:F

    iput p2, p0, Lg1/b$a;->b:F

    iput p3, p0, Lg1/b$a;->c:F

    const-string p3, ""

    if-nez p4, :cond_0

    move-object p4, p3

    :cond_0
    iput-object p4, p0, Lg1/b$a;->e:Ljava/lang/String;

    if-nez p5, :cond_1

    move-object p5, p3

    :cond_1
    iput-object p5, p0, Lg1/b$a;->f:Ljava/lang/String;

    iput p2, p0, Lg1/b$a;->i:F

    iput p1, p0, Lg1/b$a;->h:F

    return-void
.end method


# virtual methods
.method public a()Ljava/util/ArrayList;
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget v1, p0, Lg1/b$a;->h:F

    float-to-int v1, v1

    iget v2, p0, Lg1/b$a;->i:F

    float-to-int v2, v2

    move v3, v1

    :goto_0
    if-gt v1, v2, :cond_0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lg1/b$a;->e:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lg1/b$a;->f:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v4, p0, Lg1/b$a;->c:F

    float-to-int v4, v4

    add-int/2addr v3, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public value()F
    .locals 2

    iget v0, p0, Lg1/b$a;->g:F

    iget v1, p0, Lg1/b$a;->i:F

    cmpl-float v1, v0, v1

    if-ltz v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lg1/b$a;->d:Z

    :cond_0
    iget-boolean v1, p0, Lg1/b$a;->d:Z

    if-nez v1, :cond_1

    iget v1, p0, Lg1/b$a;->c:F

    add-float/2addr v0, v1

    iput v0, p0, Lg1/b$a;->g:F

    :cond_1
    iget v0, p0, Lg1/b$a;->g:F

    return v0
.end method
