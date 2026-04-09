.class public LM4/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM4/f$b;
    }
.end annotation


# static fields
.field private static final c:LM4/f$b;


# instance fields
.field private final a:LQ4/g;

.field private b:LM4/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LM4/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LM4/f$b;-><init>(LM4/f$a;)V

    sput-object v0, LM4/f;->c:LM4/f$b;

    return-void
.end method

.method public constructor <init>(LQ4/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LM4/f;->a:LQ4/g;

    .line 3
    sget-object p1, LM4/f;->c:LM4/f$b;

    iput-object p1, p0, LM4/f;->b:LM4/d;

    return-void
.end method

.method public constructor <init>(LQ4/g;Ljava/lang/String;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, LM4/f;-><init>(LQ4/g;)V

    .line 5
    invoke-virtual {p0, p2}, LM4/f;->e(Ljava/lang/String;)V

    return-void
.end method

.method private d(Ljava/lang/String;)Ljava/io/File;
    .locals 2

    iget-object v0, p0, LM4/f;->a:LQ4/g;

    const-string/jumbo v1, "userlog"

    invoke-virtual {v0, p1, v1}, LQ4/g;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, LM4/f;->b:LM4/d;

    invoke-interface {v0}, LM4/d;->d()V

    return-void
.end method

.method public b()[B
    .locals 1

    iget-object v0, p0, LM4/f;->b:LM4/d;

    invoke-interface {v0}, LM4/d;->c()[B

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LM4/f;->b:LM4/d;

    invoke-interface {v0}, LM4/d;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LM4/f;->b:LM4/d;

    invoke-interface {v0}, LM4/d;->a()V

    sget-object v0, LM4/f;->c:LM4/f$b;

    iput-object v0, p0, LM4/f;->b:LM4/d;

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, LM4/f;->d(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    const/high16 v0, 0x10000

    invoke-virtual {p0, p1, v0}, LM4/f;->f(Ljava/io/File;I)V

    return-void
.end method

.method f(Ljava/io/File;I)V
    .locals 1

    new-instance v0, LM4/i;

    invoke-direct {v0, p1, p2}, LM4/i;-><init>(Ljava/io/File;I)V

    iput-object v0, p0, LM4/f;->b:LM4/d;

    return-void
.end method

.method public g(JLjava/lang/String;)V
    .locals 1

    iget-object v0, p0, LM4/f;->b:LM4/d;

    invoke-interface {v0, p1, p2, p3}, LM4/d;->e(JLjava/lang/String;)V

    return-void
.end method
