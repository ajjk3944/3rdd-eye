.class LDh/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDh/h;-><init>(Loi/n;LBh/m;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;Lpi/N0;ZILBh/g0;LBh/j0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LZh/f;

.field final synthetic b:LDh/h;


# direct methods
.method constructor <init>(LDh/h;LZh/f;)V
    .locals 0

    iput-object p1, p0, LDh/h$b;->b:LDh/h;

    iput-object p2, p0, LDh/h$b;->a:LZh/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lpi/d0;
    .locals 5

    sget-object v0, Lpi/r0;->b:Lpi/r0$a;

    invoke-virtual {v0}, Lpi/r0$a;->j()Lpi/r0;

    move-result-object v0

    iget-object v1, p0, LDh/h$b;->b:LDh/h;

    invoke-virtual {v1}, LDh/h;->k()Lpi/v0;

    move-result-object v1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    new-instance v3, Lii/i;

    new-instance v4, LDh/h$b$a;

    invoke-direct {v4, p0}, LDh/h$b$a;-><init>(LDh/h$b;)V

    invoke-direct {v3, v4}, Lii/i;-><init>(Lmh/a;)V

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v4, v3}, Lpi/V;->m(Lpi/r0;Lpi/v0;Ljava/util/List;ZLii/k;)Lpi/d0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LDh/h$b;->a()Lpi/d0;

    move-result-object v0

    return-object v0
.end method
