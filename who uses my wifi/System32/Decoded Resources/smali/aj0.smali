.class public final Laj0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:Ll8;

.field public c:Lqw;

.field public final d:Landroid/window/OnBackInvokedCallback;

.field public e:Landroid/window/OnBackInvokedDispatcher;

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Laj0;->a:Ljava/lang/Runnable;

    .line 5
    .line 6
    new-instance p1, Ll8;

    .line 7
    .line 8
    invoke-direct {p1}, Ll8;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Laj0;->b:Ll8;

    .line 12
    .line 13
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v0, 0x21

    .line 16
    .line 17
    if-lt p1, v0, :cond_1

    .line 18
    .line 19
    const/16 v0, 0x22

    .line 20
    .line 21
    if-lt p1, v0, :cond_0

    .line 22
    .line 23
    new-instance p1, Lui0;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, v0}, Lui0;-><init>(Laj0;I)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Lui0;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-direct {v0, p0, v1}, Lui0;-><init>(Laj0;I)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Lvi0;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-direct {v1, p0, v2}, Lvi0;-><init>(Laj0;I)V

    .line 39
    .line 40
    .line 41
    new-instance v2, Lvi0;

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    invoke-direct {v2, p0, v3}, Lvi0;-><init>(Laj0;I)V

    .line 45
    .line 46
    .line 47
    invoke-static {p1, v0, v1, v2}, Li30;->r(Lui0;Lui0;Lvi0;Lvi0;)Lwi0;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    new-instance p1, Lvi0;

    .line 53
    .line 54
    const/4 v0, 0x2

    .line 55
    invoke-direct {p1, p0, v0}, Lvi0;-><init>(Laj0;I)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Lz5;

    .line 59
    .line 60
    const/4 v1, 0x2

    .line 61
    invoke-direct {v0, v1, p1}, Lz5;-><init>(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-object p1, v0

    .line 65
    :goto_0
    iput-object p1, p0, Laj0;->d:Landroid/window/OnBackInvokedCallback;

    .line 66
    .line 67
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Lb60;Lqw;)V
    .locals 10

    .line 1
    const-string v0, "onBackPressedCallback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lb60;->e()Ld60;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p1, Ld60;->c:Lu50;

    .line 11
    .line 12
    sget-object v1, Lu50;->f:Lu50;

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    new-instance v0, Lxi0;

    .line 18
    .line 19
    invoke-direct {v0, p0, p1, p2}, Lxi0;-><init>(Laj0;Ld60;Lqw;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p2, Lqw;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Laj0;->e()V

    .line 28
    .line 29
    .line 30
    new-instance v1, Lzi0;

    .line 31
    .line 32
    const/4 v8, 0x0

    .line 33
    const/4 v9, 0x0

    .line 34
    const/4 v2, 0x0

    .line 35
    const-class v4, Laj0;

    .line 36
    .line 37
    const-string v5, "updateEnabledCallbacks"

    .line 38
    .line 39
    const-string v6, "updateEnabledCallbacks()V"

    .line 40
    .line 41
    const/4 v7, 0x0

    .line 42
    move-object v3, p0

    .line 43
    invoke-direct/range {v1 .. v9}, Lzi0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p2, Lqw;->c:Lry;

    .line 47
    .line 48
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Laj0;->c:Lqw;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Laj0;->b:Ll8;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-interface {v0, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    move-object v3, v2

    .line 27
    check-cast v3, Lqw;

    .line 28
    .line 29
    iget-boolean v3, v3, Lqw;->a:Z

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v2, v1

    .line 35
    :goto_0
    check-cast v2, Lqw;

    .line 36
    .line 37
    :cond_2
    iput-object v1, p0, Laj0;->c:Lqw;

    .line 38
    .line 39
    return-void
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Laj0;->c:Lqw;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Laj0;->b:Ll8;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget v2, v0, Ll8;->h:I

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    move-object v3, v2

    .line 28
    check-cast v3, Lqw;

    .line 29
    .line 30
    iget-boolean v3, v3, Lqw;->a:Z

    .line 31
    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object v2, v1

    .line 36
    :goto_0
    move-object v0, v2

    .line 37
    check-cast v0, Lqw;

    .line 38
    .line 39
    :cond_2
    iput-object v1, p0, Laj0;->c:Lqw;

    .line 40
    .line 41
    if-eqz v0, :cond_b

    .line 42
    .line 43
    iget v1, v0, Lqw;->d:I

    .line 44
    .line 45
    packed-switch v1, :pswitch_data_0

    .line 46
    .line 47
    .line 48
    iget-object v0, v0, Lqw;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;

    .line 51
    .line 52
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;->G:Lk52;

    .line 53
    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    new-instance v2, Lgr0;

    .line 57
    .line 58
    const/4 v3, 0x1

    .line 59
    invoke-direct {v2, v0, v3}, Lgr0;-><init>(Li5;I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v2}, Lk52;->b(Lyc0;)V

    .line 63
    .line 64
    .line 65
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterPasswordActivity;->G:Lk52;

    .line 66
    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    invoke-virtual {v1, v0}, Lk52;->c(Landroid/app/Activity;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :pswitch_0
    iget-object v0, v0, Lqw;->e:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;

    .line 83
    .line 84
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->C:Lmc2;

    .line 85
    .line 86
    const/4 v2, 0x0

    .line 87
    const-string v3, "binding"

    .line 88
    .line 89
    if-eqz v1, :cond_9

    .line 90
    .line 91
    iget-object v1, v1, Lmc2;->j:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v1, Landroid/webkit/WebView;

    .line 94
    .line 95
    invoke-virtual {v1}, Landroid/webkit/WebView;->canGoBack()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_6

    .line 100
    .line 101
    iget-boolean v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->E:Z

    .line 102
    .line 103
    if-nez v1, :cond_6

    .line 104
    .line 105
    iget-object v0, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->C:Lmc2;

    .line 106
    .line 107
    if-eqz v0, :cond_5

    .line 108
    .line 109
    iget-object v0, v0, Lmc2;->j:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v0, Landroid/webkit/WebView;

    .line 112
    .line 113
    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_5
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw v2

    .line 121
    :cond_6
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->D:Lk52;

    .line 122
    .line 123
    if-eqz v1, :cond_8

    .line 124
    .line 125
    new-instance v2, Lgr0;

    .line 126
    .line 127
    const/4 v3, 0x0

    .line 128
    invoke-direct {v2, v0, v3}, Lgr0;-><init>(Li5;I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v2}, Lk52;->b(Lyc0;)V

    .line 132
    .line 133
    .line 134
    iget-object v1, v0, Lcom/phuongpn/whousemywifi/networkscanner/RouterAdminActivity;->D:Lk52;

    .line 135
    .line 136
    if-eqz v1, :cond_7

    .line 137
    .line 138
    invoke-virtual {v1, v0}, Lk52;->c(Landroid/app/Activity;)V

    .line 139
    .line 140
    .line 141
    :cond_7
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_8
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_9
    invoke-static {v3}, Li30;->S(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v2

    .line 153
    :pswitch_1
    iget-object v0, v0, Lqw;->e:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, Lxw;

    .line 156
    .line 157
    const/4 v1, 0x1

    .line 158
    invoke-virtual {v0, v1}, Lxw;->y(Z)Z

    .line 159
    .line 160
    .line 161
    iget-object v1, v0, Lxw;->h:Lqw;

    .line 162
    .line 163
    iget-boolean v1, v1, Lqw;->a:Z

    .line 164
    .line 165
    if-eqz v1, :cond_a

    .line 166
    .line 167
    invoke-virtual {v0}, Lxw;->M()Z

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_a
    iget-object v0, v0, Lxw;->g:Laj0;

    .line 172
    .line 173
    invoke-virtual {v0}, Laj0;->c()V

    .line 174
    .line 175
    .line 176
    :goto_1
    return-void

    .line 177
    :cond_b
    iget-object v0, p0, Laj0;->a:Ljava/lang/Runnable;

    .line 178
    .line 179
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Laj0;->e:Landroid/window/OnBackInvokedDispatcher;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Laj0;->d:Landroid/window/OnBackInvokedCallback;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-boolean v2, p0, Laj0;->f:Z

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    invoke-static {v0, v1}, Lyg;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, Laj0;->f:Z

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    if-nez p1, :cond_1

    .line 23
    .line 24
    iget-boolean p1, p0, Laj0;->f:Z

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-static {v0, v1}, Lyg;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    iput-boolean p1, p0, Laj0;->f:Z

    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final e()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Laj0;->g:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Laj0;->b:Ll8;

    .line 5
    .line 6
    if-eqz v2, :cond_0

    .line 7
    .line 8
    invoke-virtual {v2}, Ll8;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v2}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lqw;

    .line 30
    .line 31
    iget-boolean v3, v3, Lqw;->a:Z

    .line 32
    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    :cond_2
    :goto_0
    iput-boolean v1, p0, Laj0;->g:Z

    .line 37
    .line 38
    if-eq v1, v0, :cond_3

    .line 39
    .line 40
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 41
    .line 42
    const/16 v2, 0x21

    .line 43
    .line 44
    if-lt v0, v2, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Laj0;->d(Z)V

    .line 47
    .line 48
    .line 49
    :cond_3
    return-void
.end method
