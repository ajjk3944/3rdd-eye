.class final LN4/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ4/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# static fields
.field static final a:LN4/a$d;

.field private static final b:LZ4/b;

.field private static final c:LZ4/b;

.field private static final d:LZ4/b;

.field private static final e:LZ4/b;

.field private static final f:LZ4/b;

.field private static final g:LZ4/b;

.field private static final h:LZ4/b;

.field private static final i:LZ4/b;

.field private static final j:LZ4/b;

.field private static final k:LZ4/b;

.field private static final l:LZ4/b;

.field private static final m:LZ4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN4/a$d;

    invoke-direct {v0}, LN4/a$d;-><init>()V

    sput-object v0, LN4/a$d;->a:LN4/a$d;

    const-string/jumbo v0, "sdkVersion"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$d;->b:LZ4/b;

    const-string/jumbo v0, "gmpAppId"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$d;->c:LZ4/b;

    const-string/jumbo v0, "platform"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$d;->d:LZ4/b;

    const-string/jumbo v0, "installationUuid"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$d;->e:LZ4/b;

    const-string/jumbo v0, "firebaseInstallationId"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$d;->f:LZ4/b;

    const-string/jumbo v0, "firebaseAuthenticationToken"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$d;->g:LZ4/b;

    const-string/jumbo v0, "appQualitySessionId"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$d;->h:LZ4/b;

    const-string/jumbo v0, "buildVersion"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$d;->i:LZ4/b;

    const-string/jumbo v0, "displayVersion"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$d;->j:LZ4/b;

    const-string/jumbo v0, "session"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$d;->k:LZ4/b;

    const-string/jumbo v0, "ndkPayload"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$d;->l:LZ4/b;

    const-string/jumbo v0, "appExitInfo"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$d;->m:LZ4/b;

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

    check-cast p1, LN4/F;

    check-cast p2, LZ4/d;

    invoke-virtual {p0, p1, p2}, LN4/a$d;->b(LN4/F;LZ4/d;)V

    return-void
.end method

.method public b(LN4/F;LZ4/d;)V
    .locals 2

    sget-object v0, LN4/a$d;->b:LZ4/b;

    invoke-virtual {p1}, LN4/F;->m()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$d;->c:LZ4/b;

    invoke-virtual {p1}, LN4/F;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$d;->d:LZ4/b;

    invoke-virtual {p1}, LN4/F;->l()I

    move-result v1

    invoke-interface {p2, v0, v1}, LZ4/d;->d(LZ4/b;I)LZ4/d;

    sget-object v0, LN4/a$d;->e:LZ4/b;

    invoke-virtual {p1}, LN4/F;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$d;->f:LZ4/b;

    invoke-virtual {p1}, LN4/F;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$d;->g:LZ4/b;

    invoke-virtual {p1}, LN4/F;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$d;->h:LZ4/b;

    invoke-virtual {p1}, LN4/F;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$d;->i:LZ4/b;

    invoke-virtual {p1}, LN4/F;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$d;->j:LZ4/b;

    invoke-virtual {p1}, LN4/F;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$d;->k:LZ4/b;

    invoke-virtual {p1}, LN4/F;->n()LN4/F$e;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$d;->l:LZ4/b;

    invoke-virtual {p1}, LN4/F;->k()LN4/F$d;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$d;->m:LZ4/b;

    invoke-virtual {p1}, LN4/F;->c()LN4/F$a;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    return-void
.end method
