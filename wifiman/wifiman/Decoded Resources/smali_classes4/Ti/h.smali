.class public final synthetic LTi/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# instance fields
.field public final synthetic a:LTi/i;


# direct methods
.method public synthetic constructor <init>(LTi/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTi/h;->a:LTi/i;

    return-void
.end method


# virtual methods
.method public final s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LTi/h;->a:LTi/i;

    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, LYg/J;

    check-cast p3, Ldh/i;

    invoke-static {v0, p1, p2, p3}, LTi/i;->e(LTi/i;Ljava/lang/Throwable;LYg/J;Ldh/i;)LYg/J;

    move-result-object p1

    return-object p1
.end method
