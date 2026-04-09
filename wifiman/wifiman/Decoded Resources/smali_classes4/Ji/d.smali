.class public final synthetic LJi/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LIi/n;

.field public final synthetic b:LJi/f;


# direct methods
.method public synthetic constructor <init>(LIi/n;LJi/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJi/d;->a:LIi/n;

    iput-object p2, p0, LJi/d;->b:LJi/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LJi/d;->a:LIi/n;

    iget-object v1, p0, LJi/d;->b:LJi/f;

    invoke-static {v0, v1}, LJi/f;->s0(LIi/n;LJi/f;)V

    return-void
.end method
