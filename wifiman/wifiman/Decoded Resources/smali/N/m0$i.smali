.class final LN/m0$i;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/m0;->c(JLmh/a;ZLT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lmh/a;


# direct methods
.method constructor <init>(Ljava/lang/String;Lmh/a;)V
    .locals 0

    iput-object p1, p0, LN/m0$i;->a:Ljava/lang/String;

    iput-object p2, p0, LN/m0$i;->b:Lmh/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LJ0/w;)V
    .locals 3

    iget-object v0, p0, LN/m0$i;->a:Ljava/lang/String;

    invoke-static {p1, v0}, LJ0/t;->a0(LJ0/w;Ljava/lang/String;)V

    new-instance v0, LN/m0$i$a;

    iget-object v1, p0, LN/m0$i;->b:Lmh/a;

    invoke-direct {v0, v1}, LN/m0$i$a;-><init>(Lmh/a;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v2}, LJ0/t;->A(LJ0/w;Ljava/lang/String;Lmh/a;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ0/w;

    invoke-virtual {p0, p1}, LN/m0$i;->a(LJ0/w;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
