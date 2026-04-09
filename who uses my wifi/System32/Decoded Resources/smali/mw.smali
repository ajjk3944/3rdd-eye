.class public final Lmw;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lmw;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lmw;->h:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lmw;->g:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final a(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 3

    .line 1
    iget v0, p0, Lmw;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmw;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lsb2;

    .line 9
    .line 10
    iget-object v1, p0, Lmw;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lsg2;

    .line 13
    .line 14
    const/16 v2, 0xa

    .line 15
    .line 16
    invoke-virtual {v1, p1, v0, v2}, Lsg2;->s(Landroid/view/View;Lsb2;I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object p1, p0, Lmw;->g:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Lex;

    .line 23
    .line 24
    iget-object v0, p1, Lex;->c:Liw;

    .line 25
    .line 26
    invoke-virtual {p1}, Lex;->k()V

    .line 27
    .line 28
    .line 29
    iget-object p1, v0, Liw;->J:Landroid/view/View;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Landroid/view/ViewGroup;

    .line 36
    .line 37
    iget-object v0, p0, Lmw;->h:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lnw;

    .line 40
    .line 41
    iget-object v0, v0, Lnw;->f:Lxw;

    .line 42
    .line 43
    invoke-virtual {v0}, Lxw;->E()Lfr;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {p1, v0}, Ltn;->f(Landroid/view/ViewGroup;Lfr;)Ltn;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Ltn;->e()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    iget p1, p0, Lmw;->f:I

    .line 2
    .line 3
    return-void
.end method
