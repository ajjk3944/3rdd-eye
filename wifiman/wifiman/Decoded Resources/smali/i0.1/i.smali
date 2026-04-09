.class public abstract Li0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Li0/b;)J
    .locals 2

    invoke-virtual {p0}, Li0/b;->a()Landroid/view/DragEvent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/DragEvent;->getX()F

    move-result v0

    invoke-virtual {p0}, Li0/b;->a()Landroid/view/DragEvent;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/DragEvent;->getY()F

    move-result p0

    invoke-static {v0, p0}, Ll0/h;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final b(Li0/b;)Landroid/view/DragEvent;
    .locals 0

    invoke-virtual {p0}, Li0/b;->a()Landroid/view/DragEvent;

    move-result-object p0

    return-object p0
.end method
