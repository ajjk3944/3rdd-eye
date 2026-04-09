.class public final Lw8/t$l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw8/t$l;->a(Ll9/a;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw8/t;


# direct methods
.method public constructor <init>(Lw8/t;)V
    .locals 0

    iput-object p1, p0, Lw8/t$l$a;->a:Lw8/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lw8/t$l$a;->a:Lw8/t;

    invoke-static {v0}, Lw8/t;->r1(Lw8/t;)Lhc/b;

    move-result-object v0

    new-instance v1, Lhc/a;

    new-instance v2, Lec/a$b;

    const-string/jumbo v3, "No SSO Account set"

    invoke-direct {v2, v3}, Lec/a$b;-><init>(Ljava/lang/CharSequence;)V

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v1, v2, v5, v3, v4}, Lhc/a;-><init>(Lec/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Lhc/b;->a(Lhc/a;)V

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
