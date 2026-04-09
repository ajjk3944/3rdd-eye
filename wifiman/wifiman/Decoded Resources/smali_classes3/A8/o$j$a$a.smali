.class public final LA8/o$j$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA8/o$j$a;->a(LA8/o$c;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LA8/o;

.field final synthetic b:Landroid/graphics/PointF;

.field final synthetic c:LA8/o$c;


# direct methods
.method public constructor <init>(LA8/o;Landroid/graphics/PointF;LA8/o$c;)V
    .locals 0

    iput-object p1, p0, LA8/o$j$a$a;->a:LA8/o;

    iput-object p2, p0, LA8/o$j$a$a;->b:Landroid/graphics/PointF;

    iput-object p3, p0, LA8/o$j$a$a;->c:LA8/o$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, LA8/o$j$a$a;->a:LA8/o;

    invoke-static {v0}, LA8/o;->M0(LA8/o;)LA8/z;

    move-result-object v0

    iget-object v1, p0, LA8/o$j$a$a;->b:Landroid/graphics/PointF;

    iget v2, v1, Landroid/graphics/PointF;->x:F

    iget v1, v1, Landroid/graphics/PointF;->y:F

    iget-object v3, p0, LA8/o$j$a$a;->c:LA8/o$c;

    invoke-virtual {v3}, LA8/o$c;->c()LS8/l;

    move-result-object v3

    invoke-virtual {v0, v2, v1, v3}, LA8/z;->s0(FFLS8/l;)V

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
