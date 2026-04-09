.class final LX9/c$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX9/c;->i1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LX9/c;


# direct methods
.method constructor <init>(LX9/c;)V
    .locals 0

    iput-object p1, p0, LX9/c$e;->a:LX9/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LEb/r;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LX9/c$e$a;

    iget-object v1, p0, LX9/c$e;->a:LX9/c;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, LX9/c$e$a;-><init>(LX9/c;LEb/r;Ldh/e;)V

    const/4 p1, 0x1

    invoke-static {v2, v0, p1, v2}, LQi/g;->c(Ldh/i;Lmh/p;ILjava/lang/Object;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEb/r;

    invoke-virtual {p0, p1}, LX9/c$e;->a(LEb/r;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
