.class public final synthetic LKi/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:LKi/e;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;LKi/e;LSi/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKi/d;->a:Ljava/lang/Object;

    iput-object p2, p0, LKi/d;->b:LKi/e;

    return-void
.end method


# virtual methods
.method public final s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LKi/d;->a:Ljava/lang/Object;

    iget-object v1, p0, LKi/d;->b:LKi/e;

    move-object v3, p1

    check-cast v3, Ljava/lang/Throwable;

    move-object v5, p3

    check-cast v5, Ldh/i;

    const/4 v2, 0x0

    move-object v4, p2

    invoke-static/range {v0 .. v5}, LKi/e;->a(Ljava/lang/Object;LKi/e;LSi/e;Ljava/lang/Throwable;Ljava/lang/Object;Ldh/i;)LYg/J;

    move-result-object p1

    return-object p1
.end method
