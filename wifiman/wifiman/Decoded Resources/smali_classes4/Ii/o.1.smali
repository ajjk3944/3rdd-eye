.class public final synthetic LIi/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# instance fields
.field public final synthetic a:Lmh/l;


# direct methods
.method public synthetic constructor <init>(Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIi/o;->a:Lmh/l;

    return-void
.end method


# virtual methods
.method public final s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LIi/o;->a:Lmh/l;

    check-cast p1, Ljava/lang/Throwable;

    check-cast p3, Ldh/i;

    invoke-static {v0, p1, p2, p3}, LIi/p;->h(Lmh/l;Ljava/lang/Throwable;Ljava/lang/Object;Ldh/i;)LYg/J;

    move-result-object p1

    return-object p1
.end method
