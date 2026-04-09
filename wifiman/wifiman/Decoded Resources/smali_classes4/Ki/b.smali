.class public final synthetic LKi/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# instance fields
.field public final synthetic a:LKi/e;


# direct methods
.method public synthetic constructor <init>(LKi/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKi/b;->a:LKi/e;

    return-void
.end method


# virtual methods
.method public final s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LKi/b;->a:LKi/e;

    invoke-static {p1}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-static {v0, p1, p2, p3}, LKi/e;->h(LKi/e;LSi/e;Ljava/lang/Object;Ljava/lang/Object;)Lmh/q;

    move-result-object p1

    return-object p1
.end method
