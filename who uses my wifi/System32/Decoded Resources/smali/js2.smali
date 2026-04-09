.class public final synthetic Ljs2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ly32;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lns2;


# direct methods
.method public synthetic constructor <init>(Lns2;I)V
    .locals 0

    .line 1
    iput p2, p0, Ljs2;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Ljs2;->g:Lns2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 6

    .line 1
    iget v0, p0, Ljs2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lag2;

    .line 7
    .line 8
    iget-object p1, p0, Ljs2;->g:Lns2;

    .line 9
    .line 10
    iget-object p1, p1, Lns2;->b:Lau2;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Lau2;->d(Ljava/util/Map;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast p1, Lag2;

    .line 17
    .line 18
    const-string p2, "Hiding native ads overlay."

    .line 19
    .line 20
    invoke-static {p2}, Lgi2;->f0(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Lag2;->p0()Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/16 p2, 0x8

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Ljs2;->g:Lns2;

    .line 33
    .line 34
    iget-object p1, p1, Lns2;->c:Lzj2;

    .line 35
    .line 36
    const/4 p2, 0x0

    .line 37
    iput-boolean p2, p1, Lzj2;->k:Z

    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_1
    check-cast p1, Lag2;

    .line 41
    .line 42
    const-string p2, "Showing native ads overlay."

    .line 43
    .line 44
    invoke-static {p2}, Lgi2;->f0(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1}, Lag2;->p0()Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const/4 p2, 0x0

    .line 52
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Ljs2;->g:Lns2;

    .line 56
    .line 57
    iget-object p1, p1, Lns2;->c:Lzj2;

    .line 58
    .line 59
    const/4 p2, 0x1

    .line 60
    iput-boolean p2, p1, Lzj2;->k:Z

    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_2
    move-object v0, p1

    .line 64
    check-cast v0, Lag2;

    .line 65
    .line 66
    invoke-interface {v0}, Lag2;->e0()Lsg2;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-instance v1, Ll92;

    .line 71
    .line 72
    iget-object v2, p0, Ljs2;->g:Lns2;

    .line 73
    .line 74
    invoke-direct {v1, v2, p2}, Ll92;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iput-object v1, p1, Lsg2;->l:Lug2;

    .line 78
    .line 79
    const-string p1, "overlayHtml"

    .line 80
    .line 81
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    move-object v2, p1

    .line 86
    check-cast v2, Ljava/lang/String;

    .line 87
    .line 88
    const-string p1, "baseUrl"

    .line 89
    .line 90
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    move-object v1, p1

    .line 95
    check-cast v1, Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_0

    .line 102
    .line 103
    const-string p1, "text/html"

    .line 104
    .line 105
    const-string p2, "UTF-8"

    .line 106
    .line 107
    invoke-interface {v0, v2, p1, p2}, Lag2;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_0
    const-string v4, "UTF-8"

    .line 112
    .line 113
    const/4 v5, 0x0

    .line 114
    const-string v3, "text/html"

    .line 115
    .line 116
    invoke-interface/range {v0 .. v5}, Lag2;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :goto_0
    return-void

    .line 120
    :pswitch_3
    check-cast p1, Lag2;

    .line 121
    .line 122
    iget-object p1, p0, Ljs2;->g:Lns2;

    .line 123
    .line 124
    iget-object p1, p1, Lns2;->d:Ldr2;

    .line 125
    .line 126
    invoke-virtual {p1}, Ldr2;->C()V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
