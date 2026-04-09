.class LXb/g$j;
.super Lm2/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LXb/g;-><init>(Lm2/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LXb/g;


# direct methods
.method constructor <init>(LXb/g;Lm2/q;)V
    .locals 0

    iput-object p1, p0, LXb/g$j;->d:LXb/g;

    invoke-direct {p0, p2}, Lm2/h;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "UPDATE OR ABORT `speedTestEnv` SET `resultId` = ?,`connection_type` = ?,`ssid` = ?,`topology` = ?,`ap_name` = ?,`wifi_mode` = ?,`signal` = ?,`signalAP` = ?,`band_id` = ?,`channel` = ?,`channel_width` = ?,`rate_download` = ?,`rate_upload` = ?,`wifi_experience` = ?,`dns_servers` = ? WHERE `resultId` = ?"

    return-object v0
.end method

.method protected bridge synthetic i(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LXb/a;

    invoke-virtual {p0, p1, p2}, LXb/g$j;->l(Landroidx/sqlite/db/SupportSQLiteStatement;LXb/a;)V

    return-void
.end method

.method protected l(Landroidx/sqlite/db/SupportSQLiteStatement;LXb/a;)V
    .locals 4

    invoke-virtual {p2}, LXb/a;->m()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Lr2/g;->bindLong(IJ)V

    invoke-virtual {p2}, LXb/a;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, LXb/a;->g()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, LXb/a;->p()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, LXb/a;->p()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, LXb/a;->q()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, LXb/a;->q()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, LXb/a;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, LXb/a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_3
    invoke-virtual {p2}, LXb/a;->u()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p2}, LXb/a;->u()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_4
    invoke-virtual {p2}, LXb/a;->n()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_5

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p2}, LXb/a;->n()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_5
    invoke-virtual {p2}, LXb/a;->o()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_6

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_6

    :cond_6
    invoke-virtual {p2}, LXb/a;->o()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_6
    invoke-virtual {p2}, LXb/a;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x9

    if-nez v0, :cond_7

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_7

    :cond_7
    invoke-virtual {p2}, LXb/a;->d()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_7
    invoke-virtual {p2}, LXb/a;->e()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0xa

    if-nez v0, :cond_8

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_8

    :cond_8
    invoke-virtual {p2}, LXb/a;->e()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_8
    invoke-virtual {p2}, LXb/a;->f()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xb

    if-nez v0, :cond_9

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_9

    :cond_9
    invoke-virtual {p2}, LXb/a;->f()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_9
    invoke-virtual {p2}, LXb/a;->k()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0xc

    if-nez v0, :cond_a

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_a

    :cond_a
    invoke-virtual {p2}, LXb/a;->k()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_a
    invoke-virtual {p2}, LXb/a;->l()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0xd

    if-nez v0, :cond_b

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_b

    :cond_b
    invoke-virtual {p2}, LXb/a;->l()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_b
    invoke-virtual {p2}, LXb/a;->t()Ljava/lang/Float;

    move-result-object v0

    const/16 v1, 0xe

    if-nez v0, :cond_c

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_c

    :cond_c
    invoke-virtual {p2}, LXb/a;->t()Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    float-to-double v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindDouble(ID)V

    :goto_c
    iget-object v0, p0, LXb/g$j;->d:LXb/g;

    invoke-static {v0}, LXb/g;->v(LXb/g;)Lcom/ui/wifiman/db/A;

    move-result-object v0

    invoke-virtual {p2}, LXb/a;->h()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ui/wifiman/db/A;->d(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xf

    if-nez v0, :cond_d

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_d

    :cond_d
    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_d
    const/16 v0, 0x10

    invoke-virtual {p2}, LXb/a;->m()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lr2/g;->bindLong(IJ)V

    return-void
.end method
