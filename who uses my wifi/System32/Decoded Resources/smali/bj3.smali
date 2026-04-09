.class public final synthetic Lbj3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lyp3;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lfj3;

.field public final synthetic c:Lyg3;


# direct methods
.method public synthetic constructor <init>(Lfj3;Lyg3;I)V
    .locals 0

    .line 1
    iput p3, p0, Lbj3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lbj3;->b:Lfj3;

    .line 4
    .line 5
    iput-object p2, p0, Lbj3;->c:Lyg3;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ln70;
    .locals 3

    .line 1
    iget v0, p0, Lbj3;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lbj3;->c:Lyg3;

    .line 4
    .line 5
    iget-object v2, p0, Lbj3;->b:Lfj3;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Void;

    .line 11
    .line 12
    invoke-virtual {v1}, Lyg3;->B()La54;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, La54;->p()[B

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v0, v2, Lfj3;->c:Lrj3;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lrj3;->c([B)Lar3;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v1}, Lyg3;->C()La54;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, La54;->p()[B

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget v2, v0, Lrj3;->a:I

    .line 35
    .line 36
    packed-switch v2, :pswitch_data_1

    .line 37
    .line 38
    .line 39
    iget-object v2, v0, Lrj3;->d:Lz94;

    .line 40
    .line 41
    invoke-interface {v2}, Lz94;->d()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Llg3;

    .line 46
    .line 47
    invoke-virtual {v2, v1}, Llg3;->a(Ljava/lang/Object;)Lar3;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-object v0, v0, Lrj3;->e:Lgk3;

    .line 52
    .line 53
    const/16 v2, 0x4f53

    .line 54
    .line 55
    invoke-virtual {v0, v2, v1}, Lgk3;->d(ILn70;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :pswitch_0
    iget-object v2, v0, Lrj3;->d:Lz94;

    .line 60
    .line 61
    invoke-interface {v2}, Lz94;->d()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Llg3;

    .line 66
    .line 67
    invoke-virtual {v2, v1}, Llg3;->a(Ljava/lang/Object;)Lar3;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iget-object v0, v0, Lrj3;->e:Lgk3;

    .line 72
    .line 73
    const/16 v2, 0x3bcb

    .line 74
    .line 75
    invoke-virtual {v0, v2, v1}, Lgk3;->d(ILn70;)V

    .line 76
    .line 77
    .line 78
    :goto_0
    const/4 v0, 0x2

    .line 79
    new-array v0, v0, [Ln70;

    .line 80
    .line 81
    const/4 v2, 0x0

    .line 82
    aput-object p1, v0, v2

    .line 83
    .line 84
    const/4 p1, 0x1

    .line 85
    aput-object v1, v0, p1

    .line 86
    .line 87
    new-instance v1, Lzp3;

    .line 88
    .line 89
    invoke-static {v0}, Lxm3;->n([Ljava/lang/Object;)Lsn3;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-direct {v1, v0, p1}, Lzp3;-><init>(Lxm3;Z)V

    .line 94
    .line 95
    .line 96
    return-object v1

    .line 97
    :pswitch_1
    check-cast p1, Ljava/lang/Void;

    .line 98
    .line 99
    iget-object p1, v2, Lfj3;->c:Lrj3;

    .line 100
    .line 101
    invoke-virtual {v1}, Lyg3;->A()Ljh3;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {p1, v0}, Lrj3;->b(Ljh3;)Lar3;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    return-object p1

    .line 110
    :pswitch_2
    check-cast p1, Ljava/util/List;

    .line 111
    .line 112
    iget-object p1, v2, Lfj3;->c:Lrj3;

    .line 113
    .line 114
    invoke-virtual {v1}, Lyg3;->A()Ljh3;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {p1, v0}, Lrj3;->b(Ljh3;)Lar3;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    return-object p1

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
