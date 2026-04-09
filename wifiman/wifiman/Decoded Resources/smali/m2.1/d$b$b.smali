.class final Lm2/d$b$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm2/d$b;->j(Lmh/l;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lm2/d$b;

.field final synthetic b:Lmh/l;


# direct methods
.method constructor <init>(Lm2/d$b;Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lm2/d$b$b;->a:Lm2/d$b;

    iput-object p2, p0, Lm2/d$b$b;->b:Lmh/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/sqlite/db/SupportSQLiteDatabase;)Ljava/lang/Object;
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm2/d$b$b;->a:Lm2/d$b;

    invoke-static {v0}, Lm2/d$b;->g(Lm2/d$b;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Landroidx/sqlite/db/SupportSQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object p1

    iget-object v0, p0, Lm2/d$b$b;->a:Lm2/d$b;

    invoke-static {v0, p1}, Lm2/d$b;->a(Lm2/d$b;Landroidx/sqlite/db/SupportSQLiteStatement;)V

    iget-object v0, p0, Lm2/d$b$b;->b:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-virtual {p0, p1}, Lm2/d$b$b;->a(Landroidx/sqlite/db/SupportSQLiteDatabase;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
