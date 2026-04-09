.class public final synthetic Lo7/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lo7/l;

.field public final synthetic b:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Lo7/l;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo7/k;->a:Lo7/l;

    iput-object p2, p0, Lo7/k;->b:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lo7/k;->a:Lo7/l;

    iget-object v1, p0, Lo7/k;->b:Ljava/lang/Throwable;

    invoke-static {v0, v1}, Lo7/l;->d(Lo7/l;Ljava/lang/Throwable;)V

    return-void
.end method
