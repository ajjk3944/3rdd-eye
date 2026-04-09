.class public abstract Lorg/tensorflow/lite/task/vision/segmenter/ColoredLabel;
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

.method public static create(Ljava/lang/String;Ljava/lang/String;I)Lorg/tensorflow/lite/task/vision/segmenter/ColoredLabel;
    .locals 1
    .annotation build Lorg/tensorflow/lite/annotations/UsedByReflection;
    .end annotation

    new-instance v0, Lorg/tensorflow/lite/task/vision/segmenter/a;

    invoke-direct {v0, p0, p1, p2}, Lorg/tensorflow/lite/task/vision/segmenter/a;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()Ljava/lang/String;
.end method
