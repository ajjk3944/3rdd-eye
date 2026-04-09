.class public abstract Le6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/graphics/Canvas;ILu6/e;LD6/a;Lj6/b;Landroid/graphics/RectF;FLi6/a;)Le6/a;
    .locals 10

    const-string/jumbo v0, "canvas"

    move-object v4, p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "measureContext"

    move-object v2, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "segmentProperties"

    move-object v7, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "chartBounds"

    move-object v3, p5

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "autoScaleUp"

    move-object/from16 v9, p7

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le6/b$a;

    move-object v1, v0

    move v5, p1

    move-object v6, p3

    move/from16 v8, p6

    invoke-direct/range {v1 .. v9}, Le6/b$a;-><init>(Lu6/e;Landroid/graphics/RectF;Landroid/graphics/Canvas;ILD6/a;Lj6/b;FLi6/a;)V

    return-object v0
.end method
