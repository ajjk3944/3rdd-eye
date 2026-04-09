.class public final Lb42;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lba4;

.field public final c:Lga4;

.field public final d:Lba4;


# direct methods
.method public constructor <init>(Lba4;Lba4;Lba4;I)V
    .locals 0

    .line 1
    iput p4, p0, Lb42;->a:I

    .line 2
    .line 3
    packed-switch p4, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lb42;->c:Lga4;

    .line 10
    .line 11
    iput-object p2, p0, Lb42;->b:Lba4;

    .line 12
    .line 13
    iput-object p3, p0, Lb42;->d:Lba4;

    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lb42;->b:Lba4;

    .line 20
    .line 21
    iput-object p2, p0, Lb42;->d:Lba4;

    .line 22
    .line 23
    iput-object p3, p0, Lb42;->c:Lga4;

    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lb42;->b:Lba4;

    .line 30
    .line 31
    iput-object p2, p0, Lb42;->c:Lga4;

    .line 32
    .line 33
    iput-object p3, p0, Lb42;->d:Lba4;

    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final bridge synthetic d()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lb42;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb42;->b:Lba4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/io/File;

    .line 13
    .line 14
    iget-object v1, p0, Lb42;->d:Lba4;

    .line 15
    .line 16
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lfd3;

    .line 21
    .line 22
    iget-object v2, p0, Lb42;->c:Lga4;

    .line 23
    .line 24
    invoke-interface {v2}, Lga4;->d()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lgk3;

    .line 29
    .line 30
    new-instance v3, Ljj3;

    .line 31
    .line 32
    invoke-direct {v3, v0, v1, v2}, Ljj3;-><init>(Ljava/io/File;Lfd3;Lgk3;)V

    .line 33
    .line 34
    .line 35
    return-object v3

    .line 36
    :pswitch_0
    iget-object v0, p0, Lb42;->b:Lba4;

    .line 37
    .line 38
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Ljv2;

    .line 43
    .line 44
    iget-object v1, p0, Lb42;->c:Lga4;

    .line 45
    .line 46
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lpv2;

    .line 51
    .line 52
    iget-object v2, p0, Lb42;->d:Lba4;

    .line 53
    .line 54
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    new-instance v3, Lhv2;

    .line 65
    .line 66
    invoke-direct {v3, v0, v1, v2}, Lhv2;-><init>(Ljv2;Lpv2;I)V

    .line 67
    .line 68
    .line 69
    return-object v3

    .line 70
    :pswitch_1
    iget-object v0, p0, Lb42;->c:Lga4;

    .line 71
    .line 72
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Llu1;

    .line 77
    .line 78
    iget-object v1, p0, Lb42;->b:Lba4;

    .line 79
    .line 80
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Ljava/lang/Integer;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    iget-object v2, p0, Lb42;->d:Lba4;

    .line 91
    .line 92
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, Ljava/lang/String;

    .line 97
    .line 98
    new-instance v3, Lq32;

    .line 99
    .line 100
    invoke-direct {v3, v0, v1, v2}, Lq32;-><init>(Llu1;ILjava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-object v3

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
