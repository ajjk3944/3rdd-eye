.class public final Lmc2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lkk1;
.implements Liq3;
.implements Ltd2;
.implements Lp93;
.implements Lbb4;
.implements Lgj4;


# static fields
.field public static k:Lmc2;


# instance fields
.field public final synthetic f:I

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Lmc2;->f:I

    sparse-switch p1, :sswitch_data_0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    new-instance p1, Lhl0;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lhl0;-><init>(I)V

    iput-object p1, p0, Lmc2;->g:Ljava/lang/Object;

    .line 67
    new-instance p1, Lbw0;

    const/4 v0, 0x0

    .line 68
    invoke-direct {p1, v0}, Lbw0;-><init>(I)V

    .line 69
    iput-object p1, p0, Lmc2;->h:Ljava/lang/Object;

    .line 70
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lmc2;->i:Ljava/lang/Object;

    .line 71
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lmc2;->j:Ljava/lang/Object;

    return-void

    .line 72
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lmc2;->g:Ljava/lang/Object;

    iput-object p1, p0, Lmc2;->h:Ljava/lang/Object;

    iput-object p1, p0, Lmc2;->i:Ljava/lang/Object;

    sget-object p1, Lyw3;->e:Lyw3;

    iput-object p1, p0, Lmc2;->j:Ljava/lang/Object;

    return-void

    .line 73
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lmc2;->g:Ljava/lang/Object;

    iput-object p1, p0, Lmc2;->h:Ljava/lang/Object;

    iput-object p1, p0, Lmc2;->i:Ljava/lang/Object;

    sget-object p1, Lls3;->e:Lls3;

    iput-object p1, p0, Lmc2;->j:Ljava/lang/Object;

    return-void

    .line 74
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lmc2;->g:Ljava/lang/Object;

    iput-object p1, p0, Lmc2;->h:Ljava/lang/Object;

    iput-object p1, p0, Lmc2;->i:Ljava/lang/Object;

    iput-object p1, p0, Lmc2;->j:Ljava/lang/Object;

    return-void

    .line 75
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    new-instance p1, Ls8;

    const/4 v0, 0x0

    .line 77
    invoke-direct {p1, v0}, Lbw0;-><init>(I)V

    .line 78
    iput-object p1, p0, Lmc2;->g:Ljava/lang/Object;

    .line 79
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lmc2;->h:Ljava/lang/Object;

    .line 80
    new-instance p1, Ll80;

    invoke-direct {p1}, Ll80;-><init>()V

    iput-object p1, p0, Lmc2;->i:Ljava/lang/Object;

    .line 81
    new-instance p1, Ls8;

    .line 82
    invoke-direct {p1, v0}, Lbw0;-><init>(I)V

    .line 83
    iput-object p1, p0, Lmc2;->j:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_3
        0x17 -> :sswitch_2
        0x18 -> :sswitch_1
        0x19 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/content/Context;Lav1;)V
    .locals 2

    const/16 v0, 0x16

    iput v0, p0, Lmc2;->f:I

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "pcvmspf"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lmc2;->i:Ljava/lang/Object;

    const-string v0, "pccache"

    .line 17
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v0

    .line 18
    invoke-static {v0, v1}, Luk2;->W(Ljava/io/File;Z)V

    iput-object v0, p0, Lmc2;->g:Ljava/lang/Object;

    const-string v0, "tmppccache"

    .line 19
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Luk2;->W(Ljava/io/File;Z)V

    iput-object p1, p0, Lmc2;->h:Ljava/lang/Object;

    iput-object p2, p0, Lmc2;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lym;Lra4;Loc2;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lmc2;->f:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lmc2;->g:Ljava/lang/Object;

    invoke-static {p1}, Lda4;->a(Ljava/lang/Object;)Lda4;

    move-result-object p1

    .line 3
    invoke-static {p3}, Lda4;->a(Ljava/lang/Object;)Lda4;

    move-result-object p3

    .line 4
    new-instance v0, Lub2;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p3, v1}, Lub2;-><init>(Lda4;Lda4;I)V

    .line 5
    invoke-static {v0}, Lba4;->a(Lga4;)Lba4;

    move-result-object v0

    iput-object v0, p0, Lmc2;->h:Ljava/lang/Object;

    .line 6
    invoke-static {p2}, Lda4;->a(Ljava/lang/Object;)Lda4;

    move-result-object p2

    .line 7
    invoke-static {p4}, Lda4;->a(Ljava/lang/Object;)Lda4;

    move-result-object p4

    .line 8
    new-instance v0, Lwb2;

    invoke-direct {v0, p2, p3, p4, v1}, Lwb2;-><init>(Lga4;Lga4;Lga4;I)V

    .line 9
    invoke-static {v0}, Lba4;->a(Lga4;)Lba4;

    move-result-object p3

    iput-object p3, p0, Lmc2;->i:Ljava/lang/Object;

    .line 10
    new-instance p4, Lxb2;

    invoke-direct {p4, p2, p3}, Lxb2;-><init>(Lda4;Lba4;)V

    .line 11
    new-instance p2, Lrc2;

    const/4 p3, 0x0

    invoke-direct {p2, p1, p4, p3}, Lrc2;-><init>(Ljava/lang/Object;Lga4;I)V

    .line 12
    invoke-static {p2}, Lba4;->a(Lga4;)Lba4;

    move-result-object p1

    iput-object p1, p0, Lmc2;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Typeface;Lpe0;)V
    .locals 7

    const/4 v0, 0x4

    iput v0, p0, Lmc2;->f:I

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    iput-object p1, p0, Lmc2;->j:Ljava/lang/Object;

    .line 91
    iput-object p2, p0, Lmc2;->g:Ljava/lang/Object;

    .line 92
    new-instance p1, Lqe0;

    const/16 v0, 0x400

    invoke-direct {p1, v0}, Lqe0;-><init>(I)V

    iput-object p1, p0, Lmc2;->i:Ljava/lang/Object;

    const/4 p1, 0x6

    .line 93
    invoke-virtual {p2, p1}, Lcb0;->a(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 94
    iget v2, p2, Lcb0;->f:I

    add-int/2addr v0, v2

    .line 95
    iget-object v2, p2, Lcb0;->i:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    add-int/2addr v2, v0

    .line 96
    iget-object v0, p2, Lcb0;->i:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x2

    .line 97
    new-array v0, v0, [C

    iput-object v0, p0, Lmc2;->h:Ljava/lang/Object;

    .line 98
    invoke-virtual {p2, p1}, Lcb0;->a(I)I

    move-result p1

    if-eqz p1, :cond_1

    .line 99
    iget v0, p2, Lcb0;->f:I

    add-int/2addr p1, v0

    .line 100
    iget-object v0, p2, Lcb0;->i:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p1

    .line 101
    iget-object p1, p2, Lcb0;->i:Ljava/lang/Object;

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    goto :goto_1

    :cond_1
    move p1, v1

    :goto_1
    move p2, v1

    :goto_2
    if-ge p2, p1, :cond_6

    .line 102
    new-instance v0, Lq31;

    invoke-direct {v0, p0, p2}, Lq31;-><init>(Lmc2;I)V

    .line 103
    invoke-virtual {v0}, Lq31;->b()Loe0;

    move-result-object v2

    const/4 v3, 0x4

    .line 104
    invoke-virtual {v2, v3}, Lcb0;->a(I)I

    move-result v3

    if-eqz v3, :cond_2

    iget-object v4, v2, Lcb0;->i:Ljava/lang/Object;

    check-cast v4, Ljava/nio/ByteBuffer;

    iget v2, v2, Lcb0;->f:I

    add-int/2addr v3, v2

    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_3

    :cond_2
    move v2, v1

    .line 105
    :goto_3
    iget-object v3, p0, Lmc2;->h:Ljava/lang/Object;

    check-cast v3, [C

    mul-int/lit8 v4, p2, 0x2

    invoke-static {v2, v3, v4}, Ljava/lang/Character;->toChars(I[CI)I

    .line 106
    invoke-virtual {v0}, Lq31;->b()Loe0;

    move-result-object v2

    const/16 v3, 0x10

    .line 107
    invoke-virtual {v2, v3}, Lcb0;->a(I)I

    move-result v4

    if-eqz v4, :cond_3

    .line 108
    iget v5, v2, Lcb0;->f:I

    add-int/2addr v4, v5

    .line 109
    iget-object v5, v2, Lcb0;->i:Ljava/lang/Object;

    check-cast v5, Ljava/nio/ByteBuffer;

    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v5

    add-int/2addr v5, v4

    .line 110
    iget-object v2, v2, Lcb0;->i:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_4

    :cond_3
    move v2, v1

    :goto_4
    const/4 v4, 0x1

    if-lez v2, :cond_4

    move v2, v4

    goto :goto_5

    :cond_4
    move v2, v1

    .line 111
    :goto_5
    const-string v5, "invalid metadata codepoint length"

    invoke-static {v5, v2}, Lpu1;->g(Ljava/lang/String;Z)V

    .line 112
    iget-object v2, p0, Lmc2;->i:Ljava/lang/Object;

    check-cast v2, Lqe0;

    .line 113
    invoke-virtual {v0}, Lq31;->b()Loe0;

    move-result-object v5

    .line 114
    invoke-virtual {v5, v3}, Lcb0;->a(I)I

    move-result v3

    if-eqz v3, :cond_5

    .line 115
    iget v6, v5, Lcb0;->f:I

    add-int/2addr v3, v6

    .line 116
    iget-object v6, v5, Lcb0;->i:Ljava/lang/Object;

    check-cast v6, Ljava/nio/ByteBuffer;

    invoke-virtual {v6, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v6

    add-int/2addr v6, v3

    .line 117
    iget-object v3, v5, Lcb0;->i:Ljava/lang/Object;

    check-cast v3, Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v3

    goto :goto_6

    :cond_5
    move v3, v1

    :goto_6
    sub-int/2addr v3, v4

    .line 118
    invoke-virtual {v2, v0, v1, v3}, Lqe0;->a(Lq31;II)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_6
    return-void
.end method

.method public constructor <init>(Landroid/media/AudioTrack;Lx03;)V
    .locals 1

    const/16 v0, 0x1b

    iput v0, p0, Lmc2;->f:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmc2;->g:Ljava/lang/Object;

    iput-object p2, p0, Lmc2;->h:Ljava/lang/Object;

    new-instance p2, Lbf4;

    invoke-direct {p2, p0}, Lbf4;-><init>(Lmc2;)V

    iput-object p2, p0, Lmc2;->j:Ljava/lang/Object;

    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lmc2;->i:Ljava/lang/Object;

    iget-object v0, p0, Lmc2;->j:Ljava/lang/Object;

    check-cast v0, Lbf4;

    .line 21
    invoke-virtual {p1, v0, p2}, Landroid/media/AudioTrack;->addOnRoutingChangedListener(Landroid/media/AudioRouting$OnRoutingChangedListener;Landroid/os/Handler;)V

    return-void
.end method

.method public constructor <init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/widget/RelativeLayout;Lp21;Landroid/widget/TextView;Landroid/webkit/WebView;)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, Lmc2;->f:I

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    iput-object p2, p0, Lmc2;->g:Ljava/lang/Object;

    .line 86
    iput-object p3, p0, Lmc2;->h:Ljava/lang/Object;

    .line 87
    iput-object p4, p0, Lmc2;->i:Ljava/lang/Object;

    .line 88
    iput-object p5, p0, Lmc2;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;)V
    .locals 2

    const/4 v0, 0x7

    iput v0, p0, Lmc2;->f:I

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lmc2;->g:Ljava/lang/Object;

    .line 56
    new-instance v0, Lio;

    const/4 v1, 0x4

    .line 57
    invoke-direct {v0, p1, v1}, Lio;-><init>(Lpq0;I)V

    .line 58
    iput-object v0, p0, Lmc2;->h:Ljava/lang/Object;

    .line 59
    new-instance v0, Ltz0;

    const/4 v1, 0x1

    .line 60
    invoke-direct {v0, p1, v1}, Ltz0;-><init>(Lpq0;I)V

    .line 61
    iput-object v0, p0, Lmc2;->i:Ljava/lang/Object;

    .line 62
    new-instance v0, Ltz0;

    const/4 v1, 0x2

    .line 63
    invoke-direct {v0, p1, v1}, Ltz0;-><init>(Lpq0;I)V

    .line 64
    iput-object v0, p0, Lmc2;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lbo1;Ljava/util/concurrent/BlockingQueue;Lf20;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lmc2;->f:I

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lmc2;->g:Ljava/lang/Object;

    iput-object p3, p0, Lmc2;->j:Ljava/lang/Object;

    iput-object p1, p0, Lmc2;->h:Ljava/lang/Object;

    iput-object p2, p0, Lmc2;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lgj2;Leb3;Ljava/lang/String;Lx34;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, Lmc2;->f:I

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lmc2;->g:Ljava/lang/Object;

    iput-object p3, p0, Lmc2;->h:Ljava/lang/Object;

    iput-object p4, p0, Lmc2;->i:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lmc2;->j:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 13
    iput p5, p0, Lmc2;->f:I

    iput-object p2, p0, Lmc2;->g:Ljava/lang/Object;

    iput-object p3, p0, Lmc2;->h:Ljava/lang/Object;

    iput-object p4, p0, Lmc2;->i:Ljava/lang/Object;

    iput-object p1, p0, Lmc2;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 14
    iput p5, p0, Lmc2;->f:I

    iput-object p1, p0, Lmc2;->g:Ljava/lang/Object;

    iput-object p2, p0, Lmc2;->h:Ljava/lang/Object;

    iput-object p3, p0, Lmc2;->i:Ljava/lang/Object;

    iput-object p4, p0, Lmc2;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 10

    const/16 v0, 0x8

    iput v0, p0, Lmc2;->f:I

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lkz2;

    invoke-direct {v0}, Lkz2;-><init>()V

    iput-object v0, p0, Lmc2;->g:Ljava/lang/Object;

    new-instance v0, Lkz2;

    .line 23
    invoke-direct {v0}, Lkz2;-><init>()V

    iput-object v0, p0, Lmc2;->h:Ljava/lang/Object;

    new-instance v0, Lml1;

    invoke-direct {v0}, Lml1;-><init>()V

    iput-object v0, p0, Lmc2;->i:Ljava/lang/Object;

    new-instance v1, Ljava/lang/String;

    const/4 v2, 0x0

    .line 24
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, p1, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 25
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 26
    const-string v1, "\\r?\\n"

    const/4 v3, -0x1

    invoke-virtual {p1, v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p1

    .line 27
    array-length v1, p1

    move v4, v2

    :goto_0
    if-ge v4, v1, :cond_2

    aget-object v5, p1, v4

    const-string v6, "palette: "

    .line 28
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/16 v6, 0x9

    .line 29
    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ","

    .line 30
    invoke-virtual {v5, v6, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v5

    .line 31
    array-length v6, v5

    new-array v6, v6, [I

    iput-object v6, v0, Lml1;->d:[I

    move v6, v2

    .line 32
    :goto_1
    array-length v7, v5

    if-ge v6, v7, :cond_1

    iget-object v7, v0, Lml1;->d:[I

    .line 33
    aget-object v8, v5, v6

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0x10

    .line 34
    :try_start_0
    invoke-static {v8, v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v8
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move v8, v2

    .line 35
    :goto_2
    aput v8, v7, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_0
    const-string v6, "size: "

    .line 36
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x6

    .line 37
    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    const-string v6, "x"

    .line 38
    invoke-virtual {v5, v6, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v5

    .line 39
    array-length v6, v5

    const/4 v7, 0x2

    if-ne v6, v7, :cond_1

    .line 40
    :try_start_1
    aget-object v6, v5, v2

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    iput v6, v0, Lml1;->e:I

    const/4 v6, 0x1

    .line 41
    aget-object v5, v5, v6

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    iput v5, v0, Lml1;->f:I

    iput-boolean v6, v0, Lml1;->b:Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v5

    const-string v6, "Parsing IDX failed"

    .line 42
    invoke-static {v6, v5}, La30;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public constructor <init>(Lp10;Lnl;Landroid/content/ComponentName;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lmc2;->f:I

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lmc2;->g:Ljava/lang/Object;

    .line 121
    iput-object p1, p0, Lmc2;->h:Ljava/lang/Object;

    .line 122
    iput-object p2, p0, Lmc2;->i:Ljava/lang/Object;

    .line 123
    iput-object p3, p0, Lmc2;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lqk;Lcu0;Llw0;)V
    .locals 2

    const/4 v0, 0x5

    iput v0, p0, Lmc2;->f:I

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lmc2;->g:Ljava/lang/Object;

    .line 47
    iput-object p3, p0, Lmc2;->h:Ljava/lang/Object;

    .line 48
    new-instance p3, Lbc;

    const v0, 0x7fffffff

    invoke-direct {p3, v0}, Lbc;-><init>(I)V

    .line 49
    iput-object p3, p0, Lmc2;->i:Ljava/lang/Object;

    .line 50
    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    invoke-direct {p3, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p3, p0, Lmc2;->j:Ljava/lang/Object;

    .line 51
    invoke-interface {p1}, Lqk;->b()Lhk;

    move-result-object p1

    sget-object p3, Lfr;->j:Lfr;

    invoke-interface {p1, p3}, Lhk;->h(Lgk;)Lfk;

    move-result-object p1

    check-cast p1, Lw30;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p3, Lek;

    const/4 v1, 0x1

    invoke-direct {p3, p2, p0, v1}, Lek;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    check-cast p1, Lg40;

    .line 52
    new-instance p2, Le30;

    invoke-direct {p2, p3}, Le30;-><init>(Ldy;)V

    const/4 p3, 0x1

    .line 53
    invoke-virtual {p1, v0, p3, p2}, Lg40;->E(ZZLf30;)Ljp;

    :goto_0
    return-void
.end method

.method public constructor <init>(Lt83;Llm2;Ljava/util/concurrent/Executor;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, Lmc2;->f:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmc2;->g:Ljava/lang/Object;

    iput-object p2, p0, Lmc2;->h:Ljava/lang/Object;

    iput-object p3, p0, Lmc2;->i:Ljava/lang/Object;

    return-void
.end method

.method private final k(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final l(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static declared-synchronized m(Landroid/content/Context;)Lmc2;
    .locals 5

    .line 1
    const-class v0, Lmc2;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lmc2;->k:Lmc2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-object v1

    .line 10
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lmz1;->a(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    sget-object v1, Lhg4;->C:Lhg4;

    .line 18
    .line 19
    iget-object v2, v1, Lhg4;->h:Lgd2;

    .line 20
    .line 21
    invoke-virtual {v2}, Lgd2;->g()Lra4;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2, p0}, Lra4;->j(Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v3, v1, Lhg4;->k:Lym;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object v1, v1, Lhg4;->y:Loc2;

    .line 37
    .line 38
    const-class v4, Loc2;

    .line 39
    .line 40
    invoke-static {v1, v4}, Li41;->P(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 41
    .line 42
    .line 43
    new-instance v4, Lmc2;

    .line 44
    .line 45
    invoke-direct {v4, p0, v3, v2, v1}, Lmc2;-><init>(Landroid/content/Context;Lym;Lra4;Loc2;)V

    .line 46
    .line 47
    .line 48
    sput-object v4, Lmc2;->k:Lmc2;

    .line 49
    .line 50
    iget-object p0, v4, Lmc2;->h:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, Lba4;

    .line 53
    .line 54
    invoke-virtual {p0}, Lba4;->d()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Ltb2;

    .line 59
    .line 60
    iget-object v1, p0, Ltb2;->b:Landroid/content/SharedPreferences;

    .line 61
    .line 62
    invoke-interface {v1, p0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 63
    .line 64
    .line 65
    const-string v2, "gad_has_consent_for_cookies"

    .line 66
    .line 67
    invoke-virtual {p0, v1, v2}, Ltb2;->onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    sget-object v2, Lmz1;->J0:Liz1;

    .line 71
    .line 72
    sget-object v3, Ltw1;->e:Ltw1;

    .line 73
    .line 74
    iget-object v4, v3, Ltw1;->c:Lkz1;

    .line 75
    .line 76
    invoke-virtual {v4, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_1

    .line 87
    .line 88
    const-string v2, "IABTCF_TCString"

    .line 89
    .line 90
    invoke-virtual {p0, v1, v2}, Ltb2;->onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    const-string v2, "IABTCF_PurposeConsents"

    .line 95
    .line 96
    invoke-virtual {p0, v1, v2}, Ltb2;->onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :goto_0
    sget-object p0, Lmc2;->k:Lmc2;

    .line 100
    .line 101
    iget-object p0, p0, Lmc2;->j:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p0, Lba4;

    .line 104
    .line 105
    invoke-virtual {p0}, Lba4;->d()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    check-cast p0, Lqc2;

    .line 110
    .line 111
    sget-object v1, Lmz1;->D0:Liz1;

    .line 112
    .line 113
    iget-object v2, v3, Ltw1;->c:Lkz1;

    .line 114
    .line 115
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, Ljava/lang/Boolean;

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-nez v1, :cond_2

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_2
    sget-object v1, Lmz1;->E0:Liz1;

    .line 129
    .line 130
    iget-object v2, v3, Ltw1;->c:Lkz1;

    .line 131
    .line 132
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    check-cast v1, Ljava/lang/String;

    .line 137
    .line 138
    invoke-static {v1}, Llf4;->P(Ljava/lang/String;)Ljava/util/HashMap;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-eqz v3, :cond_3

    .line 155
    .line 156
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    check-cast v3, Ljava/lang/String;

    .line 161
    .line 162
    invoke-virtual {p0, v3}, Lqc2;->a(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :catchall_0
    move-exception p0

    .line 167
    goto :goto_3

    .line 168
    :cond_3
    new-instance v2, Lpc2;

    .line 169
    .line 170
    invoke-direct {v2, p0, v1}, Lpc2;-><init>(Lqc2;Ljava/util/HashMap;)V

    .line 171
    .line 172
    .line 173
    monitor-enter p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 174
    :try_start_2
    iget-object v1, p0, Lqc2;->b:Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 177
    .line 178
    .line 179
    :try_start_3
    monitor-exit p0

    .line 180
    :goto_2
    sget-object p0, Lmc2;->k:Lmc2;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 181
    .line 182
    monitor-exit v0

    .line 183
    return-object p0

    .line 184
    :catchall_1
    move-exception v1

    .line 185
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 186
    :try_start_5
    throw v1

    .line 187
    :goto_3
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 188
    throw p0
.end method


# virtual methods
.method public A()Lzw3;
    .locals 5

    .line 1
    iget-object v0, p0, Lmc2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Integer;

    .line 4
    .line 5
    if-eqz v0, :cond_e

    .line 6
    .line 7
    iget-object v1, p0, Lmc2;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    if-eqz v1, :cond_d

    .line 12
    .line 13
    iget-object v1, p0, Lmc2;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lxw3;

    .line 16
    .line 17
    if-eqz v1, :cond_c

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/16 v1, 0x10

    .line 24
    .line 25
    if-lt v0, v1, :cond_b

    .line 26
    .line 27
    iget-object v0, p0, Lmc2;->h:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iget-object v2, p0, Lmc2;->i:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Lxw3;

    .line 38
    .line 39
    const/16 v3, 0xa

    .line 40
    .line 41
    if-lt v1, v3, :cond_a

    .line 42
    .line 43
    sget-object v3, Lxw3;->b:Lxw3;

    .line 44
    .line 45
    if-ne v2, v3, :cond_1

    .line 46
    .line 47
    const/16 v2, 0x14

    .line 48
    .line 49
    if-gt v1, v2, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 53
    .line 54
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v2, "Invalid tag size in bytes %d; can be at most 20 bytes for SHA1"

    .line 59
    .line 60
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v1

    .line 68
    :cond_1
    sget-object v3, Lxw3;->c:Lxw3;

    .line 69
    .line 70
    if-ne v2, v3, :cond_3

    .line 71
    .line 72
    const/16 v2, 0x1c

    .line 73
    .line 74
    if-gt v1, v2, :cond_2

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 78
    .line 79
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-string v2, "Invalid tag size in bytes %d; can be at most 28 bytes for SHA224"

    .line 84
    .line 85
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw v1

    .line 93
    :cond_3
    sget-object v3, Lxw3;->d:Lxw3;

    .line 94
    .line 95
    if-ne v2, v3, :cond_5

    .line 96
    .line 97
    const/16 v2, 0x20

    .line 98
    .line 99
    if-gt v1, v2, :cond_4

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_4
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 103
    .line 104
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const-string v2, "Invalid tag size in bytes %d; can be at most 32 bytes for SHA256"

    .line 109
    .line 110
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v1

    .line 118
    :cond_5
    sget-object v3, Lxw3;->e:Lxw3;

    .line 119
    .line 120
    if-ne v2, v3, :cond_7

    .line 121
    .line 122
    const/16 v2, 0x30

    .line 123
    .line 124
    if-gt v1, v2, :cond_6

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_6
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 128
    .line 129
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    const-string v2, "Invalid tag size in bytes %d; can be at most 48 bytes for SHA384"

    .line 134
    .line 135
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v1

    .line 143
    :cond_7
    sget-object v3, Lxw3;->f:Lxw3;

    .line 144
    .line 145
    if-ne v2, v3, :cond_9

    .line 146
    .line 147
    const/16 v2, 0x40

    .line 148
    .line 149
    if-gt v1, v2, :cond_8

    .line 150
    .line 151
    :goto_0
    new-instance v0, Lzw3;

    .line 152
    .line 153
    iget-object v1, p0, Lmc2;->g:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v1, Ljava/lang/Integer;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    iget-object v2, p0, Lmc2;->h:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v2, Ljava/lang/Integer;

    .line 164
    .line 165
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    iget-object v3, p0, Lmc2;->j:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v3, Lyw3;

    .line 172
    .line 173
    iget-object v4, p0, Lmc2;->i:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v4, Lxw3;

    .line 176
    .line 177
    invoke-direct {v0, v1, v2, v3, v4}, Lzw3;-><init>(IILyw3;Lxw3;)V

    .line 178
    .line 179
    .line 180
    return-object v0

    .line 181
    :cond_8
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 182
    .line 183
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    const-string v2, "Invalid tag size in bytes %d; can be at most 64 bytes for SHA512"

    .line 188
    .line 189
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw v1

    .line 197
    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 198
    .line 199
    const-string v1, "unknown hash type; must be SHA256, SHA384 or SHA512"

    .line 200
    .line 201
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    throw v0

    .line 205
    :cond_a
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 206
    .line 207
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    const-string v2, "Invalid tag size in bytes %d; must be at least 10 bytes"

    .line 212
    .line 213
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw v1

    .line 221
    :cond_b
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    .line 222
    .line 223
    iget-object v1, p0, Lmc2;->g:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v1, Ljava/lang/Integer;

    .line 226
    .line 227
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    const-string v2, "Invalid key size in bytes %d; must be at least 16 bytes"

    .line 232
    .line 233
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw v0

    .line 241
    :cond_c
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 242
    .line 243
    const-string v1, "hash type is not set"

    .line 244
    .line 245
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    throw v0

    .line 249
    :cond_d
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 250
    .line 251
    const-string v1, "tag size is not set"

    .line 252
    .line 253
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    throw v0

    .line 257
    :cond_e
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 258
    .line 259
    const-string v1, "key size is not set"

    .line 260
    .line 261
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw v0
.end method

.method public B()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lmc2;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lav1;

    .line 4
    .line 5
    iget v0, v0, Lav1;->f:I

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x6

    .line 18
    .line 19
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const-string v1, "LATMTD"

    .line 23
    .line 24
    invoke-static {v2, v1, v0}, Lex0;->j(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
.end method

.method public synthetic a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lmc2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb23;

    .line 4
    .line 5
    iget-object v1, p0, Lmc2;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lh83;

    .line 8
    .line 9
    iget-object v2, p0, Lmc2;->i:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, La83;

    .line 12
    .line 13
    iget-object v3, p0, Lmc2;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Lc03;

    .line 16
    .line 17
    iget-object v0, v0, Lb23;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lf03;

    .line 20
    .line 21
    invoke-interface {v0, v1, v2, v3}, Lf03;->b(Lh83;La83;Lc03;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public b(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V
    .locals 4

    .line 1
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lmc2;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lbw0;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lbw0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v2, 0x0

    .line 34
    :goto_0
    if-ge v2, v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {p0, v3, p2, p3}, Lmc2;->b(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    .line 54
    .line 55
    const-string p2, "This graph contains cyclic dependencies"

    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1
.end method

.method public c(Ljava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p1, Lc62;

    .line 2
    .line 3
    const-string v0, "callJs > getEngine: Promise fulfilled"

    .line 4
    .line 5
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lmc2;->h:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v1, p0, Lmc2;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lpd2;

    .line 13
    .line 14
    iget-object v2, p0, Lmc2;->j:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lk62;

    .line 17
    .line 18
    iget-object v3, p0, Lmc2;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Lx52;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    :try_start_0
    sget-object v4, Lhg4;->C:Lhg4;

    .line 26
    .line 27
    iget-object v4, v4, Lhg4;->c:Llf4;

    .line 28
    .line 29
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    sget-object v5, Lx32;->j:Lv32;

    .line 38
    .line 39
    new-instance v6, Lj62;

    .line 40
    .line 41
    invoke-direct {v6, v2, v3, v1}, Lj62;-><init>(Lk62;Lx52;Lpd2;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5, v4, v6}, Lv32;->a(Ljava/lang/String;Lk42;)V

    .line 45
    .line 46
    .line 47
    new-instance v5, Lorg/json/JSONObject;

    .line 48
    .line 49
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 50
    .line 51
    .line 52
    const-string v6, "id"

    .line 53
    .line 54
    invoke-virtual {v5, v6, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 55
    .line 56
    .line 57
    const-string v4, "args"

    .line 58
    .line 59
    iget-object v6, v2, Lk62;->d:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v6, Lg62;

    .line 62
    .line 63
    invoke-interface {v6, v0}, Lg62;->p(Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v5, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 68
    .line 69
    .line 70
    iget-object v0, v2, Lk62;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Ljava/lang/String;

    .line 73
    .line 74
    check-cast p1, Lm52;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-interface {p1, v0, v2}, Lm52;->s(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :catch_0
    move-exception p1

    .line 88
    :try_start_1
    invoke-virtual {v1, p1}, Lpd2;->b(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    const-string v0, "Unable to invokeJavascript"

    .line 92
    .line 93
    invoke-static {v0, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3}, Lx52;->w()V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :catchall_0
    move-exception p1

    .line 101
    invoke-virtual {v3}, Lx52;->w()V

    .line 102
    .line 103
    .line 104
    throw p1
.end method

.method public d(Landroid/util/JsonWriter;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lmc2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lmc2;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Lmc2;->i:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/Map;

    .line 12
    .line 13
    iget-object v3, p0, Lmc2;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, [B

    .line 16
    .line 17
    const-string v4, "params"

    .line 18
    .line 19
    invoke-virtual {p1, v4}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v4}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 24
    .line 25
    .line 26
    const-string v4, "firstline"

    .line 27
    .line 28
    invoke-virtual {p1, v4}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v4}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 33
    .line 34
    .line 35
    const-string v4, "uri"

    .line 36
    .line 37
    invoke-virtual {p1, v4}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v4, v0}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 42
    .line 43
    .line 44
    const-string v0, "verb"

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    .line 54
    .line 55
    .line 56
    invoke-static {p1, v2}, Lwb4;->d(Landroid/util/JsonWriter;Ljava/util/Map;)V

    .line 57
    .line 58
    .line 59
    if-eqz v3, :cond_0

    .line 60
    .line 61
    const-string v0, "body"

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const/4 v1, 0x0

    .line 68
    invoke-static {v3, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 73
    .line 74
    .line 75
    :cond_0
    invoke-virtual {p1}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public e(ILd02;[I)Lsn3;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    iget-object v1, v0, Lmc2;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/graphics/Point;

    .line 8
    .line 9
    iget-object v2, v0, Lmc2;->i:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, [I

    .line 12
    .line 13
    aget v2, v2, p1

    .line 14
    .line 15
    iget-object v2, v0, Lmc2;->g:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v5, v2

    .line 18
    check-cast v5, Ldj4;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget v2, v1, Landroid/graphics/Point;->x:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget v2, v5, Lr32;->e:I

    .line 26
    .line 27
    :goto_0
    if-eqz v1, :cond_1

    .line 28
    .line 29
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    iget v1, v5, Lr32;->f:I

    .line 33
    .line 34
    :goto_1
    iget-boolean v4, v5, Lr32;->h:Z

    .line 35
    .line 36
    const/4 v9, -0x1

    .line 37
    const v10, 0x7fffffff

    .line 38
    .line 39
    .line 40
    if-eq v2, v10, :cond_2

    .line 41
    .line 42
    if-ne v1, v10, :cond_3

    .line 43
    .line 44
    :cond_2
    move v11, v10

    .line 45
    goto/16 :goto_7

    .line 46
    .line 47
    :cond_3
    move v7, v10

    .line 48
    const/4 v6, 0x0

    .line 49
    :goto_2
    iget v8, v3, Ld02;->a:I

    .line 50
    .line 51
    if-ge v6, v8, :cond_9

    .line 52
    .line 53
    iget-object v8, v3, Ld02;->d:[Lph4;

    .line 54
    .line 55
    aget-object v8, v8, v6

    .line 56
    .line 57
    iget v13, v8, Lph4;->t:I

    .line 58
    .line 59
    if-lez v13, :cond_8

    .line 60
    .line 61
    iget v8, v8, Lph4;->u:I

    .line 62
    .line 63
    if-lez v8, :cond_8

    .line 64
    .line 65
    if-eqz v4, :cond_6

    .line 66
    .line 67
    if-gt v13, v8, :cond_4

    .line 68
    .line 69
    const/4 v14, 0x0

    .line 70
    goto :goto_3

    .line 71
    :cond_4
    const/4 v14, 0x1

    .line 72
    :goto_3
    if-gt v2, v1, :cond_5

    .line 73
    .line 74
    const/4 v15, 0x0

    .line 75
    goto :goto_4

    .line 76
    :cond_5
    const/4 v15, 0x1

    .line 77
    :goto_4
    if-eq v14, v15, :cond_6

    .line 78
    .line 79
    move v15, v1

    .line 80
    move v14, v2

    .line 81
    goto :goto_5

    .line 82
    :cond_6
    move v14, v1

    .line 83
    move v15, v2

    .line 84
    :goto_5
    mul-int v11, v13, v14

    .line 85
    .line 86
    mul-int v12, v8, v15

    .line 87
    .line 88
    if-lt v11, v12, :cond_7

    .line 89
    .line 90
    new-instance v11, Landroid/graphics/Point;

    .line 91
    .line 92
    sget-object v14, Lv23;->a:Ljava/lang/String;

    .line 93
    .line 94
    add-int/2addr v12, v13

    .line 95
    add-int/2addr v12, v9

    .line 96
    div-int/2addr v12, v13

    .line 97
    invoke-direct {v11, v15, v12}, Landroid/graphics/Point;-><init>(II)V

    .line 98
    .line 99
    .line 100
    goto :goto_6

    .line 101
    :cond_7
    new-instance v12, Landroid/graphics/Point;

    .line 102
    .line 103
    sget-object v15, Lv23;->a:Ljava/lang/String;

    .line 104
    .line 105
    add-int/2addr v11, v8

    .line 106
    add-int/2addr v11, v9

    .line 107
    div-int/2addr v11, v8

    .line 108
    invoke-direct {v12, v11, v14}, Landroid/graphics/Point;-><init>(II)V

    .line 109
    .line 110
    .line 111
    move-object v11, v12

    .line 112
    :goto_6
    mul-int v12, v13, v8

    .line 113
    .line 114
    iget v14, v11, Landroid/graphics/Point;->x:I

    .line 115
    .line 116
    int-to-float v14, v14

    .line 117
    const v15, 0x3f7ae148    # 0.98f

    .line 118
    .line 119
    .line 120
    mul-float/2addr v14, v15

    .line 121
    float-to-int v14, v14

    .line 122
    if-lt v13, v14, :cond_8

    .line 123
    .line 124
    iget v11, v11, Landroid/graphics/Point;->y:I

    .line 125
    .line 126
    int-to-float v11, v11

    .line 127
    mul-float/2addr v11, v15

    .line 128
    float-to-int v11, v11

    .line 129
    if-lt v8, v11, :cond_8

    .line 130
    .line 131
    if-ge v12, v7, :cond_8

    .line 132
    .line 133
    move v7, v12

    .line 134
    :cond_8
    add-int/lit8 v6, v6, 0x1

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_9
    move v11, v7

    .line 138
    :goto_7
    sget-object v1, Lxm3;->g:Lvm3;

    .line 139
    .line 140
    const-string v1, "initialCapacity"

    .line 141
    .line 142
    const/4 v2, 0x4

    .line 143
    invoke-static {v1, v2}, Lob1;->z(Ljava/lang/String;I)V

    .line 144
    .line 145
    .line 146
    new-array v1, v2, [Ljava/lang/Object;

    .line 147
    .line 148
    move-object v12, v1

    .line 149
    const/4 v4, 0x0

    .line 150
    const/4 v13, 0x0

    .line 151
    :goto_8
    iget v1, v3, Ld02;->a:I

    .line 152
    .line 153
    if-ge v4, v1, :cond_f

    .line 154
    .line 155
    iget-object v1, v3, Ld02;->d:[Lph4;

    .line 156
    .line 157
    aget-object v1, v1, v4

    .line 158
    .line 159
    iget v2, v1, Lph4;->t:I

    .line 160
    .line 161
    if-eq v2, v9, :cond_b

    .line 162
    .line 163
    iget v1, v1, Lph4;->u:I

    .line 164
    .line 165
    if-ne v1, v9, :cond_a

    .line 166
    .line 167
    goto :goto_9

    .line 168
    :cond_a
    mul-int/2addr v2, v1

    .line 169
    goto :goto_a

    .line 170
    :cond_b
    :goto_9
    move v2, v9

    .line 171
    :goto_a
    if-eq v11, v10, :cond_c

    .line 172
    .line 173
    if-eq v2, v9, :cond_d

    .line 174
    .line 175
    if-gt v2, v11, :cond_d

    .line 176
    .line 177
    :cond_c
    const/4 v8, 0x1

    .line 178
    goto :goto_b

    .line 179
    :cond_d
    const/4 v8, 0x0

    .line 180
    :goto_b
    iget-object v1, v0, Lmc2;->h:Ljava/lang/Object;

    .line 181
    .line 182
    move-object v7, v1

    .line 183
    check-cast v7, Ljava/lang/String;

    .line 184
    .line 185
    new-instance v1, Lkj4;

    .line 186
    .line 187
    aget v6, p3, v4

    .line 188
    .line 189
    move/from16 v2, p1

    .line 190
    .line 191
    invoke-direct/range {v1 .. v8}, Lkj4;-><init>(ILd02;ILdj4;ILjava/lang/String;Z)V

    .line 192
    .line 193
    .line 194
    array-length v2, v12

    .line 195
    add-int/lit8 v3, v13, 0x1

    .line 196
    .line 197
    invoke-static {v2, v3}, Lrm3;->d(II)I

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    if-gt v6, v2, :cond_e

    .line 202
    .line 203
    goto :goto_c

    .line 204
    :cond_e
    invoke-static {v12, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    move-object v12, v2

    .line 209
    :goto_c
    aput-object v1, v12, v13

    .line 210
    .line 211
    add-int/lit8 v4, v4, 0x1

    .line 212
    .line 213
    move v13, v3

    .line 214
    move-object/from16 v3, p2

    .line 215
    .line 216
    goto :goto_8

    .line 217
    :cond_f
    invoke-static {v12, v13}, Lxm3;->o([Ljava/lang/Object;I)Lsn3;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    return-object v1
.end method

.method public f(Ljw0;)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    iget-object v1, v0, Lmc2;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lbc;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v11, Lzt0;->h:Lge;

    .line 13
    .line 14
    sget-object v12, Lbc;->b:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 15
    .line 16
    invoke-virtual {v12, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    const/4 v13, 0x0

    .line 21
    invoke-virtual {v1, v2, v3, v13}, Lbc;->i(JZ)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    const/4 v14, 0x1

    .line 26
    const-wide v15, 0xfffffffffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    move v2, v13

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    and-long/2addr v2, v15

    .line 36
    invoke-virtual {v1, v2, v3}, Lbc;->a(J)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    xor-int/2addr v2, v14

    .line 41
    :goto_0
    if-eqz v2, :cond_1

    .line 42
    .line 43
    const/4 v14, 0x3

    .line 44
    goto/16 :goto_12

    .line 45
    .line 46
    :cond_1
    sget-object v2, Ldc;->j:Lgs3;

    .line 47
    .line 48
    sget-object v7, Lbc;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 49
    .line 50
    invoke-virtual {v7, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    check-cast v7, Lhe;

    .line 55
    .line 56
    :goto_1
    invoke-virtual {v12, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 57
    .line 58
    .line 59
    move-result-wide v8

    .line 60
    and-long v17, v8, v15

    .line 61
    .line 62
    invoke-virtual {v1, v8, v9, v13}, Lbc;->i(JZ)Z

    .line 63
    .line 64
    .line 65
    move-result v19

    .line 66
    sget v8, Ldc;->b:I

    .line 67
    .line 68
    int-to-long v9, v8

    .line 69
    div-long v5, v17, v9

    .line 70
    .line 71
    rem-long v9, v17, v9

    .line 72
    .line 73
    long-to-int v9, v9

    .line 74
    move/from16 v22, v14

    .line 75
    .line 76
    iget-wide v13, v7, Lyt0;->c:J

    .line 77
    .line 78
    cmp-long v10, v13, v5

    .line 79
    .line 80
    if-eqz v10, :cond_f

    .line 81
    .line 82
    sget-object v13, Lbc;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 83
    .line 84
    sget-object v10, Lbc;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 85
    .line 86
    sget-object v14, Ldc;->a:Lhe;

    .line 87
    .line 88
    sget-object v14, Lcc;->n:Lcc;

    .line 89
    .line 90
    :goto_2
    invoke-static {v7, v5, v6, v14}, Li41;->f(Lyt0;JLhy;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v23

    .line 94
    invoke-static/range {v23 .. v23}, Lum;->p(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v24

    .line 98
    if-nez v24, :cond_6

    .line 99
    .line 100
    invoke-static/range {v23 .. v23}, Lum;->m(Ljava/lang/Object;)Lyt0;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    :goto_3
    invoke-virtual {v10, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v25

    .line 108
    move-wide/from16 v26, v15

    .line 109
    .line 110
    move-object/from16 v15, v25

    .line 111
    .line 112
    check-cast v15, Lyt0;

    .line 113
    .line 114
    move-wide/from16 v28, v5

    .line 115
    .line 116
    iget-wide v5, v15, Lyt0;->c:J

    .line 117
    .line 118
    move-wide/from16 v30, v5

    .line 119
    .line 120
    iget-wide v5, v3, Lyt0;->c:J

    .line 121
    .line 122
    cmp-long v5, v30, v5

    .line 123
    .line 124
    if-ltz v5, :cond_2

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_2
    invoke-virtual {v3}, Lyt0;->i()Z

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    if-nez v5, :cond_3

    .line 132
    .line 133
    move-wide/from16 v15, v26

    .line 134
    .line 135
    move-wide/from16 v5, v28

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_3
    invoke-virtual {v10, v1, v15, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-eqz v5, :cond_4

    .line 143
    .line 144
    invoke-virtual {v15}, Lyt0;->e()Z

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-eqz v3, :cond_7

    .line 149
    .line 150
    invoke-virtual {v15}, Lnh;->d()V

    .line 151
    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_4
    invoke-virtual {v10, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    if-eq v5, v15, :cond_3

    .line 159
    .line 160
    invoke-virtual {v3}, Lyt0;->e()Z

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    if-eqz v5, :cond_5

    .line 165
    .line 166
    invoke-virtual {v3}, Lnh;->d()V

    .line 167
    .line 168
    .line 169
    :cond_5
    move-wide/from16 v15, v26

    .line 170
    .line 171
    move-wide/from16 v5, v28

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_6
    move-wide/from16 v28, v5

    .line 175
    .line 176
    move-wide/from16 v26, v15

    .line 177
    .line 178
    :cond_7
    :goto_4
    invoke-static/range {v23 .. v23}, Lum;->p(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-eqz v3, :cond_9

    .line 183
    .line 184
    invoke-virtual {v1}, Lbc;->c()V

    .line 185
    .line 186
    .line 187
    iget-wide v5, v7, Lyt0;->c:J

    .line 188
    .line 189
    sget v3, Ldc;->b:I

    .line 190
    .line 191
    int-to-long v14, v3

    .line 192
    mul-long/2addr v5, v14

    .line 193
    invoke-virtual {v13, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 194
    .line 195
    .line 196
    move-result-wide v13

    .line 197
    cmp-long v3, v5, v13

    .line 198
    .line 199
    if-gez v3, :cond_8

    .line 200
    .line 201
    invoke-virtual {v7}, Lnh;->a()V

    .line 202
    .line 203
    .line 204
    move-object v6, v1

    .line 205
    move-object/from16 v25, v2

    .line 206
    .line 207
    move-object v1, v7

    .line 208
    move/from16 v16, v8

    .line 209
    .line 210
    move v3, v9

    .line 211
    const/4 v2, 0x0

    .line 212
    :goto_5
    const/16 v20, 0x3

    .line 213
    .line 214
    const/16 v21, 0x0

    .line 215
    .line 216
    goto/16 :goto_9

    .line 217
    .line 218
    :cond_8
    move-object v6, v1

    .line 219
    move-object/from16 v25, v2

    .line 220
    .line 221
    move-object v1, v7

    .line 222
    move/from16 v16, v8

    .line 223
    .line 224
    move v3, v9

    .line 225
    const/16 v20, 0x3

    .line 226
    .line 227
    const/16 v21, 0x0

    .line 228
    .line 229
    goto/16 :goto_8

    .line 230
    .line 231
    :cond_9
    invoke-static/range {v23 .. v23}, Lum;->m(Ljava/lang/Object;)Lyt0;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    check-cast v3, Lhe;

    .line 236
    .line 237
    iget-wide v14, v3, Lyt0;->c:J

    .line 238
    .line 239
    cmp-long v5, v14, v28

    .line 240
    .line 241
    if-lez v5, :cond_d

    .line 242
    .line 243
    sget v5, Ldc;->b:I

    .line 244
    .line 245
    int-to-long v5, v5

    .line 246
    mul-long v28, v14, v5

    .line 247
    .line 248
    sget-object v5, Lbc;->b:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 249
    .line 250
    move-object v6, v7

    .line 251
    move v10, v8

    .line 252
    :goto_6
    invoke-virtual {v5, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 253
    .line 254
    .line 255
    move-result-wide v7

    .line 256
    and-long v30, v7, v26

    .line 257
    .line 258
    cmp-long v16, v30, v28

    .line 259
    .line 260
    if-ltz v16, :cond_a

    .line 261
    .line 262
    move-object/from16 v16, v6

    .line 263
    .line 264
    move-object v6, v1

    .line 265
    move-object/from16 v1, v16

    .line 266
    .line 267
    move-object/from16 v25, v2

    .line 268
    .line 269
    move-object v2, v3

    .line 270
    move v3, v9

    .line 271
    move/from16 v16, v10

    .line 272
    .line 273
    const/16 v20, 0x3

    .line 274
    .line 275
    const/16 v21, 0x0

    .line 276
    .line 277
    goto :goto_7

    .line 278
    :cond_a
    const/16 v16, 0x3c

    .line 279
    .line 280
    move-object/from16 v23, v1

    .line 281
    .line 282
    move-object/from16 v25, v2

    .line 283
    .line 284
    shr-long v1, v7, v16

    .line 285
    .line 286
    long-to-int v1, v1

    .line 287
    int-to-long v1, v1

    .line 288
    shl-long v1, v1, v16

    .line 289
    .line 290
    add-long v1, v1, v30

    .line 291
    .line 292
    move-object/from16 v16, v5

    .line 293
    .line 294
    sget-object v5, Lbc;->b:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 295
    .line 296
    const/16 v20, 0x3

    .line 297
    .line 298
    const/16 v21, 0x0

    .line 299
    .line 300
    move-wide/from16 v32, v1

    .line 301
    .line 302
    move-object v2, v3

    .line 303
    move-object v1, v6

    .line 304
    move v3, v9

    .line 305
    move-object/from16 v6, v23

    .line 306
    .line 307
    move-object/from16 v23, v16

    .line 308
    .line 309
    move/from16 v16, v10

    .line 310
    .line 311
    move-wide/from16 v9, v32

    .line 312
    .line 313
    invoke-virtual/range {v5 .. v10}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 314
    .line 315
    .line 316
    move-result v5

    .line 317
    if-eqz v5, :cond_c

    .line 318
    .line 319
    :goto_7
    sget v5, Ldc;->b:I

    .line 320
    .line 321
    int-to-long v7, v5

    .line 322
    mul-long/2addr v14, v7

    .line 323
    invoke-virtual {v13, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 324
    .line 325
    .line 326
    move-result-wide v7

    .line 327
    cmp-long v5, v14, v7

    .line 328
    .line 329
    if-gez v5, :cond_b

    .line 330
    .line 331
    invoke-virtual {v2}, Lnh;->a()V

    .line 332
    .line 333
    .line 334
    :cond_b
    :goto_8
    move-object/from16 v2, v21

    .line 335
    .line 336
    goto :goto_9

    .line 337
    :cond_c
    move-object v5, v6

    .line 338
    move-object v6, v1

    .line 339
    move-object v1, v5

    .line 340
    move v9, v3

    .line 341
    move/from16 v10, v16

    .line 342
    .line 343
    move-object/from16 v5, v23

    .line 344
    .line 345
    move-object v3, v2

    .line 346
    move-object/from16 v2, v25

    .line 347
    .line 348
    goto :goto_6

    .line 349
    :cond_d
    move-object v6, v1

    .line 350
    move-object/from16 v25, v2

    .line 351
    .line 352
    move-object v2, v3

    .line 353
    move-object v1, v7

    .line 354
    move/from16 v16, v8

    .line 355
    .line 356
    move v3, v9

    .line 357
    goto/16 :goto_5

    .line 358
    .line 359
    :goto_9
    if-nez v2, :cond_10

    .line 360
    .line 361
    if-eqz v19, :cond_e

    .line 362
    .line 363
    invoke-virtual {v6}, Lbc;->f()Ljava/lang/Throwable;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    new-instance v11, Lfe;

    .line 368
    .line 369
    invoke-direct {v11, v1}, Lfe;-><init>(Ljava/lang/Throwable;)V

    .line 370
    .line 371
    .line 372
    move/from16 v14, v20

    .line 373
    .line 374
    goto/16 :goto_12

    .line 375
    .line 376
    :cond_e
    move-object v7, v1

    .line 377
    move-object v1, v6

    .line 378
    move/from16 v14, v22

    .line 379
    .line 380
    move-object/from16 v2, v25

    .line 381
    .line 382
    :goto_a
    move-wide/from16 v15, v26

    .line 383
    .line 384
    const/4 v13, 0x0

    .line 385
    goto/16 :goto_1

    .line 386
    .line 387
    :cond_f
    move-object v6, v1

    .line 388
    move-object/from16 v25, v2

    .line 389
    .line 390
    move-object v1, v7

    .line 391
    move v3, v9

    .line 392
    move-wide/from16 v26, v15

    .line 393
    .line 394
    const/16 v20, 0x3

    .line 395
    .line 396
    const/16 v21, 0x0

    .line 397
    .line 398
    move/from16 v16, v8

    .line 399
    .line 400
    move-object v2, v1

    .line 401
    :cond_10
    invoke-virtual {v2, v3, v4}, Lhe;->m(ILjw0;)V

    .line 402
    .line 403
    .line 404
    const/4 v10, 0x2

    .line 405
    if-eqz v19, :cond_11

    .line 406
    .line 407
    move-object v1, v6

    .line 408
    move-wide/from16 v5, v17

    .line 409
    .line 410
    move/from16 v8, v19

    .line 411
    .line 412
    move/from16 v14, v20

    .line 413
    .line 414
    move-object/from16 v15, v21

    .line 415
    .line 416
    move-object/from16 v7, v25

    .line 417
    .line 418
    const/4 v13, 0x4

    .line 419
    invoke-virtual/range {v1 .. v8}, Lbc;->p(Lhe;ILjw0;JLjava/lang/Object;Z)I

    .line 420
    .line 421
    .line 422
    move-result v17

    .line 423
    move/from16 v13, v17

    .line 424
    .line 425
    :goto_b
    move/from16 v9, v22

    .line 426
    .line 427
    goto/16 :goto_e

    .line 428
    .line 429
    :cond_11
    move-object v1, v6

    .line 430
    move-wide/from16 v5, v17

    .line 431
    .line 432
    move/from16 v8, v19

    .line 433
    .line 434
    move/from16 v14, v20

    .line 435
    .line 436
    move-object/from16 v15, v21

    .line 437
    .line 438
    move-object/from16 v7, v25

    .line 439
    .line 440
    const/4 v13, 0x4

    .line 441
    invoke-virtual {v2, v3}, Lhe;->k(I)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v9

    .line 445
    if-nez v9, :cond_15

    .line 446
    .line 447
    invoke-virtual {v1, v5, v6}, Lbc;->a(J)Z

    .line 448
    .line 449
    .line 450
    move-result v9

    .line 451
    if-eqz v9, :cond_13

    .line 452
    .line 453
    sget-object v9, Ldc;->d:Lgs3;

    .line 454
    .line 455
    invoke-virtual {v2, v3, v15, v9}, Lhe;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v9

    .line 459
    if-eqz v9, :cond_12

    .line 460
    .line 461
    move/from16 v9, v22

    .line 462
    .line 463
    move v13, v9

    .line 464
    goto :goto_e

    .line 465
    :cond_12
    move/from16 v9, v22

    .line 466
    .line 467
    goto :goto_d

    .line 468
    :cond_13
    if-nez v7, :cond_14

    .line 469
    .line 470
    move v13, v14

    .line 471
    goto :goto_b

    .line 472
    :cond_14
    invoke-virtual {v2, v3, v15, v7}, Lhe;->j(ILjava/lang/Object;Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    move-result v9

    .line 476
    if-eqz v9, :cond_12

    .line 477
    .line 478
    move v13, v10

    .line 479
    goto :goto_b

    .line 480
    :cond_15
    instance-of v13, v9, Lw71;

    .line 481
    .line 482
    if-eqz v13, :cond_12

    .line 483
    .line 484
    invoke-virtual {v2, v3, v15}, Lhe;->m(ILjw0;)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v1, v9, v4}, Lbc;->m(Ljava/lang/Object;Ljw0;)Z

    .line 488
    .line 489
    .line 490
    move-result v9

    .line 491
    if-eqz v9, :cond_16

    .line 492
    .line 493
    sget-object v9, Ldc;->i:Lgs3;

    .line 494
    .line 495
    invoke-virtual {v2, v3, v9}, Lhe;->n(ILjava/lang/Object;)V

    .line 496
    .line 497
    .line 498
    move/from16 v9, v22

    .line 499
    .line 500
    const/4 v13, 0x0

    .line 501
    goto :goto_e

    .line 502
    :cond_16
    sget-object v9, Ldc;->k:Lgs3;

    .line 503
    .line 504
    iget-object v13, v2, Lhe;->f:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 505
    .line 506
    mul-int/lit8 v18, v3, 0x2

    .line 507
    .line 508
    add-int/lit8 v15, v18, 0x1

    .line 509
    .line 510
    invoke-virtual {v13, v15, v9}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v13

    .line 514
    if-eq v13, v9, :cond_17

    .line 515
    .line 516
    move/from16 v9, v22

    .line 517
    .line 518
    invoke-virtual {v2, v3, v9}, Lhe;->l(IZ)V

    .line 519
    .line 520
    .line 521
    goto :goto_c

    .line 522
    :cond_17
    move/from16 v9, v22

    .line 523
    .line 524
    :goto_c
    const/4 v13, 0x5

    .line 525
    goto :goto_e

    .line 526
    :goto_d
    invoke-virtual/range {v1 .. v8}, Lbc;->p(Lhe;ILjw0;JLjava/lang/Object;Z)I

    .line 527
    .line 528
    .line 529
    move-result v13

    .line 530
    :goto_e
    sget-object v4, Lz31;->a:Lz31;

    .line 531
    .line 532
    if-eqz v13, :cond_21

    .line 533
    .line 534
    if-eq v13, v9, :cond_20

    .line 535
    .line 536
    if-eq v13, v10, :cond_1c

    .line 537
    .line 538
    if-eq v13, v14, :cond_1b

    .line 539
    .line 540
    const/4 v3, 0x4

    .line 541
    if-eq v13, v3, :cond_19

    .line 542
    .line 543
    const/4 v3, 0x5

    .line 544
    if-eq v13, v3, :cond_18

    .line 545
    .line 546
    goto :goto_f

    .line 547
    :cond_18
    invoke-virtual {v2}, Lnh;->a()V

    .line 548
    .line 549
    .line 550
    :goto_f
    move-object v4, v7

    .line 551
    move-object v7, v2

    .line 552
    move-object v2, v4

    .line 553
    move-object/from16 v4, p1

    .line 554
    .line 555
    move v14, v9

    .line 556
    goto/16 :goto_a

    .line 557
    .line 558
    :cond_19
    sget-object v3, Lbc;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 559
    .line 560
    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 561
    .line 562
    .line 563
    move-result-wide v3

    .line 564
    cmp-long v3, v5, v3

    .line 565
    .line 566
    if-gez v3, :cond_1a

    .line 567
    .line 568
    invoke-virtual {v2}, Lnh;->a()V

    .line 569
    .line 570
    .line 571
    :cond_1a
    invoke-virtual {v1}, Lbc;->f()Ljava/lang/Throwable;

    .line 572
    .line 573
    .line 574
    move-result-object v1

    .line 575
    new-instance v11, Lfe;

    .line 576
    .line 577
    invoke-direct {v11, v1}, Lfe;-><init>(Ljava/lang/Throwable;)V

    .line 578
    .line 579
    .line 580
    goto :goto_12

    .line 581
    :cond_1b
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 582
    .line 583
    const-string v2, "unexpected"

    .line 584
    .line 585
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    throw v1

    .line 589
    :cond_1c
    if-eqz v8, :cond_1d

    .line 590
    .line 591
    invoke-virtual {v2}, Lyt0;->h()V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v1}, Lbc;->f()Ljava/lang/Throwable;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    new-instance v11, Lfe;

    .line 599
    .line 600
    invoke-direct {v11, v1}, Lfe;-><init>(Ljava/lang/Throwable;)V

    .line 601
    .line 602
    .line 603
    goto :goto_12

    .line 604
    :cond_1d
    instance-of v1, v7, Lw71;

    .line 605
    .line 606
    if-eqz v1, :cond_1e

    .line 607
    .line 608
    move-object v6, v7

    .line 609
    check-cast v6, Lw71;

    .line 610
    .line 611
    goto :goto_10

    .line 612
    :cond_1e
    const/4 v6, 0x0

    .line 613
    :goto_10
    if-eqz v6, :cond_1f

    .line 614
    .line 615
    add-int v9, v3, v16

    .line 616
    .line 617
    invoke-interface {v6, v2, v9}, Lw71;->a(Lyt0;I)V

    .line 618
    .line 619
    .line 620
    :cond_1f
    invoke-virtual {v2}, Lyt0;->h()V

    .line 621
    .line 622
    .line 623
    goto :goto_12

    .line 624
    :cond_20
    :goto_11
    move-object v11, v4

    .line 625
    goto :goto_12

    .line 626
    :cond_21
    invoke-virtual {v2}, Lnh;->a()V

    .line 627
    .line 628
    .line 629
    goto :goto_11

    .line 630
    :goto_12
    instance-of v1, v11, Lfe;

    .line 631
    .line 632
    if-eqz v1, :cond_23

    .line 633
    .line 634
    check-cast v11, Lfe;

    .line 635
    .line 636
    iget-object v1, v11, Lfe;->a:Ljava/lang/Throwable;

    .line 637
    .line 638
    if-nez v1, :cond_22

    .line 639
    .line 640
    new-instance v1, Lvf;

    .line 641
    .line 642
    const-string v2, "Channel was closed normally"

    .line 643
    .line 644
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 645
    .line 646
    .line 647
    :cond_22
    throw v1

    .line 648
    :cond_23
    instance-of v1, v11, Lge;

    .line 649
    .line 650
    if-nez v1, :cond_25

    .line 651
    .line 652
    iget-object v1, v0, Lmc2;->j:Ljava/lang/Object;

    .line 653
    .line 654
    check-cast v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 655
    .line 656
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 657
    .line 658
    .line 659
    move-result v1

    .line 660
    if-nez v1, :cond_24

    .line 661
    .line 662
    iget-object v1, v0, Lmc2;->g:Ljava/lang/Object;

    .line 663
    .line 664
    check-cast v1, Lqk;

    .line 665
    .line 666
    new-instance v2, Lkm;

    .line 667
    .line 668
    const/4 v3, 0x4

    .line 669
    const/4 v15, 0x0

    .line 670
    invoke-direct {v2, v0, v15, v3}, Lkm;-><init>(Ljava/lang/Object;Loj;I)V

    .line 671
    .line 672
    .line 673
    invoke-static {v1, v15, v2, v14}, Lgi2;->q(Lqk;Lhk;Lhy;I)Lyn;

    .line 674
    .line 675
    .line 676
    :cond_24
    return-void

    .line 677
    :cond_25
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 678
    .line 679
    const-string v2, "Check failed."

    .line 680
    .line 681
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 682
    .line 683
    .line 684
    throw v1
.end method

.method public g([BIILlk1;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    add-int v2, v1, p3

    .line 6
    .line 7
    iget-object v3, v0, Lmc2;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Lkz2;

    .line 10
    .line 11
    move-object/from16 v4, p1

    .line 12
    .line 13
    invoke-virtual {v3, v2, v4}, Lkz2;->z(I[B)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3, v1}, Lkz2;->E(I)V

    .line 17
    .line 18
    .line 19
    iget-object v1, v0, Lmc2;->j:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Ljava/util/zip/Inflater;

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    new-instance v1, Ljava/util/zip/Inflater;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/zip/Inflater;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v1, v0, Lmc2;->j:Ljava/lang/Object;

    .line 31
    .line 32
    :cond_0
    iget-object v1, v0, Lmc2;->h:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lkz2;

    .line 35
    .line 36
    iget-object v2, v0, Lmc2;->j:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Ljava/util/zip/Inflater;

    .line 39
    .line 40
    invoke-static {v3, v1, v2}, Lv23;->g(Lkz2;Lkz2;Ljava/util/zip/Inflater;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    iget-object v2, v1, Lkz2;->a:[B

    .line 47
    .line 48
    iget v1, v1, Lkz2;->c:I

    .line 49
    .line 50
    invoke-virtual {v3, v1, v2}, Lkz2;->z(I[B)V

    .line 51
    .line 52
    .line 53
    :cond_1
    iget-object v1, v0, Lmc2;->i:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Lml1;

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    iput-boolean v2, v1, Lml1;->c:Z

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    iput-object v4, v1, Lml1;->g:Landroid/graphics/Rect;

    .line 62
    .line 63
    const/4 v5, -0x1

    .line 64
    iput v5, v1, Lml1;->h:I

    .line 65
    .line 66
    iput v5, v1, Lml1;->i:I

    .line 67
    .line 68
    invoke-virtual {v3}, Lkz2;->B()I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    const/4 v7, 0x2

    .line 73
    if-lt v6, v7, :cond_a

    .line 74
    .line 75
    invoke-virtual {v3}, Lkz2;->L()I

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-eq v8, v6, :cond_2

    .line 80
    .line 81
    goto/16 :goto_4

    .line 82
    .line 83
    :cond_2
    iget-object v6, v1, Lml1;->a:[I

    .line 84
    .line 85
    iget-object v8, v1, Lml1;->d:[I

    .line 86
    .line 87
    const/4 v9, 0x1

    .line 88
    if-eqz v8, :cond_8

    .line 89
    .line 90
    iget-boolean v10, v1, Lml1;->b:Z

    .line 91
    .line 92
    if-nez v10, :cond_3

    .line 93
    .line 94
    goto/16 :goto_2

    .line 95
    .line 96
    :cond_3
    invoke-virtual {v3}, Lkz2;->L()I

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    add-int/lit8 v10, v10, -0x2

    .line 101
    .line 102
    invoke-virtual {v3, v10}, Lkz2;->G(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3}, Lkz2;->L()I

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    :goto_0
    :pswitch_0
    iget v11, v3, Lkz2;->b:I

    .line 110
    .line 111
    if-ge v11, v10, :cond_8

    .line 112
    .line 113
    invoke-virtual {v3}, Lkz2;->B()I

    .line 114
    .line 115
    .line 116
    move-result v11

    .line 117
    if-lez v11, :cond_8

    .line 118
    .line 119
    invoke-virtual {v3}, Lkz2;->K()I

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    const/4 v12, 0x3

    .line 124
    const/4 v13, 0x4

    .line 125
    packed-switch v11, :pswitch_data_0

    .line 126
    .line 127
    .line 128
    goto/16 :goto_2

    .line 129
    .line 130
    :pswitch_1
    invoke-virtual {v3}, Lkz2;->B()I

    .line 131
    .line 132
    .line 133
    move-result v11

    .line 134
    if-lt v11, v13, :cond_8

    .line 135
    .line 136
    invoke-virtual {v3}, Lkz2;->L()I

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    iput v11, v1, Lml1;->h:I

    .line 141
    .line 142
    invoke-virtual {v3}, Lkz2;->L()I

    .line 143
    .line 144
    .line 145
    move-result v11

    .line 146
    iput v11, v1, Lml1;->i:I

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :pswitch_2
    invoke-virtual {v3}, Lkz2;->B()I

    .line 150
    .line 151
    .line 152
    move-result v11

    .line 153
    const/4 v12, 0x6

    .line 154
    if-lt v11, v12, :cond_8

    .line 155
    .line 156
    invoke-virtual {v3}, Lkz2;->K()I

    .line 157
    .line 158
    .line 159
    move-result v11

    .line 160
    invoke-virtual {v3}, Lkz2;->K()I

    .line 161
    .line 162
    .line 163
    move-result v12

    .line 164
    invoke-virtual {v3}, Lkz2;->K()I

    .line 165
    .line 166
    .line 167
    move-result v14

    .line 168
    shl-int/2addr v11, v13

    .line 169
    shr-int/lit8 v15, v12, 0x4

    .line 170
    .line 171
    and-int/lit8 v12, v12, 0xf

    .line 172
    .line 173
    shl-int/lit8 v12, v12, 0x8

    .line 174
    .line 175
    or-int/2addr v12, v14

    .line 176
    invoke-virtual {v3}, Lkz2;->K()I

    .line 177
    .line 178
    .line 179
    move-result v14

    .line 180
    invoke-virtual {v3}, Lkz2;->K()I

    .line 181
    .line 182
    .line 183
    move-result v16

    .line 184
    invoke-virtual {v3}, Lkz2;->K()I

    .line 185
    .line 186
    .line 187
    move-result v17

    .line 188
    shl-int/lit8 v13, v14, 0x4

    .line 189
    .line 190
    shr-int/lit8 v14, v16, 0x4

    .line 191
    .line 192
    and-int/lit8 v16, v16, 0xf

    .line 193
    .line 194
    shl-int/lit8 v16, v16, 0x8

    .line 195
    .line 196
    or-int v16, v16, v17

    .line 197
    .line 198
    new-instance v4, Landroid/graphics/Rect;

    .line 199
    .line 200
    or-int/2addr v11, v15

    .line 201
    or-int/2addr v13, v14

    .line 202
    add-int/2addr v12, v9

    .line 203
    add-int/lit8 v14, v16, 0x1

    .line 204
    .line 205
    invoke-direct {v4, v11, v13, v12, v14}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 206
    .line 207
    .line 208
    iput-object v4, v1, Lml1;->g:Landroid/graphics/Rect;

    .line 209
    .line 210
    :goto_1
    const/4 v4, 0x0

    .line 211
    goto :goto_0

    .line 212
    :pswitch_3
    invoke-virtual {v3}, Lkz2;->B()I

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    if-lt v4, v7, :cond_8

    .line 217
    .line 218
    iget-boolean v4, v1, Lml1;->c:Z

    .line 219
    .line 220
    if-eqz v4, :cond_8

    .line 221
    .line 222
    invoke-virtual {v3}, Lkz2;->K()I

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    invoke-virtual {v3}, Lkz2;->K()I

    .line 227
    .line 228
    .line 229
    move-result v11

    .line 230
    aget v13, v6, v12

    .line 231
    .line 232
    shr-int/lit8 v14, v4, 0x4

    .line 233
    .line 234
    invoke-static {v13, v14}, Lml1;->a(II)I

    .line 235
    .line 236
    .line 237
    move-result v13

    .line 238
    aput v13, v6, v12

    .line 239
    .line 240
    aget v12, v6, v7

    .line 241
    .line 242
    and-int/lit8 v4, v4, 0xf

    .line 243
    .line 244
    invoke-static {v12, v4}, Lml1;->a(II)I

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    aput v4, v6, v7

    .line 249
    .line 250
    aget v4, v6, v9

    .line 251
    .line 252
    shr-int/lit8 v12, v11, 0x4

    .line 253
    .line 254
    invoke-static {v4, v12}, Lml1;->a(II)I

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    aput v4, v6, v9

    .line 259
    .line 260
    aget v4, v6, v2

    .line 261
    .line 262
    and-int/lit8 v11, v11, 0xf

    .line 263
    .line 264
    invoke-static {v4, v11}, Lml1;->a(II)I

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    aput v4, v6, v2

    .line 269
    .line 270
    goto :goto_1

    .line 271
    :pswitch_4
    invoke-virtual {v3}, Lkz2;->B()I

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    if-lt v4, v7, :cond_8

    .line 276
    .line 277
    invoke-virtual {v3}, Lkz2;->K()I

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    invoke-virtual {v3}, Lkz2;->K()I

    .line 282
    .line 283
    .line 284
    move-result v11

    .line 285
    shr-int/lit8 v13, v4, 0x4

    .line 286
    .line 287
    array-length v14, v8

    .line 288
    if-lt v13, v14, :cond_4

    .line 289
    .line 290
    move v13, v2

    .line 291
    :cond_4
    aget v13, v8, v13

    .line 292
    .line 293
    aput v13, v6, v12

    .line 294
    .line 295
    and-int/lit8 v4, v4, 0xf

    .line 296
    .line 297
    array-length v12, v8

    .line 298
    if-lt v4, v12, :cond_5

    .line 299
    .line 300
    move v4, v2

    .line 301
    :cond_5
    aget v4, v8, v4

    .line 302
    .line 303
    aput v4, v6, v7

    .line 304
    .line 305
    shr-int/lit8 v4, v11, 0x4

    .line 306
    .line 307
    array-length v12, v8

    .line 308
    if-lt v4, v12, :cond_6

    .line 309
    .line 310
    move v4, v2

    .line 311
    :cond_6
    aget v4, v8, v4

    .line 312
    .line 313
    aput v4, v6, v9

    .line 314
    .line 315
    and-int/lit8 v4, v11, 0xf

    .line 316
    .line 317
    array-length v11, v8

    .line 318
    if-lt v4, v11, :cond_7

    .line 319
    .line 320
    move v4, v2

    .line 321
    :cond_7
    aget v4, v8, v4

    .line 322
    .line 323
    aput v4, v6, v2

    .line 324
    .line 325
    iput-boolean v9, v1, Lml1;->c:Z

    .line 326
    .line 327
    goto :goto_1

    .line 328
    :cond_8
    :goto_2
    iget-object v4, v1, Lml1;->d:[I

    .line 329
    .line 330
    if-eqz v4, :cond_a

    .line 331
    .line 332
    iget-boolean v4, v1, Lml1;->b:Z

    .line 333
    .line 334
    if-eqz v4, :cond_a

    .line 335
    .line 336
    iget-boolean v4, v1, Lml1;->c:Z

    .line 337
    .line 338
    if-eqz v4, :cond_a

    .line 339
    .line 340
    iget-object v4, v1, Lml1;->g:Landroid/graphics/Rect;

    .line 341
    .line 342
    if-eqz v4, :cond_a

    .line 343
    .line 344
    iget v6, v1, Lml1;->h:I

    .line 345
    .line 346
    if-eq v6, v5, :cond_a

    .line 347
    .line 348
    iget v6, v1, Lml1;->i:I

    .line 349
    .line 350
    if-eq v6, v5, :cond_a

    .line 351
    .line 352
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 353
    .line 354
    .line 355
    move-result v4

    .line 356
    if-lt v4, v7, :cond_a

    .line 357
    .line 358
    iget-object v4, v1, Lml1;->g:Landroid/graphics/Rect;

    .line 359
    .line 360
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 361
    .line 362
    .line 363
    move-result v4

    .line 364
    if-ge v4, v7, :cond_9

    .line 365
    .line 366
    goto :goto_3

    .line 367
    :cond_9
    iget-object v4, v1, Lml1;->g:Landroid/graphics/Rect;

    .line 368
    .line 369
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 370
    .line 371
    .line 372
    move-result v5

    .line 373
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 374
    .line 375
    .line 376
    move-result v6

    .line 377
    mul-int/2addr v6, v5

    .line 378
    new-array v5, v6, [I

    .line 379
    .line 380
    new-instance v6, Llg1;

    .line 381
    .line 382
    invoke-direct {v6}, Llg1;-><init>()V

    .line 383
    .line 384
    .line 385
    iget v7, v1, Lml1;->h:I

    .line 386
    .line 387
    invoke-virtual {v3, v7}, Lkz2;->E(I)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v6, v3}, Llg1;->b(Lkz2;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v1, v6, v9, v4, v5}, Lml1;->b(Llg1;ZLandroid/graphics/Rect;[I)V

    .line 394
    .line 395
    .line 396
    iget v7, v1, Lml1;->i:I

    .line 397
    .line 398
    invoke-virtual {v3, v7}, Lkz2;->E(I)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v6, v3}, Llg1;->b(Lkz2;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v1, v6, v2, v4, v5}, Lml1;->b(Llg1;ZLandroid/graphics/Rect;[I)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 408
    .line 409
    .line 410
    move-result v2

    .line 411
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 412
    .line 413
    .line 414
    move-result v3

    .line 415
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 416
    .line 417
    invoke-static {v5, v2, v3, v6}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 418
    .line 419
    .line 420
    move-result-object v11

    .line 421
    iget v2, v4, Landroid/graphics/Rect;->left:I

    .line 422
    .line 423
    int-to-float v2, v2

    .line 424
    iget v3, v1, Lml1;->e:I

    .line 425
    .line 426
    int-to-float v3, v3

    .line 427
    div-float v15, v2, v3

    .line 428
    .line 429
    iget v2, v4, Landroid/graphics/Rect;->top:I

    .line 430
    .line 431
    int-to-float v2, v2

    .line 432
    iget v3, v1, Lml1;->f:I

    .line 433
    .line 434
    int-to-float v3, v3

    .line 435
    div-float v12, v2, v3

    .line 436
    .line 437
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    int-to-float v2, v2

    .line 442
    iget v3, v1, Lml1;->e:I

    .line 443
    .line 444
    int-to-float v3, v3

    .line 445
    div-float v19, v2, v3

    .line 446
    .line 447
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 448
    .line 449
    .line 450
    move-result v2

    .line 451
    int-to-float v2, v2

    .line 452
    iget v1, v1, Lml1;->f:I

    .line 453
    .line 454
    int-to-float v1, v1

    .line 455
    div-float v20, v2, v1

    .line 456
    .line 457
    new-instance v7, Lfi2;

    .line 458
    .line 459
    const/4 v8, 0x0

    .line 460
    const/4 v9, 0x0

    .line 461
    const/4 v13, 0x0

    .line 462
    const/4 v14, 0x0

    .line 463
    const/16 v16, 0x0

    .line 464
    .line 465
    const/high16 v17, -0x80000000

    .line 466
    .line 467
    const v18, -0x800001

    .line 468
    .line 469
    .line 470
    const/16 v22, 0x0

    .line 471
    .line 472
    const/16 v23, 0x0

    .line 473
    .line 474
    move-object v10, v9

    .line 475
    move/from16 v21, v17

    .line 476
    .line 477
    invoke-direct/range {v7 .. v23}, Lfi2;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFIFI)V

    .line 478
    .line 479
    .line 480
    move-object v4, v7

    .line 481
    goto :goto_4

    .line 482
    :cond_a
    :goto_3
    const/4 v4, 0x0

    .line 483
    :goto_4
    new-instance v5, Lgk1;

    .line 484
    .line 485
    if-eqz v4, :cond_b

    .line 486
    .line 487
    invoke-static {v4}, Lxm3;->i(Ljava/lang/Object;)Lsn3;

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    :goto_5
    move-object v6, v1

    .line 492
    goto :goto_6

    .line 493
    :cond_b
    sget-object v1, Lxm3;->g:Lvm3;

    .line 494
    .line 495
    sget-object v1, Lsn3;->j:Lsn3;

    .line 496
    .line 497
    goto :goto_5

    .line 498
    :goto_6
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    const-wide/32 v9, 0x4c4b40

    .line 504
    .line 505
    .line 506
    invoke-direct/range {v5 .. v10}, Lgk1;-><init>(Ljava/util/List;JJ)V

    .line 507
    .line 508
    .line 509
    move-object/from16 v1, p4

    .line 510
    .line 511
    invoke-virtual {v1, v5}, Llk1;->c(Ljava/lang/Object;)V

    .line 512
    .line 513
    .line 514
    return-void

    .line 515
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public h(Ljava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lmc2;->g:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    iget-object v2, p0, Lmc2;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lp10;

    .line 12
    .line 13
    iget-object v3, p0, Lmc2;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Lnl;

    .line 16
    .line 17
    check-cast v2, Ln10;

    .line 18
    .line 19
    invoke-virtual {v2, v3, p1, v0}, Ln10;->U(Lnl;Ljava/lang/String;Landroid/os/Bundle;)I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :try_start_1
    monitor-exit v1

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_0

    .line 26
    :catch_0
    monitor-exit v1

    .line 27
    return-void

    .line 28
    :goto_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    throw p1
.end method

.method public i(I)V
    .locals 2

    .line 1
    iget v0, p0, Lmc2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lmc2;->g:Ljava/lang/Object;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    const/16 v0, 0x10

    .line 14
    .line 15
    if-eq p1, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x18

    .line 18
    .line 19
    if-eq p1, v0, :cond_1

    .line 20
    .line 21
    const/16 v0, 0x20

    .line 22
    .line 23
    if-ne p1, v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    .line 27
    .line 28
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string v1, "Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported"

    .line 37
    .line 38
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, Lmc2;->g:Ljava/lang/Object;

    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_0
    .end packed-switch
.end method

.method public j(Lbv1;Lus0;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Lbv1;->A()Lfv1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lfv1;->A()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Lbv1;->B()La54;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, La54;->p()[B

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p1}, Lbv1;->C()La54;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, La54;->p()[B

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, 0x0

    .line 30
    if-nez v3, :cond_b

    .line 31
    .line 32
    if-eqz v2, :cond_b

    .line 33
    .line 34
    array-length v3, v2

    .line 35
    if-nez v3, :cond_0

    .line 36
    .line 37
    goto/16 :goto_4

    .line 38
    .line 39
    :cond_0
    iget-object v3, p0, Lmc2;->h:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, Ljava/io/File;

    .line 42
    .line 43
    invoke-static {v3}, Luk2;->a0(Ljava/io/File;)Z

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 47
    .line 48
    .line 49
    invoke-static {v3, v0}, Luk2;->R(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    .line 54
    .line 55
    .line 56
    const-string v5, "pcam.jar"

    .line 57
    .line 58
    invoke-static {v0, v5, v3}, Luk2;->J(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    if-eqz v1, :cond_1

    .line 63
    .line 64
    array-length v7, v1

    .line 65
    if-lez v7, :cond_1

    .line 66
    .line 67
    invoke-static {v6, v1}, Luk2;->P(Ljava/io/File;[B)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_b

    .line 72
    .line 73
    :cond_1
    const-string v1, "pcbc"

    .line 74
    .line 75
    invoke-static {v0, v1, v3}, Luk2;->J(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0, v2}, Luk2;->P(Ljava/io/File;[B)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_b

    .line 84
    .line 85
    invoke-virtual {p1}, Lbv1;->A()Lfv1;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Lfv1;->A()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0, v5, v3}, Luk2;->J(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_2

    .line 102
    .line 103
    if-eqz p2, :cond_2

    .line 104
    .line 105
    :try_start_0
    invoke-static {v0}, Lfd3;->a(Ljava/io/File;)Z

    .line 106
    .line 107
    .line 108
    move-result p2
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    goto :goto_0

    .line 110
    :catch_0
    move p2, v4

    .line 111
    :goto_0
    if-eqz p2, :cond_b

    .line 112
    .line 113
    :cond_2
    invoke-virtual {p1}, Lbv1;->A()Lfv1;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-virtual {p2}, Lfv1;->A()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    const/4 v2, 0x1

    .line 126
    if-eqz v0, :cond_4

    .line 127
    .line 128
    :cond_3
    :goto_1
    move p1, v4

    .line 129
    goto/16 :goto_2

    .line 130
    .line 131
    :cond_4
    invoke-static {p2, v5, v3}, Luk2;->J(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {p2, v1, v3}, Luk2;->J(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-virtual {p0}, Lmc2;->v()Ljava/io/File;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    invoke-static {p2, v5, v6}, Luk2;->J(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    invoke-virtual {p0}, Lmc2;->v()Ljava/io/File;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    invoke-static {p2, v1, v6}, Luk2;->J(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-eqz v1, :cond_5

    .line 160
    .line 161
    invoke-virtual {v0, v5}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-nez v0, :cond_5

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_5
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-eqz v0, :cond_3

    .line 173
    .line 174
    invoke-virtual {v3, p2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 175
    .line 176
    .line 177
    move-result p2

    .line 178
    if-eqz p2, :cond_3

    .line 179
    .line 180
    invoke-static {}, Lfv1;->H()Lev1;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    invoke-virtual {p1}, Lbv1;->A()Lfv1;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {v0}, Lfv1;->A()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {p2}, Ln54;->b()V

    .line 193
    .line 194
    .line 195
    iget-object v1, p2, Ln54;->g:Lp54;

    .line 196
    .line 197
    check-cast v1, Lfv1;

    .line 198
    .line 199
    invoke-virtual {v1, v0}, Lfv1;->J(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1}, Lbv1;->A()Lfv1;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v0}, Lfv1;->B()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {p2}, Ln54;->b()V

    .line 211
    .line 212
    .line 213
    iget-object v1, p2, Ln54;->g:Lp54;

    .line 214
    .line 215
    check-cast v1, Lfv1;

    .line 216
    .line 217
    invoke-virtual {v1, v0}, Lfv1;->K(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1}, Lbv1;->A()Lfv1;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {v0}, Lfv1;->D()J

    .line 225
    .line 226
    .line 227
    move-result-wide v0

    .line 228
    invoke-virtual {p2}, Ln54;->b()V

    .line 229
    .line 230
    .line 231
    iget-object v3, p2, Ln54;->g:Lp54;

    .line 232
    .line 233
    check-cast v3, Lfv1;

    .line 234
    .line 235
    invoke-virtual {v3, v0, v1}, Lfv1;->M(J)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {p1}, Lbv1;->A()Lfv1;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-virtual {v0}, Lfv1;->E()J

    .line 243
    .line 244
    .line 245
    move-result-wide v0

    .line 246
    invoke-virtual {p2}, Ln54;->b()V

    .line 247
    .line 248
    .line 249
    iget-object v3, p2, Ln54;->g:Lp54;

    .line 250
    .line 251
    check-cast v3, Lfv1;

    .line 252
    .line 253
    invoke-virtual {v3, v0, v1}, Lfv1;->N(J)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p1}, Lbv1;->A()Lfv1;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-virtual {p1}, Lfv1;->C()J

    .line 261
    .line 262
    .line 263
    move-result-wide v0

    .line 264
    invoke-virtual {p2}, Ln54;->b()V

    .line 265
    .line 266
    .line 267
    iget-object p1, p2, Ln54;->g:Lp54;

    .line 268
    .line 269
    check-cast p1, Lfv1;

    .line 270
    .line 271
    invoke-virtual {p1, v0, v1}, Lfv1;->L(J)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p2}, Ln54;->d()Lp54;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    check-cast p1, Lfv1;

    .line 279
    .line 280
    invoke-virtual {p0, v2}, Lmc2;->r(I)Lfv1;

    .line 281
    .line 282
    .line 283
    move-result-object p2

    .line 284
    iget-object v0, p0, Lmc2;->i:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v0, Landroid/content/SharedPreferences;

    .line 287
    .line 288
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    if-eqz p2, :cond_6

    .line 293
    .line 294
    invoke-virtual {p1}, Lfv1;->A()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    invoke-virtual {p2}, Lfv1;->A()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    if-nez v1, :cond_6

    .line 307
    .line 308
    invoke-virtual {p0}, Lmc2;->w()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    invoke-virtual {p2}, Ls44;->b()[B

    .line 313
    .line 314
    .line 315
    move-result-object p2

    .line 316
    invoke-static {p2}, Luk2;->c([B)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object p2

    .line 320
    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 321
    .line 322
    .line 323
    :cond_6
    invoke-virtual {p0}, Lmc2;->B()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object p2

    .line 327
    invoke-virtual {p1}, Ls44;->b()[B

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    invoke-static {p1}, Luk2;->c([B)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    invoke-interface {v0, p2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 336
    .line 337
    .line 338
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 339
    .line 340
    .line 341
    move-result p1

    .line 342
    if-eqz p1, :cond_3

    .line 343
    .line 344
    move p1, v2

    .line 345
    :goto_2
    new-instance p2, Ljava/util/HashSet;

    .line 346
    .line 347
    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    .line 348
    .line 349
    .line 350
    invoke-virtual {p0, v2}, Lmc2;->r(I)Lfv1;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    if-eqz v0, :cond_7

    .line 355
    .line 356
    invoke-virtual {v0}, Lfv1;->A()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-virtual {p2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    :cond_7
    const/4 v0, 0x2

    .line 364
    invoke-virtual {p0, v0}, Lmc2;->r(I)Lfv1;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    if-eqz v0, :cond_8

    .line 369
    .line 370
    invoke-virtual {v0}, Lfv1;->A()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-virtual {p2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    :cond_8
    invoke-virtual {p0}, Lmc2;->v()Ljava/io/File;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    array-length v1, v0

    .line 386
    :goto_3
    if-ge v4, v1, :cond_a

    .line 387
    .line 388
    aget-object v2, v0, v4

    .line 389
    .line 390
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    invoke-virtual {p2, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move-result v3

    .line 398
    if-nez v3, :cond_9

    .line 399
    .line 400
    invoke-virtual {p0}, Lmc2;->v()Ljava/io/File;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    invoke-static {v3, v2}, Luk2;->R(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    invoke-static {v2}, Luk2;->a0(Ljava/io/File;)Z

    .line 409
    .line 410
    .line 411
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 412
    .line 413
    goto :goto_3

    .line 414
    :cond_a
    return p1

    .line 415
    :cond_b
    :goto_4
    return v4
.end method

.method public n()V
    .locals 1

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lmc2;->h:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public o(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lmc2;->h:Ljava/lang/Object;

    .line 6
    .line 7
    return-void
.end method

.method public p(Ljava/lang/Object;)V
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lmc2;->f:I

    .line 4
    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lmc2;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Leb3;

    .line 11
    .line 12
    iget-object v2, v1, Lmc2;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Laa3;

    .line 15
    .line 16
    move-object/from16 v3, p1

    .line 17
    .line 18
    check-cast v3, Leg4;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x1

    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    sget-object v6, Leg4;->f:Leg4;

    .line 25
    .line 26
    if-ne v3, v6, :cond_0

    .line 27
    .line 28
    move v3, v5

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v3, v4

    .line 31
    :goto_0
    invoke-interface {v2, v3}, Laa3;->b(Z)Laa3;

    .line 32
    .line 33
    .line 34
    iget-object v3, v1, Lmc2;->h:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, Lda3;

    .line 37
    .line 38
    if-nez v3, :cond_1

    .line 39
    .line 40
    invoke-interface {v2}, Laa3;->n()Lca3;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object v3, v0, Leb3;->f:Lea3;

    .line 45
    .line 46
    invoke-virtual {v3, v2}, Lea3;->b(Lca3;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-virtual {v3, v2}, Lda3;->a(Laa3;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Lda3;->h()V

    .line 54
    .line 55
    .line 56
    :cond_2
    :goto_1
    iget-object v2, v1, Lmc2;->i:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, Lao2;

    .line 59
    .line 60
    if-eqz v2, :cond_e

    .line 61
    .line 62
    iget-object v0, v0, Leb3;->d:Lug4;

    .line 63
    .line 64
    iget-object v0, v0, Lug4;->h:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_3

    .line 71
    .line 72
    goto/16 :goto_8

    .line 73
    .line 74
    :cond_3
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    .line 75
    .line 76
    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const-string v0, "type"

    .line 80
    .line 81
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    const-string v6, "precision"

    .line 86
    .line 87
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    const-string v7, "currency"

    .line 92
    .line 93
    invoke-virtual {v3, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v13

    .line 97
    const-string v7, "value"

    .line 98
    .line 99
    const-wide/16 v8, 0x0

    .line 100
    .line 101
    invoke-virtual {v3, v7, v8, v9}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 102
    .line 103
    .line 104
    move-result-wide v7

    .line 105
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 106
    .line 107
    .line 108
    move-result v3
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    const v9, 0x10576

    .line 110
    .line 111
    .line 112
    const/4 v10, 0x3

    .line 113
    const/4 v11, 0x2

    .line 114
    if-eq v3, v9, :cond_6

    .line 115
    .line 116
    const v9, 0x10580

    .line 117
    .line 118
    .line 119
    if-eq v3, v9, :cond_5

    .line 120
    .line 121
    const v9, 0x506e232d

    .line 122
    .line 123
    .line 124
    if-eq v3, v9, :cond_4

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_4
    const-string v3, "ONE_PIXEL"

    .line 128
    .line 129
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_7

    .line 134
    .line 135
    const-wide/16 v14, 0x3e8

    .line 136
    .line 137
    :try_start_1
    div-long/2addr v7, v14
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 138
    move v9, v10

    .line 139
    goto :goto_3

    .line 140
    :catch_0
    move-exception v0

    .line 141
    goto/16 :goto_7

    .line 142
    .line 143
    :cond_5
    const-string v3, "CPM"

    .line 144
    .line 145
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_7

    .line 150
    .line 151
    move v9, v5

    .line 152
    goto :goto_3

    .line 153
    :cond_6
    const-string v3, "CPC"

    .line 154
    .line 155
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_7

    .line 160
    .line 161
    move v9, v11

    .line 162
    goto :goto_3

    .line 163
    :cond_7
    :goto_2
    move v9, v4

    .line 164
    :goto_3
    :try_start_2
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 165
    .line 166
    .line 167
    move-result v0
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 168
    const v3, -0x7f136fe4

    .line 169
    .line 170
    .line 171
    if-eq v0, v3, :cond_a

    .line 172
    .line 173
    const v3, 0x17cbce3b

    .line 174
    .line 175
    .line 176
    if-eq v0, v3, :cond_9

    .line 177
    .line 178
    const v3, 0x4bc5cce6    # 2.5926092E7f

    .line 179
    .line 180
    .line 181
    if-eq v0, v3, :cond_8

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_8
    const-string v0, "PUBLISHER_PROVIDED"

    .line 185
    .line 186
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-eqz v0, :cond_b

    .line 191
    .line 192
    move v10, v11

    .line 193
    :goto_4
    move-wide v11, v7

    .line 194
    goto :goto_6

    .line 195
    :cond_9
    const-string v0, "PRECISE"

    .line 196
    .line 197
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_b

    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_a
    const-string v0, "ESTIMATED"

    .line 205
    .line 206
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_b

    .line 211
    .line 212
    move v10, v5

    .line 213
    goto :goto_4

    .line 214
    :cond_b
    :goto_5
    move v10, v4

    .line 215
    goto :goto_4

    .line 216
    :goto_6
    :try_start_3
    new-instance v8, Ldg4;

    .line 217
    .line 218
    invoke-direct/range {v8 .. v13}, Ldg4;-><init>(IIJLjava/lang/String;)V

    .line 219
    .line 220
    .line 221
    iget-object v0, v2, Lao2;->k:Lh83;

    .line 222
    .line 223
    iget-object v0, v0, Lh83;->a:Lf20;

    .line 224
    .line 225
    iget-object v0, v0, Lf20;->g:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v0, Ll83;

    .line 228
    .line 229
    invoke-static {v0}, La30;->D(Ll83;)I

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eq v0, v5, :cond_c

    .line 234
    .line 235
    move v4, v5

    .line 236
    :cond_c
    if-eqz v4, :cond_e

    .line 237
    .line 238
    iget-object v0, v2, Lao2;->i:La83;

    .line 239
    .line 240
    iget-boolean v0, v0, La83;->B0:Z

    .line 241
    .line 242
    if-nez v0, :cond_d

    .line 243
    .line 244
    goto :goto_8

    .line 245
    :cond_d
    new-instance v0, Lkf3;

    .line 246
    .line 247
    const/16 v3, 0x15

    .line 248
    .line 249
    invoke-direct {v0, v3, v8}, Lkf3;-><init>(ILjava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2, v0}, Lf74;->P1(Ldp2;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    .line 253
    .line 254
    .line 255
    goto :goto_8

    .line 256
    :goto_7
    const-string v2, "UrlPinger.pingUrl"

    .line 257
    .line 258
    sget-object v3, Lhg4;->C:Lhg4;

    .line 259
    .line 260
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 261
    .line 262
    invoke-virtual {v3, v2, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 263
    .line 264
    .line 265
    :cond_e
    :goto_8
    return-void

    .line 266
    :sswitch_0
    move-object/from16 v8, p1

    .line 267
    .line 268
    check-cast v8, Ljava/lang/String;

    .line 269
    .line 270
    iget-object v0, v1, Lmc2;->g:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v0, Lag2;

    .line 273
    .line 274
    invoke-interface {v0}, Lag2;->F()La83;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    if-eqz v2, :cond_11

    .line 279
    .line 280
    iget-boolean v3, v2, La83;->i0:Z

    .line 281
    .line 282
    if-nez v3, :cond_11

    .line 283
    .line 284
    iget-object v0, v2, La83;->x0:Lx34;

    .line 285
    .line 286
    sget-object v2, Lmz1;->Pa:Liz1;

    .line 287
    .line 288
    sget-object v3, Ltw1;->e:Ltw1;

    .line 289
    .line 290
    iget-object v4, v3, Ltw1;->c:Lkz1;

    .line 291
    .line 292
    invoke-virtual {v4, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    check-cast v2, Ljava/lang/Boolean;

    .line 297
    .line 298
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    if-eqz v2, :cond_10

    .line 303
    .line 304
    iget-object v2, v1, Lmc2;->h:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v2, Lgj2;

    .line 307
    .line 308
    if-eqz v2, :cond_10

    .line 309
    .line 310
    invoke-static {v8}, Lgj2;->b(Ljava/lang/String;)Z

    .line 311
    .line 312
    .line 313
    move-result v4

    .line 314
    if-eqz v4, :cond_10

    .line 315
    .line 316
    iget-object v4, v1, Lmc2;->i:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v4, Leb3;

    .line 319
    .line 320
    sget-object v5, Lsv1;->f:Lsv1;

    .line 321
    .line 322
    iget-object v5, v5, Lsv1;->e:Ljava/util/Random;

    .line 323
    .line 324
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 325
    .line 326
    .line 327
    move-result v6

    .line 328
    if-eqz v6, :cond_f

    .line 329
    .line 330
    goto/16 :goto_a

    .line 331
    .line 332
    :cond_f
    iget-object v6, v2, Lgj2;->d:Ltu2;

    .line 333
    .line 334
    iget-object v6, v6, Ltu2;->a:Landroid/view/MotionEvent;

    .line 335
    .line 336
    invoke-virtual {v2, v8, v6, v5}, Lgj2;->c(Ljava/lang/String;Landroid/view/MotionEvent;Ljava/util/Random;)Ln70;

    .line 337
    .line 338
    .line 339
    move-result-object v5

    .line 340
    sget-object v6, Lmz1;->cb:Liz1;

    .line 341
    .line 342
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 343
    .line 344
    invoke-virtual {v3, v6}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    check-cast v3, Ljava/lang/Integer;

    .line 349
    .line 350
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 351
    .line 352
    .line 353
    move-result v3

    .line 354
    int-to-long v6, v3

    .line 355
    iget-object v3, v2, Lgj2;->g:Ljava/util/concurrent/ScheduledExecutorService;

    .line 356
    .line 357
    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 358
    .line 359
    invoke-static {v5, v6, v7, v9, v3}, Lpu1;->N(Ln70;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Ln70;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    new-instance v5, Lmc2;

    .line 364
    .line 365
    invoke-direct {v5, v2, v4, v8, v0}, Lmc2;-><init>(Lgj2;Leb3;Ljava/lang/String;Lx34;)V

    .line 366
    .line 367
    .line 368
    iget-object v0, v2, Lgj2;->e:Lpq3;

    .line 369
    .line 370
    new-instance v2, Ljq3;

    .line 371
    .line 372
    const/4 v4, 0x0

    .line 373
    invoke-direct {v2, v3, v5, v4}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 374
    .line 375
    .line 376
    invoke-interface {v3, v2, v0}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 377
    .line 378
    .line 379
    goto/16 :goto_a

    .line 380
    .line 381
    :cond_10
    iget-object v2, v1, Lmc2;->i:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v2, Leb3;

    .line 384
    .line 385
    const/4 v3, 0x0

    .line 386
    invoke-virtual {v2, v8, v0, v3, v3}, Leb3;->b(Ljava/lang/String;Lx34;Lda3;Lao2;)V

    .line 387
    .line 388
    .line 389
    goto/16 :goto_a

    .line 390
    .line 391
    :cond_11
    invoke-interface {v0}, Lag2;->F0()Lc83;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    if-nez v3, :cond_12

    .line 396
    .line 397
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 398
    .line 399
    const-string v2, "Common configuration cannot be null"

    .line 400
    .line 401
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    const-string v2, "BufferingGmsgHandlers.getBufferingClickGmsgHandler"

    .line 405
    .line 406
    sget-object v3, Lhg4;->C:Lhg4;

    .line 407
    .line 408
    iget-object v3, v3, Lhg4;->h:Lgd2;

    .line 409
    .line 410
    invoke-virtual {v3, v2, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 411
    .line 412
    .line 413
    goto :goto_a

    .line 414
    :cond_12
    new-instance v4, Lwo1;

    .line 415
    .line 416
    sget-object v5, Lhg4;->C:Lhg4;

    .line 417
    .line 418
    iget-object v6, v5, Lhg4;->k:Lym;

    .line 419
    .line 420
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 424
    .line 425
    .line 426
    move-result-wide v6

    .line 427
    iget-object v5, v5, Lhg4;->h:Lgd2;

    .line 428
    .line 429
    invoke-interface {v0}, Lag2;->getContext()Landroid/content/Context;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    invoke-virtual {v5, v0}, Lgd2;->i(Landroid/content/Context;)Z

    .line 434
    .line 435
    .line 436
    move-result v0

    .line 437
    sget-object v5, Lmz1;->E6:Liz1;

    .line 438
    .line 439
    sget-object v9, Ltw1;->e:Ltw1;

    .line 440
    .line 441
    iget-object v9, v9, Ltw1;->c:Lkz1;

    .line 442
    .line 443
    invoke-virtual {v9, v5}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v5

    .line 447
    check-cast v5, Ljava/lang/Boolean;

    .line 448
    .line 449
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 450
    .line 451
    .line 452
    move-result v5

    .line 453
    const/4 v9, 0x1

    .line 454
    const/4 v10, 0x0

    .line 455
    if-eqz v5, :cond_13

    .line 456
    .line 457
    if-eqz v2, :cond_13

    .line 458
    .line 459
    iget-boolean v5, v2, La83;->S:Z

    .line 460
    .line 461
    if-eqz v5, :cond_13

    .line 462
    .line 463
    move v5, v9

    .line 464
    goto :goto_9

    .line 465
    :cond_13
    move v5, v10

    .line 466
    :goto_9
    if-eqz v2, :cond_14

    .line 467
    .line 468
    iget-object v2, v2, La83;->d0:Lg92;

    .line 469
    .line 470
    if-eqz v2, :cond_14

    .line 471
    .line 472
    move v10, v9

    .line 473
    :cond_14
    const/4 v2, 0x2

    .line 474
    if-nez v0, :cond_15

    .line 475
    .line 476
    if-nez v5, :cond_15

    .line 477
    .line 478
    if-eqz v10, :cond_16

    .line 479
    .line 480
    :cond_15
    move v9, v2

    .line 481
    :cond_16
    iget-object v0, v3, Lc83;->b:Ljava/lang/String;

    .line 482
    .line 483
    move-wide v5, v6

    .line 484
    move-object v7, v0

    .line 485
    invoke-direct/range {v4 .. v9}, Lwo1;-><init>(JLjava/lang/String;Ljava/lang/String;I)V

    .line 486
    .line 487
    .line 488
    iget-object v0, v1, Lmc2;->j:Ljava/lang/Object;

    .line 489
    .line 490
    check-cast v0, Ljz2;

    .line 491
    .line 492
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    new-instance v2, Lmr2;

    .line 496
    .line 497
    const/4 v3, 0x4

    .line 498
    const/4 v5, 0x0

    .line 499
    invoke-direct {v2, v0, v4, v3, v5}, Lmr2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v0, v2}, Ljz2;->a(Lo93;)V

    .line 503
    .line 504
    .line 505
    :goto_a
    return-void

    .line 506
    :sswitch_1
    move-object/from16 v0, p1

    .line 507
    .line 508
    check-cast v0, Lag2;

    .line 509
    .line 510
    iget-object v2, v1, Lmc2;->g:Ljava/lang/Object;

    .line 511
    .line 512
    check-cast v2, La83;

    .line 513
    .line 514
    iget-object v3, v1, Lmc2;->h:Ljava/lang/Object;

    .line 515
    .line 516
    check-cast v3, Lc83;

    .line 517
    .line 518
    invoke-interface {v0, v2, v3}, Lag2;->E0(La83;Lc83;)V

    .line 519
    .line 520
    .line 521
    invoke-interface {v0}, Lag2;->e0()Lsg2;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    sget-object v3, Lmz1;->Ta:Liz1;

    .line 526
    .line 527
    sget-object v4, Ltw1;->e:Ltw1;

    .line 528
    .line 529
    iget-object v5, v4, Ltw1;->c:Lkz1;

    .line 530
    .line 531
    invoke-virtual {v5, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v3

    .line 535
    check-cast v3, Ljava/lang/Boolean;

    .line 536
    .line 537
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 538
    .line 539
    .line 540
    move-result v3

    .line 541
    if-eqz v3, :cond_17

    .line 542
    .line 543
    if-eqz v0, :cond_17

    .line 544
    .line 545
    iget-object v3, v1, Lmc2;->i:Ljava/lang/Object;

    .line 546
    .line 547
    check-cast v3, Lgj2;

    .line 548
    .line 549
    iget-object v5, v1, Lmc2;->j:Ljava/lang/Object;

    .line 550
    .line 551
    check-cast v5, Lau2;

    .line 552
    .line 553
    iget-object v6, v5, Lau2;->i:Ljz2;

    .line 554
    .line 555
    iget-object v7, v5, Lau2;->j:Leb3;

    .line 556
    .line 557
    invoke-virtual {v0, v3, v6, v7}, Lsg2;->R(Lgj2;Ljz2;Leb3;)V

    .line 558
    .line 559
    .line 560
    iget-object v6, v5, Lau2;->i:Ljz2;

    .line 561
    .line 562
    iget-object v5, v5, Lau2;->d:Lmv2;

    .line 563
    .line 564
    invoke-virtual {v0, v3, v6, v5}, Lsg2;->S(Lgj2;Ljz2;Lmv2;)V

    .line 565
    .line 566
    .line 567
    :cond_17
    sget-object v3, Lmz1;->Pd:Liz1;

    .line 568
    .line 569
    iget-object v4, v4, Ltw1;->c:Lkz1;

    .line 570
    .line 571
    invoke-virtual {v4, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v3

    .line 575
    check-cast v3, Ljava/lang/Boolean;

    .line 576
    .line 577
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 578
    .line 579
    .line 580
    move-result v3

    .line 581
    if-eqz v3, :cond_18

    .line 582
    .line 583
    if-eqz v0, :cond_18

    .line 584
    .line 585
    const-string v3, "/logScionEvent"

    .line 586
    .line 587
    iget-object v4, v0, Lsg2;->f:Ljg2;

    .line 588
    .line 589
    sget-object v5, Lhg4;->C:Lhg4;

    .line 590
    .line 591
    iget-object v5, v5, Lhg4;->y:Loc2;

    .line 592
    .line 593
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 594
    .line 595
    .line 596
    move-result-object v6

    .line 597
    invoke-virtual {v5, v6}, Loc2;->a(Landroid/content/Context;)Z

    .line 598
    .line 599
    .line 600
    move-result v5

    .line 601
    if-eqz v5, :cond_18

    .line 602
    .line 603
    invoke-virtual {v0, v3}, Lsg2;->c(Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    new-instance v5, Ljava/util/HashMap;

    .line 607
    .line 608
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 609
    .line 610
    .line 611
    iget-object v2, v2, La83;->w0:Ljava/util/HashMap;

    .line 612
    .line 613
    new-instance v5, Lv32;

    .line 614
    .line 615
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 616
    .line 617
    .line 618
    move-result-object v4

    .line 619
    const/4 v6, 0x1

    .line 620
    invoke-direct {v5, v4, v2, v6}, Lv32;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 621
    .line 622
    .line 623
    invoke-virtual {v0, v3, v5}, Lsg2;->b(Ljava/lang/String;Ly32;)V

    .line 624
    .line 625
    .line 626
    :cond_18
    return-void

    .line 627
    :sswitch_2
    iget-object v0, v1, Lmc2;->g:Ljava/lang/Object;

    .line 628
    .line 629
    check-cast v0, Leb3;

    .line 630
    .line 631
    move-object/from16 v2, p1

    .line 632
    .line 633
    check-cast v2, Ljava/lang/String;

    .line 634
    .line 635
    new-instance v3, Lgi;

    .line 636
    .line 637
    iget-object v4, v1, Lmc2;->i:Ljava/lang/Object;

    .line 638
    .line 639
    check-cast v4, Lx34;

    .line 640
    .line 641
    const/16 v5, 0x12

    .line 642
    .line 643
    invoke-direct {v3, v0, v2, v4, v5}, Lgi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 644
    .line 645
    .line 646
    iget-object v0, v1, Lmc2;->j:Ljava/lang/Object;

    .line 647
    .line 648
    check-cast v0, Lgj2;

    .line 649
    .line 650
    iget-object v0, v0, Lgj2;->e:Lpq3;

    .line 651
    .line 652
    check-cast v0, Lld2;

    .line 653
    .line 654
    invoke-virtual {v0, v3}, Lld2;->a(Ljava/lang/Runnable;)Ln70;

    .line 655
    .line 656
    .line 657
    return-void

    .line 658
    :sswitch_3
    move-object/from16 v0, p1

    .line 659
    .line 660
    check-cast v0, Ljava/util/Map;

    .line 661
    .line 662
    iget-object v2, v1, Lmc2;->g:Ljava/lang/Object;

    .line 663
    .line 664
    check-cast v2, Ljava/util/List;

    .line 665
    .line 666
    iget-object v3, v1, Lmc2;->h:Ljava/lang/Object;

    .line 667
    .line 668
    check-cast v3, Ljava/lang/String;

    .line 669
    .line 670
    iget-object v4, v1, Lmc2;->j:Ljava/lang/Object;

    .line 671
    .line 672
    check-cast v4, Lsg2;

    .line 673
    .line 674
    invoke-virtual {v4, v0, v2, v3}, Lsg2;->H(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    return-void

    .line 678
    :sswitch_4
    move-object/from16 v8, p1

    .line 679
    .line 680
    check-cast v8, Ljava/lang/String;

    .line 681
    .line 682
    sget-object v0, Lmz1;->Qa:Liz1;

    .line 683
    .line 684
    sget-object v2, Ltw1;->e:Ltw1;

    .line 685
    .line 686
    iget-object v3, v2, Ltw1;->c:Lkz1;

    .line 687
    .line 688
    invoke-virtual {v3, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    check-cast v0, Ljava/lang/Boolean;

    .line 693
    .line 694
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 695
    .line 696
    .line 697
    move-result v0

    .line 698
    if-eqz v0, :cond_19

    .line 699
    .line 700
    iget-object v0, v1, Lmc2;->g:Ljava/lang/Object;

    .line 701
    .line 702
    check-cast v0, Ljava/util/Map;

    .line 703
    .line 704
    const-string v3, "u"

    .line 705
    .line 706
    invoke-interface {v0, v3, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    :cond_19
    iget-object v0, v1, Lmc2;->j:Ljava/lang/Object;

    .line 710
    .line 711
    move-object v9, v0

    .line 712
    check-cast v9, Li42;

    .line 713
    .line 714
    iget-object v0, v1, Lmc2;->h:Ljava/lang/Object;

    .line 715
    .line 716
    move-object v10, v0

    .line 717
    check-cast v10, Lfd1;

    .line 718
    .line 719
    iget-object v0, v1, Lmc2;->g:Ljava/lang/Object;

    .line 720
    .line 721
    move-object v11, v0

    .line 722
    check-cast v11, Ljava/util/Map;

    .line 723
    .line 724
    iget-object v0, v1, Lmc2;->i:Ljava/lang/Object;

    .line 725
    .line 726
    move-object v3, v0

    .line 727
    check-cast v3, Ljava/lang/String;

    .line 728
    .line 729
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 730
    .line 731
    .line 732
    move-object v5, v10

    .line 733
    check-cast v5, Lag2;

    .line 734
    .line 735
    invoke-interface {v5}, Lag2;->F()La83;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    invoke-interface {v5}, Lag2;->F0()Lc83;

    .line 740
    .line 741
    .line 742
    move-result-object v4

    .line 743
    const-string v6, ""

    .line 744
    .line 745
    const/4 v7, 0x0

    .line 746
    if-eqz v0, :cond_1a

    .line 747
    .line 748
    if-eqz v4, :cond_1a

    .line 749
    .line 750
    iget-object v6, v4, Lc83;->b:Ljava/lang/String;

    .line 751
    .line 752
    invoke-virtual {v0}, La83;->b()Z

    .line 753
    .line 754
    .line 755
    move-result v0

    .line 756
    move v12, v0

    .line 757
    move-object v13, v6

    .line 758
    goto :goto_b

    .line 759
    :cond_1a
    move-object v13, v6

    .line 760
    move v12, v7

    .line 761
    :goto_b
    sget-object v0, Lmz1;->yb:Liz1;

    .line 762
    .line 763
    iget-object v4, v2, Ltw1;->c:Lkz1;

    .line 764
    .line 765
    invoke-virtual {v4, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    check-cast v0, Ljava/lang/Boolean;

    .line 770
    .line 771
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 772
    .line 773
    .line 774
    move-result v0

    .line 775
    const/4 v4, 0x1

    .line 776
    if-eqz v0, :cond_1b

    .line 777
    .line 778
    const-string v0, "sc"

    .line 779
    .line 780
    invoke-interface {v11, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 781
    .line 782
    .line 783
    move-result v0

    .line 784
    if-eqz v0, :cond_1b

    .line 785
    .line 786
    const-string v0, "sc"

    .line 787
    .line 788
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    check-cast v0, Ljava/lang/String;

    .line 793
    .line 794
    const-string v6, "0"

    .line 795
    .line 796
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 797
    .line 798
    .line 799
    move-result v0

    .line 800
    if-eqz v0, :cond_1b

    .line 801
    .line 802
    move v14, v7

    .line 803
    goto :goto_c

    .line 804
    :cond_1b
    move v14, v4

    .line 805
    :goto_c
    sget-object v0, Lmz1;->Ad:Liz1;

    .line 806
    .line 807
    iget-object v6, v2, Ltw1;->c:Lkz1;

    .line 808
    .line 809
    invoke-virtual {v6, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object v0

    .line 813
    check-cast v0, Ljava/lang/Boolean;

    .line 814
    .line 815
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 816
    .line 817
    .line 818
    move-result v0

    .line 819
    if-eqz v0, :cond_1c

    .line 820
    .line 821
    const-string v0, "ig_cl"

    .line 822
    .line 823
    invoke-interface {v11, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 824
    .line 825
    .line 826
    move-result v0

    .line 827
    if-eqz v0, :cond_1c

    .line 828
    .line 829
    const-string v0, "ig_cl"

    .line 830
    .line 831
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    check-cast v0, Ljava/lang/String;

    .line 836
    .line 837
    const-string v6, "true"

    .line 838
    .line 839
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 840
    .line 841
    .line 842
    move-result v0

    .line 843
    if-eqz v0, :cond_1c

    .line 844
    .line 845
    move v15, v4

    .line 846
    goto :goto_d

    .line 847
    :cond_1c
    move v15, v7

    .line 848
    :goto_d
    const-string v0, "expand"

    .line 849
    .line 850
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 851
    .line 852
    .line 853
    move-result v0

    .line 854
    if-eqz v0, :cond_1e

    .line 855
    .line 856
    invoke-interface {v5}, Lag2;->Y0()Z

    .line 857
    .line 858
    .line 859
    move-result v0

    .line 860
    if-eqz v0, :cond_1d

    .line 861
    .line 862
    const-string v0, "Cannot expand WebView that is already expanded."

    .line 863
    .line 864
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 865
    .line 866
    .line 867
    goto/16 :goto_1b

    .line 868
    .line 869
    :cond_1d
    invoke-virtual {v9, v7}, Li42;->h(Z)V

    .line 870
    .line 871
    .line 872
    const-string v0, "custom_close"

    .line 873
    .line 874
    const-string v2, "1"

    .line 875
    .line 876
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 877
    .line 878
    .line 879
    move-result-object v0

    .line 880
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 881
    .line 882
    .line 883
    move-result v0

    .line 884
    invoke-static {v11}, Li42;->a(Ljava/util/Map;)I

    .line 885
    .line 886
    .line 887
    move-result v2

    .line 888
    invoke-interface {v5, v2, v0, v14}, Lag2;->Z0(IZZ)V

    .line 889
    .line 890
    .line 891
    goto/16 :goto_1b

    .line 892
    .line 893
    :cond_1e
    const-string v0, "webapp"

    .line 894
    .line 895
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 896
    .line 897
    .line 898
    move-result v0

    .line 899
    if-eqz v0, :cond_21

    .line 900
    .line 901
    invoke-virtual {v9, v7}, Li42;->h(Z)V

    .line 902
    .line 903
    .line 904
    sget-object v0, Lmz1;->Ic:Liz1;

    .line 905
    .line 906
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 907
    .line 908
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v0

    .line 912
    check-cast v0, Ljava/lang/Boolean;

    .line 913
    .line 914
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 915
    .line 916
    .line 917
    move-result v0

    .line 918
    if-eqz v0, :cond_1f

    .line 919
    .line 920
    const-string v0, "is_allowed_for_lock_screen"

    .line 921
    .line 922
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 923
    .line 924
    .line 925
    move-result-object v0

    .line 926
    const-string v2, "1"

    .line 927
    .line 928
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 929
    .line 930
    .line 931
    move-result v0

    .line 932
    if-eqz v0, :cond_1f

    .line 933
    .line 934
    move v10, v4

    .line 935
    goto :goto_e

    .line 936
    :cond_1f
    move v10, v7

    .line 937
    :goto_e
    if-eqz v8, :cond_20

    .line 938
    .line 939
    const-string v0, "custom_close"

    .line 940
    .line 941
    const-string v2, "1"

    .line 942
    .line 943
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object v0

    .line 947
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 948
    .line 949
    .line 950
    move-result v6

    .line 951
    invoke-static {v11}, Li42;->a(Ljava/util/Map;)I

    .line 952
    .line 953
    .line 954
    move-result v7

    .line 955
    move v9, v14

    .line 956
    invoke-interface/range {v5 .. v10}, Lag2;->I(ZILjava/lang/String;ZZ)V

    .line 957
    .line 958
    .line 959
    goto/16 :goto_1b

    .line 960
    .line 961
    :cond_20
    const-string v0, "custom_close"

    .line 962
    .line 963
    const-string v2, "1"

    .line 964
    .line 965
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 966
    .line 967
    .line 968
    move-result-object v0

    .line 969
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 970
    .line 971
    .line 972
    move-result v13

    .line 973
    move/from16 v17, v14

    .line 974
    .line 975
    invoke-static {v11}, Li42;->a(Ljava/util/Map;)I

    .line 976
    .line 977
    .line 978
    move-result v14

    .line 979
    const-string v0, "html"

    .line 980
    .line 981
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    move-result-object v0

    .line 985
    move-object v15, v0

    .line 986
    check-cast v15, Ljava/lang/String;

    .line 987
    .line 988
    const-string v0, "baseurl"

    .line 989
    .line 990
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 991
    .line 992
    .line 993
    move-result-object v0

    .line 994
    move-object/from16 v16, v0

    .line 995
    .line 996
    check-cast v16, Ljava/lang/String;

    .line 997
    .line 998
    move-object v12, v5

    .line 999
    invoke-interface/range {v12 .. v17}, Lag2;->v(ZILjava/lang/String;Ljava/lang/String;Z)V

    .line 1000
    .line 1001
    .line 1002
    goto/16 :goto_1b

    .line 1003
    .line 1004
    :cond_21
    const-string v0, "chrome_custom_tab"

    .line 1005
    .line 1006
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1007
    .line 1008
    .line 1009
    move-result v0

    .line 1010
    if-eqz v0, :cond_2b

    .line 1011
    .line 1012
    invoke-interface {v5}, Lag2;->getContext()Landroid/content/Context;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v0

    .line 1016
    sget-object v3, Lmz1;->f5:Liz1;

    .line 1017
    .line 1018
    iget-object v6, v2, Ltw1;->c:Lkz1;

    .line 1019
    .line 1020
    invoke-virtual {v6, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v3

    .line 1024
    check-cast v3, Ljava/lang/Boolean;

    .line 1025
    .line 1026
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1027
    .line 1028
    .line 1029
    move-result v3

    .line 1030
    if-eqz v3, :cond_22

    .line 1031
    .line 1032
    const-string v0, "User opt out chrome custom tab."

    .line 1033
    .line 1034
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 1035
    .line 1036
    .line 1037
    const/16 v0, 0xa

    .line 1038
    .line 1039
    invoke-virtual {v9, v0}, Li42;->i(I)V

    .line 1040
    .line 1041
    .line 1042
    goto :goto_10

    .line 1043
    :cond_22
    sget-object v3, Lmz1;->Z4:Liz1;

    .line 1044
    .line 1045
    iget-object v6, v2, Ltw1;->c:Lkz1;

    .line 1046
    .line 1047
    invoke-virtual {v6, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v3

    .line 1051
    check-cast v3, Ljava/lang/Boolean;

    .line 1052
    .line 1053
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1054
    .line 1055
    .line 1056
    move-result v3

    .line 1057
    if-eqz v3, :cond_24

    .line 1058
    .line 1059
    invoke-static {v0}, Lsl;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v3

    .line 1063
    if-nez v3, :cond_23

    .line 1064
    .line 1065
    goto :goto_f

    .line 1066
    :cond_23
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v0

    .line 1070
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1071
    .line 1072
    .line 1073
    move-result v0

    .line 1074
    if-nez v0, :cond_25

    .line 1075
    .line 1076
    move v7, v4

    .line 1077
    goto :goto_f

    .line 1078
    :cond_24
    invoke-static {v0}, Lyz1;->a(Landroid/content/Context;)Z

    .line 1079
    .line 1080
    .line 1081
    move-result v7

    .line 1082
    :cond_25
    :goto_f
    if-nez v7, :cond_26

    .line 1083
    .line 1084
    const/4 v0, 0x4

    .line 1085
    invoke-virtual {v9, v0}, Li42;->i(I)V

    .line 1086
    .line 1087
    .line 1088
    :goto_10
    const-string v0, "use_first_package"

    .line 1089
    .line 1090
    const-string v2, "true"

    .line 1091
    .line 1092
    invoke-interface {v11, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1093
    .line 1094
    .line 1095
    const-string v0, "use_running_process"

    .line 1096
    .line 1097
    const-string v2, "true"

    .line 1098
    .line 1099
    invoke-interface {v11, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    invoke-virtual/range {v9 .. v15}, Li42;->g(Lfd1;Ljava/util/Map;ZLjava/lang/String;ZZ)V

    .line 1103
    .line 1104
    .line 1105
    goto/16 :goto_1b

    .line 1106
    .line 1107
    :cond_26
    invoke-virtual {v9, v4}, Li42;->h(Z)V

    .line 1108
    .line 1109
    .line 1110
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1111
    .line 1112
    .line 1113
    move-result v0

    .line 1114
    if-eqz v0, :cond_27

    .line 1115
    .line 1116
    const-string v0, "Cannot open browser with null or empty url"

    .line 1117
    .line 1118
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 1119
    .line 1120
    .line 1121
    const/4 v0, 0x7

    .line 1122
    invoke-virtual {v9, v0}, Li42;->i(I)V

    .line 1123
    .line 1124
    .line 1125
    goto/16 :goto_1b

    .line 1126
    .line 1127
    :cond_27
    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v18

    .line 1131
    invoke-interface {v5}, Lag2;->getContext()Landroid/content/Context;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v16

    .line 1135
    invoke-interface {v5}, Lag2;->W()Lvs1;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v17

    .line 1139
    invoke-interface {v5}, Lag2;->p0()Landroid/view/View;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v19

    .line 1143
    invoke-interface {v5}, Lag2;->g()Landroid/app/Activity;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v20

    .line 1147
    invoke-interface {v5}, Lag2;->u0()Lm83;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v21

    .line 1151
    invoke-static/range {v16 .. v21}, Li42;->b(Landroid/content/Context;Lvs1;Landroid/net/Uri;Landroid/view/View;Landroid/app/Activity;Lm83;)Landroid/net/Uri;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v0

    .line 1155
    invoke-static {v0}, Li42;->d(Landroid/net/Uri;)Landroid/net/Uri;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v0

    .line 1159
    if-eqz v12, :cond_28

    .line 1160
    .line 1161
    iget-object v3, v9, Li42;->j:Ljz2;

    .line 1162
    .line 1163
    if-eqz v3, :cond_28

    .line 1164
    .line 1165
    invoke-interface {v5}, Lag2;->getContext()Landroid/content/Context;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v3

    .line 1169
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v4

    .line 1173
    invoke-virtual {v9, v10, v3, v4, v13}, Li42;->e(Lfd1;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    .line 1174
    .line 1175
    .line 1176
    move-result v3

    .line 1177
    if-nez v3, :cond_3e

    .line 1178
    .line 1179
    :cond_28
    new-instance v3, Lg42;

    .line 1180
    .line 1181
    invoke-direct {v3, v9}, Lg42;-><init>(Li42;)V

    .line 1182
    .line 1183
    .line 1184
    iput-object v3, v9, Li42;->m:Lid1;

    .line 1185
    .line 1186
    new-instance v16, Lfc2;

    .line 1187
    .line 1188
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v18

    .line 1192
    iget-object v3, v9, Li42;->m:Lid1;

    .line 1193
    .line 1194
    new-instance v4, Landroid/os/Bundle;

    .line 1195
    .line 1196
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 1197
    .line 1198
    .line 1199
    sget-object v0, Lmz1;->e5:Liz1;

    .line 1200
    .line 1201
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 1202
    .line 1203
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v0

    .line 1207
    check-cast v0, Ljava/lang/Boolean;

    .line 1208
    .line 1209
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1210
    .line 1211
    .line 1212
    move-result v0

    .line 1213
    if-eqz v0, :cond_2a

    .line 1214
    .line 1215
    const-string v0, "cct_init_h"

    .line 1216
    .line 1217
    invoke-interface {v11, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1218
    .line 1219
    .line 1220
    move-result v0

    .line 1221
    if-eqz v0, :cond_29

    .line 1222
    .line 1223
    :try_start_4
    const-string v0, "h"

    .line 1224
    .line 1225
    const-string v2, "cct_init_h"

    .line 1226
    .line 1227
    invoke-interface {v11, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v2

    .line 1231
    check-cast v2, Ljava/lang/String;

    .line 1232
    .line 1233
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1234
    .line 1235
    .line 1236
    move-result v2

    .line 1237
    invoke-virtual {v4, v0, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_1

    .line 1238
    .line 1239
    .line 1240
    goto :goto_11

    .line 1241
    :catch_1
    move-exception v0

    .line 1242
    invoke-static {}, Lgi2;->R()Z

    .line 1243
    .line 1244
    .line 1245
    const-string v2, "OpenGmsgHandler.getChromeCustomTabConfigBundle"

    .line 1246
    .line 1247
    sget-object v6, Lhg4;->C:Lhg4;

    .line 1248
    .line 1249
    iget-object v6, v6, Lhg4;->h:Lgd2;

    .line 1250
    .line 1251
    invoke-virtual {v6, v2, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1252
    .line 1253
    .line 1254
    :cond_29
    :goto_11
    const-string v0, "cct_bp"

    .line 1255
    .line 1256
    invoke-interface {v11, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1257
    .line 1258
    .line 1259
    move-result v0

    .line 1260
    if-eqz v0, :cond_2a

    .line 1261
    .line 1262
    :try_start_5
    const-string v0, "cbp"

    .line 1263
    .line 1264
    const-string v2, "cct_bp"

    .line 1265
    .line 1266
    invoke-interface {v11, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v2

    .line 1270
    check-cast v2, Ljava/lang/String;

    .line 1271
    .line 1272
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1273
    .line 1274
    .line 1275
    move-result v2

    .line 1276
    invoke-virtual {v4, v0, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_2

    .line 1277
    .line 1278
    .line 1279
    goto :goto_12

    .line 1280
    :catch_2
    move-exception v0

    .line 1281
    invoke-static {}, Lgi2;->R()Z

    .line 1282
    .line 1283
    .line 1284
    const-string v2, "OpenGmsgHandler.getChromeCustomTabConfigBundle"

    .line 1285
    .line 1286
    sget-object v6, Lhg4;->C:Lhg4;

    .line 1287
    .line 1288
    iget-object v6, v6, Lhg4;->h:Lgd2;

    .line 1289
    .line 1290
    invoke-virtual {v6, v2, v0}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1291
    .line 1292
    .line 1293
    :cond_2a
    :goto_12
    new-instance v0, Loi0;

    .line 1294
    .line 1295
    invoke-direct {v0, v3}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 1296
    .line 1297
    .line 1298
    const/16 v26, 0x1

    .line 1299
    .line 1300
    const/16 v17, 0x0

    .line 1301
    .line 1302
    const/16 v19, 0x0

    .line 1303
    .line 1304
    const/16 v20, 0x0

    .line 1305
    .line 1306
    const/16 v21, 0x0

    .line 1307
    .line 1308
    const/16 v22, 0x0

    .line 1309
    .line 1310
    const/16 v23, 0x0

    .line 1311
    .line 1312
    const/16 v24, 0x0

    .line 1313
    .line 1314
    move-object/from16 v25, v0

    .line 1315
    .line 1316
    move-object/from16 v27, v4

    .line 1317
    .line 1318
    invoke-direct/range {v16 .. v27}, Lfc2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;Landroid/os/IBinder;ZLandroid/os/Bundle;)V

    .line 1319
    .line 1320
    .line 1321
    move-object/from16 v2, v16

    .line 1322
    .line 1323
    invoke-interface {v5, v2, v14, v15, v13}, Lag2;->M(Lfc2;ZZLjava/lang/String;)V

    .line 1324
    .line 1325
    .line 1326
    goto/16 :goto_1b

    .line 1327
    .line 1328
    :cond_2b
    const-string v0, "app"

    .line 1329
    .line 1330
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1331
    .line 1332
    .line 1333
    move-result v0

    .line 1334
    if-eqz v0, :cond_2c

    .line 1335
    .line 1336
    const-string v0, "system_browser"

    .line 1337
    .line 1338
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v0

    .line 1342
    check-cast v0, Ljava/lang/String;

    .line 1343
    .line 1344
    const-string v6, "true"

    .line 1345
    .line 1346
    invoke-virtual {v6, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1347
    .line 1348
    .line 1349
    move-result v0

    .line 1350
    if-nez v0, :cond_2d

    .line 1351
    .line 1352
    :cond_2c
    move v6, v12

    .line 1353
    move v12, v15

    .line 1354
    move-object v15, v13

    .line 1355
    goto :goto_13

    .line 1356
    :cond_2d
    invoke-virtual/range {v9 .. v15}, Li42;->g(Lfd1;Ljava/util/Map;ZLjava/lang/String;ZZ)V

    .line 1357
    .line 1358
    .line 1359
    goto/16 :goto_1b

    .line 1360
    .line 1361
    :goto_13
    const-string v0, "open_app"

    .line 1362
    .line 1363
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1364
    .line 1365
    .line 1366
    move-result v0

    .line 1367
    if-eqz v0, :cond_31

    .line 1368
    .line 1369
    sget-object v0, Lmz1;->S8:Liz1;

    .line 1370
    .line 1371
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 1372
    .line 1373
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v0

    .line 1377
    check-cast v0, Ljava/lang/Boolean;

    .line 1378
    .line 1379
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1380
    .line 1381
    .line 1382
    move-result v0

    .line 1383
    if-eqz v0, :cond_3e

    .line 1384
    .line 1385
    invoke-virtual {v9, v4}, Li42;->h(Z)V

    .line 1386
    .line 1387
    .line 1388
    const-string v0, "p"

    .line 1389
    .line 1390
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v0

    .line 1394
    check-cast v0, Ljava/lang/String;

    .line 1395
    .line 1396
    if-nez v0, :cond_2e

    .line 1397
    .line 1398
    const-string v0, "Package name missing from open app action."

    .line 1399
    .line 1400
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 1401
    .line 1402
    .line 1403
    goto/16 :goto_1b

    .line 1404
    .line 1405
    :cond_2e
    if-eqz v6, :cond_2f

    .line 1406
    .line 1407
    iget-object v2, v9, Li42;->j:Ljz2;

    .line 1408
    .line 1409
    if-eqz v2, :cond_2f

    .line 1410
    .line 1411
    invoke-interface {v5}, Lag2;->getContext()Landroid/content/Context;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v2

    .line 1415
    invoke-virtual {v9, v10, v2, v0, v15}, Li42;->e(Lfd1;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    .line 1416
    .line 1417
    .line 1418
    move-result v2

    .line 1419
    if-nez v2, :cond_3e

    .line 1420
    .line 1421
    :cond_2f
    invoke-interface {v5}, Lag2;->getContext()Landroid/content/Context;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v2

    .line 1425
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v2

    .line 1429
    if-nez v2, :cond_30

    .line 1430
    .line 1431
    const-string v0, "Cannot get package manager from open app action."

    .line 1432
    .line 1433
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 1434
    .line 1435
    .line 1436
    goto/16 :goto_1b

    .line 1437
    .line 1438
    :cond_30
    invoke-virtual {v2, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v0

    .line 1442
    if-eqz v0, :cond_3e

    .line 1443
    .line 1444
    new-instance v2, Lfc2;

    .line 1445
    .line 1446
    iget-object v3, v9, Li42;->m:Lid1;

    .line 1447
    .line 1448
    invoke-direct {v2, v0, v3}, Lfc2;-><init>(Landroid/content/Intent;Lid1;)V

    .line 1449
    .line 1450
    .line 1451
    invoke-interface {v5, v2, v14, v12, v15}, Lag2;->M(Lfc2;ZZLjava/lang/String;)V

    .line 1452
    .line 1453
    .line 1454
    goto/16 :goto_1b

    .line 1455
    .line 1456
    :cond_31
    invoke-virtual {v9, v4}, Li42;->h(Z)V

    .line 1457
    .line 1458
    .line 1459
    const-string v0, "intent_url"

    .line 1460
    .line 1461
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v0

    .line 1465
    move-object v2, v0

    .line 1466
    check-cast v2, Ljava/lang/String;

    .line 1467
    .line 1468
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1469
    .line 1470
    .line 1471
    move-result v0

    .line 1472
    const/4 v13, 0x0

    .line 1473
    if-nez v0, :cond_32

    .line 1474
    .line 1475
    :try_start_6
    invoke-static {v2, v7}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v13
    :try_end_6
    .catch Ljava/net/URISyntaxException; {:try_start_6 .. :try_end_6} :catch_3

    .line 1479
    :cond_32
    :goto_14
    move-object v0, v13

    .line 1480
    goto :goto_15

    .line 1481
    :catch_3
    move-exception v0

    .line 1482
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v2

    .line 1486
    const-string v7, "Error parsing the url: "

    .line 1487
    .line 1488
    invoke-virtual {v7, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v2

    .line 1492
    invoke-static {v2, v0}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1493
    .line 1494
    .line 1495
    goto :goto_14

    .line 1496
    :goto_15
    if-eqz v0, :cond_34

    .line 1497
    .line 1498
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v2

    .line 1502
    if-eqz v2, :cond_34

    .line 1503
    .line 1504
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v2

    .line 1508
    sget-object v7, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 1509
    .line 1510
    invoke-virtual {v7, v2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 1511
    .line 1512
    .line 1513
    move-result v7

    .line 1514
    if-nez v7, :cond_34

    .line 1515
    .line 1516
    invoke-interface {v5}, Lag2;->getContext()Landroid/content/Context;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v16

    .line 1520
    invoke-interface {v5}, Lag2;->W()Lvs1;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v17

    .line 1524
    invoke-interface {v5}, Lag2;->p0()Landroid/view/View;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v19

    .line 1528
    invoke-interface {v5}, Lag2;->g()Landroid/app/Activity;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v20

    .line 1532
    invoke-interface {v5}, Lag2;->u0()Lm83;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v21

    .line 1536
    move-object/from16 v18, v2

    .line 1537
    .line 1538
    invoke-static/range {v16 .. v21}, Li42;->b(Landroid/content/Context;Lvs1;Landroid/net/Uri;Landroid/view/View;Landroid/app/Activity;Lm83;)Landroid/net/Uri;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v2

    .line 1542
    invoke-static {v2}, Li42;->d(Landroid/net/Uri;)Landroid/net/Uri;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v2

    .line 1546
    invoke-virtual {v0}, Landroid/content/Intent;->getType()Ljava/lang/String;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v7

    .line 1550
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1551
    .line 1552
    .line 1553
    move-result v7

    .line 1554
    if-nez v7, :cond_33

    .line 1555
    .line 1556
    sget-object v7, Lmz1;->T8:Liz1;

    .line 1557
    .line 1558
    sget-object v13, Ltw1;->e:Ltw1;

    .line 1559
    .line 1560
    iget-object v13, v13, Ltw1;->c:Lkz1;

    .line 1561
    .line 1562
    invoke-virtual {v13, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v7

    .line 1566
    check-cast v7, Ljava/lang/Boolean;

    .line 1567
    .line 1568
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1569
    .line 1570
    .line 1571
    move-result v7

    .line 1572
    if-eqz v7, :cond_33

    .line 1573
    .line 1574
    invoke-virtual {v0}, Landroid/content/Intent;->getType()Ljava/lang/String;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v7

    .line 1578
    invoke-virtual {v0, v2, v7}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 1579
    .line 1580
    .line 1581
    goto :goto_16

    .line 1582
    :cond_33
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 1583
    .line 1584
    .line 1585
    :cond_34
    :goto_16
    sget-object v2, Lmz1;->o9:Liz1;

    .line 1586
    .line 1587
    sget-object v7, Ltw1;->e:Ltw1;

    .line 1588
    .line 1589
    iget-object v13, v7, Ltw1;->c:Lkz1;

    .line 1590
    .line 1591
    invoke-virtual {v13, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v2

    .line 1595
    check-cast v2, Ljava/lang/Boolean;

    .line 1596
    .line 1597
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1598
    .line 1599
    .line 1600
    move-result v2

    .line 1601
    if-eqz v2, :cond_35

    .line 1602
    .line 1603
    const-string v2, "intent_async"

    .line 1604
    .line 1605
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1606
    .line 1607
    .line 1608
    move-result v2

    .line 1609
    if-eqz v2, :cond_35

    .line 1610
    .line 1611
    const-string v2, "event_id"

    .line 1612
    .line 1613
    invoke-interface {v11, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1614
    .line 1615
    .line 1616
    move-result v2

    .line 1617
    if-eqz v2, :cond_35

    .line 1618
    .line 1619
    move v2, v4

    .line 1620
    goto :goto_17

    .line 1621
    :cond_35
    const/4 v2, 0x0

    .line 1622
    :goto_17
    sget-object v3, Lmz1;->Fd:Liz1;

    .line 1623
    .line 1624
    iget-object v7, v7, Ltw1;->c:Lkz1;

    .line 1625
    .line 1626
    invoke-virtual {v7, v3}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v3

    .line 1630
    check-cast v3, Ljava/lang/Boolean;

    .line 1631
    .line 1632
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1633
    .line 1634
    .line 1635
    move-result v3

    .line 1636
    if-eqz v3, :cond_38

    .line 1637
    .line 1638
    iget-object v3, v9, Li42;->l:Lim2;

    .line 1639
    .line 1640
    if-eqz v3, :cond_38

    .line 1641
    .line 1642
    iget-object v7, v3, Lim2;->f:Ljava/lang/Object;

    .line 1643
    .line 1644
    monitor-enter v7

    .line 1645
    :try_start_7
    iget-object v13, v3, Lim2;->h:La83;

    .line 1646
    .line 1647
    iget v13, v13, La83;->E0:I

    .line 1648
    .line 1649
    if-lez v13, :cond_36

    .line 1650
    .line 1651
    iget-boolean v13, v3, Lim2;->m:Z

    .line 1652
    .line 1653
    if-eqz v13, :cond_37

    .line 1654
    .line 1655
    :cond_36
    move/from16 v16, v2

    .line 1656
    .line 1657
    goto :goto_18

    .line 1658
    :cond_37
    iget-object v13, v3, Lim2;->l:Lra3;

    .line 1659
    .line 1660
    iget-object v4, v3, Lim2;->i:Lym;

    .line 1661
    .line 1662
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1663
    .line 1664
    .line 1665
    move v4, v2

    .line 1666
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1667
    .line 1668
    .line 1669
    move-result-wide v1

    .line 1670
    invoke-virtual {v13}, Ln54;->b()V

    .line 1671
    .line 1672
    .line 1673
    iget-object v13, v13, Ln54;->g:Lp54;

    .line 1674
    .line 1675
    check-cast v13, Lsa3;

    .line 1676
    .line 1677
    invoke-virtual {v13, v1, v2}, Lsa3;->C(J)V

    .line 1678
    .line 1679
    .line 1680
    const/4 v1, 0x1

    .line 1681
    iput-boolean v1, v3, Lim2;->m:Z

    .line 1682
    .line 1683
    monitor-exit v7
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 1684
    iget-object v1, v3, Lim2;->k:Ljava/util/concurrent/ScheduledExecutorService;

    .line 1685
    .line 1686
    new-instance v2, Lfu1;

    .line 1687
    .line 1688
    const/16 v7, 0x1b

    .line 1689
    .line 1690
    invoke-direct {v2, v7, v3}, Lfu1;-><init>(ILjava/lang/Object;)V

    .line 1691
    .line 1692
    .line 1693
    iget-object v3, v3, Lim2;->h:La83;

    .line 1694
    .line 1695
    iget v3, v3, La83;->E0:I

    .line 1696
    .line 1697
    move/from16 v16, v4

    .line 1698
    .line 1699
    int-to-long v3, v3

    .line 1700
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1701
    .line 1702
    invoke-interface {v1, v2, v3, v4, v7}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 1703
    .line 1704
    .line 1705
    goto :goto_1a

    .line 1706
    :catchall_0
    move-exception v0

    .line 1707
    goto :goto_19

    .line 1708
    :goto_18
    :try_start_8
    monitor-exit v7

    .line 1709
    goto :goto_1a

    .line 1710
    :goto_19
    monitor-exit v7
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 1711
    throw v0

    .line 1712
    :cond_38
    move/from16 v16, v2

    .line 1713
    .line 1714
    :goto_1a
    new-instance v13, Ljava/util/HashMap;

    .line 1715
    .line 1716
    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 1717
    .line 1718
    .line 1719
    move v7, v12

    .line 1720
    if-eqz v16, :cond_39

    .line 1721
    .line 1722
    move-object v12, v10

    .line 1723
    move-object v10, v9

    .line 1724
    new-instance v9, Lh42;

    .line 1725
    .line 1726
    move/from16 v28, v14

    .line 1727
    .line 1728
    move-object v14, v11

    .line 1729
    move/from16 v11, v28

    .line 1730
    .line 1731
    invoke-direct/range {v9 .. v14}, Lh42;-><init>(Li42;ZLfd1;Ljava/util/HashMap;Ljava/util/Map;)V

    .line 1732
    .line 1733
    .line 1734
    move-object v1, v9

    .line 1735
    move-object v9, v10

    .line 1736
    move-object v10, v12

    .line 1737
    move-object v11, v14

    .line 1738
    iput-object v1, v9, Li42;->m:Lid1;

    .line 1739
    .line 1740
    const/4 v14, 0x0

    .line 1741
    :cond_39
    if-eqz v0, :cond_3b

    .line 1742
    .line 1743
    if-eqz v6, :cond_3a

    .line 1744
    .line 1745
    iget-object v1, v9, Li42;->j:Ljz2;

    .line 1746
    .line 1747
    if-eqz v1, :cond_3a

    .line 1748
    .line 1749
    invoke-interface {v5}, Lag2;->getContext()Landroid/content/Context;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v1

    .line 1753
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v2

    .line 1757
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v2

    .line 1761
    invoke-virtual {v9, v10, v1, v2, v15}, Li42;->e(Lfd1;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    .line 1762
    .line 1763
    .line 1764
    move-result v1

    .line 1765
    if-eqz v1, :cond_3a

    .line 1766
    .line 1767
    if-eqz v16, :cond_3e

    .line 1768
    .line 1769
    const-string v0, "event_id"

    .line 1770
    .line 1771
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v0

    .line 1775
    check-cast v0, Ljava/lang/String;

    .line 1776
    .line 1777
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1778
    .line 1779
    invoke-virtual {v13, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1780
    .line 1781
    .line 1782
    check-cast v10, Ll52;

    .line 1783
    .line 1784
    const-string v0, "openIntentAsync"

    .line 1785
    .line 1786
    invoke-interface {v10, v0, v13}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 1787
    .line 1788
    .line 1789
    goto/16 :goto_1b

    .line 1790
    .line 1791
    :cond_3a
    new-instance v1, Lfc2;

    .line 1792
    .line 1793
    iget-object v2, v9, Li42;->m:Lid1;

    .line 1794
    .line 1795
    invoke-direct {v1, v0, v2}, Lfc2;-><init>(Landroid/content/Intent;Lid1;)V

    .line 1796
    .line 1797
    .line 1798
    invoke-interface {v5, v1, v14, v7, v15}, Lag2;->M(Lfc2;ZZLjava/lang/String;)V

    .line 1799
    .line 1800
    .line 1801
    goto/16 :goto_1b

    .line 1802
    .line 1803
    :cond_3b
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1804
    .line 1805
    .line 1806
    move-result v0

    .line 1807
    if-nez v0, :cond_3c

    .line 1808
    .line 1809
    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1810
    .line 1811
    .line 1812
    move-result-object v19

    .line 1813
    invoke-interface {v5}, Lag2;->getContext()Landroid/content/Context;

    .line 1814
    .line 1815
    .line 1816
    move-result-object v17

    .line 1817
    invoke-interface {v5}, Lag2;->W()Lvs1;

    .line 1818
    .line 1819
    .line 1820
    move-result-object v18

    .line 1821
    invoke-interface {v5}, Lag2;->p0()Landroid/view/View;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v20

    .line 1825
    invoke-interface {v5}, Lag2;->g()Landroid/app/Activity;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v21

    .line 1829
    invoke-interface {v5}, Lag2;->u0()Lm83;

    .line 1830
    .line 1831
    .line 1832
    move-result-object v22

    .line 1833
    invoke-static/range {v17 .. v22}, Li42;->b(Landroid/content/Context;Lvs1;Landroid/net/Uri;Landroid/view/View;Landroid/app/Activity;Lm83;)Landroid/net/Uri;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v0

    .line 1837
    invoke-static {v0}, Li42;->d(Landroid/net/Uri;)Landroid/net/Uri;

    .line 1838
    .line 1839
    .line 1840
    move-result-object v0

    .line 1841
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 1842
    .line 1843
    .line 1844
    move-result-object v8

    .line 1845
    :cond_3c
    if-eqz v6, :cond_3d

    .line 1846
    .line 1847
    iget-object v0, v9, Li42;->j:Ljz2;

    .line 1848
    .line 1849
    if-eqz v0, :cond_3d

    .line 1850
    .line 1851
    invoke-interface {v5}, Lag2;->getContext()Landroid/content/Context;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v0

    .line 1855
    invoke-virtual {v9, v10, v0, v8, v15}, Li42;->e(Lfd1;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    .line 1856
    .line 1857
    .line 1858
    move-result v0

    .line 1859
    if-eqz v0, :cond_3d

    .line 1860
    .line 1861
    if-eqz v16, :cond_3e

    .line 1862
    .line 1863
    const-string v0, "event_id"

    .line 1864
    .line 1865
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v0

    .line 1869
    check-cast v0, Ljava/lang/String;

    .line 1870
    .line 1871
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1872
    .line 1873
    invoke-virtual {v13, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1874
    .line 1875
    .line 1876
    check-cast v10, Ll52;

    .line 1877
    .line 1878
    const-string v0, "openIntentAsync"

    .line 1879
    .line 1880
    invoke-interface {v10, v0, v13}, Ll52;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 1881
    .line 1882
    .line 1883
    goto :goto_1b

    .line 1884
    :cond_3d
    const-string v0, "i"

    .line 1885
    .line 1886
    new-instance v17, Lfc2;

    .line 1887
    .line 1888
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1889
    .line 1890
    .line 1891
    move-result-object v0

    .line 1892
    move-object/from16 v18, v0

    .line 1893
    .line 1894
    check-cast v18, Ljava/lang/String;

    .line 1895
    .line 1896
    const-string v0, "m"

    .line 1897
    .line 1898
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1899
    .line 1900
    .line 1901
    move-result-object v0

    .line 1902
    move-object/from16 v20, v0

    .line 1903
    .line 1904
    check-cast v20, Ljava/lang/String;

    .line 1905
    .line 1906
    const-string v0, "p"

    .line 1907
    .line 1908
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1909
    .line 1910
    .line 1911
    move-result-object v0

    .line 1912
    move-object/from16 v21, v0

    .line 1913
    .line 1914
    check-cast v21, Ljava/lang/String;

    .line 1915
    .line 1916
    const-string v0, "c"

    .line 1917
    .line 1918
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v0

    .line 1922
    move-object/from16 v22, v0

    .line 1923
    .line 1924
    check-cast v22, Ljava/lang/String;

    .line 1925
    .line 1926
    const-string v0, "f"

    .line 1927
    .line 1928
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1929
    .line 1930
    .line 1931
    move-result-object v0

    .line 1932
    move-object/from16 v23, v0

    .line 1933
    .line 1934
    check-cast v23, Ljava/lang/String;

    .line 1935
    .line 1936
    const-string v0, "e"

    .line 1937
    .line 1938
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v0

    .line 1942
    move-object/from16 v24, v0

    .line 1943
    .line 1944
    check-cast v24, Ljava/lang/String;

    .line 1945
    .line 1946
    iget-object v0, v9, Li42;->m:Lid1;

    .line 1947
    .line 1948
    move-object/from16 v25, v0

    .line 1949
    .line 1950
    move-object/from16 v19, v8

    .line 1951
    .line 1952
    invoke-direct/range {v17 .. v25}, Lfc2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid1;)V

    .line 1953
    .line 1954
    .line 1955
    move-object/from16 v0, v17

    .line 1956
    .line 1957
    invoke-interface {v5, v0, v14, v7, v15}, Lag2;->M(Lfc2;ZZLjava/lang/String;)V

    .line 1958
    .line 1959
    .line 1960
    :cond_3e
    :goto_1b
    return-void

    .line 1961
    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_4
        0xc -> :sswitch_3
        0xd -> :sswitch_2
        0xf -> :sswitch_1
        0x14 -> :sswitch_0
    .end sparse-switch
.end method

.method public declared-synchronized q(Ljo1;)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lmc2;->g:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljo1;->d()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/util/List;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    sget-boolean v2, Lro1;->a:Z

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    filled-new-array {v2, p1}, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v3, "%d waiting requests for cacheKey=%s; resend to network"

    .line 41
    .line 42
    invoke-static {v3, v2}, Lro1;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    :goto_0
    const/4 v2, 0x0

    .line 49
    invoke-interface {v1, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Ljo1;

    .line 54
    .line 55
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    iget-object p1, v2, Ljo1;->j:Ljava/lang/Object;

    .line 59
    .line 60
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    :try_start_1
    iput-object p0, v2, Ljo1;->p:Lmc2;

    .line 62
    .line 63
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 64
    :try_start_2
    iget-object p1, p0, Lmc2;->i:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Ljava/util/concurrent/BlockingQueue;

    .line 67
    .line 68
    invoke-interface {p1, v2}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    .line 70
    .line 71
    monitor-exit p0

    .line 72
    return-void

    .line 73
    :catch_0
    move-exception p1

    .line 74
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    const-string v0, "Couldn\'t add request to queue. %s"

    .line 83
    .line 84
    invoke-static {v0, p1}, Lro1;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Lmc2;->h:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p1, Lbo1;

    .line 97
    .line 98
    const/4 v0, 0x1

    .line 99
    iput-boolean v0, p1, Lbo1;->i:Z

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 102
    .line 103
    .line 104
    monitor-exit p0

    .line 105
    return-void

    .line 106
    :catchall_1
    move-exception v0

    .line 107
    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 108
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 109
    :cond_1
    monitor-exit p0

    .line 110
    return-void

    .line 111
    :goto_1
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 112
    throw p1
.end method

.method public r(I)Lfv1;
    .locals 5

    .line 1
    iget-object v0, p0, Lmc2;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/SharedPreferences;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne p1, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lmc2;->B()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {v0, p1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Lmc2;->w()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {v0, p1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :goto_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    :try_start_0
    invoke-static {p1}, Luk2;->x(Ljava/lang/String;)[B

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    array-length v0, p1

    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-static {p1, v1, v0}, La54;->n([BII)Ly44;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1}, Lfv1;->F(Ly44;)Lfv1;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Lfv1;->A()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "pcam.jar"

    .line 52
    .line 53
    invoke-virtual {p0}, Lmc2;->v()Ljava/io/File;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {v0, v1, v3}, Luk2;->J(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-nez v3, :cond_2

    .line 66
    .line 67
    const-string v1, "pcam"

    .line 68
    .line 69
    invoke-virtual {p0}, Lmc2;->v()Ljava/io/File;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-static {v0, v1, v3}, Luk2;->J(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    :cond_2
    const-string v3, "pcbc"

    .line 78
    .line 79
    invoke-virtual {p0}, Lmc2;->v()Ljava/io/File;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-static {v0, v3, v4}, Luk2;->J(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 94
    .line 95
    .line 96
    move-result v0
    :try_end_0
    .catch La64; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    return-object p1

    .line 100
    :catch_0
    :cond_3
    :goto_1
    return-object v2
.end method

.method public s(Ljava/lang/Throwable;)V
    .locals 9

    .line 1
    iget v0, p0, Lmc2;->f:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lmc2;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Laa3;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    invoke-interface {p1, v0}, Laa3;->b(Z)Laa3;

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lmc2;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lda3;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Lmc2;->j:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Leb3;

    .line 26
    .line 27
    invoke-interface {p1}, Laa3;->n()Lca3;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v0, v0, Leb3;->f:Lea3;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lea3;->b(Lca3;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {v0, p1}, Lda3;->a(Laa3;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lda3;->h()V

    .line 41
    .line 42
    .line 43
    :goto_0
    :sswitch_0
    return-void

    .line 44
    :sswitch_1
    new-instance v1, Lea1;

    .line 45
    .line 46
    iget-object v0, p0, Lmc2;->g:Ljava/lang/Object;

    .line 47
    .line 48
    move-object v4, v0

    .line 49
    check-cast v4, Leb3;

    .line 50
    .line 51
    iget-object v0, p0, Lmc2;->h:Ljava/lang/Object;

    .line 52
    .line 53
    move-object v5, v0

    .line 54
    check-cast v5, Ljava/lang/String;

    .line 55
    .line 56
    iget-object v0, p0, Lmc2;->i:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v6, v0

    .line 59
    check-cast v6, Lx34;

    .line 60
    .line 61
    const/4 v7, 0x2

    .line 62
    const/4 v8, 0x0

    .line 63
    move-object v2, p0

    .line 64
    move-object v3, p1

    .line 65
    invoke-direct/range {v1 .. v8}, Lea1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 66
    .line 67
    .line 68
    iget-object p1, v2, Lmc2;->j:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Lgj2;

    .line 71
    .line 72
    iget-object p1, p1, Lgj2;->e:Lpq3;

    .line 73
    .line 74
    check-cast p1, Lld2;

    .line 75
    .line 76
    invoke-virtual {p1, v1}, Lld2;->a(Ljava/lang/Runnable;)Ln70;

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :sswitch_2
    move-object v2, p0

    .line 81
    iget-object p1, v2, Lmc2;->i:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p1, Landroid/net/Uri;

    .line 84
    .line 85
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    const-string v0, "Failed to parse gmsg params for: "

    .line 90
    .line 91
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :sswitch_3
    move-object v2, p0

    .line 100
    move-object v3, p1

    .line 101
    sget-object p1, Lhg4;->C:Lhg4;

    .line 102
    .line 103
    iget-object p1, p1, Lhg4;->h:Lgd2;

    .line 104
    .line 105
    const-string v0, "OpenGmsgHandler.attributionReportingManager"

    .line 106
    .line 107
    invoke-virtual {p1, v0, v3}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_3
        0xc -> :sswitch_2
        0xd -> :sswitch_1
        0xf -> :sswitch_0
        0x14 -> :sswitch_0
    .end sparse-switch
.end method

.method public t()V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lmc2;->i:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public declared-synchronized u(Ljo1;)Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lmc2;->g:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljo1;->d()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Ljava/util/List;

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    new-instance v2, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    :goto_0
    const-string v3, "waiting-for-response"

    .line 33
    .line 34
    invoke-virtual {p1, v3}, Ljo1;->a(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    sget-boolean p1, Lro1;->a:Z

    .line 44
    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v0, "Request for cacheKey=%s is in flight, putting on hold."

    .line 52
    .line 53
    invoke-static {v0, p1}, Lro1;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    :cond_1
    monitor-exit p0

    .line 57
    const/4 p1, 0x1

    .line 58
    return p1

    .line 59
    :cond_2
    const/4 v2, 0x0

    .line 60
    :try_start_1
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    iget-object v0, p1, Ljo1;->j:Ljava/lang/Object;

    .line 64
    .line 65
    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    :try_start_2
    iput-object p0, p1, Ljo1;->p:Lmc2;

    .line 67
    .line 68
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 69
    :try_start_3
    sget-boolean p1, Lro1;->a:Z

    .line 70
    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const-string v0, "new request, sending to network %s"

    .line 78
    .line 79
    invoke-static {v0, p1}, Lro1;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 80
    .line 81
    .line 82
    :cond_3
    monitor-exit p0

    .line 83
    const/4 p1, 0x0

    .line 84
    return p1

    .line 85
    :catchall_1
    move-exception p1

    .line 86
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 87
    :try_start_5
    throw p1

    .line 88
    :goto_1
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 89
    throw p1
.end method

.method public v()Ljava/io/File;
    .locals 3

    .line 1
    iget-object v0, p0, Lmc2;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lav1;

    .line 4
    .line 5
    new-instance v1, Ljava/io/File;

    .line 6
    .line 7
    iget v0, v0, Lav1;->f:I

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v2, p0, Lmc2;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Ljava/io/File;

    .line 16
    .line 17
    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/io/File;->mkdir()Z

    .line 27
    .line 28
    .line 29
    :cond_0
    return-object v1
.end method

.method public w()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lmc2;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lav1;

    .line 4
    .line 5
    iget v0, v0, Lav1;->f:I

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x6

    .line 18
    .line 19
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const-string v1, "FBAMTD"

    .line 23
    .line 24
    invoke-static {v2, v1, v0}, Lex0;->j(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
.end method

.method public x()Lg93;
    .locals 7

    .line 1
    iget-object v0, p0, Lmc2;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Llm2;

    .line 4
    .line 5
    invoke-interface {v0}, Llm2;->d()Ll83;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v2, v0, Ll83;->d:Lpc4;

    .line 10
    .line 11
    iget-object v3, v0, Ll83;->g:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, v0, Ll83;->k:Lvi4;

    .line 14
    .line 15
    iget-object v0, p0, Lmc2;->g:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lt83;

    .line 18
    .line 19
    new-instance v1, Lha2;

    .line 20
    .line 21
    iget-object v0, v0, Lt83;->h:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Ld93;

    .line 24
    .line 25
    iget-object v4, v0, Ld93;->f:Landroid/content/Context;

    .line 26
    .line 27
    invoke-direct {v1, v4}, Lha2;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Lha2;->a()Lia2;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget v4, v1, Lia2;->j:I

    .line 35
    .line 36
    new-instance v1, Lg93;

    .line 37
    .line 38
    iget-object v5, v0, Ld93;->l:Ljava/lang/String;

    .line 39
    .line 40
    invoke-direct/range {v1 .. v6}, Lg93;-><init>(Lpc4;Ljava/lang/String;ILjava/lang/String;Lvi4;)V

    .line 41
    .line 42
    .line 43
    return-object v1
.end method

.method public y()Lxr3;
    .locals 7

    .line 1
    iget-object v0, p0, Lmc2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lds3;

    .line 4
    .line 5
    if-eqz v0, :cond_a

    .line 6
    .line 7
    iget-object v1, p0, Lmc2;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lyf3;

    .line 10
    .line 11
    if-eqz v1, :cond_9

    .line 12
    .line 13
    iget-object v2, p0, Lmc2;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lyf3;

    .line 16
    .line 17
    if-eqz v2, :cond_9

    .line 18
    .line 19
    iget v3, v0, Lds3;->a:I

    .line 20
    .line 21
    iget-object v1, v1, Lyf3;->f:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lv34;

    .line 24
    .line 25
    iget-object v1, v1, Lv34;->a:[B

    .line 26
    .line 27
    array-length v1, v1

    .line 28
    if-ne v3, v1, :cond_8

    .line 29
    .line 30
    iget v1, v0, Lds3;->b:I

    .line 31
    .line 32
    iget-object v2, v2, Lyf3;->f:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Lv34;

    .line 35
    .line 36
    iget-object v2, v2, Lv34;->a:[B

    .line 37
    .line 38
    array-length v2, v2

    .line 39
    if-ne v1, v2, :cond_7

    .line 40
    .line 41
    invoke-virtual {v0}, Lds3;->a()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    iget-object v0, p0, Lmc2;->j:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Ljava/lang/Integer;

    .line 50
    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 55
    .line 56
    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    .line 57
    .line 58
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :cond_1
    :goto_0
    iget-object v0, p0, Lmc2;->g:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Lds3;

    .line 65
    .line 66
    invoke-virtual {v0}, Lds3;->a()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_3

    .line 71
    .line 72
    iget-object v0, p0, Lmc2;->j:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Ljava/lang/Integer;

    .line 75
    .line 76
    if-nez v0, :cond_2

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 80
    .line 81
    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    .line 82
    .line 83
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :cond_3
    :goto_1
    iget-object v0, p0, Lmc2;->g:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Lds3;

    .line 90
    .line 91
    iget-object v0, v0, Lds3;->e:Lcs3;

    .line 92
    .line 93
    sget-object v1, Lcs3;->j:Lcs3;

    .line 94
    .line 95
    if-ne v0, v1, :cond_4

    .line 96
    .line 97
    sget-object v0, Lsv3;->a:Lv34;

    .line 98
    .line 99
    :goto_2
    move-object v5, v0

    .line 100
    goto :goto_3

    .line 101
    :cond_4
    sget-object v1, Lcs3;->i:Lcs3;

    .line 102
    .line 103
    if-ne v0, v1, :cond_5

    .line 104
    .line 105
    iget-object v0, p0, Lmc2;->j:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Ljava/lang/Integer;

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-static {v0}, Lsv3;->a(I)Lv34;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    goto :goto_2

    .line 118
    :cond_5
    sget-object v1, Lcs3;->h:Lcs3;

    .line 119
    .line 120
    if-ne v0, v1, :cond_6

    .line 121
    .line 122
    iget-object v0, p0, Lmc2;->j:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, Ljava/lang/Integer;

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    invoke-static {v0}, Lsv3;->b(I)Lv34;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    goto :goto_2

    .line 135
    :goto_3
    new-instance v1, Lxr3;

    .line 136
    .line 137
    iget-object v0, p0, Lmc2;->g:Ljava/lang/Object;

    .line 138
    .line 139
    move-object v2, v0

    .line 140
    check-cast v2, Lds3;

    .line 141
    .line 142
    iget-object v0, p0, Lmc2;->h:Ljava/lang/Object;

    .line 143
    .line 144
    move-object v3, v0

    .line 145
    check-cast v3, Lyf3;

    .line 146
    .line 147
    iget-object v0, p0, Lmc2;->i:Ljava/lang/Object;

    .line 148
    .line 149
    move-object v4, v0

    .line 150
    check-cast v4, Lyf3;

    .line 151
    .line 152
    iget-object v0, p0, Lmc2;->j:Ljava/lang/Object;

    .line 153
    .line 154
    move-object v6, v0

    .line 155
    check-cast v6, Ljava/lang/Integer;

    .line 156
    .line 157
    invoke-direct/range {v1 .. v6}, Lxr3;-><init>(Lds3;Lyf3;Lyf3;Lv34;Ljava/lang/Integer;)V

    .line 158
    .line 159
    .line 160
    return-object v1

    .line 161
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 162
    .line 163
    iget-object v1, p0, Lmc2;->g:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v1, Lds3;

    .line 166
    .line 167
    iget-object v1, v1, Lds3;->e:Lcs3;

    .line 168
    .line 169
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    const-string v2, "Unknown AesCtrHmacAeadParameters.Variant: "

    .line 174
    .line 175
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw v0

    .line 183
    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 184
    .line 185
    const-string v1, "HMAC key size mismatch"

    .line 186
    .line 187
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw v0

    .line 191
    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 192
    .line 193
    const-string v1, "AES key size mismatch"

    .line 194
    .line 195
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v0

    .line 199
    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 200
    .line 201
    const-string v1, "Cannot build without key material"

    .line 202
    .line 203
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw v0

    .line 207
    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 208
    .line 209
    const-string v1, "Cannot build without parameters"

    .line 210
    .line 211
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw v0
.end method

.method public z()Lms3;
    .locals 3

    .line 1
    iget-object v0, p0, Lmc2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Integer;

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v1, p0, Lmc2;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Lmc2;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/lang/Integer;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    new-instance v1, Lms3;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget-object v2, p0, Lmc2;->h:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lmc2;->i:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object v2, p0, Lmc2;->j:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, Lls3;

    .line 42
    .line 43
    invoke-direct {v1, v0, v2}, Lms3;-><init>(ILls3;)V

    .line 44
    .line 45
    .line 46
    return-object v1

    .line 47
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 48
    .line 49
    const-string v1, "Tag size is not set"

    .line 50
    .line 51
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v0

    .line 55
    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 56
    .line 57
    const-string v1, "IV size is not set"

    .line 58
    .line 59
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v0

    .line 63
    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 64
    .line 65
    const-string v1, "Key size is not set"

    .line 66
    .line 67
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v0
.end method
