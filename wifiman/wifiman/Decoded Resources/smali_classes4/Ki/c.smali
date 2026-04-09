.class public final synthetic LKi/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# instance fields
.field public final synthetic a:Lmh/l;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKi/c;->a:Lmh/l;

    iput-object p2, p0, LKi/c;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LKi/c;->a:Lmh/l;

    iget-object v1, p0, LKi/c;->b:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    check-cast p3, Ldh/i;

    invoke-static {v0, v1, p1, p2, p3}, LKi/e;->j(Lmh/l;Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/Object;Ldh/i;)LYg/J;

    move-result-object p1

    return-object p1
.end method
