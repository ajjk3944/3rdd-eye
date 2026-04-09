.class final LL/i$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL/i;->q(LJ0/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LL/i;


# direct methods
.method constructor <init>(LL/i;)V
    .locals 0

    iput-object p1, p0, LL/i$e;->a:LL/i;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, LL/i$e;->a:LL/i;

    invoke-static {v0}, LL/i;->D2(LL/i;)V

    iget-object v0, p0, LL/i$e;->a:LL/i;

    invoke-static {v0}, LL/i;->I2(LL/i;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LL/i$e;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
