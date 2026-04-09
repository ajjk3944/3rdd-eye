.class public Lo4/v$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo4/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/lang/Class;

.field private b:Ljava/util/concurrent/ConcurrentMap;

.field private c:Lo4/v$c;

.field private d:Ly4/a;


# direct methods
.method private constructor <init>(Ljava/lang/Class;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lo4/v$b;->b:Ljava/util/concurrent/ConcurrentMap;

    .line 4
    iput-object p1, p0, Lo4/v$b;->a:Ljava/lang/Class;

    .line 5
    sget-object p1, Ly4/a;->b:Ly4/a;

    iput-object p1, p0, Lo4/v$b;->d:Ly4/a;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Class;Lo4/v$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lo4/v$b;-><init>(Ljava/lang/Class;)V

    return-void
.end method

.method private c(Ljava/lang/Object;Ljava/lang/Object;LA4/C$c;Z)Lo4/v$b;
    .locals 2

    iget-object v0, p0, Lo4/v$b;->b:Ljava/util/concurrent/ConcurrentMap;

    if-eqz v0, :cond_5

    if-nez p1, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string/jumbo p2, "at least one of the `fullPrimitive` or `primitive` must be set"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p3}, LA4/C$c;->b0()LA4/z;

    move-result-object v0

    sget-object v1, LA4/z;->ENABLED:LA4/z;

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lo4/v$b;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-static {p1, p2, p3, v0}, Lo4/v;->a(Ljava/lang/Object;Ljava/lang/Object;LA4/C$c;Ljava/util/concurrent/ConcurrentMap;)Lo4/v$c;

    move-result-object p1

    if-eqz p4, :cond_3

    iget-object p2, p0, Lo4/v$b;->c:Lo4/v$c;

    if-nez p2, :cond_2

    iput-object p1, p0, Lo4/v$b;->c:Lo4/v$c;

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "you cannot set two primary primitives"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    return-object p0

    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string/jumbo p2, "only ENABLED key is allowed"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "addPrimitive cannot be called after build"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;LA4/C$c;)Lo4/v$b;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lo4/v$b;->c(Ljava/lang/Object;Ljava/lang/Object;LA4/C$c;Z)Lo4/v$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Object;Ljava/lang/Object;LA4/C$c;)Lo4/v$b;
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, p3, v0}, Lo4/v$b;->c(Ljava/lang/Object;Ljava/lang/Object;LA4/C$c;Z)Lo4/v$b;

    move-result-object p1

    return-object p1
.end method

.method public d()Lo4/v;
    .locals 7

    iget-object v1, p0, Lo4/v$b;->b:Ljava/util/concurrent/ConcurrentMap;

    if-eqz v1, :cond_0

    new-instance v6, Lo4/v;

    iget-object v2, p0, Lo4/v$b;->c:Lo4/v$c;

    iget-object v3, p0, Lo4/v$b;->d:Ly4/a;

    iget-object v4, p0, Lo4/v$b;->a:Ljava/lang/Class;

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lo4/v;-><init>(Ljava/util/concurrent/ConcurrentMap;Lo4/v$c;Ly4/a;Ljava/lang/Class;Lo4/v$a;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lo4/v$b;->b:Ljava/util/concurrent/ConcurrentMap;

    return-object v6

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "build cannot be called twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e(Ly4/a;)Lo4/v$b;
    .locals 1

    iget-object v0, p0, Lo4/v$b;->b:Ljava/util/concurrent/ConcurrentMap;

    if-eqz v0, :cond_0

    iput-object p1, p0, Lo4/v$b;->d:Ly4/a;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "setAnnotations cannot be called after build"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
