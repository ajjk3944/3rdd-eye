.class public abstract Lm0/H;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Landroid/graphics/Canvas;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0}, Landroid/graphics/Canvas;-><init>()V

    sput-object v0, Lm0/H;->a:Landroid/graphics/Canvas;

    return-void
.end method

.method public static final a(Lm0/J0;)Lm0/n0;
    .locals 2

    new-instance v0, Lm0/G;

    invoke-direct {v0}, Lm0/G;-><init>()V

    new-instance v1, Landroid/graphics/Canvas;

    invoke-static {p0}, Lm0/O;->b(Lm0/J0;)Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-direct {v1, p0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1}, Lm0/G;->z(Landroid/graphics/Canvas;)V

    return-object v0
.end method

.method public static final b(Landroid/graphics/Canvas;)Lm0/n0;
    .locals 1

    new-instance v0, Lm0/G;

    invoke-direct {v0}, Lm0/G;-><init>()V

    invoke-virtual {v0, p0}, Lm0/G;->z(Landroid/graphics/Canvas;)V

    return-object v0
.end method

.method public static final synthetic c()Landroid/graphics/Canvas;
    .locals 1

    sget-object v0, Lm0/H;->a:Landroid/graphics/Canvas;

    return-object v0
.end method

.method public static final d(Lm0/n0;)Landroid/graphics/Canvas;
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lm0/G;

    invoke-virtual {p0}, Lm0/G;->a()Landroid/graphics/Canvas;

    move-result-object p0

    return-object p0
.end method
