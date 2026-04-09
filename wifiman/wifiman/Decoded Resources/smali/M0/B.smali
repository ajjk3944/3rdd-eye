.class final LM0/B;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LM0/B;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/B;

    invoke-direct {v0}, LM0/B;-><init>()V

    sput-object v0, LM0/B;->a:LM0/B;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;[II[FIILandroid/graphics/fonts/Font;Landroid/graphics/Paint;)V
    .locals 0

    invoke-static/range {p1 .. p8}, LM0/z;->a(Landroid/graphics/Canvas;[II[FIILandroid/graphics/fonts/Font;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final b(Landroid/graphics/Canvas;Landroid/graphics/NinePatch;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    .locals 0

    invoke-static {p1, p2, p3, p4}, LM0/y;->a(Landroid/graphics/Canvas;Landroid/graphics/NinePatch;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final c(Landroid/graphics/Canvas;Landroid/graphics/NinePatch;Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    .locals 0

    invoke-static {p1, p2, p3, p4}, LM0/A;->a(Landroid/graphics/Canvas;Landroid/graphics/NinePatch;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    return-void
.end method
