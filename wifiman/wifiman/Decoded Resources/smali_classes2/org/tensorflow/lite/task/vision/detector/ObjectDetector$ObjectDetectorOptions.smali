.class public Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ObjectDetectorOptions"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;
    }
.end annotation

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


# direct methods
.method private constructor <init>(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->b(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;->a:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->c(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;)I

    move-result v0

    iput v0, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;->b:I

    .line 5
    invoke-static {p1}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->d(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;)F

    move-result v0

    iput v0, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;->c:F

    .line 6
    invoke-static {p1}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->e(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;)Z

    move-result v0

    iput-boolean v0, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;->d:Z

    .line 7
    invoke-static {p1}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->f(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;->e:Ljava/util/List;

    .line 8
    invoke-static {p1}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->g(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;->f:Ljava/util/List;

    .line 9
    invoke-static {p1}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->a(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;)I

    move-result p1

    iput p1, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;->g:I

    return-void
.end method

.method synthetic constructor <init>(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;-><init>(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;)V

    return-void
.end method

.method public static a()Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;
    .locals 2

    new-instance v0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;-><init>(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$a;)V

    return-object v0
.end method


# virtual methods
.method public getDisplayNamesLocale()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/tensorflow/lite/annotations/UsedByReflection;
    .end annotation

    iget-object v0, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getIsScoreThresholdSet()Z
    .locals 1
    .annotation build Lorg/tensorflow/lite/annotations/UsedByReflection;
    .end annotation

    iget-boolean v0, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;->d:Z

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

    iget-object v1, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;->e:Ljava/util/List;

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

    iget-object v1, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;->f:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getMaxResults()I
    .locals 1
    .annotation build Lorg/tensorflow/lite/annotations/UsedByReflection;
    .end annotation

    iget v0, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;->b:I

    return v0
.end method

.method public getNumThreads()I
    .locals 1
    .annotation build Lorg/tensorflow/lite/annotations/UsedByReflection;
    .end annotation

    iget v0, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;->g:I

    return v0
.end method

.method public getScoreThreshold()F
    .locals 1
    .annotation build Lorg/tensorflow/lite/annotations/UsedByReflection;
    .end annotation

    iget v0, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;->c:F

    return v0
.end method
