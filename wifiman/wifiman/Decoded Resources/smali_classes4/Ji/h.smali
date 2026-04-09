.class public final synthetic LJi/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public final synthetic a:LIi/n;


# direct methods
.method public synthetic constructor <init>(LIi/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJi/h;->a:LIi/n;

    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 1

    iget-object v0, p0, LJi/h;->a:LIi/n;

    invoke-static {v0, p1, p2}, LJi/i;->a(LIi/n;J)V

    return-void
.end method
