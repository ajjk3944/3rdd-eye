.class final LA8/o$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA8/o;->x1()V
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

    iput-object p1, p0, LA8/o$k;->a:LA8/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lk7/b;)V
    .locals 8

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LA8/o$k;->a:LA8/o;

    invoke-static {v0}, LA8/o;->N0(LA8/o;)Lk7/b;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const-string/jumbo p1, "Signal mapper discover ignored object because previous device not confirmed yet"

    invoke-static {p1, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lk7/b;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lk7/b;->b()Landroid/graphics/PointF;

    move-result-object v3

    invoke-virtual {p1}, Lk7/b;->a()F

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v6, "Signal mapper object discovered "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " at "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " with confidence "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v3, p0, LA8/o$k;->a:LA8/o;

    invoke-static {v3}, LA8/o;->L0(LA8/o;)Lcom/ubnt/mlkit/product/a;

    move-result-object v3

    invoke-virtual {p1}, Lk7/b;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lk7/b;->a()F

    move-result v5

    invoke-interface {v3, v4, v5}, Lcom/ubnt/mlkit/product/a;->a(Ljava/lang/String;F)Lcom/ubnt/mlkit/product/a$b;

    move-result-object v3

    if-nez v3, :cond_1

    const-string/jumbo p1, "Signal mapper discover ignored object"

    invoke-static {p1, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_1
    iget-object v3, p0, LA8/o$k;->a:LA8/o;

    invoke-static {v3}, LA8/o;->M0(LA8/o;)LA8/z;

    move-result-object v3

    invoke-virtual {p1}, Lk7/b;->b()Landroid/graphics/PointF;

    move-result-object v4

    iget v4, v4, Landroid/graphics/PointF;->x:F

    invoke-virtual {p1}, Lk7/b;->b()Landroid/graphics/PointF;

    move-result-object v5

    iget v5, v5, Landroid/graphics/PointF;->y:F

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-virtual {v3, v4, v5, v7}, Lh7/g;->z(FFF)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lod/f;

    invoke-virtual {v4}, Lod/f;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lk7/b;->c()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p1}, Lk7/b;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lk7/b;->b()Landroid/graphics/PointF;

    move-result-object p1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is already in map"

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object p1, p0, LA8/o$k;->a:LA8/o;

    invoke-static {p1}, LA8/o;->T0(LA8/o;)Luc/a;

    move-result-object p1

    sget-object v0, Luc/a$a;->TICK:Luc/a$a;

    invoke-interface {p1, v0}, Luc/a;->a(Luc/a$a;)V

    return-void

    :cond_3
    iget-object v0, p0, LA8/o$k;->a:LA8/o;

    invoke-static {v0, p1}, LA8/o;->W0(LA8/o;Lk7/b;)V

    iget-object p1, p0, LA8/o$k;->a:LA8/o;

    invoke-static {p1}, LA8/o;->T0(LA8/o;)Luc/a;

    move-result-object p1

    sget-object v0, Luc/a$a;->TICK:Luc/a$a;

    invoke-interface {p1, v0}, Luc/a;->a(Luc/a$a;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lk7/b;

    invoke-virtual {p0, p1}, LA8/o$k;->a(Lk7/b;)V

    return-void
.end method
