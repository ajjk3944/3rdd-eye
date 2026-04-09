.class final LN4/a$j;
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
    name = "j"
.end annotation


# static fields
.field static final a:LN4/a$j;

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

    new-instance v0, LN4/a$j;

    invoke-direct {v0}, LN4/a$j;-><init>()V

    sput-object v0, LN4/a$j;->a:LN4/a$j;

    const-string/jumbo v0, "generator"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$j;->b:LZ4/b;

    const-string/jumbo v0, "identifier"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$j;->c:LZ4/b;

    const-string/jumbo v0, "appQualitySessionId"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$j;->d:LZ4/b;

    const-string/jumbo v0, "startedAt"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$j;->e:LZ4/b;

    const-string/jumbo v0, "endedAt"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$j;->f:LZ4/b;

    const-string/jumbo v0, "crashed"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$j;->g:LZ4/b;

    const-string/jumbo v0, "app"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$j;->h:LZ4/b;

    const-string/jumbo v0, "user"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$j;->i:LZ4/b;

    const-string/jumbo v0, "os"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$j;->j:LZ4/b;

    const-string/jumbo v0, "device"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$j;->k:LZ4/b;

    const-string/jumbo v0, "events"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$j;->l:LZ4/b;

    const-string/jumbo v0, "generatorType"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$j;->m:LZ4/b;

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

    check-cast p1, LN4/F$e;

    check-cast p2, LZ4/d;

    invoke-virtual {p0, p1, p2}, LN4/a$j;->b(LN4/F$e;LZ4/d;)V

    return-void
.end method

.method public b(LN4/F$e;LZ4/d;)V
    .locals 3

    sget-object v0, LN4/a$j;->b:LZ4/b;

    invoke-virtual {p1}, LN4/F$e;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$j;->c:LZ4/b;

    invoke-virtual {p1}, LN4/F$e;->j()[B

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$j;->d:LZ4/b;

    invoke-virtual {p1}, LN4/F$e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$j;->e:LZ4/b;

    invoke-virtual {p1}, LN4/F$e;->l()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LZ4/d;->c(LZ4/b;J)LZ4/d;

    sget-object v0, LN4/a$j;->f:LZ4/b;

    invoke-virtual {p1}, LN4/F$e;->e()Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$j;->g:LZ4/b;

    invoke-virtual {p1}, LN4/F$e;->n()Z

    move-result v1

    invoke-interface {p2, v0, v1}, LZ4/d;->f(LZ4/b;Z)LZ4/d;

    sget-object v0, LN4/a$j;->h:LZ4/b;

    invoke-virtual {p1}, LN4/F$e;->b()LN4/F$e$a;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$j;->i:LZ4/b;

    invoke-virtual {p1}, LN4/F$e;->m()LN4/F$e$f;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$j;->j:LZ4/b;

    invoke-virtual {p1}, LN4/F$e;->k()LN4/F$e$e;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$j;->k:LZ4/b;

    invoke-virtual {p1}, LN4/F$e;->d()LN4/F$e$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$j;->l:LZ4/b;

    invoke-virtual {p1}, LN4/F$e;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$j;->m:LZ4/b;

    invoke-virtual {p1}, LN4/F$e;->h()I

    move-result p1

    invoke-interface {p2, v0, p1}, LZ4/d;->d(LZ4/b;I)LZ4/d;

    return-void
.end method
