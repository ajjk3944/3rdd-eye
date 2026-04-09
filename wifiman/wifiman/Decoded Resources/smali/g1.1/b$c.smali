.class Lg1/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg1/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field a:F

.field b:F

.field c:F

.field d:Z


# direct methods
.method constructor <init>(FF)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lg1/b$c;->d:Z

    iput p1, p0, Lg1/b$c;->a:F

    iput p2, p0, Lg1/b$c;->b:F

    iput p1, p0, Lg1/b$c;->c:F

    return-void
.end method


# virtual methods
.method public value()F
    .locals 2

    iget-boolean v0, p0, Lg1/b$c;->d:Z

    if-nez v0, :cond_0

    iget v0, p0, Lg1/b$c;->c:F

    iget v1, p0, Lg1/b$c;->b:F

    add-float/2addr v0, v1

    iput v0, p0, Lg1/b$c;->c:F

    :cond_0
    iget v0, p0, Lg1/b$c;->c:F

    return v0
.end method
