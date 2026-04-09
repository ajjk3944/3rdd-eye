.class final Lb3/b$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ4/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "h"
.end annotation


# static fields
.field static final a:Lb3/b$h;

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

    new-instance v0, Lb3/b$h;

    invoke-direct {v0}, Lb3/b$h;-><init>()V

    sput-object v0, Lb3/b$h;->a:Lb3/b$h;

    const-string v0, "eventTimeMs"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lb3/b$h;->b:LZ4/b;

    const-string v0, "eventCode"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lb3/b$h;->c:LZ4/b;

    const-string v0, "complianceData"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lb3/b$h;->d:LZ4/b;

    const-string v0, "eventUptimeMs"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lb3/b$h;->e:LZ4/b;

    const-string v0, "sourceExtension"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lb3/b$h;->f:LZ4/b;

    const-string v0, "sourceExtensionJsonProto3"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lb3/b$h;->g:LZ4/b;

    const-string v0, "timezoneOffsetSeconds"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lb3/b$h;->h:LZ4/b;

    const-string v0, "networkConnectionInfo"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lb3/b$h;->i:LZ4/b;

    const-string v0, "experimentIds"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, Lb3/b$h;->j:LZ4/b;

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

    check-cast p1, Lb3/t;

    check-cast p2, LZ4/d;

    invoke-virtual {p0, p1, p2}, Lb3/b$h;->b(Lb3/t;LZ4/d;)V

    return-void
.end method

.method public b(Lb3/t;LZ4/d;)V
    .locals 3

    sget-object v0, Lb3/b$h;->b:LZ4/b;

    invoke-virtual {p1}, Lb3/t;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LZ4/d;->c(LZ4/b;J)LZ4/d;

    sget-object v0, Lb3/b$h;->c:LZ4/b;

    invoke-virtual {p1}, Lb3/t;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lb3/b$h;->d:LZ4/b;

    invoke-virtual {p1}, Lb3/t;->b()Lb3/p;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lb3/b$h;->e:LZ4/b;

    invoke-virtual {p1}, Lb3/t;->e()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LZ4/d;->c(LZ4/b;J)LZ4/d;

    sget-object v0, Lb3/b$h;->f:LZ4/b;

    invoke-virtual {p1}, Lb3/t;->h()[B

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lb3/b$h;->g:LZ4/b;

    invoke-virtual {p1}, Lb3/t;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lb3/b$h;->h:LZ4/b;

    invoke-virtual {p1}, Lb3/t;->j()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LZ4/d;->c(LZ4/b;J)LZ4/d;

    sget-object v0, Lb3/b$h;->i:LZ4/b;

    invoke-virtual {p1}, Lb3/t;->g()Lb3/w;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    sget-object v0, Lb3/b$h;->j:LZ4/b;

    invoke-virtual {p1}, Lb3/t;->f()Lb3/q;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    return-void
.end method
