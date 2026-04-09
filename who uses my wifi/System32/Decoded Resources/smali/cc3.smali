.class public final Lcc3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lof0;

.field public final b:Landroid/webkit/WebView;

.field public final c:Ldd3;

.field public final d:Ljava/util/HashMap;

.field public final e:Lmc3;


# direct methods
.method public constructor <init>(Lof0;Landroid/webkit/WebView;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcc3;->d:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v1, Lmc3;

    .line 12
    .line 13
    invoke-direct {v1}, Lmc3;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lcc3;->e:Lmc3;

    .line 17
    .line 18
    sget-object v1, Lm54;->f:Lkj1;

    .line 19
    .line 20
    iget-boolean v1, v1, Lkj1;->g:Z

    .line 21
    .line 22
    if-eqz v1, :cond_6

    .line 23
    .line 24
    iput-object p1, p0, Lcc3;->a:Lof0;

    .line 25
    .line 26
    iput-object p2, p0, Lcc3;->b:Landroid/webkit/WebView;

    .line 27
    .line 28
    iget-object p1, p0, Lcc3;->c:Ldd3;

    .line 29
    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Landroid/view/View;

    .line 39
    .line 40
    :goto_0
    if-ne p1, p2, :cond_1

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Lxb3;

    .line 62
    .line 63
    invoke-virtual {v0, p2}, Lxb3;->b(Landroid/view/View;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    new-instance p1, Ldd3;

    .line 68
    .line 69
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Lcc3;->c:Ldd3;

    .line 73
    .line 74
    :goto_2
    const-string p1, "WEB_MESSAGE_LISTENER"

    .line 75
    .line 76
    invoke-static {p1}, Lob1;->n(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_5

    .line 81
    .line 82
    iget-object p1, p0, Lcc3;->b:Landroid/webkit/WebView;

    .line 83
    .line 84
    sget p2, Lc81;->a:I

    .line 85
    .line 86
    sget-object p2, Lf81;->c:La5;

    .line 87
    .line 88
    invoke-virtual {p2}, Lb5;->b()Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_4

    .line 93
    .line 94
    invoke-static {p1}, Lc81;->a(Landroid/webkit/WebView;)Lof3;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iget-object p1, p1, Lof3;->g:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p1, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    .line 101
    .line 102
    const-string v0, "omidJsSessionService"

    .line 103
    .line 104
    invoke-interface {p1, v0}, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;->removeWebMessageListener(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    new-instance p1, Lug0;

    .line 108
    .line 109
    const/16 v1, 0x1d

    .line 110
    .line 111
    invoke-direct {p1, v1, p0}, Lug0;-><init>(ILjava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    iget-object v1, p0, Lcc3;->b:Landroid/webkit/WebView;

    .line 115
    .line 116
    new-instance v2, Ljava/util/HashSet;

    .line 117
    .line 118
    const-string v3, "*"

    .line 119
    .line 120
    filled-new-array {v3}, [Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2}, Lb5;->b()Z

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    if-eqz p2, :cond_3

    .line 136
    .line 137
    invoke-static {v1}, Lc81;->a(Landroid/webkit/WebView;)Lof3;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    const/4 v1, 0x0

    .line 142
    new-array v3, v1, [Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    check-cast v2, [Ljava/lang/String;

    .line 149
    .line 150
    iget-object p2, p2, Lof3;->g:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast p2, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    .line 153
    .line 154
    new-instance v3, Lz71;

    .line 155
    .line 156
    invoke-direct {v3, v1, p1}, Lz71;-><init>(ILjava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    new-instance p1, Lxb;

    .line 160
    .line 161
    invoke-direct {p1, v3}, Lxb;-><init>(Lz71;)V

    .line 162
    .line 163
    .line 164
    invoke-interface {p2, v0, v2, p1}, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;->addWebMessageListener(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/reflect/InvocationHandler;)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_3
    invoke-static {}, Lf81;->a()Ljava/lang/UnsupportedOperationException;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    throw p1

    .line 173
    :cond_4
    invoke-static {}, Lf81;->a()Ljava/lang/UnsupportedOperationException;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    throw p1

    .line 178
    :cond_5
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 179
    .line 180
    const-string p2, "The JavaScriptSessionService cannot be supported in this WebView version."

    .line 181
    .line 182
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw p1

    .line 186
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 187
    .line 188
    const-string p2, "Method called before OM SDK activation"

    .line 189
    .line 190
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw p1
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 11

    .line 1
    new-instance v0, Lxb3;

    .line 2
    .line 3
    sget-object v1, Lyb3;->g:Lyb3;

    .line 4
    .line 5
    sget-object v2, Lbc3;->g:Lbc3;

    .line 6
    .line 7
    sget-object v3, Ldc3;->h:Ldc3;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-static {v1, v2, v3, v3, v4}, Lde3;->b(Lyb3;Lbc3;Ldc3;Ldc3;Z)Lde3;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v5, Luk1;

    .line 15
    .line 16
    sget-object v10, Lwb3;->g:Lwb3;

    .line 17
    .line 18
    iget-object v6, p0, Lcc3;->a:Lof0;

    .line 19
    .line 20
    iget-object v7, p0, Lcc3;->b:Landroid/webkit/WebView;

    .line 21
    .line 22
    const/4 v8, 0x0

    .line 23
    move-object v9, v8

    .line 24
    invoke-direct/range {v5 .. v10}, Luk1;-><init>(Lof0;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Lwb3;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, v1, v5, p1}, Lxb3;-><init>(Lde3;Luk1;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lcc3;->d:Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcc3;->c:Ldd3;

    .line 36
    .line 37
    if-nez p1, :cond_0

    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Landroid/view/View;

    .line 46
    .line 47
    :goto_0
    invoke-virtual {v0, p1}, Lxb3;->b(Landroid/view/View;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lcc3;->e:Lmc3;

    .line 51
    .line 52
    iget-object p1, p1, Lmc3;->a:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    :goto_1
    if-ge v4, v1, :cond_2

    .line 59
    .line 60
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    add-int/lit8 v4, v4, 0x1

    .line 65
    .line 66
    check-cast v2, Llc3;

    .line 67
    .line 68
    iget-object v3, v2, Llc3;->a:Ldd3;

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, Landroid/view/View;

    .line 75
    .line 76
    iget-object v2, v2, Llc3;->c:Lac3;

    .line 77
    .line 78
    iget-boolean v5, v0, Lxb3;->f:Z

    .line 79
    .line 80
    if-eqz v5, :cond_1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    iget-object v5, v0, Lxb3;->b:Lmc3;

    .line 84
    .line 85
    invoke-virtual {v5, v3, v2}, Lmc3;->a(Landroid/view/View;Lac3;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    invoke-virtual {v0}, Lxb3;->a()V

    .line 90
    .line 91
    .line 92
    return-void
.end method
