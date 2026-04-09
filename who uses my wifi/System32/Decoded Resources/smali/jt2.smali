.class public final synthetic Ljt2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lov1;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lag2;


# direct methods
.method public synthetic constructor <init>(Lag2;I)V
    .locals 0

    .line 1
    iput p2, p0, Ljt2;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Ljt2;->g:Lag2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final synthetic S0(Lnv1;)V
    .locals 2

    .line 1
    iget v0, p0, Ljt2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lnv1;->d:Landroid/graphics/Rect;

    .line 7
    .line 8
    iget-object v0, p0, Ljt2;->g:Lag2;

    .line 9
    .line 10
    invoke-interface {v0}, Lag2;->e0()Lsg2;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v1, p1, Landroid/graphics/Rect;->left:I

    .line 15
    .line 16
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Lsg2;->r(II)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object p1, p1, Lnv1;->d:Landroid/graphics/Rect;

    .line 23
    .line 24
    iget-object v0, p0, Ljt2;->g:Lag2;

    .line 25
    .line 26
    invoke-interface {v0}, Lag2;->e0()Lsg2;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget v1, p1, Landroid/graphics/Rect;->left:I

    .line 31
    .line 32
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 33
    .line 34
    invoke-virtual {v0, v1, p1}, Lsg2;->r(II)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_1
    new-instance v0, Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 41
    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    iget-boolean p1, p1, Lnv1;->j:Z

    .line 45
    .line 46
    if-eq v1, p1, :cond_0

    .line 47
    .line 48
    const-string p1, "0"

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const-string p1, "1"

    .line 52
    .line 53
    :goto_0
    const-string v1, "isVisible"

    .line 54
    .line 55
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Ljt2;->g:Lag2;

    .line 59
    .line 60
    const-string v1, "onAdVisibilityChanged"

    .line 61
    .line 62
    invoke-interface {p1, v1, v0}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
