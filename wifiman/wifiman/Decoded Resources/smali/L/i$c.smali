.class final LL/i$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


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

    iput-object p1, p0, LL/i$c;->a:LL/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LL0/d;)Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, LL/i$c;->a:LL/i;

    invoke-virtual {p1}, LL0/d;->k()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, LL/i;->J2(LL/i;Ljava/lang/String;)Z

    iget-object p1, p0, LL/i$c;->a:LL/i;

    invoke-static {p1}, LL/i;->I2(LL/i;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LL0/d;

    invoke-virtual {p0, p1}, LL/i$c;->a(LL0/d;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
