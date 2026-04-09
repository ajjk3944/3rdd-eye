.class final Ltb/N$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltb/N;->J()Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ltb/N;


# direct methods
.method constructor <init>(Ltb/N;)V
    .locals 0

    iput-object p1, p0, Ltb/N$g;->a:Ltb/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ltb/N$c;)V
    .locals 1

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ltb/N$c;->CONNECTED:Ltb/N$c;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Ltb/N$g;->a:Ltb/N;

    invoke-static {p1}, Ltb/N;->v(Ltb/N;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ltb/N$c;

    invoke-virtual {p0, p1}, Ltb/N$g;->a(Ltb/N$c;)V

    return-void
.end method
