.class public final synthetic Lr3/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lr3/u;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;Lr3/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lr3/p;->a:Z

    iput-object p2, p0, Lr3/p;->b:Ljava/lang/String;

    iput-object p3, p0, Lr3/p;->c:Lr3/u;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, Lr3/p;->a:Z

    iget-object v1, p0, Lr3/p;->b:Ljava/lang/String;

    iget-object v2, p0, Lr3/p;->c:Lr3/u;

    invoke-static {v0, v1, v2}, Lr3/y;->c(ZLjava/lang/String;Lr3/u;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
