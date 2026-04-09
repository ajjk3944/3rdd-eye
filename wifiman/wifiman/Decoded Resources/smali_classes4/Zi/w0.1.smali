.class public final synthetic LZi/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LVi/b;

.field public final synthetic b:LVi/b;


# direct methods
.method public synthetic constructor <init>(LVi/b;LVi/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZi/w0;->a:LVi/b;

    iput-object p2, p0, LZi/w0;->b:LVi/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LZi/w0;->a:LVi/b;

    iget-object v1, p0, LZi/w0;->b:LVi/b;

    check-cast p1, LXi/a;

    invoke-static {v0, v1, p1}, LZi/x0;->l(LVi/b;LVi/b;LXi/a;)LYg/J;

    move-result-object p1

    return-object p1
.end method
