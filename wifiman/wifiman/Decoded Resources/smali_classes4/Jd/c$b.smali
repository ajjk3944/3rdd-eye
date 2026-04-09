.class LJd/c$b;
.super Lm2/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJd/c;-><init>(Lm2/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LJd/c;


# direct methods
.method constructor <init>(LJd/c;Lm2/q;)V
    .locals 0

    iput-object p1, p0, LJd/c$b;->d:LJd/c;

    invoke-direct {p0, p2}, Lm2/h;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE OR ABORT `config` SET `id` = ?,`cloudToken` = ?,`cloudSecret` = ?,`key` = ? WHERE `id` = ?"

    return-object v0
.end method

.method protected bridge synthetic i(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LJd/a;

    invoke-virtual {p0, p1, p2}, LJd/c$b;->l(Landroidx/sqlite/db/SupportSQLiteStatement;LJd/a;)V

    return-void
.end method

.method protected l(Landroidx/sqlite/db/SupportSQLiteStatement;LJd/a;)V
    .locals 3

    invoke-virtual {p2}, LJd/a;->c()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Lr2/g;->bindLong(IJ)V

    const/4 v0, 0x2

    invoke-virtual {p2}, LJd/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lr2/g;->bindString(ILjava/lang/String;)V

    const/4 v0, 0x3

    invoke-virtual {p2}, LJd/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lr2/g;->bindString(ILjava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p2}, LJd/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lr2/g;->bindString(ILjava/lang/String;)V

    const/4 v0, 0x5

    invoke-virtual {p2}, LJd/a;->c()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lr2/g;->bindLong(IJ)V

    return-void
.end method
