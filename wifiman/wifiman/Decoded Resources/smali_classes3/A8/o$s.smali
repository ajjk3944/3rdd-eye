.class public final LA8/o$s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA8/o;->E1(Z)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LA8/o;

.field final synthetic b:Z


# direct methods
.method public constructor <init>(LA8/o;Z)V
    .locals 0

    iput-object p1, p0, LA8/o$s;->a:LA8/o;

    iput-boolean p2, p0, LA8/o$s;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 12

    :try_start_0
    iget-object v0, p0, LA8/o$s;->a:LA8/o;

    invoke-static {v0}, LA8/o;->N0(LA8/o;)Lk7/b;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v2, p0, LA8/o$s;->a:LA8/o;

    invoke-static {v2}, LA8/o;->L0(LA8/o;)Lcom/ubnt/mlkit/product/a;

    move-result-object v2

    invoke-virtual {v0}, Lk7/b;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lk7/b;->a()F

    move-result v4

    invoke-interface {v2, v3, v4}, Lcom/ubnt/mlkit/product/a;->a(Ljava/lang/String;F)Lcom/ubnt/mlkit/product/a$b;

    move-result-object v2

    if-nez v2, :cond_0

    const-string/jumbo v0, "Signal mapper discover ignored object"

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    iget-object v3, p0, LA8/o$s;->a:LA8/o;

    invoke-static {v3}, LA8/o;->M0(LA8/o;)LA8/z;

    move-result-object v3

    invoke-virtual {v0}, Lk7/b;->b()Landroid/graphics/PointF;

    move-result-object v4

    iget v4, v4, Landroid/graphics/PointF;->x:F

    invoke-virtual {v0}, Lk7/b;->b()Landroid/graphics/PointF;

    move-result-object v5

    iget v5, v5, Landroid/graphics/PointF;->y:F

    new-instance v6, Lod/f;

    new-instance v7, LW7/d;

    const/4 v8, 0x0

    invoke-direct {v7, v8, v8}, LW7/d;-><init>(II)V

    invoke-virtual {v0}, Lk7/b;->c()Ljava/lang/String;

    move-result-object v0

    iget-boolean v8, p0, LA8/o$s;->b:Z

    if-nez v8, :cond_1

    new-instance v8, Lod/f$a;

    invoke-static {v2}, LA8/a;->b(Lcom/ubnt/mlkit/product/a$b;)I

    move-result v2

    iget-object v9, p0, LA8/o$s;->a:LA8/o;

    invoke-static {v9}, LA8/o;->K0(LA8/o;)Landroid/content/Context;

    move-result-object v10

    const/16 v11, 0x24

    invoke-static {v9, v10, v11}, LA8/o;->J0(LA8/o;Landroid/content/Context;I)I

    move-result v9

    invoke-direct {v8, v2, v9}, Lod/f$a;-><init>(II)V

    goto :goto_0

    :cond_1
    move-object v8, v1

    :goto_0
    invoke-direct {v6, v7, v0, v8}, Lod/f;-><init>(LW7/d;Ljava/lang/String;Lod/f$a;)V

    invoke-virtual {v3, v4, v5, v6}, LA8/z;->t0(FFLod/f;)V

    :cond_2
    iget-object v0, p0, LA8/o$s;->a:LA8/o;

    invoke-static {v0, v1}, LA8/o;->W0(LA8/o;Lk7/b;)V

    :goto_1
    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method
