.class public LP6/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:Landroid/content/Context;

.field final b:LP6/x;


# direct methods
.method constructor <init>(Landroid/content/Context;LP6/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP6/v;->a:Landroid/content/Context;

    iput-object p2, p0, LP6/v;->b:LP6/x;

    return-void
.end method


# virtual methods
.method public a()Lgg/s;
    .locals 2

    new-instance v0, LP6/v$a;

    invoke-direct {v0, p0}, LP6/v$a;-><init>(LP6/v;)V

    invoke-static {v0}, Lgg/s;->o(Lgg/u;)Lgg/s;

    move-result-object v0

    invoke-virtual {v0}, Lgg/s;->v()Lgg/s;

    move-result-object v0

    invoke-static {}, LGg/a;->f()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/s;->M0(Lgg/y;)Lgg/s;

    move-result-object v0

    invoke-static {}, LGg/a;->f()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/s;->e1(Lgg/y;)Lgg/s;

    move-result-object v0

    return-object v0
.end method
