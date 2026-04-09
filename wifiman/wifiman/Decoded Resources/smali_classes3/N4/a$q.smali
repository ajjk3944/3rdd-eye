.class final LN4/a$q;
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
    name = "q"
.end annotation


# static fields
.field static final a:LN4/a$q;

.field private static final b:LZ4/b;

.field private static final c:LZ4/b;

.field private static final d:LZ4/b;

.field private static final e:LZ4/b;

.field private static final f:LZ4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN4/a$q;

    invoke-direct {v0}, LN4/a$q;-><init>()V

    sput-object v0, LN4/a$q;->a:LN4/a$q;

    const-string/jumbo v0, "pc"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$q;->b:LZ4/b;

    const-string/jumbo v0, "symbol"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$q;->c:LZ4/b;

    const-string/jumbo v0, "file"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$q;->d:LZ4/b;

    const-string/jumbo v0, "offset"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$q;->e:LZ4/b;

    const-string/jumbo v0, "importance"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$q;->f:LZ4/b;

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

    check-cast p1, LN4/F$e$d$a$b$e$b;

    check-cast p2, LZ4/d;

    invoke-virtual {p0, p1, p2}, LN4/a$q;->b(LN4/F$e$d$a$b$e$b;LZ4/d;)V

    return-void
.end method

.method public b(LN4/F$e$d$a$b$e$b;LZ4/d;)V
    .locals 3

    sget-object v0, LN4/a$q;->b:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$d$a$b$e$b;->e()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LZ4/d;->c(LZ4/b;J)LZ4/d;

    sget-object v0, LN4/a$q;->c:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$d$a$b$e$b;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$q;->d:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$d$a$b$e$b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$q;->e:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$d$a$b$e$b;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LZ4/d;->c(LZ4/b;J)LZ4/d;

    sget-object v0, LN4/a$q;->f:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$d$a$b$e$b;->c()I

    move-result p1

    invoke-interface {p2, v0, p1}, LZ4/d;->d(LZ4/b;I)LZ4/d;

    return-void
.end method
