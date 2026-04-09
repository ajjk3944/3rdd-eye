.class final synthetic Lfb/k$f;
.super Lkotlin/jvm/internal/p;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfb/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llb/c;Lfb/o;LGb/f;LAb/a;Lwb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;LCb/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string/jumbo v5, "onDataClientUnauthorizedException()V"

    const/4 v6, 0x0

    const/4 v1, 0x0

    const-class v3, Lfb/k;

    const-string/jumbo v4, "onDataClientUnauthorizedException"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/f;->receiver:Ljava/lang/Object;

    check-cast v0, Lfb/k;

    invoke-static {v0}, Lfb/k;->A(Lfb/k;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfb/k$f;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
