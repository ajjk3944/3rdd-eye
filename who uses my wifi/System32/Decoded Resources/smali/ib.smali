.class public final Lib;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Z

.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomappbar/BottomAppBar;Landroidx/appcompat/widget/ActionMenuView;IZ)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lib;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lib;->j:Landroid/view/View;

    iput-object p2, p0, Lib;->i:Ljava/lang/Object;

    iput p3, p0, Lib;->h:I

    iput-boolean p4, p0, Lib;->g:Z

    return-void
.end method

.method public synthetic constructor <init>(Lpr2;Landroid/view/View;ZI)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lib;->f:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lib;->i:Ljava/lang/Object;

    iput-object p2, p0, Lib;->j:Landroid/view/View;

    iput-boolean p3, p0, Lib;->g:Z

    iput p4, p0, Lib;->h:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Lib;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lib;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lpr2;

    .line 9
    .line 10
    iget-object v1, v0, Lpr2;->w:Lhv1;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    const-string v0, "Ad should be associated with an ad view before calling performClickForCustomGesture()"

    .line 15
    .line 16
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v2, v1

    .line 21
    iget-object v1, v0, Lpr2;->n:Lwr2;

    .line 22
    .line 23
    invoke-interface {v2}, Lrs2;->X0()Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-object v2, v0, Lpr2;->w:Lhv1;

    .line 28
    .line 29
    invoke-interface {v2}, Lrs2;->g()Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    iget-object v2, v0, Lpr2;->w:Lhv1;

    .line 34
    .line 35
    invoke-interface {v2}, Lrs2;->k()Ljava/util/Map;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-virtual {v0}, Lpr2;->k()Landroid/widget/ImageView$ScaleType;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    iget-object v2, p0, Lib;->j:Landroid/view/View;

    .line 44
    .line 45
    iget-boolean v6, p0, Lib;->g:Z

    .line 46
    .line 47
    iget v8, p0, Lib;->h:I

    .line 48
    .line 49
    invoke-interface/range {v1 .. v8}, Lwr2;->j(Landroid/view/View;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;ZLandroid/widget/ImageView$ScaleType;I)V

    .line 50
    .line 51
    .line 52
    :goto_0
    return-void

    .line 53
    :pswitch_0
    iget-object v0, p0, Lib;->i:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Landroidx/appcompat/widget/ActionMenuView;

    .line 56
    .line 57
    iget-object v1, p0, Lib;->j:Landroid/view/View;

    .line 58
    .line 59
    check-cast v1, Lcom/google/android/material/bottomappbar/BottomAppBar;

    .line 60
    .line 61
    iget v2, p0, Lib;->h:I

    .line 62
    .line 63
    iget-boolean v3, p0, Lib;->g:Z

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/material/bottomappbar/BottomAppBar;->C(Landroidx/appcompat/widget/ActionMenuView;IZ)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    int-to-float v1, v1

    .line 70
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
