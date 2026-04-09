.class Lbc/b$a;
.super Lm2/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbc/b;-><init>(Lm2/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lbc/b;


# direct methods
.method constructor <init>(Lbc/b;Lm2/q;)V
    .locals 0

    iput-object p1, p0, Lbc/b$a;->d:Lbc/b;

    invoke-direct {p0, p2}, Lm2/i;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "INSERT OR ABORT INTO `wizardState` (`id`,`locationHandled`,`localSpeedtestHandled`,`bluetoothScanHandled`,`notifPermHandled`) VALUES (?,?,?,?,?)"

    return-object v0
.end method

.method protected bridge synthetic i(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lbc/c;

    invoke-virtual {p0, p1, p2}, Lbc/b$a;->n(Landroidx/sqlite/db/SupportSQLiteStatement;Lbc/c;)V

    return-void
.end method

.method protected n(Landroidx/sqlite/db/SupportSQLiteStatement;Lbc/c;)V
    .locals 5

    invoke-virtual {p2}, Lbc/c;->b()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Lr2/g;->bindLong(IJ)V

    invoke-virtual {p2}, Lbc/c;->c()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lbc/c;->c()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    const/4 v2, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, v2}, Lr2/g;->bindNull(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v3, v0

    invoke-interface {p1, v2, v3, v4}, Lr2/g;->bindLong(IJ)V

    :goto_1
    invoke-virtual {p2}, Lbc/c;->e()Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_2

    move-object v0, v1

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lbc/c;->e()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_2
    const/4 v2, 0x3

    if-nez v0, :cond_3

    invoke-interface {p1, v2}, Lr2/g;->bindNull(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v3, v0

    invoke-interface {p1, v2, v3, v4}, Lr2/g;->bindLong(IJ)V

    :goto_3
    invoke-virtual {p2}, Lbc/c;->a()Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_4

    move-object v0, v1

    goto :goto_4

    :cond_4
    invoke-virtual {p2}, Lbc/c;->a()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_4
    const/4 v2, 0x4

    if-nez v0, :cond_5

    invoke-interface {p1, v2}, Lr2/g;->bindNull(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v3, v0

    invoke-interface {p1, v2, v3, v4}, Lr2/g;->bindLong(IJ)V

    :goto_5
    invoke-virtual {p2}, Lbc/c;->d()Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {p2}, Lbc/c;->d()Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_6
    const/4 p2, 0x5

    if-nez v1, :cond_7

    invoke-interface {p1, p2}, Lr2/g;->bindNull(I)V

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    invoke-interface {p1, p2, v0, v1}, Lr2/g;->bindLong(IJ)V

    :goto_7
    return-void
.end method
