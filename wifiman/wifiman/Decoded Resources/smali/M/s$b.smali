.class final LM/s$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/s;->l(LM/x;LM/k;LM/l$a;)LM/l$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM/k;

.field final synthetic b:I


# direct methods
.method constructor <init>(LM/k;I)V
    .locals 0

    iput-object p1, p0, LM/s$b;->a:LM/k;

    iput p2, p0, LM/s$b;->b:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Integer;
    .locals 2

    iget-object v0, p0, LM/s$b;->a:LM/k;

    invoke-virtual {v0}, LM/k;->k()LL0/M;

    move-result-object v0

    iget v1, p0, LM/s$b;->b:I

    invoke-virtual {v0, v1}, LL0/M;->q(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LM/s$b;->a()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
