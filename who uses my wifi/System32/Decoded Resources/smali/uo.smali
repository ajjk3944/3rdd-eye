.class public final Luo;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Luo;->f:I

    .line 2
    .line 3
    iput-object p2, p0, Luo;->g:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget p1, p0, Luo;->f:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Luo;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ljh1;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Ljh1;->y()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void

    .line 16
    :pswitch_0
    iget-object p1, p0, Luo;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Landroid/webkit/JsPromptResult;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/webkit/JsResult;->cancel()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    iget-object p1, p0, Luo;->g:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Landroid/webkit/JsResult;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/webkit/JsResult;->cancel()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_2
    iget-object p1, p0, Luo;->g:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Lmq1;

    .line 35
    .line 36
    invoke-virtual {p1}, Lmq1;->b()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_3
    iget-object p1, p0, Luo;->g:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lxo;

    .line 43
    .line 44
    iget-object v0, p1, Lxo;->k0:Landroid/app/Dialog;

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Lxo;->onCancel(Landroid/content/DialogInterface;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
