.class public final synthetic LTi/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# instance fields
.field public final synthetic a:LTi/f;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LTi/f;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTi/c;->a:LTi/f;

    iput-object p2, p0, LTi/c;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LTi/c;->a:LTi/f;

    iget-object v1, p0, LTi/c;->b:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    check-cast p3, Ldh/i;

    invoke-static {v0, v1, p1, p2, p3}, LTi/f;->u(LTi/f;Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/Object;Ldh/i;)LYg/J;

    move-result-object p1

    return-object p1
.end method
