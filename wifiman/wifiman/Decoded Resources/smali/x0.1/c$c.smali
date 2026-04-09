.class final Lx0/c$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/c;->J2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx0/c;


# direct methods
.method constructor <init>(Lx0/c;)V
    .locals 0

    iput-object p1, p0, Lx0/c$c;->a:Lx0/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LIi/N;
    .locals 1

    iget-object v0, p0, Lx0/c$c;->a:Lx0/c;

    invoke-static {v0}, Lx0/c;->D2(Lx0/c;)LIi/N;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lx0/c$c;->a()LIi/N;

    move-result-object v0

    return-object v0
.end method
