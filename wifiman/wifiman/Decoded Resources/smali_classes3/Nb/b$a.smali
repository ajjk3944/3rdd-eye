.class LNb/b$a;
.super Lm2/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNb/b;-><init>(Lm2/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LNb/b;


# direct methods
.method constructor <init>(LNb/b;Lm2/q;)V
    .locals 0

    iput-object p1, p0, LNb/b$a;->d:LNb/b;

    invoke-direct {p0, p2}, Lm2/i;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "INSERT OR REPLACE INTO `directConsoleConnectionPopup` (`consoleId`,`recommended`,`cert`) VALUES (?,?,?)"

    return-object v0
.end method

.method protected bridge synthetic i(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LNb/c;

    invoke-virtual {p0, p1, p2}, LNb/b$a;->n(Landroidx/sqlite/db/SupportSQLiteStatement;LNb/c;)V

    return-void
.end method

.method protected n(Landroidx/sqlite/db/SupportSQLiteStatement;LNb/c;)V
    .locals 4

    invoke-virtual {p2}, LNb/c;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    invoke-virtual {p2}, LNb/c;->c()Z

    move-result v0

    const/4 v1, 0x2

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    iget-object v0, p0, LNb/b$a;->d:LNb/b;

    invoke-static {v0}, LNb/b;->g(LNb/b;)Lcom/ui/wifiman/db/A;

    move-result-object v0

    invoke-virtual {p2}, LNb/c;->a()Ljava/util/List;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/ui/wifiman/db/A;->d(Ljava/util/List;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x3

    if-nez p2, :cond_0

    invoke-interface {p1, v0}, Lr2/g;->bindNull(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v0, p2}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_0
    return-void
.end method
