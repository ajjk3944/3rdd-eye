.class final enum Lorg/tensorflow/lite/support/image/b$f;
.super Lorg/tensorflow/lite/support/image/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/tensorflow/lite/support/image/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4010
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;II)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lorg/tensorflow/lite/support/image/b;-><init>(Ljava/lang/String;IILorg/tensorflow/lite/support/image/b$a;)V

    return-void
.end method


# virtual methods
.method getNumElements(II)I
    .locals 0

    invoke-static {p1, p2}, Lorg/tensorflow/lite/support/image/b;->access$200(II)I

    move-result p1

    return p1
.end method
