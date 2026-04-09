.class public final synthetic LVi/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LVi/f;


# direct methods
.method public synthetic constructor <init>(LVi/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVi/d;->a:LVi/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LVi/d;->a:LVi/f;

    invoke-static {v0}, LVi/f;->l(LVi/f;)LXi/f;

    move-result-object v0

    return-object v0
.end method
