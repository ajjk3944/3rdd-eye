.class LYb/d$b;
.super Lm2/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYb/d;-><init>(Lm2/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LYb/d;


# direct methods
.method constructor <init>(LYb/d;Lm2/q;)V
    .locals 0

    iput-object p1, p0, LYb/d$b;->d:LYb/d;

    invoke-direct {p0, p2}, Lm2/h;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM `speedTestServer` WHERE `id` = ?"

    return-object v0
.end method

.method protected bridge synthetic i(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LYb/a;

    invoke-virtual {p0, p1, p2}, LYb/d$b;->l(Landroidx/sqlite/db/SupportSQLiteStatement;LYb/a;)V

    return-void
.end method

.method protected l(Landroidx/sqlite/db/SupportSQLiteStatement;LYb/a;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p2}, LYb/a;->d()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lr2/g;->bindString(ILjava/lang/String;)V

    return-void
.end method
