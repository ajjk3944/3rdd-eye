.class final Lm2/d$a$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm2/d$a;->insert(Ljava/lang/String;ILandroid/content/ContentValues;)J
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:Landroid/content/ContentValues;


# direct methods
.method constructor <init>(Ljava/lang/String;ILandroid/content/ContentValues;)V
    .locals 0

    iput-object p1, p0, Lm2/d$a$d;->a:Ljava/lang/String;

    iput p2, p0, Lm2/d$a$d;->b:I

    iput-object p3, p0, Lm2/d$a$d;->c:Landroid/content/ContentValues;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/sqlite/db/SupportSQLiteDatabase;)Ljava/lang/Long;
    .locals 3

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm2/d$a$d;->a:Ljava/lang/String;

    iget v1, p0, Lm2/d$a$d;->b:I

    iget-object v2, p0, Lm2/d$a$d;->c:Landroid/content/ContentValues;

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/db/SupportSQLiteDatabase;->insert(Ljava/lang/String;ILandroid/content/ContentValues;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-virtual {p0, p1}, Lm2/d$a$d;->a(Landroidx/sqlite/db/SupportSQLiteDatabase;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
