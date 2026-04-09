.class final Lo5/c$b;
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
    name = "b"
.end annotation


# static fields
.field static final a:Lo5/c$b;

.field private static final b:LZ4/b;

.field private static final c:LZ4/b;

.field private static final d:LZ4/b;

.field private static final e:LZ4/b;

.field private static final f:LZ4/b;

.field private static final g:LZ4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo5/c$b;

    invoke-direct {v0}, Lo5/c$b;-><init>()V

    sput-object v0, Lo5/c$b;->a:Lo5/c$b;

    const-string/jumbo v0, "appId"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$b;->b:LZ4/b;

    const-string/jumbo v0, "deviceModel"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$b;->c:LZ4/b;

    const-string/jumbo v0, "sessionSdkVersion"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$b;->d:LZ4/b;

    const-string/jumbo v0, "osVersion"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$b;->e:LZ4/b;

    const-string/jumbo v0, "logEnvironment"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$b;->f:LZ4/b;

    const-string/jumbo v0, "androidAppInfo"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$b;->g:LZ4/b;

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

    check-cast p1, Lo5/b;

    check-cast p2, LZ4/d;

    invoke-virtual {p0, p1, p2}, Lo5/c$b;->b(Lo5/b;LZ4/d;)V

    return-void
.end method

.method public b(Lo5/b;LZ4/d;)V
    .locals 2

    sget-object v0, Lo5/c$b;->b:LZ4/b;

    invoke-virtual {p1}, Lo5/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lo5/c$b;->c:LZ4/b;

    invoke-virtual {p1}, Lo5/b;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lo5/c$b;->d:LZ4/b;

    invoke-virtual {p1}, Lo5/b;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lo5/c$b;->e:LZ4/b;

    invoke-virtual {p1}, Lo5/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lo5/c$b;->f:LZ4/b;

    invoke-virtual {p1}, Lo5/b;->d()Lo5/t;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lo5/c$b;->g:LZ4/b;

    invoke-virtual {p1}, Lo5/b;->a()Lo5/a;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    return-void
.end method
