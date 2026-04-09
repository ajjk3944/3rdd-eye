.class Lac/d$a;
.super Lm2/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lac/d;-><init>(Lm2/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lac/d;


# direct methods
.method constructor <init>(Lac/d;Lm2/q;)V
    .locals 0

    iput-object p1, p0, Lac/d$a;->d:Lac/d;

    invoke-direct {p0, p2}, Lm2/i;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "INSERT OR ABORT INTO `teleportWizardState` (`id`,`dataCollectionApproved`,`consoleSelectedId`,`tunnelPrimaryId`) VALUES (?,?,?,?)"

    return-object v0
.end method

.method protected bridge synthetic i(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lac/a;

    invoke-virtual {p0, p1, p2}, Lac/d$a;->n(Landroidx/sqlite/db/SupportSQLiteStatement;Lac/a;)V

    return-void
.end method

.method protected n(Landroidx/sqlite/db/SupportSQLiteStatement;Lac/a;)V
    .locals 4

    invoke-virtual {p2}, Lac/a;->e()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Lr2/g;->bindLong(IJ)V

    invoke-virtual {p2}, Lac/a;->d()Z

    move-result v0

    const/4 v1, 0x2

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    invoke-virtual {p2}, Lac/a;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lac/a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lac/a;->f()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lac/a;->f()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_1
    return-void
.end method
