.class final Lfb/k$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfb/k;->a(Lmb/j;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lfb/k;


# direct methods
.method constructor <init>(Lfb/k;)V
    .locals 0

    iput-object p1, p0, Lfb/k$h;->a:Lfb/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lmb/x;)Lfb/n;
    .locals 5

    const-string/jumbo v0, "controller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfb/n;

    iget-object v1, p0, Lfb/k$h;->a:Lfb/k;

    invoke-static {v1}, Lfb/k;->w(Lfb/k;)Lfb/e;

    move-result-object v1

    iget-object v2, p0, Lfb/k$h;->a:Lfb/k;

    invoke-static {v2}, Lfb/k;->x(Lfb/k;)Llb/c;

    move-result-object v2

    new-instance v3, Lfb/k$h$a;

    iget-object v4, p0, Lfb/k$h;->a:Lfb/k;

    invoke-direct {v3, v4}, Lfb/k$h$a;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1, p1, v2, v3}, Lfb/n;-><init>(Lfb/e;Lmb/x;Llb/c;Lmh/a;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmb/x;

    invoke-virtual {p0, p1}, Lfb/k$h;->a(Lmb/x;)Lfb/n;

    move-result-object p1

    return-object p1
.end method
