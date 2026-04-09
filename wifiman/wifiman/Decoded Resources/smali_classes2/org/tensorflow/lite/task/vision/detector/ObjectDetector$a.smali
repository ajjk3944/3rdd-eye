.class Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKj/b$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;->P(Landroid/content/Context;Ljava/lang/String;Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;)Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(IJJLjava/lang/Object;)J
    .locals 0

    check-cast p6, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;

    invoke-virtual/range {p0 .. p6}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$a;->b(IJJLorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;)J

    move-result-wide p1

    return-wide p1
.end method

.method public b(IJJLorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;)J
    .locals 0

    invoke-static/range {p1 .. p6}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;->C(IJJLorg/tensorflow/lite/task/vision/detector/ObjectDetector$ObjectDetectorOptions;)J

    move-result-wide p1

    return-wide p1
.end method
