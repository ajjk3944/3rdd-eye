.class public final Lkw;
.super Li30;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lr61;
.implements Lb60;
.implements Lat0;
.implements Lbx;


# instance fields
.field public final synthetic A:Li5;

.field public final w:Li5;

.field public final x:Li5;

.field public final y:Landroid/os/Handler;

.field public final z:Lxw;


# direct methods
.method public constructor <init>(Li5;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkw;->A:Li5;

    .line 5
    .line 6
    new-instance v0, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lxw;

    .line 12
    .line 13
    invoke-direct {v1}, Lxw;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lkw;->z:Lxw;

    .line 17
    .line 18
    iput-object p1, p0, Lkw;->w:Li5;

    .line 19
    .line 20
    iput-object p1, p0, Lkw;->x:Li5;

    .line 21
    .line 22
    iput-object v0, p0, Lkw;->y:Landroid/os/Handler;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final K(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lkw;->A:Li5;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li5;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final L()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lkw;->A:Li5;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public final a()Lvq2;
    .locals 1

    .line 1
    iget-object v0, p0, Lkw;->A:Li5;

    .line 2
    .line 3
    iget-object v0, v0, Lch;->i:Lgw3;

    .line 4
    .line 5
    iget-object v0, v0, Lgw3;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lvq2;

    .line 8
    .line 9
    return-object v0
.end method

.method public final b()V
    .locals 0

    .line 1
    return-void
.end method

.method public final d()Lq61;
    .locals 1

    .line 1
    iget-object v0, p0, Lkw;->A:Li5;

    .line 2
    .line 3
    invoke-virtual {v0}, Lch;->d()Lq61;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final e()Ld60;
    .locals 1

    .line 1
    iget-object v0, p0, Lkw;->A:Li5;

    .line 2
    .line 3
    iget-object v0, v0, Li5;->x:Ld60;

    .line 4
    .line 5
    return-object v0
.end method
