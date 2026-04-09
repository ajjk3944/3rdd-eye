.class LB1/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB1/i;->e(Landroid/content/Context;LB1/e;LB1/a;II)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Landroid/content/Context;

.field final synthetic c:LB1/e;

.field final synthetic d:I


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/content/Context;LB1/e;I)V
    .locals 0

    iput-object p1, p0, LB1/i$a;->a:Ljava/lang/String;

    iput-object p2, p0, LB1/i$a;->b:Landroid/content/Context;

    iput-object p3, p0, LB1/i$a;->c:LB1/e;

    iput p4, p0, LB1/i$a;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LB1/i$e;
    .locals 4

    iget-object v0, p0, LB1/i$a;->a:Ljava/lang/String;

    iget-object v1, p0, LB1/i$a;->b:Landroid/content/Context;

    iget-object v2, p0, LB1/i$a;->c:LB1/e;

    invoke-static {v2}, LB1/h;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iget v3, p0, LB1/i$a;->d:I

    invoke-static {v0, v1, v2, v3}, LB1/i;->c(Ljava/lang/String;Landroid/content/Context;Ljava/util/List;I)LB1/i$e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LB1/i$a;->a()LB1/i$e;

    move-result-object v0

    return-object v0
.end method
