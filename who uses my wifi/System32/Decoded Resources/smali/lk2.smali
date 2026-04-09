.class public final synthetic Llk2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Landroid/content/Context;

.field public final synthetic h:Le51;

.field public final synthetic i:La83;

.field public final synthetic j:Ll83;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Le51;La83;Ll83;I)V
    .locals 0

    .line 1
    iput p5, p0, Llk2;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Llk2;->g:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Llk2;->h:Le51;

    .line 6
    .line 7
    iput-object p3, p0, Llk2;->i:La83;

    .line 8
    .line 9
    iput-object p4, p0, Llk2;->j:Ll83;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final e()V
    .locals 5

    .line 1
    iget v0, p0, Llk2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Llk2;->i:La83;

    .line 7
    .line 8
    iget-object v0, v0, La83;->C:Lorg/json/JSONObject;

    .line 9
    .line 10
    sget-object v1, Lhg4;->C:Lhg4;

    .line 11
    .line 12
    iget-object v1, v1, Lhg4;->o:Lus1;

    .line 13
    .line 14
    iget-object v2, p0, Llk2;->h:Le51;

    .line 15
    .line 16
    iget-object v2, v2, Le51;->f:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v3, p0, Llk2;->j:Ll83;

    .line 23
    .line 24
    iget-object v3, v3, Ll83;->g:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v4, p0, Llk2;->g:Landroid/content/Context;

    .line 27
    .line 28
    invoke-virtual {v1, v4, v2, v0, v3}, Lus1;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_0
    iget-object v0, p0, Llk2;->i:La83;

    .line 33
    .line 34
    iget-object v0, v0, La83;->C:Lorg/json/JSONObject;

    .line 35
    .line 36
    sget-object v1, Lhg4;->C:Lhg4;

    .line 37
    .line 38
    iget-object v1, v1, Lhg4;->o:Lus1;

    .line 39
    .line 40
    iget-object v2, p0, Llk2;->h:Le51;

    .line 41
    .line 42
    iget-object v2, v2, Le51;->f:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v3, p0, Llk2;->j:Ll83;

    .line 49
    .line 50
    iget-object v3, v3, Ll83;->g:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v4, p0, Llk2;->g:Landroid/content/Context;

    .line 53
    .line 54
    invoke-virtual {v1, v4, v2, v0, v3}, Lus1;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
