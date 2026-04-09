.class public final Lbe4;
.super Landroid/media/AudioDeviceCallback;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic a:Lx03;


# direct methods
.method public synthetic constructor <init>(Lx03;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbe4;->a:Lx03;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/media/AudioDeviceCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onAudioDevicesAdded([Landroid/media/AudioDeviceInfo;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lbe4;->a:Lx03;

    .line 2
    .line 3
    iget-object v0, p1, Lx03;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/content/Context;

    .line 6
    .line 7
    iget-object v1, p1, Lx03;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lin2;

    .line 10
    .line 11
    iget-object v2, p1, Lx03;->n:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Landroid/media/AudioDeviceInfo;

    .line 14
    .line 15
    invoke-static {v0, v1, v2}, Lae4;->a(Landroid/content/Context;Lin2;Landroid/media/AudioDeviceInfo;)Lae4;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1, v0}, Lx03;->b(Lae4;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final onAudioDevicesRemoved([Landroid/media/AudioDeviceInfo;)V
    .locals 5

    .line 1
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    iget-object v2, p0, Lbe4;->a:Lx03;

    .line 6
    .line 7
    if-ge v1, v0, :cond_1

    .line 8
    .line 9
    aget-object v3, p1, v1

    .line 10
    .line 11
    iget-object v4, v2, Lx03;->n:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, Landroid/media/AudioDeviceInfo;

    .line 14
    .line 15
    invoke-static {v3, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    iput-object p1, v2, Lx03;->n:Ljava/lang/Object;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    :goto_1
    iget-object p1, v2, Lx03;->g:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Landroid/content/Context;

    .line 31
    .line 32
    iget-object v0, v2, Lx03;->o:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lin2;

    .line 35
    .line 36
    iget-object v1, v2, Lx03;->n:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Landroid/media/AudioDeviceInfo;

    .line 39
    .line 40
    invoke-static {p1, v0, v1}, Lae4;->a(Landroid/content/Context;Lin2;Landroid/media/AudioDeviceInfo;)Lae4;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {v2, p1}, Lx03;->b(Lae4;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method
