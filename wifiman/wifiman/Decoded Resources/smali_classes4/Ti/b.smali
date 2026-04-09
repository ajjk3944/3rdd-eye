.class public final synthetic LTi/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# instance fields
.field public final synthetic a:LTi/f;


# direct methods
.method public synthetic constructor <init>(LTi/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTi/b;->a:LTi/f;

    return-void
.end method


# virtual methods
.method public final s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LTi/b;->a:LTi/f;

    invoke-static {p1}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-static {v0, p1, p2, p3}, LTi/f;->v(LTi/f;LSi/e;Ljava/lang/Object;Ljava/lang/Object;)Lmh/q;

    move-result-object p1

    return-object p1
.end method
