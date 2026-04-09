.class LNb/f$a;
.super Lm2/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNb/f;-><init>(Lm2/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LNb/f;


# direct methods
.method constructor <init>(LNb/f;Lm2/q;)V
    .locals 0

    iput-object p1, p0, LNb/f$a;->d:LNb/f;

    invoke-direct {p0, p2}, Lm2/i;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "INSERT OR ABORT INTO `cloudConsoles` (`id`,`ssoAccountId`,`fw`,`name`,`mac`,`locLon`,`locLat`,`locText`,`available`,`model`,`product`,`owner`,`network_version`,`network_teleportAvailability`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method

.method protected bridge synthetic i(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LNb/d;

    invoke-virtual {p0, p1, p2}, LNb/f$a;->n(Landroidx/sqlite/db/SupportSQLiteStatement;LNb/d;)V

    return-void
.end method

.method protected n(Landroidx/sqlite/db/SupportSQLiteStatement;LNb/d;)V
    .locals 5

    invoke-virtual {p2}, LNb/d;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    const/4 v0, 0x2

    invoke-virtual {p2}, LNb/d;->m()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lr2/g;->bindString(ILjava/lang/String;)V

    invoke-virtual {p2}, LNb/d;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, LNb/d;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, LNb/d;->i()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, LNb/d;->i()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, LNb/d;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, LNb/d;->g()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, LNb/d;->e()Ljava/lang/Float;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, LNb/d;->e()Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    float-to-double v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindDouble(ID)V

    :goto_3
    invoke-virtual {p2}, LNb/d;->d()Ljava/lang/Float;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p2}, LNb/d;->d()Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    float-to-double v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindDouble(ID)V

    :goto_4
    invoke-virtual {p2}, LNb/d;->f()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_5

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p2}, LNb/d;->f()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_5
    invoke-virtual {p2}, LNb/d;->a()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_6

    move-object v0, v1

    goto :goto_6

    :cond_6
    invoke-virtual {p2}, LNb/d;->a()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_6
    const/16 v2, 0x9

    if-nez v0, :cond_7

    invoke-interface {p1, v2}, Lr2/g;->bindNull(I)V

    goto :goto_7

    :cond_7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v3, v0

    invoke-interface {p1, v2, v3, v4}, Lr2/g;->bindLong(IJ)V

    :goto_7
    invoke-virtual {p2}, LNb/d;->h()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0xa

    if-nez v0, :cond_8

    invoke-interface {p1, v2}, Lr2/g;->bindNull(I)V

    goto :goto_8

    :cond_8
    invoke-virtual {p2}, LNb/d;->h()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_8
    invoke-virtual {p2}, LNb/d;->l()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0xb

    if-nez v0, :cond_9

    invoke-interface {p1, v2}, Lr2/g;->bindNull(I)V

    goto :goto_9

    :cond_9
    invoke-virtual {p2}, LNb/d;->l()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_9
    invoke-virtual {p2}, LNb/d;->n()Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_a

    goto :goto_a

    :cond_a
    invoke-virtual {p2}, LNb/d;->n()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_a
    const/16 v0, 0xc

    if-nez v1, :cond_b

    invoke-interface {p1, v0}, Lr2/g;->bindNull(I)V

    goto :goto_b

    :cond_b
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v1, v1

    invoke-interface {p1, v0, v1, v2}, Lr2/g;->bindLong(IJ)V

    :goto_b
    invoke-virtual {p2}, LNb/d;->k()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xd

    if-nez v0, :cond_c

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_c

    :cond_c
    invoke-virtual {p2}, LNb/d;->k()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_c
    invoke-virtual {p2}, LNb/d;->j()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xe

    if-nez v0, :cond_d

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_d

    :cond_d
    invoke-virtual {p2}, LNb/d;->j()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_d
    return-void
.end method
