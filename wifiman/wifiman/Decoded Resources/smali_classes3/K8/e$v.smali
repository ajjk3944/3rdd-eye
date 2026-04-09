.class final LK8/e$v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK8/e;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK8/e;


# direct methods
.method constructor <init>(LK8/e;)V
    .locals 0

    iput-object p1, p0, LK8/e$v;->a:LK8/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)V
    .locals 1

    const-string/jumbo v0, "switchEnabled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LK8/e$v;->a:LK8/e;

    invoke-static {v0}, LK8/e;->x0(LK8/e;)LFg/a;

    move-result-object v0

    invoke-virtual {v0, p1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LK8/e$v;->a(Ljava/lang/Boolean;)V

    return-void
.end method
