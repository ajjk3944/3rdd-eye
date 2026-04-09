.class public final Lk70;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lk70;->f:I

    iput-object p2, p0, Lk70;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lis1;Landroid/content/Context;)V
    .locals 0

    const/4 p1, 0x3

    iput p1, p0, Lk70;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lk70;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 1
    iget v0, p0, Lk70;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lk70;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroid/webkit/JsPromptResult;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/webkit/JsResult;->cancel()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p1, p0, Lk70;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Lp82;

    .line 17
    .line 18
    const-string p2, "User canceled the download."

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Lgw3;->G(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    sget-object p1, Lhg4;->C:Lhg4;

    .line 25
    .line 26
    iget-object p1, p1, Lhg4;->c:Llf4;

    .line 27
    .line 28
    iget-object p1, p0, Lk70;->g:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Landroid/content/Context;

    .line 31
    .line 32
    const-string p2, "https://support.google.com/dfp_premium/answer/7160685#push"

    .line 33
    .line 34
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-static {p1, p2}, Llf4;->u(Landroid/content/Context;Landroid/net/Uri;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_2
    iget-object p1, p0, Lk70;->g:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lmq1;

    .line 45
    .line 46
    invoke-virtual {p1}, Lmq1;->b()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_3
    iget-object p1, p0, Lk70;->g:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 53
    .line 54
    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_4
    iget-object v0, p0, Lk70;->g:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Ll70;

    .line 61
    .line 62
    iput p2, v0, Ll70;->x0:I

    .line 63
    .line 64
    const/4 p2, -0x1

    .line 65
    iput p2, v0, Lzl0;->w0:I

    .line 66
    .line 67
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
