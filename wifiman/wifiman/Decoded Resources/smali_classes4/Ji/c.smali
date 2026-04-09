.class public final synthetic LJi/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIi/e0;


# instance fields
.field public final synthetic a:LJi/f;

.field public final synthetic b:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(LJi/f;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJi/c;->a:LJi/f;

    iput-object p2, p0, LJi/c;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 2

    iget-object v0, p0, LJi/c;->a:LJi/f;

    iget-object v1, p0, LJi/c;->b:Ljava/lang/Runnable;

    invoke-static {v0, v1}, LJi/f;->t0(LJi/f;Ljava/lang/Runnable;)V

    return-void
.end method
