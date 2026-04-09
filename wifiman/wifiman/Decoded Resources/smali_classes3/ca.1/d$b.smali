.class final Lca/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lca/d;->b()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lca/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lca/d$b;

    invoke-direct {v0}, Lca/d$b;-><init>()V

    sput-object v0, Lca/d$b;->a:Lca/d$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    sget-object v0, LP9/n;->a:LP9/n;

    invoke-virtual {v0}, LP9/n;->f()LP9/j;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LP9/j;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "Missing recaptcha config"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lca/d$b;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lca/a;->a(Ljava/lang/String;)Lca/a;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
