.class final Lo5/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ4/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# static fields
.field static final a:Lo5/c$d;

.field private static final b:LZ4/b;

.field private static final c:LZ4/b;

.field private static final d:LZ4/b;

.field private static final e:LZ4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo5/c$d;

    invoke-direct {v0}, Lo5/c$d;-><init>()V

    sput-object v0, Lo5/c$d;->a:Lo5/c$d;

    const-string/jumbo v0, "processName"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$d;->b:LZ4/b;

    const-string/jumbo v0, "pid"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$d;->c:LZ4/b;

    const-string/jumbo v0, "importance"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$d;->d:LZ4/b;

    const-string/jumbo v0, "defaultProcess"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$d;->e:LZ4/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lo5/u;

    check-cast p2, LZ4/d;

    invoke-virtual {p0, p1, p2}, Lo5/c$d;->b(Lo5/u;LZ4/d;)V

    return-void
.end method

.method public b(Lo5/u;LZ4/d;)V
    .locals 2

    sget-object v0, Lo5/c$d;->b:LZ4/b;

    invoke-virtual {p1}, Lo5/u;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lo5/c$d;->c:LZ4/b;

    invoke-virtual {p1}, Lo5/u;->b()I

    move-result v1

    invoke-interface {p2, v0, v1}, LZ4/d;->d(LZ4/b;I)LZ4/d;

    sget-object v0, Lo5/c$d;->d:LZ4/b;

    invoke-virtual {p1}, Lo5/u;->a()I

    move-result v1

    invoke-interface {p2, v0, v1}, LZ4/d;->d(LZ4/b;I)LZ4/d;

    sget-object v0, Lo5/c$d;->e:LZ4/b;

    invoke-virtual {p1}, Lo5/u;->d()Z

    move-result p1

    invoke-interface {p2, v0, p1}, LZ4/d;->f(LZ4/b;Z)LZ4/d;

    return-void
.end method
