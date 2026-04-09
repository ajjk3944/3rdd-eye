.class final LMj/o$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMj/o;->e(Ljava/lang/Throwable;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ldh/e;

.field final synthetic b:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(Ldh/e;Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, LMj/o$h;->a:Ldh/e;

    iput-object p2, p0, LMj/o$h;->b:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LMj/o$h;->a:Ldh/e;

    invoke-static {v0}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v0

    sget-object v1, LYg/u;->b:LYg/u$a;

    iget-object v1, p0, LMj/o$h;->b:Ljava/lang/Throwable;

    invoke-static {v1}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
