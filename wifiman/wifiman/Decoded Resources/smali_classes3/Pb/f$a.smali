.class LPb/f$a;
.super Lm2/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPb/f;-><init>(Lm2/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LPb/f;


# direct methods
.method constructor <init>(LPb/f;Lm2/q;)V
    .locals 0

    iput-object p1, p0, LPb/f$a;->d:LPb/f;

    invoke-direct {p0, p2}, Lm2/i;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "INSERT OR ABORT INTO `discoveryListUiState` (`id`,`sortType`,`favoritesOnTop`,`ubiquitiOnTop`) VALUES (?,?,?,?)"

    return-object v0
.end method

.method protected bridge synthetic i(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LPb/i;

    invoke-virtual {p0, p1, p2}, LPb/f$a;->n(Landroidx/sqlite/db/SupportSQLiteStatement;LPb/i;)V

    return-void
.end method

.method protected n(Landroidx/sqlite/db/SupportSQLiteStatement;LPb/i;)V
    .locals 4

    invoke-virtual {p2}, LPb/i;->b()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Lr2/g;->bindLong(IJ)V

    const/4 v0, 0x2

    invoke-virtual {p2}, LPb/i;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lr2/g;->bindString(ILjava/lang/String;)V

    invoke-virtual {p2}, LPb/i;->a()Z

    move-result v0

    const/4 v1, 0x3

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    invoke-virtual {p2}, LPb/i;->e()Z

    move-result p2

    const/4 v0, 0x4

    int-to-long v1, p2

    invoke-interface {p1, v0, v1, v2}, Lr2/g;->bindLong(IJ)V

    return-void
.end method
