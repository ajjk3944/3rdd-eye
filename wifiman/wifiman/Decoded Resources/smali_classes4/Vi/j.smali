.class public final synthetic LVi/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LVi/k;


# direct methods
.method public synthetic constructor <init>(LVi/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVi/j;->a:LVi/k;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LVi/j;->a:LVi/k;

    check-cast p1, LXi/a;

    invoke-static {v0, p1}, LVi/k;->m(LVi/k;LXi/a;)LYg/J;

    move-result-object p1

    return-object p1
.end method
