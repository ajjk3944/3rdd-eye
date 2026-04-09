.class public final Liw2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lzv2;


# instance fields
.field public final a:J

.field public final b:Lf20;

.field public final c:Lx73;


# direct methods
.method public constructor <init>(JLandroid/content/Context;Lf20;Lth2;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Liw2;->a:J

    .line 5
    .line 6
    iput-object p4, p0, Liw2;->b:Lf20;

    .line 7
    .line 8
    iget-object p1, p5, Lth2;->b:Lth2;

    .line 9
    .line 10
    new-instance p2, Lvq2;

    .line 11
    .line 12
    invoke-direct {p2, p1, p3, p6}, Lvq2;-><init>(Lth2;Landroid/content/Context;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p2, Lvq2;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Lba4;

    .line 18
    .line 19
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lx73;

    .line 24
    .line 25
    iput-object p1, p0, Liw2;->c:Lx73;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final a(Lpc4;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Liw2;->c:Lx73;

    .line 2
    .line 3
    new-instance v1, Lgw2;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lgw2;-><init>(Liw2;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1, v1}, Lx73;->q2(Lpc4;Lfb2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    move-exception p1

    .line 13
    const-string v0, "#007 Could not call remote method."

    .line 14
    .line 15
    invoke-static {v0, p1}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final d()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Liw2;->c:Lx73;

    .line 2
    .line 3
    new-instance v1, Lhw2;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lhw2;-><init>(Liw2;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lx73;->c1(Lbb2;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Loi0;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, v2}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lx73;->w2(Lu10;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    move-exception v0

    .line 22
    const-string v1, "#007 Could not call remote method."

    .line 23
    .line 24
    invoke-static {v1, v0}, Lgi2;->p0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final h()V
    .locals 0

    .line 1
    return-void
.end method
