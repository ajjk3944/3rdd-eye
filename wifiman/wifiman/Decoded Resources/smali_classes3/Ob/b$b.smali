.class LOb/b$b;
.super Lm2/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOb/b;-><init>(Lm2/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LOb/b;


# direct methods
.method constructor <init>(LOb/b;Lm2/q;)V
    .locals 0

    iput-object p1, p0, LOb/b$b;->d:LOb/b;

    invoke-direct {p0, p2}, Lm2/h;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "UPDATE OR ABORT `deviceInformation` SET `hwAddrId` = ?,`mac` = ?,`favorite` = ?,`customName` = ?,`updated` = ? WHERE `hwAddrId` = ?"

    return-object v0
.end method

.method protected bridge synthetic i(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LOb/c;

    invoke-virtual {p0, p1, p2}, LOb/b$b;->l(Landroidx/sqlite/db/SupportSQLiteStatement;LOb/c;)V

    return-void
.end method

.method protected l(Landroidx/sqlite/db/SupportSQLiteStatement;LOb/c;)V
    .locals 4

    invoke-virtual {p2}, LOb/c;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    const/4 v0, 0x2

    invoke-virtual {p2}, LOb/c;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lr2/g;->bindString(ILjava/lang/String;)V

    invoke-virtual {p2}, LOb/c;->b()Z

    move-result v0

    const/4 v1, 0x3

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lr2/g;->bindLong(IJ)V

    invoke-virtual {p2}, LOb/c;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lr2/g;->bindNull(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, LOb/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lr2/g;->bindString(ILjava/lang/String;)V

    :goto_0
    const/4 v0, 0x5

    invoke-virtual {p2}, LOb/c;->e()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lr2/g;->bindLong(IJ)V

    const/4 v0, 0x6

    invoke-virtual {p2}, LOb/c;->c()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lr2/g;->bindString(ILjava/lang/String;)V

    return-void
.end method
