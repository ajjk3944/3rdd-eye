.class final LN4/a$l;
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
    name = "l"
.end annotation


# static fields
.field static final a:LN4/a$l;

.field private static final b:LZ4/b;

.field private static final c:LZ4/b;

.field private static final d:LZ4/b;

.field private static final e:LZ4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN4/a$l;

    invoke-direct {v0}, LN4/a$l;-><init>()V

    sput-object v0, LN4/a$l;->a:LN4/a$l;

    const-string/jumbo v0, "baseAddress"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$l;->b:LZ4/b;

    const-string/jumbo v0, "size"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$l;->c:LZ4/b;

    const-string/jumbo v0, "name"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$l;->d:LZ4/b;

    const-string/jumbo v0, "uuid"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$l;->e:LZ4/b;

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

    check-cast p1, LN4/F$e$d$a$b$a;

    check-cast p2, LZ4/d;

    invoke-virtual {p0, p1, p2}, LN4/a$l;->b(LN4/F$e$d$a$b$a;LZ4/d;)V

    return-void
.end method

.method public b(LN4/F$e$d$a$b$a;LZ4/d;)V
    .locals 3

    sget-object v0, LN4/a$l;->b:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$d$a$b$a;->b()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LZ4/d;->c(LZ4/b;J)LZ4/d;

    sget-object v0, LN4/a$l;->c:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$d$a$b$a;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LZ4/d;->c(LZ4/b;J)LZ4/d;

    sget-object v0, LN4/a$l;->d:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$d$a$b$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$l;->e:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$d$a$b$a;->f()[B

    move-result-object p1

    invoke-interface {p2, v0, p1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    return-void
.end method
