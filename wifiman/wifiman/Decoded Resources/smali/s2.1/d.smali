.class public final Ls2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/sqlite/db/SupportSQLiteOpenHelper;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls2/d$a;,
        Ls2/d$b;,
        Ls2/d$c;
    }
.end annotation


# static fields
.field public static final h:Ls2/d$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private final c:Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;

.field private final d:Z

.field private final e:Z

.field private final f:LYg/m;

.field private g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls2/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls2/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ls2/d;->h:Ls2/d$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;ZZ)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls2/d;->a:Landroid/content/Context;

    iput-object p2, p0, Ls2/d;->b:Ljava/lang/String;

    iput-object p3, p0, Ls2/d;->c:Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;

    iput-boolean p4, p0, Ls2/d;->d:Z

    iput-boolean p5, p0, Ls2/d;->e:Z

    new-instance p1, Ls2/d$d;

    invoke-direct {p1, p0}, Ls2/d$d;-><init>(Ls2/d;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Ls2/d;->f:LYg/m;

    return-void
.end method

.method public static final synthetic a(Ls2/d;)Z
    .locals 0

    iget-boolean p0, p0, Ls2/d;->e:Z

    return p0
.end method

.method public static final synthetic g(Ls2/d;)Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;
    .locals 0

    iget-object p0, p0, Ls2/d;->c:Landroidx/sqlite/db/SupportSQLiteOpenHelper$a;

    return-object p0
.end method

.method public static final synthetic h(Ls2/d;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Ls2/d;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic j(Ls2/d;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ls2/d;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic p(Ls2/d;)Z
    .locals 0

    iget-boolean p0, p0, Ls2/d;->d:Z

    return p0
.end method

.method public static final synthetic s(Ls2/d;)Z
    .locals 0

    iget-boolean p0, p0, Ls2/d;->g:Z

    return p0
.end method

.method private final v()Ls2/d$c;
    .locals 1

    iget-object v0, p0, Ls2/d;->f:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls2/d$c;

    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, Ls2/d;->f:LYg/m;

    invoke-interface {v0}, LYg/m;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Ls2/d;->v()Ls2/d$c;

    move-result-object v0

    invoke-virtual {v0}, Ls2/d$c;->close()V

    :cond_0
    return-void
.end method

.method public getDatabaseName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls2/d;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;
    .locals 2

    invoke-direct {p0}, Ls2/d;->v()Ls2/d$c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ls2/d$c;->h(Z)Landroidx/sqlite/db/SupportSQLiteDatabase;

    move-result-object v0

    return-object v0
.end method

.method public setWriteAheadLoggingEnabled(Z)V
    .locals 1

    iget-object v0, p0, Ls2/d;->f:LYg/m;

    invoke-interface {v0}, LYg/m;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Ls2/d;->v()Ls2/d$c;

    move-result-object v0

    invoke-static {v0, p1}, Lr2/b;->d(Landroid/database/sqlite/SQLiteOpenHelper;Z)V

    :cond_0
    iput-boolean p1, p0, Ls2/d;->g:Z

    return-void
.end method
