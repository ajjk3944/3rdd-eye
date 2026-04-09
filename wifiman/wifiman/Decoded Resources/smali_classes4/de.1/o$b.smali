.class public final Lde/o$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lde/o;->b(Ljava/lang/String;Z)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lde/o;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Z


# direct methods
.method public constructor <init>(Lde/o;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Lde/o$b;->a:Lde/o;

    iput-object p2, p0, Lde/o$b;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lde/o$b;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lde/o$b;->a:Lde/o;

    invoke-static {v0}, Lde/o;->c(Lde/o;)LNb/a;

    move-result-object v0

    iget-object v1, p0, Lde/o$b;->b:Ljava/lang/String;

    iget-boolean v2, p0, Lde/o$b;->c:Z

    invoke-virtual {v0, v1, v2}, LNb/a;->d(Ljava/lang/String;Z)V

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
