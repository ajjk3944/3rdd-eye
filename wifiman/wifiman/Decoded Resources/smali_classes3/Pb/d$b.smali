.class LPb/d$b;
.super Lm2/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPb/d;-><init>(Lm2/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LPb/d;


# direct methods
.method constructor <init>(LPb/d;Lm2/q;)V
    .locals 0

    iput-object p1, p0, LPb/d$b;->d:LPb/d;

    invoke-direct {p0, p2}, Lm2/h;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "UPDATE OR ABORT `discoveryHome` SET `id` = ?,`tab` = ? WHERE `id` = ?"

    return-object v0
.end method

.method protected bridge synthetic i(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LPb/h;

    invoke-virtual {p0, p1, p2}, LPb/d$b;->l(Landroidx/sqlite/db/SupportSQLiteStatement;LPb/h;)V

    return-void
.end method

.method protected l(Landroidx/sqlite/db/SupportSQLiteStatement;LPb/h;)V
    .locals 3

    invoke-virtual {p2}, LPb/h;->a()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Lr2/g;->bindLong(IJ)V

    const/4 v0, 0x2

    invoke-virtual {p2}, LPb/h;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lr2/g;->bindString(ILjava/lang/String;)V

    invoke-virtual {p2}, LPb/h;->a()I

    move-result p2

    int-to-long v0, p2

    const/4 p2, 0x3

    invoke-interface {p1, p2, v0, v1}, Lr2/g;->bindLong(IJ)V

    return-void
.end method
