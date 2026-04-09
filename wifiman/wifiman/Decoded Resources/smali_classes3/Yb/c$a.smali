.class public final LYb/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYb/c;->a(LYb/b;[LYb/a;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LYb/b;

.field final synthetic b:[LYb/a;


# direct methods
.method public constructor <init>(LYb/b;[LYb/a;)V
    .locals 0

    iput-object p1, p0, LYb/c$a;->a:LYb/b;

    iput-object p2, p0, LYb/c$a;->b:[LYb/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, LYb/c$a;->a:LYb/b;

    iget-object v1, p0, LYb/c$a;->b:[LYb/a;

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [LYb/a;

    invoke-interface {v0, v1}, LYb/b;->b([LYb/a;)V

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
