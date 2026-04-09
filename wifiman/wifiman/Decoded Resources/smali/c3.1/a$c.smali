.class final Lc3/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ4/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# static fields
.field static final a:Lc3/a$c;

.field private static final b:LZ4/b;

.field private static final c:LZ4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lc3/a$c;

    invoke-direct {v0}, Lc3/a$c;-><init>()V

    sput-object v0, Lc3/a$c;->a:Lc3/a$c;

    const-string v0, "eventsDroppedCount"

    invoke-static {v0}, LZ4/b;->a(Ljava/lang/String;)LZ4/b$b;

    move-result-object v0

    invoke-static {}, Lc5/a;->b()Lc5/a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lc5/a;->c(I)Lc5/a;

    move-result-object v1

    invoke-virtual {v1}, Lc5/a;->a()Lc5/d;

    move-result-object v1

    invoke-virtual {v0, v1}, LZ4/b$b;->b(Ljava/lang/annotation/Annotation;)LZ4/b$b;

    move-result-object v0

    invoke-virtual {v0}, LZ4/b$b;->a()LZ4/b;

    move-result-object v0

    sput-object v0, Lc3/a$c;->b:LZ4/b;

    const-string v0, "reason"

    invoke-static {v0}, LZ4/b;->a(Ljava/lang/String;)LZ4/b$b;

    move-result-object v0

    invoke-static {}, Lc5/a;->b()Lc5/a;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lc5/a;->c(I)Lc5/a;

    move-result-object v1

    invoke-virtual {v1}, Lc5/a;->a()Lc5/d;

    move-result-object v1

    invoke-virtual {v0, v1}, LZ4/b$b;->b(Ljava/lang/annotation/Annotation;)LZ4/b$b;

    move-result-object v0

    invoke-virtual {v0}, LZ4/b$b;->a()LZ4/b;

    move-result-object v0

    sput-object v0, Lc3/a$c;->c:LZ4/b;

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

    check-cast p1, Lf3/c;

    check-cast p2, LZ4/d;

    invoke-virtual {p0, p1, p2}, Lc3/a$c;->b(Lf3/c;LZ4/d;)V

    return-void
.end method

.method public b(Lf3/c;LZ4/d;)V
    .locals 3

    sget-object v0, Lc3/a$c;->b:LZ4/b;

    invoke-virtual {p1}, Lf3/c;->a()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, LZ4/d;->c(LZ4/b;J)LZ4/d;

    sget-object v0, Lc3/a$c;->c:LZ4/b;

    invoke-virtual {p1}, Lf3/c;->b()Lf3/c$b;

    move-result-object p1

    invoke-interface {p2, v0, p1}, LZ4/d;->b(LZ4/b;Ljava/lang/Object;)LZ4/d;

    return-void
.end method
