.class public LI4/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lf5/a;


# direct methods
.method public constructor <init>(Lf5/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI4/l;->a:Lf5/a;

    return-void
.end method

.method public static synthetic a(LI4/e;Lf5/b;)V
    .locals 0

    invoke-static {p0, p1}, LI4/l;->b(LI4/e;Lf5/b;)V

    return-void
.end method

.method private static synthetic b(LI4/e;Lf5/b;)V
    .locals 0

    invoke-interface {p1}, Lf5/b;->get()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public c(LM4/o;)V
    .locals 2

    if-nez p1, :cond_0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p1

    const-string v0, "Didn\'t successfully register with UserMetadata for rollouts listener"

    invoke-virtual {p1, v0}, LI4/g;->k(Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, LI4/e;

    invoke-direct {v0, p1}, LI4/e;-><init>(LM4/o;)V

    iget-object p1, p0, LI4/l;->a:Lf5/a;

    new-instance v1, LI4/k;

    invoke-direct {v1, v0}, LI4/k;-><init>(LI4/e;)V

    invoke-interface {p1, v1}, Lf5/a;->a(Lf5/a$a;)V

    return-void
.end method
