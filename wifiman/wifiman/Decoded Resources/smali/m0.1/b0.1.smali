.class public final Lm0/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lm0/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm0/b0;

    invoke-direct {v0}, Lm0/b0;-><init>()V

    sput-object v0, Lm0/b0;->a:Lm0/b0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/graphics/Bitmap;)Ln0/c;
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getColorSpace()Landroid/graphics/ColorSpace;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lm0/J;->b(Landroid/graphics/ColorSpace;)Ln0/c;

    move-result-object p0

    if-nez p0, :cond_1

    :cond_0
    sget-object p0, Ln0/g;->a:Ln0/g;

    invoke-virtual {p0}, Ln0/g;->w()Ln0/x;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static final b(IIIZLn0/c;)Landroid/graphics/Bitmap;
    .locals 6

    invoke-static {p2}, Lm0/O;->d(I)Landroid/graphics/Bitmap$Config;

    move-result-object v3

    invoke-static {p4}, Lm0/J;->a(Ln0/c;)Landroid/graphics/ColorSpace;

    move-result-object v5

    const/4 v0, 0x0

    move v1, p0

    move v2, p1

    move v4, p3

    invoke-static/range {v0 .. v5}, Landroid/graphics/Bitmap;->createBitmap(Landroid/util/DisplayMetrics;IILandroid/graphics/Bitmap$Config;ZLandroid/graphics/ColorSpace;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method
