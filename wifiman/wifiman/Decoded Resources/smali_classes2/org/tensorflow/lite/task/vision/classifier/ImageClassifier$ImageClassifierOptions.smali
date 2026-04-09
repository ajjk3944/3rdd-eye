.class public Lorg/tensorflow/lite/task/vision/classifier/ImageClassifier$ImageClassifierOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lorg/tensorflow/lite/annotations/UsedByReflection;
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:F

.field private final d:Z

.field private final e:Ljava/util/List;

.field private final f:Ljava/util/List;

.field private final g:I


# virtual methods
.method public getDisplayNamesLocale()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/tensorflow/lite/annotations/UsedByReflection;
    .end annotation

    iget-object v0, p0, Lorg/tensorflow/lite/task/vision/classifier/ImageClassifier$ImageClassifierOptions;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getIsScoreThresholdSet()Z
    .locals 1
    .annotation build Lorg/tensorflow/lite/annotations/UsedByReflection;
    .end annotation

    iget-boolean v0, p0, Lorg/tensorflow/lite/task/vision/classifier/ImageClassifier$ImageClassifierOptions;->d:Z

    return v0
.end method

.method public getLabelAllowList()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/tensorflow/lite/annotations/UsedByReflection;
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/tensorflow/lite/task/vision/classifier/ImageClassifier$ImageClassifierOptions;->e:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getLabelDenyList()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/tensorflow/lite/annotations/UsedByReflection;
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/tensorflow/lite/task/vision/classifier/ImageClassifier$ImageClassifierOptions;->f:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getMaxResults()I
    .locals 1
    .annotation build Lorg/tensorflow/lite/annotations/UsedByReflection;
    .end annotation

    iget v0, p0, Lorg/tensorflow/lite/task/vision/classifier/ImageClassifier$ImageClassifierOptions;->b:I

    return v0
.end method

.method public getNumThreads()I
    .locals 1
    .annotation build Lorg/tensorflow/lite/annotations/UsedByReflection;
    .end annotation

    iget v0, p0, Lorg/tensorflow/lite/task/vision/classifier/ImageClassifier$ImageClassifierOptions;->g:I

    return v0
.end method

.method public getScoreThreshold()F
    .locals 1
    .annotation build Lorg/tensorflow/lite/annotations/UsedByReflection;
    .end annotation

    iget v0, p0, Lorg/tensorflow/lite/task/vision/classifier/ImageClassifier$ImageClassifierOptions;->c:F

    return v0
.end method
