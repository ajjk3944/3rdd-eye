.class LXb/g$k;
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

    iput-object p1, p0, LXb/g$k;->d:LXb/g;

    invoke-direct {p0, p2}, Lm2/h;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "UPDATE OR ABORT `speedTestMeasurement` SET `id` = ?,`resultId` = ?,`speedtest_type` = ?,`latency` = ?,`jitter` = ?,`downloadBits` = ?,`download_bits_history` = ?,`uploadBits` = ?,`upload_bits_history` = ?,`endpoint_type` = ?,`server_ip` = ?,`server_name` = ?,`server_provider` = ?,`server_provider_url` = ?,`server_location_city` = ?,`server_location_country` = ?,`server_product_id` = ?,`server_product_image_engine` = ?,`server_product_image_url` = ?,`server_product` = ?,`server_wifi_experience` = ?,`server_a2a_device_type` = ?,`server_provider_secondary` = ?,`public_ip_provider` = ?,`public_ip_provider_image` = ? WHERE `id` = ?"

    return-object v0
.end method

.method protected bridge synthetic i(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LXb/c;

    invoke-virtual {p0, p1, p2}, LXb/g$k;->l(Landroidx/sqlite/db/SupportSQLiteStatement;LXb/c;)V

    return-void
.end method

.method protected l(Landroidx/sqlite/db/SupportSQLiteStatement;LXb/c;)V
    .locals 4

    invoke-virtual {p2}, LXb/c;->h()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Lr2/g;->bindLong(IJ)V

    const/4 v0, 0x2

    invoke-virtual {p2}, LXb/c;->m()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lr2/g;->bindLong(IJ)V

    const/4 v0, 0x3

    invoke-virtual {p2}, LXb/c;->B()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lr2/g;->bindString(ILjava/lang/String;)V

    invoke-virtual {p2}, LXb/c;->l()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, LXb/c;->l()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_0
    invoke-virtual {p2}, LXb/c;->k()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, LXb/c;->k()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_1
    invoke-virtual {p2}, LXb/c;->d()Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, LXb/c;->d()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_2
    iget-object v0, p0, LXb/g$k;->d:LXb/g;

    invoke-static {v0}, LXb/g;->v(LXb/g;)Lcom/ui/wifiman/db/A;

    move-result-object v0

    invoke-virtual {p2}, LXb/c;->e()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ui/wifiman/db/A;->b(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_3

    :cond_3
    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_3
    invoke-virtual {p2}, LXb/c;->C()Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p2}, LXb/c;->C()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_4
    iget-object v0, p0, LXb/g$k;->d:LXb/g;

    invoke-static {v0}, LXb/g;->v(LXb/g;)Lcom/ui/wifiman/db/A;

    move-result-object v0

    invoke-virtual {p2}, LXb/c;->D()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ui/wifiman/db/A;->b(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x9

    if-nez v0, :cond_5

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_5

    :cond_5
    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_5
    const/16 v0, 0xa

    invoke-virtual {p2}, LXb/c;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lr2/g;->bindString(ILjava/lang/String;)V

    const/16 v0, 0xb

    invoke-virtual {p2}, LXb/c;->o()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lr2/g;->bindString(ILjava/lang/String;)V

    invoke-virtual {p2}, LXb/c;->r()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xc

    if-nez v0, :cond_6

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_6

    :cond_6
    invoke-virtual {p2}, LXb/c;->r()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_6
    invoke-virtual {p2}, LXb/c;->w()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xd

    if-nez v0, :cond_7

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_7

    :cond_7
    invoke-virtual {p2}, LXb/c;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_7
    invoke-virtual {p2}, LXb/c;->x()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xe

    if-nez v0, :cond_8

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_8

    :cond_8
    invoke-virtual {p2}, LXb/c;->x()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_8
    invoke-virtual {p2}, LXb/c;->p()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xf

    if-nez v0, :cond_9

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_9

    :cond_9
    invoke-virtual {p2}, LXb/c;->p()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_9
    invoke-virtual {p2}, LXb/c;->q()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    if-nez v0, :cond_a

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_a

    :cond_a
    invoke-virtual {p2}, LXb/c;->q()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_a
    invoke-virtual {p2}, LXb/c;->t()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x11

    if-nez v0, :cond_b

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_b

    :cond_b
    invoke-virtual {p2}, LXb/c;->t()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_b
    invoke-virtual {p2}, LXb/c;->u()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x12

    if-nez v0, :cond_c

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_c

    :cond_c
    invoke-virtual {p2}, LXb/c;->u()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_c
    invoke-virtual {p2}, LXb/c;->v()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x13

    if-nez v0, :cond_d

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_d

    :cond_d
    invoke-virtual {p2}, LXb/c;->v()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_d
    invoke-virtual {p2}, LXb/c;->s()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x14

    if-nez v0, :cond_e

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_e

    :cond_e
    invoke-virtual {p2}, LXb/c;->s()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_e
    invoke-virtual {p2}, LXb/c;->z()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x15

    if-nez v0, :cond_f

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_f

    :cond_f
    invoke-virtual {p2}, LXb/c;->z()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_f
    invoke-virtual {p2}, LXb/c;->n()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x16

    if-nez v0, :cond_10

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_10

    :cond_10
    invoke-virtual {p2}, LXb/c;->n()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_10
    invoke-virtual {p2}, LXb/c;->y()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x17

    if-nez v0, :cond_11

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_11

    :cond_11
    invoke-virtual {p2}, LXb/c;->y()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_11
    invoke-virtual {p2}, LXb/c;->i()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x18

    if-nez v0, :cond_12

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_12

    :cond_12
    invoke-virtual {p2}, LXb/c;->i()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_12
    invoke-virtual {p2}, LXb/c;->j()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x19

    if-nez v0, :cond_13

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_13

    :cond_13
    invoke-virtual {p2}, LXb/c;->j()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_13
    const/16 v0, 0x1a

    invoke-virtual {p2}, LXb/c;->h()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lr2/g;->bindLong(IJ)V

    return-void
.end method
