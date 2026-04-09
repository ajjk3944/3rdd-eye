.class abstract Landroidx/transition/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Landroidx/transition/B;

.field static final b:Landroid/util/Property;

.field static final c:Landroid/util/Property;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, Landroidx/transition/J;

    invoke-direct {v0}, Landroidx/transition/J;-><init>()V

    sput-object v0, Landroidx/transition/y;->a:Landroidx/transition/B;

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/transition/I;

    invoke-direct {v0}, Landroidx/transition/I;-><init>()V

    sput-object v0, Landroidx/transition/y;->a:Landroidx/transition/B;

    :goto_0
    new-instance v0, Landroidx/transition/y$a;

    const-class v1, Ljava/lang/Float;

    const-string v2, "translationAlpha"

    invoke-direct {v0, v1, v2}, Landroidx/transition/y$a;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/transition/y;->b:Landroid/util/Property;

    new-instance v0, Landroidx/transition/y$b;

    const-class v1, Landroid/graphics/Rect;

    const-string v2, "clipBounds"

    invoke-direct {v0, v1, v2}, Landroidx/transition/y$b;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Landroidx/transition/y;->c:Landroid/util/Property;

    return-void
.end method

.method static a(Landroid/view/View;)V
    .locals 1

    sget-object v0, Landroidx/transition/y;->a:Landroidx/transition/B;

    invoke-virtual {v0, p0}, Landroidx/transition/B;->a(Landroid/view/View;)V

    return-void
.end method

.method static b(Landroid/view/View;)F
    .locals 1

    sget-object v0, Landroidx/transition/y;->a:Landroidx/transition/B;

    invoke-virtual {v0, p0}, Landroidx/transition/B;->b(Landroid/view/View;)F

    move-result p0

    return p0
.end method

.method static c(Landroid/view/View;)V
    .locals 1

    sget-object v0, Landroidx/transition/y;->a:Landroidx/transition/B;

    invoke-virtual {v0, p0}, Landroidx/transition/B;->c(Landroid/view/View;)V

    return-void
.end method

.method static d(Landroid/view/View;IIII)V
    .locals 6

    sget-object v0, Landroidx/transition/y;->a:Landroidx/transition/B;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Landroidx/transition/B;->d(Landroid/view/View;IIII)V

    return-void
.end method

.method static e(Landroid/view/View;F)V
    .locals 1

    sget-object v0, Landroidx/transition/y;->a:Landroidx/transition/B;

    invoke-virtual {v0, p0, p1}, Landroidx/transition/B;->e(Landroid/view/View;F)V

    return-void
.end method

.method static f(Landroid/view/View;I)V
    .locals 1

    sget-object v0, Landroidx/transition/y;->a:Landroidx/transition/B;

    invoke-virtual {v0, p0, p1}, Landroidx/transition/B;->f(Landroid/view/View;I)V

    return-void
.end method

.method static g(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-object v0, Landroidx/transition/y;->a:Landroidx/transition/B;

    invoke-virtual {v0, p0, p1}, Landroidx/transition/B;->g(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method

.method static h(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-object v0, Landroidx/transition/y;->a:Landroidx/transition/B;

    invoke-virtual {v0, p0, p1}, Landroidx/transition/B;->h(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method
