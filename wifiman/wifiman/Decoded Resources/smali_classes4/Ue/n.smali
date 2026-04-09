.class public final synthetic LUe/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/m;


# instance fields
.field public final synthetic a:LT/q0;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(LT/q0;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUe/n;->a:LT/q0;

    iput-boolean p2, p0, LUe/n;->b:Z

    return-void
.end method


# virtual methods
.method public final j(Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
    .locals 2

    iget-object v0, p0, LUe/n;->a:LT/q0;

    iget-boolean v1, p0, LUe/n;->b:Z

    invoke-static {v0, v1, p1, p2}, LUe/o;->b(LT/q0;ZLandroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V

    return-void
.end method
