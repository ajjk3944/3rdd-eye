.class public final Lzf2;
.super Landroid/webkit/WebChromeClient;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ljg2;


# direct methods
.method public constructor <init>(Ljg2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzf2;->a:Ljg2;

    .line 5
    .line 6
    return-void
.end method

.method public static final b(Landroid/webkit/WebView;)Landroid/content/Context;
    .locals 1

    .line 1
    instance-of v0, p0, Lag2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    check-cast p0, Lag2;

    .line 11
    .line 12
    invoke-interface {p0}, Lag2;->g()Landroid/app/Activity;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    invoke-interface {p0}, Lag2;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;Landroid/webkit/JsPromptResult;Z)Z
    .locals 6

    .line 1
    const-string v0, "\')"

    .line 2
    .line 3
    const-string v1, "(\'"

    .line 4
    .line 5
    const-string v2, "window."

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    :try_start_0
    iget-object v4, p0, Lzf2;->a:Ljg2;

    .line 9
    .line 10
    if-eqz v4, :cond_0

    .line 11
    .line 12
    iget-object v4, v4, Ljg2;->f:Log2;

    .line 13
    .line 14
    iget-object v4, v4, Log2;->s:Lsg2;

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    iget-object v4, v4, Lsg2;->B:Lsu1;

    .line 19
    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    invoke-virtual {v4}, Lsu1;->a()Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-nez v5, :cond_0

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    add-int/lit8 p1, p1, 0x9

    .line 35
    .line 36
    invoke-static {p4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    add-int/2addr p1, p3

    .line 45
    add-int/lit8 p1, p1, 0x2

    .line 46
    .line 47
    new-instance p3, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {p3, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {v4, p1}, Lsu1;->b(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 p1, 0x0

    .line 75
    return p1

    .line 76
    :cond_0
    sget-object p2, Lhg4;->C:Lhg4;

    .line 77
    .line 78
    iget-object p2, p2, Lhg4;->c:Llf4;

    .line 79
    .line 80
    invoke-static {p1}, Llf4;->k(Landroid/content/Context;)Landroid/app/AlertDialog$Builder;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-virtual {p2, p3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 85
    .line 86
    .line 87
    const/high16 p3, 0x1040000

    .line 88
    .line 89
    const v0, 0x104000a

    .line 90
    .line 91
    .line 92
    if-eqz p8, :cond_1

    .line 93
    .line 94
    new-instance p6, Landroid/widget/LinearLayout;

    .line 95
    .line 96
    invoke-direct {p6, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p6, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 100
    .line 101
    .line 102
    new-instance p8, Landroid/widget/TextView;

    .line 103
    .line 104
    invoke-direct {p8, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p8, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 108
    .line 109
    .line 110
    new-instance p4, Landroid/widget/EditText;

    .line 111
    .line 112
    invoke-direct {p4, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p4, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p6, p8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p6, p4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2, p6}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    new-instance p2, Lqm1;

    .line 129
    .line 130
    const/4 p5, 0x1

    .line 131
    invoke-direct {p2, p7, p4, p5}, Lqm1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, v0, p2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    new-instance p2, Lk70;

    .line 139
    .line 140
    const/4 p4, 0x5

    .line 141
    invoke-direct {p2, p4, p7}, Lk70;-><init>(ILjava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, p3, p2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    new-instance p2, Luo;

    .line 149
    .line 150
    const/4 p3, 0x3

    .line 151
    invoke-direct {p2, p3, p7}, Luo;-><init>(ILjava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 163
    .line 164
    .line 165
    return v3

    .line 166
    :cond_1
    invoke-virtual {p2, p4}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    new-instance p2, Lxf2;

    .line 171
    .line 172
    const/4 p4, 0x1

    .line 173
    invoke-direct {p2, p6, p4}, Lxf2;-><init>(Landroid/webkit/JsResult;I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1, v0, p2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    new-instance p2, Lxf2;

    .line 181
    .line 182
    const/4 p4, 0x0

    .line 183
    invoke-direct {p2, p6, p4}, Lxf2;-><init>(Landroid/webkit/JsResult;I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1, p3, p2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    new-instance p2, Luo;

    .line 191
    .line 192
    const/4 p3, 0x2

    .line 193
    invoke-direct {p2, p3, p6}, Luo;-><init>(ILjava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V
    :try_end_0
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_0 .. :try_end_0} :catch_0

    .line 205
    .line 206
    .line 207
    return v3

    .line 208
    :catch_0
    const/4 p1, 0x5

    .line 209
    invoke-static {p1}, Lgi2;->q0(I)Z

    .line 210
    .line 211
    .line 212
    return v3
.end method

.method public final onCloseWindow(Landroid/webkit/WebView;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lag2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p1, "Tried to close a WebView that wasn\'t an AdWebView."

    .line 6
    .line 7
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    check-cast p1, Lag2;

    .line 12
    .line 13
    invoke-interface {p1}, Lag2;->z0()Ljh1;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    const-string p1, "Tried to close an AdWebView not associated with an overlay."

    .line 20
    .line 21
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-virtual {p1}, Ljh1;->y()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->sourceId()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->lineNumber()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    add-int/lit8 v3, v3, 0x6

    .line 38
    .line 39
    add-int/2addr v3, v4

    .line 40
    new-instance v4, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const/4 v6, 0x1

    .line 43
    add-int/2addr v3, v6

    .line 44
    add-int/2addr v3, v5

    .line 45
    add-int/2addr v3, v6

    .line 46
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 47
    .line 48
    .line 49
    const-string v3, "JS: "

    .line 50
    .line 51
    const-string v5, " ("

    .line 52
    .line 53
    invoke-static {v4, v3, v0, v5, v1}, Lex0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v0, ":"

    .line 57
    .line 58
    const-string v1, ")"

    .line 59
    .line 60
    invoke-static {v4, v0, v2, v1}, Lga1;->k(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v1, "Application Cache"

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_0

    .line 71
    .line 72
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    return p1

    .line 77
    :cond_0
    sget-object v1, Lyf2;->a:[I

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->messageLevel()Landroid/webkit/ConsoleMessage$MessageLevel;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    aget v1, v1, v2

    .line 88
    .line 89
    if-eq v1, v6, :cond_4

    .line 90
    .line 91
    const/4 v2, 0x2

    .line 92
    if-eq v1, v2, :cond_3

    .line 93
    .line 94
    const/4 v2, 0x3

    .line 95
    if-eq v1, v2, :cond_2

    .line 96
    .line 97
    const/4 v2, 0x4

    .line 98
    if-eq v1, v2, :cond_2

    .line 99
    .line 100
    const/4 v2, 0x5

    .line 101
    if-eq v1, v2, :cond_1

    .line 102
    .line 103
    invoke-static {v0}, Lgi2;->f0(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_2
    invoke-static {v0}, Lgi2;->f0(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_3
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_4
    invoke-static {v0}, Lgi2;->Z(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :goto_0
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    return p1
.end method

.method public final onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z
    .locals 0

    .line 1
    iget-object p2, p4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, Landroid/webkit/WebView$WebViewTransport;

    .line 4
    .line 5
    new-instance p3, Landroid/webkit/WebView;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p3, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lzf2;->a:Ljg2;

    .line 15
    .line 16
    iget-object p1, p1, Ljg2;->f:Log2;

    .line 17
    .line 18
    iget-object p1, p1, Log2;->s:Lsg2;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p3, p1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p2, p3}, Landroid/webkit/WebView$WebViewTransport;->setWebView(Landroid/webkit/WebView;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p4}, Landroid/os/Message;->sendToTarget()V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    return p1
.end method

.method public final onExceededDatabaseQuota(Ljava/lang/String;Ljava/lang/String;JJJLandroid/webkit/WebStorage$QuotaUpdater;)V
    .locals 3

    .line 1
    const-wide/32 p1, 0x500000

    .line 2
    .line 3
    .line 4
    sub-long/2addr p1, p7

    .line 5
    const-wide/16 p7, 0x0

    .line 6
    .line 7
    cmp-long v0, p1, p7

    .line 8
    .line 9
    if-gtz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p9, p3, p4}, Landroid/webkit/WebStorage$QuotaUpdater;->updateQuota(J)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    cmp-long v0, p3, p7

    .line 16
    .line 17
    const-wide/32 v1, 0x100000

    .line 18
    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    cmp-long p1, p5, p1

    .line 23
    .line 24
    if-gtz p1, :cond_1

    .line 25
    .line 26
    cmp-long p1, p5, v1

    .line 27
    .line 28
    if-gtz p1, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-wide p5, p7

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    cmp-long p7, p5, p7

    .line 34
    .line 35
    if-nez p7, :cond_3

    .line 36
    .line 37
    const-wide/32 p5, 0x20000

    .line 38
    .line 39
    .line 40
    invoke-static {p5, p6, p1, p2}, Ljava/lang/Math;->min(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    add-long/2addr p1, p3

    .line 45
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide p5

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    sub-long/2addr v1, p3

    .line 51
    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->min(JJ)J

    .line 52
    .line 53
    .line 54
    move-result-wide p1

    .line 55
    cmp-long p1, p5, p1

    .line 56
    .line 57
    if-gtz p1, :cond_4

    .line 58
    .line 59
    add-long/2addr p3, p5

    .line 60
    :cond_4
    move-wide p5, p3

    .line 61
    :goto_0
    invoke-interface {p9, p5, p6}, Landroid/webkit/WebStorage$QuotaUpdater;->updateQuota(J)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    .locals 6

    .line 1
    if-eqz p2, :cond_3

    .line 2
    .line 3
    sget-object v0, Lhg4;->C:Lhg4;

    .line 4
    .line 5
    iget-object v0, v0, Lhg4;->c:Llf4;

    .line 6
    .line 7
    iget-object v0, p0, Lzf2;->a:Ljg2;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "android.permission.ACCESS_FINE_LOCATION"

    .line 14
    .line 15
    invoke-static {v1, v2}, Llf4;->c(Landroid/content/Context;Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    .line 28
    .line 29
    invoke-static {v0, v1}, Llf4;->c(Landroid/content/Context;Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    :cond_0
    move v0, v3

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v0, v2

    .line 38
    :goto_0
    sget-object v1, Lmz1;->Yd:Liz1;

    .line 39
    .line 40
    sget-object v4, Ltw1;->e:Ltw1;

    .line 41
    .line 42
    iget-object v5, v4, Ltw1;->c:Lkz1;

    .line 43
    .line 44
    invoke-virtual {v5, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    invoke-interface {p2, p1, v2, v3}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-interface {p2, p1, v0, v3}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 61
    .line 62
    .line 63
    :goto_1
    sget-object p1, Lmz1;->Zd:Liz1;

    .line 64
    .line 65
    iget-object p2, v4, Ltw1;->c:Lkz1;

    .line 66
    .line 67
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    const-string p1, "AdWebChromeClient.onGeolocationPermissionsShowPrompt()"

    .line 80
    .line 81
    invoke-static {p1}, Lgi2;->U(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    return-void
.end method

.method public final onHideCustomView()V
    .locals 1

    .line 1
    iget-object v0, p0, Lzf2;->a:Ljg2;

    .line 2
    .line 3
    iget-object v0, v0, Ljg2;->f:Log2;

    .line 4
    .line 5
    invoke-virtual {v0}, Log2;->z0()Ljh1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "Could not get ad overlay when hiding custom view."

    .line 12
    .line 13
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {v0}, Ljh1;->r()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 9

    .line 1
    invoke-static {p1}, Lzf2;->b(Landroid/webkit/WebView;)Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    const/4 v7, 0x0

    .line 6
    const/4 v8, 0x0

    .line 7
    const-string v2, "alert"

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    move-object v0, p0

    .line 11
    move-object v3, p2

    .line 12
    move-object v4, p3

    .line 13
    move-object v6, p4

    .line 14
    invoke-virtual/range {v0 .. v8}, Lzf2;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;Landroid/webkit/JsPromptResult;Z)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1
.end method

.method public final onJsBeforeUnload(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 9

    .line 1
    invoke-static {p1}, Lzf2;->b(Landroid/webkit/WebView;)Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    const/4 v7, 0x0

    .line 6
    const/4 v8, 0x0

    .line 7
    const-string v2, "onBeforeUnload"

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    move-object v0, p0

    .line 11
    move-object v3, p2

    .line 12
    move-object v4, p3

    .line 13
    move-object v6, p4

    .line 14
    invoke-virtual/range {v0 .. v8}, Lzf2;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;Landroid/webkit/JsPromptResult;Z)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1
.end method

.method public final onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 9

    .line 1
    invoke-static {p1}, Lzf2;->b(Landroid/webkit/WebView;)Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    const/4 v7, 0x0

    .line 6
    const/4 v8, 0x0

    .line 7
    const-string v2, "confirm"

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    move-object v0, p0

    .line 11
    move-object v3, p2

    .line 12
    move-object v4, p3

    .line 13
    move-object v6, p4

    .line 14
    invoke-virtual/range {v0 .. v8}, Lzf2;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;Landroid/webkit/JsPromptResult;Z)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1
.end method

.method public final onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    .locals 9

    .line 1
    invoke-static {p1}, Lzf2;->b(Landroid/webkit/WebView;)Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v8, 0x1

    .line 7
    const-string v2, "prompt"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    move-object v3, p2

    .line 11
    move-object v4, p3

    .line 12
    move-object v5, p4

    .line 13
    move-object v7, p5

    .line 14
    invoke-virtual/range {v0 .. v8}, Lzf2;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;Landroid/webkit/JsPromptResult;Z)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1
.end method

.method public final onShowCustomView(Landroid/view/View;ILandroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lzf2;->a:Ljg2;

    .line 2
    iget-object v0, v0, Ljg2;->f:Log2;

    .line 3
    invoke-virtual {v0}, Log2;->z0()Ljh1;

    move-result-object v0

    if-nez v0, :cond_0

    .line 4
    const-string p1, "Could not get ad overlay when showing custom view."

    .line 5
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 6
    invoke-interface {p3}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    return-void

    .line 7
    :cond_0
    new-instance v1, Landroid/widget/FrameLayout;

    iget-object v2, v0, Ljh1;->g:Landroid/app/Activity;

    invoke-direct {v1, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Ljh1;->m:Landroid/widget/FrameLayout;

    const/high16 v3, -0x1000000

    .line 8
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v1, v0, Ljh1;->m:Landroid/widget/FrameLayout;

    const/4 v3, -0x1

    .line 9
    invoke-virtual {v1, p1, v3, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    iget-object p1, v0, Ljh1;->m:Landroid/widget/FrameLayout;

    .line 10
    invoke-virtual {v2, p1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    const/4 p1, 0x1

    iput-boolean p1, v0, Ljh1;->w:Z

    iput-object p3, v0, Ljh1;->n:Landroid/webkit/WebChromeClient$CustomViewCallback;

    iput-boolean p1, v0, Ljh1;->l:Z

    .line 11
    invoke-virtual {v0, p2}, Ljh1;->I3(I)V

    return-void
.end method

.method public final onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 1

    const/4 v0, -0x1

    .line 12
    invoke-virtual {p0, p1, v0, p2}, Lzf2;->onShowCustomView(Landroid/view/View;ILandroid/webkit/WebChromeClient$CustomViewCallback;)V

    return-void
.end method
