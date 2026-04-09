.class final Lo5/c$f;
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
    name = "f"
.end annotation


# static fields
.field static final a:Lo5/c$f;

.field private static final b:LZ4/b;

.field private static final c:LZ4/b;

.field private static final d:LZ4/b;

.field private static final e:LZ4/b;

.field private static final f:LZ4/b;

.field private static final g:LZ4/b;

.field private static final h:LZ4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo5/c$f;

    invoke-direct {v0}, Lo5/c$f;-><init>()V

    sput-object v0, Lo5/c$f;->a:Lo5/c$f;

    const-string/jumbo v0, "sessionId"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$f;->b:LZ4/b;

    const-string/jumbo v0, "firstSessionId"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$f;->c:LZ4/b;

    const-string/jumbo v0, "sessionIndex"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$f;->d:LZ4/b;

    const-string/jumbo v0, "eventTimestampUs"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$f;->e:LZ4/b;

    const-string/jumbo v0, "dataCollectionStatus"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$f;->f:LZ4/b;

    const-string/jumbo v0, "firebaseInstallationId"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$f;->g:LZ4/b;

    const-string/jumbo v0, "firebaseAuthenticationToken"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$f;->h:LZ4/b;

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

    check-cast p1, Lo5/C;

    check-cast p2, LZ4/d;

    invoke-virtual {p0, p1, p2}, Lo5/c$f;->b(Lo5/C;LZ4/d;)V

    return-void
.end method

.method public b(Lo5/C;LZ4/d;)V
    .locals 3

    sget-object v0, Lo5/c$f;->b:LZ4/b;

    invoke-virtual {p1}, Lo5/C;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lo5/c$f;->c:LZ4/b;

    invoke-virtual {p1}, Lo5/C;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lo5/c$f;->d:LZ4/b;

    invoke-virtual {p1}, Lo5/C;->g()I

    move-result v1

    invoke-interface {p2, v0, v1}, LZ4/d;->d(LZ4/b;I)LZ4/d;

    sget-object v0, Lo5/c$f;->e:LZ4/b;

    invoke-virtual {p1}, Lo5/C;->b()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LZ4/d;->c(LZ4/b;J)LZ4/d;

    sget-object v0, Lo5/c$f;->f:LZ4/b;

    invoke-virtual {p1}, Lo5/C;->a()Lo5/e;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lo5/c$f;->g:LZ4/b;

    invoke-virtual {p1}, Lo5/C;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lo5/c$f;->h:LZ4/b;

    invoke-virtual {p1}, Lo5/C;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    return-void
.end method
