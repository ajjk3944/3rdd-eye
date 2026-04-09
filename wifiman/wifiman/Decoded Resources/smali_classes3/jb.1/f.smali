.class public final synthetic Ljb/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ljb/g;


# direct methods
.method public synthetic constructor <init>(ZLjb/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ljb/f;->a:Z

    iput-object p2, p0, Ljb/f;->b:Ljb/g;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-boolean v0, p0, Ljb/f;->a:Z

    iget-object v1, p0, Ljb/f;->b:Ljb/g;

    invoke-static {v0, v1}, Ljb/g;->d(ZLjb/g;)Llb/b;

    move-result-object v0

    return-object v0
.end method
