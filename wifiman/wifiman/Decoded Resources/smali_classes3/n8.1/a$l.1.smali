.class final Ln8/a$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/a;-><init>(Lorg/kodein/di/DI;Ln8/a$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln8/a;


# direct methods
.method constructor <init>(Ln8/a;)V
    .locals 0

    iput-object p1, p0, Ln8/a$l;->a:Ln8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LCc/a;)Ljava/util/List;
    .locals 9

    const-string/jumbo v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Ln8/a$l;->a:Ln8/a;

    invoke-interface {p1}, LCc/a;->j()LDc/j;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LDc/j;->G()LNc/b$b;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LNc/b$b;->g()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v3, Ls9/d$b;

    const v2, 0x7f1101e9

    invoke-direct {v3, v2}, Ls9/d$b;-><init>(I)V

    new-instance v5, Ls9/d$c;

    invoke-direct {v5, p1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/16 v7, 0x14

    const/4 v8, 0x0

    const-string/jumbo v2, "name"

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LCc/a;

    invoke-virtual {p0, p1}, Ln8/a$l;->a(LCc/a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
