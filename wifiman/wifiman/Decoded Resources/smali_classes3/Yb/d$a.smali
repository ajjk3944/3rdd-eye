.class LYb/d$a;
.super Lm2/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYb/d;-><init>(Lm2/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LYb/d;


# direct methods
.method constructor <init>(LYb/d;Lm2/q;)V
    .locals 0

    iput-object p1, p0, LYb/d$a;->d:LYb/d;

    invoke-direct {p0, p2}, Lm2/i;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "INSERT OR REPLACE INTO `speedTestServer` (`id`,`city`,`country`,`countryCode`,`latitude`,`longitude`,`provider`,`providerUrl`,`speedMbps`,`url`,`timestamp`,`type`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method

.method protected bridge synthetic i(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LYb/a;

    invoke-virtual {p0, p1, p2}, LYb/d$a;->n(Landroidx/sqlite/db/SupportSQLiteStatement;LYb/a;)V

    return-void
.end method

.method protected n(Landroidx/sqlite/db/SupportSQLiteStatement;LYb/a;)V
    .locals 4

    invoke-virtual {p2}, LYb/a;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    invoke-virtual {p2}, LYb/a;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, LYb/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, LYb/a;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, LYb/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, LYb/a;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, LYb/a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, LYb/a;->e()Ljava/lang/Double;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, LYb/a;->e()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindDouble(ID)V

    :goto_3
    invoke-virtual {p2}, LYb/a;->f()Ljava/lang/Double;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p2}, LYb/a;->f()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindDouble(ID)V

    :goto_4
    invoke-virtual {p2}, LYb/a;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_5

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p2}, LYb/a;->g()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_5
    invoke-virtual {p2}, LYb/a;->h()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_6

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_6

    :cond_6
    invoke-virtual {p2}, LYb/a;->h()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_6
    invoke-virtual {p2}, LYb/a;->i()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x9

    if-nez v0, :cond_7

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_7

    :cond_7
    invoke-virtual {p2}, LYb/a;->i()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_7
    invoke-virtual {p2}, LYb/a;->l()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    if-nez v0, :cond_8

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_8

    :cond_8
    invoke-virtual {p2}, LYb/a;->l()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_8
    const/16 v0, 0xb

    invoke-virtual {p2}, LYb/a;->j()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lr2/g;->bindLong(IJ)V

    const/16 v0, 0xc

    invoke-virtual {p2}, LYb/a;->m()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lr2/g;->bindString(ILjava/lang/String;)V

    return-void
.end method
