.class public final Lwi0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic a:Lui0;

.field public final synthetic b:Lui0;

.field public final synthetic c:Lvi0;

.field public final synthetic d:Lvi0;


# direct methods
.method public constructor <init>(Lui0;Lui0;Lvi0;Lvi0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwi0;->a:Lui0;

    .line 5
    .line 6
    iput-object p2, p0, Lwi0;->b:Lui0;

    .line 7
    .line 8
    iput-object p3, p0, Lwi0;->c:Lvi0;

    .line 9
    .line 10
    iput-object p4, p0, Lwi0;->d:Lvi0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 1

    .line 1
    iget-object v0, p0, Lwi0;->d:Lvi0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvi0;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onBackInvoked()V
    .locals 1

    .line 1
    iget-object v0, p0, Lwi0;->c:Lvi0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvi0;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 1

    .line 1
    const-string v0, "backEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lf9;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lf9;-><init>(Landroid/window/BackEvent;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lwi0;->b:Lui0;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lui0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 1

    .line 1
    const-string v0, "backEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lf9;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lf9;-><init>(Landroid/window/BackEvent;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lwi0;->a:Lui0;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lui0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method
