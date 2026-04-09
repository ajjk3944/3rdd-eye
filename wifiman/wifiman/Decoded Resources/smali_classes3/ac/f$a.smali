.class Lac/f$a;
.super Lm2/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lac/f;-><init>(Lm2/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lac/f;


# direct methods
.method constructor <init>(Lac/f;Lm2/q;)V
    .locals 0

    iput-object p1, p0, Lac/f$a;->d:Lac/f;

    invoke-direct {p0, p2}, Lm2/i;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "INSERT OR REPLACE INTO `console` (`id`,`consoleId`,`ssoAccountId`,`publicSecret`,`name`,`network_name`,`wanIp`,`sku`,`imageId`,`imageIdStr`,`imageEngine`,`latitude`,`longitude`,`location_text`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method

.method protected bridge synthetic i(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lac/b;

    invoke-virtual {p0, p1, p2}, Lac/f$a;->n(Landroidx/sqlite/db/SupportSQLiteStatement;Lac/b;)V

    return-void
.end method

.method protected n(Landroidx/sqlite/db/SupportSQLiteStatement;Lac/b;)V
    .locals 4

    invoke-virtual {p2}, Lac/b;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    const/4 v0, 0x2

    invoke-virtual {p2}, Lac/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lr2/g;->bindString(ILjava/lang/String;)V

    invoke-virtual {p2}, Lac/b;->m()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lac/b;->m()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lac/b;->l()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lac/b;->l()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_1
    const/4 v0, 0x5

    invoke-virtual {p2}, Lac/b;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lr2/g;->bindString(ILjava/lang/String;)V

    invoke-virtual {p2}, Lac/b;->j()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lac/b;->j()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lac/b;->n()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, Lac/b;->n()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_3
    invoke-virtual {p2}, Lac/b;->k()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p2}, Lac/b;->k()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_4
    invoke-virtual {p2}, Lac/b;->d()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x9

    if-nez v0, :cond_5

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p2}, Lac/b;->d()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_5
    invoke-virtual {p2}, Lac/b;->e()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    if-nez v0, :cond_6

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_6

    :cond_6
    invoke-virtual {p2}, Lac/b;->e()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_6
    invoke-virtual {p2}, Lac/b;->c()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0xb

    if-nez v0, :cond_7

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_7

    :cond_7
    invoke-virtual {p2}, Lac/b;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_7
    invoke-virtual {p2}, Lac/b;->f()Ljava/lang/Double;

    move-result-object v0

    const/16 v1, 0xc

    if-nez v0, :cond_8

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_8

    :cond_8
    invoke-virtual {p2}, Lac/b;->f()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindDouble(ID)V

    :goto_8
    invoke-virtual {p2}, Lac/b;->h()Ljava/lang/Double;

    move-result-object v0

    const/16 v1, 0xd

    if-nez v0, :cond_9

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_9

    :cond_9
    invoke-virtual {p2}, Lac/b;->h()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindDouble(ID)V

    :goto_9
    invoke-virtual {p2}, Lac/b;->g()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xe

    if-nez v0, :cond_a

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_a

    :cond_a
    invoke-virtual {p2}, Lac/b;->g()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_a
    return-void
.end method
