.class LDh/h$a;
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
.field final synthetic a:Loi/n;

.field final synthetic b:LBh/j0;

.field final synthetic c:LDh/h;


# direct methods
.method constructor <init>(LDh/h;Loi/n;LBh/j0;)V
    .locals 0

    iput-object p1, p0, LDh/h$a;->c:LDh/h;

    iput-object p2, p0, LDh/h$a;->a:Loi/n;

    iput-object p3, p0, LDh/h$a;->b:LBh/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lpi/v0;
    .locals 4

    new-instance v0, LDh/h$c;

    iget-object v1, p0, LDh/h$a;->c:LDh/h;

    iget-object v2, p0, LDh/h$a;->a:Loi/n;

    iget-object v3, p0, LDh/h$a;->b:LBh/j0;

    invoke-direct {v0, v1, v2, v3}, LDh/h$c;-><init>(LDh/h;Loi/n;LBh/j0;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LDh/h$a;->a()Lpi/v0;

    move-result-object v0

    return-object v0
.end method
