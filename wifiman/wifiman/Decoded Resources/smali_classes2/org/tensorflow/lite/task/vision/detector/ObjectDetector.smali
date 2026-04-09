.class public final Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;
.super Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;
    }
.end annotation


# direct methods
.method private constructor <init>(J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi;-><init>(J)V

    return-void
.end method

.method static synthetic C(IJJLorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;)J
    .locals 0

    invoke-static/range {p0 .. p5}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;->initJniWithModelFdAndOptions(IJJLorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;)J

    move-result-wide p0

    return-wide p0
.end method

.method static synthetic J(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;JLLj/b;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;->S(JLLj/b;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static P(Landroid/content/Context;Ljava/lang/String;Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;)Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;
    .locals 3

    new-instance v0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;

    new-instance v1, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$a;

    invoke-direct {v1}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$a;-><init>()V

    const-string v2, "task_vision_jni"

    invoke-static {p0, v1, v2, p1, p2}, LKj/b;->a(Landroid/content/Context;LKj/b$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)J

    move-result-wide p0

    invoke-direct {v0, p0, p1}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;-><init>(J)V

    return-object v0
.end method

.method private S(JLLj/b;)Ljava/util/List;
    .locals 2

    invoke-virtual {p0}, LKj/a;->a()V

    invoke-virtual {p0}, LKj/a;->h()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;->detectNative(JJ)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private native deinitJni(J)V
.end method

.method private static native detectNative(JJ)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ljava/util/List<",
            "Lorg/tensorflow/lite/task/vision/detector/Detection;",
            ">;"
        }
    .end annotation
.end method

.method private static native initJniWithModelFdAndOptions(IJJLorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;)J
.end method


# virtual methods
.method public T(Lorg/tensorflow/lite/support/image/e;)Ljava/util/List;
    .locals 1

    invoke-static {}, LLj/b;->a()LLj/b$a;

    move-result-object v0

    invoke-virtual {v0}, LLj/b$a;->b()LLj/b;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;->Y(Lorg/tensorflow/lite/support/image/e;LLj/b;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public Y(Lorg/tensorflow/lite/support/image/e;LLj/b;)Ljava/util/List;
    .locals 1

    new-instance v0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$b;

    invoke-direct {v0, p0}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$b;-><init>(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;)V

    invoke-virtual {p0, v0, p1, p2}, Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi;->y(Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$c;Lorg/tensorflow/lite/support/image/e;LLj/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method protected g(J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;->deinitJni(J)V

    return-void
.end method
