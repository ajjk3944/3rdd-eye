.class final Lx8/j$E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx8/j;->o1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx8/j;


# direct methods
.method constructor <init>(Lx8/j;)V
    .locals 0

    iput-object p1, p0, Lx8/j$E;->a:Lx8/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)LDj/a;
    .locals 2

    const-string/jumbo v0, "infiniteSpeedtestAvailable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lx8/j$E;->a:Lx8/j;

    invoke-static {p1}, Lx8/j;->F0(Lx8/j;)Ly8/v;

    move-result-object p1

    invoke-virtual {p1}, Ly8/t;->c()Lgg/i;

    move-result-object p1

    iget-object v0, p0, Lx8/j$E;->a:Lx8/j;

    invoke-static {v0}, Lx8/j;->F0(Lx8/j;)Ly8/v;

    move-result-object v0

    invoke-virtual {v0}, Ly8/t;->a()Lgg/i;

    move-result-object v0

    iget-object v1, p0, Lx8/j$E;->a:Lx8/j;

    invoke-static {v1}, Lx8/j;->F0(Lx8/j;)Ly8/v;

    move-result-object v1

    invoke-virtual {v1}, Ly8/t;->e()Lgg/i;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lgg/i;->R0(LDj/a;LDj/a;LDj/a;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/i;->j0()Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lx8/j$E;->a(Ljava/lang/Boolean;)LDj/a;

    move-result-object p1

    return-object p1
.end method
