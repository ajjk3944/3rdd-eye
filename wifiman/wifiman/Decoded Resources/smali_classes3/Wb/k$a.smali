.class LWb/k$a;
.super Lm2/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWb/k;-><init>(Lm2/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LWb/k;


# direct methods
.method constructor <init>(LWb/k;Lm2/q;)V
    .locals 0

    iput-object p1, p0, LWb/k$a;->d:LWb/k;

    invoke-direct {p0, p2}, Lm2/i;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "INSERT OR ABORT INTO `signalMapperPlaces` (`id`,`name`,`ssid`,`bssid`,`apName`,`apModel`,`signal`,`throughput`,`latency`,`latencyDns`,`packetLoss`,`wifiBand`,`ieeeMode`,`created`,`signalCellSimPrimaryIndex`,`signalCellSim0`,`signalCellSim0Type`,`signalCellSim1`,`signalCellSim1Type`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method

.method protected bridge synthetic i(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LWb/f;

    invoke-virtual {p0, p1, p2}, LWb/k$a;->n(Landroidx/sqlite/db/SupportSQLiteStatement;LWb/f;)V

    return-void
.end method

.method protected n(Landroidx/sqlite/db/SupportSQLiteStatement;LWb/f;)V
    .locals 4

    invoke-virtual {p2}, LWb/f;->f()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Lr2/g;->bindLong(IJ)V

    const/4 v0, 0x2

    invoke-virtual {p2}, LWb/f;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lr2/g;->bindString(ILjava/lang/String;)V

    invoke-virtual {p2}, LWb/f;->r()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, LWb/f;->r()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, LWb/f;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, LWb/f;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, LWb/f;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, LWb/f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, LWb/f;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, LWb/f;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_3
    invoke-virtual {p2}, LWb/f;->p()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p2}, LWb/f;->p()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_4
    invoke-virtual {p2}, LWb/f;->s()Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_5

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p2}, LWb/f;->s()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_5
    invoke-virtual {p2}, LWb/f;->i()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x9

    if-nez v0, :cond_6

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_6

    :cond_6
    invoke-virtual {p2}, LWb/f;->i()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_6
    invoke-virtual {p2}, LWb/f;->e()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0xa

    if-nez v0, :cond_7

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_7

    :cond_7
    invoke-virtual {p2}, LWb/f;->e()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_7
    invoke-virtual {p2}, LWb/f;->k()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0xb

    if-nez v0, :cond_8

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_8

    :cond_8
    invoke-virtual {p2}, LWb/f;->k()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_8
    invoke-virtual {p2}, LWb/f;->u()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xc

    if-nez v0, :cond_9

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_9

    :cond_9
    invoke-virtual {p2}, LWb/f;->u()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_9
    invoke-virtual {p2}, LWb/f;->h()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xd

    if-nez v0, :cond_a

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_a

    :cond_a
    invoke-virtual {p2}, LWb/f;->h()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_a
    const/16 v0, 0xe

    invoke-virtual {p2}, LWb/f;->d()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lr2/g;->bindLong(IJ)V

    invoke-virtual {p2}, LWb/f;->q()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0xf

    if-nez v0, :cond_b

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_b

    :cond_b
    invoke-virtual {p2}, LWb/f;->q()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_b
    invoke-virtual {p2}, LWb/f;->l()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x10

    if-nez v0, :cond_c

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_c

    :cond_c
    invoke-virtual {p2}, LWb/f;->l()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_c
    invoke-virtual {p2}, LWb/f;->m()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x11

    if-nez v0, :cond_d

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_d

    :cond_d
    invoke-virtual {p2}, LWb/f;->m()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_d
    invoke-virtual {p2}, LWb/f;->n()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x12

    if-nez v0, :cond_e

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_e

    :cond_e
    invoke-virtual {p2}, LWb/f;->n()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_e
    invoke-virtual {p2}, LWb/f;->o()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x13

    if-nez v0, :cond_f

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_f

    :cond_f
    invoke-virtual {p2}, LWb/f;->o()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_f
    return-void
.end method
