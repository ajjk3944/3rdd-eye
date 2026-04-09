.class public final synthetic LQe/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LQe/d;


# direct methods
.method public synthetic constructor <init>(LQe/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQe/u;->a:LQe/d;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LQe/u;->a:LQe/d;

    check-cast p1, LJ9/a;

    invoke-static {v0, p1}, LQe/q$b;->a(LQe/d;LJ9/a;)LYg/J;

    move-result-object p1

    return-object p1
.end method
