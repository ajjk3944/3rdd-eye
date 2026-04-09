.class public final Lv;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f:Lou0;

.field public final g:Ln70;


# direct methods
.method public constructor <init>(Lou0;Ln70;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv;->f:Lou0;

    .line 5
    .line 6
    iput-object p2, p0, Lv;->g:Ln70;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lv;->f:Lou0;

    .line 2
    .line 3
    iget-object v0, v0, Ly;->f:Ljava/lang/Object;

    .line 4
    .line 5
    if-eq v0, p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lv;->g:Ln70;

    .line 9
    .line 10
    invoke-static {v0}, Ly;->f(Ln70;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Ly;->k:Lbd2;

    .line 15
    .line 16
    iget-object v2, p0, Lv;->f:Lou0;

    .line 17
    .line 18
    invoke-virtual {v1, v2, p0, v0}, Lbd2;->e(Ly;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lv;->f:Lou0;

    .line 25
    .line 26
    invoke-static {v0}, Ly;->b(Ly;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    return-void
.end method
