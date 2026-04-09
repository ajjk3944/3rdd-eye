.class public final synthetic Ltb4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lvb4;

.field public final synthetic h:Landroid/util/Pair;

.field public final synthetic i:Lch4;

.field public final synthetic j:Lhh4;


# direct methods
.method public synthetic constructor <init>(Lvb4;Landroid/util/Pair;Lch4;Lhh4;I)V
    .locals 0

    .line 1
    iput p5, p0, Ltb4;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Ltb4;->g:Lvb4;

    .line 4
    .line 5
    iput-object p2, p0, Ltb4;->h:Landroid/util/Pair;

    .line 6
    .line 7
    iput-object p3, p0, Ltb4;->i:Lch4;

    .line 8
    .line 9
    iput-object p4, p0, Ltb4;->j:Lhh4;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 5

    .line 1
    iget v0, p0, Ltb4;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ltb4;->h:Landroid/util/Pair;

    .line 7
    .line 8
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lkh4;

    .line 19
    .line 20
    iget-object v2, p0, Ltb4;->g:Lvb4;

    .line 21
    .line 22
    iget-object v2, v2, Lvb4;->g:Luu0;

    .line 23
    .line 24
    iget-object v2, v2, Luu0;->n:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Lmd4;

    .line 27
    .line 28
    iget-object v3, p0, Ltb4;->i:Lch4;

    .line 29
    .line 30
    iget-object v4, p0, Ltb4;->j:Lhh4;

    .line 31
    .line 32
    invoke-virtual {v2, v1, v0, v3, v4}, Lmd4;->j(ILkh4;Lch4;Lhh4;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_0
    iget-object v0, p0, Ltb4;->h:Landroid/util/Pair;

    .line 37
    .line 38
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lkh4;

    .line 49
    .line 50
    iget-object v2, p0, Ltb4;->g:Lvb4;

    .line 51
    .line 52
    iget-object v2, v2, Lvb4;->g:Luu0;

    .line 53
    .line 54
    iget-object v2, v2, Luu0;->n:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, Lmd4;

    .line 57
    .line 58
    iget-object v3, p0, Ltb4;->i:Lch4;

    .line 59
    .line 60
    iget-object v4, p0, Ltb4;->j:Lhh4;

    .line 61
    .line 62
    invoke-virtual {v2, v1, v0, v3, v4}, Lmd4;->r(ILkh4;Lch4;Lhh4;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
