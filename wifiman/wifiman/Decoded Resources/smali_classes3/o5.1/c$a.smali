.class final Lo5/c$a;
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
    name = "a"
.end annotation


# static fields
.field static final a:Lo5/c$a;

.field private static final b:LZ4/b;

.field private static final c:LZ4/b;

.field private static final d:LZ4/b;

.field private static final e:LZ4/b;

.field private static final f:LZ4/b;

.field private static final g:LZ4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo5/c$a;

    invoke-direct {v0}, Lo5/c$a;-><init>()V

    sput-object v0, Lo5/c$a;->a:Lo5/c$a;

    const-string/jumbo v0, "packageName"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$a;->b:LZ4/b;

    const-string/jumbo v0, "versionName"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$a;->c:LZ4/b;

    const-string/jumbo v0, "appBuildVersion"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$a;->d:LZ4/b;

    const-string/jumbo v0, "deviceManufacturer"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$a;->e:LZ4/b;

    const-string/jumbo v0, "currentProcessDetails"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$a;->f:LZ4/b;

    const-string/jumbo v0, "appProcessDetails"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$a;->g:LZ4/b;

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

    check-cast p1, Lo5/a;

    check-cast p2, LZ4/d;

    invoke-virtual {p0, p1, p2}, Lo5/c$a;->b(Lo5/a;LZ4/d;)V

    return-void
.end method

.method public b(Lo5/a;LZ4/d;)V
    .locals 2

    sget-object v0, Lo5/c$a;->b:LZ4/b;

    invoke-virtual {p1}, Lo5/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lo5/c$a;->c:LZ4/b;

    invoke-virtual {p1}, Lo5/a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lo5/c$a;->d:LZ4/b;

    invoke-virtual {p1}, Lo5/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lo5/c$a;->e:LZ4/b;

    invoke-virtual {p1}, Lo5/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lo5/c$a;->f:LZ4/b;

    invoke-virtual {p1}, Lo5/a;->c()Lo5/u;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lo5/c$a;->g:LZ4/b;

    invoke-virtual {p1}, Lo5/a;->b()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    return-void
.end method
