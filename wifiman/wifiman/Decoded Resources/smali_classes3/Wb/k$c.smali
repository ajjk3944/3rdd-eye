.class LWb/k$c;
.super Lm2/h;
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

    iput-object p1, p0, LWb/k$c;->d:LWb/k;

    invoke-direct {p0, p2}, Lm2/h;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "UPDATE OR ABORT `signalMapperPlaceName` SET `name` = ?,`created` = ? WHERE `name` = ?"

    return-object v0
.end method

.method protected bridge synthetic i(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LWb/g;

    invoke-virtual {p0, p1, p2}, LWb/k$c;->l(Landroidx/sqlite/db/SupportSQLiteStatement;LWb/g;)V

    return-void
.end method

.method protected l(Landroidx/sqlite/db/SupportSQLiteStatement;LWb/g;)V
    .locals 3

    invoke-virtual {p2}, LWb/g;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    const/4 v0, 0x2

    invoke-virtual {p2}, LWb/g;->a()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lr2/g;->bindLong(IJ)V

    const/4 v0, 0x3

    invoke-virtual {p2}, LWb/g;->b()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lr2/g;->bindString(ILjava/lang/String;)V

    return-void
.end method
