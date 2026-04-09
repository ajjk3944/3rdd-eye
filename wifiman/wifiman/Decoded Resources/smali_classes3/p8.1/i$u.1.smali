.class final Lp8/i$u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp8/i;->c1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lp8/i;


# direct methods
.method constructor <init>(Lp8/i;)V
    .locals 0

    iput-object p1, p0, Lp8/i$u;->a:Lp8/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)Lgg/f;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lp8/i$u;->a:Lp8/i;

    invoke-static {p1}, Lp8/i;->C0(Lp8/i;)Lvc/b;

    move-result-object p1

    invoke-interface {p1}, Lvc/b;->a()Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lp8/i$u;->a(Ljava/lang/Boolean;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
