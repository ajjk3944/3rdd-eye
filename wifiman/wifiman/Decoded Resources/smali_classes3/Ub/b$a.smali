.class LUb/b$a;
.super Lm2/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUb/b;-><init>(Lm2/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LUb/b;


# direct methods
.method constructor <init>(LUb/b;Lm2/q;)V
    .locals 0

    iput-object p1, p0, LUb/b$a;->d:LUb/b;

    invoke-direct {p0, p2}, Lm2/i;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "INSERT OR ABORT INTO `session` (`id`,`sessionID`) VALUES (?,?)"

    return-object v0
.end method

.method protected bridge synthetic i(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LUb/c;

    invoke-virtual {p0, p1, p2}, LUb/b$a;->n(Landroidx/sqlite/db/SupportSQLiteStatement;LUb/c;)V

    return-void
.end method

.method protected n(Landroidx/sqlite/db/SupportSQLiteStatement;LUb/c;)V
    .locals 3

    invoke-virtual {p2}, LUb/c;->a()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Lr2/g;->bindLong(IJ)V

    const/4 v0, 0x2

    invoke-virtual {p2}, LUb/c;->b()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lr2/g;->bindString(ILjava/lang/String;)V

    return-void
.end method
