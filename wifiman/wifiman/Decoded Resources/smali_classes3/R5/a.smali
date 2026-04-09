.class public final LR5/a;
.super Lr6/a;
.source "SourceFile"


# instance fields
.field private final b:Lm0/l0;

.field private final c:Landroid/graphics/Matrix;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lm0/l0;)V
    .locals 1

    const-string/jumbo v0, "brush"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lr6/a;-><init>()V

    iput-object p1, p0, LR5/a;->b:Lm0/l0;

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, LR5/a;->c:Landroid/graphics/Matrix;

    return-void
.end method


# virtual methods
.method public c(Lu6/b;FFFF)Landroid/graphics/Shader;
    .locals 2

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lm0/S;->a()Lm0/S0;

    move-result-object p1

    iget-object v0, p0, LR5/a;->b:Lm0/l0;

    sub-float p4, p2, p4

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result p4

    sub-float p5, p3, p5

    invoke-static {p5}, Ljava/lang/Math;->abs(F)F

    move-result p5

    invoke-static {p4, p5}, Ll0/n;->a(FF)J

    move-result-wide p4

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, p4, p5, p1, v1}, Lm0/l0;->a(JLm0/S0;F)V

    invoke-interface {p1}, Lm0/S0;->z()Landroid/graphics/Shader;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p4, p0, LR5/a;->c:Landroid/graphics/Matrix;

    invoke-virtual {p4, p2, p3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    iget-object p2, p0, LR5/a;->c:Landroid/graphics/Matrix;

    invoke-virtual {p1, p2}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    iget-object p2, p0, LR5/a;->c:Landroid/graphics/Matrix;

    invoke-virtual {p2}, Landroid/graphics/Matrix;->reset()V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p2, "Required value was null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
