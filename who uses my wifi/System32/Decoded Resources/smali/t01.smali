.class public final Lt01;
.super Lob1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic q:Landroid/content/Context;

.field public final synthetic r:Landroid/text/TextPaint;

.field public final synthetic s:Lob1;

.field public final synthetic t:Lu01;


# direct methods
.method public constructor <init>(Lu01;Landroid/content/Context;Landroid/text/TextPaint;Lob1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt01;->t:Lu01;

    .line 5
    .line 6
    iput-object p2, p0, Lt01;->q:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lt01;->r:Landroid/text/TextPaint;

    .line 9
    .line 10
    iput-object p4, p0, Lt01;->s:Lob1;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final p(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt01;->s:Lob1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lob1;->p(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final q(Landroid/graphics/Typeface;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lt01;->q:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lt01;->r:Landroid/text/TextPaint;

    .line 4
    .line 5
    iget-object v2, p0, Lt01;->t:Lu01;

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1, p1}, Lu01;->f(Landroid/content/Context;Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lt01;->s:Lob1;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, Lob1;->q(Landroid/graphics/Typeface;Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
