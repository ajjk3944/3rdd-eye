.class public final synthetic LF4/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LF4/y;

.field public final synthetic b:Lf5/b;


# direct methods
.method public synthetic constructor <init>(LF4/y;Lf5/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF4/l;->a:LF4/y;

    iput-object p2, p0, LF4/l;->b:Lf5/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LF4/l;->a:LF4/y;

    iget-object v1, p0, LF4/l;->b:Lf5/b;

    invoke-static {v0, v1}, LF4/n;->k(LF4/y;Lf5/b;)V

    return-void
.end method
