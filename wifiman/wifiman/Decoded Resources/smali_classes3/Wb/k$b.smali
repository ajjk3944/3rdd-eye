.class LWb/k$b;
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

    iput-object p1, p0, LWb/k$b;->d:LWb/k;

    invoke-direct {p0, p2}, Lm2/i;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "INSERT OR ABORT INTO `signalMapperPlaceName` (`name`,`created`) VALUES (?,?)"

    return-object v0
.end method

.method protected bridge synthetic i(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LWb/g;

    invoke-virtual {p0, p1, p2}, LWb/k$b;->n(Landroidx/sqlite/db/SupportSQLiteStatement;LWb/g;)V

    return-void
.end method

.method protected n(Landroidx/sqlite/db/SupportSQLiteStatement;LWb/g;)V
    .locals 3

    invoke-virtual {p2}, LWb/g;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    const/4 v0, 0x2

    invoke-virtual {p2}, LWb/g;->a()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lr2/g;->bindLong(IJ)V

    return-void
.end method
