.class public final synthetic LUe/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LUe/g;

.field public final synthetic b:LT/q0;

.field public final synthetic c:Landroidx/lifecycle/o;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(LUe/g;LT/q0;Landroidx/lifecycle/o;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUe/j;->a:LUe/g;

    iput-object p2, p0, LUe/j;->b:LT/q0;

    iput-object p3, p0, LUe/j;->c:Landroidx/lifecycle/o;

    iput-boolean p4, p0, LUe/j;->d:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LUe/j;->a:LUe/g;

    iget-object v1, p0, LUe/j;->b:LT/q0;

    iget-object v2, p0, LUe/j;->c:Landroidx/lifecycle/o;

    iget-boolean v3, p0, LUe/j;->d:Z

    check-cast p1, LT/L;

    invoke-static {v0, v1, v2, v3, p1}, LUe/o;->a(LUe/g;LT/q0;Landroidx/lifecycle/o;ZLT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
