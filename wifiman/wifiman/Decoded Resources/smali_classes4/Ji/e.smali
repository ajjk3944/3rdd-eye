.class public final synthetic LJi/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LJi/f;

.field public final synthetic b:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(LJi/f;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJi/e;->a:LJi/f;

    iput-object p2, p0, LJi/e;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LJi/e;->a:LJi/f;

    iget-object v1, p0, LJi/e;->b:Ljava/lang/Runnable;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, LJi/f;->u0(LJi/f;Ljava/lang/Runnable;Ljava/lang/Throwable;)LYg/J;

    move-result-object p1

    return-object p1
.end method
