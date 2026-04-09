.class public final Lm0/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/X0;


# instance fields
.field private final a:Landroid/graphics/PathMeasure;


# direct methods
.method public constructor <init>(Landroid/graphics/PathMeasure;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/W;->a:Landroid/graphics/PathMeasure;

    return-void
.end method


# virtual methods
.method public a(Lm0/U0;Z)V
    .locals 2

    iget-object v0, p0, Lm0/W;->a:Landroid/graphics/PathMeasure;

    if-eqz p1, :cond_1

    instance-of v1, p1, Lm0/T;

    if-eqz v1, :cond_0

    check-cast p1, Lm0/T;

    invoke-virtual {p1}, Lm0/T;->v()Landroid/graphics/Path;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Unable to obtain android.graphics.Path"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1, p2}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    return-void
.end method

.method public b(FFLm0/U0;Z)Z
    .locals 2

    iget-object v0, p0, Lm0/W;->a:Landroid/graphics/PathMeasure;

    instance-of v1, p3, Lm0/T;

    if-eqz v1, :cond_0

    check-cast p3, Lm0/T;

    invoke-virtual {p3}, Lm0/T;->v()Landroid/graphics/Path;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Unable to obtain android.graphics.Path"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c()F
    .locals 1

    iget-object v0, p0, Lm0/W;->a:Landroid/graphics/PathMeasure;

    invoke-virtual {v0}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v0

    return v0
.end method
