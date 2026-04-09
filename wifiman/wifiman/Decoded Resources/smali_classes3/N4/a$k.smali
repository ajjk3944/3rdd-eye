.class final LN4/a$k;
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
    name = "k"
.end annotation


# static fields
.field static final a:LN4/a$k;

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

    new-instance v0, LN4/a$k;

    invoke-direct {v0}, LN4/a$k;-><init>()V

    sput-object v0, LN4/a$k;->a:LN4/a$k;

    const-string/jumbo v0, "execution"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$k;->b:LZ4/b;

    const-string/jumbo v0, "customAttributes"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$k;->c:LZ4/b;

    const-string/jumbo v0, "internalKeys"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$k;->d:LZ4/b;

    const-string/jumbo v0, "background"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$k;->e:LZ4/b;

    const-string/jumbo v0, "currentProcessDetails"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$k;->f:LZ4/b;

    const-string/jumbo v0, "appProcessDetails"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$k;->g:LZ4/b;

    const-string/jumbo v0, "uiOrientation"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$k;->h:LZ4/b;

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

    check-cast p1, LN4/F$e$d$a;

    check-cast p2, LZ4/d;

    invoke-virtual {p0, p1, p2}, LN4/a$k;->b(LN4/F$e$d$a;LZ4/d;)V

    return-void
.end method

.method public b(LN4/F$e$d$a;LZ4/d;)V
    .locals 2

    sget-object v0, LN4/a$k;->b:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$d$a;->f()LN4/F$e$d$a$b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$k;->c:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$d$a;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$k;->d:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$d$a;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$k;->e:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$d$a;->c()Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$k;->f:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$d$a;->d()LN4/F$e$d$a$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$k;->g:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$d$a;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$k;->h:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$d$a;->h()I

    move-result p1

    invoke-interface {p2, v0, p1}, LZ4/d;->d(LZ4/b;I)LZ4/d;

    return-void
.end method
