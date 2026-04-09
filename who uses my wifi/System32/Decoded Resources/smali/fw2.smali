.class public final Lfw2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lzv2;


# instance fields
.field public final a:J

.field public final b:Lw23;


# direct methods
.method public constructor <init>(JLandroid/content/Context;Lf20;Lth2;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lfw2;->a:J

    .line 5
    .line 6
    iget-object p1, p5, Lth2;->b:Lth2;

    .line 7
    .line 8
    new-instance p2, Lxe4;

    .line 9
    .line 10
    invoke-direct {p2}, Lxe4;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance p5, Lof3;

    .line 17
    .line 18
    invoke-direct {p5, p1, p3, p6, p2}, Lof3;-><init>(Lth2;Landroid/content/Context;Ljava/lang/String;Lxe4;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p5, Lof3;->g:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, Lba4;

    .line 24
    .line 25
    invoke-virtual {p1}, Lba4;->d()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lw23;

    .line 30
    .line 31
    iput-object p1, p0, Lfw2;->b:Lw23;

    .line 32
    .line 33
    new-instance p2, Lew2;

    .line 34
    .line 35
    invoke-direct {p2, p0, p4}, Lew2;-><init>(Lfw2;Lf20;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p2}, Lw23;->W2(Ld32;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final a(Lpc4;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lfw2;->b:Lw23;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw23;->Z(Lpc4;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    new-instance v0, Loi0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lfw2;->b:Lw23;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lw23;->k3(Lu10;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lfw2;->b:Lw23;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw23;->r()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
