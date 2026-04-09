.class final Lo5/c$e;
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
    name = "e"
.end annotation


# static fields
.field static final a:Lo5/c$e;

.field private static final b:LZ4/b;

.field private static final c:LZ4/b;

.field private static final d:LZ4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo5/c$e;

    invoke-direct {v0}, Lo5/c$e;-><init>()V

    sput-object v0, Lo5/c$e;->a:Lo5/c$e;

    const-string/jumbo v0, "eventType"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$e;->b:LZ4/b;

    const-string/jumbo v0, "sessionData"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$e;->c:LZ4/b;

    const-string/jumbo v0, "applicationInfo"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lo5/c$e;->d:LZ4/b;

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

    check-cast p1, Lo5/z;

    check-cast p2, LZ4/d;

    invoke-virtual {p0, p1, p2}, Lo5/c$e;->b(Lo5/z;LZ4/d;)V

    return-void
.end method

.method public b(Lo5/z;LZ4/d;)V
    .locals 2

    sget-object v0, Lo5/c$e;->b:LZ4/b;

    invoke-virtual {p1}, Lo5/z;->b()Lo5/i;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lo5/c$e;->c:LZ4/b;

    invoke-virtual {p1}, Lo5/z;->c()Lo5/C;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lo5/c$e;->d:LZ4/b;

    invoke-virtual {p1}, Lo5/z;->a()Lo5/b;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    return-void
.end method
