.class final LQ2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ2/b;


# instance fields
.field private final a:Landroid/content/Context;

.field final b:LQ2/b$a;


# direct methods
.method constructor <init>(Landroid/content/Context;LQ2/b$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LQ2/d;->a:Landroid/content/Context;

    iput-object p2, p0, LQ2/d;->b:LQ2/b$a;

    return-void
.end method

.method private c()V
    .locals 2

    iget-object v0, p0, LQ2/d;->a:Landroid/content/Context;

    invoke-static {v0}, LQ2/r;->a(Landroid/content/Context;)LQ2/r;

    move-result-object v0

    iget-object v1, p0, LQ2/d;->b:LQ2/b$a;

    invoke-virtual {v0, v1}, LQ2/r;->d(LQ2/b$a;)V

    return-void
.end method

.method private m()V
    .locals 2

    iget-object v0, p0, LQ2/d;->a:Landroid/content/Context;

    invoke-static {v0}, LQ2/r;->a(Landroid/content/Context;)LQ2/r;

    move-result-object v0

    iget-object v1, p0, LQ2/d;->b:LQ2/b$a;

    invoke-virtual {v0, v1}, LQ2/r;->e(LQ2/b$a;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-direct {p0}, LQ2/d;->m()V

    return-void
.end method

.method public b()V
    .locals 0

    invoke-direct {p0}, LQ2/d;->c()V

    return-void
.end method

.method public f()V
    .locals 0

    return-void
.end method
