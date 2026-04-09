.class public final synthetic LVi/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LVi/f;


# direct methods
.method public synthetic constructor <init>(LVi/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVi/e;->a:LVi/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LVi/e;->a:LVi/f;

    check-cast p1, LXi/a;

    invoke-static {v0, p1}, LVi/f;->m(LVi/f;LXi/a;)LYg/J;

    move-result-object p1

    return-object p1
.end method
