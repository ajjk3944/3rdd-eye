.class Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;->Y(Lorg/tensorflow/lite/support/image/e;LLj/b;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;


# direct methods
.method constructor <init>(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;)V
    .locals 0

    iput-object p1, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$b;->a:Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(JIILLj/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$b;->b(JIILLj/b;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public b(JIILLj/b;)Ljava/util/List;
    .locals 0

    iget-object p3, p0, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector$b;->a:Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;

    invoke-static {p3, p1, p2, p5}, Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;->J(Lorg/tensorflow/lite/task/vision/detector/ObjectDetector;JLLj/b;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
