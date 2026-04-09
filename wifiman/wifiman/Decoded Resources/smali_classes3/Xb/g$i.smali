.class LXb/g$i;
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

    iput-object p1, p0, LXb/g$i;->d:LXb/g;

    invoke-direct {p0, p2}, Lm2/h;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "UPDATE OR ABORT `speedTestId` SET `id` = ?,`serverId` = ?,`unifiControllerId` = ?,`timestamp` = ? WHERE `id` = ?"

    return-object v0
.end method

.method protected bridge synthetic i(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LXb/b;

    invoke-virtual {p0, p1, p2}, LXb/g$i;->l(Landroidx/sqlite/db/SupportSQLiteStatement;LXb/b;)V

    return-void
.end method

.method protected l(Landroidx/sqlite/db/SupportSQLiteStatement;LXb/b;)V
    .locals 3

    invoke-virtual {p2}, LXb/b;->d()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Lr2/g;->bindLong(IJ)V

    invoke-virtual {p2}, LXb/b;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, LXb/b;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, LXb/b;->f()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, LXb/b;->f()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_1
    const/4 v0, 0x4

    invoke-virtual {p2}, LXb/b;->e()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lr2/g;->bindLong(IJ)V

    const/4 v0, 0x5

    invoke-virtual {p2}, LXb/b;->d()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lr2/g;->bindLong(IJ)V

    return-void
.end method
