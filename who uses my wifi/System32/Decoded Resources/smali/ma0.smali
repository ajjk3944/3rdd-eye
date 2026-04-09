.class public final synthetic Lma0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p3, p0, Lma0;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lma0;->h:Ljava/lang/Object;

    .line 4
    .line 5
    iput p2, p0, Lma0;->g:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lma0;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lma0;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 9
    .line 10
    iget-object v1, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Landroid/view/View;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iget v3, p0, Lma0;->g:I

    .line 22
    .line 23
    invoke-virtual {v0, v1, v3, v2}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->z(Landroid/view/View;IZ)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void

    .line 27
    :pswitch_0
    iget-object v0, p0, Lma0;->h:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lg82;

    .line 30
    .line 31
    iget v1, p0, Lma0;->g:I

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lg82;->o(I)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_1
    iget-object v0, p0, Lma0;->h:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 40
    .line 41
    iget-object v0, v0, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C:Lf2;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    iget-object v0, v0, Lf2;->i:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 48
    .line 49
    iget v1, p0, Lma0;->g:I

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lga;->setProgress(I)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    const-string v0, "binding"

    .line 56
    .line 57
    invoke-static {v0}, Li30;->S(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    throw v0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
