.class public final synthetic Lh00;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljp;


# instance fields
.field public final synthetic f:Li00;

.field public final synthetic g:Lu11;


# direct methods
.method public synthetic constructor <init>(Li00;Lu11;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh00;->f:Li00;

    .line 5
    .line 6
    iput-object p2, p0, Lh00;->g:Lu11;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lh00;->g:Lu11;

    .line 2
    .line 3
    iget-object v1, p0, Lh00;->f:Li00;

    .line 4
    .line 5
    iget-object v1, v1, Li00;->h:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
