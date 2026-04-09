.class final Lh7/j$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh7/j;->e()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh7/j;


# direct methods
.method constructor <init>(Lh7/j;)V
    .locals 0

    iput-object p1, p0, Lh7/j$c;->a:Lh7/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Le7/a;)V
    .locals 3

    const-string/jumbo v0, "position"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/graphics/PointF;

    invoke-virtual {p1}, Le7/a;->a()F

    move-result v1

    neg-float v1, v1

    invoke-virtual {p1}, Le7/a;->b()F

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    iget-object v1, p0, Lh7/j$c;->a:Lh7/j;

    invoke-static {v1}, Lh7/j;->c(Lh7/j;)Lh7/g;

    move-result-object v1

    invoke-virtual {v1, v0}, Lh7/g;->W(Landroid/graphics/PointF;)V

    iget-object v0, p0, Lh7/j$c;->a:Lh7/j;

    invoke-static {v0}, Lh7/j;->c(Lh7/j;)Lh7/g;

    move-result-object v0

    invoke-virtual {p1}, Le7/a;->c()F

    move-result p1

    invoke-virtual {v0, p1}, Lh7/g;->X(F)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Le7/a;

    invoke-virtual {p0, p1}, Lh7/j$c;->a(Le7/a;)V

    return-void
.end method
