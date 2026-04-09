.class public final synthetic Lui0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ldy;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Laj0;


# direct methods
.method public synthetic constructor <init>(Laj0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lui0;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lui0;->g:Laj0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lui0;->f:I

    .line 2
    .line 3
    check-cast p1, Lf9;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string v0, "backEvent"

    .line 9
    .line 10
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lui0;->g:Laj0;

    .line 14
    .line 15
    iget-object v0, p1, Laj0;->c:Lqw;

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    iget-object p1, p1, Laj0;->b:Ll8;

    .line 20
    .line 21
    invoke-virtual {p1}, Ll8;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p1, v0}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :cond_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    move-object v1, v0

    .line 40
    check-cast v1, Lqw;

    .line 41
    .line 42
    iget-boolean v1, v1, Lqw;->a:Z

    .line 43
    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v0, 0x0

    .line 48
    :goto_0
    check-cast v0, Lqw;

    .line 49
    .line 50
    :cond_2
    sget-object p1, Lz31;->a:Lz31;

    .line 51
    .line 52
    return-object p1

    .line 53
    :pswitch_0
    const-string v0, "backEvent"

    .line 54
    .line 55
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lui0;->g:Laj0;

    .line 59
    .line 60
    iget-object v0, p1, Laj0;->b:Ll8;

    .line 61
    .line 62
    invoke-virtual {v0}, Ll8;->size()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    :cond_3
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    move-object v2, v1

    .line 81
    check-cast v2, Lqw;

    .line 82
    .line 83
    iget-boolean v2, v2, Lqw;->a:Z

    .line 84
    .line 85
    if-eqz v2, :cond_3

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    const/4 v1, 0x0

    .line 89
    :goto_1
    check-cast v1, Lqw;

    .line 90
    .line 91
    iget-object v0, p1, Laj0;->c:Lqw;

    .line 92
    .line 93
    if-eqz v0, :cond_5

    .line 94
    .line 95
    invoke-virtual {p1}, Laj0;->b()V

    .line 96
    .line 97
    .line 98
    :cond_5
    iput-object v1, p1, Laj0;->c:Lqw;

    .line 99
    .line 100
    sget-object p1, Lz31;->a:Lz31;

    .line 101
    .line 102
    return-object p1

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
