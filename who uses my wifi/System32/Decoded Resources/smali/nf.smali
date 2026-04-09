.class public final synthetic Lnf;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lvs;


# direct methods
.method public synthetic constructor <init>(Lvs;I)V
    .locals 0

    .line 1
    iput p2, p0, Lnf;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lnf;->b:Lvs;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 0

    .line 1
    iget p1, p0, Lnf;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lnf;->b:Lvs;

    .line 7
    .line 8
    check-cast p1, Ltq;

    .line 9
    .line 10
    iput-boolean p2, p1, Ltq;->l:Z

    .line 11
    .line 12
    invoke-virtual {p1}, Lvs;->p()V

    .line 13
    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    invoke-virtual {p1, p2}, Ltq;->s(Z)V

    .line 19
    .line 20
    .line 21
    iput-boolean p2, p1, Ltq;->m:Z

    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    :pswitch_0
    iget-object p1, p0, Lnf;->b:Lvs;

    .line 25
    .line 26
    check-cast p1, Lqf;

    .line 27
    .line 28
    invoke-virtual {p1}, Lqf;->t()Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    invoke-virtual {p1, p2}, Lqf;->s(Z)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
