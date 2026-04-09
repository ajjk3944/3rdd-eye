.class public final Lu20;
.super Landroid/view/inputmethod/InputConnectionWrapper;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic a:Ldk;


# direct methods
.method public constructor <init>(Landroid/view/inputmethod/InputConnection;Ldk;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lu20;->a:Ldk;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    invoke-direct {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    new-instance v0, Lz71;

    .line 6
    .line 7
    new-instance v1, Lvg0;

    .line 8
    .line 9
    const/4 v2, 0x4

    .line 10
    invoke-direct {v1, v2, p1}, Lvg0;-><init>(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x6

    .line 14
    invoke-direct {v0, v2, v1}, Lz71;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    iget-object v1, p0, Lu20;->a:Ldk;

    .line 18
    .line 19
    iget-object v1, v1, Ldk;->f:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Ln6;

    .line 22
    .line 23
    and-int/lit8 v2, p2, 0x1

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    :try_start_0
    iget-object v2, v0, Lz71;->g:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, Lvg0;

    .line 30
    .line 31
    iget-object v2, v2, Lvg0;->g:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Landroid/view/inputmethod/InputContentInfo;

    .line 34
    .line 35
    invoke-virtual {v2}, Landroid/view/inputmethod/InputContentInfo;->requestPermission()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    iget-object v2, v0, Lz71;->g:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Lvg0;

    .line 41
    .line 42
    iget-object v2, v2, Lvg0;->g:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Landroid/view/inputmethod/InputContentInfo;

    .line 45
    .line 46
    new-instance v3, Landroid/os/Bundle;

    .line 47
    .line 48
    if-nez p3, :cond_1

    .line 49
    .line 50
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-direct {v3, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 55
    .line 56
    .line 57
    :goto_1
    const-string v4, "androidx.core.view.extra.INPUT_CONTENT_INFO"

    .line 58
    .line 59
    invoke-virtual {v3, v4, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    move-object v3, p3

    .line 64
    :goto_2
    new-instance v2, Landroid/content/ClipData;

    .line 65
    .line 66
    iget-object v0, v0, Lz71;->g:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Lvg0;

    .line 69
    .line 70
    iget-object v0, v0, Lvg0;->g:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Landroid/view/inputmethod/InputContentInfo;

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/view/inputmethod/InputContentInfo;->getDescription()Landroid/content/ClipDescription;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    new-instance v5, Landroid/content/ClipData$Item;

    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/view/inputmethod/InputContentInfo;->getContentUri()Landroid/net/Uri;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-direct {v5, v6}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    .line 85
    .line 86
    .line 87
    invoke-direct {v2, v4, v5}, Landroid/content/ClipData;-><init>(Landroid/content/ClipDescription;Landroid/content/ClipData$Item;)V

    .line 88
    .line 89
    .line 90
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 91
    .line 92
    const/16 v5, 0x1f

    .line 93
    .line 94
    const/4 v6, 0x2

    .line 95
    if-lt v4, v5, :cond_3

    .line 96
    .line 97
    new-instance v4, Lzs1;

    .line 98
    .line 99
    invoke-direct {v4, v2, v6}, Lzs1;-><init>(Landroid/content/ClipData;I)V

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_3
    new-instance v4, Lbj;

    .line 104
    .line 105
    invoke-direct {v4}, Lbj;-><init>()V

    .line 106
    .line 107
    .line 108
    iput-object v2, v4, Lbj;->g:Landroid/content/ClipData;

    .line 109
    .line 110
    iput v6, v4, Lbj;->h:I

    .line 111
    .line 112
    :goto_3
    invoke-virtual {v0}, Landroid/view/inputmethod/InputContentInfo;->getLinkUri()Landroid/net/Uri;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-interface {v4, v0}, Laj;->k(Landroid/net/Uri;)V

    .line 117
    .line 118
    .line 119
    invoke-interface {v4, v3}, Laj;->setExtras(Landroid/os/Bundle;)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v4}, Laj;->build()Ldj;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-static {v1, v0}, Le61;->h(Landroid/view/View;Ldj;)Ldj;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    if-nez v0, :cond_4

    .line 131
    .line 132
    const/4 p1, 0x1

    .line 133
    return p1

    .line 134
    :catch_0
    :cond_4
    invoke-super {p0, p1, p2, p3}, Landroid/view/inputmethod/InputConnectionWrapper;->commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    return p1
.end method
