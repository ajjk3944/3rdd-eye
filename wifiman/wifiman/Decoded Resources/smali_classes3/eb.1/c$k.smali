.class final Leb/c$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leb/c;-><init>(Ljava/lang/String;LGb/f;Leb/g$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Leb/c$k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Leb/c$k;

    invoke-direct {v0}, Leb/c$k;-><init>()V

    sput-object v0, Leb/c$k;->a:Leb/c$k;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Leb/m;)V
    .locals 0

    invoke-static {p0}, Leb/c$k;->d(Leb/m;)V

    return-void
.end method

.method public static synthetic b(Ljava/nio/ByteBuffer;)Lgb/l;
    .locals 0

    invoke-static {p0}, Leb/c$k;->e(Ljava/nio/ByteBuffer;)Lgb/l;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Leb/m;)V
    .locals 0

    invoke-virtual {p0}, Leb/m;->e()V

    return-void
.end method

.method private static final e(Ljava/nio/ByteBuffer;)Lgb/l;
    .locals 3

    const-string/jumbo v0, "data"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Lub/c;->a:Lub/c;

    invoke-static {p0}, Leb/f;->a(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0}, Lub/c;->d()Laj/b;

    move-result-object v0

    invoke-virtual {v0}, Laj/b;->a()Lcj/e;

    sget-object v1, Lgb/l;->Companion:Lgb/l$b;

    invoke-virtual {v1}, Lgb/l$b;->serializer()LVi/b;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Laj/b;->b(LVi/a;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgb/l;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    sget-object v0, LSj/a;->a:LSj/a$b;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string/jumbo v2, "Error while parsing SystemInfoUpdate"

    invoke-virtual {v0, p0, v2, v1}, LSj/a$b;->p(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leb/m;

    invoke-virtual {p0, p1}, Leb/c$k;->c(Leb/m;)LDj/a;

    move-result-object p1

    return-object p1
.end method

.method public final c(Leb/m;)LDj/a;
    .locals 2

    const-string/jumbo v0, "webSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Leb/m;->f()Lgg/i;

    move-result-object v0

    new-instance v1, Leb/d;

    invoke-direct {v1, p1}, Leb/d;-><init>(Leb/m;)V

    invoke-virtual {v0, v1}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "doFinally(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Leb/e;

    invoke-direct {v0}, Leb/e;-><init>()V

    invoke-static {p1, v0}, Lvb/a;->a(Lgg/i;Lmh/l;)Lgg/i;

    move-result-object p1

    new-instance v0, Lgb/k;

    invoke-direct {v0}, Lgb/k;-><init>()V

    sget-object v1, Leb/c$k$a;->a:Leb/c$k$a;

    invoke-virtual {p1, v0, v1}, Lgg/i;->q1(Ljava/lang/Object;Lkg/b;)Lgg/i;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1}, Lgg/i;->u1(J)Lgg/i;

    move-result-object p1

    return-object p1
.end method
