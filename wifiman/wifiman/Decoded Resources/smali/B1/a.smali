.class LB1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LB1/k$c;

.field private final b:Ljava/util/concurrent/Executor;


# direct methods
.method constructor <init>(LB1/k$c;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB1/a;->a:LB1/k$c;

    iput-object p2, p0, LB1/a;->b:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private a(I)V
    .locals 3

    iget-object v0, p0, LB1/a;->a:LB1/k$c;

    iget-object v1, p0, LB1/a;->b:Ljava/util/concurrent/Executor;

    new-instance v2, LB1/a$b;

    invoke-direct {v2, p0, v0, p1}, LB1/a$b;-><init>(LB1/a;LB1/k$c;I)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private c(Landroid/graphics/Typeface;)V
    .locals 3

    iget-object v0, p0, LB1/a;->a:LB1/k$c;

    iget-object v1, p0, LB1/a;->b:Ljava/util/concurrent/Executor;

    new-instance v2, LB1/a$a;

    invoke-direct {v2, p0, v0, p1}, LB1/a$a;-><init>(LB1/a;LB1/k$c;Landroid/graphics/Typeface;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method b(LB1/i$e;)V
    .locals 1

    invoke-virtual {p1}, LB1/i$e;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, LB1/i$e;->a:Landroid/graphics/Typeface;

    invoke-direct {p0, p1}, LB1/a;->c(Landroid/graphics/Typeface;)V

    goto :goto_0

    :cond_0
    iget p1, p1, LB1/i$e;->b:I

    invoke-direct {p0, p1}, LB1/a;->a(I)V

    :goto_0
    return-void
.end method
