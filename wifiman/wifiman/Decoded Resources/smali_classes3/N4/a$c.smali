.class final LN4/a$c;
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
    name = "c"
.end annotation


# static fields
.field static final a:LN4/a$c;

.field private static final b:LZ4/b;

.field private static final c:LZ4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN4/a$c;

    invoke-direct {v0}, LN4/a$c;-><init>()V

    sput-object v0, LN4/a$c;->a:LN4/a$c;

    const-string/jumbo v0, "key"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$c;->b:LZ4/b;

    const-string/jumbo v0, "value"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$c;->c:LZ4/b;

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

    check-cast p1, LN4/F$c;

    check-cast p2, LZ4/d;

    invoke-virtual {p0, p1, p2}, LN4/a$c;->b(LN4/F$c;LZ4/d;)V

    return-void
.end method

.method public b(LN4/F$c;LZ4/d;)V
    .locals 2

    sget-object v0, LN4/a$c;->b:LZ4/b;

    invoke-virtual {p1}, LN4/F$c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, LN4/a$c;->c:LZ4/b;

    invoke-virtual {p1}, LN4/F$c;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    return-void
.end method
