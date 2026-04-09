.class public final Lbs0;
.super Lue0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic l:I

.field public final m:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    iput p1, p0, Lbs0;->l:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p1, "SVCB/HTTPS Parameters"

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    invoke-direct {p0, p1, v0}, Lue0;-><init>(Ljava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    const-string p1, "key"

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lue0;->g(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const p1, 0xffff

    .line 18
    .line 19
    .line 20
    iput p1, p0, Lue0;->i:I

    .line 21
    .line 22
    new-instance p1, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lbs0;->m:Ljava/util/HashMap;

    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    const-string p1, "Type"

    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    invoke-direct {p0, p1, v0}, Lue0;-><init>(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    const-string p1, "TYPE"

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lue0;->g(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const p1, 0xffff

    .line 42
    .line 43
    .line 44
    iput p1, p0, Lue0;->i:I

    .line 45
    .line 46
    new-instance p1, Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lbs0;->m:Ljava/util/HashMap;

    .line 52
    .line 53
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public d(I)V
    .locals 1

    .line 1
    iget v0, p0, Lbs0;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lue0;->d(I)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-static {p1}, Lk31;->a(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(ILjava/lang/String;Ljava/util/function/Supplier;)V
    .locals 1

    .line 1
    iget v0, p0, Lbs0;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p2, p1}, Lue0;->b(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lbs0;->m:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p2, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lue0;->b(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    iget-object p2, p0, Lbs0;->m:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p2, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
