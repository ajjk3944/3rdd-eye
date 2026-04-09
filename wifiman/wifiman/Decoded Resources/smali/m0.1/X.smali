.class public abstract Lm0/X;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()Lm0/X0;
    .locals 2

    new-instance v0, Lm0/W;

    new-instance v1, Landroid/graphics/PathMeasure;

    invoke-direct {v1}, Landroid/graphics/PathMeasure;-><init>()V

    invoke-direct {v0, v1}, Lm0/W;-><init>(Landroid/graphics/PathMeasure;)V

    return-object v0
.end method
