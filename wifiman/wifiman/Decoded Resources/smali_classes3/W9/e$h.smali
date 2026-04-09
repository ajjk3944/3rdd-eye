.class public final LW9/e$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW9/e;->s0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LW9/e;


# direct methods
.method public constructor <init>(LW9/e;)V
    .locals 0

    iput-object p1, p0, LW9/e$h;->a:LW9/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LW9/e$h;->a:LW9/e;

    invoke-virtual {v0}, LW9/e;->v0()Lgg/b;

    move-result-object v0

    return-object v0
.end method
