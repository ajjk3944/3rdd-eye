.class public final Lr24;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lll3;

.field public final b:Landroid/os/Handler;

.field public c:Ljb4;

.field public d:Lin2;

.field public e:I

.field public f:I

.field public g:F

.field public h:Ljb2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Ljb4;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Lr24;->g:F

    .line 7
    .line 8
    new-instance v0, Lci3;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, v1, p1}, Lci3;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Li41;->I(Lll3;)Lll3;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lr24;->a:Lll3;

    .line 19
    .line 20
    iput-object p3, p0, Lr24;->c:Ljb4;

    .line 21
    .line 22
    new-instance p1, Landroid/os/Handler;

    .line 23
    .line 24
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lr24;->b:Landroid/os/Handler;

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput p1, p0, Lr24;->e:I

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a(Lin2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr24;->d:Lin2;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iput-object p1, p0, Lr24;->d:Lin2;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x1

    .line 16
    :goto_0
    iput p1, p0, Lr24;->f:I

    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public final b(IZ)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eq p1, v1, :cond_6

    .line 4
    .line 5
    iget p1, p0, Lr24;->f:I

    .line 6
    .line 7
    if-ne p1, v1, :cond_6

    .line 8
    .line 9
    const/4 p1, -0x1

    .line 10
    if-eqz p2, :cond_3

    .line 11
    .line 12
    iget p2, p0, Lr24;->e:I

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    if-ne p2, v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object p2, p0, Lr24;->h:Ljb2;

    .line 19
    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    sget-object p2, Lin2;->b:Lin2;

    .line 24
    .line 25
    iget-object p2, p0, Lr24;->d:Lin2;

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v2, Lk14;

    .line 31
    .line 32
    invoke-direct {v2, p0}, Lk14;-><init>(Lr24;)V

    .line 33
    .line 34
    .line 35
    new-instance v3, Ljb2;

    .line 36
    .line 37
    iget-object v4, p0, Lr24;->b:Landroid/os/Handler;

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-direct {v3, v2, v4, p2}, Ljb2;-><init>(Lk14;Landroid/os/Handler;Lin2;)V

    .line 43
    .line 44
    .line 45
    iput-object v3, p0, Lr24;->h:Ljb2;

    .line 46
    .line 47
    :goto_0
    iget-object p2, p0, Lr24;->a:Lll3;

    .line 48
    .line 49
    invoke-interface {p2}, Lll3;->a()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    check-cast p2, Landroid/media/AudioManager;

    .line 54
    .line 55
    iget-object v2, p0, Lr24;->h:Ljb2;

    .line 56
    .line 57
    iget-object v2, v2, Ljb2;->d:Landroid/media/AudioFocusRequest;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2, v2}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioFocusRequest;)I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-ne p2, v1, :cond_2

    .line 67
    .line 68
    invoke-virtual {p0, v0}, Lr24;->e(I)V

    .line 69
    .line 70
    .line 71
    return v1

    .line 72
    :cond_2
    invoke-virtual {p0, v1}, Lr24;->e(I)V

    .line 73
    .line 74
    .line 75
    return p1

    .line 76
    :cond_3
    iget p2, p0, Lr24;->e:I

    .line 77
    .line 78
    if-eq p2, v1, :cond_5

    .line 79
    .line 80
    const/4 p1, 0x3

    .line 81
    if-eq p2, p1, :cond_4

    .line 82
    .line 83
    :goto_1
    return v1

    .line 84
    :cond_4
    return v0

    .line 85
    :cond_5
    return p1

    .line 86
    :cond_6
    invoke-virtual {p0}, Lr24;->d()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v0}, Lr24;->e(I)V

    .line 90
    .line 91
    .line 92
    return v1
.end method

.method public final c()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lr24;->c:Ljb4;

    .line 3
    .line 4
    invoke-virtual {p0}, Lr24;->d()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, Lr24;->e(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    iget v0, p0, Lr24;->e:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lr24;->h:Ljb2;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lr24;->a:Lll3;

    .line 14
    .line 15
    invoke-interface {v0}, Lll3;->a()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroid/media/AudioManager;

    .line 20
    .line 21
    iget-object v1, p0, Lr24;->h:Ljb2;

    .line 22
    .line 23
    iget-object v1, v1, Ljb2;->d:Landroid/media/AudioFocusRequest;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocusRequest(Landroid/media/AudioFocusRequest;)I

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    return-void
.end method

.method public final e(I)V
    .locals 1

    .line 1
    iget v0, p0, Lr24;->e:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iput p1, p0, Lr24;->e:I

    .line 7
    .line 8
    const/4 v0, 0x4

    .line 9
    if-ne p1, v0, :cond_1

    .line 10
    .line 11
    const p1, 0x3e4ccccd    # 0.2f

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const/high16 p1, 0x3f800000    # 1.0f

    .line 16
    .line 17
    :goto_0
    iget v0, p0, Lr24;->g:F

    .line 18
    .line 19
    cmpl-float v0, v0, p1

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iput p1, p0, Lr24;->g:F

    .line 24
    .line 25
    iget-object p1, p0, Lr24;->c:Ljb4;

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    iget-object p1, p1, Ljb4;->m:Ld13;

    .line 30
    .line 31
    const/16 v0, 0x22

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Ld13;->b(I)Z

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_1
    return-void
.end method

.method public final f(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lr24;->c:Ljb4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Ljb4;->m:Ld13;

    .line 6
    .line 7
    iget-object v0, v0, Ld13;->a:Landroid/os/Handler;

    .line 8
    .line 9
    invoke-static {}, Ld13;->f()Lv03;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/16 v2, 0x21

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-virtual {v0, v2, p1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, v1, Lv03;->a:Landroid/os/Message;

    .line 21
    .line 22
    invoke-virtual {v1}, Lv03;->a()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method
