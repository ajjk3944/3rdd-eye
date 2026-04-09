.class LMb/b$a;
.super Lm2/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMb/b;-><init>(Lm2/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LMb/b;


# direct methods
.method constructor <init>(LMb/b;Lm2/q;)V
    .locals 0

    iput-object p1, p0, LMb/b$a;->d:LMb/b;

    invoke-direct {p0, p2}, Lm2/i;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "INSERT OR ABORT INTO `appReviewState` (`id`,`appLaunchedInDays`,`lastAppLaunchedTimestamp`,`appReviewFlowDisplayed`) VALUES (?,?,?,?)"

    return-object v0
.end method

.method protected bridge synthetic i(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LMb/c;

    invoke-virtual {p0, p1, p2}, LMb/b$a;->n(Landroidx/sqlite/db/SupportSQLiteStatement;LMb/c;)V

    return-void
.end method

.method protected n(Landroidx/sqlite/db/SupportSQLiteStatement;LMb/c;)V
    .locals 4

    invoke-virtual {p2}, LMb/c;->e()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Lr2/g;->bindLong(IJ)V

    invoke-virtual {p2}, LMb/c;->c()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x2

    invoke-interface {p1, v2, v0, v1}, Lr2/g;->bindLong(IJ)V

    invoke-virtual {p2}, LMb/c;->f()Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, LMb/c;->f()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    :goto_0
    invoke-virtual {p2}, LMb/c;->d()Z

    move-result p2

    const/4 v0, 0x4

    int-to-long v1, p2

    invoke-interface {p1, v0, v1, v2}, Lr2/g;->bindLong(IJ)V

    return-void
.end method
