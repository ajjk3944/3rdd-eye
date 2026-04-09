.class public final Lg7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lg7/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg7/b;

    invoke-direct {v0}, Lg7/b;-><init>()V

    sput-object v0, Lg7/b;->a:Lg7/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I[F)V
    .locals 3

    const-string/jumbo v0, "dst"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x437f0000    # 255.0f

    div-float/2addr v0, v1

    const/4 v2, 0x0

    aput v0, p2, v2

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v1

    const/4 v2, 0x1

    aput v0, p2, v2

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v1

    const/4 v2, 0x2

    aput v0, p2, v2

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p1, v1

    const/4 v0, 0x3

    aput p1, p2, v0

    return-void
.end method
