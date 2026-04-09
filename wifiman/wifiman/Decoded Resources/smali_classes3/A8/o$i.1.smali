.class final LA8/o$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA8/o;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LA8/o;


# direct methods
.method constructor <init>(LA8/o;)V
    .locals 0

    iput-object p1, p0, LA8/o$i;->a:LA8/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LA8/o$b;)Landroid/graphics/PointF;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/graphics/PointF;

    iget-object v0, p0, LA8/o$i;->a:LA8/o;

    invoke-static {v0}, LA8/o;->M0(LA8/o;)LA8/z;

    move-result-object v0

    invoke-virtual {v0}, Lh7/g;->B()Landroid/graphics/PointF;

    move-result-object v0

    iget v0, v0, Landroid/graphics/PointF;->x:F

    iget-object v1, p0, LA8/o$i;->a:LA8/o;

    invoke-static {v1}, LA8/o;->M0(LA8/o;)LA8/z;

    move-result-object v1

    invoke-virtual {v1}, Lh7/g;->B()Landroid/graphics/PointF;

    move-result-object v1

    iget v1, v1, Landroid/graphics/PointF;->y:F

    invoke-direct {p1, v0, v1}, Landroid/graphics/PointF;-><init>(FF)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA8/o$b;

    invoke-virtual {p0, p1}, LA8/o$i;->a(LA8/o$b;)Landroid/graphics/PointF;

    move-result-object p1

    return-object p1
.end method
