.class final Lk4/q;
.super Lk4/j;
.source "SourceFile"


# instance fields
.field final synthetic b:Lk4/r;


# direct methods
.method constructor <init>(Lk4/r;)V
    .locals 0

    iput-object p1, p0, Lk4/q;->b:Lk4/r;

    invoke-direct {p0}, Lk4/j;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lk4/q;->b:Lk4/r;

    iget-object v0, v0, Lk4/r;->a:Lk4/t;

    invoke-static {v0}, Lk4/t;->r(Lk4/t;)V

    iget-object v0, p0, Lk4/q;->b:Lk4/r;

    iget-object v0, v0, Lk4/r;->a:Lk4/t;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lk4/t;->m(Lk4/t;Landroid/os/IInterface;)V

    iget-object v0, p0, Lk4/q;->b:Lk4/r;

    iget-object v0, v0, Lk4/r;->a:Lk4/t;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lk4/t;->l(Lk4/t;Z)V

    return-void
.end method
