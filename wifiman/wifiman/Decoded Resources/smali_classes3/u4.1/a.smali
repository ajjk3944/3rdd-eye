.class public final Lu4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu4/a$b;
    }
.end annotation


# static fields
.field private static final d:Ljava/lang/Object;

.field private static final e:Ljava/lang/String; = "a"


# instance fields
.field private final a:Lo4/q;

.field private final b:Lo4/a;

.field private c:Lo4/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lu4/a;->d:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Lu4/a$b;)V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lu4/d;

    invoke-static {p1}, Lu4/a$b;->a(Lu4/a$b;)Landroid/content/Context;

    move-result-object v1

    invoke-static {p1}, Lu4/a$b;->b(Lu4/a$b;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lu4/a$b;->c(Lu4/a$b;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lu4/d;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lu4/a;->a:Lo4/q;

    .line 4
    invoke-static {p1}, Lu4/a$b;->d(Lu4/a$b;)Lo4/a;

    move-result-object v0

    iput-object v0, p0, Lu4/a;->b:Lo4/a;

    .line 5
    invoke-static {p1}, Lu4/a$b;->e(Lu4/a$b;)Lo4/o;

    move-result-object p1

    iput-object p1, p0, Lu4/a;->c:Lo4/o;

    return-void
.end method

.method synthetic constructor <init>(Lu4/a$b;Lu4/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lu4/a;-><init>(Lu4/a$b;)V

    return-void
.end method

.method static synthetic a()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lu4/a;->d:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic b()Z
    .locals 1

    invoke-static {}, Lu4/a;->e()Z

    move-result v0

    return v0
.end method

.method static synthetic c()Ljava/lang/String;
    .locals 1

    sget-object v0, Lu4/a;->e:Ljava/lang/String;

    return-object v0
.end method

.method private static e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public declared-synchronized d()Lo4/n;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lu4/a;->c:Lo4/o;

    invoke-virtual {v0}, Lo4/o;->d()Lo4/n;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
