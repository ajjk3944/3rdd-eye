.class final LN4/a$i;
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
    name = "i"
.end annotation


# static fields
.field static final a:LN4/a$i;

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

    new-instance v0, LN4/a$i;

    invoke-direct {v0}, LN4/a$i;-><init>()V

    sput-object v0, LN4/a$i;->a:LN4/a$i;

    const-string/jumbo v0, "arch"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$i;->b:LZ4/b;

    const-string/jumbo v0, "model"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$i;->c:LZ4/b;

    const-string/jumbo v0, "cores"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$i;->d:LZ4/b;

    const-string/jumbo v0, "ram"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$i;->e:LZ4/b;

    const-string/jumbo v0, "diskSpace"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$i;->f:LZ4/b;

    const-string/jumbo v0, "simulator"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$i;->g:LZ4/b;

    const-string/jumbo v0, "state"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$i;->h:LZ4/b;

    const-string/jumbo v0, "manufacturer"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$i;->i:LZ4/b;

    const-string/jumbo v0, "modelClass"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$i;->j:LZ4/b;

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

    check-cast p1, LN4/F$e$c;

    check-cast p2, LZ4/d;

    invoke-virtual {p0, p1, p2}, LN4/a$i;->b(LN4/F$e$c;LZ4/d;)V

    return-void
.end method

.method public b(LN4/F$e$c;LZ4/d;)V
    .locals 3

    sget-object v0, LN4/a$i;->b:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$c;->b()I

    move-result v1

    invoke-interface {p2, v0, v1}, LZ4/d;->d(LZ4/b;I)LZ4/d;

    sget-object v0, LN4/a$i;->c:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$c;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$i;->d:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$c;->c()I

    move-result v1

    invoke-interface {p2, v0, v1}, LZ4/d;->d(LZ4/b;I)LZ4/d;

    sget-object v0, LN4/a$i;->e:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$c;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LZ4/d;->c(LZ4/b;J)LZ4/d;

    sget-object v0, LN4/a$i;->f:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$c;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LZ4/d;->c(LZ4/b;J)LZ4/d;

    sget-object v0, LN4/a$i;->g:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$c;->j()Z

    move-result v1

    invoke-interface {p2, v0, v1}, LZ4/d;->f(LZ4/b;Z)LZ4/d;

    sget-object v0, LN4/a$i;->h:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$c;->i()I

    move-result v1

    invoke-interface {p2, v0, v1}, LZ4/d;->d(LZ4/b;I)LZ4/d;

    sget-object v0, LN4/a$i;->i:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$c;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$i;->j:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$c;->g()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    return-void
.end method
