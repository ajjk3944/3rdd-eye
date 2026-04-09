.class public final Lsb3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lsb3;->f:I

    .line 2
    .line 3
    iput-object p2, p0, Lsb3;->g:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 7

    .line 1
    iget v0, p0, Lsb3;->f:I

    .line 2
    .line 3
    iget-object v1, p0, Lsb3;->g:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, Log4;->a:Ljava/util/HashMap;

    .line 9
    .line 10
    check-cast v1, Lng4;

    .line 11
    .line 12
    invoke-interface {v1, p2}, Lng4;->c(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    invoke-interface {v1, p1}, Lng4;->c(Ljava/lang/Object;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    sub-int/2addr p2, p1

    .line 21
    return p2

    .line 22
    :pswitch_0
    check-cast p1, Lrb3;

    .line 23
    .line 24
    check-cast p2, Lrb3;

    .line 25
    .line 26
    iget-object v0, p2, Lrb3;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Ljb3;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ljb3;->g(Ljava/lang/Object;)Ltx2;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    instance-of v2, v0, Lrm2;

    .line 35
    .line 36
    const-wide/16 v3, 0x0

    .line 37
    .line 38
    if-nez v2, :cond_0

    .line 39
    .line 40
    move-wide v5, v3

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    check-cast v0, Lrm2;

    .line 43
    .line 44
    iget-wide v5, v0, Lrm2;->o:D

    .line 45
    .line 46
    :goto_0
    iget-object v0, p1, Lrb3;->a:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljb3;->g(Ljava/lang/Object;)Ltx2;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    instance-of v1, v0, Lrm2;

    .line 53
    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    check-cast v0, Lrm2;

    .line 58
    .line 59
    iget-wide v3, v0, Lrm2;->o:D

    .line 60
    .line 61
    :goto_1
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Double;->compare(DD)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_2

    .line 66
    .line 67
    iget-wide v0, p1, Lrb3;->b:J

    .line 68
    .line 69
    iget-wide p1, p2, Lrb3;->b:J

    .line 70
    .line 71
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->compare(JJ)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    :cond_2
    return v0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
