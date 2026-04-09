.class public final Lo6/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo6/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lu6/b;Landroid/graphics/Paint;Landroid/graphics/Path;FFFF)V
    .locals 1

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "paint"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "path"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, p4, p5}, Landroid/graphics/Path;->moveTo(FF)V

    invoke-virtual {p3, p6, p5}, Landroid/graphics/Path;->lineTo(FF)V

    invoke-virtual {p3, p6, p7}, Landroid/graphics/Path;->lineTo(FF)V

    invoke-virtual {p3, p4, p7}, Landroid/graphics/Path;->lineTo(FF)V

    invoke-virtual {p3}, Landroid/graphics/Path;->close()V

    invoke-interface {p1}, Lu6/b;->d()Landroid/graphics/Canvas;

    move-result-object p1

    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method
