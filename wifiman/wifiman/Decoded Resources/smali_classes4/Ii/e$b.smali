.class final LIi/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIi/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIi/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final a:[LIi/e$a;

.field final synthetic b:LIi/e;


# direct methods
.method public constructor <init>(LIi/e;[LIi/e$a;)V
    .locals 0

    iput-object p1, p0, LIi/e$b;->b:LIi/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LIi/e$b;->a:[LIi/e$a;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0}, LIi/e$b;->b()V

    return-void
.end method

.method public final b()V
    .locals 4

    iget-object v0, p0, LIi/e$b;->a:[LIi/e$a;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, LIi/e$a;->y()LIi/e0;

    move-result-object v3

    invoke-interface {v3}, LIi/e0;->dispose()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DisposeHandlersOnCancel["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LIi/e$b;->a:[LIi/e$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
