.class public Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:F

.field private d:Z

.field private e:Ljava/util/List;

.field private f:Ljava/util/List;

.field private g:I


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string v0, "en"

    iput-object v0, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->a:Ljava/lang/String;

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->b:I

    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->d:Z

    .line 6
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->e:Ljava/util/List;

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->f:Ljava/util/List;

    .line 8
    iput v0, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->g:I

    return-void
.end method

.method synthetic constructor <init>(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;)I
    .locals 0

    iget p0, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->g:I

    return p0
.end method

.method static synthetic b(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;)I
    .locals 0

    iget p0, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->b:I

    return p0
.end method

.method static synthetic d(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;)F
    .locals 0

    iget p0, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->c:F

    return p0
.end method

.method static synthetic e(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;)Z
    .locals 0

    iget-boolean p0, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->d:Z

    return p0
.end method

.method static synthetic f(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->e:Ljava/util/List;

    return-object p0
.end method

.method static synthetic g(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->f:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public h()Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;
    .locals 2

    new-instance v0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;-><init>(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$a;)V

    return-object v0
.end method

.method public i(F)Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;
    .locals 0

    iput p1, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->c:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions$a;->d:Z

    return-object p0
.end method
