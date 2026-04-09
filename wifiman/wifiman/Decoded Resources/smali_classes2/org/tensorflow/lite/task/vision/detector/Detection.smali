.class public abstract Lorg/tensorflow/lite/task/vision/detector/Detection;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation build Lorg/tensorflow/lite/annotations/UsedByReflection;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Landroid/graphics/RectF;Ljava/util/List;)Lorg/tensorflow/lite/task/vision/detector/Detection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/RectF;",
            "Ljava/util/List<",
            "Lorg/tensorflow/lite/support/label/Category;",
            ">;)",
            "Lorg/tensorflow/lite/task/vision/detector/Detection;"
        }
    .end annotation

    .annotation build Lorg/tensorflow/lite/annotations/UsedByReflection;
    .end annotation

    new-instance v0, Lorg/tensorflow/lite/task/vision/detector/a;

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1, p0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lorg/tensorflow/lite/task/vision/detector/a;-><init>(Landroid/graphics/RectF;Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Landroid/graphics/RectF;
.end method

.method public abstract b()Ljava/util/List;
.end method
