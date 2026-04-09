.class final LNj/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LNj/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:LMj/d;

.field private volatile b:Z


# direct methods
.method constructor <init>(LMj/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNj/c$a;->a:LMj/d;

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LNj/c$a;->b:Z

    iget-object v0, p0, LNj/c$a;->a:LMj/d;

    invoke-interface {v0}, LMj/d;->cancel()V

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-boolean v0, p0, LNj/c$a;->b:Z

    return v0
.end method
