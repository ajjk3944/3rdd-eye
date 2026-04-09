.class public final Lv6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lv6/a;

.field private static b:Z

.field private static c:F

.field private static d:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv6/a;

    invoke-direct {v0}, Lv6/a;-><init>()V

    sput-object v0, Lv6/a;->a:Lv6/a;

    const/high16 v0, 0x3f800000    # 1.0f

    sput v0, Lv6/a;->c:F

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const v1, -0xff01

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    sput-object v0, Lv6/a;->d:Landroid/graphics/Paint;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lu6/b;FFFF)V
    .locals 8

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, Lv6/a;->b:Z

    if-eqz v0, :cond_0

    sget-object v0, Lv6/a;->d:Landroid/graphics/Paint;

    sget v1, Lv6/a;->c:F

    invoke-interface {p1, v1}, Lu6/e;->g(F)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-interface {p1}, Lu6/b;->d()Landroid/graphics/Canvas;

    move-result-object v2

    sget-object v7, Lv6/a;->d:Landroid/graphics/Paint;

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method
