.class public final Lpc3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljc3;


# static fields
.field public static d:Lpc3;


# instance fields
.field public a:F

.field public b:Lfc3;

.field public c:Lic3;


# direct methods
.method public static a()Lpc3;
    .locals 2

    .line 1
    sget-object v0, Lpc3;->d:Lpc3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lpc3;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput v1, v0, Lpc3;->a:F

    .line 12
    .line 13
    sput-object v0, Lpc3;->d:Lpc3;

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lpc3;->d:Lpc3;

    .line 16
    .line 17
    return-object v0
.end method


# virtual methods
.method public final b(Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lzc3;->g:Lzc3;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lzc3;->b()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    sget-object p1, Lzc3;->g:Lzc3;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object p1, Lzc3;->i:Landroid/os/Handler;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    sget-object v0, Lzc3;->k:Lvr;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    sput-object p1, Lzc3;->i:Landroid/os/Handler;

    .line 28
    .line 29
    :cond_1
    return-void
.end method
