.class final LN4/a$x;
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
    name = "x"
.end annotation


# static fields
.field static final a:LN4/a$x;

.field private static final b:LZ4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN4/a$x;

    invoke-direct {v0}, LN4/a$x;-><init>()V

    sput-object v0, LN4/a$x;->a:LN4/a$x;

    const-string/jumbo v0, "assignments"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$x;->b:LZ4/b;

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

    check-cast p1, LN4/F$e$d$f;

    check-cast p2, LZ4/d;

    invoke-virtual {p0, p1, p2}, LN4/a$x;->b(LN4/F$e$d$f;LZ4/d;)V

    return-void
.end method

.method public b(LN4/F$e$d$f;LZ4/d;)V
    .locals 1

    sget-object v0, LN4/a$x;->b:LZ4/b;

    invoke-virtual {p1}, LN4/F$e$d$f;->b()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    return-void
.end method
