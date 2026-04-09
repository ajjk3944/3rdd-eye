.class public final synthetic Ls2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/database/DatabaseErrorHandler;


# instance fields
.field public final synthetic a:Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;

.field public final synthetic b:Ls2/d$b;


# direct methods
.method public synthetic constructor <init>(Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;Ls2/d$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls2/e;->a:Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;

    iput-object p2, p0, Ls2/e;->b:Ls2/d$b;

    return-void
.end method


# virtual methods
.method public final onCorruption(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    iget-object v0, p0, Ls2/e;->a:Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;

    iget-object v1, p0, Ls2/e;->b:Ls2/d$b;

    invoke-static {v0, v1, p1}, Ls2/d$c;->a(Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;Ls2/d$b;Landroid/database/sqlite/SQLiteDatabase;)V

    return-void
.end method
