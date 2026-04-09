.class abstract Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "b"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(JJ[B)Lorg/tensorflow/lite/task/vision/core/BaseVisionTaskApi$b;
    .locals 7

    new-instance v6, Lorg/tensorflow/lite/task/vision/core/a;

    move-object v0, v6

    move-wide v1, p0

    move-wide v3, p2

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lorg/tensorflow/lite/task/vision/core/a;-><init>(JJ[B)V

    return-object v6
.end method


# virtual methods
.method abstract b()[B
.end method

.method abstract c()J
.end method

.method abstract d()J
.end method
