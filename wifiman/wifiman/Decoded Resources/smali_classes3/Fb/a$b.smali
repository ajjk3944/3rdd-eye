.class final LFb/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFb/a;->d(Lgg/i;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LFb/a;


# direct methods
.method constructor <init>(LFb/a;)V
    .locals 0

    iput-object p1, p0, LFb/a$b;->a:LFb/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LFb/a$b;->a:LFb/a;

    invoke-static {p1}, LFb/a;->a(LFb/a;)Lmh/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LFb/a$b;->a(Ljava/lang/Throwable;)V

    return-void
.end method
