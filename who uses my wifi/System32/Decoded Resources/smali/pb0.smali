.class public final Lpb0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic a:Lnb0;

.field public final synthetic b:Lqb0;


# direct methods
.method public constructor <init>(Lqb0;Lnb0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpb0;->b:Lqb0;

    .line 5
    .line 6
    iput-object p2, p0, Lpb0;->a:Lnb0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 1

    .line 1
    iget-object v0, p0, Lpb0;->b:Lqb0;

    .line 2
    .line 3
    iget-object v0, v0, Lob0;->a:Landroid/window/OnBackInvokedCallback;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lpb0;->a:Lnb0;

    .line 8
    .line 9
    invoke-interface {v0}, Lnb0;->d()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final onBackInvoked()V
    .locals 1

    .line 1
    iget-object v0, p0, Lpb0;->a:Lnb0;

    .line 2
    .line 3
    invoke-interface {v0}, Lnb0;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lpb0;->b:Lqb0;

    .line 2
    .line 3
    iget-object v0, v0, Lob0;->a:Landroid/window/OnBackInvokedCallback;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lf9;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lf9;-><init>(Landroid/window/BackEvent;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lpb0;->a:Lnb0;

    .line 13
    .line 14
    invoke-interface {p1, v0}, Lnb0;->b(Lf9;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lpb0;->b:Lqb0;

    .line 2
    .line 3
    iget-object v0, v0, Lob0;->a:Landroid/window/OnBackInvokedCallback;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lf9;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lf9;-><init>(Landroid/window/BackEvent;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lpb0;->a:Lnb0;

    .line 13
    .line 14
    invoke-interface {p1, v0}, Lnb0;->c(Lf9;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
