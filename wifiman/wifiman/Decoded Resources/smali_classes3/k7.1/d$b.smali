.class final Lk7/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk7/d;-><init>(Landroid/content/Context;FJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lk7/d;


# direct methods
.method constructor <init>(Lk7/d;)V
    .locals 0

    iput-object p1, p0, Lk7/d$b;->a:Lk7/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lk7/d;Landroid/media/Image;)V
    .locals 0

    invoke-static {p0, p1}, Lk7/d$b;->c(Lk7/d;Landroid/media/Image;)V

    return-void
.end method

.method private static final c(Lk7/d;Landroid/media/Image;)V
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p0, v0}, Lk7/d;->g(Lk7/d;Ljava/lang/Long;)V

    invoke-virtual {p1}, Landroid/media/Image;->close()V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lk7/d$a;

    invoke-virtual {p0, p1}, Lk7/d$b;->b(Lk7/d$a;)LDj/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lk7/d$a;)LDj/a;
    .locals 9

    invoke-virtual {p1}, Lk7/d$a;->a()Landroid/media/Image;

    move-result-object v0

    invoke-virtual {p1}, Lk7/d$a;->b()I

    move-result p1

    iget-object v1, p0, Lk7/d$b;->a:Lk7/d;

    invoke-static {v1}, Lk7/d;->c(Lk7/d;)LD7/d;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, LD7/d;->a(Landroid/media/Image;I)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, Lk7/d$b;->a:Lk7/d;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LD7/c;

    invoke-static {v1}, Lk7/d;->d(Lk7/d;)Lcom/google/ar/core/Frame;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-static {v1}, Lk7/d;->e(Lk7/d;)LD7/b;

    move-result-object v5

    invoke-interface {v5, v3, v4}, LD7/b;->a(LD7/c;Lcom/google/ar/core/Frame;)Lcom/google/ar/core/Pose;

    move-result-object v4

    if-eqz v4, :cond_1

    new-instance v5, Lk7/b;

    invoke-virtual {v3}, LD7/c;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, LD7/c;->a()F

    move-result v3

    new-instance v7, Landroid/graphics/PointF;

    invoke-virtual {v4}, Lcom/google/ar/core/Pose;->tx()F

    move-result v8

    neg-float v8, v8

    invoke-virtual {v4}, Lcom/google/ar/core/Pose;->tz()F

    move-result v4

    invoke-direct {v7, v8, v4}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-direct {v5, v6, v3, v7}, Lk7/b;-><init>(Ljava/lang/String;FLandroid/graphics/PointF;)V

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_0

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v2}, LAg/b;->b(Ljava/lang/Iterable;)Lgg/i;

    move-result-object p1

    iget-object v1, p0, Lk7/d$b;->a:Lk7/d;

    new-instance v2, Lk7/e;

    invoke-direct {v2, v1, v0}, Lk7/e;-><init>(Lk7/d;Landroid/media/Image;)V

    invoke-virtual {p1, v2}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method
