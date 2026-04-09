.class final LF/W$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/W$a;->i(LR0/T;LR0/Q;LR0/k;LR0/s;Lmh/l;Lmh/l;)LR0/Z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LR0/k;

.field final synthetic b:Lmh/l;

.field final synthetic c:Lkotlin/jvm/internal/N;


# direct methods
.method constructor <init>(LR0/k;Lmh/l;Lkotlin/jvm/internal/N;)V
    .locals 0

    iput-object p1, p0, LF/W$a$a;->a:LR0/k;

    iput-object p2, p0, LF/W$a$a;->b:Lmh/l;

    iput-object p3, p0, LF/W$a$a;->c:Lkotlin/jvm/internal/N;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 4

    sget-object v0, LF/W;->a:LF/W$a;

    iget-object v1, p0, LF/W$a$a;->a:LR0/k;

    iget-object v2, p0, LF/W$a$a;->b:Lmh/l;

    iget-object v3, p0, LF/W$a$a;->c:Lkotlin/jvm/internal/N;

    iget-object v3, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v3, LR0/Z;

    invoke-virtual {v0, p1, v1, v2, v3}, LF/W$a;->g(Ljava/util/List;LR0/k;Lmh/l;LR0/Z;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LF/W$a$a;->a(Ljava/util/List;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
