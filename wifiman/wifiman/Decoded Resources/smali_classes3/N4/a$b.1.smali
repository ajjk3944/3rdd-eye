.class final LN4/a$b;
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
    name = "b"
.end annotation


# static fields
.field static final a:LN4/a$b;

.field private static final b:LZ4/b;

.field private static final c:LZ4/b;

.field private static final d:LZ4/b;

.field private static final e:LZ4/b;

.field private static final f:LZ4/b;

.field private static final g:LZ4/b;

.field private static final h:LZ4/b;

.field private static final i:LZ4/b;

.field private static final j:LZ4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN4/a$b;

    invoke-direct {v0}, LN4/a$b;-><init>()V

    sput-object v0, LN4/a$b;->a:LN4/a$b;

    const-string/jumbo v0, "pid"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$b;->b:LZ4/b;

    const-string/jumbo v0, "processName"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$b;->c:LZ4/b;

    const-string/jumbo v0, "reasonCode"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$b;->d:LZ4/b;

    const-string/jumbo v0, "importance"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$b;->e:LZ4/b;

    const-string/jumbo v0, "pss"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$b;->f:LZ4/b;

    const-string/jumbo v0, "rss"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$b;->g:LZ4/b;

    const-string/jumbo v0, "timestamp"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$b;->h:LZ4/b;

    const-string/jumbo v0, "traceFile"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$b;->i:LZ4/b;

    const-string/jumbo v0, "buildIdMappingForArch"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$b;->j:LZ4/b;

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

    check-cast p1, LN4/F$a;

    check-cast p2, LZ4/d;

    invoke-virtual {p0, p1, p2}, LN4/a$b;->b(LN4/F$a;LZ4/d;)V

    return-void
.end method

.method public b(LN4/F$a;LZ4/d;)V
    .locals 3

    sget-object v0, LN4/a$b;->b:LZ4/b;

    invoke-virtual {p1}, LN4/F$a;->d()I

    move-result v1

    invoke-interface {p2, v0, v1}, LZ4/d;->d(LZ4/b;I)LZ4/d;

    sget-object v0, LN4/a$b;->c:LZ4/b;

    invoke-virtual {p1}, LN4/F$a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$b;->d:LZ4/b;

    invoke-virtual {p1}, LN4/F$a;->g()I

    move-result v1

    invoke-interface {p2, v0, v1}, LZ4/d;->d(LZ4/b;I)LZ4/d;

    sget-object v0, LN4/a$b;->e:LZ4/b;

    invoke-virtual {p1}, LN4/F$a;->c()I

    move-result v1

    invoke-interface {p2, v0, v1}, LZ4/d;->d(LZ4/b;I)LZ4/d;

    sget-object v0, LN4/a$b;->f:LZ4/b;

    invoke-virtual {p1}, LN4/F$a;->f()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LZ4/d;->c(LZ4/b;J)LZ4/d;

    sget-object v0, LN4/a$b;->g:LZ4/b;

    invoke-virtual {p1}, LN4/F$a;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LZ4/d;->c(LZ4/b;J)LZ4/d;

    sget-object v0, LN4/a$b;->h:LZ4/b;

    invoke-virtual {p1}, LN4/F$a;->i()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LZ4/d;->c(LZ4/b;J)LZ4/d;

    sget-object v0, LN4/a$b;->i:LZ4/b;

    invoke-virtual {p1}, LN4/F$a;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$b;->j:LZ4/b;

    invoke-virtual {p1}, LN4/F$a;->b()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    return-void
.end method
