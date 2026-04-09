.class public final Lbw1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/app/Application;

.field public final b:Laa2;

.field public final c:Lmo1;

.field public final d:Lz52;

.field public final e:Lvq2;

.field public f:Landroid/app/Dialog;

.field public g:Lu82;

.field public final h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final i:Ljava/util/concurrent/atomic/AtomicReference;

.field public final j:Ljava/util/concurrent/atomic/AtomicReference;

.field public final k:Ljava/util/concurrent/atomic/AtomicReference;

.field public l:Z


# direct methods
.method public constructor <init>(Landroid/app/Application;Laa2;Lmo1;Lz52;Lvq2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lbw1;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lbw1;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lbw1;->j:Ljava/util/concurrent/atomic/AtomicReference;

    .line 24
    .line 25
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lbw1;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-boolean v0, p0, Lbw1;->l:Z

    .line 34
    .line 35
    iput-object p1, p0, Lbw1;->a:Landroid/app/Application;

    .line 36
    .line 37
    iput-object p2, p0, Lbw1;->b:Laa2;

    .line 38
    .line 39
    iput-object p3, p0, Lbw1;->c:Lmo1;

    .line 40
    .line 41
    iput-object p4, p0, Lbw1;->d:Lz52;

    .line 42
    .line 43
    iput-object p5, p0, Lbw1;->e:Lvq2;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final a(Li5;Llz;)V
    .locals 6

    .line 1
    invoke-static {}, Lok2;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lbw1;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v3, 0x3

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    new-instance p1, Lah3;

    .line 16
    .line 17
    iget-boolean v0, p0, Lbw1;->l:Z

    .line 18
    .line 19
    if-eq v2, v0, :cond_0

    .line 20
    .line 21
    const-string v0, "ConsentForm#show can only be invoked once."

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v0, "Privacy options form is being loading. Please try again later."

    .line 25
    .line 26
    :goto_0
    invoke-direct {p1, v0, v3}, Lah3;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lah3;->a()Lbw;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p2, p1}, Llz;->a(Lbw;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    iget-object v0, p0, Lbw1;->g:Lu82;

    .line 38
    .line 39
    iget-object v2, v0, Lu82;->g:Lgi1;

    .line 40
    .line 41
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    new-instance v4, Lg72;

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    invoke-direct {v4, v2, v5}, Lg72;-><init>(Lgi1;I)V

    .line 48
    .line 49
    .line 50
    iget-object v0, v0, Lu82;->f:Landroid/os/Handler;

    .line 51
    .line 52
    invoke-virtual {v0, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 53
    .line 54
    .line 55
    new-instance v0, Lau1;

    .line 56
    .line 57
    invoke-direct {v0, p0, p1}, Lau1;-><init>(Lbw1;Landroid/app/Activity;)V

    .line 58
    .line 59
    .line 60
    iget-object v2, p0, Lbw1;->a:Landroid/app/Application;

    .line 61
    .line 62
    invoke-virtual {v2, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 63
    .line 64
    .line 65
    iget-object v2, p0, Lbw1;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 66
    .line 67
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lbw1;->b:Laa2;

    .line 71
    .line 72
    iput-object p1, v0, Laa2;->a:Landroid/app/Activity;

    .line 73
    .line 74
    new-instance v0, Landroid/app/Dialog;

    .line 75
    .line 76
    const v2, 0x1030010

    .line 77
    .line 78
    .line 79
    invoke-direct {v0, p1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, Lbw1;->g:Lu82;

    .line 83
    .line 84
    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-nez p1, :cond_2

    .line 95
    .line 96
    new-instance p1, Lah3;

    .line 97
    .line 98
    const-string v0, "Activity with null windows is passed in."

    .line 99
    .line 100
    invoke-direct {p1, v0, v3}, Lah3;-><init>(Ljava/lang/String;I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Lah3;->a()Lbw;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p2, p1}, Llz;->a(Lbw;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_2
    const/4 v2, -0x1

    .line 112
    invoke-virtual {p1, v2, v2}, Landroid/view/Window;->setLayout(II)V

    .line 113
    .line 114
    .line 115
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    .line 116
    .line 117
    invoke-direct {v2, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 121
    .line 122
    .line 123
    const/high16 v2, 0x1000000

    .line 124
    .line 125
    invoke-virtual {p1, v2, v2}, Landroid/view/Window;->setFlags(II)V

    .line 126
    .line 127
    .line 128
    invoke-static {p1, v1}, Lpu1;->n(Landroid/view/Window;Z)V

    .line 129
    .line 130
    .line 131
    iget-object p1, p0, Lbw1;->j:Ljava/util/concurrent/atomic/AtomicReference;

    .line 132
    .line 133
    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 137
    .line 138
    .line 139
    iput-object v0, p0, Lbw1;->f:Landroid/app/Dialog;

    .line 140
    .line 141
    iget-object p1, p0, Lbw1;->g:Lu82;

    .line 142
    .line 143
    const-string p2, "UMP_messagePresented"

    .line 144
    .line 145
    const-string v0, ""

    .line 146
    .line 147
    invoke-virtual {p1, p2, v0}, Lu82;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    return-void
.end method

.method public final b(Lf41;Le41;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lbw1;->e:Lvq2;

    .line 2
    .line 3
    iget-object v1, v0, Lvq2;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lls2;

    .line 6
    .line 7
    invoke-virtual {v1}, Lls2;->a()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Laa2;

    .line 12
    .line 13
    sget-object v2, Lok2;->a:Landroid/os/Handler;

    .line 14
    .line 15
    invoke-static {v2}, Lpu1;->s(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, Lvq2;->h:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lbu1;

    .line 21
    .line 22
    invoke-virtual {v0}, Lbu1;->p()Lgi1;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v3, Lu82;

    .line 27
    .line 28
    invoke-direct {v3, v1, v2, v0}, Lu82;-><init>(Laa2;Landroid/os/Handler;Lgi1;)V

    .line 29
    .line 30
    .line 31
    iput-object v3, p0, Lbw1;->g:Lu82;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-virtual {v3, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const/4 v4, 0x1

    .line 42
    invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1, v0}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1, v0}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    .line 57
    .line 58
    .line 59
    new-instance v0, Ler0;

    .line 60
    .line 61
    const/4 v1, 0x1

    .line 62
    invoke-direct {v0, v1, v3}, Ler0;-><init>(ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 66
    .line 67
    .line 68
    new-instance v0, Lyu1;

    .line 69
    .line 70
    invoke-direct {v0, p1, p2}, Lyu1;-><init>(Lf41;Le41;)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lbw1;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v3, p0, Lbw1;->g:Lu82;

    .line 79
    .line 80
    iget-object p1, p0, Lbw1;->d:Lz52;

    .line 81
    .line 82
    iget-object v4, p1, Lz52;->a:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v5, p1, Lz52;->b:Ljava/lang/String;

    .line 85
    .line 86
    const-string v7, "UTF-8"

    .line 87
    .line 88
    const/4 v8, 0x0

    .line 89
    const-string v6, "text/html"

    .line 90
    .line 91
    invoke-virtual/range {v3 .. v8}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    new-instance p1, La9;

    .line 95
    .line 96
    const/16 p2, 0x1c

    .line 97
    .line 98
    invoke-direct {p1, p2, p0}, La9;-><init>(ILjava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    const-wide/16 v0, 0x2710

    .line 102
    .line 103
    invoke-virtual {v2, p1, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 104
    .line 105
    .line 106
    return-void
.end method
