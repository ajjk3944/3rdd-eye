.class public final synthetic Lk14;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# instance fields
.field public final synthetic a:Lr24;


# direct methods
.method public synthetic constructor <init>(Lr24;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk14;->a:Lr24;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final synthetic onAudioFocusChange(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk14;->a:Lr24;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v1, -0x3

    .line 7
    const/4 v2, -0x2

    .line 8
    if-eq p1, v1, :cond_2

    .line 9
    .line 10
    if-eq p1, v2, :cond_2

    .line 11
    .line 12
    const/4 v1, -0x1

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eq p1, v1, :cond_1

    .line 15
    .line 16
    if-eq p1, v2, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    add-int/lit8 v0, v0, 0x1b

    .line 29
    .line 30
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 31
    .line 32
    .line 33
    const-string v0, "Unknown focus change type: "

    .line 34
    .line 35
    invoke-static {v1, p1, v0}, Lga1;->q(Ljava/lang/StringBuilder;ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    const/4 p1, 0x2

    .line 40
    invoke-virtual {v0, p1}, Lr24;->e(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2}, Lr24;->f(I)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    invoke-virtual {v0, v1}, Lr24;->f(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lr24;->d()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v2}, Lr24;->e(I)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_2
    if-eq p1, v2, :cond_3

    .line 58
    .line 59
    const/4 p1, 0x4

    .line 60
    invoke-virtual {v0, p1}, Lr24;->e(I)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_3
    const/4 p1, 0x0

    .line 65
    invoke-virtual {v0, p1}, Lr24;->f(I)V

    .line 66
    .line 67
    .line 68
    const/4 p1, 0x3

    .line 69
    invoke-virtual {v0, p1}, Lr24;->e(I)V

    .line 70
    .line 71
    .line 72
    return-void
.end method
