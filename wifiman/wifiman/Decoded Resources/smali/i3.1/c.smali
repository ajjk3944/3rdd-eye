.class public Li3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li3/e;


# static fields
.field private static final f:Ljava/util/logging/Logger;


# instance fields
.field private final a:Lj3/x;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Ld3/e;

.field private final d:Lk3/d;

.field private final e:Ll3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lc3/u;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Li3/c;->f:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Ld3/e;Lj3/x;Lk3/d;Ll3/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li3/c;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Li3/c;->c:Ld3/e;

    iput-object p3, p0, Li3/c;->a:Lj3/x;

    iput-object p4, p0, Li3/c;->d:Lk3/d;

    iput-object p5, p0, Li3/c;->e:Ll3/a;

    return-void
.end method

.method public static synthetic b(Li3/c;Lc3/p;Lc3/i;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Li3/c;->d(Lc3/p;Lc3/i;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Li3/c;Lc3/p;La3/j;Lc3/i;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Li3/c;->e(Lc3/p;La3/j;Lc3/i;)V

    return-void
.end method

.method private synthetic d(Lc3/p;Lc3/i;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Li3/c;->d:Lk3/d;

    invoke-interface {v0, p1, p2}, Lk3/d;->N(Lc3/p;Lc3/i;)Lk3/k;

    iget-object p2, p0, Li3/c;->a:Lj3/x;

    const/4 v0, 0x1

    invoke-interface {p2, p1, v0}, Lj3/x;->b(Lc3/p;I)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic e(Lc3/p;La3/j;Lc3/i;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Li3/c;->c:Ld3/e;

    invoke-virtual {p1}, Lc3/p;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ld3/e;->get(Ljava/lang/String;)Ld3/m;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p3, "Transport backend \'%s\' is not registered"

    invoke-virtual {p1}, Lc3/p;->b()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p3, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object p3, Li3/c;->f:Ljava/util/logging/Logger;

    invoke-virtual {p3, p1}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    new-instance p3, Ljava/lang/IllegalArgumentException;

    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p3}, La3/j;->a(Ljava/lang/Exception;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    invoke-interface {v0, p3}, Ld3/m;->b(Lc3/i;)Lc3/i;

    move-result-object p3

    iget-object v0, p0, Li3/c;->e:Ll3/a;

    new-instance v1, Li3/b;

    invoke-direct {v1, p0, p1, p3}, Li3/b;-><init>(Li3/c;Lc3/p;Lc3/i;)V

    invoke-interface {v0, v1}, Ll3/a;->h(Ll3/a$a;)Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-interface {p2, p1}, La3/j;->a(Ljava/lang/Exception;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :goto_0
    sget-object p3, Li3/c;->f:Ljava/util/logging/Logger;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error scheduling event "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    invoke-interface {p2, p1}, La3/j;->a(Ljava/lang/Exception;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public a(Lc3/p;Lc3/i;La3/j;)V
    .locals 2

    iget-object v0, p0, Li3/c;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Li3/a;

    invoke-direct {v1, p0, p1, p3, p2}, Li3/a;-><init>(Li3/c;Lc3/p;La3/j;Lc3/i;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
