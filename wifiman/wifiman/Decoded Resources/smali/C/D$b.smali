.class public final LC/D$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY0/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:F

.field private final b:F


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, LC/D$b;->a:F

    iput v0, p0, LC/D$b;->b:F

    return-void
.end method


# virtual methods
.method public getDensity()F
    .locals 1

    iget v0, p0, LC/D$b;->a:F

    return v0
.end method

.method public y()F
    .locals 1

    iget v0, p0, LC/D$b;->b:F

    return v0
.end method
