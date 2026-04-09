.class public abstract Ly6/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Landroid/graphics/Paint$FontMetrics;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/graphics/Paint$FontMetrics;

    invoke-direct {v0}, Landroid/graphics/Paint$FontMetrics;-><init>()V

    sput-object v0, Ly6/h;->a:Landroid/graphics/Paint$FontMetrics;

    return-void
.end method

.method public static final a(Landroid/graphics/Paint;)F
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ly6/h;->a:Landroid/graphics/Paint$FontMetrics;

    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->getFontMetrics(Landroid/graphics/Paint$FontMetrics;)F

    iget p0, v0, Landroid/graphics/Paint$FontMetrics;->bottom:F

    iget v1, v0, Landroid/graphics/Paint$FontMetrics;->top:F

    sub-float/2addr p0, v1

    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->leading:F

    add-float/2addr p0, v0

    return p0
.end method
